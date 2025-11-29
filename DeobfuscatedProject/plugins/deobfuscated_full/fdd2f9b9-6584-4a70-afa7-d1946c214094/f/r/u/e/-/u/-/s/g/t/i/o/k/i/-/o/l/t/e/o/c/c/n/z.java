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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.A;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.U;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.i;
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

public class z
implements G {
    static final /* synthetic */ int fF;
    private static final /* synthetic */ WorldPoint fZ;
    static final /* synthetic */ int fC;
    private static final /* synthetic */ WorldPoint gh;
    private static final /* synthetic */ WorldPoint fN;
    static final /* synthetic */ int fE;
    private static final /* synthetic */ WorldPoint fU;
    private static final /* synthetic */ WorldPoint fP;
    public static final /* synthetic */ WorldPoint fz;
    static /* synthetic */ WorldPoint gF;
    public static final /* synthetic */ int[] fs;
    static /* synthetic */ WorldPoint gD;
    private static final /* synthetic */ WorldPoint gf;
    public static /* synthetic */ int gr;
    static final /* synthetic */ WorldPoint[] fJ;
    private static final /* synthetic */ WorldPoint fQ;
    private static final /* synthetic */ WorldPoint gj;
    private static final /* synthetic */ WorldPoint fR;
    static final /* synthetic */ int fB;
    static /* synthetic */ int bT;
    private static final /* synthetic */ WorldPoint ge;
    static /* synthetic */ int gx;
    public static /* synthetic */ int gs;
    private static final /* synthetic */ WorldPoint gg;
    private static final /* synthetic */ WorldPoint fM;
    static /* synthetic */ int gt;
    private static final /* synthetic */ WorldPoint fX;
    private static final /* synthetic */ WorldPoint gd;
    public static final /* synthetic */ int[] fr;
    static /* synthetic */ WorldArea gE;
    private static final /* synthetic */ int gm;
    public static final /* synthetic */ WorldPoint fv;
    static final /* synthetic */ int fG;
    private static final /* synthetic */ int gl;
    private static final /* synthetic */ int gn;
    public static final /* synthetic */ WorldPoint fw;
    private static final /* synthetic */ WorldPoint fS;
    private static final /* synthetic */ WorldPoint fK;
    static /* synthetic */ String gB;
    private static final /* synthetic */ WorldPoint fY;
    public static /* synthetic */ List<d> bv;
    private static final /* synthetic */ WorldPoint gc;
    public static final /* synthetic */ WorldPoint fx;
    static /* synthetic */ int gv;
    private static final /* synthetic */ WorldPoint fO;
    public static final /* synthetic */ int[] fq;
    static /* synthetic */ WorldArea gG;
    public static final /* synthetic */ WorldPoint fu;
    static /* synthetic */ int ck;
    static final /* synthetic */ int fI;
    static /* synthetic */ String gC;
    static final /* synthetic */ int fA;
    public static /* synthetic */ WorldArea gq;
    static /* synthetic */ String[] gz;
    public static final /* synthetic */ WorldPoint fy;
    static /* synthetic */ int gy;
    static final /* synthetic */ int fH;
    private static final /* synthetic */ WorldPoint gb;
    static /* synthetic */ String gA;
    private static final /* synthetic */ WorldPoint fL;
    private static final /* synthetic */ WorldPoint ga;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ WorldPoint fW;
    public static final /* synthetic */ WorldArea ft;
    private static final /* synthetic */ int go;
    private static final /* synthetic */ WorldPoint fV;
    static /* synthetic */ int gu;
    static final /* synthetic */ int fD;
    static /* synthetic */ int gw;
    private static /* synthetic */ String[] lIIIllIIIl;
    private static final /* synthetic */ WorldPoint gk;
    private static /* synthetic */ int[] lIIIlllIII;
    static /* synthetic */ boolean cl;
    private static final /* synthetic */ WorldPoint gi;
    private static final /* synthetic */ int gp;
    private static final /* synthetic */ WorldPoint fT;

    private static boolean llllIIIIIIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public int T() {
        try {
            z.bn();
            0;
        }
        catch (Exception lllIlIlIIIl) {
            lllIlIlIIIl.printStackTrace();
        }
        
        }
        return lIIIlllIII[121];
    }

    private static void lllIlllIllll() {
        lIIIllIIIl = new String[lIIIlllIII[413]];
        z.lIIIllIIIl[z.lIIIlllIII[0]] = z."Buying items";
        z.lIIIllIIIl[z.lIIIlllIII[1]] = z."Finished buying items, switching back to questing";
        z.lIIIllIIIl[z.lIIIlllIII[3]] = z."Drink";
        z.lIIIllIIIl[z.lIIIlllIII[5]] = z."Shark";
        z.lIIIllIIIl[z.lIIIlllIII[6]] = z."Shark";
        z.lIIIllIIIl[z.lIIIlllIII[7]] = z."Eat";
        z.lIIIllIIIl[z.lIIIlllIII[11]] = z."Navigating to bank";
        z.lIIIllIIIl[z.lIIIlllIII[9]] = z."Opening bank";
        z.lIIIllIIIl[z.lIIIlllIII[13]] = z."Handling banking";
        z.lIIIllIIIl[z.lIIIlllIII[17]] = z."We are missing runessupplies, switching to BUYING";
        z.lIIIllIIIl[z.lIIIlllIII[19]] = z."Rope";
        z.lIIIllIIIl[z.lIIIlllIII[21]] = z."Shark";
        z.lIIIllIIIl[z.lIIIlllIII[22]] = z."We are missing supplies, switching to BUYING";
        z.lIIIllIIIl[z.lIIIlllIII[23]] = z."Rope";
        z.lIIIllIIIl[z.lIIIlllIII[4]] = z."Shark";
        z.lIIIllIIIl[z.lIIIlllIII[26]] = z."Drink";
        z.lIIIllIIIl[z.lIIIlllIII[27]] = z."Nav to start";
        z.lIIIllIIIl[z.lIIIlllIII[28]] = z."Chatting";
        z.lIIIllIIIl[z.lIIIlllIII[25]] = z."Nav to boy";
        z.lIIIllIIIl[z.lIIIlllIII[29]] = z."Chat boy";
        z.lIIIllIIIl[z.lIIIlllIII[30]] = z."Nav to bookcase";
        z.lIIIllIIIl[z.lIIIlllIII[32]] = z."Book on baxtorian";
        z.lIIIllIIIl[z.lIIIlllIII[33]] = z."Searching bookcase";
        z.lIIIllIIIl[z.lIIIlllIII[34]] = z."Search";
        z.lIIIllIIIl[z.lIIIlllIII[35]] = z."Book on baxtorian";
        z.lIIIllIIIl[z.lIIIlllIII[37]] = z."Book on baxtorian";
        z.lIIIllIIIl[z.lIIIlllIII[38]] = z."Reading";
        z.lIIIllIIIl[z.lIIIlllIII[39]] = z."Read";
        z.lIIIllIIIl[z.lIIIlllIII[42]] = z."Tele to CW";
        z.lIIIllIIIl[z.lIIIlllIII[43]] = z."Wear";
        z.lIIIllIIIl[z.lIIIlllIII[44]] = z."Castle Wars";
        z.lIIIllIIIl[z.lIIIlllIII[45]] = z."Nav to maze ladder";
        z.lIIIllIIIl[z.lIIIlllIII[46]] = z."Fountain";
        z.lIIIllIIIl[z.lIIIlllIII[48]] = z."Climb-down";
        z.lIIIllIIIl[z.lIIIlllIII[50]] = z."nav to box";
        z.lIIIllIIIl[z.lIIIlllIII[51]] = z."Searching crate";
        z.lIIIllIIIl[z.lIIIlllIII[52]] = z."Search";
        z.lIIIllIIIl[z.lIIIlllIII[54]] = z."Nav to cage";
        z.lIIIllIIIl[z.lIIIlllIII[56]] = z."Entering cage";
        z.lIIIllIIIl[z.lIIIlllIII[57]] = z."Chat npc";
        z.lIIIllIIIl[z.lIIIlllIII[58]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[59]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[60]] = z."Nav to tombstone";
        z.lIIIllIIIl[z.lIIIlllIII[61]] = z."Wear";
        z.lIIIllIIIl[z.lIIIlllIII[62]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[63]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[64]] = z."Entering tomb";
        z.lIIIllIIIl[z.lIIIlllIII[67]] = z."Stalagmite";
        z.lIIIllIIIl[z.lIIIlllIII[68]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[69]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[2]] = z."Getting ammy";
        z.lIIIllIIIl[z.lIIIlllIII[71]] = z."Open";
        z.lIIIllIIIl[z.lIIIlllIII[73]] = z."Search";
        z.lIIIllIIIl[z.lIIIlllIII[74]] = z."Stalagmite";
        z.lIIIllIIIl[z.lIIIlllIII[75]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[76]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[77]] = z."Getting ammy";
        z.lIIIllIIIl[z.lIIIlllIII[78]] = z."Open";
        z.lIIIllIIIl[z.lIIIlllIII[79]] = z."Search";
        z.lIIIllIIIl[z.lIIIlllIII[80]] = z."Stalagmite";
        z.lIIIllIIIl[z.lIIIlllIII[82]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[83]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[84]] = z."Getting ashes";
        z.lIIIllIIIl[z.lIIIlllIII[85]] = z."Search";
        z.lIIIllIIIl[z.lIIIlllIII[86]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[10]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[87]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[88]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[89]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[90]] = z."Nav to bank";
        z.lIIIllIIIl[z.lIIIlllIII[91]] = z."Wear";
        z.lIIIllIIIl[z.lIIIlllIII[92]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[93]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[94]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[95]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[96]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[97]] = z."Opening bank";
        z.lIIIllIIIl[z.lIIIlllIII[98]] = z."Withdrawing runes";
        z.lIIIllIIIl[z.lIIIlllIII[99]] = z."Vial";
        z.lIIIllIIIl[z.lIIIlllIII[100]] = z."Shark";
        z.lIIIllIIIl[z.lIIIlllIII[101]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[102]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[103]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[104]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[105]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[106]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[107]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[108]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[109]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[110]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[111]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[112]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[113]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[114]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[115]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[116]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[117]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[118]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[119]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[120]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[121]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[122]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[123]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[124]] = z."Nav to door entrance";
        z.lIIIllIIIl[z.lIIIlllIII[125]] = z."Rope";
        z.lIIIllIIIl[z.lIIIlllIII[126]] = z."Rock";
        z.lIIIllIIIl[z.lIIIlllIII[127]] = z."Roping rock";
        z.lIIIllIIIl[z.lIIIlllIII[129]] = z."Rope";
        z.lIIIllIIIl[z.lIIIlllIII[131]] = z."Roping tree";
        z.lIIIllIIIl[z.lIIIlllIII[132]] = z."Door";
        z.lIIIllIIIl[z.lIIIlllIII[133]] = z."Entering door";
        z.lIIIllIIIl[z.lIIIlllIII[134]] = z."Open";
        z.lIIIllIIIl[z.lIIIlllIII[135]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[136]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[137]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[138]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[139]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[140]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[141]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[142]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[144]] = z."Nav to key and get";
        z.lIIIllIIIl[z.lIIIlllIII[146]] = z."Search";
        z.lIIIllIIIl[z.lIIIlllIII[147]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[148]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[149]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[150]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[151]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[152]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[153]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[154]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[155]] = z."Nav to last room";
        z.lIIIllIIIl[z.lIIIlllIII[156]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[157]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[158]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[159]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[160]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[161]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[162]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[163]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[164]] = z."Door";
        z.lIIIllIIIl[z.lIIIlllIII[166]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[167]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[168]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[169]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[170]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[171]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[172]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[173]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[174]] = z."Door";
        z.lIIIllIIIl[z.lIIIlllIII[175]] = z."Open";
        z.lIIIllIIIl[z.lIIIlllIII[176]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[177]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[178]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[179]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[180]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[181]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[182]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[183]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[184]] = z."Nav to SE Pillar";
        z.lIIIllIIIl[z.lIIIlllIII[185]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[186]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[187]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[188]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[189]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[190]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[191]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[192]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[193]] = z."Using runes";
        z.lIIIllIIIl[z.lIIIlllIII[194]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[195]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[196]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[197]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[198]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[199]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[201]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[202]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[203]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[204]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[205]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[206]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[207]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[208]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[209]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[210]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[211]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[212]] = z."Using runes";
        z.lIIIllIIIl[z.lIIIlllIII[213]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[214]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[215]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[216]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[217]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[218]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[219]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[220]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[221]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[222]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[223]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[224]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[225]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[226]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[227]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[228]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[229]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[230]] = z."Using runes";
        z.lIIIllIIIl[z.lIIIlllIII[231]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[232]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[233]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[234]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[235]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[236]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[237]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[238]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[239]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[240]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[241]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[242]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[243]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[244]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[245]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[246]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[247]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[248]] = z."Using runes";
        z.lIIIllIIIl[z.lIIIlllIII[249]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[250]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[251]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[252]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[8]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[253]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[254]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[255]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[256]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[257]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[258]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[259]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[260]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[261]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[262]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[263]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[264]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[265]] = z."Using runes";
        z.lIIIllIIIl[z.lIIIlllIII[266]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[267]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[268]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[269]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[270]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[271]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[272]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[273]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[274]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[275]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[276]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[277]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[278]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[279]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[280]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[281]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[282]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[283]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[284]] = z."Glarial's amulet";
        z.lIIIllIIIl[z.lIIIlllIII[285]] = z."Glarial's urn";
        z.lIIIllIIIl[z.lIIIlllIII[286]] = z."Using runes";
        z.lIIIllIIIl[z.lIIIlllIII[287]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[288]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[289]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[290]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[291]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[292]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[293]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[294]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[295]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[296]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[297]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[298]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[299]] = z."Air rune";
        z.lIIIllIIIl[z.lIIIlllIII[300]] = z."Earth rune";
        z.lIIIllIIIl[z.lIIIlllIII[301]] = z."Water rune";
        z.lIIIllIIIl[z.lIIIlllIII[302]] = z."Putting neck on statue";
        z.lIIIllIIIl[z.lIIIlllIII[305]] = z."Putting ashes inside";
        z.lIIIllIIIl[z.lIIIlllIII[308]] = z."Chalice";
        z.lIIIllIIIl[z.lIIIlllIII[309]] = z."Statue of Glarial";
        z.lIIIllIIIl[z.lIIIlllIII[310]] = z."Pillar";
        z.lIIIllIIIl[z.lIIIlllIII[311]] = z."Teleporting to CW";
        z.lIIIllIIIl[z.lIIIlllIII[312]] = z."Wear";
        z.lIIIllIIIl[z.lIIIlllIII[313]] = z."Castle Wars";
        z.lIIIllIIIl[z.lIIIlllIII[314]] = z."Rope";
        z.lIIIllIIIl[z.lIIIlllIII[325]] = z."Waterfall quest";
        z.lIIIllIIIl[z.lIIIlllIII[326]] = z."ring of wealth (";
        z.lIIIllIIIl[z.lIIIlllIII[327]] = z."Stalagmite";
        z.lIIIllIIIl[z.lIIIlllIII[328]] = z."Games";
        z.lIIIllIIIl[z.lIIIlllIII[329]] = z."Games";
        z.lIIIllIIIl[z.lIIIlllIII[330]] = z."Games";
        z.lIIIllIIIl[z.lIIIlllIII[331]] = z."dueling";
        z.lIIIllIIIl[z.lIIIlllIII[332]] = z."dueling";
        z.lIIIllIIIl[z.lIIIlllIII[40]] = z."dueling";
        z.lIIIllIIIl[z.lIIIlllIII[41]] = z."dueling";
        z.lIIIllIIIl[z.lIIIlllIII[304]] = z."dueling";
        z.lIIIllIIIl[z.lIIIlllIII[307]] = z."How can I help?";
        z.lIIIllIIIl[z.lIIIlllIII[402]] = z."I'm always happy to help a cook in distress.";
        z.lIIIllIIIl[z.lIIIlllIII[143]] = z."Yes.";
        z.lIIIllIIIl[z.lIIIlllIII[403]] = z."Golrie";
        z.lIIIllIIIl[z.lIIIlllIII[404]] = z."Hudon";
        z.lIIIllIIIl[z.lIIIlllIII[405]] = z."Almera";
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
            0;
            if (-1 < 2) return n2 != 0;
            return false;
        }
        n2 = lIIIlllIII[0];
        return n2 != 0;
    }

    private static boolean llllIIIIlIll(int n2, int n3) {
        return n2 != n3;
    }

    private static String lllIlllIIlIl(String lllIIllIIIl, String lllIIlIlllI) {
        try {
            SecretKeySpec lllIIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIllIIll = Cipher.getInstance("Blowfish");
            lllIIllIIll.init(lIIIlllIII[3], lllIIllIlII);
            return new String(lllIIllIIll.doFinal(Base64.getDecoder().decode(lllIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIllIIlI) {
            lllIIllIIlI.printStackTrace();
            return null;
        }
    }

    public static void af() {
        d lllIlIlIIll;
        Object lllIlIlIlII;
        block20: {
            block19: {
                int[] nArray = new int[lIIIlllIII[1]];
                nArray[z.lIIIlllIII[0]] = lIIIlllIII[20];
                if (z.llllIIIIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIIIlllIII[20], lIIIlllIII[44], lIIIlllIII[315]);
                    bv.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIIIlllIII[1]];
                nArray2[z.lIIIlllIII[0]] = lIIIlllIII[316];
                if (z.llllIIIIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllIlIlIlII = new d(lIIIlllIII[316], lIIIlllIII[7], i.bq);
                    bv.add((d)lllIlIlIlII);
                    0;
                }
                int[] nArray3 = new int[lIIIlllIII[1]];
                nArray3[z.lIIIlllIII[0]] = lIIIlllIII[14];
                if (z.llllIIIIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIlllIII[1]];
                    nArray4[z.lIIIlllIII[0]] = lIIIlllIII[14];
                    if (z.llllIIIIIIll(Bank.getFirst((int[])nArray4).getQuantity(), lIIIlllIII[11])) {
                        lllIlIlIlII = new d(lIIIlllIII[14], lIIIlllIII[317], lIIIlllIII[19]);
                        bv.add((d)lllIlIlIlII);
                        0;
                    }
                }
                int[] nArray5 = new int[lIIIlllIII[1]];
                nArray5[z.lIIIlllIII[0]] = lIIIlllIII[15];
                if (z.llllIIIIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIlllIII[1]];
                    nArray6[z.lIIIlllIII[0]] = lIIIlllIII[15];
                    if (z.llllIIIIIIll(Bank.getFirst((int[])nArray6).getQuantity(), lIIIlllIII[11])) {
                        lllIlIlIlII = new d(lIIIlllIII[15], lIIIlllIII[317], lIIIlllIII[19]);
                        bv.add((d)lllIlIlIlII);
                        0;
                    }
                }
                int[] nArray7 = new int[lIIIlllIII[1]];
                nArray7[z.lIIIlllIII[0]] = lIIIlllIII[16];
                if (z.llllIIIIIIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIlllIII[1]];
                    nArray8[z.lIIIlllIII[0]] = lIIIlllIII[16];
                    if (z.llllIIIIIIll(Bank.getFirst((int[])nArray8).getQuantity(), lIIIlllIII[11])) {
                        lllIlIlIlII = new d(lIIIlllIII[16], lIIIlllIII[317], lIIIlllIII[19]);
                        bv.add((d)lllIlIlIlII);
                        0;
                    }
                }
                int[] nArray9 = new int[lIIIlllIII[1]];
                nArray9[z.lIIIlllIII[0]] = lIIIlllIII[14];
                if (z.llllIIIIIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    lllIlIlIlII = new d(lIIIlllIII[14], lIIIlllIII[317], lIIIlllIII[19]);
                    bv.add((d)lllIlIlIlII);
                    0;
                }
                int[] nArray10 = new int[lIIIlllIII[1]];
                nArray10[z.lIIIlllIII[0]] = lIIIlllIII[15];
                if (z.llllIIIIIlII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    lllIlIlIlII = new d(lIIIlllIII[15], lIIIlllIII[317], lIIIlllIII[19]);
                    bv.add((d)lllIlIlIlII);
                    0;
                }
                int[] nArray11 = new int[lIIIlllIII[1]];
                nArray11[z.lIIIlllIII[0]] = lIIIlllIII[16];
                if (z.llllIIIIIlII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    lllIlIlIlII = new d(lIIIlllIII[16], lIIIlllIII[317], lIIIlllIII[19]);
                    bv.add((d)lllIlIlIlII);
                    0;
                }
                int[] nArray12 = new int[lIIIlllIII[1]];
                nArray12[z.lIIIlllIII[0]] = lIIIlllIII[14];
                if (z.llllIIIIIlII(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    lllIlIlIlII = new d(lIIIlllIII[14], lIIIlllIII[317], lIIIlllIII[19]);
                    bv.add((d)lllIlIlIlII);
                    0;
                }
                int[] nArray13 = new int[lIIIlllIII[1]];
                nArray13[z.lIIIlllIII[0]] = lIIIlllIII[318];
                if (z.llllIIIIIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                    lllIlIlIlII = new d(lIIIlllIII[318], lIIIlllIII[7], lIIIlllIII[315]);
                    bv.add((d)lllIlIlIlII);
                    0;
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
            lllIlIlIlII = new d(lIIIlllIII[24], lIIIlllIII[19], lIIIlllIII[319]);
            bv.add((d)lllIlIlIlII);
            0;
        }
        int[] nArray = new int[lIIIlllIII[1]];
        nArray[z.lIIIlllIII[0]] = lIIIlllIII[18];
        if (z.llllIIIIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllIlIlIlII = new d(lIIIlllIII[18], lIIIlllIII[7], lIIIlllIII[320]);
            bv.add((d)lllIlIlIlII);
            0;
        }
        if (z.llllIIIIIlII(Bank.contains((Predicate)(lllIlIlIlII = item -> item.getName().toLowerCase().contains(lIIIllIIIl[lIIIlllIII[326]]))) ? 1 : 0)) {
            lllIlIlIIll = new d(lIIIlllIII[321], lIIIlllIII[25], lIIIlllIII[322]);
            bv.add(lllIlIlIIll);
            0;
        }
        int[] nArray17 = new int[lIIIlllIII[1]];
        nArray17[z.lIIIlllIII[0]] = lIIIlllIII[323];
        if (z.llllIIIIIlII(Bank.contains((int[])nArray17) ? 1 : 0)) {
            lllIlIlIIll = new d(lIIIlllIII[323], lIIIlllIII[58], lIIIlllIII[324]);
            bv.add(lllIlIlIIll);
            0;
        }
    }

    private static void llllIIIIIIIl() {
        lIIIlllIII = new int[414];
        z.lIIIlllIII[0] = (0xE8 ^ 0xC7) & ~(0x67 ^ 0x48);
        z.lIIIlllIII[1] = 1;
        z.lIIIlllIII[2] = 0x6A ^ 0x58;
        z.lIIIlllIII[3] = 2;
        z.lIIIlllIII[4] = 198 + 94 - 170 + 84 ^ 130 + 77 - 142 + 127;
        z.lIIIlllIII[5] = 3;
        z.lIIIlllIII[6] = 0x49 ^ 0x4D;
        z.lIIIlllIII[7] = 84 + 56 - 51 + 62 ^ 46 + 142 - 147 + 105;
        z.lIIIlllIII[8] = (9 ^ 0x13) + (0xC8 ^ 0x9B) - (0x10 ^ 0xC) + (42 + 71 - 52 + 84);
        z.lIIIlllIII[9] = 9 ^ 0x24 ^ (0x2C ^ 6);
        z.lIIIlllIII[10] = 0xD3 ^ 0x99 ^ (0x1D ^ 0x16);
        z.lIIIlllIII[11] = 4 ^ 0x19 ^ (0x6A ^ 0x71);
        z.lIIIlllIII[12] = -(0xFFFFEEFF & 0x7D77) & (0xFFFFFFFE & Short.MAX_VALUE);
        z.lIIIlllIII[13] = 0x7C ^ 0x74;
        z.lIIIlllIII[14] = -(0xFFFFF7B1 & 0x79DF) & (0xFFFFFBBB & 0x77FF);
        z.lIIIlllIII[15] = 0xFFFFA76D & 0x5ABE;
        z.lIIIlllIII[16] = 0xFFFF9BBF & 0x666D;
        z.lIIIlllIII[17] = 0xDF ^ 0xB8 ^ (0xB ^ 0x65);
        z.lIIIlllIII[18] = 0xFFFFD3BF & 0x2FFA;
        z.lIIIlllIII[19] = 0x2F ^ 0x25;
        z.lIIIlllIII[20] = 0xFFFFF18F & 0xFF1;
        z.lIIIlllIII[21] = 0x71 ^ 0x7A;
        z.lIIIlllIII[22] = 0xB1 ^ 0x8C ^ (0x22 ^ 0x13);
        z.lIIIlllIII[23] = 0x29 ^ 0x50 ^ (0xFC ^ 0x88);
        z.lIIIlllIII[24] = 0xFFFFA9F9 & 0x5FFE;
        z.lIIIlllIII[25] = 148 + 118 - 168 + 66 ^ 49 + 22 - -108 + 3;
        z.lIIIlllIII[26] = 0x51 ^ 0x5E;
        z.lIIIlllIII[27] = 0xBA ^ 0xAA;
        z.lIIIlllIII[28] = 3 ^ (0x76 ^ 0x64);
        z.lIIIlllIII[29] = 0x96 ^ 0x85;
        z.lIIIlllIII[30] = 0x66 ^ 0x72;
        z.lIIIlllIII[31] = -(0xFFFFBB79 & 0x7CBF) & (0xFFFFFFFD & 0x3FFF);
        z.lIIIlllIII[32] = 0xA6 ^ 0xB3;
        z.lIIIlllIII[33] = 0xB7 ^ 0xA1;
        z.lIIIlllIII[34] = 168 + 113 - 206 + 139 ^ 168 + 177 - 183 + 31;
        z.lIIIlllIII[35] = 100 + 52 - 54 + 75 ^ 177 + 136 - 261 + 129;
        z.lIIIlllIII[36] = -1;
        z.lIIIlllIII[37] = 0xBC ^ 0xA5;
        z.lIIIlllIII[38] = 0xBD ^ 0x86 ^ (0x49 ^ 0x68);
        z.lIIIlllIII[39] = 156 + 85 - 79 + 0 ^ 50 + 125 - 86 + 96;
        z.lIIIlllIII[40] = -(0xFFFFFEDB & 0x1DE7) & (0xFFFF9FEF & 0x7DF7);
        z.lIIIlllIII[41] = 0xFFFFBD2F & 0x43F6;
        z.lIIIlllIII[42] = 0x7F ^ 0x63;
        z.lIIIlllIII[43] = 0x14 ^ 9;
        z.lIIIlllIII[44] = 0x6D ^ 0x73;
        z.lIIIlllIII[45] = 0x39 ^ 0x26;
        z.lIIIlllIII[46] = 0x31 ^ 0x11;
        z.lIIIlllIII[47] = 0xFFFFF79B & 0x1CE6;
        z.lIIIlllIII[48] = 40 + 6 - -121 + 58 ^ 143 + 158 - 241 + 132;
        z.lIIIlllIII[49] = 0xFFFFE7CE & 0x1FF7;
        z.lIIIlllIII[50] = 0x36 ^ 0x14;
        z.lIIIlllIII[51] = 0x5E ^ 0x1C ^ (0x6A ^ 0xB);
        z.lIIIlllIII[52] = 0x67 ^ 0x43;
        z.lIIIlllIII[53] = 0xFFFFE76C & 0x3DFB;
        z.lIIIlllIII[54] = 0x3B ^ 0x1E;
        z.lIIIlllIII[55] = 0xFFFF97CF & 0x6FF7;
        z.lIIIlllIII[56] = 0x3F ^ 0x64 ^ (0x17 ^ 0x6A);
        z.lIIIlllIII[57] = 0x1F ^ 0x5D ^ (0x6D ^ 8);
        z.lIIIlllIII[58] = 123 + 43 - 52 + 30 ^ 112 + 23 - -35 + 14;
        z.lIIIlllIII[59] = 0x49 ^ 0x77 ^ (0x7C ^ 0x6B);
        z.lIIIlllIII[60] = 0x60 ^ 0x31 ^ (0x77 ^ 0xC);
        z.lIIIlllIII[61] = 166 + 101 - 164 + 69 ^ 120 + 40 - 73 + 48;
        z.lIIIlllIII[62] = 0x2C ^ 0;
        z.lIIIlllIII[63] = 5 ^ 0xE ^ (0x13 ^ 0x35);
        z.lIIIlllIII[64] = 102 + 69 - 86 + 63 ^ 6 + 170 - 7 + 17;
        z.lIIIlllIII[65] = 0xFFFFEFDF & 0x17E8;
        z.lIIIlllIII[66] = 0xFFFFADFD & 0x771E;
        z.lIIIlllIII[67] = 228 + 149 - 247 + 103 ^ 4 + 153 - 105 + 146;
        z.lIIIlllIII[68] = 0x1A ^ 0x2A;
        z.lIIIlllIII[69] = 0x5D ^ 0x3E ^ (0xCB ^ 0x99);
        z.lIIIlllIII[70] = 0xFFFFD7FE & 0x2FCB;
        z.lIIIlllIII[71] = 0x34 ^ 7;
        z.lIIIlllIII[72] = -(0xFFFFE239 & 0x5DF7) & (0xFFFFD7FF & 0x6FFB);
        z.lIIIlllIII[73] = 0xB ^ 0x3F;
        z.lIIIlllIII[74] = 0x9B ^ 0xAE;
        z.lIIIlllIII[75] = 0xF ^ 0x25 ^ (0xD9 ^ 0xC5);
        z.lIIIlllIII[76] = 0xC1 ^ 0x8A ^ (0x63 ^ 0x1F);
        z.lIIIlllIII[77] = 0x49 ^ 0x54 ^ (0x80 ^ 0xA5);
        z.lIIIlllIII[78] = 71 + 13 - -8 + 161 ^ 4 + 104 - -40 + 48;
        z.lIIIlllIII[79] = 0x96 ^ 0xAC;
        z.lIIIlllIII[80] = 0x92 ^ 0xA9;
        z.lIIIlllIII[81] = 0xFFFFEFF9 & 0x17CF;
        z.lIIIlllIII[82] = 0xBB ^ 0x83 ^ (0x89 ^ 0x8D);
        z.lIIIlllIII[83] = 0xB5 ^ 0x88;
        z.lIIIlllIII[84] = 0x7F ^ 0x41;
        z.lIIIlllIII[85] = 119 + 112 - 85 + 34 ^ 105 + 100 - 186 + 120;
        z.lIIIlllIII[86] = 194 + 104 - 158 + 72 ^ 135 + 36 - 151 + 128;
        z.lIIIlllIII[87] = 147 + 69 - 92 + 99 ^ 44 + 76 - 90 + 127;
        z.lIIIlllIII[88] = 0x38 ^ 0x7B;
        z.lIIIlllIII[89] = 0x74 ^ 0x30;
        z.lIIIlllIII[90] = 0x73 ^ 0x16 ^ (6 ^ 0x26);
        z.lIIIlllIII[91] = 0x21 ^ 0x67;
        z.lIIIlllIII[92] = 89 + 45 - 62 + 126 ^ 20 + 114 - 29 + 24;
        z.lIIIlllIII[93] = 0xB ^ 0x43;
        z.lIIIlllIII[94] = 0x39 ^ 0x70;
        z.lIIIlllIII[95] = 90 + 129 - 76 + 107 ^ 119 + 58 - 2 + 1;
        z.lIIIlllIII[96] = 0xFA ^ 0x91 ^ (0x93 ^ 0xB3);
        z.lIIIlllIII[97] = 0xF0 ^ 0xBC;
        z.lIIIlllIII[98] = 48 + 106 - 29 + 2 ^ (0x2F ^ 0x1D);
        z.lIIIlllIII[99] = 3 ^ 0x5A ^ (0xBA ^ 0xAD);
        z.lIIIlllIII[100] = 121 + 49 - 163 + 224 ^ 77 + 157 - 134 + 68;
        z.lIIIlllIII[101] = 0x33 ^ 0x63;
        z.lIIIlllIII[102] = 0x6A ^ 0x3B;
        z.lIIIlllIII[103] = 0x56 ^ 4;
        z.lIIIlllIII[104] = 51 + 73 - -85 + 19 ^ 77 + 61 - -2 + 43;
        z.lIIIlllIII[105] = 0x3F ^ 0x6B;
        z.lIIIlllIII[106] = 0x38 ^ 0x6D;
        z.lIIIlllIII[107] = 0x24 ^ 0x72;
        z.lIIIlllIII[108] = 167 + 207 - 184 + 45 ^ 115 + 38 - 62 + 97;
        z.lIIIlllIII[109] = 0x20 ^ 0x2E ^ (0xF7 ^ 0xA1);
        z.lIIIlllIII[110] = 0xE0 ^ 0xB9;
        z.lIIIlllIII[111] = 0x1B ^ 0x41;
        z.lIIIlllIII[112] = 0xFA ^ 0xA1;
        z.lIIIlllIII[113] = 0x12 ^ 0x7B ^ (0xF2 ^ 0xC7);
        z.lIIIlllIII[114] = 0x24 ^ 0x79;
        z.lIIIlllIII[115] = 2 ^ 0x73 ^ (0x5A ^ 0x75);
        z.lIIIlllIII[116] = 0x50 ^ 0xF;
        z.lIIIlllIII[117] = 2 ^ 0x62;
        z.lIIIlllIII[118] = 0x84 ^ 0xA7 ^ (0x31 ^ 0x73);
        z.lIIIlllIII[119] = 0x3C ^ 0x7B ^ (0x7B ^ 0x5E);
        z.lIIIlllIII[120] = 0x7A ^ 0x19;
        z.lIIIlllIII[121] = 0x2E ^ 0x4A;
        z.lIIIlllIII[122] = 0x32 ^ 0x57;
        z.lIIIlllIII[123] = 152 + 45 - 156 + 124 ^ 169 + 53 - 141 + 114;
        z.lIIIlllIII[124] = 0xA1 ^ 0xC6;
        z.lIIIlllIII[125] = 0x75 ^ 0x1D;
        z.lIIIlllIII[126] = 0x54 ^ 0x3D;
        z.lIIIlllIII[127] = 3 ^ (0xFE ^ 0x97);
        z.lIIIlllIII[128] = -(0x81 ^ 0x87) & (0xFFFF9F5F & 0x7BFD);
        z.lIIIlllIII[129] = 0xE6 ^ 0xA8 ^ (0x98 ^ 0xBD);
        z.lIIIlllIII[130] = -(0xFFFFFF4B & 0x68B6) & (0xFFFFEFE7 & 0x7FFD);
        z.lIIIlllIII[131] = 0x76 ^ 0x1A;
        z.lIIIlllIII[132] = 0x3D ^ 0x50;
        z.lIIIlllIII[133] = 235 + 204 - 291 + 93 ^ 144 + 21 - 132 + 126;
        z.lIIIlllIII[134] = 0 + 240 - 86 + 89 ^ 82 + 101 - 88 + 61;
        z.lIIIlllIII[135] = 0x73 ^ 3;
        z.lIIIlllIII[136] = 0x64 ^ 0x15;
        z.lIIIlllIII[137] = 0xDB ^ 0xA9;
        z.lIIIlllIII[138] = 101 + 58 - -65 + 8 ^ 20 + 85 - 56 + 106;
        z.lIIIlllIII[139] = 0xAF ^ 0xA5 ^ (0x1A ^ 0x64);
        z.lIIIlllIII[140] = 0x94 ^ 0xA6 ^ (0x1C ^ 0x5B);
        z.lIIIlllIII[141] = 0x6B ^ 0x39 ^ (0xE0 ^ 0xC4);
        z.lIIIlllIII[142] = 6 ^ 0x71;
        z.lIIIlllIII[143] = 0xFFFFF1FA & 0xF2F;
        z.lIIIlllIII[144] = 0xA7 ^ 0xA8 ^ (0x70 ^ 7);
        z.lIIIlllIII[145] = 0xFFFF97FF & 0x6FCF;
        z.lIIIlllIII[146] = 0x2A ^ 0x53;
        z.lIIIlllIII[147] = 0x50 ^ 0x2A;
        z.lIIIlllIII[148] = 0xF7 ^ 0x8C;
        z.lIIIlllIII[149] = 20 + 100 - 0 + 7 ^ 3;
        z.lIIIlllIII[150] = 0x28 ^ 0x55;
        z.lIIIlllIII[151] = 0x91 ^ 0xB4 ^ (2 ^ 0x59);
        z.lIIIlllIII[152] = 89 + 9 - 96 + 125;
        z.lIIIlllIII[153] = 31 + 91 - 27 + 33;
        z.lIIIlllIII[154] = (0xAD ^ 0xA7) + (0x40 ^ 0x66) - (7 ^ 0x2C) + (0xBF ^ 0xC3);
        z.lIIIlllIII[155] = 85 + 0 - -32 + 13;
        z.lIIIlllIII[156] = (0x53 ^ 0x2A) + (0x6E ^ 0x4E) - (0xF2 ^ 0xB6) + (0x2C ^ 2);
        z.lIIIlllIII[157] = 38 + 101 - 24 + 17;
        z.lIIIlllIII[158] = (0x56 ^ 0x4E) + (0xF2 ^ 0x86) - (0x92 ^ 0x98) + 3;
        z.lIIIlllIII[159] = (0x54 ^ 0x7A) + (0xEE ^ 0xC7) - -(0xE ^ 0x29) + (0x26 ^ 0x2E);
        z.lIIIlllIII[160] = (0x35 ^ 0x2D) + (0xDD ^ 0xB5) - (6 ^ 0x58) + (0xE5 ^ 0x80);
        z.lIIIlllIII[161] = (0x73 ^ 0x2F) + (0x5D ^ 9) - (99 + 75 - 157 + 112) + (0xFF ^ 0xA6);
        z.lIIIlllIII[162] = (0xCA ^ 0x91) + (0x48 ^ 0x25) - (0x7A ^ 0x25) + (0x49 ^ 0x69);
        z.lIIIlllIII[163] = (0xF6 ^ 0xC6) + (96 + 66 - 144 + 109) - (0x5B ^ 0x69) + (0x86 ^ 0x8B);
        z.lIIIlllIII[164] = (0xF ^ 0x1C) + (0x48 ^ 0x25) - (0xE7 ^ 0x91) + (72 + 54 - 103 + 106);
        z.lIIIlllIII[165] = 0xFFFFAF76 & 0x71BD;
        z.lIIIlllIII[166] = (0x61 ^ 0x29) + (0x8C ^ 0x8B) - (0xAB ^ 0xB0) + (0xFC ^ 0xA4);
        z.lIIIlllIII[167] = (0x77 ^ 0x2E) + (0x7C ^ 0x17) - (0x25 ^ 0x79) + (0x43 ^ 0x66);
        z.lIIIlllIII[168] = (0x4B ^ 0x12) + (0x38 ^ 0xA) - (0x27 ^ 0x67) + (0x7A ^ 0x39);
        z.lIIIlllIII[169] = (0x1A ^ 0x52) + (0x32 ^ 0x5E) - (0x74 ^ 0x21) + (0xB1 ^ 0x81);
        z.lIIIlllIII[170] = 131 + 79 - 187 + 121;
        z.lIIIlllIII[171] = 125 + 122 - 141 + 39;
        z.lIIIlllIII[172] = 125 + 60 - 78 + 39;
        z.lIIIlllIII[173] = 132 + 142 - 209 + 82;
        z.lIIIlllIII[174] = 102 + 59 - 39 + 23 + (103 + 20 - -8 + 3) - (37 + 33 - -41 + 27) + (0x24 ^ 0x23);
        z.lIIIlllIII[175] = 32 + 41 - 58 + 134;
        z.lIIIlllIII[176] = 72 + 142 - 99 + 35;
        z.lIIIlllIII[177] = 3 + 110 - 3 + 41;
        z.lIIIlllIII[178] = 33 + 92 - 59 + 86;
        z.lIIIlllIII[179] = (0x2A ^ 0x30) + (108 + 96 - 84 + 18) - (0xF3 ^ 0xA9) + (7 ^ 0x48);
        z.lIIIlllIII[180] = 70 + 29 - 23 + 78;
        z.lIIIlllIII[181] = (0xDF ^ 0xA6) + (0xD ^ 0x11) - 1 + (0xA3 ^ 0xA4);
        z.lIIIlllIII[182] = 9 + 148 - 18 + 17;
        z.lIIIlllIII[183] = 127 + 46 - 47 + 31;
        z.lIIIlllIII[184] = 151 + 81 - 160 + 86;
        z.lIIIlllIII[185] = 133 + 130 - 151 + 47;
        z.lIIIlllIII[186] = 11 + 126 - 30 + 53;
        z.lIIIlllIII[187] = (0x26 ^ 0x6F) + (0x78 ^ 0x74) - (0x87 ^ 0xAF) + (0x6D ^ 0x19);
        z.lIIIlllIII[188] = (0x10 ^ 0x3E) + (73 + 132 - 192 + 135) - (0xBC ^ 0xC1) + (0xE1 ^ 0xBC);
        z.lIIIlllIII[189] = 137 + 137 - 141 + 30;
        z.lIIIlllIII[190] = 22 + 90 - 84 + 136;
        z.lIIIlllIII[191] = 98 + 123 - 104 + 48;
        z.lIIIlllIII[192] = (0x6A ^ 0x55) + (0x16 ^ 0x65) - (151 + 58 - 129 + 77) + (95 + 115 - 176 + 111);
        z.lIIIlllIII[193] = (0xE8 ^ 0x8E) + (0x95 ^ 0x9E) - -3 + (0xAA ^ 0x99);
        z.lIIIlllIII[194] = 76 + 28 - -54 + 10;
        z.lIIIlllIII[195] = (0x65 ^ 0x6C) + (0x6C ^ 0x62) - -(0xDA ^ 0x8F) + (0x4E ^ 0x73);
        z.lIIIlllIII[196] = (0x14 ^ 0x5E) + (41 + 67 - -25 + 12) - (125 + 55 - 114 + 98) + (1 ^ 0x72);
        z.lIIIlllIII[197] = 1 + 65 - 13 + 118;
        z.lIIIlllIII[198] = (0x4F ^ 0) + (0x4A ^ 0) - (0x49 ^ 0xE) + (0x47 ^ 0x1D);
        z.lIIIlllIII[199] = 53 + 93 - -9 + 18;
        z.lIIIlllIII[200] = -(0xFFFFD7E9 & 0x383F) & (0xFFFFD7FF & 0x3FFD);
        z.lIIIlllIII[201] = (0x50 ^ 0x28) + (0xA7 ^ 0x8C) - (0x76 ^ 2) + (114 + 26 - 75 + 62);
        z.lIIIlllIII[202] = 31 + 61 - -4 + 61 + (0xD ^ 0x68) - (121 + 160 - 91 + 47) + (111 + 139 - 177 + 81);
        z.lIIIlllIII[203] = 128 + 45 - 31 + 1 + (57 + 22 - -55 + 1) - (0x39 ^ 0x55) + (0x2D ^ 0x2B);
        z.lIIIlllIII[204] = 42 + 175 - 212 + 172;
        z.lIIIlllIII[205] = 72 + 2 - -5 + 49 + (136 + 54 - 68 + 45) - (0xFFFFBFFF & 0x411A) + (56 + 125 - 19 + 3);
        z.lIIIlllIII[206] = (0x18 ^ 0x68) + (66 + 71 - 135 + 137) - (3 + 146 - -47 + 18) + (76 + 85 - 130 + 111);
        z.lIIIlllIII[207] = 144 + 44 - 127 + 119;
        z.lIIIlllIII[208] = 112 + 141 - 172 + 69 + (0x7B ^ 0x65) - (0xFF ^ 0xC2) + (0xA3 ^ 0x9D);
        z.lIIIlllIII[209] = (0xF ^ 0x74) + (0x27 ^ 0x3B) - (0xD0 ^ 0xBC) + (34 + 72 - 73 + 106);
        z.lIIIlllIII[210] = 174 + 27 - 101 + 83;
        z.lIIIlllIII[211] = 103 + 11 - -36 + 34;
        z.lIIIlllIII[212] = (0x18 ^ 0x29) + (55 + 105 - 61 + 30) - (0x91 ^ 0xBC) + (0x23 ^ 0x17);
        z.lIIIlllIII[213] = 31 + 124 - 97 + 128;
        z.lIIIlllIII[214] = 66 + 81 - 93 + 133;
        z.lIIIlllIII[215] = 164 + 42 - 38 + 20;
        z.lIIIlllIII[216] = 107 + 15 - 29 + 96;
        z.lIIIlllIII[217] = (0xC5 ^ 0xA1) + (0xEA ^ 0x98) - (0x6A ^ 0x35) + (0x16 ^ 0x51);
        z.lIIIlllIII[218] = (0 ^ 0x6D) + (52 + 20 - -1 + 56) - (0x8C ^ 0xC2) + (0x2C ^ 0x33);
        z.lIIIlllIII[219] = (0xE4 ^ 0xAA) + ((0x75 ^ 0x30) & ~(0x10 ^ 0x55)) - (0xB7 ^ 0xAB) + (22 + 132 - 123 + 111);
        z.lIIIlllIII[220] = 140 + 100 - 175 + 128;
        z.lIIIlllIII[221] = 78 + 127 - 202 + 191;
        z.lIIIlllIII[222] = (0x1B ^ 0x44) + (44 + 118 - 128 + 142) - (219 + 120 - 132 + 41) + (102 + 160 - 119 + 29);
        z.lIIIlllIII[223] = 182 + 167 - 223 + 70;
        z.lIIIlllIII[224] = 98 + 167 - 129 + 61;
        z.lIIIlllIII[225] = 191 + 169 - 297 + 135;
        z.lIIIlllIII[226] = 35 + 33 - -20 + 75 + (0xE7 ^ 0xA0) - (0x4F ^ 0x20) + (0x14 ^ 0x58);
        z.lIIIlllIII[227] = (4 ^ 0x7E) + (70 + 83 - 58 + 104) - (0xFFFFCD3F & 0x33FE) + (16 + 82 - 74 + 173);
        z.lIIIlllIII[228] = 65 + 44 - 50 + 138 + (152 + 16 - 108 + 134) - (0xFFFF83FD & 0x7D17) + (0xC ^ 0x5B);
        z.lIIIlllIII[229] = 90 + 38 - 7 + 81;
        z.lIIIlllIII[230] = 20 + 17 - 15 + 181;
        z.lIIIlllIII[231] = (0xA8 ^ 0x8E) + (10 + 155 - 86 + 112) - (0xC ^ 0x2E) + (0xB2 ^ 0xBB);
        z.lIIIlllIII[232] = (0x59 ^ 0x75) + (0x2F ^ 0x3E) - -(0x3C ^ 0xE) + (0x2C ^ 0x72);
        z.lIIIlllIII[233] = 77 + 42 - 7 + 94;
        z.lIIIlllIII[234] = 26 + 62 - 31 + 88 + (122 + 100 - 176 + 91) - (0xFFFFFFD7 & 0x13C) + (105 + 67 - 149 + 178);
        z.lIIIlllIII[235] = 55 + 32 - -19 + 102;
        z.lIIIlllIII[236] = 167 + 112 - 103 + 33;
        z.lIIIlllIII[237] = (0x23 ^ 1) + (0x7A ^ 0x1D) - -(0xC3 ^ 0x81) + (0x1D ^ 0x1A);
        z.lIIIlllIII[238] = (2 ^ 0xC) + (0x65 ^ 0x29) - (0x39 ^ 0x1D) + (132 + 2 - -22 + 1);
        z.lIIIlllIII[239] = 3 + 100 - 72 + 117 + (0xFD ^ 0xC0) - (0xDC ^ 0xA1) + (5 + 90 - -12 + 21);
        z.lIIIlllIII[240] = (0xBB ^ 0x99) + (0xE2 ^ 0x80) - (0x9C ^ 0x93) + (0xF7 ^ 0x97);
        z.lIIIlllIII[241] = (0x58 ^ 2) + (0xFF ^ 0xBA) - (67 + 90 - 147 + 135) + (30 + 86 - 4 + 88);
        z.lIIIlllIII[242] = 27 + 148 - 107 + 88 + (0x8E ^ 0x81) - (0x54 ^ 0x3D) + (40 + 11 - 31 + 129);
        z.lIIIlllIII[243] = 85 + 30 - 52 + 153;
        z.lIIIlllIII[244] = (0x1E ^ 2) + (0xC3 ^ 0xA7) - -(8 ^ 0x33) + (0x84 ^ 0x9A);
        z.lIIIlllIII[245] = (0x51 ^ 0x46) + (0x9A ^ 0xA2) - -(0x4A ^ 0x2F) + (0xA4 ^ 0x82);
        z.lIIIlllIII[246] = (0x63 ^ 0x42) + (52 + 13 - 15 + 144) - (134 + 134 - 250 + 144) + (43 + 48 - 33 + 96);
        z.lIIIlllIII[247] = 178 + 7 - 87 + 122;
        z.lIIIlllIII[248] = 201 + 43 - 203 + 180;
        z.lIIIlllIII[249] = (0xAC ^ 0x80) + (0xF5 ^ 0x82) - (0x82 ^ 0xC3) + (0xED ^ 0x91);
        z.lIIIlllIII[250] = 51 + 34 - -16 + 122;
        z.lIIIlllIII[251] = 15 + 150 - -39 + 20;
        z.lIIIlllIII[252] = (0xA4 ^ 0x87) + (8 + 123 - 7 + 67) - (86 + 80 - 155 + 156) + (162 + 128 - 209 + 85);
        z.lIIIlllIII[253] = (0x93 ^ 0xBD) + (18 + 110 - -42 + 20) - (179 + 176 - 164 + 20) + (135 + 121 - 190 + 136);
        z.lIIIlllIII[254] = 198 + 125 - 171 + 76;
        z.lIIIlllIII[255] = (0x76 ^ 0x40) + (170 + 62 - 73 + 58) - (183 + 42 - 191 + 162) + (126 + 124 - 103 + 7);
        z.lIIIlllIII[256] = 24 + 49 - 40 + 155 + (125 + 104 - 197 + 96) - (0xFFFFBD7F & 0x439B) + (36 + 147 - 25 + 39);
        z.lIIIlllIII[257] = 207 + 197 - 349 + 176;
        z.lIIIlllIII[258] = 176 + 170 - 232 + 118;
        z.lIIIlllIII[259] = 212 + 183 - 309 + 147;
        z.lIIIlllIII[260] = (0xAF ^ 0xB2) + (0x50 ^ 0x6D) - -(0x37 ^ 0x60) + (0x3A ^ 3);
        z.lIIIlllIII[261] = 25 + 190 - 11 + 31;
        z.lIIIlllIII[262] = (0xC5 ^ 0x86) + (0xF9 ^ 0x96) - (87 + 148 - 204 + 133) + (39 + 10 - -71 + 102);
        z.lIIIlllIII[263] = 30 + 225 - 194 + 176;
        z.lIIIlllIII[264] = (0x1A ^ 0x77) + ((0x41 ^ 0x66) & ~(0x7F ^ 0x58)) - ((0x24 ^ 0x63) & ~(0x61 ^ 0x26)) + (23 + 68 - 52 + 90);
        z.lIIIlllIII[265] = 123 + 150 - 160 + 79 + (0xCD ^ 0x89) - (0x29 ^ 0x74) + (0xE2 ^ 0xAA);
        z.lIIIlllIII[266] = 8 + 161 - 47 + 118;
        z.lIIIlllIII[267] = 76 + 28 - -8 + 15 + (46 + 147 - 54 + 10) - (102 + 169 - 262 + 203) + (123 + 9 - 32 + 77);
        z.lIIIlllIII[268] = (0x4D ^ 0x48) + 1 - -(0x57 ^ 0x3D) + (62 + 61 - 78 + 85);
        z.lIIIlllIII[269] = 182 + 10 - -42 + 9;
        z.lIIIlllIII[270] = 163 + 115 - 253 + 219;
        z.lIIIlllIII[271] = 142 + 228 - 198 + 73;
        z.lIIIlllIII[272] = 128 + 89 - 191 + 149 + (101 + 134 - 159 + 160) - (0xFFFFD1B7 & 0x2F7D) + (56 + 86 - 17 + 19);
        z.lIIIlllIII[273] = 26 + 227 - 155 + 149;
        z.lIIIlllIII[274] = 211 + 226 - 356 + 167;
        z.lIIIlllIII[275] = 170 + 236 - 220 + 63;
        z.lIIIlllIII[276] = 205 + 149 - 235 + 131;
        z.lIIIlllIII[277] = 171 + 215 - 221 + 86;
        z.lIIIlllIII[278] = 46 + 115 - 55 + 85 + (93 + 95 - 182 + 131) - (0x3F ^ 0x6E) + (0x18 ^ 0x1D);
        z.lIIIlllIII[279] = 2 + 76 - 59 + 146 + (0x66 ^ 0x46) - -(0x4C ^ 0x74) + ((0x7C ^ 0x5B) & ~(0x28 ^ 0xF));
        z.lIIIlllIII[280] = 65 + 61 - 16 + 144;
        z.lIIIlllIII[281] = (0x66 ^ 0x7F) + (0x65 ^ 0x28) - (0xD0 ^ 0x95) + (123 + 49 - -4 + 46);
        z.lIIIlllIII[282] = 0xFFFFCD62 & 0x339D;
        z.lIIIlllIII[283] = 0xFFFFC5E5 & 0x3B1B;
        z.lIIIlllIII[284] = -(0xFFFFBEAE & Short.MAX_VALUE) & (0xFFFFBFEF & 0x7FBF);
        z.lIIIlllIII[285] = 0xFFFFE967 & 0x179B;
        z.lIIIlllIII[286] = -(0xFFFFEEEF & 0x15FB) & (0xFFFF85EF & 0x7FFE);
        z.lIIIlllIII[287] = -(0xFFFFF9FB & 0x5EFD) & (0xFFFFDFFD & 0x79FF);
        z.lIIIlllIII[288] = -(0xFFFFBF7D & 0x7A9B) & (0xFFFFBBDF & 0x7F3E);
        z.lIIIlllIII[289] = 0xFFFFCD07 & 0x33FF;
        z.lIIIlllIII[290] = -(0xFFFFDCF6 & 0x33BB) & (0xFFFF9DF9 & 0x73BF);
        z.lIIIlllIII[291] = 0xFFFFAF59 & 0x51AF;
        z.lIIIlllIII[292] = 0xFFFFBFFE & 0x410B;
        z.lIIIlllIII[293] = -(0xFFFFFCAD & 0x5BF7) & (0xFFFFD9EF & 0x7FBF);
        z.lIIIlllIII[294] = -(0xFFFFB64E & 0x7BB5) & (0xFFFFBFBF & 0x734F);
        z.lIIIlllIII[295] = 0xFFFFBF8F & 0x417D;
        z.lIIIlllIII[296] = -(0xFFFF8CD3 & 0x77BE) & (0xFFFFF59F & 0xFFF);
        z.lIIIlllIII[297] = 0xFFFFA97F & 0x578F;
        z.lIIIlllIII[298] = 0xFFFFEB9E & 0x1571;
        z.lIIIlllIII[299] = 0xFFFF9F17 & 0x61F9;
        z.lIIIlllIII[300] = -(0xFFFFFF5F & 0x5CAD) & (0xFFFFDFFE & 0x7D1F);
        z.lIIIlllIII[301] = 0xFFFFFB37 & 0x5DB;
        z.lIIIlllIII[302] = -(103 + 160 - 107 + 45) & (0xFFFF87DD & 0x79FE);
        z.lIIIlllIII[303] = -(0xFFFFD8A3 & 0x3F7D) & (0xFFFFDFFF & 0x3FF6);
        z.lIIIlllIII[304] = 0xFFFFFBB7 & 0x56F;
        z.lIIIlllIII[305] = -(0xFFFFEED3 & 0x1D6D) & (0xFFFFAD77 & 0x5FDD);
        z.lIIIlllIII[306] = -(0xFFFFC941 & 0x7EBF) & (0xFFFFDFDF & 0x6FFE);
        z.lIIIlllIII[307] = -(0xFFFFF8EF & 0x3714) & (0xFFFFF9BF & 0x376B);
        z.lIIIlllIII[308] = 0xFFFF9596 & 0x6B7F;
        z.lIIIlllIII[309] = 0xFFFFB557 & 0x4BBF;
        z.lIIIlllIII[310] = -(0xFFFFFF78 & 0x348F) & (0xFFFFFF1F & 0x35FF);
        z.lIIIlllIII[311] = 0xFFFFB719 & 0x49FF;
        z.lIIIlllIII[312] = 0xFFFF9B1F & 0x65FA;
        z.lIIIlllIII[313] = -(0xFFFFF5BB & 0x6A45) & (0xFFFFFF5F & 0x61BB);
        z.lIIIlllIII[314] = -(0xFFFFEFE2 & 0x7CBF) & (0xFFFFEDBD & Short.MAX_VALUE);
        z.lIIIlllIII[315] = 0xFFFFCBFA & 0x3FBD;
        z.lIIIlllIII[316] = -(0xFFFFFDEF & 0x4EBF) & (0xFFFFFDFF & Short.MAX_VALUE);
        z.lIIIlllIII[317] = -(0xFFFFECD7 & 0x5F2B) & (0xFFFFEFEF & 0x5FFA);
        z.lIIIlllIII[318] = 0xFFFFFFED & 0xF1F;
        z.lIIIlllIII[319] = 0xFFFFFFDA & 0x7F5;
        z.lIIIlllIII[320] = 0xFFFFFBDD & 0x3EBA;
        z.lIIIlllIII[321] = -(0xFFFFDFA3 & 0x715E) & (0xFFFFFFFF & 0x7FCD);
        z.lIIIlllIII[322] = -(0xFFFFBFEA & 0x7D1D) & (0xFFFFFFFF & 0x7F6F);
        z.lIIIlllIII[323] = 0xFFFFDF4F & 0x3FF7;
        z.lIIIlllIII[324] = 0xFFFFBFD6 & 0x453D;
        z.lIIIlllIII[325] = 0xFFFFA5FD & 0x5B1F;
        z.lIIIlllIII[326] = 0xFFFFFFDF & 0x13E;
        z.lIIIlllIII[327] = -(0xFFFF8953 & 0x7EAD) & (0xFFFFED7F & 0x1B9F);
        z.lIIIlllIII[328] = -(0xFFFFBFFF & 0x7257) & (0xFFFFBF7F & 0x73F6);
        z.lIIIlllIII[329] = -(0xFFFFFEFD & 0x7FD3) & (0xFFFFFFF1 & Short.MAX_VALUE);
        z.lIIIlllIII[330] = 0xFFFFF7F6 & 0x92B;
        z.lIIIlllIII[331] = 0xFFFFDD67 & 0x23BB;
        z.lIIIlllIII[332] = -(0xFFFFBFEA & 0x70D7) & (0xFFFFB1E5 & Short.MAX_VALUE);
        z.lIIIlllIII[333] = -(0xFFFFF4A1 & 0x6B7F) & (0xFFFFFFAF & 0x6F7F);
        z.lIIIlllIII[334] = 0xFFFFBFDB & 0x4F35;
        z.lIIIlllIII[335] = -(0xFFFFB5B5 & 0x5AEF) & (0xFFFF9FF7 & 0x7FBF);
        z.lIIIlllIII[336] = -(0xFFFF9F4F & 0x70F9) & (0xFFFF9FFF & 0x7F5D);
        z.lIIIlllIII[337] = 0xFFFFBF1F & 0x4FF7;
        z.lIIIlllIII[338] = -(0xFFFFF64F & 0x39B5) & (0xFFFFFF1D & 0x3FFF);
        z.lIIIlllIII[339] = -(0xFFFFF4B7 & 0x7BE9) & (0xFFFFFFFB & 0x7FBF);
        z.lIIIlllIII[340] = 0xFFFFF7D7 & 0x397B;
        z.lIIIlllIII[341] = 0xFFFFBFDF & 0x7175;
        z.lIIIlllIII[342] = 0xFFFFBD77 & 0x73DF;
        z.lIIIlllIII[343] = 0xFFFFEDFA & 0x1BFF;
        z.lIIIlllIII[344] = -(0xFFFFF733 & 0x6CCD) & (0xFFFFEFFF & 0x7DFE);
        z.lIIIlllIII[345] = -(0xFFFFF4DF & 0x2F7C) & (0xFFFFFE5B & 0x2FFF);
        z.lIIIlllIII[346] = 0xFFFF8B73 & 0x7E8E;
        z.lIIIlllIII[347] = 0xFFFFCFDD & 0x3A26;
        z.lIIIlllIII[348] = 0xFFFFC9FE & 0x3FFD;
        z.lIIIlllIII[349] = -(0xFFFFFF5A & 0x70F7) & (0xFFFFFAD7 & 0x7F7F);
        z.lIIIlllIII[350] = -(0xFFFF8E7F & 0x79D3) & (0xFFFFBEFF & 0x6FFF);
        z.lIIIlllIII[351] = 0xFFFFFBD9 & 0xE2F;
        z.lIIIlllIII[352] = -(0xFFFFF9AB & 0x5F5D) & (0xFFFFFFFE & 0x7FBF);
        z.lIIIlllIII[353] = -(0xFFFFF965 & 0x17DE) & (0xFFFFF7FF & 0x3FFB);
        z.lIIIlllIII[354] = -(0xFFFFD8F5 & 0x2F4B) & (0xFFFFAEFE & 0x7FFB);
        z.lIIIlllIII[355] = -(0xFFFFE6A9 & 0x7D77) & (0xFFFFFFEF & 0x6DF9);
        z.lIIIlllIII[356] = -(0xFFFFD7DB & 0x79AD) & (0xFFFFFDFE & 0x5FFF);
        z.lIIIlllIII[357] = -(0xFFFFBED5 & 0x772F) & (0xFFFFBFDF & 0x7FFE);
        z.lIIIlllIII[358] = -(0xFFFFFDDF & 0x732E) & (0xFFFFFD7F & 0x7FFD);
        z.lIIIlllIII[359] = -(0xFFFFFED5 & 0x453B) & (0xFFFFEFFF & 0x5DF9);
        z.lIIIlllIII[360] = 0xFFFFED7F & 0x1EE9;
        z.lIIIlllIII[361] = -(0xFFFFC7AF & 0x785D) & (0xFFFFF9FF & 0x4FFD);
        z.lIIIlllIII[362] = -(0xFFFFF3AB & 0x5FFD) & (0xFFFFDFFF & Short.MAX_VALUE);
        z.lIIIlllIII[363] = -(0xFFFFC31F & 0x7CF9) & (0xFFFFFDFE & 0x4BFF);
        z.lIIIlllIII[364] = -(0xFFFFF39F & 0x4FE9) & (0xFFFFCFDB & Short.MAX_VALUE);
        z.lIIIlllIII[365] = -(0xFFFFF53F & 0x7AE9) & (0xFFFFFBFF & 0x7DFB);
        z.lIIIlllIII[366] = -(0xFFFFC6C3 & 0x3D3D) & (0xFFFFADDF & 0x5FFF);
        z.lIIIlllIII[367] = 0xFFFFBFDF & 0x4D75;
        z.lIIIlllIII[368] = 0xFFFFCDCE & 0x3BFF;
        z.lIIIlllIII[369] = -(0xFFFFE6DD & 0x3B7B) & (0xFFFFAFFE & Short.MAX_VALUE);
        z.lIIIlllIII[370] = 0xFFFFCD7D & 0x3EDF;
        z.lIIIlllIII[371] = -(0xFFFFFB43 & 0x26FE) & (0xFFFFBFFF & 0x6FDF);
        z.lIIIlllIII[372] = -(0xFFFFF3BF & 0x7E65) & (0xFFFFFBFD & Short.MAX_VALUE);
        z.lIIIlllIII[373] = -(0xFFFFF2DD & 0x3F73) & (0xFFFFFFFE & 0x3FF9);
        z.lIIIlllIII[374] = -(0xFFFFFFBA & 0x526F) & (0xFFFFDBFB & 0x7FFD);
        z.lIIIlllIII[375] = -(0x7A ^ 0x31) & (0xFFFFDDDF & 0x2FFF);
        z.lIIIlllIII[376] = 0xFFFF99DB & 0x6FF5;
        z.lIIIlllIII[377] = 0xFFFFCFAE & 0x3DDD;
        z.lIIIlllIII[378] = -(0x1E ^ 0x5D) & (0xFFFF9DFF & 0x6FDB);
        z.lIIIlllIII[379] = -(0xFFFFF4BF & 0x2B69) & (0xFFFFABFF & 0x7DFF);
        z.lIIIlllIII[380] = 0xFFFFCF77 & 0x3DEE;
        z.lIIIlllIII[381] = 0xFFFF9DEB & 0x6F77;
        z.lIIIlllIII[382] = 0xFFFFDC57 & 0x2FFC;
        z.lIIIlllIII[383] = 0xFFFFABF6 & 0x5DFD;
        z.lIIIlllIII[384] = -(0xFFFFC9FB & 0x7EA5) & (0xFFFFFFFE & 0x6DFF);
        z.lIIIlllIII[385] = -(0xFFFFB99A & 0x5EFF) & (0xFFFFFDFF & 0x3FFF);
        z.lIIIlllIII[386] = 0xFFFFEFE7 & 0x19FF;
        z.lIIIlllIII[387] = 0xFFFFCDF7 & 0x3FFD;
        z.lIIIlllIII[388] = -(0xFFFFF6B5 & 0x4F4B) & (0xFFFFCFFD & Short.MAX_VALUE);
        z.lIIIlllIII[389] = -(126 + 68 - 111 + 54) & (0xFFFF9DFF & 0x6FFD);
        z.lIIIlllIII[390] = 0xFFFFDBEF & 0x2DF5;
        z.lIIIlllIII[391] = 0xFFFFEE7C & 0x37F7;
        z.lIIIlllIII[392] = -(0xFFFFF4AD & 0x5F53) & (0xFFFFDDFE & 0x7FEF);
        z.lIIIlllIII[393] = -(0xFFFFDFCB & 0x70BD) & (0xFFFFF7DA & 0x7EFF);
        z.lIIIlllIII[394] = -(0xFFFFFC9F & 0x3771) & (0xFFFFFFDF & 0x3DFF);
        z.lIIIlllIII[395] = -(0xFFFFCB4F & 0x76F1) & (0xFFFFDFCF & 0x6FF7);
        z.lIIIlllIII[396] = -(0xFFFFFB27 & 0x5FC) & (0xFFFFBB3F & 0x4FFF);
        z.lIIIlllIII[397] = 0xFFFFF7EE & 0x2EB1;
        z.lIIIlllIII[398] = -(0xFFFFD5FF & 0x3EB1) & (0xFFFFDFBD & 0x3EFA);
        z.lIIIlllIII[399] = -(0x55 ^ 0xE) & (0xFFFFA6FF & Short.MAX_VALUE);
        z.lIIIlllIII[400] = 0xFFFFDBAB & 0x2E57;
        z.lIIIlllIII[401] = -(0xFFFFD6DA & 0x7B27) & (0xFFFFFFFF & 0x7777);
        z.lIIIlllIII[402] = -(0xFFFFBD5F & 0x5EF3) & (0xFFFFDDFF & 0x3F7B);
        z.lIIIlllIII[403] = -(0xFFFFFA07 & 0x3FFD) & (0xFFFFFF6F & 0x3BBF);
        z.lIIIlllIII[404] = -(0xFFFFDE57 & 0x7DAB) & (0xFFFFDD7F & 0x7FAE);
        z.lIIIlllIII[405] = -(0xFFFFBE2F & 0x7FD3) & (0xFFFFBFEF & 0x7F3F);
        z.lIIIlllIII[406] = -(0xFFFFDB7E & 0x6593) & (0xFFFFEFFF & 0x77BF);
        z.lIIIlllIII[407] = -(0xFFFFD869 & 0x77D7) & (0xFFFFF9FF & 0x5FFF);
        z.lIIIlllIII[408] = 0xFFFF9CBF & 0x6F7D;
        z.lIIIlllIII[409] = -(0xFFFFA63A & 0x7BE7) & (0xFFFFAFEF & 0x7BF7);
        z.lIIIlllIII[410] = 0xFFFFCDFE & 0x3E79;
        z.lIIIlllIII[411] = 0xFFFFABCD & 0x5DFF;
        z.lIIIlllIII[412] = -(0xFFFFF672 & 0x6B8F) & (0xFFFFFF7F & 0x6FEF);
        z.lIIIlllIII[413] = 0xFFFF8B6E & 0x75BF;
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

    private static String lllIlllIIIll(String lllIIlIIIlI, String lllIIlIIIll) {
        try {
            SecretKeySpec lllIIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIlIIIll.getBytes(StandardCharsets.UTF_8)), lIIIlllIII[13]), "DES");
            Cipher lllIIlIIllI = Cipher.getInstance("DES");
            lllIIlIIllI.init(lIIIlllIII[3], lllIIlIIlll);
            return new String(lllIIlIIllI.doFinal(Base64.getDecoder().decode(lllIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIlIIlIl) {
            lllIIlIIlIl.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return lIIIlllIII[0];
    }

    private static String lllIlllIIlII(String lllIlIIIIIl, String lllIlIIIIII) {
        lllIlIIIIIl = new String(Base64.getDecoder().decode(lllIlIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIIIlII = new StringBuilder();
        char[] lllIlIIIIll = lllIlIIIIII.toCharArray();
        int lllIlIIIIlI = lIIIlllIII[0];
        char[] lllIIllllII = lllIlIIIIIl.toCharArray();
        int lllIIlllIll = lllIIllllII.length;
        int lllIIlllIlI = lIIIlllIII[0];
        while (z.llllIIIIIIll(lllIIlllIlI, lllIIlllIll)) {
            char lllIlIIIlll = lllIIllllII[lllIIlllIlI];
            lllIlIIIlII.append((char)(lllIlIIIlll ^ lllIlIIIIll[lllIlIIIIlI % lllIlIIIIll.length]));
            0;
            ++lllIlIIIIlI;
            ++lllIIlllIlI;
            0;
            if (-2 <= 0) continue;
            return null;
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
            0;
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
                                                                                                            0;
                                                                                                        }
                                                                                                        if (!z.llllIIIIIlIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIIlllIII[4]) || z.llllIIIIIIlI(Inventory.isFull() ? 1 : 0)) {
                                                                                                            String[] stringArray = new String[lIIIlllIII[1]];
                                                                                                            stringArray[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[5]];
                                                                                                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                                                                String[] stringArray2 = new String[lIIIlllIII[1]];
                                                                                                                stringArray2[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[6]];
                                                                                                                Inventory.getFirst((String[])stringArray2).interact(lIIIllIIIl[lIIIlllIII[7]]);
                                                                                                                Time.sleepTicks((int)lIIIlllIII[1]);
                                                                                                                0;
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
                                                                                                            0;
                                                                                                        }
                                                                                                        if (!z.llllIIIIIIlI(Bank.isOpen() ? 1 : 0)) break block256;
                                                                                                        AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[13]];
                                                                                                        if (z.llllIIIIlIII(Inventory.getAll().size())) {
                                                                                                            Bank.depositInventory();
                                                                                                            Time.sleepTicks((int)lIIIlllIII[5]);
                                                                                                            0;
                                                                                                        }
                                                                                                        if (z.llllIIIIlIII(Equipment.getAll().size())) {
                                                                                                            Bank.depositEquipment();
                                                                                                            Time.sleepTicks((int)lIIIlllIII[3]);
                                                                                                            0;
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
                                                                                0;
                                                                            }
                                                                            if (z.llllIIIIIlII(Bank.isOpen() ? 1 : 0)) {
                                                                                if (z.llllIIIIIIll(bT, lIIIlllIII[1])) {
                                                                                    if (z.llllIIIIIIlI(Inventory.contains((int[])f.aV) ? 1 : 0) && z.llllIIIIIIll(Movement.getRunEnergy(), lIIIlllIII[2])) {
                                                                                        Inventory.getFirst((int[])f.aV).interact(lIIIllIIIl[lIIIlllIII[26]]);
                                                                                        Time.sleepTicks((int)lIIIlllIII[1]);
                                                                                        0;
                                                                                    }
                                                                                    e.v();
                                                                                    bT += lIIIlllIII[1];
                                                                                }
                                                                                AccBuilderRogues.c = lIIIllIIIl[lIIIlllIII[27]];
                                                                                Movement.walkTo((WorldPoint)fO);
                                                                                0;
                                                                                Time.sleepTicks((int)lIIIlllIII[1]);
                                                                                0;
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
                                                                        0;
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
                                                                        0;
                                                                        Time.sleepTicks((int)lIIIlllIII[1]);
                                                                        0;
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
                                                                                0;
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
                                                                            0;
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
                                                                                    0;
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
                                                                                    0;
                                                                                }
                                                                                if (z.llllIIIIIIlI(gE.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Walker.stepAlong(List.of(fJ));
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIIIlllIII[1]);
                                                                                    0;
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
                                                                                        0;
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
                                                                                    0;
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
                                                                                        0;
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
                                                                                    0;
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
                                                                                            0;
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
                                                                                        0;
                                                                                    }
                                                                                    Movement.walkTo((WorldPoint)fO);
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIIIlllIII[1]);
                                                                                    0;
                                                                                }
                                                                                if (z.llllIIIIIIlI(gG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)fY);
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIIIlllIII[1]);
                                                                                    0;
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
                                                                                                0;
                                                                                                if (-1 == ((0x45 ^ 0x5C) & ~(0xDE ^ 0xC7))) {
                                                                                                    return false;
                                                                                                }
                                                                                            } else {
                                                                                                bl = lIIIlllIII[0];
                                                                                            }
                                                                                            return bl;
                                                                                        }, (int)lIIIlllIII[66]);
                                                                                        0;
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
                                                                                        0;
                                                                                    }
                                                                                    if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fZ), lIIIlllIII[6])) {
                                                                                        int[] nArray24 = new int[lIIIlllIII[1]];
                                                                                        nArray24[z.lIIIlllIII[0]] = lIIIlllIII[70];
                                                                                        lllIlIllIII = TileObjects.getNearest((int[])nArray24);
                                                                                        if (z.llllIIIIIlll(lllIlIllIII)) {
                                                                                            lllIlIllIII.interact(lIIIllIIIl[lIIIlllIII[71]]);
                                                                                            Time.sleepTicks((int)lIIIlllIII[1]);
                                                                                            0;
                                                                                        }
                                                                                        int[] nArray25 = new int[lIIIlllIII[1]];
                                                                                        nArray25[z.lIIIlllIII[0]] = lIIIlllIII[72];
                                                                                        lllIlIlIlll = TileObjects.getNearest((int[])nArray25);
                                                                                        if (z.llllIIIIIlll(lllIlIlIlll)) {
                                                                                            lllIlIlIlll.interact(lIIIllIIIl[lIIIlllIII[73]]);
                                                                                            Time.sleepTicks((int)lIIIlllIII[1]);
                                                                                            0;
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
                                                                                    0;
                                                                                }
                                                                                if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(fZ), lIIIlllIII[6])) {
                                                                                    int[] nArray26 = new int[lIIIlllIII[1]];
                                                                                    nArray26[z.lIIIlllIII[0]] = lIIIlllIII[70];
                                                                                    lllIlIllIII = TileObjects.getNearest((int[])nArray26);
                                                                                    if (z.llllIIIIIlll(lllIlIllIII)) {
                                                                                        lllIlIllIII.interact(lIIIllIIIl[lIIIlllIII[78]]);
                                                                                        Time.sleepTicks((int)lIIIlllIII[1]);
                                                                                        0;
                                                                                    }
                                                                                    int[] nArray27 = new int[lIIIlllIII[1]];
                                                                                    nArray27[z.lIIIlllIII[0]] = lIIIlllIII[72];
                                                                                    lllIlIlIlll = TileObjects.getNearest((int[])nArray27);
                                                                                    if (z.llllIIIIIlll(lllIlIlIlll)) {
                                                                                        lllIlIlIlll.interact(lIIIllIIIl[lIIIlllIII[79]]);
                                                                                        Time.sleepTicks((int)lIIIlllIII[1]);
                                                                                        0;
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
                                                                        0;
                                                                        Time.sleepTicks((int)lIIIlllIII[1]);
                                                                        0;
                                                                    }
                                                                    if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIlllIII[5])) {
                                                                        int[] nArray = new int[lIIIlllIII[1]];
                                                                        nArray[z.lIIIlllIII[0]] = lIIIlllIII[81];
                                                                        lllIlIllIII = TileObjects.getNearest((int[])nArray);
                                                                        if (z.llllIIIIIlll(lllIlIllIII)) {
                                                                            lllIlIllIII.interact(lIIIllIIIl[lIIIlllIII[85]]);
                                                                            Time.sleepTicks((int)lIIIlllIII[1]);
                                                                            0;
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
                                                                                    0;
                                                                                }
                                                                                if (z.llllIIIIIIlI(Equipment.contains((int[])f.aO) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)fX);
                                                                                    0;
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
                                                                0;
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
                                                                            0;
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
                                                                            0;
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
                                                                            0;
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
                                                                                        0;
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
                                                                                                    0;
                                                                                                    if (-1 >= 0) {
                                                                                                        return false;
                                                                                                    }
                                                                                                } else {
                                                                                                    bl = lIIIlllIII[0];
                                                                                                }
                                                                                                return bl;
                                                                                            }, (int)lIIIlllIII[128]);
                                                                                            0;
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
                                                                                            0;
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
                                                                                            0;
                                                                                        }
                                                                                        if (z.llllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(gc), lIIIlllIII[3])) {
                                                                                            int[] nArray33 = new int[lIIIlllIII[1]];
                                                                                            nArray33[z.lIIIlllIII[0]] = lIIIlllIII[145];
                                                                                            lllIlIllIII = TileObjects.getNearest((int[])nArray33);
                                                                                            if (z.llllIIIIIlll(lllIlIllIII)) {
                                                                                                lllIlIllIII.interact(lIIIllIIIl[lIIIlllIII[146]]);
                                                                                                Time.sleepTicks((int)lIIIlllIII[3]);
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
                                                                                            0;
                                                                                        }
                                                                                        while (z.llllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(ge), lIIIlllIII[3])) {
                                                                                            Movement.walkTo((WorldPoint)ge);
                                                                                            0;
                                                                                            Time.sleepTicks((int)lIIIlllIII[1]);
                                                                                            0;
                                                                                            0;
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
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIIIlllIII[6]);
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
                                                0;
                                                String[] stringArray94 = new String[lIIIlllIII[1]];
                                                stringArray94[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[202]];
                                                Inventory.getFirst((String[])stringArray94).useOn((TileObject)lllIlIllIII);
                                                Time.sleepTicks((int)lIIIlllIII[1]);
                                                0;
                                                String[] stringArray95 = new String[lIIIlllIII[1]];
                                                stringArray95[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[203]];
                                                Inventory.getFirst((String[])stringArray95).useOn((TileObject)lllIlIllIII);
                                                Time.sleepTicks((int)lIIIlllIII[1]);
                                                0;
                                                0;
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
                                                0;
                                                Time.sleepTicks((int)lIIIlllIII[5]);
                                                0;
                                            }
                                            if (!z.llllIIIIIIlI(Players.getLocal().getWorldLocation().equals((Object)gj) ? 1 : 0)) continue;
                                            int[] nArray47 = new int[lIIIlllIII[1]];
                                            nArray47[z.lIIIlllIII[0]] = lIIIlllIII[200];
                                            lllIlIllIII = TileObjects.getFirstAt((WorldPoint)fv, (int[])nArray47);
                                            String[] stringArray109 = new String[lIIIlllIII[1]];
                                            stringArray109[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[219]];
                                            Inventory.getFirst((String[])stringArray109).useOn((TileObject)lllIlIllIII);
                                            Time.sleepTicks((int)lIIIlllIII[1]);
                                            0;
                                            String[] stringArray110 = new String[lIIIlllIII[1]];
                                            stringArray110[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[220]];
                                            Inventory.getFirst((String[])stringArray110).useOn((TileObject)lllIlIllIII);
                                            Time.sleepTicks((int)lIIIlllIII[1]);
                                            0;
                                            String[] stringArray111 = new String[lIIIlllIII[1]];
                                            stringArray111[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[221]];
                                            Inventory.getFirst((String[])stringArray111).useOn((TileObject)lllIlIllIII);
                                            Time.sleepTicks((int)lIIIlllIII[1]);
                                            0;
                                            0;
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
                                            0;
                                            Time.sleepTicks((int)lIIIlllIII[5]);
                                            0;
                                        }
                                        if (!z.llllIIIIIIlI(Players.getLocal().getWorldLocation().equals((Object)gi) ? 1 : 0)) continue;
                                        int[] nArray49 = new int[lIIIlllIII[1]];
                                        nArray49[z.lIIIlllIII[0]] = lIIIlllIII[200];
                                        lllIlIllIII = TileObjects.getFirstAt((WorldPoint)fw, (int[])nArray49);
                                        String[] stringArray125 = new String[lIIIlllIII[1]];
                                        stringArray125[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[237]];
                                        Inventory.getFirst((String[])stringArray125).useOn((TileObject)lllIlIllIII);
                                        Time.sleepTicks((int)lIIIlllIII[1]);
                                        0;
                                        String[] stringArray126 = new String[lIIIlllIII[1]];
                                        stringArray126[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[238]];
                                        Inventory.getFirst((String[])stringArray126).useOn((TileObject)lllIlIllIII);
                                        Time.sleepTicks((int)lIIIlllIII[1]);
                                        0;
                                        String[] stringArray127 = new String[lIIIlllIII[1]];
                                        stringArray127[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[239]];
                                        Inventory.getFirst((String[])stringArray127).useOn((TileObject)lllIlIllIII);
                                        Time.sleepTicks((int)lIIIlllIII[1]);
                                        0;
                                        0;
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
                                        0;
                                        Time.sleepTicks((int)lIIIlllIII[5]);
                                        0;
                                    }
                                    if (!z.llllIIIIIIlI(Players.getLocal().getWorldLocation().equals((Object)gh) ? 1 : 0)) continue;
                                    int[] nArray51 = new int[lIIIlllIII[1]];
                                    nArray51[z.lIIIlllIII[0]] = lIIIlllIII[200];
                                    lllIlIllIII = TileObjects.getFirstAt((WorldPoint)fx, (int[])nArray51);
                                    String[] stringArray141 = new String[lIIIlllIII[1]];
                                    stringArray141[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[254]];
                                    Inventory.getFirst((String[])stringArray141).useOn((TileObject)lllIlIllIII);
                                    Time.sleepTicks((int)lIIIlllIII[1]);
                                    0;
                                    String[] stringArray142 = new String[lIIIlllIII[1]];
                                    stringArray142[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[255]];
                                    Inventory.getFirst((String[])stringArray142).useOn((TileObject)lllIlIllIII);
                                    Time.sleepTicks((int)lIIIlllIII[1]);
                                    0;
                                    String[] stringArray143 = new String[lIIIlllIII[1]];
                                    stringArray143[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[256]];
                                    Inventory.getFirst((String[])stringArray143).useOn((TileObject)lllIlIllIII);
                                    Time.sleepTicks((int)lIIIlllIII[1]);
                                    0;
                                    0;
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
                                    0;
                                    Time.sleepTicks((int)lIIIlllIII[5]);
                                    0;
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
                                    0;
                                }
                                String[] stringArray159 = new String[lIIIlllIII[1]];
                                stringArray159[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[274]];
                                if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray159) ? 1 : 0)) {
                                    String[] stringArray160 = new String[lIIIlllIII[1]];
                                    stringArray160[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[275]];
                                    Inventory.getFirst((String[])stringArray160).useOn((TileObject)lllIlIllIII);
                                    Time.sleepTicks((int)lIIIlllIII[1]);
                                    0;
                                }
                                String[] stringArray161 = new String[lIIIlllIII[1]];
                                stringArray161[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[276]];
                                if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray161) ? 1 : 0)) {
                                    String[] stringArray162 = new String[lIIIlllIII[1]];
                                    stringArray162[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[277]];
                                    Inventory.getFirst((String[])stringArray162).useOn((TileObject)lllIlIllIII);
                                    Time.sleepTicks((int)lIIIlllIII[1]);
                                    0;
                                }
                                0;
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
                                0;
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
                                0;
                            }
                            String[] stringArray178 = new String[lIIIlllIII[1]];
                            stringArray178[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[295]];
                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray178) ? 1 : 0)) {
                                String[] stringArray179 = new String[lIIIlllIII[1]];
                                stringArray179[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[296]];
                                Inventory.getFirst((String[])stringArray179).useOn((TileObject)lllIlIllIII);
                                Time.sleepTicks((int)lIIIlllIII[1]);
                                0;
                            }
                            String[] stringArray180 = new String[lIIIlllIII[1]];
                            stringArray180[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[297]];
                            if (z.llllIIIIIIlI(Inventory.contains((String[])stringArray180) ? 1 : 0)) {
                                String[] stringArray181 = new String[lIIIlllIII[1]];
                                stringArray181[z.lIIIlllIII[0]] = lIIIllIIIl[lIIIlllIII[298]];
                                Inventory.getFirst((String[])stringArray181).useOn((TileObject)lllIlIllIII);
                                Time.sleepTicks((int)lIIIlllIII[1]);
                                0;
                            }
                            0;
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
                                    0;
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
                        0;
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
                    0;
                }
                if (z.llllIIIIIIlI(Equipment.contains((int[])f.aN) ? 1 : 0)) {
                    Equipment.getFirst((int[])f.aN).interact(lIIIllIIIl[lIIIlllIII[313]]);
                    Time.sleepTicks((int)lIIIlllIII[6]);
                    0;
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

