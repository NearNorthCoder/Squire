/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;

public class O
implements S {
    static /* synthetic */ int ck;
    static /* synthetic */ boolean ix;
    static /* synthetic */ boolean cl;
    static /* synthetic */ int iB;
    private static /* synthetic */ int[] lIIIIIlIIlI;
    static /* synthetic */ WorldPoint ij;
    static /* synthetic */ WorldArea in;
    static /* synthetic */ WorldPoint ih;
    static /* synthetic */ String[] bQ;
    static /* synthetic */ boolean it;
    static /* synthetic */ WorldPoint bY;
    public static /* synthetic */ List<d> bu;
    static /* synthetic */ boolean iv;
    static /* synthetic */ WorldArea io;
    static /* synthetic */ boolean iz;
    static /* synthetic */ WorldPoint gf;
    static /* synthetic */ boolean is;
    static /* synthetic */ boolean iy;
    static /* synthetic */ WorldPoint il;
    static /* synthetic */ boolean iA;
    static /* synthetic */ WorldPoint ii;
    static /* synthetic */ WorldPoint ik;
    static /* synthetic */ boolean iq;
    static /* synthetic */ WorldArea im;
    static /* synthetic */ boolean iu;
    static /* synthetic */ boolean iw;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ String[] lIIIIIIlllI;
    static /* synthetic */ boolean ir;
    static /* synthetic */ boolean ip;

    private static int llIlllIlIIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean S() {
        return lIIIIIlIIlI[9];
    }

    private static boolean llIlllIlIlIlI(Object object) {
        return object != null;
    }

    private static boolean llIlllIlIlIll(int n2) {
        return n2 > 0;
    }

    private static void llIlllIlIIIlI() {
        lIIIIIIlllI = new String[lIIIIIlIIlI[280]];
        O.lIIIIIIlllI[O.lIIIIIlIIlI[9]] = O."Finished buying items, switching back to quest";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[4]] = O."Nav to bank";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[5]] = O."Handling banking";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[6]] = O."We are missing quest supplies, switching to BUYING";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[7]] = O."Drink";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[11]] = O."Nav to start";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[8]] = O."Start quest";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[21]] = O."Captain Tock";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[22]] = O."Nav to boat";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[23]] = O."talk npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[17]] = O."Captain Tock";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[27]] = O."Gangplank";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[28]] = O."Cross";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[29]] = O."Gangplank";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[30]] = O."Cross";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[24]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[48]] = O."Nav to ithoiTile";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[49]] = O."talk npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[50]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[51]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[52]] = O."Climb";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[53]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[54]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[55]] = O."curses are real";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[56]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[57]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[58]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[59]] = O."Climb";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[60]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[61]] = O."Arsen the Thief";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[62]] = O."Nav to Arsen";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[63]] = O."Arsen the Thief";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[64]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[65]] = O."Climb-up";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[66]] = O."Arsen the Thief";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[67]] = O."Have you got that relic back from";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[68]] = O."Talk npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[69]] = O."Arsen the Thief";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[70]] = O."Cabin Boy Colin";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[71]] = O."Where did you find";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[72]] = O."Talk npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[73]] = O."Cabin Boy Colin";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[74]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[75]] = O."Climb-down";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[76]] = O."Nav to Gnocci";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[77]] = O."Gnocci the Cook";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[78]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[79]] = O."Climb-up";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[80]] = O."Gnocci the Cook";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[81]] = O."Where did you say this";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[20]] = O."talkedGnocci";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[82]] = O."Talk npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[83]] = O."Gnocci the Cook";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[84]] = O."Climbing stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[85]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[86]] = O."Climb-down";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[87]] = O."Nav to boat";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[88]] = O."Gangplank";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[89]] = O."Cross";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[90]] = O."talk npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[91]] = O."Captain Tock";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[92]] = O."About that sacred ogre";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[93]] = O."talkedCaptain";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[94]] = O."Gangplank";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[95]] = O."Cross";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[96]] = O."Chief Tess";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[97]] = O."Nav to hole";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[110]] = O."Hole";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[111]] = O."Enter";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[112]] = O."Chief Tess";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[113]] = O."talk npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[114]] = O."Chief Tess";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[115]] = O."you never cursed the";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[116]] = O."talkedChief";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[117]] = O."Chief Tess";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[118]] = O."Vine ladder";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[119]] = O."Climb";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[122]] = O."Chief Tess";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[123]] = O."Nav to dig";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[124]] = O."Spade";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[125]] = O."Dig";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[126]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[127]] = O."Nav to ithoii";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[128]] = O."Telescope";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[129]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[130]] = O."Climb";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[131]] = O."Telescope";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[132]] = O."look telescope ";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[133]] = O."Telescope";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[134]] = O."Observe";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[135]] = O."Telescope";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[136]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[137]] = O."Climb";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[138]] = O."Telescope";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[139]] = O."Nav to Gnocci";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[140]] = O."Gnocci the Cook";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[141]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[142]] = O."Climb-up";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[143]] = O."Gnocci the Cook";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[144]] = O."Talk npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[145]] = O."Gnocci the Cook";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[146]] = O."you found the source";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[147]] = O."Climb down gnocci stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[148]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[149]] = O."Climb-down";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[150]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[151]] = O."Nav to Arsen";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[152]] = O."Arsen the Thief";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[153]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[154]] = O."Climb-up";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[155]] = O."Arsen the Thief";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[156]] = O."curse on us by stealing";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[157]] = O."Talk npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[158]] = O."Arsen the Thief";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[159]] = O."Cabin Boy Colin";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[160]] = O."you found out how we";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[161]] = O."Talk npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[162]] = O."Cabin Boy Colin";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[163]] = O."Climbing stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[164]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[165]] = O."Climb-down";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[166]] = O."Nav to boat";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[171]] = O."Gangplank";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[172]] = O."Cross";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[173]] = O."talk npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[174]] = O."Captain Tock";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[175]] = O."Gangplank";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[176]] = O."Cross";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[177]] = O."Nav to Gnocci";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[184]] = O."Gnocci the Cook";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[185]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[186]] = O."Climb-up";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[187]] = O."Gnocci the Cook";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[188]] = O."Talk npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[189]] = O."Gnocci the Cook";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[190]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[191]] = O."Climb-down";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[192]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[193]] = O."Nav to Arsen";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[194]] = O."Arsen the Thief";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[195]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[196]] = O."Climb-up";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[197]] = O."Arsen the Thief";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[198]] = O."Talk npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[199]] = O."Arsen the Thief";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[200]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[201]] = O."Climb-down";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[202]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[203]] = O."Nav to ithoiTile";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[204]] = O."talk npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[205]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[206]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[207]] = O."Climb";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[208]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[209]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[210]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[211]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[212]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[213]] = O."Climb";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[214]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[215]] = O."Burning hut";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[216]] = O."Driftwood";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[217]] = O."Nav to boat";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[218]] = O."Gangplank";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[219]] = O."Cross";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[220]] = O."talk npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[221]] = O."Captain Tock";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[222]] = O."Gangplank";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[223]] = O."Cross";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[224]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[225]] = O."Nav to ithoiTile";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[226]] = O."kill npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[227]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[228]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[229]] = O."Climb";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[230]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[231]] = O."Wield";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[232]] = O."Eat";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[233]] = O."Ithoi the Navigator";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[234]] = O."Attack";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[235]] = O."Telescope";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[236]] = O."Stairs";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[237]] = O."Climb";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[238]] = O."Nav to boat";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[239]] = O."Gangplank";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[240]] = O."Cross";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[241]] = O."talk npc";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[242]] = O."Captain Tock";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[243]] = O."Break";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[250]] = O."The Corsair Curse";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[251]] = O."ring of wealth (";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[262]] = O."Yes.";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[263]] = O."What kind of help do you need?";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[264]] = O."Okay, I'm ready to go to Corsair Cove.";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[265]] = O."Okay, I'm ready go to Corsair Cove.";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[266]] = O."I hear you've been cursed.";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[267]] = O."Arsen says he gave you a sacred ogre relic.";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[268]] = O."I've come to return what Arsen stole.";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[269]] = O."Search for the possessed doll and face the consequences.";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[270]] = O."I've ruled out all the Corsairs' theories...";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[271]] = O."So what do I do now?";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[272]] = O."I hear it happened straight after dinner.";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[273]] = O."I hear Ithoi cooked the meal you ate that night.";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[274]] = O."I hear you cooked the meal they ate before getting sick.";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[275]] = O."I hear you cooked the meal they ate before getting sick.";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[276]] = O."Maybe because the Captain's thinking of firing you.";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[277]] = O."I know you've faked the curse.";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[278]] = O."I've seen Ithoi running around. He's not sick at all.";
        O.lIIIIIIlllI[O.lIIIIIlIIlI[279]] = O."I've killed Ithoi for poisoning your crew.";
    }

    private static boolean llIlllIlIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlllIlIlIIl(int n2) {
        return n2 == 0;
    }

    private static void llIlllIlIIlII() {
        lIIIIIlIIlI = new int[281];
        O.lIIIIIlIIlI[0] = -(0xAF ^ 0xA8) & (0xFFFFB7BF & 0x5FFF);
        O.lIIIIIlIIlI[1] = 0xFFFFD7B9 & 0x3FFE;
        O.lIIIIIlIIlI[2] = 0xFFFFD7FA & 0x3FBF;
        O.lIIIIIlIIlI[3] = -(0xFFFFFAE7 & 0x6D5D) & (0xFFFFFFFF & Short.MAX_VALUE);
        O.lIIIIIlIIlI[4] = 1;
        O.lIIIIIlIIlI[5] = 2;
        O.lIIIIIlIIlI[6] = 3;
        O.lIIIIIlIIlI[7] = 0xF ^ 0 ^ (0x24 ^ 0x2F);
        O.lIIIIIlIIlI[8] = 99 + 41 - 54 + 69 ^ 41 + 116 - 133 + 133;
        O.lIIIIIlIIlI[9] = (0x50 ^ 0x2B ^ (0xAE ^ 0x9A)) & (5 ^ 0x69 ^ (0x26 ^ 5) ^ -1);
        O.lIIIIIlIIlI[10] = 0xFFFFD7BB & 0x3BCC;
        O.lIIIIIlIIlI[11] = 0x43 ^ 0x46;
        O.lIIIIIlIIlI[12] = 0xFFFFDFDF & 0x3F67;
        O.lIIIIIlIIlI[13] = 0xFFFFFF7F & 0x1FC9;
        O.lIIIIIlIIlI[14] = -(0xFFFFBEC2 & 0x793F) & (0xFFFFBFBD & 0x7BFB);
        O.lIIIIIlIIlI[15] = -(0xFFFFCDBF & 0x7E6D) & (0xFFFFFDFD & 0x7F7F);
        O.lIIIIIlIIlI[16] = 0xFFFFCF5F & 0x32EE;
        O.lIIIIIlIIlI[17] = 0xEB ^ 0xB3 ^ (0x95 ^ 0xC7);
        O.lIIIIIlIIlI[18] = -(0xFFFFEFD7 & 0x7229) & (0xFFFFEFFB & 0x737F);
        O.lIIIIIlIIlI[19] = -(0xFFFFFFFD & 0x3ACB) & (0xFFFFBFFD & Short.MAX_VALUE);
        O.lIIIIIlIIlI[20] = 0xBC ^ 0xB5 ^ (0x64 ^ 0x5F);
        O.lIIIIIlIIlI[21] = 62 + 78 - 87 + 135 ^ 156 + 117 - 168 + 82;
        O.lIIIIIlIIlI[22] = 0x4A ^ 0x42;
        O.lIIIIIlIIlI[23] = 118 + 138 - 186 + 83 ^ 129 + 121 - 231 + 125;
        O.lIIIIIlIIlI[24] = 0x6F ^ 0x60;
        O.lIIIIIlIIlI[25] = 0xFFFFEF3B & 0x1AD6;
        O.lIIIIIlIIlI[26] = -(0xFFFFF78B & 0x48F7) & (0xFFFFCFBF & 0x7BD7);
        O.lIIIIIlIIlI[27] = 0xC ^ 7;
        O.lIIIIIlIIlI[28] = 0x52 ^ 0x5E;
        O.lIIIIIlIIlI[29] = 0x34 ^ 0x1F ^ (0x6B ^ 0x4D);
        O.lIIIIIlIIlI[30] = 4 + 114 - -28 + 41 ^ 5 + 113 - 18 + 81;
        O.lIIIIIlIIlI[31] = 0xFFFFFBF9 & 0xF1F;
        O.lIIIIIlIIlI[32] = -(0xFFFFF5DA & 0x1EF7) & (0xFFFFFFF5 & 0x1FFB);
        O.lIIIIIlIIlI[33] = 0xFFFFBE6B & 0x4B9F;
        O.lIIIIIlIIlI[34] = -(0xFFFFB3FF & 0x7C92) & (0xFFFFBFF5 & 0x7BBF);
        O.lIIIIIlIIlI[35] = 0xFFFFBB2F & 0x4ED4;
        O.lIIIIIlIIlI[36] = 0xFFFFDBFF & 0x2DFD;
        O.lIIIIIlIIlI[37] = 0xFFFFEBE3 & 0x1F3E;
        O.lIIIIIlIIlI[38] = 0xFFFF9FFF & 0x69F5;
        O.lIIIIIlIIlI[39] = -(114 + 45 - 90 + 124) & (0xFFFFDFFF & 0x2BDF);
        O.lIIIIIlIIlI[40] = 0xFFFFA9FF & 0x5FEE;
        O.lIIIIIlIIlI[41] = -(0xFFFFEA72 & 0x75EF) & (0xFFFFEFFF & 0x7B7F);
        O.lIIIIIlIIlI[42] = -(0xFFFFA2F9 & 0x7F0E) & (0xFFFFFBEF & 0x2FFF);
        O.lIIIIIlIIlI[43] = 0xFFFFFF5F & 0xBBB;
        O.lIIIIIlIIlI[44] = -(0xFFFFF4FB & 0x7B0F) & (0xFFFFFFEF & 0x79FF);
        O.lIIIIIlIIlI[45] = 0xFFFF9FFE & 0x6B17;
        O.lIIIIIlIIlI[46] = 0xFFFFEBE6 & 0x1DFD;
        O.lIIIIIlIIlI[47] = -(0xFFFFF5AF & 0x3E7E) & (0xFFFFFFFF & 0x3F3F);
        O.lIIIIIlIIlI[48] = 50 + 68 - -1 + 14 ^ 8 + 45 - 23 + 119;
        O.lIIIIIlIIlI[49] = 0x19 ^ 0x5D ^ (9 ^ 0x5C);
        O.lIIIIIlIIlI[50] = 0x6E ^ 0x7C;
        O.lIIIIIlIIlI[51] = 0xD4 ^ 0xC7;
        O.lIIIIIlIIlI[52] = 0x61 ^ 0x75;
        O.lIIIIIlIIlI[53] = 0x20 ^ 0x35;
        O.lIIIIIlIIlI[54] = 0x6F ^ 0x1F ^ (0x54 ^ 0x32);
        O.lIIIIIlIIlI[55] = 0x86 ^ 0x91;
        O.lIIIIIlIIlI[56] = 0x1B ^ 3;
        O.lIIIIIlIIlI[57] = 0x24 ^ 0x75 ^ (0x77 ^ 0x3F);
        O.lIIIIIlIIlI[58] = 5 ^ 0x46 ^ (0x7F ^ 0x26);
        O.lIIIIIlIIlI[59] = 0x61 ^ 0x23 ^ (0xFB ^ 0xA2);
        O.lIIIIIlIIlI[60] = 0x71 ^ 0x6D;
        O.lIIIIIlIIlI[61] = 0x5C ^ 0x2B ^ (0xE1 ^ 0x8B);
        O.lIIIIIlIIlI[62] = 0xBC ^ 0x9C ^ (0x69 ^ 0x57);
        O.lIIIIIlIIlI[63] = 0x1C ^ 0xF ^ (0x36 ^ 0x3A);
        O.lIIIIIlIIlI[64] = 0x89 ^ 0xA9 ^ (0xAE ^ 0x8A) & ~(0x3F ^ 0x1B);
        O.lIIIIIlIIlI[65] = 154 + 120 - 162 + 67 ^ 103 + 79 - 100 + 64;
        O.lIIIIIlIIlI[66] = 0x6E ^ 0x4C;
        O.lIIIIIlIIlI[67] = 91 + 90 - 170 + 162 ^ 44 + 31 - -26 + 41;
        O.lIIIIIlIIlI[68] = 0x73 ^ 0x57;
        O.lIIIIIlIIlI[69] = 0x31 ^ 0x55 ^ (0x13 ^ 0x52);
        O.lIIIIIlIIlI[70] = 0xB ^ 0x2D;
        O.lIIIIIlIIlI[71] = 15 + 135 - 33 + 111 ^ 109 + 52 - 82 + 116;
        O.lIIIIIlIIlI[72] = 44 + 54 - -59 + 77 ^ 34 + 145 - 60 + 75;
        O.lIIIIIlIIlI[73] = 0x2E ^ 7;
        O.lIIIIIlIIlI[74] = 165 + 155 - 207 + 125 ^ 182 + 82 - 250 + 182;
        O.lIIIIIlIIlI[75] = 0x53 ^ 0xE ^ (0xFC ^ 0x8A);
        O.lIIIIIlIIlI[76] = 0x58 ^ 0x18 ^ (0x48 ^ 0x24);
        O.lIIIIIlIIlI[77] = 0x9B ^ 0x91 ^ (0x30 ^ 0x17);
        O.lIIIIIlIIlI[78] = 0x33 ^ 0x1D;
        O.lIIIIIlIIlI[79] = 62 + 5 - 42 + 156 ^ 44 + 153 - 186 + 143;
        O.lIIIIIlIIlI[80] = 223 + 176 - 291 + 134 ^ 50 + 89 - -37 + 18;
        O.lIIIIIlIIlI[81] = 3 + 8 - -87 + 47 ^ 41 + 75 - 7 + 51;
        O.lIIIIIlIIlI[82] = 0xAA ^ 0x99;
        O.lIIIIIlIIlI[83] = 0xAC ^ 0x98;
        O.lIIIIIlIIlI[84] = 0xBF ^ 0x8A;
        O.lIIIIIlIIlI[85] = 0x18 ^ 0x2E;
        O.lIIIIIlIIlI[86] = 0x39 ^ 0xE;
        O.lIIIIIlIIlI[87] = 98 + 38 - 22 + 14 ^ 120 + 78 - 160 + 146;
        O.lIIIIIlIIlI[88] = 0x74 ^ 0x3B ^ (0x5D ^ 0x2B);
        O.lIIIIIlIIlI[89] = 0x57 ^ 0x6D;
        O.lIIIIIlIIlI[90] = 0x64 ^ 0x5F;
        O.lIIIIIlIIlI[91] = 0x3B ^ 0x5C ^ (0xD8 ^ 0x83);
        O.lIIIIIlIIlI[92] = 0x22 ^ 0x1F;
        O.lIIIIIlIIlI[93] = 0xB ^ 0x35;
        O.lIIIIIlIIlI[94] = 0x7B ^ 0x44;
        O.lIIIIIlIIlI[95] = 0xE9 ^ 0xA8 ^ 1;
        O.lIIIIIlIIlI[96] = 0xD4 ^ 0x95;
        O.lIIIIIlIIlI[97] = 0x72 ^ 0x60 ^ (0x2C ^ 0x7C);
        O.lIIIIIlIIlI[98] = 0xFFFFFBDB & 0xF3E;
        O.lIIIIIlIIlI[99] = 0xFFFFDBCF & 0x2E3F;
        O.lIIIIIlIIlI[100] = 0xFFFFFA77 & 0xF8E;
        O.lIIIIIlIIlI[101] = -(0xFFFFFFF1 & 0x660F) & (0xFFFFFFF7 & 0x6FFE);
        O.lIIIIIlIIlI[102] = 0xFFFFFF27 & 0xBFF;
        O.lIIIIIlIIlI[103] = 0xFFFF9BFF & 0x6DEF;
        O.lIIIIIlIIlI[104] = -(0xFFFFF0DB & 0x1FB7) & (0xFFFFBFFE & 0x5BBB);
        O.lIIIIIlIIlI[105] = -(0xFFFFF6B3 & 0x1D4F) & (0xFFFF9FAF & 0x7F7B);
        O.lIIIIIlIIlI[106] = 0xFFFFEDFF & 0x1BE1;
        O.lIIIIIlIIlI[107] = -(0xFFFFF1C7 & 0x4E3D) & (0xFFFFDBFF & 0x6F2F);
        O.lIIIIIlIIlI[108] = 0xFFFF9BDD & 0x6DFF;
        O.lIIIIIlIIlI[109] = 0xFFFFEB3F & 0x1FED;
        O.lIIIIIlIIlI[110] = 128 + 180 - 158 + 58 ^ 134 + 70 - 173 + 116;
        O.lIIIIIlIIlI[111] = 2 ^ 0x46;
        O.lIIIIIlIIlI[112] = 0xF ^ 0x72 ^ (0x40 ^ 0x78);
        O.lIIIIIlIIlI[113] = 0xDB ^ 0x9D;
        O.lIIIIIlIIlI[114] = 0xD8 ^ 0x9F;
        O.lIIIIIlIIlI[115] = 0xB8 ^ 0xAB ^ (0xC5 ^ 0x9E);
        O.lIIIIIlIIlI[116] = 97 + 198 - 108 + 35 ^ 110 + 18 - -7 + 16;
        O.lIIIIIlIIlI[117] = 0xE1 ^ 0xAB;
        O.lIIIIIlIIlI[118] = 0x8A ^ 0xC1;
        O.lIIIIIlIIlI[119] = 0xC3 ^ 0x8F;
        O.lIIIIIlIIlI[120] = -(0xFFFFF0FD & 0x6F37) & (0xFFFFF9FD & 0x6FFE);
        O.lIIIIIlIIlI[121] = -(0xFFFFF7CF & 0x3CF7) & (0xFFFFFFDF & 0x3FFE);
        O.lIIIIIlIIlI[122] = 45 + 18 - 41 + 120 ^ 104 + 142 - 136 + 85;
        O.lIIIIIlIIlI[123] = 0xFE ^ 0xA6 ^ (0x69 ^ 0x7F);
        O.lIIIIIlIIlI[124] = 62 + 34 - 94 + 197 ^ 111 + 88 - 113 + 50;
        O.lIIIIIlIIlI[125] = 0x25 ^ 0x18 ^ (0x1D ^ 0x70);
        O.lIIIIIlIIlI[126] = 0x59 ^ 8;
        O.lIIIIIlIIlI[127] = 0x5C ^ 0x58 ^ (0xD8 ^ 0x8E);
        O.lIIIIIlIIlI[128] = 0x45 ^ 0x2E ^ (0x5C ^ 0x64);
        O.lIIIIIlIIlI[129] = 0x2D ^ 0x79;
        O.lIIIIIlIIlI[130] = 0x26 ^ 0x73;
        O.lIIIIIlIIlI[131] = 0x49 ^ 0x16 ^ (0x36 ^ 0x3F);
        O.lIIIIIlIIlI[132] = 0x4E ^ 0x3C ^ (0 ^ 0x25);
        O.lIIIIIlIIlI[133] = 0x5A ^ 2;
        O.lIIIIIlIIlI[134] = 78 + 165 - 165 + 138 ^ 119 + 38 - 32 + 4;
        O.lIIIIIlIIlI[135] = 0x4B ^ 0x73 ^ (0xEC ^ 0x8E);
        O.lIIIIIlIIlI[136] = 0x56 ^ 0xD;
        O.lIIIIIlIIlI[137] = 0xA6 ^ 0xA1 ^ (6 ^ 0x5D);
        O.lIIIIIlIIlI[138] = 0x3C ^ 0x61;
        O.lIIIIIlIIlI[139] = 0x69 ^ 0x37;
        O.lIIIIIlIIlI[140] = 0x44 ^ 0x1B;
        O.lIIIIIlIIlI[141] = 0x8B ^ 0x85 ^ (0x13 ^ 0x7D);
        O.lIIIIIlIIlI[142] = 95 + 122 - 177 + 154 ^ 84 + 36 - 73 + 116;
        O.lIIIIIlIIlI[143] = 0x49 ^ 0x28 ^ 3;
        O.lIIIIIlIIlI[144] = 0x1B ^ 0x78;
        O.lIIIIIlIIlI[145] = 0x2C ^ 0x48;
        O.lIIIIIlIIlI[146] = 0xB ^ 0x6E;
        O.lIIIIIlIIlI[147] = 177 + 163 - 134 + 2 ^ 111 + 7 - -59 + 5;
        O.lIIIIIlIIlI[148] = 0x30 ^ 0x57;
        O.lIIIIIlIIlI[149] = 0xDE ^ 0xB6;
        O.lIIIIIlIIlI[150] = 0xC0 ^ 0xA9;
        O.lIIIIIlIIlI[151] = 0x82 ^ 0x84 ^ (0xFD ^ 0x91);
        O.lIIIIIlIIlI[152] = 0xAF ^ 0xC4;
        O.lIIIIIlIIlI[153] = 0x45 ^ 0x4B ^ (0x3A ^ 0x58);
        O.lIIIIIlIIlI[154] = 0x1C ^ 0x4A ^ (0x16 ^ 0x2D);
        O.lIIIIIlIIlI[155] = 41 + 95 - 121 + 179 ^ 114 + 61 - 37 + 34;
        O.lIIIIIlIIlI[156] = 0x2E ^ 0x41;
        O.lIIIIIlIIlI[157] = 0x65 ^ 0x32 ^ (0x88 ^ 0xAF);
        O.lIIIIIlIIlI[158] = 0xFF ^ 0x8E;
        O.lIIIIIlIIlI[159] = 183 + 123 - 193 + 118 ^ 0 + 19 - -113 + 17;
        O.lIIIIIlIIlI[160] = 176 + 204 - 259 + 90 ^ 16 + 144 - 72 + 72;
        O.lIIIIIlIIlI[161] = 0x49 ^ 0x37 ^ (0x98 ^ 0x92);
        O.lIIIIIlIIlI[162] = 180 + 141 - 284 + 215 ^ 101 + 34 - 101 + 103;
        O.lIIIIIlIIlI[163] = 0x14 ^ 0x62;
        O.lIIIIIlIIlI[164] = 208 + 85 - 205 + 123 ^ 104 + 20 - 76 + 116;
        O.lIIIIIlIIlI[165] = 0x31 ^ 0x49;
        O.lIIIIIlIIlI[166] = 0x3D ^ 0x44;
        O.lIIIIIlIIlI[167] = 0xFFFFFF85 & 0xA7F;
        O.lIIIIIlIIlI[168] = -(0xFFFFFFF3 & 0x64DD) & (0xFFFFFFFF & 0x6FF6);
        O.lIIIIIlIIlI[169] = 0xFFFFDAAF & 0x2F5D;
        O.lIIIIIlIIlI[170] = 0xFFFFCE59 & 0x3BB7;
        O.lIIIIIlIIlI[171] = 0xDE ^ 0xA4;
        O.lIIIIIlIIlI[172] = 0xFE ^ 0x85;
        O.lIIIIIlIIlI[173] = 165 + 149 - 208 + 91 ^ 51 + 147 - 165 + 152;
        O.lIIIIIlIIlI[174] = 0xD5 ^ 0xA8;
        O.lIIIIIlIIlI[175] = 5 ^ 0x72 ^ (0xA9 ^ 0xA0);
        O.lIIIIIlIIlI[176] = (0x97 ^ 0xB2) + (0xB9 ^ 0xBD) - (0x36 ^ 0x2D) + (9 ^ 0x78);
        O.lIIIIIlIIlI[177] = 63 + 58 - 99 + 106;
        O.lIIIIIlIIlI[178] = 0xFFFFCEED & 0x3B1B;
        O.lIIIIIlIIlI[179] = 0xFFFFDB43 & 0x2EBF;
        O.lIIIIIlIIlI[180] = 0xFFFFFB3D & 0xFE7;
        O.lIIIIIlIIlI[181] = -(0xFFFFE759 & 0x78A7) & (0xFFFFFFFF & 0x69FF);
        O.lIIIIIlIIlI[182] = 0xFFFF9DFF & 0x6BFB;
        O.lIIIIIlIIlI[183] = 0xFFFF8FFF & 0x7B2E;
        O.lIIIIIlIIlI[184] = 20 + 29 - -39 + 41;
        O.lIIIIIlIIlI[185] = (0xCB ^ 0x89) + (0x6C ^ 0x34) - (0x74 ^ 2) + (0xD8 ^ 0x86);
        O.lIIIIIlIIlI[186] = 101 + 127 - 192 + 95;
        O.lIIIIIlIIlI[187] = 96 + 24 - 114 + 126;
        O.lIIIIIlIIlI[188] = (0x66 ^ 0x40) + (0x28 ^ 0x40) - (6 ^ 0x3D) + (0x4A ^ 0x78);
        O.lIIIIIlIIlI[189] = 87 + 24 - 44 + 67;
        O.lIIIIIlIIlI[190] = 64 + 111 - 126 + 86;
        O.lIIIIIlIIlI[191] = 57 + 21 - -51 + 7;
        O.lIIIIIlIIlI[192] = (0xDD ^ 0xAA) + (0x2D ^ 0x48) - (154 + 109 - 252 + 145) + (0x1C ^ 0x55);
        O.lIIIIIlIIlI[193] = 94 + 100 - 148 + 92;
        O.lIIIIIlIIlI[194] = (0xA6 ^ 0x8F) + (0xE4 ^ 0x8B) - (0x56 ^ 0x30) + (0x38 ^ 0x61);
        O.lIIIIIlIIlI[195] = 86 + 31 - 113 + 136;
        O.lIIIIIlIIlI[196] = (0x16 ^ 6) + (0x24 ^ 0x37) - -(0x38 ^ 1) + (0x2A ^ 0x1B);
        O.lIIIIIlIIlI[197] = (0x4D ^ 4) + (0x65 ^ 0x56) - (0x64 ^ 0x3C) + (0xE6 ^ 0x8C);
        O.lIIIIIlIIlI[198] = 28 + 121 - 65 + 59;
        O.lIIIIIlIIlI[199] = (0xB ^ 0x26) + (0xFA ^ 0x96) - (0x10 ^ 0x4E) + (0xF0 ^ 0xA5);
        O.lIIIIIlIIlI[200] = 60 + 14 - 60 + 131;
        O.lIIIIIlIIlI[201] = (0x65 ^ 0x47) + (0xEA ^ 0xB3) - (0xCD ^ 0xA3) + (78 + 130 - 139 + 64);
        O.lIIIIIlIIlI[202] = 107 + 61 - 139 + 107 + (0x29 ^ 0x72) - (123 + 16 - 9 + 12) + (0x6F ^ 0x51);
        O.lIIIIIlIIlI[203] = (0x88 ^ 0x83) + (0x4A ^ 0x34) - (3 + 61 - 27 + 98) + (26 + 64 - 32 + 88);
        O.lIIIIIlIIlI[204] = (0xD6 ^ 0xA4) + (0x55 ^ 0x17) - (0x9C ^ 0xA7) + (0x54 ^ 0x48);
        O.lIIIIIlIIlI[205] = (0x9E ^ 0x8E) + (86 + 115 - 144 + 71) - (0x1C ^ 0x2D) + (0x52 ^ 0x65);
        O.lIIIIIlIIlI[206] = (0x26 ^ 0x3B) + (0x5F ^ 0x16) - 3 + (0x17 ^ 0x23);
        O.lIIIIIlIIlI[207] = (0xC9 ^ 0xC5) + (0xC9 ^ 0xB5) - (0x19 ^ 0x34) + (0x96 ^ 0xAB);
        O.lIIIIIlIIlI[208] = 104 + 38 - 26 + 37;
        O.lIIIIIlIIlI[209] = 22 + 145 - 159 + 146;
        O.lIIIIIlIIlI[210] = 50 + 50 - 70 + 125;
        O.lIIIIIlIIlI[211] = 98 + 34 - -4 + 14 + (0xD1 ^ 0x82) - (0x1C ^ 0x79) + (0xD8 ^ 0xC0);
        O.lIIIIIlIIlI[212] = (0xDC ^ 0xC5) + (133 + 90 - 97 + 8) - (0x17 ^ 8) + (7 ^ 0x1A);
        O.lIIIIIlIIlI[213] = 32 + 150 - 111 + 87;
        O.lIIIIIlIIlI[214] = 157 + 105 - 212 + 109;
        O.lIIIIIlIIlI[215] = 134 + 69 - 96 + 53;
        O.lIIIIIlIIlI[216] = 35 + 130 - 113 + 109;
        O.lIIIIIlIIlI[217] = (0x8D ^ 0xB1) + (123 + 106 - 186 + 101) - (8 + 14 - -73 + 98) + (43 + 71 - -26 + 11);
        O.lIIIIIlIIlI[218] = (0x5B ^ 0x3F) + (0x2D ^ 0x1E) - (2 ^ 0x64) + (0xDE ^ 0xAC);
        O.lIIIIIlIIlI[219] = (0xF2 ^ 0xB0) + (0x95 ^ 0x9B) - (0x52 ^ 0x4D) + (0x6A ^ 0x19);
        O.lIIIIIlIIlI[220] = 128 + 132 - 172 + 77;
        O.lIIIIIlIIlI[221] = 70 + 59 - 17 + 54;
        O.lIIIIIlIIlI[222] = 51 + 4 - -16 + 96;
        O.lIIIIIlIIlI[223] = 123 + 147 - 268 + 166;
        O.lIIIIIlIIlI[224] = 90 + 88 - 62 + 53;
        O.lIIIIIlIIlI[225] = 153 + 80 - 90 + 16 + (0xF ^ 0x38) - (42 + 158 - 131 + 104) + (88 + 11 - 6 + 36);
        O.lIIIIIlIIlI[226] = 76 + 17 - -29 + 15 + (126 + 40 - 84 + 45) - (172 + 194 - 223 + 72) + (0xCF ^ 0xB5);
        O.lIIIIIlIIlI[227] = 113 + 69 - 162 + 152;
        O.lIIIIIlIIlI[228] = (8 ^ 0x37) + (135 + 133 - 215 + 110) - (7 ^ 0x46) + (0xB9 ^ 0xB5);
        O.lIIIIIlIIlI[229] = 143 + 41 - 140 + 130;
        O.lIIIIIlIIlI[230] = 166 + 116 - 220 + 113;
        O.lIIIIIlIIlI[231] = (0x38 ^ 0x68) + 2 - -(0xA2 ^ 0x94) + (0x98 ^ 0xB0);
        O.lIIIIIlIIlI[232] = 130 + 158 - 213 + 100 + (140 + 133 - 152 + 40) - (19 + 187 - 22 + 48) + (0x27 ^ 0x6E);
        O.lIIIIIlIIlI[233] = 104 + 99 - 152 + 76 + (115 + 57 - 59 + 40) - (117 + 206 - 184 + 104) + (125 + 65 - 185 + 136);
        O.lIIIIIlIIlI[234] = 76 + 59 - -4 + 33 + (81 + 69 - 13 + 13) - (0xFFFFA94F & 0x57B8) + (0xBB ^ 0xC2);
        O.lIIIIIlIIlI[235] = 14 + 147 - 113 + 109 + (0xEC ^ 0x94) - (61 + 191 - 97 + 86) + (28 + 101 - 3 + 18);
        O.lIIIIIlIIlI[236] = 90 + 57 - 62 + 96;
        O.lIIIIIlIIlI[237] = (0xD0 ^ 0x9E) + (125 + 129 - 244 + 149) - (0x8F ^ 0xC5) + (0xC ^ 0x1F);
        O.lIIIIIlIIlI[238] = 10 + 125 - 61 + 61 + (0x6B ^ 0x7F) - (0x40 ^ 0x7D) + (0x43 ^ 0x1A);
        O.lIIIIIlIIlI[239] = 25 + 88 - 64 + 135;
        O.lIIIIIlIIlI[240] = 119 + 72 - 82 + 21 + (100 + 109 - 165 + 126) - (4 + 113 - -4 + 27) + (0x76 ^ 0x57);
        O.lIIIIIlIIlI[241] = 66 + 9 - -80 + 31;
        O.lIIIIIlIIlI[242] = 73 + 5 - 41 + 150;
        O.lIIIIIlIIlI[243] = 45 + 76 - 22 + 89;
        O.lIIIIIlIIlI[244] = 0xFFFF8AD8 & 0x772F;
        O.lIIIIIlIIlI[245] = -(0xFFFFD1BD & 0x3EFF) & (0xFFFFF5FF & 0x7FFC);
        O.lIIIIIlIIlI[246] = 0xFFFFFFA7 & 0x7D8;
        O.lIIIIIlIIlI[247] = -(0xFFFFCD57 & 0x72AB) & (0xFFFFEEDF & 0x7FEE);
        O.lIIIIIlIIlI[248] = -(0xFFFFCE4F & 0x3FF7) & (0xFFFFEFFF & 0x7FEE);
        O.lIIIIIlIIlI[249] = 0xFFFFB77F & 0x4FEC;
        O.lIIIIIlIIlI[250] = (0x47 ^ 0x5A) + (32 + 1 - -7 + 138) - (93 + 134 - 75 + 47) + (7 + 0 - -28 + 146);
        O.lIIIIIlIIlI[251] = 53 + 87 - 29 + 79;
        O.lIIIIIlIIlI[252] = -(0xFFFFB6FB & 0x7D2D) & (0xFFFFBFFF & Short.MAX_VALUE);
        O.lIIIIIlIIlI[253] = -(0xFFFFFFF5 & 0x422B) & (0xFFFFEFFC & 0x5EEB);
        O.lIIIIIlIIlI[254] = 0xFFFFAF7F & 0x5BDF;
        O.lIIIIIlIIlI[255] = -(0xFFFFEB6D & 0x75F7) & (0xFFFFFFFD & 0x6DFF);
        O.lIIIIIlIIlI[256] = 0xFFFFFB7F & 0xFAC;
        O.lIIIIIlIIlI[257] = 0xFFFF8FF7 & 0x79FF;
        O.lIIIIIlIIlI[258] = 0xFFFF99FC & 0x6FEF;
        O.lIIIIIlIIlI[259] = 0xFFFFDBBB & 0x2F6E;
        O.lIIIIIlIIlI[260] = 0xFFFF8BEF & 0x7E1A;
        O.lIIIIIlIIlI[261] = 0xFFFFBBBA & 0x4F55;
        O.lIIIIIlIIlI[262] = (0x3B ^ 2) + (0x5C ^ 0x4D) - -(0x20 ^ 0x78) + (0x1E ^ 3);
        O.lIIIIIlIIlI[263] = (0x42 ^ 0x63) + (0x1B ^ 0x14) - -(0x2D ^ 0x1A) + (0x4F ^ 0x16);
        O.lIIIIIlIIlI[264] = 59 + 181 - 61 + 14;
        O.lIIIIIlIIlI[265] = 11 + 57 - -102 + 24;
        O.lIIIIIlIIlI[266] = (0x37 ^ 0x73) + (14 + 5 - -122 + 48) - (0xF3 ^ 0xAA) + (0x19 ^ 2);
        O.lIIIIIlIIlI[267] = 157 + 44 - 64 + 59;
        O.lIIIIIlIIlI[268] = (0x5E ^ 3) + (83 + 143 - 73 + 1) - (6 + 104 - 85 + 206) + (45 + 123 - 86 + 99);
        O.lIIIIIlIIlI[269] = 178 + 31 - 16 + 5;
        O.lIIIIIlIIlI[270] = 110 + 63 - 120 + 146;
        O.lIIIIIlIIlI[271] = 64 + 116 - 124 + 144;
        O.lIIIIIlIIlI[272] = (0x80 ^ 0x9E) + (92 + 52 - 15 + 3) - (0xB4 ^ 0x90) + (0x65 ^ 0x2E);
        O.lIIIIIlIIlI[273] = 110 + 7 - -78 + 7;
        O.lIIIIIlIIlI[274] = (0x7C ^ 0x40) + (0xF6 ^ 0x83) - (0x68 ^ 5) + (83 + 54 - 53 + 51);
        O.lIIIIIlIIlI[275] = 137 + 100 - 213 + 180;
        O.lIIIIIlIIlI[276] = (4 ^ 0x4A) + (68 + 157 - 118 + 62) - (0xF1 ^ 0xB0) + (0x33 ^ 0x24);
        O.lIIIIIlIIlI[277] = 135 + 63 - 67 + 75;
        O.lIIIIIlIIlI[278] = 170 + 159 - 310 + 188;
        O.lIIIIIlIIlI[279] = 102 + 51 - 55 + 40 + (0xBA ^ 0xA0) - (144 + 79 - 156 + 94) + (91 + 131 - 166 + 149);
        O.lIIIIIlIIlI[280] = 68 + 19 - 26 + 148;
    }

    static {
        O.llIlllIlIIlII();
        O.llIlllIlIIIlI();
        bu = new ArrayList<d>();
        gf = new WorldPoint(lIIIIIlIIlI[252], lIIIIIlIIlI[253], lIIIIIlIIlI[9]);
        bY = new WorldPoint(lIIIIIlIIlI[254], lIIIIIlIIlI[255], lIIIIIlIIlI[9]);
        ih = new WorldPoint(lIIIIIlIIlI[46], lIIIIIlIIlI[47], lIIIIIlIIlI[9]);
        ii = new WorldPoint(lIIIIIlIIlI[182], lIIIIIlIIlI[105], lIIIIIlIIlI[9]);
        ij = new WorldPoint(lIIIIIlIIlI[101], lIIIIIlIIlI[183], lIIIIIlIIlI[9]);
        ik = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[121], lIIIIIlIIlI[9]);
        il = new WorldPoint(lIIIIIlIIlI[108], lIIIIIlIIlI[256], lIIIIIlIIlI[9]);
        im = new WorldArea(lIIIIIlIIlI[257], lIIIIIlIIlI[34], lIIIIIlIIlI[17], lIIIIIlIIlI[23], lIIIIIlIIlI[4]);
        in = new WorldArea(lIIIIIlIIlI[258], lIIIIIlIIlI[259], lIIIIIlIIlI[23], lIIIIIlIIlI[23], lIIIIIlIIlI[4]);
        io = new WorldArea(lIIIIIlIIlI[260], lIIIIIlIIlI[261], lIIIIIlIIlI[24], lIIIIIlIIlI[23], lIIIIIlIIlI[4]);
        String[] stringArray = new String[lIIIIIlIIlI[50]];
        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[262]];
        stringArray[O.lIIIIIlIIlI[4]] = lIIIIIIlllI[lIIIIIlIIlI[263]];
        stringArray[O.lIIIIIlIIlI[5]] = lIIIIIIlllI[lIIIIIlIIlI[264]];
        stringArray[O.lIIIIIlIIlI[6]] = lIIIIIIlllI[lIIIIIlIIlI[265]];
        stringArray[O.lIIIIIlIIlI[7]] = lIIIIIIlllI[lIIIIIlIIlI[266]];
        stringArray[O.lIIIIIlIIlI[11]] = lIIIIIIlllI[lIIIIIlIIlI[267]];
        stringArray[O.lIIIIIlIIlI[8]] = lIIIIIIlllI[lIIIIIlIIlI[268]];
        stringArray[O.lIIIIIlIIlI[21]] = lIIIIIIlllI[lIIIIIlIIlI[269]];
        stringArray[O.lIIIIIlIIlI[22]] = lIIIIIIlllI[lIIIIIlIIlI[270]];
        stringArray[O.lIIIIIlIIlI[23]] = lIIIIIIlllI[lIIIIIlIIlI[271]];
        stringArray[O.lIIIIIlIIlI[17]] = lIIIIIIlllI[lIIIIIlIIlI[272]];
        stringArray[O.lIIIIIlIIlI[27]] = lIIIIIIlllI[lIIIIIlIIlI[273]];
        stringArray[O.lIIIIIlIIlI[28]] = lIIIIIIlllI[lIIIIIlIIlI[274]];
        stringArray[O.lIIIIIlIIlI[29]] = lIIIIIIlllI[lIIIIIlIIlI[275]];
        stringArray[O.lIIIIIlIIlI[30]] = lIIIIIIlllI[lIIIIIlIIlI[276]];
        stringArray[O.lIIIIIlIIlI[24]] = lIIIIIIlllI[lIIIIIlIIlI[277]];
        stringArray[O.lIIIIIlIIlI[48]] = lIIIIIIlllI[lIIIIIlIIlI[278]];
        stringArray[O.lIIIIIlIIlI[49]] = lIIIIIIlllI[lIIIIIlIIlI[279]];
        bQ = stringArray;
        iB = lIIIIIlIIlI[9];
    }

    private static String llIlllIIllIII(String var25, String var8) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var14 = var8.toCharArray();
        int var13 = lIIIIIlIIlI[9];
        char[] var7 = var25.toCharArray();
        int var5 = var7.length;
        int var9 = lIIIIIlIIlI[9];
        while (O.llIlllIlIlIII(var9, var5)) {
            char var21 = var7[var9];
            var3.append((char)(var21 ^ var14[var13 % var14.length]));
            0;
            ++var13;
            ++var9;
            0;
            if (2 <= 2) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean llIlllIlIllll(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean V() {
        int n2;
        if (O.llIlllIlIIllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[91]) && O.llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n2 = lIIIIIlIIlI[4];
            0;
            if (-1 > 0) {
                return false;
            }
        } else {
            n2 = lIIIIIlIIlI[9];
        }
        return n2 != 0;
    }

    public static void dj() {
        block179: {
            WorldPoint[] var10;
            block180: {
                Object var20;
                block181: {
                    block182: {
                        block184: {
                            block183: {
                                int var16;
                                System.out.println("6073: " + Vars.getBit((int)lIIIIIlIIlI[0]));
                                System.out.println("6072: " + Vars.getBit((int)lIIIIIlIIlI[1]));
                                System.out.println("6074: " + Vars.getBit((int)lIIIIIlIIlI[2]));
                                System.out.println("6075: " + Vars.getBit((int)lIIIIIlIIlI[3]));
                                if (O.llIlllIlIIllI(Vars.getBit((int)lIIIIIlIIlI[3]), lIIIIIlIIlI[4])) {
                                    ip = lIIIIIlIIlI[4];
                                }
                                if (O.llIlllIlIIllI(Vars.getBit((int)lIIIIIlIIlI[1]), lIIIIIlIIlI[4])) {
                                    ir = lIIIIIlIIlI[4];
                                }
                                if (O.llIlllIlIIllI(Vars.getBit((int)lIIIIIlIIlI[1]), lIIIIIlIIlI[5])) {
                                    ir = lIIIIIlIIlI[4];
                                    iw = lIIIIIlIIlI[4];
                                }
                                if (O.llIlllIlIIllI(Vars.getBit((int)lIIIIIlIIlI[1]), lIIIIIlIIlI[6])) {
                                    ir = lIIIIIlIIlI[4];
                                    iz = lIIIIIlIIlI[4];
                                    iw = lIIIIIlIIlI[4];
                                }
                                if (O.llIlllIlIIllI(Vars.getBit((int)lIIIIIlIIlI[0]), lIIIIIlIIlI[4])) {
                                    is = lIIIIIlIIlI[4];
                                }
                                if (O.llIlllIlIIllI(Vars.getBit((int)lIIIIIlIIlI[0]), lIIIIIlIIlI[5])) {
                                    iv = lIIIIIlIIlI[4];
                                    is = lIIIIIlIIlI[4];
                                }
                                if (O.llIlllIlIIllI(Vars.getBit((int)lIIIIIlIIlI[0]), lIIIIIlIIlI[6])) {
                                    iv = lIIIIIlIIlI[4];
                                    ix = lIIIIIlIIlI[4];
                                    is = lIIIIIlIIlI[4];
                                }
                                if (O.llIlllIlIIllI(Vars.getBit((int)lIIIIIlIIlI[2]), lIIIIIlIIlI[5])) {
                                    iq = lIIIIIlIIlI[4];
                                }
                                if (O.llIlllIlIIllI(Vars.getBit((int)lIIIIIlIIlI[2]), lIIIIIlIIlI[6])) {
                                    it = lIIIIIlIIlI[4];
                                    iq = lIIIIIlIIlI[4];
                                }
                                if (O.llIlllIlIIllI(Vars.getBit((int)lIIIIIlIIlI[2]), lIIIIIlIIlI[7])) {
                                    iu = lIIIIIlIIlI[4];
                                    iq = lIIIIIlIIlI[4];
                                    it = lIIIIIlIIlI[4];
                                }
                                if (O.llIlllIlIIllI(Vars.getBit((int)lIIIIIlIIlI[2]), lIIIIIlIIlI[8])) {
                                    iu = lIIIIIlIIlI[4];
                                    iq = lIIIIIlIIlI[4];
                                    iy = lIIIIIlIIlI[4];
                                    it = lIIIIIlIIlI[4];
                                }
                                if (O.llIlllIlIIlll(bs ? 1 : 0)) {
                                    b.a(bu);
                                    if (O.llIlllIlIlIII(bu.size(), lIIIIIlIIlI[4])) {
                                        System.out.println(lIIIIIIlllI[lIIIIIlIIlI[9]]);
                                        bs = lIIIIIlIIlI[9];
                                    }
                                }
                                if (!O.llIlllIlIlIIl(bs ? 1 : 0)) break block179;
                                if (O.llIlllIlIlIIl(O.aa() ? 1 : 0) && O.llIlllIlIlIIl(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()))) {
                                    var10 = BankLocation.getNearest();
                                    if (O.llIlllIlIlIlI(var10) && O.llIlllIlIlIIl(var10.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[4]];
                                        a.a((BankLocation)var10);
                                    }
                                    if (O.llIlllIlIlIlI(var10) && O.llIlllIlIIlll(var10.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        if (O.llIlllIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIlIIlI[10]);
                                            0;
                                        }
                                        if (O.llIlllIlIIlll(Bank.isOpen() ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[5]];
                                            if (O.llIlllIlIlIll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIIIIlIIlI[7]);
                                                0;
                                            }
                                            if (O.llIlllIlIlIll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIIIIlIIlI[5]);
                                                0;
                                            }
                                            int[] nArray = new int[lIIIIIlIIlI[11]];
                                            nArray[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[12];
                                            nArray[O.lIIIIIlIIlI[4]] = lIIIIIlIIlI[13];
                                            nArray[O.lIIIIIlIIlI[5]] = lIIIIIlIIlI[14];
                                            nArray[O.lIIIIIlIIlI[6]] = lIIIIIlIIlI[15];
                                            nArray[O.lIIIIIlIIlI[7]] = lIIIIIlIIlI[16];
                                            if (O.llIlllIlIlIIl(e.b(nArray) ? 1 : 0)) {
                                                O.ae();
                                                System.out.println(lIIIIIIlllI[lIIIIIlIIlI[6]]);
                                                bs = lIIIIIlIIlI[4];
                                                return;
                                            }
                                            int[] nArray2 = new int[lIIIIIlIIlI[11]];
                                            nArray2[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[12];
                                            nArray2[O.lIIIIIlIIlI[4]] = lIIIIIlIIlI[13];
                                            nArray2[O.lIIIIIlIIlI[5]] = lIIIIIlIIlI[14];
                                            nArray2[O.lIIIIIlIIlI[6]] = lIIIIIlIIlI[15];
                                            nArray2[O.lIIIIIlIIlI[7]] = lIIIIIlIIlI[16];
                                            if (O.llIlllIlIIlll(e.b(nArray2) ? 1 : 0)) {
                                                a.a(lIIIIIlIIlI[12], lIIIIIlIIlI[17]);
                                                a.a(lIIIIIlIIlI[13], lIIIIIlIIlI[17]);
                                                a.a(lIIIIIlIIlI[14], lIIIIIlIIlI[4]);
                                                a.a(lIIIIIlIIlI[16], lIIIIIlIIlI[4]);
                                                a.a(lIIIIIlIIlI[15], lIIIIIlIIlI[5]);
                                                a.a(lIIIIIlIIlI[18], lIIIIIlIIlI[17]);
                                                a.a(lIIIIIlIIlI[19], lIIIIIlIIlI[4]);
                                            }
                                        }
                                    }
                                }
                                if (O.llIlllIlIIlll(Inventory.contains((int[])f.aU) ? 1 : 0) && O.llIlllIlIlIII(Movement.getRunEnergy(), lIIIIIlIIlI[20])) {
                                    Inventory.getFirst((int[])f.aU).interact(lIIIIIIlllI[lIIIIIlIIlI[7]]);
                                    Time.sleepTicks((int)lIIIIIlIIlI[4]);
                                    0;
                                }
                                if (O.llIlllIlIIlll(O.aa() ? 1 : 0) && O.llIlllIlIlIIl(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()))) {
                                    if (O.llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(gf), lIIIIIlIIlI[17])) {
                                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[11]];
                                        if (O.llIlllIlIIlll(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        Movement.walkTo((WorldPoint)gf);
                                        0;
                                        Time.sleepTicks((int)lIIIIIlIIlI[4]);
                                        0;
                                    }
                                    if (O.llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(gf), lIIIIIlIIlI[17])) {
                                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[8]];
                                        g.a(lIIIIIIlllI[lIIIIIlIIlI[21]], bQ);
                                    }
                                }
                                if (O.llIlllIlIIllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[11])) {
                                    g.a(bQ);
                                }
                                if (O.llIlllIlIIllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[17])) {
                                    if (O.llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(bY), lIIIIIlIIlI[11])) {
                                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[22]];
                                        Movement.walkTo((WorldPoint)bY);
                                        0;
                                        Time.sleepTicks((int)lIIIIIlIIlI[4]);
                                        0;
                                    }
                                    if (O.llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(bY), lIIIIIlIIlI[11])) {
                                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[23]];
                                        g.a(lIIIIIIlllI[lIIIIIlIIlI[17]], bQ);
                                    }
                                }
                                if (!O.llIlllIlIIllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[24])) break block180;
                                ck = lIIIIIlIIlI[9];
                                var10 = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[26], lIIIIIlIIlI[4]);
                                if (O.llIlllIlIIlll(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[27]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIIIIIIlllI[lIIIIIlIIlI[28]]);
                                    Time.sleepTicks((int)lIIIIIlIIlI[5]);
                                    0;
                                }
                                if (O.llIlllIlIlIIl(ip ? 1 : 0)) {
                                    if (O.llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[29]];
                                        TileObjects.getNearest((String[])stringArray).interact(lIIIIIIlllI[lIIIIIlIIlI[30]]);
                                        Time.sleepTicks((int)lIIIIIlIIlI[6]);
                                        0;
                                    }
                                    if (O.llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[11])) {
                                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[24]];
                                        if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray)) && O.llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            WorldPoint[] worldPointArray = new WorldPoint[lIIIIIlIIlI[17]];
                                            worldPointArray[O.lIIIIIlIIlI[9]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[31], lIIIIIlIIlI[9]);
                                            worldPointArray[O.lIIIIIlIIlI[4]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[32], lIIIIIlIIlI[9]);
                                            worldPointArray[O.lIIIIIlIIlI[5]] = new WorldPoint(lIIIIIlIIlI[33], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                                            worldPointArray[O.lIIIIIlIIlI[6]] = new WorldPoint(lIIIIIlIIlI[35], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                                            worldPointArray[O.lIIIIIlIIlI[7]] = new WorldPoint(lIIIIIlIIlI[36], lIIIIIlIIlI[37], lIIIIIlIIlI[9]);
                                            worldPointArray[O.lIIIIIlIIlI[11]] = new WorldPoint(lIIIIIlIIlI[38], lIIIIIlIIlI[39], lIIIIIlIIlI[9]);
                                            worldPointArray[O.lIIIIIlIIlI[8]] = new WorldPoint(lIIIIIlIIlI[40], lIIIIIlIIlI[41], lIIIIIlIIlI[9]);
                                            worldPointArray[O.lIIIIIlIIlI[21]] = new WorldPoint(lIIIIIlIIlI[42], lIIIIIlIIlI[43], lIIIIIlIIlI[9]);
                                            worldPointArray[O.lIIIIIlIIlI[22]] = new WorldPoint(lIIIIIlIIlI[44], lIIIIIlIIlI[45], lIIIIIlIIlI[9]);
                                            worldPointArray[O.lIIIIIlIIlI[23]] = new WorldPoint(lIIIIIlIIlI[46], lIIIIIlIIlI[47], lIIIIIlIIlI[9]);
                                            var20 = worldPointArray;
                                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[48]];
                                            Walker.walkAlong(Arrays.asList(var20), new HashMap());
                                            0;
                                            Time.sleepTicks((int)lIIIIIlIIlI[4]);
                                            0;
                                        }
                                    }
                                    if (O.llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[11])) {
                                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[49]];
                                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[50]];
                                        if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray))) {
                                            String[] stringArray2 = new String[lIIIIIlIIlI[4]];
                                            stringArray2[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[51]];
                                            TileObjects.getNearest((String[])stringArray2).interact(lIIIIIIlllI[lIIIIIlIIlI[52]]);
                                            Time.sleepTicks((int)lIIIIIlIIlI[6]);
                                            0;
                                        }
                                        g.a(lIIIIIIlllI[lIIIIIlIIlI[53]], bQ);
                                    }
                                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[54]];
                                    if (O.llIlllIlIlIlI(NPCs.getNearest((String[])stringArray))) {
                                        var20 = Dialog.getText();
                                        if (O.llIlllIlIlIlI(var20) && O.llIlllIlIIlll(var20.contains(lIIIIIIlllI[lIIIIIlIIlI[55]]) ? 1 : 0)) {
                                            ip = lIIIIIlIIlI[4];
                                        }
                                        g.a(lIIIIIIlllI[lIIIIIlIIlI[56]], bQ);
                                    }
                                }
                                if (O.llIlllIlIlIIl(iq ? 1 : 0) && O.llIlllIlIIlll(ip ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[57]];
                                    if (O.llIlllIlIlIlI(NPCs.getNearest((String[])stringArray))) {
                                        String[] stringArray3 = new String[lIIIIIlIIlI[4]];
                                        stringArray3[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[58]];
                                        TileObjects.getNearest((String[])stringArray3).interact(lIIIIIIlllI[lIIIIIlIIlI[59]]);
                                        Time.sleepTicks((int)lIIIIIlIIlI[6]);
                                        0;
                                    }
                                    if (O.llIlllIlIlIIl(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        String[] stringArray4 = new String[lIIIIIlIIlI[4]];
                                        stringArray4[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[60]];
                                        if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray4)) && O.llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ii), lIIIIIlIIlI[6])) {
                                            String[] stringArray5 = new String[lIIIIIlIIlI[4]];
                                            stringArray5[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[61]];
                                            if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray5))) {
                                                AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[62]];
                                                Movement.walkTo((WorldPoint)ii);
                                                0;
                                                Time.sleepTicks((int)lIIIIIlIIlI[4]);
                                                0;
                                            }
                                        }
                                        if (O.llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ii), lIIIIIlIIlI[6])) {
                                            String[] stringArray6 = new String[lIIIIIlIIlI[4]];
                                            stringArray6[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[63]];
                                            if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray6)) && O.llIlllIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                                                String[] stringArray7 = new String[lIIIIIlIIlI[4]];
                                                stringArray7[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[64]];
                                                TileObjects.getNearest((String[])stringArray7).interact(lIIIIIIlllI[lIIIIIlIIlI[65]]);
                                            }
                                        }
                                    }
                                    if (O.llIlllIlIIlll(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        String[] stringArray8 = new String[lIIIIIlIIlI[4]];
                                        stringArray8[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[66]];
                                        if (O.llIlllIlIlIlI(NPCs.getNearest((String[])stringArray8))) {
                                            var20 = Dialog.getText();
                                            if (O.llIlllIlIlIlI(var20) && O.llIlllIlIIlll(var20.contains(lIIIIIIlllI[lIIIIIlIIlI[67]]) ? 1 : 0)) {
                                                iq = lIIIIIlIIlI[4];
                                            }
                                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[68]];
                                            g.a(lIIIIIIlllI[lIIIIIlIIlI[69]], bQ);
                                        }
                                    }
                                }
                                if (O.llIlllIlIlIIl(ir ? 1 : 0) && O.llIlllIlIIlll(iq ? 1 : 0) && O.llIlllIlIIlll(ip ? 1 : 0) && O.llIlllIlIIlll(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[70]];
                                    if (O.llIlllIlIlIlI(NPCs.getNearest((String[])stringArray))) {
                                        var20 = Dialog.getOptions();
                                        if (O.llIlllIlIlIIl(var20.isEmpty() ? 1 : 0) && O.llIlllIlIIlll(var20.contains(lIIIIIIlllI[lIIIIIlIIlI[71]]) ? 1 : 0)) {
                                            ir = lIIIIIlIIlI[4];
                                        }
                                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[72]];
                                        g.a(lIIIIIIlllI[lIIIIIlIIlI[73]], bQ);
                                    }
                                }
                                if (O.llIlllIlIlIIl(is ? 1 : 0) && O.llIlllIlIIlll(ir ? 1 : 0) && O.llIlllIlIIlll(iq ? 1 : 0) && O.llIlllIlIIlll(ip ? 1 : 0)) {
                                    if (O.llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        if (O.llIlllIlIIlll(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            String[] stringArray = new String[lIIIIIlIIlI[4]];
                                            stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[74]];
                                            TileObjects.getNearest((String[])stringArray).interact(lIIIIIIlllI[lIIIIIlIIlI[75]]);
                                            Time.sleepTicks((int)lIIIIIlIIlI[6]);
                                            0;
                                        }
                                        if (O.llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ij), lIIIIIlIIlI[6]) && O.llIlllIlIlIIl(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[76]];
                                            Movement.walkTo((WorldPoint)ij);
                                            0;
                                            Time.sleepTicks((int)lIIIIIlIIlI[4]);
                                            0;
                                        }
                                        if (O.llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ij), lIIIIIlIIlI[6])) {
                                            String[] stringArray = new String[lIIIIIlIIlI[4]];
                                            stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[77]];
                                            if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray)) && O.llIlllIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                                                String[] stringArray9 = new String[lIIIIIlIIlI[4]];
                                                stringArray9[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[78]];
                                                TileObjects.getNearest((String[])stringArray9).interact(lIIIIIIlllI[lIIIIIlIIlI[79]]);
                                            }
                                        }
                                    }
                                    if (O.llIlllIlIIlll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[80]];
                                        if (O.llIlllIlIlIlI(NPCs.getNearest((String[])stringArray))) {
                                            var20 = Dialog.getOptions();
                                            if (O.llIlllIlIlIIl(var20.isEmpty() ? 1 : 0)) {
                                                var16 = lIIIIIlIIlI[9];
                                                while (O.llIlllIlIlIII(var16, var20.size())) {
                                                    if (O.llIlllIlIIlll(((Widget)var20.get(var16)).getText().contains(lIIIIIIlllI[lIIIIIlIIlI[81]]) ? 1 : 0)) {
                                                        System.out.println(lIIIIIIlllI[lIIIIIlIIlI[20]]);
                                                        is = lIIIIIlIIlI[4];
                                                    }
                                                    ++var16;
                                                    0;
                                                    if (3 != ((0x36 ^ 1) & ~(0x18 ^ 0x2F))) continue;
                                                    return;
                                                }
                                            }
                                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[82]];
                                            g.a(lIIIIIIlllI[lIIIIIlIIlI[83]], bQ);
                                        }
                                    }
                                }
                                if (O.llIlllIlIlIIl(it ? 1 : 0) && O.llIlllIlIIlll(is ? 1 : 0) && O.llIlllIlIIlll(ir ? 1 : 0) && O.llIlllIlIIlll(iq ? 1 : 0) && O.llIlllIlIIlll(ip ? 1 : 0)) {
                                    if (O.llIlllIlIIlll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[84]];
                                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[85]];
                                        TileObjects.getNearest((String[])stringArray).interact(lIIIIIIlllI[lIIIIIlIIlI[86]]);
                                        Time.sleepTicks((int)lIIIIIlIIlI[6]);
                                        0;
                                    }
                                    if (O.llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && O.llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        if (O.llIlllIlIllII(Players.getLocal().distanceTo(ik), lIIIIIlIIlI[6])) {
                                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[87]];
                                            Movement.walkTo((WorldPoint)ik);
                                            0;
                                            Time.sleepTicks((int)lIIIIIlIIlI[4]);
                                            0;
                                        }
                                        if (O.llIlllIlIllIl(Players.getLocal().distanceTo(ik), lIIIIIlIIlI[6]) && O.llIlllIlIlIIl(Players.getLocal().getWorldLocation().getPlane()) && O.llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            String[] stringArray = new String[lIIIIIlIIlI[4]];
                                            stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[88]];
                                            TileObjects.getNearest((String[])stringArray).interact(lIIIIIIlllI[lIIIIIlIIlI[89]]);
                                            Time.sleepTicks((int)lIIIIIlIIlI[8]);
                                            0;
                                        }
                                    }
                                    if (O.llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[90]];
                                        g.a(lIIIIIIlllI[lIIIIIlIIlI[91]], bQ);
                                        var20 = Dialog.getOptions();
                                        if (O.llIlllIlIlIIl(var20.isEmpty() ? 1 : 0)) {
                                            var16 = lIIIIIlIIlI[9];
                                            while (O.llIlllIlIlIII(var16, var20.size())) {
                                                if (O.llIlllIlIIlll(((Widget)var20.get(var16)).getText().contains(lIIIIIIlllI[lIIIIIlIIlI[92]]) ? 1 : 0)) {
                                                    System.out.println(lIIIIIIlllI[lIIIIIlIIlI[93]]);
                                                    it = lIIIIIlIIlI[4];
                                                }
                                                ++var16;
                                                0;
                                                if (2 >= 0) continue;
                                                return;
                                            }
                                        }
                                    }
                                }
                                if (O.llIlllIlIlIIl(iu ? 1 : 0) && O.llIlllIlIIlll(it ? 1 : 0) && O.llIlllIlIIlll(is ? 1 : 0) && O.llIlllIlIIlll(ir ? 1 : 0) && O.llIlllIlIIlll(iq ? 1 : 0) && O.llIlllIlIIlll(ip ? 1 : 0)) {
                                    if (O.llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[94]];
                                        TileObjects.getNearest((String[])stringArray).interact(lIIIIIIlllI[lIIIIIlIIlI[95]]);
                                        Time.sleepTicks((int)lIIIIIlIIlI[11]);
                                        0;
                                    }
                                    if (O.llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[96]];
                                        if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray))) {
                                            if (O.llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(il), lIIIIIlIIlI[7])) {
                                                AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[97]];
                                                WorldPoint[] worldPointArray = new WorldPoint[lIIIIIlIIlI[17]];
                                                worldPointArray[O.lIIIIIlIIlI[9]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[98], lIIIIIlIIlI[9]);
                                                worldPointArray[O.lIIIIIlIIlI[4]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[32], lIIIIIlIIlI[9]);
                                                worldPointArray[O.lIIIIIlIIlI[5]] = new WorldPoint(lIIIIIlIIlI[99], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                                                worldPointArray[O.lIIIIIlIIlI[6]] = new WorldPoint(lIIIIIlIIlI[100], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                                                worldPointArray[O.lIIIIIlIIlI[7]] = new WorldPoint(lIIIIIlIIlI[36], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                                                worldPointArray[O.lIIIIIlIIlI[11]] = new WorldPoint(lIIIIIlIIlI[101], lIIIIIlIIlI[102], lIIIIIlIIlI[9]);
                                                worldPointArray[O.lIIIIIlIIlI[8]] = new WorldPoint(lIIIIIlIIlI[103], lIIIIIlIIlI[104], lIIIIIlIIlI[9]);
                                                worldPointArray[O.lIIIIIlIIlI[21]] = new WorldPoint(lIIIIIlIIlI[42], lIIIIIlIIlI[105], lIIIIIlIIlI[9]);
                                                worldPointArray[O.lIIIIIlIIlI[22]] = new WorldPoint(lIIIIIlIIlI[106], lIIIIIlIIlI[107], lIIIIIlIIlI[9]);
                                                worldPointArray[O.lIIIIIlIIlI[23]] = new WorldPoint(lIIIIIlIIlI[108], lIIIIIlIIlI[109], lIIIIIlIIlI[9]);
                                                var20 = worldPointArray;
                                                Walker.walkAlong(Arrays.asList(var20), new HashMap());
                                                0;
                                                Time.sleepTicks((int)lIIIIIlIIlI[4]);
                                                0;
                                            }
                                            if (O.llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(il), lIIIIIlIIlI[7])) {
                                                String[] stringArray10 = new String[lIIIIIlIIlI[4]];
                                                stringArray10[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[110]];
                                                TileObjects.getNearest((String[])stringArray10).interact(lIIIIIIlllI[lIIIIIlIIlI[111]]);
                                                Time.sleepTicks((int)lIIIIIlIIlI[6]);
                                                0;
                                            }
                                        }
                                    }
                                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[112]];
                                    if (O.llIlllIlIlIlI(NPCs.getNearest((String[])stringArray))) {
                                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[113]];
                                        g.a(lIIIIIIlllI[lIIIIIlIIlI[114]], bQ);
                                        var20 = Dialog.getOptions();
                                        if (O.llIlllIlIlIIl(var20.isEmpty() ? 1 : 0)) {
                                            var16 = lIIIIIlIIlI[9];
                                            while (O.llIlllIlIlIII(var16, var20.size())) {
                                                if (O.llIlllIlIIlll(((Widget)var20.get(var16)).getText().contains(lIIIIIIlllI[lIIIIIlIIlI[115]]) ? 1 : 0)) {
                                                    System.out.println(lIIIIIIlllI[lIIIIIlIIlI[116]]);
                                                    iu = lIIIIIlIIlI[4];
                                                }
                                                ++var16;
                                                0;
                                                if (-1 <= 2) continue;
                                                return;
                                            }
                                        }
                                    }
                                }
                                if (O.llIlllIlIlIIl(iv ? 1 : 0) && O.llIlllIlIIlll(iu ? 1 : 0) && O.llIlllIlIIlll(it ? 1 : 0) && O.llIlllIlIIlll(is ? 1 : 0) && O.llIlllIlIIlll(ir ? 1 : 0) && O.llIlllIlIIlll(iq ? 1 : 0) && O.llIlllIlIIlll(ip ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[117]];
                                    if (O.llIlllIlIlIlI(NPCs.getNearest((String[])stringArray))) {
                                        String[] stringArray11 = new String[lIIIIIlIIlI[4]];
                                        stringArray11[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[118]];
                                        TileObjects.getNearest((String[])stringArray11).interact(lIIIIIIlllI[lIIIIIlIIlI[119]]);
                                        Time.sleepTicks((int)lIIIIIlIIlI[6]);
                                        0;
                                    }
                                    var20 = new WorldPoint(lIIIIIlIIlI[120], lIIIIIlIIlI[121], lIIIIIlIIlI[9]);
                                    String[] stringArray12 = new String[lIIIIIlIIlI[4]];
                                    stringArray12[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[122]];
                                    if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray12))) {
                                        if (O.llIlllIlIlIIl(Players.getLocal().getWorldLocation().equals(var20) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[123]];
                                            Movement.walkTo((WorldPoint)var20);
                                            0;
                                            Time.sleepTicks((int)lIIIIIlIIlI[4]);
                                            0;
                                        }
                                        if (O.llIlllIlIIlll(Players.getLocal().getWorldLocation().equals(var20) ? 1 : 0) && O.llIlllIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                            if (O.llIlllIlIlIII(iB, lIIIIIlIIlI[5])) {
                                                String[] stringArray13 = new String[lIIIIIlIIlI[4]];
                                                stringArray13[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[124]];
                                                Inventory.getFirst((String[])stringArray13).interact(lIIIIIIlllI[lIIIIIlIIlI[125]]);
                                                Time.sleepTicks((int)lIIIIIlIIlI[7]);
                                                0;
                                                iB += lIIIIIlIIlI[4];
                                            }
                                            if (O.llIlllIlIIllI(iB, lIIIIIlIIlI[5])) {
                                                iv = lIIIIIlIIlI[4];
                                            }
                                        }
                                    }
                                }
                                if (O.llIlllIlIlIIl(iw ? 1 : 0) && O.llIlllIlIIlll(iv ? 1 : 0) && O.llIlllIlIIlll(iu ? 1 : 0) && O.llIlllIlIIlll(it ? 1 : 0) && O.llIlllIlIIlll(is ? 1 : 0) && O.llIlllIlIIlll(ir ? 1 : 0) && O.llIlllIlIIlll(iq ? 1 : 0) && O.llIlllIlIIlll(ip ? 1 : 0)) {
                                    if (O.llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[11])) {
                                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[126]];
                                        if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray))) {
                                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[127]];
                                            Movement.walkTo((WorldPoint)ih);
                                            0;
                                            Time.sleepTicks((int)lIIIIIlIIlI[4]);
                                            0;
                                        }
                                    }
                                    if (O.llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[11])) {
                                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[128]];
                                        if (O.llIlllIlIlllI(TileObjects.getNearest((String[])stringArray))) {
                                            String[] stringArray14 = new String[lIIIIIlIIlI[4]];
                                            stringArray14[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[129]];
                                            TileObjects.getNearest((String[])stringArray14).interact(lIIIIIIlllI[lIIIIIlIIlI[130]]);
                                            Time.sleepTicks((int)lIIIIIlIIlI[7]);
                                            0;
                                        }
                                    }
                                    if (O.llIlllIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[131]];
                                        if (O.llIlllIlIlIlI(TileObjects.getNearest((String[])stringArray))) {
                                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[132]];
                                            String[] stringArray15 = new String[lIIIIIlIIlI[4]];
                                            stringArray15[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[133]];
                                            TileObjects.getNearest((String[])stringArray15).interact(lIIIIIIlllI[lIIIIIlIIlI[134]]);
                                            Time.sleepTicks((int)lIIIIIlIIlI[6]);
                                            0;
                                        }
                                    }
                                }
                                if (!O.llIlllIlIlIIl(ix ? 1 : 0) || !O.llIlllIlIIlll(iw ? 1 : 0) || !O.llIlllIlIIlll(iv ? 1 : 0) || !O.llIlllIlIIlll(iu ? 1 : 0) || !O.llIlllIlIIlll(it ? 1 : 0) || !O.llIlllIlIIlll(is ? 1 : 0) || !O.llIlllIlIIlll(ir ? 1 : 0) || !O.llIlllIlIIlll(iq ? 1 : 0) || !O.llIlllIlIIlll(ip ? 1 : 0)) break block181;
                                if (!O.llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block182;
                                if (!O.llIlllIlIlIIl(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block183;
                                String[] stringArray = new String[lIIIIIlIIlI[4]];
                                stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[135]];
                                if (!O.llIlllIlIlIlI(TileObjects.getNearest((String[])stringArray))) break block184;
                            }
                            String[] stringArray = new String[lIIIIIlIIlI[4]];
                            stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[136]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIIIIIlllI[lIIIIIlIIlI[137]]);
                            Time.sleepTicks((int)lIIIIIlIIlI[6]);
                            0;
                        }
                        if (O.llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ij), lIIIIIlIIlI[6]) && O.llIlllIlIlIIl(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[lIIIIIlIIlI[4]];
                            stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[138]];
                            if (O.llIlllIlIlllI(TileObjects.getNearest((String[])stringArray))) {
                                AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[139]];
                                Movement.walkTo((WorldPoint)ij);
                                0;
                                Time.sleepTicks((int)lIIIIIlIIlI[4]);
                                0;
                            }
                        }
                        if (O.llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ij), lIIIIIlIIlI[6])) {
                            String[] stringArray = new String[lIIIIIlIIlI[4]];
                            stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[140]];
                            if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray)) && O.llIlllIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                                String[] stringArray16 = new String[lIIIIIlIIlI[4]];
                                stringArray16[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[141]];
                                TileObjects.getNearest((String[])stringArray16).interact(lIIIIIIlllI[lIIIIIlIIlI[142]]);
                            }
                        }
                    }
                    if (O.llIlllIlIIlll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[143]];
                        if (O.llIlllIlIlIlI(NPCs.getNearest((String[])stringArray))) {
                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[144]];
                            g.a(lIIIIIIlllI[lIIIIIlIIlI[145]], bQ);
                            var20 = Dialog.getText();
                            if (O.llIlllIlIlIlI(var20) && O.llIlllIlIIlll(var20.contains(lIIIIIIlllI[lIIIIIlIIlI[146]]) ? 1 : 0)) {
                                ix = lIIIIIlIIlI[4];
                            }
                        }
                    }
                }
                if (O.llIlllIlIlIIl(iy ? 1 : 0) && O.llIlllIlIIlll(ix ? 1 : 0) && O.llIlllIlIIlll(iw ? 1 : 0) && O.llIlllIlIIlll(iv ? 1 : 0) && O.llIlllIlIIlll(iu ? 1 : 0) && O.llIlllIlIIlll(it ? 1 : 0) && O.llIlllIlIIlll(is ? 1 : 0) && O.llIlllIlIIlll(ir ? 1 : 0) && O.llIlllIlIIlll(iq ? 1 : 0) && O.llIlllIlIIlll(ip ? 1 : 0)) {
                    if (O.llIlllIlIIlll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[147]];
                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[148]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIIIIlllI[lIIIIIlIIlI[149]]);
                        Time.sleepTicks((int)lIIIIIlIIlI[6]);
                        0;
                    }
                    if (O.llIlllIlIlIIl(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && O.llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[150]];
                        if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray)) && O.llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ii), lIIIIIlIIlI[6])) {
                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[151]];
                            Walker.step((WorldPoint)ii);
                            0;
                            Time.sleepTicks((int)lIIIIIlIIlI[4]);
                            0;
                        }
                        if (O.llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ii), lIIIIIlIIlI[6])) {
                            String[] stringArray17 = new String[lIIIIIlIIlI[4]];
                            stringArray17[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[152]];
                            if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray17)) && O.llIlllIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                                String[] stringArray18 = new String[lIIIIIlIIlI[4]];
                                stringArray18[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[153]];
                                TileObjects.getNearest((String[])stringArray18).interact(lIIIIIIlllI[lIIIIIlIIlI[154]]);
                            }
                        }
                    }
                    if (O.llIlllIlIIlll(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[155]];
                        if (O.llIlllIlIlIlI(NPCs.getNearest((String[])stringArray))) {
                            var20 = Dialog.getText();
                            if (O.llIlllIlIlIlI(var20) && O.llIlllIlIIlll(var20.contains(lIIIIIIlllI[lIIIIIlIIlI[156]]) ? 1 : 0)) {
                                iy = lIIIIIlIIlI[4];
                            }
                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[157]];
                            g.a(lIIIIIIlllI[lIIIIIlIIlI[158]], bQ);
                        }
                    }
                }
                if (O.llIlllIlIlIIl(iz ? 1 : 0) && O.llIlllIlIIlll(iy ? 1 : 0) && O.llIlllIlIIlll(ix ? 1 : 0) && O.llIlllIlIIlll(iw ? 1 : 0) && O.llIlllIlIIlll(iv ? 1 : 0) && O.llIlllIlIIlll(iu ? 1 : 0) && O.llIlllIlIIlll(it ? 1 : 0) && O.llIlllIlIIlll(is ? 1 : 0) && O.llIlllIlIIlll(ir ? 1 : 0) && O.llIlllIlIIlll(iq ? 1 : 0) && O.llIlllIlIIlll(ip ? 1 : 0) && O.llIlllIlIIlll(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[159]];
                    if (O.llIlllIlIlIlI(NPCs.getNearest((String[])stringArray))) {
                        var20 = Dialog.getText();
                        if (O.llIlllIlIlIlI(var20) && O.llIlllIlIIlll(var20.contains(lIIIIIIlllI[lIIIIIlIIlI[160]]) ? 1 : 0)) {
                            iz = lIIIIIlIIlI[4];
                        }
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[161]];
                        g.a(lIIIIIIlllI[lIIIIIlIIlI[162]], bQ);
                    }
                }
                g.a(bQ);
            }
            if (O.llIlllIlIIllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[52])) {
                if (O.llIlllIlIIlll(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[163]];
                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[164]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIIIIlllI[lIIIIIlIIlI[165]]);
                    Time.sleepTicks((int)lIIIIIlIIlI[6]);
                    0;
                }
                if (O.llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && O.llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (O.llIlllIlIllII(Players.getLocal().distanceTo(ik), lIIIIIlIIlI[6])) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[166]];
                        WorldPoint[] worldPointArray = new WorldPoint[lIIIIIlIIlI[8]];
                        worldPointArray[O.lIIIIIlIIlI[9]] = new WorldPoint(lIIIIIlIIlI[36], lIIIIIlIIlI[104], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[4]] = new WorldPoint(lIIIIIlIIlI[167], lIIIIIlIIlI[168], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[5]] = new WorldPoint(lIIIIIlIIlI[169], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[6]] = new WorldPoint(lIIIIIlIIlI[170], lIIIIIlIIlI[32], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[7]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[98], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[11]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[121], lIIIIIlIIlI[9]);
                        var10 = worldPointArray;
                        Walker.walkAlong(Arrays.asList(var10), new HashMap());
                        0;
                        Time.sleepTicks((int)lIIIIIlIIlI[4]);
                        0;
                    }
                    if (O.llIlllIlIllIl(Players.getLocal().distanceTo(ik), lIIIIIlIIlI[6]) && O.llIlllIlIlIIl(Players.getLocal().getWorldLocation().getPlane()) && O.llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[171]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIIIIlllI[lIIIIIlIIlI[172]]);
                        Time.sleepTicks((int)lIIIIIlIIlI[11]);
                        0;
                    }
                }
                if (O.llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[173]];
                    g.a(lIIIIIIlllI[lIIIIIlIIlI[174]], bQ);
                }
            }
            if (O.llIlllIlIIllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[57])) {
                if (O.llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (O.llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[175]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIIIIlllI[lIIIIIlIIlI[176]]);
                        Time.sleepTicks((int)lIIIIIlIIlI[11]);
                        0;
                    }
                    if (O.llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ij), lIIIIIlIIlI[6]) && O.llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[177]];
                        WorldPoint[] worldPointArray = new WorldPoint[lIIIIIlIIlI[22]];
                        worldPointArray[O.lIIIIIlIIlI[9]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[31], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[4]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[41], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[5]] = new WorldPoint(lIIIIIlIIlI[99], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[6]] = new WorldPoint(lIIIIIlIIlI[178], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[7]] = new WorldPoint(lIIIIIlIIlI[179], lIIIIIlIIlI[180], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[11]] = new WorldPoint(lIIIIIlIIlI[181], lIIIIIlIIlI[105], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[8]] = new WorldPoint(lIIIIIlIIlI[182], lIIIIIlIIlI[109], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[21]] = new WorldPoint(lIIIIIlIIlI[101], lIIIIIlIIlI[183], lIIIIIlIIlI[9]);
                        var10 = worldPointArray;
                        Walker.walkAlong(Arrays.asList(var10), new HashMap());
                        0;
                        Time.sleepTicks((int)lIIIIIlIIlI[4]);
                        0;
                    }
                    if (O.llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ij), lIIIIIlIIlI[6])) {
                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[184]];
                        if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray)) && O.llIlllIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                            String[] stringArray19 = new String[lIIIIIlIIlI[4]];
                            stringArray19[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[185]];
                            TileObjects.getNearest((String[])stringArray19).interact(lIIIIIIlllI[lIIIIIlIIlI[186]]);
                        }
                    }
                }
                if (O.llIlllIlIIlll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[187]];
                    if (O.llIlllIlIlIlI(NPCs.getNearest((String[])stringArray))) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[188]];
                        g.a(lIIIIIIlllI[lIIIIIlIIlI[189]], bQ);
                    }
                }
            }
            if (O.llIlllIlIIllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[62])) {
                if (O.llIlllIlIIlll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[190]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIIIIlllI[lIIIIIlIIlI[191]]);
                    Time.sleepTicks((int)lIIIIIlIIlI[6]);
                    0;
                }
                if (O.llIlllIlIlIIl(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && O.llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[192]];
                    if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray)) && O.llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ii), lIIIIIlIIlI[5])) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[193]];
                        Walker.step((WorldPoint)ii);
                        0;
                        Time.sleepTicks((int)lIIIIIlIIlI[4]);
                        0;
                    }
                    if (O.llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ii), lIIIIIlIIlI[5])) {
                        String[] stringArray20 = new String[lIIIIIlIIlI[4]];
                        stringArray20[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[194]];
                        if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray20)) && O.llIlllIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                            String[] stringArray21 = new String[lIIIIIlIIlI[4]];
                            stringArray21[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[195]];
                            TileObjects.getNearest((String[])stringArray21).interact(lIIIIIIlllI[lIIIIIlIIlI[196]]);
                        }
                    }
                }
                if (O.llIlllIlIIlll(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[197]];
                    if (O.llIlllIlIlIlI(NPCs.getNearest((String[])stringArray))) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[198]];
                        g.a(lIIIIIIlllI[lIIIIIlIIlI[199]], bQ);
                    }
                }
            }
            if (O.llIlllIlIIllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[67])) {
                if (O.llIlllIlIIlll(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[200]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIIIIlllI[lIIIIIlIIlI[201]]);
                    Time.sleepTicks((int)lIIIIIlIIlI[6]);
                    0;
                }
                if (O.llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[11])) {
                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[202]];
                    if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray)) && O.llIlllIlIlIIl(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint[] worldPointArray = new WorldPoint[lIIIIIlIIlI[17]];
                        worldPointArray[O.lIIIIIlIIlI[9]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[31], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[4]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[32], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[5]] = new WorldPoint(lIIIIIlIIlI[33], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[6]] = new WorldPoint(lIIIIIlIIlI[35], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[7]] = new WorldPoint(lIIIIIlIIlI[36], lIIIIIlIIlI[37], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[11]] = new WorldPoint(lIIIIIlIIlI[38], lIIIIIlIIlI[39], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[8]] = new WorldPoint(lIIIIIlIIlI[40], lIIIIIlIIlI[41], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[21]] = new WorldPoint(lIIIIIlIIlI[42], lIIIIIlIIlI[43], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[22]] = new WorldPoint(lIIIIIlIIlI[44], lIIIIIlIIlI[45], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[23]] = new WorldPoint(lIIIIIlIIlI[46], lIIIIIlIIlI[47], lIIIIIlIIlI[9]);
                        var10 = worldPointArray;
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[203]];
                        Walker.walkAlong(Arrays.asList(var10), new HashMap());
                        0;
                        Time.sleepTicks((int)lIIIIIlIIlI[4]);
                        0;
                    }
                }
                if (O.llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[11])) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[204]];
                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[205]];
                    if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray22 = new String[lIIIIIlIIlI[4]];
                        stringArray22[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[206]];
                        TileObjects.getNearest((String[])stringArray22).interact(lIIIIIIlllI[lIIIIIlIIlI[207]]);
                        Time.sleepTicks((int)lIIIIIlIIlI[6]);
                        0;
                    }
                }
                String[] stringArray = new String[lIIIIIlIIlI[4]];
                stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[208]];
                if (O.llIlllIlIlIlI(NPCs.getNearest((String[])stringArray))) {
                    g.a(lIIIIIIlllI[lIIIIIlIIlI[209]], bQ);
                }
            }
            if (O.llIlllIlIIllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[72])) {
                g.a(lIIIIIIlllI[lIIIIIlIIlI[210]], bQ);
            }
            if (O.llIlllIlIIllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[77])) {
                String[] stringArray = new String[lIIIIIlIIlI[4]];
                stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[211]];
                if (O.llIlllIlIlIlI(NPCs.getNearest((String[])stringArray))) {
                    String[] stringArray23 = new String[lIIIIIlIIlI[4]];
                    stringArray23[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[212]];
                    TileObjects.getNearest((String[])stringArray23).interact(lIIIIIIlllI[lIIIIIlIIlI[213]]);
                }
                String[] stringArray24 = new String[lIIIIIlIIlI[4]];
                stringArray24[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[214]];
                if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray24)) && O.llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[22])) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[215]];
                    int[] nArray = new int[lIIIIIlIIlI[4]];
                    nArray[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[16];
                    String[] stringArray25 = new String[lIIIIIlIIlI[4]];
                    stringArray25[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[216]];
                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray25));
                    Time.sleepTicks((int)lIIIIIlIIlI[7]);
                    0;
                }
            }
            if (O.llIlllIlIIllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[81])) {
                g.a(bQ);
            }
            if (O.llIlllIlIIllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[20])) {
                if (O.llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && O.llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (O.llIlllIlIllII(Players.getLocal().distanceTo(ik), lIIIIIlIIlI[6])) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[217]];
                        Movement.walkTo((WorldPoint)ik);
                        0;
                        Time.sleepTicks((int)lIIIIIlIIlI[4]);
                        0;
                    }
                    if (O.llIlllIlIllIl(Players.getLocal().distanceTo(ik), lIIIIIlIIlI[6]) && O.llIlllIlIlIIl(Players.getLocal().getWorldLocation().getPlane()) && O.llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIIIlIIlI[4]];
                        stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[218]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIIIIlllI[lIIIIIlIIlI[219]]);
                        Time.sleepTicks((int)lIIIIIlIIlI[11]);
                        0;
                    }
                }
                if (O.llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[220]];
                    g.a(lIIIIIIlllI[lIIIIIlIIlI[221]], bQ);
                }
            }
            if (O.llIlllIlIIllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[83])) {
                if (O.llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[222]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIIIIlllI[lIIIIIlIIlI[223]]);
                    Time.sleepTicks((int)lIIIIIlIIlI[6]);
                    0;
                }
                if (O.llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[11])) {
                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[224]];
                    if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray)) && O.llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint[] worldPointArray = new WorldPoint[lIIIIIlIIlI[17]];
                        worldPointArray[O.lIIIIIlIIlI[9]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[31], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[4]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[32], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[5]] = new WorldPoint(lIIIIIlIIlI[33], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[6]] = new WorldPoint(lIIIIIlIIlI[35], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[7]] = new WorldPoint(lIIIIIlIIlI[36], lIIIIIlIIlI[37], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[11]] = new WorldPoint(lIIIIIlIIlI[38], lIIIIIlIIlI[39], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[8]] = new WorldPoint(lIIIIIlIIlI[40], lIIIIIlIIlI[41], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[21]] = new WorldPoint(lIIIIIlIIlI[42], lIIIIIlIIlI[43], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[22]] = new WorldPoint(lIIIIIlIIlI[44], lIIIIIlIIlI[45], lIIIIIlIIlI[9]);
                        worldPointArray[O.lIIIIIlIIlI[23]] = new WorldPoint(lIIIIIlIIlI[46], lIIIIIlIIlI[47], lIIIIIlIIlI[9]);
                        var10 = worldPointArray;
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[225]];
                        Walker.walkAlong(Arrays.asList(var10), new HashMap());
                        0;
                        Time.sleepTicks((int)lIIIIIlIIlI[4]);
                        0;
                    }
                }
                if (O.llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[11])) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[226]];
                    String[] stringArray = new String[lIIIIIlIIlI[4]];
                    stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[227]];
                    if (O.llIlllIlIlllI(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray26 = new String[lIIIIIlIIlI[4]];
                        stringArray26[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[228]];
                        TileObjects.getNearest((String[])stringArray26).interact(lIIIIIIlllI[lIIIIIlIIlI[229]]);
                        Time.sleepTicks((int)lIIIIIlIIlI[6]);
                        0;
                    }
                }
                String[] stringArray = new String[lIIIIIlIIlI[4]];
                stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[230]];
                if (O.llIlllIlIlIlI(NPCs.getNearest((String[])stringArray))) {
                    int[] nArray = new int[lIIIIIlIIlI[4]];
                    nArray[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[19];
                    if (O.llIlllIlIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lIIIIIlIIlI[4]];
                        nArray3[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[19];
                        if (O.llIlllIlIlIIl(Equipment.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIIIIIlIIlI[4]];
                            nArray4[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[19];
                            Inventory.getFirst((int[])nArray4).interact(lIIIIIIlllI[lIIIIIlIIlI[231]]);
                        }
                    }
                    if (O.llIlllIlIllll(O.llIlllIlIIlIl(e.u(), 55.0))) {
                        int[] nArray5 = new int[lIIIIIlIIlI[4]];
                        nArray5[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[18];
                        if (O.llIlllIlIIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lIIIIIlIIlI[4]];
                            nArray6[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[18];
                            Inventory.getFirst((int[])nArray6).interact(lIIIIIIlllI[lIIIIIlIIlI[232]]);
                            Time.sleepTicks((int)lIIIIIlIIlI[4]);
                            0;
                        }
                    }
                    if (O.llIlllIlIlllI(Players.getLocal().getInteracting())) {
                        String[] stringArray27 = new String[lIIIIIlIIlI[4]];
                        stringArray27[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[233]];
                        NPCs.getNearest((String[])stringArray27).interact(lIIIIIIlllI[lIIIIIlIIlI[234]]);
                        Time.sleepTicks((int)lIIIIIlIIlI[5]);
                        0;
                    }
                }
            }
            if (O.llIlllIlIIllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[86])) {
                String[] stringArray = new String[lIIIIIlIIlI[4]];
                stringArray[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[235]];
                if (O.llIlllIlIlIlI(TileObjects.getNearest((String[])stringArray)) && O.llIlllIlIIllI(Players.getLocal().getWorldLocation().getPlane(), lIIIIIlIIlI[4])) {
                    String[] stringArray28 = new String[lIIIIIlIIlI[4]];
                    stringArray28[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[236]];
                    TileObjects.getNearest((String[])stringArray28).interact(lIIIIIIlllI[lIIIIIlIIlI[237]]);
                    Time.sleepTicks((int)lIIIIIlIIlI[6]);
                    0;
                }
                if (O.llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && O.llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (O.llIlllIlIllII(Players.getLocal().distanceTo(ik), lIIIIIlIIlI[6])) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[238]];
                        Movement.walkTo((WorldPoint)ik);
                        0;
                        Time.sleepTicks((int)lIIIIIlIIlI[4]);
                        0;
                    }
                    if (O.llIlllIlIllIl(Players.getLocal().distanceTo(ik), lIIIIIlIIlI[6]) && O.llIlllIlIlIIl(Players.getLocal().getWorldLocation().getPlane())) {
                        String[] stringArray29 = new String[lIIIIIlIIlI[4]];
                        stringArray29[O.lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[239]];
                        TileObjects.getNearest((String[])stringArray29).interact(lIIIIIIlllI[lIIIIIlIIlI[240]]);
                        Time.sleepTicks((int)lIIIIIlIIlI[6]);
                        0;
                    }
                }
                if (O.llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[241]];
                    if (O.llIlllIlIlIII(ck, lIIIIIlIIlI[4])) {
                        ac.na += lIIIIIlIIlI[4];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += lIIIIIlIIlI[4];
                        ac.na = lIIIIIlIIlI[9];
                        cl = lIIIIIlIIlI[9];
                    }
                    g.a(lIIIIIIlllI[lIIIIIlIIlI[242]], bQ);
                }
            }
            if (O.llIlllIlIIllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[91])) {
                int[] nArray = new int[lIIIIIlIIlI[4]];
                nArray[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[12];
                if (O.llIlllIlIIlll(Inventory.contains((int[])nArray) ? 1 : 0) && O.llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray7 = new int[lIIIIIlIIlI[4]];
                    nArray7[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[12];
                    Inventory.getFirst((int[])nArray7).interact(lIIIIIIlllI[lIIIIIlIIlI[243]]);
                    Time.sleepTicks((int)lIIIIIlIIlI[11]);
                    0;
                }
            }
            g.a(bQ);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean aa() {
        void var19;
        int[] nArray = new int[lIIIIIlIIlI[11]];
        nArray[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[12];
        nArray[O.lIIIIIlIIlI[4]] = lIIIIIlIIlI[13];
        nArray[O.lIIIIIlIIlI[5]] = lIIIIIlIIlI[14];
        nArray[O.lIIIIIlIIlI[6]] = lIIIIIlIIlI[15];
        nArray[O.lIIIIIlIIlI[7]] = lIIIIIlIIlI[16];
        int[] nArray2 = nArray;
        int var6 = lIIIIIlIIlI[9];
        while (O.llIlllIlIlIII(var6, ((void)var19).length)) {
            int[] nArray3 = new int[lIIIIIlIIlI[4]];
            nArray3[O.lIIIIIlIIlI[9]] = var19[var6];
            if (O.llIlllIlIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIIIlIIlI[9];
            }
            ++var6;
            0;
            
            return false;
        }
        return lIIIIIlIIlI[4];
    }

    private static boolean llIlllIlIIllI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int T() {
        try {
            O.dj();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIIIIlIIlI[145];
    }

    private static void ae() {
        d var1;
        block13: {
            block12: {
                Object var22;
                block11: {
                    block10: {
                        int[] nArray = new int[lIIIIIlIIlI[4]];
                        nArray[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[18];
                        if (!O.llIlllIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block10;
                        int[] nArray2 = new int[lIIIIIlIIlI[4]];
                        nArray2[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[18];
                        if (!O.llIlllIlIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) break block11;
                        int[] nArray3 = new int[lIIIIIlIIlI[4]];
                        nArray3[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[18];
                        if (!O.llIlllIlIlIII(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIIlIIlI[24])) break block11;
                    }
                    var22 = new d(lIIIIIlIIlI[18], lIIIIIlIIlI[52], lIIIIIlIIlI[244]);
                    bu.add((d)var22);
                    0;
                }
                int[] nArray = new int[lIIIIIlIIlI[4]];
                nArray[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[19];
                if (O.llIlllIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var22 = new d(lIIIIIlIIlI[19], lIIIIIlIIlI[4], lIIIIIlIIlI[245]);
                    bu.add((d)var22);
                    0;
                }
                int[] nArray4 = new int[lIIIIIlIIlI[4]];
                nArray4[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[13];
                if (O.llIlllIlIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    var22 = new d(lIIIIIlIIlI[13], lIIIIIlIIlI[52], lIIIIIlIIlI[246]);
                    bu.add((d)var22);
                    0;
                }
                if (O.llIlllIlIlIIl(Bank.contains((Predicate)(var22 = item -> item.getName().toLowerCase().contains(lIIIIIIlllI[lIIIIIlIIlI[251]]))) ? 1 : 0)) {
                    var1 = new d(lIIIIIlIIlI[247], lIIIIIlIIlI[11], lIIIIIlIIlI[248]);
                    bu.add(var1);
                    0;
                }
                int[] nArray5 = new int[lIIIIIlIIlI[4]];
                nArray5[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[15];
                if (!O.llIlllIlIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) break block12;
                int[] nArray6 = new int[lIIIIIlIIlI[4]];
                nArray6[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[15];
                if (!O.llIlllIlIIlll(Bank.contains((int[])nArray6) ? 1 : 0)) break block13;
                int[] nArray7 = new int[lIIIIIlIIlI[4]];
                nArray7[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[15];
                if (!O.llIlllIlIlIII(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIIlIIlI[7])) break block13;
            }
            var1 = new d(lIIIIIlIIlI[15], lIIIIIlIIlI[7], i.bp);
            bu.add(var1);
            0;
        }
        int[] nArray = new int[lIIIIIlIIlI[4]];
        nArray[O.lIIIIIlIIlI[9]] = lIIIIIlIIlI[12];
        if (O.llIlllIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var1 = new d(lIIIIIlIIlI[12], lIIIIIlIIlI[72], lIIIIIlIIlI[249]);
            bu.add(var1);
            0;
        }
    }

    private static String llIlllIIlIllI(String var2, String var18) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIIIIIlIIlI[5], var12);
            return new String(var17.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static String llIlllIIlIlll(String var11, String var24) {
        try {
            SecretKeySpec var26 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), lIIIIIlIIlI[22]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIIIIIlIIlI[5], var26);
            return new String(var4.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    @Override
    public String U() {
        return lIIIIIIlllI[lIIIIIlIIlI[250]];
    }

    private static boolean llIlllIlIllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlllIlIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIlIlllI(Object object) {
        return object == null;
    }

    private static boolean llIlllIlIllIl(int n2, int n3) {
        return n2 <= n3;
    }
}

