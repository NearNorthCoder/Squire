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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.UHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.GHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.IHelper;
import gg.squire.account.AccBuilderRogues;
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

public class ZHelper
implements G {
    static final  int fF;
    private static final  WorldPoint fZ;
    static final  int fC;
    private static final  WorldPoint gh;
    private static final  WorldPoint fN;
    static final  int fE;
    private static final  WorldPoint fU;
    private static final  WorldPoint fP;
    public static final  WorldPoint fz;
    static  WorldPoint gF;
    public static final  int[] fs;
    static  WorldPoint gD;
    private static final  WorldPoint gf;
    public static  int gr;
    static final  WorldPoint[] fJ;
    private static final  WorldPoint fQ;
    private static final  WorldPoint gj;
    private static final  WorldPoint fR;
    static final  int fB;
    static  int bT;
    private static final  WorldPoint ge;
    static  int gx;
    public static  int gs;
    private static final  WorldPoint gg;
    private static final  WorldPoint fM;
    static  int gt;
    private static final  WorldPoint fX;
    private static final  WorldPoint gd;
    public static final  int[] fr;
    static  WorldArea gE;
    private static final  int gm;
    public static final  WorldPoint fv;
    static final  int fG;
    private static final  int gl;
    private static final  int gn;
    public static final  WorldPoint fw;
    private static final  WorldPoint fS;
    private static final  WorldPoint fK;
    static  String gB;
    private static final  WorldPoint fY;
    public static  List<d> bv;
    private static final  WorldPoint gc;
    public static final  WorldPoint fx;
    static  int gv;
    private static final  WorldPoint fO;
    public static final  int[] fq;
    static  WorldArea gG;
    public static final  WorldPoint fu;
    static  int ck;
    static final  int fI;
    static  String gC;
    static final  int fA;
    public static  WorldArea gq;
    static  String[] gz;
    public static final  WorldPoint fy;
    static  int gy;
    static final  int fH;
    private static final  WorldPoint gb;
    static  String gA;
    private static final  WorldPoint fL;
    private static final  WorldPoint ga;
    public static  boolean bt;
    private static final  WorldPoint fW;
    public static final  WorldArea ft;
    private static final  int go;
    private static final  WorldPoint fV;
    static  int gu;
    static final  int fD;
    static  int gw;
    
    private static final  WorldPoint gk;
    
    static  boolean cl;
    private static final  WorldPoint gi;
    private static final  int gp;
    private static final  WorldPoint fT;

    private static boolean llllIIIIIIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public int T() {
        try {
            z.bn();

        }
        catch (Exception lllIlIlIIIl) {
            lllIlIlIIIl.printStackTrace();
        }
        
        }
        return lIIIlllIII[121];
    }

    private static void lllIlllIllll() {
        lIIIllIIIl = new String[lIIIlllIII[413]];
        z.lIIIllIIIl[z.lIIIlllIII[0]] = "Buying items";
        z.lIIIllIIIl[z.lIIIlllIII[1]] = "Finished buying items, switching back to questing";
        z.lIIIllIIIl[z.lIIIlllIII[3]] = "Drink";
        z.lIIIllIIIl[z.lIIIlllIII[5]] = "Shark";
        z.lIIIllIIIl[z.lIIIlllIII[6]] = "Shark";
        z.lIIIllIIIl[z.lIIIlllIII[7]] = "Eat";
        z.lIIIllIIIl[z.lIIIlllIII[11]] = "Navigating to bank";
        z.lIIIllIIIl[z.lIIIlllIII[9]] = "Opening bank";
        z.lIIIllIIIl[z.lIIIlllIII[13]] = "Handling banking";
        z.lIIIllIIIl[z.lIIIlllIII[17]] = "We are missing runessupplies, switching to BUYING";
        z.lIIIllIIIl[z.lIIIlllIII[19]] = "Rope";
        z.lIIIllIIIl[z.lIIIlllIII[21]] = "Shark";
        z.lIIIllIIIl[z.lIIIlllIII[22]] = "We are missing supplies, switching to BUYING";
        z.lIIIllIIIl[z.lIIIlllIII[23]] = "Rope";
        z.lIIIllIIIl[z.lIIIlllIII[4]] = "Shark";
        z.lIIIllIIIl[z.lIIIlllIII[26]] = "Drink";
        z.lIIIllIIIl[z.lIIIlllIII[27]] = "Nav to start";
        z.lIIIllIIIl[z.lIIIlllIII[28]] = "Chatting";
        z.lIIIllIIIl[z.lIIIlllIII[25]] = "Nav to boy";
        z.lIIIllIIIl[z.lIIIlllIII[29]] = "Chat boy";
        z.lIIIllIIIl[z.lIIIlllIII[30]] = "Nav to bookcase";
        z.lIIIllIIIl[z.lIIIlllIII[32]] = "Book on baxtorian";
        z.lIIIllIIIl[z.lIIIlllIII[33]] = "Searching bookcase";
        z.lIIIllIIIl[z.lIIIlllIII[34]] = "Search";
        z.lIIIllIIIl[z.lIIIlllIII[35]] = "Book on baxtorian";
        z.lIIIllIIIl[z.lIIIlllIII[37]] = "Book on baxtorian";
        z.lIIIllIIIl[z.lIIIlllIII[38]] = "Reading";
        z.lIIIllIIIl[z.lIIIlllIII[39]] = "Read";
        z.lIIIllIIIl[z.lIIIlllIII[42]] = "Tele to CW";
        z.lIIIllIIIl[z.lIIIlllIII[43]] = "Wear";
        z.lIIIllIIIl[z.lIIIlllIII[44]] = "Castle Wars";
        z.lIIIllIIIl[z.lIIIlllIII[45]] = "Nav to maze ladder";
        z.lIIIllIIIl[z.lIIIlllIII[46]] = "Fountain";
        z.lIIIllIIIl[z.lIIIlllIII[48]] = "Climb-down";
        z.lIIIllIIIl[z.lIIIlllIII[50]] = "nav to box";
        z.lIIIllIIIl[z.lIIIlllIII[51]] = "Searching crate";
        z.lIIIllIIIl[z.lIIIlllIII[52]] = "Search";
        z.lIIIllIIIl[z.lIIIlllIII[54]] = "Nav to cage";
        z.lIIIllIIIl[z.lIIIlllIII[56]] = "Entering cage";
        z.lIIIllIIIl[z.lIIIlllIII[57]] = "Chat npc";
        z.lIIIllIIIl[z.lIIIlllIII[58]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[59]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[60]] = "Nav to tombstone";
        z.lIIIllIIIl[z.lIIIlllIII[61]] = "Wear";
        z.lIIIllIIIl[z.lIIIlllIII[62]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[63]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[64]] = "Entering tomb";
        z.lIIIllIIIl[z.lIIIlllIII[67]] = "Stalagmite";
        z.lIIIllIIIl[z.lIIIlllIII[68]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[69]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[2]] = "Getting ammy";
        z.lIIIllIIIl[z.lIIIlllIII[71]] = "Open";
        z.lIIIllIIIl[z.lIIIlllIII[73]] = "Search";
        z.lIIIllIIIl[z.lIIIlllIII[74]] = "Stalagmite";
        z.lIIIllIIIl[z.lIIIlllIII[75]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[76]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[77]] = "Getting ammy";
        z.lIIIllIIIl[z.lIIIlllIII[78]] = "Open";
        z.lIIIllIIIl[z.lIIIlllIII[79]] = "Search";
        z.lIIIllIIIl[z.lIIIlllIII[80]] = "Stalagmite";
        z.lIIIllIIIl[z.lIIIlllIII[82]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[83]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[84]] = "Getting ashes";
        z.lIIIllIIIl[z.lIIIlllIII[85]] = "Search";
        z.lIIIllIIIl[z.lIIIlllIII[86]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[10]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[87]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[88]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[89]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[90]] = "Nav to bank";
        z.lIIIllIIIl[z.lIIIlllIII[91]] = "Wear";
        z.lIIIllIIIl[z.lIIIlllIII[92]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[93]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[94]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[95]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[96]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[97]] = "Opening bank";
        z.lIIIllIIIl[z.lIIIlllIII[98]] = "Withdrawing runes";
        z.lIIIllIIIl[z.lIIIlllIII[99]] = "Vial";
        z.lIIIllIIIl[z.lIIIlllIII[100]] = "Shark";
        z.lIIIllIIIl[z.lIIIlllIII[101]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[102]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[103]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[104]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[105]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[106]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[107]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[108]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[109]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[110]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[111]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[112]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[113]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[114]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[115]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[116]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[117]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[118]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[119]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[120]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[121]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[122]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[123]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[124]] = "Nav to door entrance";
        z.lIIIllIIIl[z.lIIIlllIII[125]] = "Rope";
        z.lIIIllIIIl[z.lIIIlllIII[126]] = "Rock";
        z.lIIIllIIIl[z.lIIIlllIII[127]] = "Roping rock";
        z.lIIIllIIIl[z.lIIIlllIII[129]] = "Rope";
        z.lIIIllIIIl[z.lIIIlllIII[131]] = "Roping tree";
        z.lIIIllIIIl[z.lIIIlllIII[132]] = "Door";
        z.lIIIllIIIl[z.lIIIlllIII[133]] = "Entering door";
        z.lIIIllIIIl[z.lIIIlllIII[134]] = "Open";
        z.lIIIllIIIl[z.lIIIlllIII[135]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[136]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[137]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[138]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[139]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[140]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[141]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[142]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[144]] = "Nav to key and get";
        z.lIIIllIIIl[z.lIIIlllIII[146]] = "Search";
        z.lIIIllIIIl[z.lIIIlllIII[147]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[148]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[149]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[150]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[151]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[152]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[153]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[154]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[155]] = "Nav to last room";
        z.lIIIllIIIl[z.lIIIlllIII[156]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[157]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[158]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[159]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[160]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[161]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[162]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[163]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[164]] = "Door";
        z.lIIIllIIIl[z.lIIIlllIII[166]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[167]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[168]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[169]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[170]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[171]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[172]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[173]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[174]] = "Door";
        z.lIIIllIIIl[z.lIIIlllIII[175]] = "Open";
        z.lIIIllIIIl[z.lIIIlllIII[176]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[177]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[178]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[179]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[180]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[181]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[182]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[183]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[184]] = "Nav to SE Pillar";
        z.lIIIllIIIl[z.lIIIlllIII[185]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[186]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[187]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[188]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[189]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[190]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[191]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[192]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[193]] = "Using runes";
        z.lIIIllIIIl[z.lIIIlllIII[194]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[195]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[196]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[197]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[198]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[199]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[201]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[202]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[203]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[204]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[205]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[206]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[207]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[208]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[209]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[210]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[211]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[212]] = "Using runes";
        z.lIIIllIIIl[z.lIIIlllIII[213]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[214]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[215]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[216]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[217]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[218]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[219]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[220]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[221]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[222]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[223]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[224]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[225]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[226]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[227]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[228]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[229]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[230]] = "Using runes";
        z.lIIIllIIIl[z.lIIIlllIII[231]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[232]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[233]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[234]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[235]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[236]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[237]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[238]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[239]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[240]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[241]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[242]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[243]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[244]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[245]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[246]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[247]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[248]] = "Using runes";
        z.lIIIllIIIl[z.lIIIlllIII[249]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[250]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[251]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[252]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[8]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[253]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[254]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[255]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[256]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[257]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[258]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[259]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[260]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[261]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[262]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[263]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[264]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[265]] = "Using runes";
        z.lIIIllIIIl[z.lIIIlllIII[266]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[267]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[268]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[269]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[270]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[271]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[272]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[273]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[274]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[275]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[276]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[277]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[278]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[279]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[280]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[281]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[282]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[283]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[284]] = "Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[285]] = "Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[286]] = "Using runes";
        z.lIIIllIIIl[z.lIIIlllIII[287]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[288]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[289]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[290]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[291]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[292]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[293]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[294]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[295]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[296]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[297]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[298]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[299]] = "Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[300]] = "Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[301]] = "Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[302]] = "Putting neck on statue";
        z.lIIIllIIIl[z.lIIIlllIII[305]] = "Putting ashes inside";
        z.lIIIllIIIl[z.lIIIlllIII[308]] = "Chalice";
        z.lIIIllIIIl[z.lIIIlllIII[309]] = "Statue of Glarial";
        z.lIIIllIIIl[z.lIIIlllIII[310]] = "Pillar";
        z.lIIIllIIIl[z.lIIIlllIII[311]] = "Teleporting to CW";
        z.lIIIllIIIl[z.lIIIlllIII[312]] = "Wear";
        z.lIIIllIIIl[z.lIIIlllIII[313]] = "Castle Wars";
        z.lIIIllIIIl[z.lIIIlllIII[314]] = "Rope";
        z.lIIIllIIIl[z.lIIIlllIII[325]] = "Waterfall quest";
        z.lIIIllIIIl[z.lIIIlllIII[326]] = "ring of wealth (";
        z.lIIIllIIIl[z.lIIIlllIII[327]] = "Stalagmite";
        z.lIIIllIIIl[z.lIIIlllIII[328]] = "Games";
        z.lIIIllIIIl[z.lIIIlllIII[329]] = "Games";
        z.lIIIllIIIl[z.lIIIlllIII[330]] = "Games";
        z.lIIIllIIIl[z.lIIIlllIII[331]] = "dueling";
        z.lIIIllIIIl[z.lIIIlllIII[332]] = "dueling";
        z.lIIIllIIIl[z.lIIIlllIII[40]] = "dueling";
        z.lIIIllIIIl[z.lIIIlllIII[41]] = "dueling";
        z.lIIIllIIIl[z.lIIIlllIII[304]] = "dueling";
        z.lIIIllIIIl[z.lIIIlllIII[307]] = "How can I help?";
        z.lIIIllIIIl[z.lIIIlllIII[402]] = "I'm always happy to help a cook in distress.";
        z.lIIIllIIIl[z.lIIIlllIII[143]] = "Yes.";
        z.lIIIllIIIl[z.lIIIlllIII[403]] = "Golrie";
        z.lIIIllIIIl[z.lIIIlllIII[404]] = "Hudon";
        z.lIIIllIIIl[z.lIIIlllIII[405]] = "Almera";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bo() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIIIlllIII[1]];
                nArray[z.lIIIlllIII[0]] = lIIIlllIII[20];
                if (!z.llllIIIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0) || !z.llllIIIIIIlI(Inventory.contains((int[])f.aV) ? 1 : 0)) break block2;
                if (!z.llllIIIIIlII(Inventory.contains((int[])f.aO) ? 1 : 0)) break block3;
                if (!z.llllIIIIIIlI(Equipment.contains((int[])f.aO) ? 1 : 0) || z.llllIIIIIlII(Inventory.contains((int[])f.aN) ? 1 : 0) && !z.llllIIIIIIlI(Equipment.contains((int[])f.aN) ? 1 : 0)) break block2;
                String[] stringArray = new String[lIIIlllIII[1]];
                stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[314]];
                if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block2;
            }
            n2 = lIIIlllIII[1];

            if (-1 < 2) return n2 != 0;
            return false;
        }
        n2 = lIIIlllIII[0];
        return n2 != 0;
    }

    private static boolean llllIIIIlIll(int n2, int n3) {
        return n2 != n3;
    }

    public static void af() {
        d lllIlIlIIll;
        Object lllIlIlIlII;
        block20: {
            block19: {
                int[] nArray = new int[lIIIlllIII[1]];
                nArray[z.lIIIlllIII[0]] = lIIIlllIII[20];
                if (z.llllIIIIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lIIIlllIII[20], lIIIlllIII[44], lIIIlllIII[315]);
                    bv.add(d2);

                }
                int[] nArray2 = new int[lIIIlllIII[1]];
                nArray2[z.lIIIlllIII[0]] = lIIIlllIII[316];
                if (z.llllIIIIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllIlIlIlII = new DHelper(lIIIlllIII[316], lIIIlllIII[7], i.bq);
                    bv.add((DHelper) llIlIlIlII);

                }
                int[] nArray3 = new int[lIIIlllIII[1]];
                nArray3[z.lIIIlllIII[0]] = lIIIlllIII[14];
                if (z.llllIIIIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIlllIII[1]];
                    nArray4[z.lIIIlllIII[0]] = lIIIlllIII[14];
                    if (z.llllIIIIIIll(Bank.getFirst((int[])nArray4).getQuantity(), lIIIlllIII[11])) {
                        lllIlIlIlII = new DHelper(lIIIlllIII[14], lIIIlllIII[317], lIIIlllIII[19]);
                        bv.add((DHelper) llIlIlIlII);

                    }
                }
                int[] nArray5 = new int[lIIIlllIII[1]];
                nArray5[z.lIIIlllIII[0]] = lIIIlllIII[15];
                if (z.llllIIIIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIlllIII[1]];
                    nArray6[z.lIIIlllIII[0]] = lIIIlllIII[15];
                    if (z.llllIIIIIIll(Bank.getFirst((int[])nArray6).getQuantity(), lIIIlllIII[11])) {
                        lllIlIlIlII = new DHelper(lIIIlllIII[15], lIIIlllIII[317], lIIIlllIII[19]);
                        bv.add((DHelper) llIlIlIlII);

                    }
                }
                int[] nArray7 = new int[lIIIlllIII[1]];
                nArray7[z.lIIIlllIII[0]] = lIIIlllIII[16];
                if (z.llllIIIIIIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIlllIII[1]];
                    nArray8[z.lIIIlllIII[0]] = lIIIlllIII[16];
                    if (z.llllIIIIIIll(Bank.getFirst((int[])nArray8).getQuantity(), lIIIlllIII[11])) {
                        lllIlIlIlII = new DHelper(lIIIlllIII[16], lIIIlllIII[317], lIIIlllIII[19]);
                        bv.add((DHelper) llIlIlIlII);

                    }
                }
                int[] nArray9 = new int[lIIIlllIII[1]];
                nArray9[z.lIIIlllIII[0]] = lIIIlllIII[14];
                if (z.llllIIIIIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    lllIlIlIlII = new DHelper(lIIIlllIII[14], lIIIlllIII[317], lIIIlllIII[19]);
                    bv.add((DHelper) llIlIlIlII);

                }
                int[] nArray10 = new int[lIIIlllIII[1]];
                nArray10[z.lIIIlllIII[0]] = lIIIlllIII[15];
                if (z.llllIIIIIlII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    lllIlIlIlII = new DHelper(lIIIlllIII[15], lIIIlllIII[317], lIIIlllIII[19]);
                    bv.add((DHelper) llIlIlIlII);

                }
                int[] nArray11 = new int[lIIIlllIII[1]];
                nArray11[z.lIIIlllIII[0]] = lIIIlllIII[16];
                if (z.llllIIIIIlII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    lllIlIlIlII = new DHelper(lIIIlllIII[16], lIIIlllIII[317], lIIIlllIII[19]);
                    bv.add((DHelper) llIlIlIlII);

                }
                int[] nArray12 = new int[lIIIlllIII[1]];
                nArray12[z.lIIIlllIII[0]] = lIIIlllIII[14];
                if (z.llllIIIIIlII(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    lllIlIlIlII = new DHelper(lIIIlllIII[14], lIIIlllIII[317], lIIIlllIII[19]);
                    bv.add((DHelper) llIlIlIlII);

                }
                int[] nArray13 = new int[lIIIlllIII[1]];
                nArray13[z.lIIIlllIII[0]] = lIIIlllIII[318];
                if (z.llllIIIIIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                    lllIlIlIlII = new DHelper(lIIIlllIII[318], lIIIlllIII[7], lIIIlllIII[315]);
                    bv.add((DHelper) llIlIlIlII);

                }
                int[] nArray14 = new int[lIIIlllIII[1]];
                nArray14[z.lIIIlllIII[0]] = lIIIlllIII[24];
                if (!z.llllIIIIIIlI(Bank.contains((int[])nArray14) ? 1 : 0)) break block19;
                int[] nArray15 = new int[lIIIlllIII[1]];
                nArray15[z.lIIIlllIII[0]] = lIIIlllIII[24];
                if (!z.llllIIIIIIlI(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[lIIIlllIII[1]];
                nArray16[z.lIIIlllIII[0]] = lIIIlllIII[24];
                if (!z.llllIIIIIIll(Bank.getFirst((int[])nArray16).getQuantity(), lIIIlllIII[19])) break block20;
            }
            lllIlIlIlII = new DHelper(lIIIlllIII[24], lIIIlllIII[19], lIIIlllIII[319]);
            bv.add((DHelper) llIlIlIlII);

        }
        int[] nArray = new int[lIIIlllIII[1]];
        nArray[z.lIIIlllIII[0]] = lIIIlllIII[18];
        if (z.llllIIIIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllIlIlIlII = new DHelper(lIIIlllIII[18], lIIIlllIII[7], lIIIlllIII[320]);
            bv.add((DHelper) llIlIlIlII);

        }
        if (z.llllIIIIIlII(Bank.contains((Predicate)(lllIlIlIlII = item -> item.getName().toLowerCase().contains(lIIIllIIIl[lIIIlllIII[326]]))) ? 1 : 0)) {
            lllIlIlIIll = new DHelper(lIIIlllIII[321], lIIIlllIII[25], lIIIlllIII[322]);
            bv.add(lllIlIlIIll);

        }
        int[] nArray17 = new int[lIIIlllIII[1]];
        nArray17[z.lIIIlllIII[0]] = lIIIlllIII[323];
        if (z.llllIIIIIlII(Bank.contains((int[])nArray17) ? 1 : 0)) {
            lllIlIlIIll = new DHelper(lIIIlllIII[323], lIIIlllIII[58], lIIIlllIII[324]);
            bv.add(lllIlIlIIll);

        }
    }

    private static boolean llllIIIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllIIIIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llllIIIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean S() {
        return lIIIlllIII[0];
    }

        return String.valueOf(lllIlIIIlII);
    }

    private static boolean llllIIIIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (z.llllIIIIIllI(e.j(lIIIlllIII[10]), lIIIlllIII[19])) {
            bl = lIIIlllIII[1];

            if (2 == 1) {
                return false;
            }
        } else {
            bl = lIIIlllIII[0];
        }
        return bl;
    }

    private static boolean llllIIIIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    public static void bn() {
        block254: {
            block289: {
                Item lllIlIlIlll;
                BankLocation lllIlIllIII;
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
                                                                                                        if (z.llllIIIIIIlI(bt ? 1 : 0)) {
                                                                                                            AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[0]];
                                                                                                            b.a(bv);
                                                                                                            if (z.llllIIIIIIll(bv.size(), lIIIlllIII[1])) {
                                                                                                                System.out.println(lIIIllIIIl[lIIIlllIII[1]]);
                                                                                                                bt = lIIIlllIII[0];
                                                                                                            }
                                                                                                        }
                                                                                                        if (!z.llllIIIIIlII(bt ? 1 : 0)) break block254;
                                                                                                        if (z.llllIIIIIIlI(Inventory.contains((int[])f.aV) ? 1 : 0) && z.llllIIIIIIll(Movement.getRunEnergy(), lIIIlllIII[2]) && z.llllIIIIIlII(Dialog.isOpen() ? 1 : 0)) {
                                                                                                            Inventory.getFirst((int[])f.aV).interact(lIIIllIIIl[lIIIlllIII[3]]);
                                                                                                            Time.sleepTicks((int)lIIIlllIII[1]);

                                                                                                        }
                                                                                                        if (!z.llllIIIIIlIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIIlllIII[4]) || z.llllIIIIIIlI(Inventory.isFull() ? 1 : 0)) {
                                                                                                            String[] stringArray = new String[lIIIlllIII[1]];
                                                                                                            stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[5]];
                                                                                                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                                                                String[] stringArray2 = new String[lIIIlllIII[1]];
                                                                                                                stringArray2[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[6]];
                                                                                                                Inventory.getFirst((String[])stringArray2).interact(lIIIllIIIl[lIIIlllIII[7]]);
                                                                                                                Time.sleepTicks((int)lIIIlllIII[1]);

                                                                                                            }
                                                                                                        }
                                                                                                        if (z.llllIIIIIIll(e.j(lIIIlllIII[8]), lIIIlllIII[9])) {
                                                                                                            A.bu();
                                                                                                        }
                                                                                                        if (!z.llllIIIIIlII(e.j(lIIIlllIII[10])) || !z.llllIIIIIllI(e.j(lIIIlllIII[8]), lIIIlllIII[9])) break block255;
                                                                                                        if (!z.llllIIIIIlII(z.bo() ? 1 : 0)) break block256;
                                                                                                        lllIlIllIII = BankLocation.getNearest();
                                                                                                        if (z.llllIIIIIlll(lllIlIllIII) && z.llllIIIIIlII(lllIlIllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                                            AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[11]];
                                                                                                            a.a(lllIlIllIII);
                                                                                                        }
                                                                                                        if (!z.llllIIIIIlll(lllIlIllIII) || !z.llllIIIIIIlI(lllIlIllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block256;
                                                                                                        if (z.llllIIIIIlII(Bank.isOpen() ? 1 : 0)) {
                                                                                                            AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[9]];
                                                                                                            a.a();
                                                                                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIII[12]);

                                                                                                        }
                                                                                                        if (!z.llllIIIIIIlI(Bank.isOpen() ? 1 : 0)) break block256;
                                                                                                        AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[13]];
                                                                                                        if (z.llllIIIIlIII(Inventory.getAll().size())) {
                                                                                                            Bank.depositInventory();
                                                                                                            Time.sleepTicks((int)lIIIlllIII[5]);

                                                                                                        }
                                                                                                        if (z.llllIIIIlIII(Equipment.getAll().size())) {
                                                                                                            Bank.depositEquipment();
                                                                                                            Time.sleepTicks((int)lIIIlllIII[3]);

                                                                                                        }
                                                                                                        int[] nArray = new int[lIIIlllIII[1]];
                                                                                                        nArray[z.lIIIlllIII[0]] = lIIIlllIII[14];
                                                                                                        if (!z.llllIIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block257;
                                                                                                        int[] nArray2 = new int[lIIIlllIII[1]];
                                                                                                        nArray2[z.lIIIlllIII[0]] = lIIIlllIII[14];
                                                                                                        if (!z.llllIIIIIllI(Bank.getFirst((int[])nArray2).getQuantity(), lIIIlllIII[11])) break block258;
                                                                                                    }
                                                                                                    int[] nArray = new int[lIIIlllIII[1]];
                                                                                                    nArray[z.lIIIlllIII[0]] = lIIIlllIII[15];
                                                                                                    if (!z.llllIIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block259;
                                                                                                    int[] nArray3 = new int[lIIIlllIII[1]];
                                                                                                    nArray3[z.lIIIlllIII[0]] = lIIIlllIII[15];
                                                                                                    if (!z.llllIIIIIllI(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllIII[11])) break block258;
                                                                                                }
                                                                                                int[] nArray = new int[lIIIlllIII[1]];
                                                                                                nArray[z.lIIIlllIII[0]] = lIIIlllIII[16];
                                                                                                if (!z.llllIIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block260;
                                                                                                int[] nArray4 = new int[lIIIlllIII[1]];
                                                                                                nArray4[z.lIIIlllIII[0]] = lIIIlllIII[16];
                                                                                                if (!z.llllIIIIIIll(Bank.getFirst((int[])nArray4).getQuantity(), lIIIlllIII[11])) break block260;
                                                                                            }
                                                                                            z.af();
                                                                                            System.out.println(lIIIllIIIl[lIIIlllIII[17]]);
                                                                                            bt = lIIIlllIII[1];
                                                                                            return;
                                                                                        }
                                                                                        int[] nArray = new int[lIIIlllIII[1]];
                                                                                        nArray[z.lIIIlllIII[0]] = lIIIlllIII[18];
                                                                                        if (!z.llllIIIIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block261;
                                                                                        String[] stringArray = new String[lIIIlllIII[1]];
                                                                                        stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[19]];
                                                                                        if (!z.llllIIIIIllI(Inventory.getCount((String[])stringArray), lIIIlllIII[1])) break block262;
                                                                                    }
                                                                                    int[] nArray = new int[lIIIlllIII[1]];
                                                                                    nArray[z.lIIIlllIII[0]] = lIIIlllIII[20];
                                                                                    if (!z.llllIIIIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block263;
                                                                                    String[] stringArray = new String[lIIIlllIII[1]];
                                                                                    stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[21]];
                                                                                    if (!z.llllIIIIIllI(Inventory.getCount((String[])stringArray), lIIIlllIII[1])) break block262;
                                                                                }
                                                                                if (!(z.llllIIIIIlII(Bank.contains((int[])f.aO) ? 1 : 0) && !z.llllIIIIIllI(Inventory.getCount((int[])f.aO), lIIIlllIII[1]) || z.llllIIIIIlII(Bank.contains((int[])f.aN) ? 1 : 0) && !z.llllIIIIIllI(Inventory.getCount((int[])f.aN), lIIIlllIII[1])) && (!z.llllIIIIIlII(Bank.contains((int[])f.aV) ? 1 : 0) || !z.llllIIIIIIll(Inventory.getCount((int[])f.aV), lIIIlllIII[1]))) break block264;
                                                                            }
                                                                            z.af();
                                                                            System.out.println(lIIIllIIIl[lIIIlllIII[22]]);
                                                                            bt = lIIIlllIII[1];
                                                                            return;
                                                                        }
                                                                        String[] stringArray = new String[lIIIlllIII[1]];
                                                                        stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[23]];
                                                                        if (z.llllIIIIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            a.a(lIIIlllIII[18], lIIIlllIII[1]);
                                                                        }
                                                                        if (z.llllIIIIIlII(Inventory.contains((int[])f.aO) ? 1 : 0)) {
                                                                            a.a(f.aO, lIIIlllIII[1]);
                                                                        }
                                                                        if (z.llllIIIIIlII(Inventory.contains((int[])f.aN) ? 1 : 0)) {
                                                                            a.a(lIIIlllIII[24], lIIIlllIII[1]);
                                                                        }
                                                                        if (z.llllIIIIIlII(Inventory.contains((int[])f.aV) ? 1 : 0)) {
                                                                            a.a(f.aV, lIIIlllIII[6]);
                                                                        }
                                                                        String[] stringArray3 = new String[lIIIlllIII[1]];
                                                                        stringArray3[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[4]];
                                                                        if (z.llllIIIIIlII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                                                            a.a(lIIIlllIII[20], lIIIlllIII[25]);
                                                                        }
                                                                    }
                                                                    if (z.llllIIIIIIlI(z.bo() ? 1 : 0)) {
                                                                        if (z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fO), lIIIlllIII[7])) {
                                                                            if (z.llllIIIIIIlI(Bank.isOpen() ? 1 : 0)) {
                                                                                Bank.close();
                                                                                Time.sleepTicks((int)lIIIlllIII[5]);

                                                                            }
                                                                            if (z.llllIIIIIlII(Bank.isOpen() ? 1 : 0)) {
                                                                                if (z.llllIIIIIIll(bT, lIIIlllIII[1])) {
                                                                                    if (z.llllIIIIIIlI(Inventory.contains((int[])f.aV) ? 1 : 0) && z.llllIIIIIIll(Movement.getRunEnergy(), lIIIlllIII[2])) {
                                                                                        Inventory.getFirst((int[])f.aV).interact(lIIIllIIIl[lIIIlllIII[26]]);
                                                                                        Time.sleepTicks((int)lIIIlllIII[1]);

                                                                                    }
                                                                                    e.v();
                                                                                    bT += lIIIlllIII[1];
                                                                                }
                                                                                AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[27]];
                                                                                Movement.walkTo((WorldPoint)fO);

                                                                                Time.sleepTicks((int)lIIIlllIII[1]);

                                                                            }
                                                                        }
                                                                        if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fO), lIIIlllIII[7])) {
                                                                            AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[28]];
                                                                            g.a(gC, gz);
                                                                        }
                                                                    }
                                                                }
                                                                if (z.llllIIIIlIlI(e.j(lIIIlllIII[10]), lIIIlllIII[1])) {
                                                                    if (z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fR), lIIIlllIII[5])) {
                                                                        AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[25]];
                                                                        Movement.walkTo((WorldPoint)fR);

                                                                    }
                                                                    if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fR), lIIIlllIII[5])) {
                                                                        AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[29]];
                                                                        g.a(gB, gz);
                                                                    }
                                                                }
                                                                if (z.llllIIIIlIlI(e.j(lIIIlllIII[10]), lIIIlllIII[3])) {
                                                                    if (z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fT), lIIIlllIII[6])) {
                                                                        AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[30]];
                                                                        Movement.walkTo((WorldPoint)fT);

                                                                        Time.sleepTicks((int)lIIIlllIII[1]);

                                                                    }
                                                                    if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fT), lIIIlllIII[6])) {
                                                                        int[] nArray = new int[lIIIlllIII[1]];
                                                                        nArray[z.lIIIlllIII[0]] = lIIIlllIII[31];
                                                                        lllIlIllIII = TileObjects.getNearest((int[])nArray);
                                                                        String[] stringArray = new String[lIIIlllIII[1]];
                                                                        stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[32]];
                                                                        if (z.llllIIIIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[33]];
                                                                            if (z.llllIIIIIlll(lllIlIllIII)) {
                                                                                lllIlIllIII.interact(lIIIllIIIl[lIIIlllIII[34]]);
                                                                                Time.sleepTicks((int)lIIIlllIII[3]);

                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fT), lIIIlllIII[19])) {
                                                                    String[] stringArray = new String[lIIIlllIII[1]];
                                                                    stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[35]];
                                                                    if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0) && z.llllIIIIlIlI(Players.getLocal().getAnimation(), lIIIlllIII[36]) && z.llllIIIIlIll(e.j(lIIIlllIII[10]), lIIIlllIII[5])) {
                                                                        String[] stringArray4 = new String[lIIIlllIII[1]];
                                                                        stringArray4[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[37]];
                                                                        lllIlIllIII = Inventory.getFirst((String[])stringArray4);
                                                                        if (z.llllIIIIIlll(lllIlIllIII)) {
                                                                            AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[38]];
                                                                            lllIlIllIII.interact(lIIIllIIIl[lIIIlllIII[39]]);
                                                                            Time.sleepTicks((int)lIIIlllIII[3]);

                                                                        }
                                                                    }
                                                                }
                                                                if (z.llllIIIIlIlI(e.j(lIIIlllIII[10]), lIIIlllIII[5])) {
                                                                    if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fT), lIIIlllIII[19])) {
                                                                        int[] nArray = new int[lIIIlllIII[1]];
                                                                        nArray[z.lIIIlllIII[0]] = lIIIlllIII[40];
                                                                        if (z.llllIIIIIIll(Inventory.getCount((int[])nArray), lIIIlllIII[1])) {
                                                                            int[] nArray5 = new int[lIIIlllIII[1]];
                                                                            nArray5[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                                            if (z.llllIIIIIIll(Inventory.getCount((int[])nArray5), lIIIlllIII[1])) {
                                                                                AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[42]];
                                                                                if (z.llllIIIIIIlI(Inventory.contains(item -> item.getName().contains(lIIIllIIIl[lIIIlllIII[304]])) ? 1 : 0) && z.llllIIIIIlII(Equipment.contains(item -> item.getName().contains(lIIIllIIIl[lIIIlllIII[41]])) ? 1 : 0)) {
                                                                                    Inventory.getFirst(item -> item.getName().contains(lIIIllIIIl[lIIIlllIII[40]])).interact(lIIIllIIIl[lIIIlllIII[43]]);
                                                                                }
                                                                                if (z.llllIIIIIIlI(Equipment.contains(item -> item.getName().contains(lIIIllIIIl[lIIIlllIII[332]])) ? 1 : 0) && z.llllIIIIIlII(Players.getLocal().isAnimating() ? 1 : 0)) {
                                                                                    Equipment.getFirst(item -> item.getName().contains(lIIIllIIIl[lIIIlllIII[331]])).interact(lIIIllIIIl[lIIIlllIII[44]]);
                                                                                    Time.sleepTicks((int)lIIIlllIII[6]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fU), lIIIlllIII[5])) {
                                                                        int[] nArray = new int[lIIIlllIII[1]];
                                                                        nArray[z.lIIIlllIII[0]] = lIIIlllIII[40];
                                                                        if (z.llllIIIIIIll(Inventory.getCount((int[])nArray), lIIIlllIII[1])) {
                                                                            int[] nArray6 = new int[lIIIlllIII[1]];
                                                                            nArray6[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                                            if (z.llllIIIIIIll(Inventory.getCount((int[])nArray6), lIIIlllIII[1]) && z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fV), lIIIlllIII[44]) && z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fT), lIIIlllIII[19])) {
                                                                                AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[45]];
                                                                                if (z.llllIIIIIlII(gE.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)gF);

                                                                                }
                                                                                if (z.llllIIIIIIlI(gE.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Walker.stepAlong(List.of(fJ));

                                                                                    Time.sleepTicks((int)lIIIlllIII[1]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fU), lIIIlllIII[5])) {
                                                                        String[] stringArray = new String[lIIIlllIII[1]];
                                                                        stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[46]];
                                                                        if (z.llllIIIIIlll(TileObjects.getNearest((String[])stringArray))) {
                                                                            int[] nArray = new int[lIIIlllIII[1]];
                                                                            nArray[z.lIIIlllIII[0]] = lIIIlllIII[40];
                                                                            if (z.llllIIIIIIll(Inventory.getCount((int[])nArray), lIIIlllIII[1])) {
                                                                                int[] nArray7 = new int[lIIIlllIII[1]];
                                                                                nArray7[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                                                if (z.llllIIIIIIll(Inventory.getCount((int[])nArray7), lIIIlllIII[1])) {
                                                                                    int[] nArray8 = new int[lIIIlllIII[1]];
                                                                                    nArray8[z.lIIIlllIII[0]] = lIIIlllIII[47];
                                                                                    lllIlIllIII = TileObjects.getNearest((int[])nArray8);
                                                                                    if (z.llllIIIIIlll(lllIlIllIII)) {
                                                                                        lllIlIllIII.interact(lIIIllIIIl[lIIIlllIII[48]]);
                                                                                        Time.sleepTicks((int)lIIIlllIII[5]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fV), lIIIlllIII[3])) {
                                                                        int[] nArray = new int[lIIIlllIII[1]];
                                                                        nArray[z.lIIIlllIII[0]] = lIIIlllIII[49];
                                                                        if (z.llllIIIIIlll(TileObjects.getNearest((int[])nArray))) {
                                                                            int[] nArray9 = new int[lIIIlllIII[1]];
                                                                            nArray9[z.lIIIlllIII[0]] = lIIIlllIII[40];
                                                                            if (z.llllIIIIIIll(Inventory.getCount((int[])nArray9), lIIIlllIII[1])) {
                                                                                int[] nArray10 = new int[lIIIlllIII[1]];
                                                                                nArray10[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                                                if (z.llllIIIIIIll(Inventory.getCount((int[])nArray10), lIIIlllIII[1])) {
                                                                                    AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[50]];
                                                                                    Movement.walkTo((WorldPoint)fV);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fV), lIIIlllIII[5])) {
                                                                        int[] nArray = new int[lIIIlllIII[1]];
                                                                        nArray[z.lIIIlllIII[0]] = lIIIlllIII[49];
                                                                        if (z.llllIIIIIlll(TileObjects.getNearest((int[])nArray))) {
                                                                            int[] nArray11 = new int[lIIIlllIII[1]];
                                                                            nArray11[z.lIIIlllIII[0]] = lIIIlllIII[40];
                                                                            if (z.llllIIIIIIll(Inventory.getCount((int[])nArray11), lIIIlllIII[1])) {
                                                                                int[] nArray12 = new int[lIIIlllIII[1]];
                                                                                nArray12[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                                                if (z.llllIIIIIIll(Inventory.getCount((int[])nArray12), lIIIlllIII[1])) {
                                                                                    AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[51]];
                                                                                    int[] nArray13 = new int[lIIIlllIII[1]];
                                                                                    nArray13[z.lIIIlllIII[0]] = lIIIlllIII[49];
                                                                                    lllIlIllIII = TileObjects.getNearest((int[])nArray13);
                                                                                    if (z.llllIIIIIlll(lllIlIllIII)) {
                                                                                        lllIlIllIII.interact(lIIIllIIIl[lIIIlllIII[52]]);
                                                                                        Time.sleepTicks((int)lIIIlllIII[3]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fW), lIIIlllIII[3])) {
                                                                        int[] nArray = new int[lIIIlllIII[1]];
                                                                        nArray[z.lIIIlllIII[0]] = lIIIlllIII[40];
                                                                        if (z.llllIIIIlIII(Inventory.getCount((int[])nArray)) && z.llllIIIIIIll(Players.getLocal().getWorldLocation().getY(), lIIIlllIII[53])) {
                                                                            int[] nArray14 = new int[lIIIlllIII[1]];
                                                                            nArray14[z.lIIIlllIII[0]] = lIIIlllIII[40];
                                                                            if (z.llllIIIIlIII(Inventory.getCount((int[])nArray14))) {
                                                                                int[] nArray15 = new int[lIIIlllIII[1]];
                                                                                nArray15[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                                                if (z.llllIIIIIIll(Inventory.getCount((int[])nArray15), lIIIlllIII[1])) {
                                                                                    AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[54]];
                                                                                    Movement.walkTo((WorldPoint)fW);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fW), lIIIlllIII[3])) {
                                                                        int[] nArray = new int[lIIIlllIII[1]];
                                                                        nArray[z.lIIIlllIII[0]] = lIIIlllIII[40];
                                                                        if (z.llllIIIIlIII(Inventory.getCount((int[])nArray)) && z.llllIIIIIIll(Players.getLocal().getWorldLocation().getY(), lIIIlllIII[53])) {
                                                                            int[] nArray16 = new int[lIIIlllIII[1]];
                                                                            nArray16[z.lIIIlllIII[0]] = lIIIlllIII[40];
                                                                            if (z.llllIIIIlIII(Inventory.getCount((int[])nArray16))) {
                                                                                int[] nArray17 = new int[lIIIlllIII[1]];
                                                                                nArray17[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                                                if (z.llllIIIIIIll(Inventory.getCount((int[])nArray17), lIIIlllIII[1])) {
                                                                                    int[] nArray18 = new int[lIIIlllIII[1]];
                                                                                    nArray18[z.lIIIlllIII[0]] = lIIIlllIII[55];
                                                                                    lllIlIllIII = TileObjects.getNearest((int[])nArray18);
                                                                                    if (z.llllIIIIIlll(lllIlIllIII)) {
                                                                                        AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[56]];
                                                                                        int[] nArray19 = new int[lIIIlllIII[1]];
                                                                                        nArray19[z.lIIIlllIII[0]] = lIIIlllIII[40];
                                                                                        lllIlIlIlll = Inventory.getFirst((int[])nArray19);
                                                                                        if (z.llllIIIIIlll(lllIlIlIlll)) {
                                                                                            lllIlIlIlll.useOn((TileObject)lllIlIllIII);
                                                                                            Time.sleep((long)1L);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (z.llllIIIIIllI(Players.getLocal().getWorldLocation().getY(), lIIIlllIII[53])) {
                                                                        int[] nArray = new int[lIIIlllIII[1]];
                                                                        nArray[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                                        if (z.llllIIIIIIll(Inventory.getCount((int[])nArray), lIIIlllIII[1])) {
                                                                            AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[57]];
                                                                            g.a(gA, gz);
                                                                        }
                                                                    }
                                                                    int[] nArray = new int[lIIIlllIII[1]];
                                                                    nArray[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                                    if (z.llllIIIIlIII(Inventory.getCount((int[])nArray)) && z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fY), lIIIlllIII[6])) {
                                                                        String[] stringArray = new String[lIIIlllIII[1]];
                                                                        stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[58]];
                                                                        if (z.llllIIIIIIll(Inventory.getCount((String[])stringArray), lIIIlllIII[1])) {
                                                                            String[] stringArray5 = new String[lIIIlllIII[1]];
                                                                            stringArray5[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[59]];
                                                                            if (z.llllIIIIIIll(Inventory.getCount((String[])stringArray5), lIIIlllIII[1])) {
                                                                                AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[60]];
                                                                                if (z.llllIIIIIlII(gG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    if (z.llllIIIIIIlI(Inventory.contains(item -> item.getName().contains(lIIIllIIIl[lIIIlllIII[330]])) ? 1 : 0) && z.llllIIIIIlII(Equipment.contains(item -> item.getName().contains(lIIIllIIIl[lIIIlllIII[329]])) ? 1 : 0)) {
                                                                                        Inventory.getFirst(item -> item.getName().contains(lIIIllIIIl[lIIIlllIII[328]])).interact(lIIIllIIIl[lIIIlllIII[61]]);
                                                                                        Time.sleepTicks((int)lIIIlllIII[1]);

                                                                                    }
                                                                                    Movement.walkTo((WorldPoint)fO);

                                                                                    Time.sleepTicks((int)lIIIlllIII[1]);

                                                                                }
                                                                                if (z.llllIIIIIIlI(gG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)fY);

                                                                                    Time.sleepTicks((int)lIIIlllIII[1]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int[] nArray20 = new int[lIIIlllIII[1]];
                                                                    nArray20[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                                    if (z.llllIIIIlIII(Inventory.getCount((int[])nArray20)) && z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fY), lIIIlllIII[6])) {
                                                                        String[] stringArray = new String[lIIIlllIII[1]];
                                                                        stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[62]];
                                                                        if (z.llllIIIIIIll(Inventory.getCount((String[])stringArray), lIIIlllIII[1])) {
                                                                            String[] stringArray6 = new String[lIIIlllIII[1]];
                                                                            stringArray6[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[63]];
                                                                            if (z.llllIIIIIIll(Inventory.getCount((String[])stringArray6), lIIIlllIII[1])) {
                                                                                AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[64]];
                                                                                int[] nArray21 = new int[lIIIlllIII[1]];
                                                                                nArray21[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                                                lllIlIllIII = Inventory.getFirst((int[])nArray21);
                                                                                if (z.llllIIIIIlll(lllIlIllIII)) {
                                                                                    int[] nArray22 = new int[lIIIlllIII[1]];
                                                                                    nArray22[z.lIIIlllIII[0]] = lIIIlllIII[65];
                                                                                    lllIlIlIlll = TileObjects.getNearest((int[])nArray22);
                                                                                    if (z.llllIIIIIlll(lllIlIlIlll)) {
                                                                                        lllIlIllIII.useOn((TileObject)lllIlIlIlll);
                                                                                        Time.sleepUntil(() -> {
                                                                                            boolean bl;
                                                                                            String[] stringArray = new String[lIIIlllIII[1]];
                                                                                            stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[327]];
                                                                                            if (z.llllIIIIIlll(TileObjects.getNearest((String[])stringArray))) {
                                                                                                bl = lIIIlllIII[1];

                                                                                                if (-1 == ((0x45 ^ 0x5C) & ~(0xDE ^ 0xC7))) {
                                                                                                    return false;
                                                                                                }
                                                                                            } else {
                                                                                                bl = lIIIlllIII[0];
                                                                                            }
                                                                                            return bl;
                                                                                        }, (int)lIIIlllIII[66]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int[] nArray23 = new int[lIIIlllIII[1]];
                                                                    nArray23[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                                    if (z.llllIIIIlIII(Inventory.getCount((int[])nArray23))) {
                                                                        String[] stringArray = new String[lIIIlllIII[1]];
                                                                        stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[67]];
                                                                        if (z.llllIIIIIlll(TileObjects.getNearest((String[])stringArray))) {
                                                                            String[] stringArray7 = new String[lIIIlllIII[1]];
                                                                            stringArray7[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[68]];
                                                                            if (z.llllIIIIIIll(Inventory.getCount((String[])stringArray7), lIIIlllIII[1])) {
                                                                                String[] stringArray8 = new String[lIIIlllIII[1]];
                                                                                stringArray8[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[69]];
                                                                                if (z.llllIIIIIIll(Inventory.getCount((String[])stringArray8), lIIIlllIII[1])) {
                                                                                    AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[2]];
                                                                                    if (z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fZ), lIIIlllIII[6])) {
                                                                                        Movement.walkTo((WorldPoint)fZ);

                                                                                    }
                                                                                    if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fZ), lIIIlllIII[6])) {
                                                                                        int[] nArray24 = new int[lIIIlllIII[1]];
                                                                                        nArray24[z.lIIIlllIII[0]] = lIIIlllIII[70];
                                                                                        lllIlIllIII = TileObjects.getNearest((int[])nArray24);
                                                                                        if (z.llllIIIIIlll(lllIlIllIII)) {
                                                                                            lllIlIllIII.interact(lIIIllIIIl[lIIIlllIII[71]]);
                                                                                            Time.sleepTicks((int)lIIIlllIII[1]);

                                                                                        }
                                                                                        int[] nArray25 = new int[lIIIlllIII[1]];
                                                                                        nArray25[z.lIIIlllIII[0]] = lIIIlllIII[72];
                                                                                        lllIlIlIlll = TileObjects.getNearest((int[])nArray25);
                                                                                        if (z.llllIIIIIlll(lllIlIlIlll)) {
                                                                                            lllIlIlIlll.interact(lIIIllIIIl[lIIIlllIII[73]]);
                                                                                            Time.sleepTicks((int)lIIIlllIII[1]);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (!z.llllIIIIlIlI(e.j(lIIIlllIII[10]), lIIIlllIII[6])) break block265;
                                                                ck = lIIIlllIII[0];
                                                                int[] nArray = new int[lIIIlllIII[1]];
                                                                nArray[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                                if (z.llllIIIIlIII(Inventory.getCount((int[])nArray))) {
                                                                    String[] stringArray = new String[lIIIlllIII[1]];
                                                                    stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[74]];
                                                                    if (z.llllIIIIIlll(TileObjects.getNearest((String[])stringArray))) {
                                                                        String[] stringArray9 = new String[lIIIlllIII[1]];
                                                                        stringArray9[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[75]];
                                                                        if (z.llllIIIIIIll(Inventory.getCount((String[])stringArray9), lIIIlllIII[1])) {
                                                                            String[] stringArray10 = new String[lIIIlllIII[1]];
                                                                            stringArray10[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[76]];
                                                                            if (z.llllIIIIIIll(Inventory.getCount((String[])stringArray10), lIIIlllIII[1])) {
                                                                                AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[77]];
                                                                                if (z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fZ), lIIIlllIII[6])) {
                                                                                    Movement.walkTo((WorldPoint)fZ);

                                                                                }
                                                                                if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fZ), lIIIlllIII[6])) {
                                                                                    int[] nArray26 = new int[lIIIlllIII[1]];
                                                                                    nArray26[z.lIIIlllIII[0]] = lIIIlllIII[70];
                                                                                    lllIlIllIII = TileObjects.getNearest((int[])nArray26);
                                                                                    if (z.llllIIIIIlll(lllIlIllIII)) {
                                                                                        lllIlIllIII.interact(lIIIllIIIl[lIIIlllIII[78]]);
                                                                                        Time.sleepTicks((int)lIIIlllIII[1]);

                                                                                    }
                                                                                    int[] nArray27 = new int[lIIIlllIII[1]];
                                                                                    nArray27[z.lIIIlllIII[0]] = lIIIlllIII[72];
                                                                                    lllIlIlIlll = TileObjects.getNearest((int[])nArray27);
                                                                                    if (z.llllIIIIIlll(lllIlIlIlll)) {
                                                                                        lllIlIlIlll.interact(lIIIllIIIl[lIIIlllIII[79]]);
                                                                                        Time.sleepTicks((int)lIIIlllIII[1]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                int[] nArray28 = new int[lIIIlllIII[1]];
                                                                nArray28[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                                if (!z.llllIIIIlIII(Inventory.getCount((int[])nArray28))) break block266;
                                                                String[] stringArray = new String[lIIIlllIII[1]];
                                                                stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[80]];
                                                                if (!z.llllIIIIllII(TileObjects.getNearest((String[])stringArray))) break block267;
                                                                int[] nArray29 = new int[lIIIlllIII[1]];
                                                                nArray29[z.lIIIlllIII[0]] = lIIIlllIII[81];
                                                                if (!z.llllIIIIIlll(TileObjects.getNearest((int[])nArray29))) break block266;
                                                            }
                                                            String[] stringArray = new String[lIIIlllIII[1]];
                                                            stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[82]];
                                                            if (z.llllIIIIlIII(Inventory.getCount((String[])stringArray))) {
                                                                String[] stringArray11 = new String[lIIIlllIII[1]];
                                                                stringArray11[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[83]];
                                                                if (z.llllIIIIIIll(Inventory.getCount((String[])stringArray11), lIIIlllIII[1])) {
                                                                    if (z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIlllIII[5])) {
                                                                        AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[84]];
                                                                        Movement.walkTo((WorldPoint)ga);

                                                                        Time.sleepTicks((int)lIIIlllIII[1]);

                                                                    }
                                                                    if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIlllIII[5])) {
                                                                        int[] nArray = new int[lIIIlllIII[1]];
                                                                        nArray[z.lIIIlllIII[0]] = lIIIlllIII[81];
                                                                        lllIlIllIII = TileObjects.getNearest((int[])nArray);
                                                                        if (z.llllIIIIIlll(lllIlIllIII)) {
                                                                            lllIlIllIII.interact(lIIIllIIIl[lIIIlllIII[85]]);
                                                                            Time.sleepTicks((int)lIIIlllIII[1]);

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int[] nArray = new int[lIIIlllIII[1]];
                                                        nArray[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                        if (z.llllIIIIlIII(Inventory.getCount((int[])nArray))) {
                                                            String[] stringArray = new String[lIIIlllIII[1]];
                                                            stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[86]];
                                                            if (z.llllIIIIIIll(Inventory.getCount((String[])stringArray), lIIIlllIII[1])) {
                                                                String[] stringArray12 = new String[lIIIlllIII[1]];
                                                                stringArray12[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[10]];
                                                                if (z.llllIIIIIIll(Inventory.getCount((String[])stringArray12), lIIIlllIII[1])) {
                                                                    String[] stringArray13 = new String[lIIIlllIII[1]];
                                                                    stringArray13[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[87]];
                                                                    if (z.llllIIIIIIll(Inventory.getCount((String[])stringArray13), lIIIlllIII[1]) && z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIlllIII[6])) {
                                                                        String[] stringArray14 = new String[lIIIlllIII[1]];
                                                                        stringArray14[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[88]];
                                                                        if (z.llllIIIIlIII(Inventory.getCount((String[])stringArray14))) {
                                                                            String[] stringArray15 = new String[lIIIlllIII[1]];
                                                                            stringArray15[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[89]];
                                                                            if (z.llllIIIIlIII(Inventory.getCount((String[])stringArray15))) {
                                                                                AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[90]];
                                                                                if (z.llllIIIIIlII(Equipment.contains((int[])f.aO) ? 1 : 0) && z.llllIIIIIIlI(Inventory.contains((int[])f.aO) ? 1 : 0)) {
                                                                                    Inventory.getFirst((int[])f.aO).interact(lIIIllIIIl[lIIIlllIII[91]]);
                                                                                    Time.sleepTicks((int)lIIIlllIII[1]);

                                                                                }
                                                                                if (z.llllIIIIIIlI(Equipment.contains((int[])f.aO) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)fX);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (!z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fX), lIIIlllIII[30])) break block268;
                                                        int[] nArray30 = new int[lIIIlllIII[1]];
                                                        nArray30[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                        if (!z.llllIIIIlIII(Inventory.getCount((int[])nArray30))) break block268;
                                                        String[] stringArray = new String[lIIIlllIII[1]];
                                                        stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[92]];
                                                        if (!z.llllIIIIIllI(Inventory.getCount((String[])stringArray), lIIIlllIII[1])) break block269;
                                                        String[] stringArray16 = new String[lIIIlllIII[1]];
                                                        stringArray16[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[93]];
                                                        if (!z.llllIIIIIllI(Inventory.getCount((String[])stringArray16), lIIIlllIII[1])) break block269;
                                                        String[] stringArray17 = new String[lIIIlllIII[1]];
                                                        stringArray17[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[94]];
                                                        if (!z.llllIIIIIIll(Inventory.getCount((String[])stringArray17), lIIIlllIII[1])) break block268;
                                                    }
                                                    String[] stringArray = new String[lIIIlllIII[1]];
                                                    stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[95]];
                                                    if (z.llllIIIIlIII(Inventory.getCount((String[])stringArray))) {
                                                        String[] stringArray18 = new String[lIIIlllIII[1]];
                                                        stringArray18[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[96]];
                                                        if (z.llllIIIIlIII(Inventory.getCount((String[])stringArray18))) {
                                                            if (z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fX), lIIIlllIII[6])) {
                                                                Movement.walkTo((WorldPoint)fX);

                                                            }
                                                            if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fX), lIIIlllIII[6])) {
                                                                if (z.llllIIIIIlII(Bank.isOpen() ? 1 : 0)) {
                                                                    AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[97]];
                                                                    a.a();
                                                                }
                                                                if (z.llllIIIIIIlI(Bank.isOpen() ? 1 : 0)) {
                                                                    AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[98]];
                                                                    String[] stringArray19 = new String[lIIIlllIII[1]];
                                                                    stringArray19[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[99]];
                                                                    Bank.depositAll((String[])stringArray19);
                                                                    if (z.llllIIIIIlIl(Inventory.getAll().size(), lIIIlllIII[34])) {
                                                                        Bank.deposit((String)lIIIllIIIl[lIIIlllIII[100]], (int)lIIIlllIII[7]);
                                                                    }
                                                                    String[] stringArray20 = new String[lIIIlllIII[1]];
                                                                    stringArray20[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[101]];
                                                                    if (z.llllIIIIIlII(Inventory.contains((String[])stringArray20) ? 1 : 0)) {
                                                                        a.a(lIIIlllIII[15], lIIIlllIII[11]);
                                                                    }
                                                                    String[] stringArray21 = new String[lIIIlllIII[1]];
                                                                    stringArray21[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[102]];
                                                                    if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                                                                        String[] stringArray22 = new String[lIIIlllIII[1]];
                                                                        stringArray22[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[103]];
                                                                        if (z.llllIIIIIIll(Inventory.getFirst((String[])stringArray22).getQuantity(), lIIIlllIII[11])) {
                                                                            String[] stringArray23 = new String[lIIIlllIII[1]];
                                                                            stringArray23[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[105]];
                                                                            Bank.withdraw((String)lIIIllIIIl[lIIIlllIII[104]], (int)(lIIIlllIII[11] - Inventory.getFirst((String[])stringArray23).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lIIIlllIII[9]);

                                                                        }
                                                                    }
                                                                    String[] stringArray24 = new String[lIIIlllIII[1]];
                                                                    stringArray24[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[106]];
                                                                    if (z.llllIIIIIlII(Inventory.contains((String[])stringArray24) ? 1 : 0)) {
                                                                        a.a(lIIIlllIII[16], lIIIlllIII[11]);
                                                                    }
                                                                    String[] stringArray25 = new String[lIIIlllIII[1]];
                                                                    stringArray25[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[107]];
                                                                    if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray25) ? 1 : 0)) {
                                                                        String[] stringArray26 = new String[lIIIlllIII[1]];
                                                                        stringArray26[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[108]];
                                                                        if (z.llllIIIIIIll(Inventory.getFirst((String[])stringArray26).getQuantity(), lIIIlllIII[11])) {
                                                                            String[] stringArray27 = new String[lIIIlllIII[1]];
                                                                            stringArray27[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[110]];
                                                                            Bank.withdraw((String)lIIIllIIIl[lIIIlllIII[109]], (int)(lIIIlllIII[11] - Inventory.getFirst((String[])stringArray27).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lIIIlllIII[9]);

                                                                        }
                                                                    }
                                                                    String[] stringArray28 = new String[lIIIlllIII[1]];
                                                                    stringArray28[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[111]];
                                                                    if (z.llllIIIIIlII(Inventory.contains((String[])stringArray28) ? 1 : 0)) {
                                                                        a.a(lIIIlllIII[14], lIIIlllIII[11]);
                                                                    }
                                                                    String[] stringArray29 = new String[lIIIlllIII[1]];
                                                                    stringArray29[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[112]];
                                                                    if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray29) ? 1 : 0)) {
                                                                        String[] stringArray30 = new String[lIIIlllIII[1]];
                                                                        stringArray30[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[113]];
                                                                        if (z.llllIIIIIIll(Inventory.getFirst((String[])stringArray30).getQuantity(), lIIIlllIII[11])) {
                                                                            String[] stringArray31 = new String[lIIIlllIII[1]];
                                                                            stringArray31[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[115]];
                                                                            Bank.withdraw((String)lIIIllIIIl[lIIIlllIII[114]], (int)(lIIIlllIII[11] - Inventory.getFirst((String[])stringArray31).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lIIIlllIII[9]);

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray = new int[lIIIlllIII[1]];
                                                nArray[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                if (z.llllIIIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIlllIII[1]];
                                                    stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[116]];
                                                    if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray32 = new String[lIIIlllIII[1]];
                                                        stringArray32[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[117]];
                                                        if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray32).getQuantity(), lIIIlllIII[11])) {
                                                            String[] stringArray33 = new String[lIIIlllIII[1]];
                                                            stringArray33[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[118]];
                                                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray33) ? 1 : 0)) {
                                                                String[] stringArray34 = new String[lIIIlllIII[1]];
                                                                stringArray34[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[119]];
                                                                if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray34).getQuantity(), lIIIlllIII[11])) {
                                                                    String[] stringArray35 = new String[lIIIlllIII[1]];
                                                                    stringArray35[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[120]];
                                                                    if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray35) ? 1 : 0)) {
                                                                        String[] stringArray36 = new String[lIIIlllIII[1]];
                                                                        stringArray36[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[121]];
                                                                        if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray36).getQuantity(), lIIIlllIII[11])) {
                                                                            String[] stringArray37 = new String[lIIIlllIII[1]];
                                                                            stringArray37[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[122]];
                                                                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray37) ? 1 : 0)) {
                                                                                String[] stringArray38 = new String[lIIIlllIII[1]];
                                                                                stringArray38[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[123]];
                                                                                if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray38) ? 1 : 0) && z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(gc), lIIIlllIII[1])) {
                                                                                    if (z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fR), lIIIlllIII[6]) && z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fQ), lIIIlllIII[6])) {
                                                                                        AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[124]];
                                                                                        if (z.llllIIIIIIlI(Dialog.isOpen() ? 1 : 0)) {
                                                                                            Dialog.close();
                                                                                        }
                                                                                        Movement.walkTo((WorldPoint)gc);

                                                                                    }
                                                                                    if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fR), lIIIlllIII[7]) && z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(fQ), lIIIlllIII[6])) {
                                                                                        String[] stringArray39 = new String[lIIIlllIII[1]];
                                                                                        stringArray39[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[125]];
                                                                                        lllIlIllIII = Inventory.getFirst((String[])stringArray39);
                                                                                        String[] stringArray40 = new String[lIIIlllIII[1]];
                                                                                        stringArray40[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[126]];
                                                                                        lllIlIlIlll = TileObjects.getNearest((String[])stringArray40);
                                                                                        AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[127]];
                                                                                        if (z.llllIIIIIlll(lllIlIllIII) && z.llllIIIIIlll(lllIlIlIlll)) {
                                                                                            lllIlIllIII.useOn((TileObject)lllIlIlIlll);
                                                                                            Time.sleepUntil(() -> {
                                                                                                boolean bl;
                                                                                                if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fQ), lIIIlllIII[6])) {
                                                                                                    bl = lIIIlllIII[1];

                                                                                                } else {
                                                                                                    bl = lIIIlllIII[0];
                                                                                                }
                                                                                                return bl;
                                                                                            }, (int)lIIIlllIII[128]);

                                                                                        }
                                                                                    }
                                                                                    if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fQ), lIIIlllIII[6])) {
                                                                                        String[] stringArray41 = new String[lIIIlllIII[1]];
                                                                                        stringArray41[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[129]];
                                                                                        lllIlIllIII = Inventory.getFirst((String[])stringArray41);
                                                                                        int[] nArray31 = new int[lIIIlllIII[1]];
                                                                                        nArray31[z.lIIIlllIII[0]] = lIIIlllIII[130];
                                                                                        lllIlIlIlll = TileObjects.getNearest((int[])nArray31);
                                                                                        AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[131]];
                                                                                        if (z.llllIIIIIlll(lllIlIllIII) && z.llllIIIIIlll(lllIlIlIlll)) {
                                                                                            lllIlIllIII.useOn((TileObject)lllIlIlIlll);
                                                                                            Time.sleepTicks((int)lIIIlllIII[7]);

                                                                                        }
                                                                                    }
                                                                                    if (z.llllIIIIIIlI(Players.getLocal().getWorldLocation().equals((Object)gb) ? 1 : 0)) {
                                                                                        String[] stringArray42 = new String[lIIIlllIII[1]];
                                                                                        stringArray42[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[132]];
                                                                                        lllIlIllIII = TileObjects.getNearest((String[])stringArray42);
                                                                                        AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[133]];
                                                                                        if (z.llllIIIIIlll(lllIlIllIII)) {
                                                                                            lllIlIllIII.interact(lIIIllIIIl[lIIIlllIII[134]]);
                                                                                            Time.sleepTicks((int)lIIIlllIII[3]);

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
                                            if (z.llllIIIIlIlI(e.j(lIIIlllIII[10]), lIIIlllIII[7])) {
                                                int[] nArray = new int[lIIIlllIII[1]];
                                                nArray[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                if (z.llllIIIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIlllIII[1]];
                                                    stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[135]];
                                                    if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray43 = new String[lIIIlllIII[1]];
                                                        stringArray43[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[136]];
                                                        if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray43).getQuantity(), lIIIlllIII[11])) {
                                                            String[] stringArray44 = new String[lIIIlllIII[1]];
                                                            stringArray44[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[137]];
                                                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray44) ? 1 : 0)) {
                                                                String[] stringArray45 = new String[lIIIlllIII[1]];
                                                                stringArray45[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[138]];
                                                                if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray45).getQuantity(), lIIIlllIII[11])) {
                                                                    String[] stringArray46 = new String[lIIIlllIII[1]];
                                                                    stringArray46[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[139]];
                                                                    if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray46) ? 1 : 0)) {
                                                                        String[] stringArray47 = new String[lIIIlllIII[1]];
                                                                        stringArray47[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[140]];
                                                                        if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray47).getQuantity(), lIIIlllIII[11])) {
                                                                            String[] stringArray48 = new String[lIIIlllIII[1]];
                                                                            stringArray48[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[141]];
                                                                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray48) ? 1 : 0)) {
                                                                                String[] stringArray49 = new String[lIIIlllIII[1]];
                                                                                stringArray49[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[142]];
                                                                                if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray49) ? 1 : 0)) {
                                                                                    int[] nArray32 = new int[lIIIlllIII[1]];
                                                                                    nArray32[z.lIIIlllIII[0]] = lIIIlllIII[143];
                                                                                    if (z.llllIIIIIIll(Inventory.getCount((int[])nArray32), lIIIlllIII[1]) && z.llllIIIIIlII(Players.getLocal().getWorldLocation().equals((Object)gb) ? 1 : 0)) {
                                                                                        AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[144]];
                                                                                        if (z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(gc), lIIIlllIII[3])) {
                                                                                            Movement.walkTo((WorldPoint)gc);

                                                                                        }
                                                                                        if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(gc), lIIIlllIII[3])) {
                                                                                            int[] nArray33 = new int[lIIIlllIII[1]];
                                                                                            nArray33[z.lIIIlllIII[0]] = lIIIlllIII[145];
                                                                                            lllIlIllIII = TileObjects.getNearest((int[])nArray33);
                                                                                            if (z.llllIIIIIlll(lllIlIllIII)) {
                                                                                                lllIlIllIII.interact(lIIIllIIIl[lIIIlllIII[146]]);
                                                                                                Time.sleepTicks((int)lIIIlllIII[3]);

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
                                                int[] nArray34 = new int[lIIIlllIII[1]];
                                                nArray34[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                if (z.llllIIIIIIlI(Inventory.contains((int[])nArray34) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIlllIII[1]];
                                                    stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[147]];
                                                    if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray50 = new String[lIIIlllIII[1]];
                                                        stringArray50[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[148]];
                                                        if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray50).getQuantity(), lIIIlllIII[11])) {
                                                            String[] stringArray51 = new String[lIIIlllIII[1]];
                                                            stringArray51[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[149]];
                                                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray51) ? 1 : 0)) {
                                                                String[] stringArray52 = new String[lIIIlllIII[1]];
                                                                stringArray52[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[150]];
                                                                if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray52).getQuantity(), lIIIlllIII[11])) {
                                                                    String[] stringArray53 = new String[lIIIlllIII[1]];
                                                                    stringArray53[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[151]];
                                                                    if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray53) ? 1 : 0)) {
                                                                        String[] stringArray54 = new String[lIIIlllIII[1]];
                                                                        stringArray54[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[152]];
                                                                        if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray54).getQuantity(), lIIIlllIII[11])) {
                                                                            String[] stringArray55 = new String[lIIIlllIII[1]];
                                                                            stringArray55[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[153]];
                                                                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray55) ? 1 : 0)) {
                                                                                String[] stringArray56 = new String[lIIIlllIII[1]];
                                                                                stringArray56[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[154]];
                                                                                if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray56) ? 1 : 0)) {
                                                                                    int[] nArray35 = new int[lIIIlllIII[1]];
                                                                                    nArray35[z.lIIIlllIII[0]] = lIIIlllIII[143];
                                                                                    if (z.llllIIIIlIII(Inventory.getCount((int[])nArray35)) && z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(gd), lIIIlllIII[3]) && z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(ge), lIIIlllIII[5])) {
                                                                                        AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[155]];
                                                                                        Movement.walkTo((WorldPoint)gd);

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
                                                int[] nArray36 = new int[lIIIlllIII[1]];
                                                nArray36[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                if (z.llllIIIIIIlI(Inventory.contains((int[])nArray36) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIlllIII[1]];
                                                    stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[156]];
                                                    if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray57 = new String[lIIIlllIII[1]];
                                                        stringArray57[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[157]];
                                                        if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray57).getQuantity(), lIIIlllIII[11])) {
                                                            String[] stringArray58 = new String[lIIIlllIII[1]];
                                                            stringArray58[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[158]];
                                                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray58) ? 1 : 0)) {
                                                                String[] stringArray59 = new String[lIIIlllIII[1]];
                                                                stringArray59[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[159]];
                                                                if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray59).getQuantity(), lIIIlllIII[11])) {
                                                                    String[] stringArray60 = new String[lIIIlllIII[1]];
                                                                    stringArray60[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[160]];
                                                                    if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray60) ? 1 : 0)) {
                                                                        String[] stringArray61 = new String[lIIIlllIII[1]];
                                                                        stringArray61[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[161]];
                                                                        if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray61).getQuantity(), lIIIlllIII[11])) {
                                                                            String[] stringArray62 = new String[lIIIlllIII[1]];
                                                                            stringArray62[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[162]];
                                                                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray62) ? 1 : 0)) {
                                                                                String[] stringArray63 = new String[lIIIlllIII[1]];
                                                                                stringArray63[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[163]];
                                                                                if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray63) ? 1 : 0)) {
                                                                                    int[] nArray37 = new int[lIIIlllIII[1]];
                                                                                    nArray37[z.lIIIlllIII[0]] = lIIIlllIII[143];
                                                                                    if (z.llllIIIIlIII(Inventory.getCount((int[])nArray37)) && z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(gd), lIIIlllIII[5])) {
                                                                                        int[] nArray38 = new int[lIIIlllIII[1]];
                                                                                        nArray38[z.lIIIlllIII[0]] = lIIIlllIII[143];
                                                                                        lllIlIllIII = Inventory.getFirst((int[])nArray38);
                                                                                        String[] stringArray64 = new String[lIIIlllIII[1]];
                                                                                        stringArray64[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[164]];
                                                                                        lllIlIlIlll = TileObjects.getNearest((String[])stringArray64);
                                                                                        if (z.llllIIIIIlll(lllIlIllIII) && z.llllIIIIIlll(lllIlIlIlll)) {
                                                                                            lllIlIllIII.useOn((TileObject)lllIlIlIlll);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)gb), (int)lIIIlllIII[165]);

                                                                                        }
                                                                                        while (z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(ge), lIIIlllIII[3])) {
                                                                                            Movement.walkTo((WorldPoint)ge);

                                                                                            Time.sleepTicks((int)lIIIlllIII[1]);

                                                                                            if (-1 <= 0) continue;
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
                                                int[] nArray39 = new int[lIIIlllIII[1]];
                                                nArray39[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                                if (z.llllIIIIIIlI(Inventory.contains((int[])nArray39) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIlllIII[1]];
                                                    stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[166]];
                                                    if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray65 = new String[lIIIlllIII[1]];
                                                        stringArray65[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[167]];
                                                        if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray65).getQuantity(), lIIIlllIII[11])) {
                                                            String[] stringArray66 = new String[lIIIlllIII[1]];
                                                            stringArray66[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[168]];
                                                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray66) ? 1 : 0)) {
                                                                String[] stringArray67 = new String[lIIIlllIII[1]];
                                                                stringArray67[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[169]];
                                                                if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray67).getQuantity(), lIIIlllIII[11])) {
                                                                    String[] stringArray68 = new String[lIIIlllIII[1]];
                                                                    stringArray68[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[170]];
                                                                    if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray68) ? 1 : 0)) {
                                                                        String[] stringArray69 = new String[lIIIlllIII[1]];
                                                                        stringArray69[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[171]];
                                                                        if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray69).getQuantity(), lIIIlllIII[11])) {
                                                                            String[] stringArray70 = new String[lIIIlllIII[1]];
                                                                            stringArray70[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[172]];
                                                                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray70) ? 1 : 0)) {
                                                                                String[] stringArray71 = new String[lIIIlllIII[1]];
                                                                                stringArray71[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[173]];
                                                                                if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray71) ? 1 : 0)) {
                                                                                    int[] nArray40 = new int[lIIIlllIII[1]];
                                                                                    nArray40[z.lIIIlllIII[0]] = lIIIlllIII[143];
                                                                                    if (z.llllIIIIlIII(Inventory.getCount((int[])nArray40)) && z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(ge), lIIIlllIII[5])) {
                                                                                        int[] nArray41 = new int[lIIIlllIII[1]];
                                                                                        nArray41[z.lIIIlllIII[0]] = lIIIlllIII[143];
                                                                                        lllIlIllIII = Inventory.getFirst((int[])nArray41);
                                                                                        String[] stringArray72 = new String[lIIIlllIII[1]];
                                                                                        stringArray72[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[174]];
                                                                                        lllIlIlIlll = TileObjects.getNearest((String[])stringArray72);
                                                                                        if (z.llllIIIIIlll(lllIlIllIII) && z.llllIIIIIlll(lllIlIlIlll)) {
                                                                                            lllIlIlIlll.interact(lIIIllIIIl[lIIIlllIII[175]]);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)gb), (int)lIIIlllIII[165]);

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
                                            if (!z.llllIIIIlIlI(e.j(lIIIlllIII[10]), lIIIlllIII[11])) break block270;
                                            int[] nArray = new int[lIIIlllIII[1]];
                                            nArray[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                            if (z.llllIIIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                String[] stringArray = new String[lIIIlllIII[1]];
                                                stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[176]];
                                                if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                    String[] stringArray73 = new String[lIIIlllIII[1]];
                                                    stringArray73[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[177]];
                                                    if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray73).getQuantity(), lIIIlllIII[11])) {
                                                        String[] stringArray74 = new String[lIIIlllIII[1]];
                                                        stringArray74[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[178]];
                                                        if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray74) ? 1 : 0)) {
                                                            String[] stringArray75 = new String[lIIIlllIII[1]];
                                                            stringArray75[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[179]];
                                                            if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray75).getQuantity(), lIIIlllIII[11])) {
                                                                String[] stringArray76 = new String[lIIIlllIII[1]];
                                                                stringArray76[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[180]];
                                                                if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray76) ? 1 : 0)) {
                                                                    String[] stringArray77 = new String[lIIIlllIII[1]];
                                                                    stringArray77[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[181]];
                                                                    if (z.llllIIIIIllI(Inventory.getFirst((String[])stringArray77).getQuantity(), lIIIlllIII[11])) {
                                                                        String[] stringArray78 = new String[lIIIlllIII[1]];
                                                                        stringArray78[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[182]];
                                                                        if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray78) ? 1 : 0)) {
                                                                            String[] stringArray79 = new String[lIIIlllIII[1]];
                                                                            stringArray79[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[183]];
                                                                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray79) ? 1 : 0)) {
                                                                                int[] nArray42 = new int[lIIIlllIII[1]];
                                                                                nArray42[z.lIIIlllIII[0]] = lIIIlllIII[143];
                                                                                if (z.llllIIIIlIII(Inventory.getCount((int[])nArray42)) && z.llllIIIIIIlI(ft.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(gk), lIIIlllIII[1])) {
                                                                                    AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[184]];
                                                                                    Movement.walkTo((WorldPoint)gk);

                                                                                    Time.sleepTicks((int)lIIIlllIII[6]);

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
                                            int[] nArray43 = new int[lIIIlllIII[1]];
                                            nArray43[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                            if (!z.llllIIIIIIlI(Inventory.contains((int[])nArray43) ? 1 : 0)) break block248;
                                            String[] stringArray = new String[lIIIlllIII[1]];
                                            stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[185]];
                                            if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block248;
                                            String[] stringArray80 = new String[lIIIlllIII[1]];
                                            stringArray80[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[186]];
                                            if (!z.llllIIIIIllI(Inventory.getFirst((String[])stringArray80).getQuantity(), lIIIlllIII[11])) break block248;
                                            String[] stringArray81 = new String[lIIIlllIII[1]];
                                            stringArray81[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[187]];
                                            if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray81) ? 1 : 0)) break block248;
                                            String[] stringArray82 = new String[lIIIlllIII[1]];
                                            stringArray82[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[188]];
                                            if (!z.llllIIIIIllI(Inventory.getFirst((String[])stringArray82).getQuantity(), lIIIlllIII[11])) break block248;
                                            String[] stringArray83 = new String[lIIIlllIII[1]];
                                            stringArray83[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[189]];
                                            if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray83) ? 1 : 0)) break block248;
                                            String[] stringArray84 = new String[lIIIlllIII[1]];
                                            stringArray84[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[190]];
                                            if (!z.llllIIIIIllI(Inventory.getFirst((String[])stringArray84).getQuantity(), lIIIlllIII[11])) break block248;
                                            String[] stringArray85 = new String[lIIIlllIII[1]];
                                            stringArray85[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[191]];
                                            if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray85) ? 1 : 0)) break block248;
                                            String[] stringArray86 = new String[lIIIlllIII[1]];
                                            stringArray86[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[192]];
                                            if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray86) ? 1 : 0)) break block248;
                                            int[] nArray44 = new int[lIIIlllIII[1]];
                                            nArray44[z.lIIIlllIII[0]] = lIIIlllIII[143];
                                            if (!z.llllIIIIlIII(Inventory.getCount((int[])nArray44)) || !z.llllIIIIIIlI(ft.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(gk), lIIIlllIII[3])) break block248;
                                            AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[193]];
                                            do {
                                                block272: {
                                                    block273: {
                                                        block271: {
                                                            String[] stringArray87 = new String[lIIIlllIII[1]];
                                                            stringArray87[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[194]];
                                                            if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray87) ? 1 : 0)) break block271;
                                                            String[] stringArray88 = new String[lIIIlllIII[1]];
                                                            stringArray88[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[195]];
                                                            if (!z.llllIIIIIIll(Inventory.getFirst((String[])stringArray88).getQuantity(), lIIIlllIII[11])) break block272;
                                                        }
                                                        String[] stringArray89 = new String[lIIIlllIII[1]];
                                                        stringArray89[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[196]];
                                                        if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray89) ? 1 : 0)) break block273;
                                                        String[] stringArray90 = new String[lIIIlllIII[1]];
                                                        stringArray90[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[197]];
                                                        if (!z.llllIIIIIIll(Inventory.getFirst((String[])stringArray90).getQuantity(), lIIIlllIII[11])) break block272;
                                                    }
                                                    String[] stringArray91 = new String[lIIIlllIII[1]];
                                                    stringArray91[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[198]];
                                                    if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray91) ? 1 : 0)) break block248;
                                                    String[] stringArray92 = new String[lIIIlllIII[1]];
                                                    stringArray92[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[199]];
                                                    if (!z.llllIIIIIllI(Inventory.getFirst((String[])stringArray92).getQuantity(), lIIIlllIII[11])) break block248;
                                                }
                                                if (!z.llllIIIIIlII(AccBuilderRogues.d ? 1 : 0)) break block248;
                                                int[] nArray45 = new int[lIIIlllIII[1]];
                                                nArray45[z.lIIIlllIII[0]] = lIIIlllIII[200];
                                                lllIlIllIII = TileObjects.getFirstAt((WorldPoint)fu, (int[])nArray45);
                                                String[] stringArray93 = new String[lIIIlllIII[1]];
                                                stringArray93[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[201]];
                                                Inventory.getFirst((String[])stringArray93).useOn((TileObject)lllIlIllIII);
                                                Time.sleepTicks((int)lIIIlllIII[1]);

                                                String[] stringArray94 = new String[lIIIlllIII[1]];
                                                stringArray94[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[202]];
                                                Inventory.getFirst((String[])stringArray94).useOn((TileObject)lllIlIllIII);
                                                Time.sleepTicks((int)lIIIlllIII[1]);

                                                String[] stringArray95 = new String[lIIIlllIII[1]];
                                                stringArray95[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[203]];
                                                Inventory.getFirst((String[])stringArray95).useOn((TileObject)lllIlIllIII);
                                                Time.sleepTicks((int)lIIIlllIII[1]);

                                            } while (-3 <= 0);
                                            return;
                                        }
                                        int[] nArray = new int[lIIIlllIII[1]];
                                        nArray[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                        if (!z.llllIIIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block249;
                                        String[] stringArray = new String[lIIIlllIII[1]];
                                        stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[204]];
                                        if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block249;
                                        String[] stringArray96 = new String[lIIIlllIII[1]];
                                        stringArray96[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[205]];
                                        if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray96).getQuantity(), lIIIlllIII[7])) break block249;
                                        String[] stringArray97 = new String[lIIIlllIII[1]];
                                        stringArray97[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[206]];
                                        if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray97) ? 1 : 0)) break block249;
                                        String[] stringArray98 = new String[lIIIlllIII[1]];
                                        stringArray98[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[207]];
                                        if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray98).getQuantity(), lIIIlllIII[7])) break block249;
                                        String[] stringArray99 = new String[lIIIlllIII[1]];
                                        stringArray99[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[208]];
                                        if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray99) ? 1 : 0)) break block249;
                                        String[] stringArray100 = new String[lIIIlllIII[1]];
                                        stringArray100[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[209]];
                                        if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray100).getQuantity(), lIIIlllIII[7])) break block249;
                                        String[] stringArray101 = new String[lIIIlllIII[1]];
                                        stringArray101[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[210]];
                                        if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray101) ? 1 : 0)) break block249;
                                        String[] stringArray102 = new String[lIIIlllIII[1]];
                                        stringArray102[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[211]];
                                        if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray102) ? 1 : 0)) break block249;
                                        int[] nArray46 = new int[lIIIlllIII[1]];
                                        nArray46[z.lIIIlllIII[0]] = lIIIlllIII[143];
                                        if (!z.llllIIIIlIII(Inventory.getCount((int[])nArray46)) || !z.llllIIIIIIlI(ft.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(gj), lIIIlllIII[1])) break block249;
                                        AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[212]];
                                        while (true) {
                                            block275: {
                                                block276: {
                                                    block274: {
                                                        String[] stringArray103 = new String[lIIIlllIII[1]];
                                                        stringArray103[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[213]];
                                                        if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray103) ? 1 : 0)) break block274;
                                                        String[] stringArray104 = new String[lIIIlllIII[1]];
                                                        stringArray104[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[214]];
                                                        if (!z.llllIIIIlIll(Inventory.getFirst((String[])stringArray104).getQuantity(), lIIIlllIII[7])) break block275;
                                                    }
                                                    String[] stringArray105 = new String[lIIIlllIII[1]];
                                                    stringArray105[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[215]];
                                                    if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray105) ? 1 : 0)) break block276;
                                                    String[] stringArray106 = new String[lIIIlllIII[1]];
                                                    stringArray106[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[216]];
                                                    if (!z.llllIIIIlIll(Inventory.getFirst((String[])stringArray106).getQuantity(), lIIIlllIII[7])) break block275;
                                                }
                                                String[] stringArray107 = new String[lIIIlllIII[1]];
                                                stringArray107[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[217]];
                                                if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray107) ? 1 : 0)) break block249;
                                                String[] stringArray108 = new String[lIIIlllIII[1]];
                                                stringArray108[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[218]];
                                                if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray108).getQuantity(), lIIIlllIII[7])) break block249;
                                            }
                                            if (!z.llllIIIIIlII(AccBuilderRogues.d ? 1 : 0)) break block249;
                                            if (z.llllIIIIIlII(Players.getLocal().getWorldLocation().equals((Object)gj) ? 1 : 0)) {
                                                Movement.walkTo((WorldPoint)gj);

                                                Time.sleepTicks((int)lIIIlllIII[5]);

                                            }
                                            if (!z.llllIIIIIIlI(Players.getLocal().getWorldLocation().equals((Object)gj) ? 1 : 0)) continue;
                                            int[] nArray47 = new int[lIIIlllIII[1]];
                                            nArray47[z.lIIIlllIII[0]] = lIIIlllIII[200];
                                            lllIlIllIII = TileObjects.getFirstAt((WorldPoint)fv, (int[])nArray47);
                                            String[] stringArray109 = new String[lIIIlllIII[1]];
                                            stringArray109[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[219]];
                                            Inventory.getFirst((String[])stringArray109).useOn((TileObject)lllIlIllIII);
                                            Time.sleepTicks((int)lIIIlllIII[1]);

                                            String[] stringArray110 = new String[lIIIlllIII[1]];
                                            stringArray110[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[220]];
                                            Inventory.getFirst((String[])stringArray110).useOn((TileObject)lllIlIllIII);
                                            Time.sleepTicks((int)lIIIlllIII[1]);

                                            String[] stringArray111 = new String[lIIIlllIII[1]];
                                            stringArray111[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[221]];
                                            Inventory.getFirst((String[])stringArray111).useOn((TileObject)lllIlIllIII);
                                            Time.sleepTicks((int)lIIIlllIII[1]);

                                            if (3 <= 0) break;
                                        }
                                        return;
                                    }
                                    int[] nArray = new int[lIIIlllIII[1]];
                                    nArray[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                    if (!z.llllIIIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block250;
                                    String[] stringArray = new String[lIIIlllIII[1]];
                                    stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[222]];
                                    if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block250;
                                    String[] stringArray112 = new String[lIIIlllIII[1]];
                                    stringArray112[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[223]];
                                    if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray112).getQuantity(), lIIIlllIII[6])) break block250;
                                    String[] stringArray113 = new String[lIIIlllIII[1]];
                                    stringArray113[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[224]];
                                    if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray113) ? 1 : 0)) break block250;
                                    String[] stringArray114 = new String[lIIIlllIII[1]];
                                    stringArray114[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[225]];
                                    if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray114).getQuantity(), lIIIlllIII[6])) break block250;
                                    String[] stringArray115 = new String[lIIIlllIII[1]];
                                    stringArray115[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[226]];
                                    if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray115) ? 1 : 0)) break block250;
                                    String[] stringArray116 = new String[lIIIlllIII[1]];
                                    stringArray116[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[227]];
                                    if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray116).getQuantity(), lIIIlllIII[6])) break block250;
                                    String[] stringArray117 = new String[lIIIlllIII[1]];
                                    stringArray117[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[228]];
                                    if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray117) ? 1 : 0)) break block250;
                                    String[] stringArray118 = new String[lIIIlllIII[1]];
                                    stringArray118[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[229]];
                                    if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray118) ? 1 : 0)) break block250;
                                    int[] nArray48 = new int[lIIIlllIII[1]];
                                    nArray48[z.lIIIlllIII[0]] = lIIIlllIII[143];
                                    if (!z.llllIIIIlIII(Inventory.getCount((int[])nArray48)) || !z.llllIIIIIIlI(ft.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block250;
                                    AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[230]];
                                    while (true) {
                                        block278: {
                                            block279: {
                                                block277: {
                                                    String[] stringArray119 = new String[lIIIlllIII[1]];
                                                    stringArray119[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[231]];
                                                    if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray119) ? 1 : 0)) break block277;
                                                    String[] stringArray120 = new String[lIIIlllIII[1]];
                                                    stringArray120[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[232]];
                                                    if (!z.llllIIIIlIll(Inventory.getFirst((String[])stringArray120).getQuantity(), lIIIlllIII[6])) break block278;
                                                }
                                                String[] stringArray121 = new String[lIIIlllIII[1]];
                                                stringArray121[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[233]];
                                                if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray121) ? 1 : 0)) break block279;
                                                String[] stringArray122 = new String[lIIIlllIII[1]];
                                                stringArray122[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[234]];
                                                if (!z.llllIIIIlIll(Inventory.getFirst((String[])stringArray122).getQuantity(), lIIIlllIII[6])) break block278;
                                            }
                                            String[] stringArray123 = new String[lIIIlllIII[1]];
                                            stringArray123[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[235]];
                                            if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray123) ? 1 : 0)) break block250;
                                            String[] stringArray124 = new String[lIIIlllIII[1]];
                                            stringArray124[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[236]];
                                            if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray124).getQuantity(), lIIIlllIII[6])) break block250;
                                        }
                                        if (!z.llllIIIIIlII(AccBuilderRogues.d ? 1 : 0)) break block250;
                                        if (z.llllIIIIIlII(Players.getLocal().getWorldLocation().equals((Object)gi) ? 1 : 0)) {
                                            Movement.walkTo((WorldPoint)gi);

                                            Time.sleepTicks((int)lIIIlllIII[5]);

                                        }
                                        if (!z.llllIIIIIIlI(Players.getLocal().getWorldLocation().equals((Object)gi) ? 1 : 0)) continue;
                                        int[] nArray49 = new int[lIIIlllIII[1]];
                                        nArray49[z.lIIIlllIII[0]] = lIIIlllIII[200];
                                        lllIlIllIII = TileObjects.getFirstAt((WorldPoint)fw, (int[])nArray49);
                                        String[] stringArray125 = new String[lIIIlllIII[1]];
                                        stringArray125[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[237]];
                                        Inventory.getFirst((String[])stringArray125).useOn((TileObject)lllIlIllIII);
                                        Time.sleepTicks((int)lIIIlllIII[1]);

                                        String[] stringArray126 = new String[lIIIlllIII[1]];
                                        stringArray126[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[238]];
                                        Inventory.getFirst((String[])stringArray126).useOn((TileObject)lllIlIllIII);
                                        Time.sleepTicks((int)lIIIlllIII[1]);

                                        String[] stringArray127 = new String[lIIIlllIII[1]];
                                        stringArray127[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[239]];
                                        Inventory.getFirst((String[])stringArray127).useOn((TileObject)lllIlIllIII);
                                        Time.sleepTicks((int)lIIIlllIII[1]);

                                        if (3 < ((0x1A ^ 0x75 ^ (0x1F ^ 0x35)) & (13 + 36 - -148 + 24 ^ 40 + 126 - 159 + 145 ^ -1))) break;
                                    }
                                    return;
                                }
                                int[] nArray = new int[lIIIlllIII[1]];
                                nArray[z.lIIIlllIII[0]] = lIIIlllIII[41];
                                if (!z.llllIIIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block251;
                                String[] stringArray = new String[lIIIlllIII[1]];
                                stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[240]];
                                if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block251;
                                String[] stringArray128 = new String[lIIIlllIII[1]];
                                stringArray128[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[241]];
                                if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray128).getQuantity(), lIIIlllIII[5])) break block251;
                                String[] stringArray129 = new String[lIIIlllIII[1]];
                                stringArray129[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[242]];
                                if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray129) ? 1 : 0)) break block251;
                                String[] stringArray130 = new String[lIIIlllIII[1]];
                                stringArray130[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[243]];
                                if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray130).getQuantity(), lIIIlllIII[5])) break block251;
                                String[] stringArray131 = new String[lIIIlllIII[1]];
                                stringArray131[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[244]];
                                if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray131) ? 1 : 0)) break block251;
                                String[] stringArray132 = new String[lIIIlllIII[1]];
                                stringArray132[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[245]];
                                if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray132).getQuantity(), lIIIlllIII[5])) break block251;
                                String[] stringArray133 = new String[lIIIlllIII[1]];
                                stringArray133[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[246]];
                                if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray133) ? 1 : 0)) break block251;
                                String[] stringArray134 = new String[lIIIlllIII[1]];
                                stringArray134[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[247]];
                                if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray134) ? 1 : 0)) break block251;
                                int[] nArray50 = new int[lIIIlllIII[1]];
                                nArray50[z.lIIIlllIII[0]] = lIIIlllIII[143];
                                if (!z.llllIIIIlIII(Inventory.getCount((int[])nArray50)) || !z.llllIIIIIIlI(ft.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block251;
                                AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[248]];
                                while (true) {
                                    block281: {
                                        block282: {
                                            block280: {
                                                String[] stringArray135 = new String[lIIIlllIII[1]];
                                                stringArray135[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[249]];
                                                if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray135) ? 1 : 0)) break block280;
                                                String[] stringArray136 = new String[lIIIlllIII[1]];
                                                stringArray136[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[250]];
                                                if (!z.llllIIIIlIll(Inventory.getFirst((String[])stringArray136).getQuantity(), lIIIlllIII[5])) break block281;
                                            }
                                            String[] stringArray137 = new String[lIIIlllIII[1]];
                                            stringArray137[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[251]];
                                            if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray137) ? 1 : 0)) break block282;
                                            String[] stringArray138 = new String[lIIIlllIII[1]];
                                            stringArray138[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[252]];
                                            if (!z.llllIIIIlIll(Inventory.getFirst((String[])stringArray138).getQuantity(), lIIIlllIII[5])) break block281;
                                        }
                                        String[] stringArray139 = new String[lIIIlllIII[1]];
                                        stringArray139[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[8]];
                                        if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray139) ? 1 : 0)) break block251;
                                        String[] stringArray140 = new String[lIIIlllIII[1]];
                                        stringArray140[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[253]];
                                        if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray140).getQuantity(), lIIIlllIII[5])) break block251;
                                    }
                                    if (!z.llllIIIIIlII(AccBuilderRogues.d ? 1 : 0)) break block251;
                                    if (z.llllIIIIIlII(Players.getLocal().getWorldLocation().equals((Object)gh) ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)gh);

                                        Time.sleepTicks((int)lIIIlllIII[5]);

                                    }
                                    if (!z.llllIIIIIIlI(Players.getLocal().getWorldLocation().equals((Object)gh) ? 1 : 0)) continue;
                                    int[] nArray51 = new int[lIIIlllIII[1]];
                                    nArray51[z.lIIIlllIII[0]] = lIIIlllIII[200];
                                    lllIlIllIII = TileObjects.getFirstAt((WorldPoint)fx, (int[])nArray51);
                                    String[] stringArray141 = new String[lIIIlllIII[1]];
                                    stringArray141[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[254]];
                                    Inventory.getFirst((String[])stringArray141).useOn((TileObject)lllIlIllIII);
                                    Time.sleepTicks((int)lIIIlllIII[1]);

                                    String[] stringArray142 = new String[lIIIlllIII[1]];
                                    stringArray142[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[255]];
                                    Inventory.getFirst((String[])stringArray142).useOn((TileObject)lllIlIllIII);
                                    Time.sleepTicks((int)lIIIlllIII[1]);

                                    String[] stringArray143 = new String[lIIIlllIII[1]];
                                    stringArray143[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[256]];
                                    Inventory.getFirst((String[])stringArray143).useOn((TileObject)lllIlIllIII);
                                    Time.sleepTicks((int)lIIIlllIII[1]);

                                    if (3 <= -1) break;
                                }
                                return;
                            }
                            int[] nArray = new int[lIIIlllIII[1]];
                            nArray[z.lIIIlllIII[0]] = lIIIlllIII[41];
                            if (!z.llllIIIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block252;
                            String[] stringArray = new String[lIIIlllIII[1]];
                            stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[257]];
                            if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block252;
                            String[] stringArray144 = new String[lIIIlllIII[1]];
                            stringArray144[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[258]];
                            if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray144).getQuantity(), lIIIlllIII[3])) break block252;
                            String[] stringArray145 = new String[lIIIlllIII[1]];
                            stringArray145[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[259]];
                            if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray145) ? 1 : 0)) break block252;
                            String[] stringArray146 = new String[lIIIlllIII[1]];
                            stringArray146[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[260]];
                            if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray146).getQuantity(), lIIIlllIII[3])) break block252;
                            String[] stringArray147 = new String[lIIIlllIII[1]];
                            stringArray147[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[261]];
                            if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray147) ? 1 : 0)) break block252;
                            String[] stringArray148 = new String[lIIIlllIII[1]];
                            stringArray148[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[262]];
                            if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray148).getQuantity(), lIIIlllIII[3])) break block252;
                            String[] stringArray149 = new String[lIIIlllIII[1]];
                            stringArray149[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[263]];
                            if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray149) ? 1 : 0)) break block252;
                            String[] stringArray150 = new String[lIIIlllIII[1]];
                            stringArray150[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[264]];
                            if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray150) ? 1 : 0)) break block252;
                            int[] nArray52 = new int[lIIIlllIII[1]];
                            nArray52[z.lIIIlllIII[0]] = lIIIlllIII[143];
                            if (!z.llllIIIIlIII(Inventory.getCount((int[])nArray52)) || !z.llllIIIIIIlI(ft.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block252;
                            AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[265]];
                            while (true) {
                                block284: {
                                    block285: {
                                        block283: {
                                            String[] stringArray151 = new String[lIIIlllIII[1]];
                                            stringArray151[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[266]];
                                            if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray151) ? 1 : 0)) break block283;
                                            String[] stringArray152 = new String[lIIIlllIII[1]];
                                            stringArray152[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[267]];
                                            if (!z.llllIIIIlIll(Inventory.getFirst((String[])stringArray152).getQuantity(), lIIIlllIII[3])) break block284;
                                        }
                                        String[] stringArray153 = new String[lIIIlllIII[1]];
                                        stringArray153[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[268]];
                                        if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray153) ? 1 : 0)) break block285;
                                        String[] stringArray154 = new String[lIIIlllIII[1]];
                                        stringArray154[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[269]];
                                        if (!z.llllIIIIlIll(Inventory.getFirst((String[])stringArray154).getQuantity(), lIIIlllIII[3])) break block284;
                                    }
                                    String[] stringArray155 = new String[lIIIlllIII[1]];
                                    stringArray155[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[270]];
                                    if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray155) ? 1 : 0)) break block252;
                                    String[] stringArray156 = new String[lIIIlllIII[1]];
                                    stringArray156[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[271]];
                                    if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray156).getQuantity(), lIIIlllIII[3])) break block252;
                                }
                                if (!z.llllIIIIIlII(AccBuilderRogues.d ? 1 : 0)) break block252;
                                if (z.llllIIIIIlII(Players.getLocal().getWorldLocation().equals((Object)gg) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)gg);

                                    Time.sleepTicks((int)lIIIlllIII[5]);

                                }
                                if (!z.llllIIIIIIlI(Players.getLocal().getWorldLocation().equals((Object)gg) ? 1 : 0)) continue;
                                int[] nArray53 = new int[lIIIlllIII[1]];
                                nArray53[z.lIIIlllIII[0]] = lIIIlllIII[200];
                                lllIlIllIII = TileObjects.getFirstAt((WorldPoint)fy, (int[])nArray53);
                                String[] stringArray157 = new String[lIIIlllIII[1]];
                                stringArray157[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[272]];
                                if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray157) ? 1 : 0)) {
                                    String[] stringArray158 = new String[lIIIlllIII[1]];
                                    stringArray158[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[273]];
                                    Inventory.getFirst((String[])stringArray158).useOn((TileObject)lllIlIllIII);
                                    Time.sleepTicks((int)lIIIlllIII[1]);

                                }
                                String[] stringArray159 = new String[lIIIlllIII[1]];
                                stringArray159[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[274]];
                                if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray159) ? 1 : 0)) {
                                    String[] stringArray160 = new String[lIIIlllIII[1]];
                                    stringArray160[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[275]];
                                    Inventory.getFirst((String[])stringArray160).useOn((TileObject)lllIlIllIII);
                                    Time.sleepTicks((int)lIIIlllIII[1]);

                                }
                                String[] stringArray161 = new String[lIIIlllIII[1]];
                                stringArray161[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[276]];
                                if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray161) ? 1 : 0)) {
                                    String[] stringArray162 = new String[lIIIlllIII[1]];
                                    stringArray162[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[277]];
                                    Inventory.getFirst((String[])stringArray162).useOn((TileObject)lllIlIllIII);
                                    Time.sleepTicks((int)lIIIlllIII[1]);

                                }

                                if (2 < -1) break;
                            }
                            return;
                        }
                        int[] nArray = new int[lIIIlllIII[1]];
                        nArray[z.lIIIlllIII[0]] = lIIIlllIII[41];
                        if (!z.llllIIIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block253;
                        String[] stringArray = new String[lIIIlllIII[1]];
                        stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[278]];
                        if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block253;
                        String[] stringArray163 = new String[lIIIlllIII[1]];
                        stringArray163[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[279]];
                        if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray163).getQuantity(), lIIIlllIII[1])) break block253;
                        String[] stringArray164 = new String[lIIIlllIII[1]];
                        stringArray164[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[280]];
                        if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray164) ? 1 : 0)) break block253;
                        String[] stringArray165 = new String[lIIIlllIII[1]];
                        stringArray165[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[281]];
                        if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray165).getQuantity(), lIIIlllIII[1])) break block253;
                        String[] stringArray166 = new String[lIIIlllIII[1]];
                        stringArray166[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[282]];
                        if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray166) ? 1 : 0)) break block253;
                        String[] stringArray167 = new String[lIIIlllIII[1]];
                        stringArray167[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[283]];
                        if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray167).getQuantity(), lIIIlllIII[1])) break block253;
                        String[] stringArray168 = new String[lIIIlllIII[1]];
                        stringArray168[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[284]];
                        if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray168) ? 1 : 0)) break block253;
                        String[] stringArray169 = new String[lIIIlllIII[1]];
                        stringArray169[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[285]];
                        if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray169) ? 1 : 0)) break block253;
                        int[] nArray54 = new int[lIIIlllIII[1]];
                        nArray54[z.lIIIlllIII[0]] = lIIIlllIII[143];
                        if (!z.llllIIIIlIII(Inventory.getCount((int[])nArray54)) || !z.llllIIIIIIlI(ft.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block253;
                        AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[286]];
                        while (true) {
                            block287: {
                                block288: {
                                    block286: {
                                        String[] stringArray170 = new String[lIIIlllIII[1]];
                                        stringArray170[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[287]];
                                        if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray170) ? 1 : 0)) break block286;
                                        String[] stringArray171 = new String[lIIIlllIII[1]];
                                        stringArray171[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[288]];
                                        if (!z.llllIIIIlIll(Inventory.getFirst((String[])stringArray171).getQuantity(), lIIIlllIII[1])) break block287;
                                    }
                                    String[] stringArray172 = new String[lIIIlllIII[1]];
                                    stringArray172[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[289]];
                                    if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray172) ? 1 : 0)) break block288;
                                    String[] stringArray173 = new String[lIIIlllIII[1]];
                                    stringArray173[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[290]];
                                    if (!z.llllIIIIlIll(Inventory.getFirst((String[])stringArray173).getQuantity(), lIIIlllIII[1])) break block287;
                                }
                                String[] stringArray174 = new String[lIIIlllIII[1]];
                                stringArray174[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[291]];
                                if (!z.llllIIIIIIlI(Inventory.contains((String[])stringArray174) ? 1 : 0)) break block253;
                                String[] stringArray175 = new String[lIIIlllIII[1]];
                                stringArray175[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[292]];
                                if (!z.llllIIIIlIlI(Inventory.getFirst((String[])stringArray175).getQuantity(), lIIIlllIII[1])) break block253;
                            }
                            if (!z.llllIIIIIlII(AccBuilderRogues.d ? 1 : 0)) break block253;
                            if (z.llllIIIIIlII(Players.getLocal().getWorldLocation().equals((Object)gf) ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)gf);

                            }
                            if (!z.llllIIIIIIlI(Players.getLocal().getWorldLocation().equals((Object)gf) ? 1 : 0)) continue;
                            int[] nArray55 = new int[lIIIlllIII[1]];
                            nArray55[z.lIIIlllIII[0]] = lIIIlllIII[200];
                            lllIlIllIII = TileObjects.getFirstAt((WorldPoint)fz, (int[])nArray55);
                            String[] stringArray176 = new String[lIIIlllIII[1]];
                            stringArray176[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[293]];
                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray176) ? 1 : 0)) {
                                String[] stringArray177 = new String[lIIIlllIII[1]];
                                stringArray177[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[294]];
                                Inventory.getFirst((String[])stringArray177).useOn((TileObject)lllIlIllIII);
                                Time.sleepTicks((int)lIIIlllIII[1]);

                            }
                            String[] stringArray178 = new String[lIIIlllIII[1]];
                            stringArray178[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[295]];
                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray178) ? 1 : 0)) {
                                String[] stringArray179 = new String[lIIIlllIII[1]];
                                stringArray179[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[296]];
                                Inventory.getFirst((String[])stringArray179).useOn((TileObject)lllIlIllIII);
                                Time.sleepTicks((int)lIIIlllIII[1]);

                            }
                            String[] stringArray180 = new String[lIIIlllIII[1]];
                            stringArray180[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[297]];
                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray180) ? 1 : 0)) {
                                String[] stringArray181 = new String[lIIIlllIII[1]];
                                stringArray181[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[298]];
                                Inventory.getFirst((String[])stringArray181).useOn((TileObject)lllIlIllIII);
                                Time.sleepTicks((int)lIIIlllIII[1]);

                            }

                            if (-3 > 0) break;
                        }
                        return;
                    }
                    String[] stringArray = new String[lIIIlllIII[1]];
                    stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[299]];
                    if (z.llllIIIIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray182 = new String[lIIIlllIII[1]];
                        stringArray182[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[300]];
                        if (z.llllIIIIIlII(Inventory.contains((String[])stringArray182) ? 1 : 0)) {
                            String[] stringArray183 = new String[lIIIlllIII[1]];
                            stringArray183[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[301]];
                            if (z.llllIIIIIlII(Inventory.contains((String[])stringArray183) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[302]];
                                int[] nArray = new int[lIIIlllIII[1]];
                                nArray[z.lIIIlllIII[0]] = lIIIlllIII[303];
                                lllIlIllIII = TileObjects.getNearest((int[])nArray);
                                int[] nArray56 = new int[lIIIlllIII[1]];
                                nArray56[z.lIIIlllIII[0]] = lIIIlllIII[304];
                                lllIlIlIlll = Inventory.getFirst((int[])nArray56);
                                if (z.llllIIIIIlll(lllIlIllIII) && z.llllIIIIIlll(lllIlIlIlll)) {
                                    lllIlIlIlll.useOn((TileObject)lllIlIllIII);
                                    Time.sleepTicks((int)lIIIlllIII[5]);

                                }
                            }
                        }
                    }
                }
                if (z.llllIIIIlIlI(e.j(lIIIlllIII[10]), lIIIlllIII[13])) {
                    AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[305]];
                    int[] nArray = new int[lIIIlllIII[1]];
                    nArray[z.lIIIlllIII[0]] = lIIIlllIII[306];
                    lllIlIllIII = TileObjects.getNearest((int[])nArray);
                    int[] nArray57 = new int[lIIIlllIII[1]];
                    nArray57[z.lIIIlllIII[0]] = lIIIlllIII[307];
                    lllIlIlIlll = Inventory.getFirst((int[])nArray57);
                    if (z.llllIIIIIIll(ck, lIIIlllIII[1])) {
                        U.kf += lIIIlllIII[1];
                        U.o(AccBuilderRogues.m);
                        ck += lIIIlllIII[1];
                        U.kf = lIIIlllIII[0];
                        cl = lIIIlllIII[0];
                    }
                    if (z.llllIIIIIlll(lllIlIllIII) && z.llllIIIIIlll(lllIlIlIlll)) {
                        lllIlIlIlll.useOn((TileObject)lllIlIllIII);
                        Time.sleepTicks((int)lIIIlllIII[7]);

                        g.a(gz);
                    }
                }
                if (!z.llllIIIIlIlI(e.j(lIIIlllIII[10]), lIIIlllIII[19])) break block254;
                String[] stringArray = new String[lIIIlllIII[1]];
                stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[308]];
                if (!z.llllIIIIllII(TileObjects.getNearest((String[])stringArray))) break block289;
                String[] stringArray184 = new String[lIIIlllIII[1]];
                stringArray184[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[309]];
                if (!z.llllIIIIIlll(TileObjects.getNearest((String[])stringArray184))) break block254;
            }
            String[] stringArray = new String[lIIIlllIII[1]];
            stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[310]];
            if (z.llllIIIIIlll(TileObjects.getNearest((String[])stringArray))) {
                AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[311]];
                if (z.llllIIIIIlII(Equipment.contains((int[])f.aN) ? 1 : 0) && z.llllIIIIIIlI(Inventory.contains((int[])f.aN) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.aN).interact(lIIIllIIIl[lIIIlllIII[312]]);
                    Time.sleepTicks((int)lIIIlllIII[6]);

                }
                if (z.llllIIIIIIlI(Equipment.contains((int[])f.aN) ? 1 : 0)) {
                    Equipment.getFirst((int[])f.aN).interact(lIIIllIIIl[lIIIlllIII[313]]);
                    Time.sleepTicks((int)lIIIlllIII[6]);

                }
            }
        }
    }

    static {
        z.llllIIIIIIIl();
        z.lllIlllIllll();
        fA = lIIIlllIII[10];
        fD = lIIIlllIII[5];
        fE = lIIIlllIII[6];
        gn = lIIIlllIII[303];
        go = lIIIlllIII[306];
        fF = lIIIlllIII[7];
        fC = lIIIlllIII[3];
        gm = lIIIlllIII[145];
        fB = lIIIlllIII[1];
        fI = lIIIlllIII[19];
        gl = lIIIlllIII[49];
        fH = lIIIlllIII[13];
        gp = lIIIlllIII[143];
        fG = lIIIlllIII[11];
        int[] nArray = new int[lIIIlllIII[17]];
        nArray[z.lIIIlllIII[0]] = lIIIlllIII[318];
        nArray[z.lIIIlllIII[1]] = lIIIlllIII[333];
        nArray[z.lIIIlllIII[3]] = lIIIlllIII[334];
        nArray[z.lIIIlllIII[5]] = lIIIlllIII[335];
        nArray[z.lIIIlllIII[6]] = lIIIlllIII[336];
        nArray[z.lIIIlllIII[7]] = lIIIlllIII[337];
        nArray[z.lIIIlllIII[11]] = lIIIlllIII[338];
        nArray[z.lIIIlllIII[9]] = lIIIlllIII[339];
        nArray[z.lIIIlllIII[13]] = lIIIlllIII[339];
        fq = nArray;
        int[] nArray2 = new int[lIIIlllIII[6]];
        nArray2[z.lIIIlllIII[0]] = lIIIlllIII[316];
        nArray2[z.lIIIlllIII[1]] = lIIIlllIII[340];
        nArray2[z.lIIIlllIII[3]] = lIIIlllIII[341];
        nArray2[z.lIIIlllIII[5]] = lIIIlllIII[342];
        fr = nArray2;
        int[] nArray3 = new int[lIIIlllIII[17]];
        nArray3[z.lIIIlllIII[0]] = lIIIlllIII[24];
        nArray3[z.lIIIlllIII[1]] = lIIIlllIII[343];
        nArray3[z.lIIIlllIII[3]] = lIIIlllIII[344];
        nArray3[z.lIIIlllIII[5]] = lIIIlllIII[345];
        nArray3[z.lIIIlllIII[6]] = lIIIlllIII[346];
        nArray3[z.lIIIlllIII[7]] = lIIIlllIII[347];
        nArray3[z.lIIIlllIII[11]] = lIIIlllIII[348];
        nArray3[z.lIIIlllIII[9]] = lIIIlllIII[349];
        nArray3[z.lIIIlllIII[13]] = lIIIlllIII[348];
        fs = nArray3;
        ft = new WorldArea(lIIIlllIII[344], lIIIlllIII[350], lIIIlllIII[26], lIIIlllIII[25], lIIIlllIII[0]);
        fu = new WorldPoint(lIIIlllIII[351], lIIIlllIII[352], lIIIlllIII[0]);
        fv = new WorldPoint(lIIIlllIII[351], lIIIlllIII[353], lIIIlllIII[0]);
        fw = new WorldPoint(lIIIlllIII[351], lIIIlllIII[354], lIIIlllIII[0]);
        fx = new WorldPoint(lIIIlllIII[346], lIIIlllIII[354], lIIIlllIII[0]);
        fy = new WorldPoint(lIIIlllIII[346], lIIIlllIII[353], lIIIlllIII[0]);
        fz = new WorldPoint(lIIIlllIII[346], lIIIlllIII[352], lIIIlllIII[0]);
        WorldPoint[] worldPointArray = new WorldPoint[lIIIlllIII[7]];
        worldPointArray[z.lIIIlllIII[0]] = new WorldPoint(lIIIlllIII[355], lIIIlllIII[356], lIIIlllIII[0]);
        worldPointArray[z.lIIIlllIII[1]] = new WorldPoint(lIIIlllIII[357], lIIIlllIII[358], lIIIlllIII[0]);
        worldPointArray[z.lIIIlllIII[3]] = new WorldPoint(lIIIlllIII[359], lIIIlllIII[360], lIIIlllIII[0]);
        worldPointArray[z.lIIIlllIII[5]] = new WorldPoint(lIIIlllIII[361], lIIIlllIII[362], lIIIlllIII[0]);
        worldPointArray[z.lIIIlllIII[6]] = new WorldPoint(lIIIlllIII[363], lIIIlllIII[364], lIIIlllIII[0]);
        fJ = worldPointArray;
        fK = new WorldPoint(lIIIlllIII[365], lIIIlllIII[53], lIIIlllIII[0]);
        fL = new WorldPoint(lIIIlllIII[366], lIIIlllIII[367], lIIIlllIII[0]);
        fM = new WorldPoint(lIIIlllIII[368], lIIIlllIII[369], lIIIlllIII[0]);
        fN = new WorldPoint(lIIIlllIII[370], lIIIlllIII[371], lIIIlllIII[0]);
        fO = new WorldPoint(lIIIlllIII[372], lIIIlllIII[373], lIIIlllIII[0]);
        fP = new WorldPoint(lIIIlllIII[374], lIIIlllIII[375], lIIIlllIII[0]);
        fQ = new WorldPoint(lIIIlllIII[376], lIIIlllIII[377], lIIIlllIII[0]);
        fR = new WorldPoint(lIIIlllIII[374], lIIIlllIII[378], lIIIlllIII[0]);
        fS = new WorldPoint(lIIIlllIII[379], lIIIlllIII[380], lIIIlllIII[0]);
        fT = new WorldPoint(lIIIlllIII[379], lIIIlllIII[381], lIIIlllIII[1]);
        fU = new WorldPoint(lIIIlllIII[363], lIIIlllIII[382], lIIIlllIII[0]);
        fV = new WorldPoint(lIIIlllIII[383], lIIIlllIII[384], lIIIlllIII[0]);
        fW = new WorldPoint(lIIIlllIII[365], lIIIlllIII[385], lIIIlllIII[0]);
        fX = new WorldPoint(lIIIlllIII[386], lIIIlllIII[387], lIIIlllIII[0]);
        fY = new WorldPoint(lIIIlllIII[388], lIIIlllIII[389], lIIIlllIII[0]);
        fZ = new WorldPoint(lIIIlllIII[390], lIIIlllIII[391], lIIIlllIII[0]);
        ga = new WorldPoint(lIIIlllIII[392], lIIIlllIII[393], lIIIlllIII[0]);
        gb = new WorldPoint(lIIIlllIII[394], lIIIlllIII[395], lIIIlllIII[0]);
        gc = new WorldPoint(lIIIlllIII[396], lIIIlllIII[397], lIIIlllIII[0]);
        gd = new WorldPoint(lIIIlllIII[398], lIIIlllIII[399], lIIIlllIII[0]);
        ge = new WorldPoint(lIIIlllIII[349], lIIIlllIII[350], lIIIlllIII[0]);
        gf = new WorldPoint(lIIIlllIII[400], lIIIlllIII[352], lIIIlllIII[0]);
        gg = new WorldPoint(lIIIlllIII[400], lIIIlllIII[353], lIIIlllIII[0]);
        gh = new WorldPoint(lIIIlllIII[400], lIIIlllIII[354], lIIIlllIII[0]);
        gi = new WorldPoint(lIIIlllIII[398], lIIIlllIII[354], lIIIlllIII[0]);
        gj = new WorldPoint(lIIIlllIII[398], lIIIlllIII[353], lIIIlllIII[0]);
        gk = new WorldPoint(lIIIlllIII[398], lIIIlllIII[352], lIIIlllIII[0]);
        bv = new ArrayList<d>();
        gq = new WorldArea(new WorldPoint(lIIIlllIII[379], lIIIlllIII[53], lIIIlllIII[0]), new WorldPoint(lIIIlllIII[368], lIIIlllIII[401], lIIIlllIII[0]));
        gr = lIIIlllIII[40];
        gs = lIIIlllIII[41];
        gt = lIIIlllIII[0];
        gu = lIIIlllIII[0];
        gv = lIIIlllIII[0];
        gw = lIIIlllIII[0];
        gx = lIIIlllIII[0];
        gy = lIIIlllIII[0];
        String[] stringArray = new String[lIIIlllIII[5]];
        stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[307]];
        stringArray[z.lIIIlllIII[1]] = lIIIllIIIl[lIIIlllIII[402]];
        stringArray[z.lIIIlllIII[3]] = lIIIllIIIl[lIIIlllIII[143]];
        gz = stringArray;
        gA = lIIIllIIIl[lIIIlllIII[403]];
        gB = lIIIllIIIl[lIIIlllIII[404]];
        gC = lIIIllIIIl[lIIIlllIII[405]];
        gD = new WorldPoint(lIIIlllIII[349], lIIIlllIII[406], lIIIlllIII[0]);
        gE = new WorldArea(lIIIlllIII[407], lIIIlllIII[408], lIIIlllIII[10], lIIIlllIII[84], lIIIlllIII[0]);
        gF = new WorldPoint(lIIIlllIII[409], lIIIlllIII[410], lIIIlllIII[0]);
        gG = new WorldArea(lIIIlllIII[411], lIIIlllIII[412], lIIIlllIII[82], lIIIlllIII[90], lIIIlllIII[0]);
        bT = lIIIlllIII[0];
    }

    private static boolean llllIIIIllII(Object object) {
        return object == null;
    }

    private static boolean llllIIIIIlll(Object object) {
        return object != null;
    }

    private static boolean llllIIIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIIIIlIII(int n2) {
        return n2 > 0;
    }

    @Override
    public String U() {
        return lIIIllIIIl[lIIIlllIII[325]];
    }
}

