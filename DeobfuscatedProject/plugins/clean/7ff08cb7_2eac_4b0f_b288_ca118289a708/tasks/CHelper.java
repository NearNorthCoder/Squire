/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.HHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.ALHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.ASHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.GHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.HHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.JHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.MHelper;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class CHelper
implements ab {
    static  boolean eE;
    static  boolean eG;
    static  boolean ex;
    public static final  WorldPoint em;
    public static  String dc;
    public static  String[] cG;
    static  boolean eA;
    static  boolean eK;
    public static final  WorldPoint eo;
    
    public static final  WorldPoint en;
    static  boolean ez;
    static  boolean eJ;
    public static final  WorldPoint et;
    
    static  boolean eB;
    static  boolean eD;
    public static  boolean cL;
    public static final  WorldPoint er;
    public static final  WorldPoint eq;
    static  boolean eH;
    static  boolean eC;
    public static  String h;
    public static final  WorldPoint eu;
    public static final  WorldPoint ev;
    public static  List<d> bx;
    static  boolean eM;
    static  boolean ey;
    static  int ew;
    static  boolean eL;
    static  boolean eF;
    static  boolean eI;
    public static final  WorldPoint ep;
    public static  boolean bv;
    static  int dk;
    public static final  WorldPoint es;

    static {
        C.llIlIIIllIIl();
        C.llIlIIIllIII();
        em = new WorldPoint(llllIlIlI[130], llllIlIlI[188], llllIlIlI[1]);
        en = new WorldPoint(llllIlIlI[189], llllIlIlI[190], llllIlIlI[0]);
        eo = new WorldPoint(llllIlIlI[140], llllIlIlI[191], llllIlIlI[0]);
        ep = new WorldPoint(llllIlIlI[86], llllIlIlI[192], llllIlIlI[4]);
        eq = new WorldPoint(llllIlIlI[193], llllIlIlI[194], llllIlIlI[1]);
        er = new WorldPoint(llllIlIlI[195], llllIlIlI[196], llllIlIlI[1]);
        es = new WorldPoint(llllIlIlI[197], llllIlIlI[198], llllIlIlI[0]);
        et = new WorldPoint(llllIlIlI[142], llllIlIlI[191], llllIlIlI[0]);
        eu = new WorldPoint(llllIlIlI[149], llllIlIlI[199], llllIlIlI[3]);
        ev = new WorldPoint(llllIlIlI[86], llllIlIlI[131], llllIlIlI[1]);
        bx = new ArrayList<d>();
        String[] stringArray = new String[llllIlIlI[30]];
        stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[200]];
        stringArray[C.llllIlIlI[0]] = llllIlIII[llllIlIlI[201]];
        stringArray[C.llllIlIlI[3]] = llllIlIII[llllIlIlI[202]];
        stringArray[C.llllIlIlI[4]] = llllIlIII[llllIlIlI[203]];
        stringArray[C.llllIlIlI[6]] = llllIlIII[llllIlIlI[204]];
        stringArray[C.llllIlIlI[12]] = llllIlIII[llllIlIlI[114]];
        stringArray[C.llllIlIlI[19]] = llllIlIII[llllIlIlI[205]];
        stringArray[C.llllIlIlI[23]] = llllIlIII[llllIlIlI[206]];
        stringArray[C.llllIlIlI[25]] = llllIlIII[llllIlIlI[207]];
        stringArray[C.llllIlIlI[27]] = llllIlIII[llllIlIlI[208]];
        stringArray[C.llllIlIlI[16]] = llllIlIII[llllIlIlI[209]];
        stringArray[C.llllIlIlI[29]] = llllIlIII[llllIlIlI[210]];
        stringArray[C.llllIlIlI[24]] = llllIlIII[llllIlIlI[211]];
        cG = stringArray;
        ew = llllIlIlI[35];
        dc = llllIlIII[llllIlIlI[212]];
        h = "Grand Tree " + dc;
    }

    private static boolean llIlIIIllllI(Object object) {
        return object != null;
    }

    private static boolean llIlIIIlllll(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIIIlllII(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIIIlllIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int af() {
        try {
            C.bu();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 > 1) {
            return (0x7E ^ 0x25) & ~(0xE1 ^ 0xBA);
        }
        return llllIlIlI[82];
    }

    private static boolean llIlIIlIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean ae() {
        return llllIlIlI[1];
    }

    private static boolean llIlIIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (C.llIlIIlIIIll(e.j(ew), llllIlIlI[186])) {
            bl = llllIlIlI[0];

            if (1 < 1) {
                return ((0x58 ^ 0x52 ^ (0x3E ^ 0x14)) & (0x28 ^ 0x2C ^ (0x47 ^ 0x63) ^ -1)) != 0;
            }
        } else {
            bl = llllIlIlI[1];
        }
        return bl;
    }

    @Override
    public String ag() {
        return h;
    }

    private static boolean llIlIIIllIlI(int n2) {
        return n2 != 0;
    }

    private static void llIlIIIllIII() {
        llllIlIII = new String[llllIlIlI[213]];
        C.llllIlIII[C.llllIlIlI[1]] = "Finished buying items, switching back to quest";
        C.llllIlIII[C.llllIlIlI[0]] = "- Agility";
        C.llllIlIII[C.llllIlIlI[3]] = "t$}ۈĄ6";
        C.llllIlIII[C.llllIlIlI[4]] = "Nav to bank";
        C.llllIlIII[C.llllIlIlI[6]] = "Handling banking";
        C.llllIlIII[C.llllIlIlI[12]] = "We are missing quest supplies, switching to BUYING";
        C.llllIlIII[C.llllIlIlI[19]] = "We are missing quest supplies, switching to BUYING";
        C.llllIlIII[C.llllIlIlI[23]] = "Drink";
        C.llllIlIII[C.llllIlIlI[25]] = "Eat";
        C.llllIlIII[C.llllIlIlI[27]] = "Nav to start";
        C.llllIlIII[C.llllIlIlI[16]] = "King Narnode Shareen";
        C.llllIlIII[C.llllIlIlI[29]] = "Hazelmere's scroll";
        C.llllIlIII[C.llllIlIlI[24]] = "Nav to hazelmere";
        C.llllIlIII[C.llllIlIlI[30]] = "Hazelmere";
        C.llllIlIII[C.llllIlIlI[31]] = "Hazelmere's scroll";
        C.llllIlIII[C.llllIlIlI[26]] = "Nav to start";
        C.llllIlIII[C.llllIlIlI[32]] = "Break";
        C.llllIlIII[C.llllIlIlI[37]] = "King Narnode Shareen";
        C.llllIlIII[C.llllIlIlI[39]] = "Nav to glough";
        C.llllIlIII[C.llllIlIlI[40]] = "Glough";
        C.llllIlIII[C.llllIlIlI[28]] = "Glough";
        C.llllIlIII[C.llllIlIlI[41]] = "Nav to start";
        C.llllIlIII[C.llllIlIlI[42]] = "King Narnode Shareen";
        C.llllIlIII[C.llllIlIlI[43]] = "Nav to charlie";
        C.llllIlIII[C.llllIlIlI[44]] = "Charlie";
        C.llllIlIII[C.llllIlIlI[2]] = "Nav to glough";
        C.llllIlIII[C.llllIlIlI[46]] = "Ladder";
        C.llllIlIII[C.llllIlIlI[47]] = "Ladder";
        C.llllIlIII[C.llllIlIlI[48]] = "Climb-down";
        C.llllIlIII[C.llllIlIlI[49]] = "Search cupbaord";
        C.llllIlIII[C.llllIlIlI[38]] = "Cupboard";
        C.llllIlIII[C.llllIlIlI[50]] = "Open";
        C.llllIlIII[C.llllIlIlI[51]] = "Cupboard";
        C.llllIlIII[C.llllIlIlI[52]] = "Open";
        C.llllIlIII[C.llllIlIlI[53]] = "Cupboard";
        C.llllIlIII[C.llllIlIlI[54]] = "Search";
        C.llllIlIII[C.llllIlIlI[55]] = "Cupboard";
        C.llllIlIII[C.llllIlIlI[56]] = "Search";
        C.llllIlIII[C.llllIlIlI[58]] = "Talk";
        C.llllIlIII[C.llllIlIlI[59]] = "Glough";
        C.llllIlIII[C.llllIlIlI[36]] = "Charlie";
        C.llllIlIII[C.llllIlIlI[63]] = "Talk to pilot";
        C.llllIlIII[C.llllIlIlI[64]] = "Captain Errdo";
        C.llllIlIII[C.llllIlIlI[66]] = "Nav to gate";
        C.llllIlIII[C.llllIlIlI[67]] = "Gate";
        C.llllIlIII[C.llllIlIlI[68]] = "Open";
        C.llllIlIII[C.llllIlIlI[69]] = "Nav to foreman";
        C.llllIlIII[C.llllIlIlI[70]] = "Foreman";
        C.llllIlIII[C.llllIlIlI[71]] = "Attack";
        C.llllIlIII[C.llllIlIlI[73]] = "Lumber order";
        C.llllIlIII[C.llllIlIlI[22]] = "Lumber order";
        C.llllIlIII[C.llllIlIlI[74]] = "Take";
        C.llllIlIII[C.llllIlIlI[75]] = "Lumber order";
        C.llllIlIII[C.llllIlIlI[76]] = "Nav to charlie";
        C.llllIlIII[C.llllIlIlI[77]] = "Break";
        C.llllIlIII[C.llllIlIlI[78]] = "Ladder";
        C.llllIlIII[C.llllIlIlI[79]] = "Ladder";
        C.llllIlIII[C.llllIlIlI[80]] = "Climb-up";
        C.llllIlIII[C.llllIlIlI[81]] = "Charlie";
        C.llllIlIII[C.llllIlIlI[83]] = "Glough's key";
        C.llllIlIII[C.llllIlIlI[45]] = "Nav to anita";
        C.llllIlIII[C.llllIlIlI[84]] = "Ladder";
        C.llllIlIII[C.llllIlIlI[85]] = "Climb-down";
        C.llllIlIII[C.llllIlIlI[88]] = "Anita";
        C.llllIlIII[C.llllIlIlI[89]] = "Staircase";
        C.llllIlIII[C.llllIlIlI[90]] = "Climb-up";
        C.llllIlIII[C.llllIlIlI[91]] = "Glough's key";
        C.llllIlIII[C.llllIlIlI[92]] = "Staircase";
        C.llllIlIII[C.llllIlIlI[93]] = "Climb-down";
        C.llllIlIII[C.llllIlIlI[95]] = "Staircase";
        C.llllIlIII[C.llllIlIlI[57]] = "Climb-down";
        C.llllIlIII[C.llllIlIlI[96]] = "Nav to glough";
        C.llllIlIII[C.llllIlIlI[97]] = "Closed chest";
        C.llllIlIII[C.llllIlIlI[98]] = "Glough's key";
        C.llllIlIII[C.llllIlIlI[99]] = "Closed chest";
        C.llllIlIII[C.llllIlIlI[101]] = "Nav to start";
        C.llllIlIII[C.llllIlIlI[102]] = "King Narnode Shareen";
        C.llllIlIII[C.llllIlIlI[104]] = "Nav to twigs tile";
        C.llllIlIII[C.llllIlIlI[105]] = "Solving puzzle";
        C.llllIlIII[C.llllIlIlI[115]] = "Go down";
        C.llllIlIII[C.llllIlIlI[62]] = "Trapdoor";
        C.llllIlIII[C.llllIlIlI[116]] = "Climb-down";
        C.llllIlIII[C.llllIlIlI[117]] = "Black demon";
        C.llllIlIII[C.llllIlIlI[120]] = "Drink";
        C.llllIlIII[C.llllIlIlI[121]] = "Black demon";
        C.llllIlIII[C.llllIlIlI[122]] = "Attack";
        C.llllIlIII[C.llllIlIlI[124]] = "Nav to king underground";
        C.llllIlIII[C.llllIlIlI[125]] = "King Narnode Shareen";
        C.llllIlIII[C.llllIlIlI[126]] = "Daconia rock";
        C.llllIlIII[C.llllIlIlI[127]] = "Find rock";
        C.llllIlIII[C.llllIlIlI[72]] = "Daconia rock";
        C.llllIlIII[C.llllIlIlI[128]] = "Nav to king underground";
        C.llllIlIII[C.llllIlIlI[129]] = "King Narnode Shareen";
        C.llllIlIII[C.llllIlIlI[132]] = "Root";
        C.llllIlIII[C.llllIlIlI[133]] = "Search";
        C.llllIlIII[C.llllIlIlI[135]] = "Root";
        C.llllIlIII[C.llllIlIlI[136]] = "Search";
        C.llllIlIII[C.llllIlIlI[138]] = "Root";
        C.llllIlIII[C.llllIlIlI[139]] = "Search";
        C.llllIlIII[C.llllIlIlI[141]] = "Root";
        C.llllIlIII[C.llllIlIlI[82]] = "Search";
        C.llllIlIII[C.llllIlIlI[144]] = "Root";
        C.llllIlIII[C.llllIlIlI[145]] = "Search";
        C.llllIlIII[C.llllIlIlI[147]] = "Root";
        C.llllIlIII[C.llllIlIlI[148]] = "Search";
        C.llllIlIII[C.llllIlIlI[151]] = "Root";
        C.llllIlIII[C.llllIlIlI[152]] = "Search";
        C.llllIlIII[C.llllIlIlI[155]] = "Root";
        C.llllIlIII[C.llllIlIlI[156]] = "Search";
        C.llllIlIII[C.llllIlIlI[159]] = "Root";
        C.llllIlIII[C.llllIlIlI[100]] = "Search";
        C.llllIlIII[C.llllIlIlI[162]] = "Root";
        C.llllIlIII[C.llllIlIlI[163]] = "Search";
        C.llllIlIII[C.llllIlIlI[165]] = "Root";
        C.llllIlIII[C.llllIlIlI[166]] = "Search";
        C.llllIlIII[C.llllIlIlI[168]] = "Root";
        C.llllIlIII[C.llllIlIlI[169]] = "Search";
        C.llllIlIII[C.llllIlIlI[171]] = "Root";
        C.llllIlIII[C.llllIlIlI[172]] = "Search";
        C.llllIlIII[C.llllIlIlI[174]] = "Root";
        C.llllIlIII[C.llllIlIlI[103]] = "Search";
        C.llllIlIII[C.llllIlIlI[177]] = "Root";
        C.llllIlIII[C.llllIlIlI[178]] = "Search";
        C.llllIlIII[C.llllIlIlI[179]] = "Daconia rock";
        C.llllIlIII[C.llllIlIlI[187]] = "ring of wealth (";
        C.llllIlIII[C.llllIlIlI[200]] = "Yes.";
        C.llllIlIII[C.llllIlIlI[201]] = "You seem worried, what's up?";
        C.llllIlIII[C.llllIlIlI[202]] = "I think so!";
        C.llllIlIII[C.llllIlIlI[203]] = "A man came to me with the King's seal.";
        C.llllIlIII[C.llllIlIlI[204]] = "I gave the man Daconia rocks.";
        C.llllIlIII[C.llllIlIlI[114]] = "And Daconia rocks will kill the tree!";
        C.llllIlIII[C.llllIlIlI[205]] = "None of the above.";
        C.llllIlIII[C.llllIlIlI[206]] = "Take me to Karamja please!";
        C.llllIlIII[C.llllIlIlI[207]] = "Glough sent me.";
        C.llllIlIII[C.llllIlIlI[208]] = "Ka.";
        C.llllIlIII[C.llllIlIlI[209]] = "Lu.";
        C.llllIlIII[C.llllIlIlI[210]] = "Min.";
        C.llllIlIII[C.llllIlIlI[211]] = "I suppose so.";
        C.llllIlIII[C.llllIlIlI[212]] = C.llIlIIIIIlll("J/Jw1fnH7NY=", "ZUBKq");
    }

    private static boolean llIlIIlIIlII(Object object) {
        return object == null;
    }

    private static boolean llIlIIlIIIlI(int n2, int n3) {
        return n2 != n3;
    }

    public static void bv() {
        if (C.llIlIIIlllII(ex ? 1 : 0) && C.llIlIIIlllII(g.M() ? 1 : 0)) {
            if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[130], llllIlIlI[131], llllIlIlI[1])), llllIlIlI[3])) {
                Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlI[130], llllIlIlI[131], llllIlIlI[1]));

                Time.sleepTicks((int)llllIlIlI[0]);

            }
            if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[130], llllIlIlI[131], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llllIlIlI[3]);

                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[132]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[133]]);
                    Time.sleepTicks((int)llllIlIlI[3]);

                    ex = llllIlIlI[0];
                }
                g.a(cG);
            }
        }
        if (C.llIlIIIlllII(ey ? 1 : 0) && C.llIlIIIllIlI(ex ? 1 : 0) && C.llIlIIIlllII(g.M() ? 1 : 0)) {
            if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[60], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIllIlI(Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlI[60], llllIlIlI[134], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llllIlIlI[0]);

            }
            if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[60], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llllIlIlI[3]);

                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[135]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[136]]);
                    Time.sleepTicks((int)llllIlIlI[3]);

                    ey = llllIlIlI[0];
                }
                g.a(cG);
            }
        }
        if (C.llIlIIIlllII(ez ? 1 : 0) && C.llIlIIIllIlI(ey ? 1 : 0) && C.llIlIIIlllII(g.M() ? 1 : 0)) {
            if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[137], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIllIlI(Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlI[137], llllIlIlI[134], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llllIlIlI[0]);

            }
            if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[137], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llllIlIlI[3]);

                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[138]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[139]]);
                    Time.sleepTicks((int)llllIlIlI[3]);

                    ez = llllIlIlI[0];
                }
                g.a(cG);
            }
        }
        if (C.llIlIIIlllII(eA ? 1 : 0) && C.llIlIIIllIlI(ez ? 1 : 0) && C.llIlIIIlllII(g.M() ? 1 : 0)) {
            if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[140], llllIlIlI[131], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIllIlI(Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlI[140], llllIlIlI[131], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llllIlIlI[0]);

            }
            if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[140], llllIlIlI[131], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llllIlIlI[3]);

                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[141]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[82]]);
                    Time.sleepTicks((int)llllIlIlI[3]);

                    eA = llllIlIlI[0];
                }
                g.a(cG);
            }
        }
        if (C.llIlIIIlllII(eB ? 1 : 0) && C.llIlIIIllIlI(eA ? 1 : 0) && C.llIlIIIlllII(g.M() ? 1 : 0)) {
            if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[142], llllIlIlI[143], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIllIlI(Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlI[142], llllIlIlI[143], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llllIlIlI[0]);

            }
            if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[142], llllIlIlI[143], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llllIlIlI[3]);

                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[144]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[145]]);
                    Time.sleepTicks((int)llllIlIlI[3]);

                    eB = llllIlIlI[0];
                }
                g.a(cG);
            }
        }
        if (C.llIlIIIlllII(eC ? 1 : 0) && C.llIlIIIllIlI(eB ? 1 : 0) && C.llIlIIIlllII(g.M() ? 1 : 0)) {
            if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[146], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIllIlI(Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlI[146], llllIlIlI[134], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llllIlIlI[0]);

            }
            if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[146], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llllIlIlI[3]);

                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[147]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[148]]);
                    Time.sleepTicks((int)llllIlIlI[3]);

                    eC = llllIlIlI[0];
                }
                g.a(cG);
            }
        }
        if (C.llIlIIIlllII(eD ? 1 : 0) && C.llIlIIIllIlI(eC ? 1 : 0) && C.llIlIIIlllII(g.M() ? 1 : 0)) {
            if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[149], llllIlIlI[150], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIllIlI(Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlI[149], llllIlIlI[150], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llllIlIlI[0]);

            }
            if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[149], llllIlIlI[150], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llllIlIlI[3]);

                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[151]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[152]]);
                    Time.sleepTicks((int)llllIlIlI[3]);

                    eD = llllIlIlI[0];
                }
                g.a(cG);
            }
        }
        if (C.llIlIIIlllII(eE ? 1 : 0) && C.llIlIIIllIlI(eD ? 1 : 0) && C.llIlIIIlllII(g.M() ? 1 : 0)) {
            if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[153], llllIlIlI[154], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIllIlI(Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlI[153], llllIlIlI[154], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llllIlIlI[0]);

            }
            if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[153], llllIlIlI[154], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llllIlIlI[3]);

                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[155]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[156]]);
                    Time.sleepTicks((int)llllIlIlI[3]);

                    eE = llllIlIlI[0];
                }
                g.a(cG);
            }
        }
        if (C.llIlIIIlllII(eF ? 1 : 0) && C.llIlIIIllIlI(eE ? 1 : 0) && C.llIlIIIlllII(g.M() ? 1 : 0)) {
            if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[157], llllIlIlI[158], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIllIlI(Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlI[157], llllIlIlI[158], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llllIlIlI[0]);

            }
            if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[157], llllIlIlI[158], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llllIlIlI[3]);

                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[159]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[100]]);
                    Time.sleepTicks((int)llllIlIlI[3]);

                    eF = llllIlIlI[0];
                }
                g.a(cG);
            }
        }
        if (C.llIlIIIlllII(eG ? 1 : 0) && C.llIlIIIllIlI(eF ? 1 : 0) && C.llIlIIIlllII(g.M() ? 1 : 0)) {
            if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[160], llllIlIlI[161], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIllIlI(Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlI[160], llllIlIlI[161], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llllIlIlI[0]);

            }
            if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[160], llllIlIlI[161], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llllIlIlI[3]);

                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[162]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[163]]);
                    Time.sleepTicks((int)llllIlIlI[3]);

                    eG = llllIlIlI[0];
                }
                g.a(cG);
            }
        }
        if (C.llIlIIIlllII(eH ? 1 : 0) && C.llIlIIIllIlI(eG ? 1 : 0) && C.llIlIIIlllII(g.M() ? 1 : 0)) {
            if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[164], llllIlIlI[158], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIllIlI(Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlI[164], llllIlIlI[158], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llllIlIlI[0]);

            }
            if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[164], llllIlIlI[158], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llllIlIlI[3]);

                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[165]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[166]]);
                    Time.sleepTicks((int)llllIlIlI[3]);

                    eH = llllIlIlI[0];
                }
                g.a(cG);
            }
        }
        if (C.llIlIIIlllII(eI ? 1 : 0) && C.llIlIIIllIlI(eH ? 1 : 0) && C.llIlIIIlllII(g.M() ? 1 : 0)) {
            if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[109], llllIlIlI[167], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIllIlI(Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlI[109], llllIlIlI[167], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llllIlIlI[0]);

            }
            if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[109], llllIlIlI[167], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llllIlIlI[3]);

                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[168]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[169]]);
                    Time.sleepTicks((int)llllIlIlI[3]);

                    eI = llllIlIlI[0];
                }
                g.a(cG);
            }
        }
        if (C.llIlIIIlllII(eJ ? 1 : 0) && C.llIlIIIllIlI(eI ? 1 : 0) && C.llIlIIIlllII(g.M() ? 1 : 0)) {
            if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[170], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIllIlI(Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlI[170], llllIlIlI[134], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llllIlIlI[0]);

            }
            if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[170], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llllIlIlI[3]);

                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[171]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[172]]);
                    Time.sleepTicks((int)llllIlIlI[3]);

                    eJ = llllIlIlI[0];
                }
                g.a(cG);
            }
        }
        if (C.llIlIIIlllII(eK ? 1 : 0) && C.llIlIIIllIlI(eJ ? 1 : 0) && C.llIlIIIlllII(g.M() ? 1 : 0)) {
            if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[173], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIllIlI(Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlI[173], llllIlIlI[134], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llllIlIlI[0]);

            }
            if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[173], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llllIlIlI[3]);

                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[174]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[103]]);
                    Time.sleepTicks((int)llllIlIlI[3]);

                    eK = llllIlIlI[0];
                }
                g.a(cG);
            }
        }
        if (C.llIlIIIlllII(eL ? 1 : 0) && C.llIlIIIllIlI(eK ? 1 : 0) && C.llIlIIIlllII(g.M() ? 1 : 0)) {
            if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[175], llllIlIlI[176], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIllIlI(Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlI[175], llllIlIlI[176], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llllIlIlI[0]);

            }
            if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[175], llllIlIlI[176], llllIlIlI[1])), llllIlIlI[3]) && C.llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llllIlIlI[3]);

                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[177]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[178]]);
                    Time.sleepTicks((int)llllIlIlI[3]);

                    eL = llllIlIlI[0];
                }
                g.a(cG);
            }
        }
        if (C.llIlIIIllIlI(eL ? 1 : 0)) {
            String[] stringArray = new String[llllIlIlI[0]];
            stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[179]];
            if (C.llIlIIIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                ex = llllIlIlI[1];
                ey = llllIlIlI[1];
                ez = llllIlIlI[1];
                eA = llllIlIlI[1];
                eB = llllIlIlI[1];
                eC = llllIlIlI[1];
                eD = llllIlIlI[1];
                eE = llllIlIlI[1];
                eF = llllIlIlI[1];
                eG = llllIlIlI[1];
                eH = llllIlIlI[1];
                eI = llllIlIlI[1];
                eJ = llllIlIlI[1];
                eK = llllIlIlI[1];
                eL = llllIlIlI[1];
            }
        }
    }

    private static boolean llIlIIlIIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static void Q() {
        block33: {
            d lIlllIllIlIlI;
            block32: {
                block31: {
                    block30: {
                        Object lIlllIllIlIll;
                        block29: {
                            block28: {
                                block27: {
                                    block26: {
                                        block25: {
                                            block24: {
                                                block23: {
                                                    block22: {
                                                        int[] nArray = new int[llllIlIlI[0]];
                                                        nArray[C.llllIlIlI[1]] = llllIlIlI[15];
                                                        if (!C.llIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                        int[] nArray2 = new int[llllIlIlI[0]];
                                                        nArray2[C.llllIlIlI[1]] = llllIlIlI[15];
                                                        if (!C.llIlIIIllIlI(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                        int[] nArray3 = new int[llllIlIlI[0]];
                                                        nArray3[C.llllIlIlI[1]] = llllIlIlI[15];
                                                        if (!C.llIlIIIllIll(Bank.getFirst((int[])nArray3).getQuantity(), llllIlIlI[16])) break block23;
                                                    }
                                                    lIlllIllIlIll = new DHelper(llllIlIlI[15], llllIlIlI[16], e.c(llllIlIlI[180], llllIlIlI[20]));
                                                    bx.add((DHelper) IlllIllIlIll);

                                                }
                                                int[] nArray = new int[llllIlIlI[0]];
                                                nArray[C.llllIlIlI[1]] = llllIlIlI[7];
                                                if (!C.llIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                                int[] nArray4 = new int[llllIlIlI[0]];
                                                nArray4[C.llllIlIlI[1]] = llllIlIlI[7];
                                                if (!C.llIlIIIllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) break block25;
                                                int[] nArray5 = new int[llllIlIlI[0]];
                                                nArray5[C.llllIlIlI[1]] = llllIlIlI[7];
                                                if (!C.llIlIIIllIll(Bank.getFirst((int[])nArray5).getQuantity(), llllIlIlI[181])) break block25;
                                            }
                                            lIlllIllIlIll = new DHelper(llllIlIlI[7], llllIlIlI[181], llllIlIlI[25]);
                                            bx.add((DHelper) IlllIllIlIll);

                                        }
                                        int[] nArray = new int[llllIlIlI[0]];
                                        nArray[C.llllIlIlI[1]] = llllIlIlI[9];
                                        if (!C.llIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                        int[] nArray6 = new int[llllIlIlI[0]];
                                        nArray6[C.llllIlIlI[1]] = llllIlIlI[9];
                                        if (!C.llIlIIIllIlI(Bank.contains((int[])nArray6) ? 1 : 0)) break block27;
                                        int[] nArray7 = new int[llllIlIlI[0]];
                                        nArray7[C.llllIlIlI[1]] = llllIlIlI[9];
                                        if (!C.llIlIIIllIll(Bank.getFirst((int[])nArray7).getQuantity(), llllIlIlI[10])) break block27;
                                    }
                                    lIlllIllIlIll = new DHelper(llllIlIlI[9], llllIlIlI[10], llllIlIlI[25]);
                                    bx.add((DHelper) IlllIllIlIll);

                                }
                                int[] nArray = new int[llllIlIlI[0]];
                                nArray[C.llllIlIlI[1]] = llllIlIlI[11];
                                if (!C.llIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                int[] nArray8 = new int[llllIlIlI[0]];
                                nArray8[C.llllIlIlI[1]] = llllIlIlI[11];
                                if (!C.llIlIIIllIlI(Bank.contains((int[])nArray8) ? 1 : 0)) break block29;
                                int[] nArray9 = new int[llllIlIlI[0]];
                                nArray9[C.llllIlIlI[1]] = llllIlIlI[11];
                                if (!C.llIlIIIllIll(Bank.getFirst((int[])nArray9).getQuantity(), llllIlIlI[12])) break block29;
                            }
                            lIlllIllIlIll = new DHelper(llllIlIlI[11], llllIlIlI[12], llllIlIlI[8]);
                            bx.add((DHelper) IlllIllIlIll);

                        }
                        if (C.llIlIIIlllII(Bank.contains((Predicate)(lIlllIllIlIll = item -> item.getName().toLowerCase().contains(llllIlIII[llllIlIlI[187]]))) ? 1 : 0)) {
                            lIlllIllIlIlI = new DHelper(llllIlIlI[182], llllIlIlI[12], llllIlIlI[183]);
                            bx.add(lIlllIllIlIlI);

                        }
                        int[] nArray = new int[llllIlIlI[0]];
                        nArray[C.llllIlIlI[1]] = llllIlIlI[13];
                        if (!C.llIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                        int[] nArray10 = new int[llllIlIlI[0]];
                        nArray10[C.llllIlIlI[1]] = llllIlIlI[13];
                        if (!C.llIlIIIllIlI(Bank.contains((int[])nArray10) ? 1 : 0)) break block31;
                        int[] nArray11 = new int[llllIlIlI[0]];
                        nArray11[C.llllIlIlI[1]] = llllIlIlI[13];
                        if (!C.llIlIIIllIll(Bank.getFirst((int[])nArray11).getQuantity(), llllIlIlI[6])) break block31;
                    }
                    lIlllIllIlIlI = new DHelper(llllIlIlI[13], llllIlIlI[6], j.ch);
                    bx.add(lIlllIllIlIlI);

                }
                int[] nArray = new int[llllIlIlI[0]];
                nArray[C.llllIlIlI[1]] = llllIlIlI[14];
                if (C.llIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray12 = new int[llllIlIlI[0]];
                    nArray12[C.llllIlIlI[1]] = llllIlIlI[14];
                    if (C.llIlIIIllIll(Bank.getFirst((int[])nArray12).getQuantity(), llllIlIlI[6])) {
                        int[] nArray13 = new int[llllIlIlI[0]];
                        nArray13[C.llllIlIlI[1]] = llllIlIlI[14];
                        lIlllIllIlIlI = new DHelper(llllIlIlI[14], llllIlIlI[6] - Bank.getFirst((int[])nArray13).getQuantity(), llllIlIlI[184]);
                        bx.add(lIlllIllIlIlI);

                    }
                }
                int[] nArray14 = new int[llllIlIlI[0]];
                nArray14[C.llllIlIlI[1]] = llllIlIlI[14];
                if (C.llIlIIIlllII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                    lIlllIllIlIlI = new DHelper(llllIlIlI[14], llllIlIlI[6], llllIlIlI[184]);
                    bx.add(lIlllIllIlIlI);

                }
                int[] nArray15 = new int[llllIlIlI[0]];
                nArray15[C.llllIlIlI[1]] = llllIlIlI[17];
                if (!C.llIlIIIllIlI(Bank.contains((int[])nArray15) ? 1 : 0)) break block32;
                int[] nArray16 = new int[llllIlIlI[0]];
                nArray16[C.llllIlIlI[1]] = llllIlIlI[17];
                if (!C.llIlIIIllIlI(Bank.contains((int[])nArray16) ? 1 : 0)) break block33;
                int[] nArray17 = new int[llllIlIlI[0]];
                nArray17[C.llllIlIlI[1]] = llllIlIlI[17];
                if (!C.llIlIIIllIll(Bank.getFirst((int[])nArray17).getQuantity(), llllIlIlI[26])) break block33;
            }
            lIlllIllIlIlI = new DHelper(llllIlIlI[17], llllIlIlI[36], llllIlIlI[185]);
            bx.add(lIlllIllIlIlI);

        }
    }

        return String.valueOf(lIlllIlIIlllI);
    }

    private static boolean llIlIIlIIIII(int n2, int n3) {
        return n2 > n3;
    }

    public static void bu() {
        block119: {
            BankLocation lIlllIlllIIlI;
            block128: {
                block129: {
                    block120: {
                        block127: {
                            block122: {
                                block126: {
                                    block125: {
                                        block124: {
                                            block123: {
                                                block121: {
                                                    if (C.llIlIIIllIlI(bv ? 1 : 0)) {
                                                        b.a(bx);
                                                        if (C.llIlIIIllIll(bx.size(), llllIlIlI[0])) {
                                                            System.out.println(llllIlIII[llllIlIlI[1]]);
                                                            bv = llllIlIlI[1];
                                                        }
                                                    }
                                                    if (!C.llIlIIIlllII(bv ? 1 : 0)) break block119;
                                                    if (C.llIlIIIllIll(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlI[2])) {
                                                        dc = llllIlIII[llllIlIlI[0]];
                                                        al.dT();
                                                    }
                                                    if (!C.llIlIIIlllII(C.an() ? 1 : 0) || !C.llIlIIIllIll(e.j(ew), llllIlIlI[0]) || !C.llIlIIIlllIl(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlI[2])) break block120;
                                                    dc = llllIlIII[llllIlIlI[3]];
                                                    lIlllIlllIIlI = BankLocation.getNearest();
                                                    if (C.llIlIIIllllI(lIlllIlllIIlI) && C.llIlIIIlllII(lIlllIlllIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                        AccBuilderGWD.c = llllIlIII[llllIlIlI[4]];
                                                        a.a(lIlllIlllIIlI);
                                                    }
                                                    if (!C.llIlIIIllllI(lIlllIlllIIlI) || !C.llIlIIIllIlI(lIlllIlllIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block120;
                                                    if (C.llIlIIIlllII(Bank.isOpen() ? 1 : 0)) {
                                                        a.a();
                                                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlIlI[5]);

                                                    }
                                                    if (!C.llIlIIIllIlI(Bank.isOpen() ? 1 : 0)) break block120;
                                                    AccBuilderGWD.c = llllIlIII[llllIlIlI[6]];
                                                    if (C.llIlIIIlllll(Inventory.getAll().size())) {
                                                        Bank.depositInventory();
                                                        Time.sleepTicks((int)llllIlIlI[6]);

                                                    }
                                                    if (C.llIlIIIlllll(Equipment.getAll().size())) {
                                                        Bank.depositEquipment();
                                                        Time.sleepTicks((int)llllIlIlI[3]);

                                                    }
                                                    while (C.llIlIIIlllII(H.bT() ? 1 : 0)) {
                                                        H.bR();
                                                        Time.sleepTicks((int)llllIlIlI[0]);

                                                        if (2 <= 3) continue;
                                                        return;
                                                    }
                                                    int[] nArray = new int[llllIlIlI[0]];
                                                    nArray[C.llllIlIlI[1]] = llllIlIlI[7];
                                                    if (!C.llIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block121;
                                                    int[] nArray2 = new int[llllIlIlI[0]];
                                                    nArray2[C.llllIlIlI[1]] = llllIlIlI[7];
                                                    if (!C.llIlIIIlllIl(Bank.getFirst((int[])nArray2).getQuantity(), llllIlIlI[8])) break block122;
                                                }
                                                int[] nArray = new int[llllIlIlI[0]];
                                                nArray[C.llllIlIlI[1]] = llllIlIlI[9];
                                                if (!C.llIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block123;
                                                int[] nArray3 = new int[llllIlIlI[0]];
                                                nArray3[C.llllIlIlI[1]] = llllIlIlI[9];
                                                if (!C.llIlIIIlllIl(Bank.getFirst((int[])nArray3).getQuantity(), llllIlIlI[10])) break block122;
                                            }
                                            int[] nArray = new int[llllIlIlI[0]];
                                            nArray[C.llllIlIlI[1]] = llllIlIlI[11];
                                            if (!C.llIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block124;
                                            int[] nArray4 = new int[llllIlIlI[0]];
                                            nArray4[C.llllIlIlI[1]] = llllIlIlI[11];
                                            if (!C.llIlIIIlllIl(Bank.getFirst((int[])nArray4).getQuantity(), llllIlIlI[12])) break block122;
                                        }
                                        int[] nArray = new int[llllIlIlI[0]];
                                        nArray[C.llllIlIlI[1]] = llllIlIlI[13];
                                        if (!C.llIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block125;
                                        int[] nArray5 = new int[llllIlIlI[0]];
                                        nArray5[C.llllIlIlI[1]] = llllIlIlI[13];
                                        if (!C.llIlIIIlllIl(Bank.getFirst((int[])nArray5).getQuantity(), llllIlIlI[6])) break block122;
                                    }
                                    int[] nArray = new int[llllIlIlI[0]];
                                    nArray[C.llllIlIlI[1]] = llllIlIlI[14];
                                    if (!C.llIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block126;
                                    int[] nArray6 = new int[llllIlIlI[0]];
                                    nArray6[C.llllIlIlI[1]] = llllIlIlI[14];
                                    if (!C.llIlIIIlllIl(Bank.getFirst((int[])nArray6).getQuantity(), llllIlIlI[6])) break block122;
                                }
                                int[] nArray = new int[llllIlIlI[0]];
                                nArray[C.llllIlIlI[1]] = llllIlIlI[15];
                                if (!C.llIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block127;
                                int[] nArray7 = new int[llllIlIlI[0]];
                                nArray7[C.llllIlIlI[1]] = llllIlIlI[15];
                                if (!C.llIlIIIllIll(Bank.getFirst((int[])nArray7).getQuantity(), llllIlIlI[16])) break block127;
                            }
                            C.Q();
                            System.out.println(llllIlIII[llllIlIlI[12]]);
                            bv = llllIlIlI[0];
                            return;
                        }
                        int[] nArray = new int[llllIlIlI[6]];
                        nArray[C.llllIlIlI[1]] = llllIlIlI[17];
                        nArray[C.llllIlIlI[0]] = llllIlIlI[11];
                        nArray[C.llllIlIlI[3]] = llllIlIlI[13];
                        nArray[C.llllIlIlI[4]] = llllIlIlI[18];
                        if (C.llIlIIIlllII(e.d(nArray) ? 1 : 0)) {
                            C.Q();
                            System.out.println(llllIlIII[llllIlIlI[19]]);
                            bv = llllIlIlI[0];
                            return;
                        }
                        if (C.llIlIIIlllII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)llllIlIlI[19]);

                        }
                        int[] nArray8 = new int[llllIlIlI[6]];
                        nArray8[C.llllIlIlI[1]] = llllIlIlI[17];
                        nArray8[C.llllIlIlI[0]] = llllIlIlI[11];
                        nArray8[C.llllIlIlI[3]] = llllIlIlI[13];
                        nArray8[C.llllIlIlI[4]] = llllIlIlI[18];
                        if (C.llIlIIIllIlI(e.d(nArray8) ? 1 : 0)) {
                            a.a(llllIlIlI[17], llllIlIlI[16]);
                            a.a(llllIlIlI[13], llllIlIlI[4]);
                            Bank.withdraw((int)llllIlIlI[18], (int)llllIlIlI[5], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Bank.withdraw((int)llllIlIlI[11], (int)llllIlIlI[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Bank.withdraw((int)llllIlIlI[14], (int)llllIlIlI[6], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            a.a(llllIlIlI[15], llllIlIlI[12]);
                            int[] nArray9 = new int[llllIlIlI[0]];
                            nArray9[C.llllIlIlI[1]] = llllIlIlI[9];
                            if (C.llIlIIIllIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llllIlIlI[0]];
                                nArray10[C.llllIlIlI[1]] = llllIlIlI[9];
                                if (C.llIlIIIllIll(Inventory.getCount((int[])nArray10), llllIlIlI[0])) {
                                    Bank.withdraw((int)llllIlIlI[9], (int)llllIlIlI[20], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllIlIlI[0]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllIlIlI[0]];
                                        nArray[C.llllIlIlI[1]] = llllIlIlI[9];
                                        if (C.llIlIIIlllll(Inventory.getCount((int[])nArray))) {
                                            bl = llllIlIlI[0];

                                            if (1 <= 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = llllIlIlI[1];
                                        }
                                        return bl;
                                    }, (int)llllIlIlI[5]);

                                }
                            }
                            int[] nArray11 = new int[llllIlIlI[0]];
                            nArray11[C.llllIlIlI[1]] = llllIlIlI[7];
                            if (C.llIlIIIllIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[llllIlIlI[0]];
                                nArray12[C.llllIlIlI[1]] = llllIlIlI[7];
                                if (C.llIlIIIllIll(Inventory.getCount((int[])nArray12), llllIlIlI[0])) {
                                    Bank.withdraw((int)llllIlIlI[7], (int)llllIlIlI[21], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllIlIlI[0]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllIlIlI[0]];
                                        nArray[C.llllIlIlI[1]] = llllIlIlI[7];
                                        if (C.llIlIIIlllll(Inventory.getCount((int[])nArray))) {
                                            bl = llllIlIlI[0];

                                            if (-(1 ^ (5 ^ 0)) > 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = llllIlIlI[1];
                                        }
                                        return bl;
                                    }, (int)llllIlIlI[5]);

                                }
                            }
                        }
                    }
                    if (C.llIlIIIllIlI(Inventory.contains((int[])f.bc) ? 1 : 0) && C.llIlIIIllIll(Movement.getRunEnergy(), llllIlIlI[22])) {
                        Inventory.getFirst((int[])f.bc).interact(llllIlIII[llllIlIlI[23]]);
                        Time.sleepTicks((int)llllIlIlI[0]);

                    }
                    if (C.llIlIIIlllIl(Combat.getMissingHealth(), llllIlIlI[24])) {
                        int[] nArray = new int[llllIlIlI[0]];
                        nArray[C.llllIlIlI[1]] = llllIlIlI[15];
                        if (C.llIlIIIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray13 = new int[llllIlIlI[0]];
                            nArray13[C.llllIlIlI[1]] = llllIlIlI[15];
                            Inventory.getFirst((int[])nArray13).interact(llllIlIII[llllIlIlI[25]]);
                            Time.sleepTicks((int)llllIlIlI[3]);

                        }
                    }
                    if (C.llIlIIIllIlI(C.an() ? 1 : 0) && C.llIlIIIlllII(e.j(ew))) {
                        -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.h.X();
                        if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[4]) && C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[26])) {
                            AccBuilderGWD.c = llllIlIII[llllIlIlI[27]];
                            if (C.llIlIIIllIlI(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)ev);

                            Time.sleepTicks((int)llllIlIlI[0]);

                        }
                        if (!C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[4]) || C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[26])) {
                            g.a(llllIlIII[llllIlIlI[16]], cG);
                        }
                    }
                    if (!C.llIlIIlIIIlI(e.j(ew), llllIlIlI[16]) || C.llIlIIlIIIll(e.j(ew), llllIlIlI[28])) {
                        String[] stringArray = new String[llllIlIlI[0]];
                        stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[29]];
                        if (C.llIlIIIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            if (!C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(en), llllIlIlI[4]) || C.llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0]) && C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(en), llllIlIlI[4])) {
                                AccBuilderGWD.c = llllIlIII[llllIlIlI[24]];
                                Movement.walkTo((WorldPoint)en);

                                Time.sleepTicks((int)llllIlIlI[0]);

                            }
                            if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(en), llllIlIlI[4]) && C.llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0])) {
                                g.a(llllIlIII[llllIlIlI[30]], cG);
                            }
                        }
                        String[] stringArray2 = new String[llllIlIlI[0]];
                        stringArray2[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[31]];
                        if (C.llIlIIIllIlI(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                            if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[4]) && C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[26])) {
                                AccBuilderGWD.c = llllIlIII[llllIlIlI[26]];
                                if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(en), llllIlIlI[28])) {
                                    int[] nArray = new int[llllIlIlI[0]];
                                    nArray[C.llllIlIlI[1]] = llllIlIlI[17];
                                    Inventory.getFirst((int[])nArray).interact(llllIlIII[llllIlIlI[32]]);
                                    Time.sleepTicks((int)llllIlIlI[12]);

                                }
                                lIlllIlllIIlI = new WorldPoint(llllIlIlI[33], llllIlIlI[34], llllIlIlI[1]);
                                if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(b.K), llllIlIlI[35]) && C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlllIlllIIlI), llllIlIlI[25])) {
                                    Movement.walkTo((WorldPoint)lIlllIlllIIlI);

                                    Time.sleepTicks((int)llllIlIlI[0]);

                                }
                                if ((!C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlllIlllIIlI), llllIlIlI[25]) || C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[35])) && C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(en), llllIlIlI[36])) {
                                    Movement.walkTo((WorldPoint)em);

                                    Time.sleepTicks((int)llllIlIlI[0]);

                                }
                            }
                            if (!C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[4]) || C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[26])) {
                                g.a(llllIlIII[llllIlIlI[37]], cG);
                            }
                        }
                    }
                    if (!C.llIlIIlIIIll(e.j(ew), llllIlIlI[38])) break block128;
                    if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(eo), llllIlIlI[23]) && C.llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0])) {
                        AccBuilderGWD.c = llllIlIII[llllIlIlI[39]];
                        Movement.walkTo((WorldPoint)eo);

                        Time.sleepTicks((int)llllIlIlI[0]);

                    }
                    if (!C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(eo), llllIlIlI[26])) break block129;
                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[40]];
                    if (!C.llIlIIIllllI(NPCs.getNearest((String[])stringArray))) break block128;
                }
                g.a(llllIlIII[llllIlIlI[28]], cG);
            }
            if (C.llIlIIlIIIll(e.j(ew), llllIlIlI[36])) {
                if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[4]) && C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[26])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[41]];
                    Movement.walkTo((WorldPoint)ev);

                    Time.sleepTicks((int)llllIlIlI[0]);

                }
                if (!C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[4]) || C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[26])) {
                    g.a(llllIlIII[llllIlIlI[42]], cG);
                }
            }
            if (C.llIlIIlIIIll(e.j(ew), llllIlIlI[22])) {
                if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ep), llllIlIlI[4]) && C.llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[4])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[43]];
                    Movement.walkTo((WorldPoint)ep);

                    Time.sleepTicks((int)llllIlIlI[0]);

                }
                if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ep), llllIlIlI[4]) && C.llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[4])) {
                    g.a(llllIlIII[llllIlIlI[44]], cG);
                }
            }
            if (C.llIlIIlIIIll(e.j(ew), llllIlIlI[45])) {
                if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(eo), llllIlIlI[23]) && C.llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[2]];
                    Movement.walkTo((WorldPoint)eo);

                    Time.sleepTicks((int)llllIlIlI[0]);

                }
                if (!C.llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0]) || C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(eo), llllIlIlI[23])) {
                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[46]];
                    if (C.llIlIIIllllI(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray3 = new String[llllIlIlI[0]];
                        stringArray3[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[47]];
                        TileObjects.getNearest((String[])stringArray3).interact(llllIlIII[llllIlIlI[48]]);
                        Time.sleepTicks((int)llllIlIlI[0]);

                    }
                }
                if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(eo), llllIlIlI[23])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[49]];
                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[38]];
                    String[] stringArray4 = new String[llllIlIlI[0]];
                    stringArray4[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[50]];
                    if (C.llIlIIIllIlI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray4) ? 1 : 0)) {
                        String[] stringArray5 = new String[llllIlIlI[0]];
                        stringArray5[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[51]];
                        TileObjects.getNearest((String[])stringArray5).interact(llllIlIII[llllIlIlI[52]]);
                        Time.sleepTicks((int)llllIlIlI[4]);

                    }
                    String[] stringArray6 = new String[llllIlIlI[0]];
                    stringArray6[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[53]];
                    String[] stringArray7 = new String[llllIlIlI[0]];
                    stringArray7[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[54]];
                    if (C.llIlIIIllIlI(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                        String[] stringArray8 = new String[llllIlIlI[0]];
                        stringArray8[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[55]];
                        TileObjects.getNearest((String[])stringArray8).interact(llllIlIII[llllIlIlI[56]]);
                        Time.sleepTicks((int)llllIlIlI[4]);

                    }
                }
            }
            if (C.llIlIIlIIIll(e.j(ew), llllIlIlI[57])) {
                AccBuilderGWD.c = llllIlIII[llllIlIlI[58]];
                g.a(llllIlIII[llllIlIlI[59]], cG);
                if (C.llIlIIIllIlI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllIlIlI[60], llllIlIlI[61], llllIlIlI[4])) ? 1 : 0)) {
                    g.a(llllIlIII[llllIlIlI[36]], cG);
                }
                g.a(cG);
            }
            if (C.llIlIIlIIIll(e.j(ew), llllIlIlI[62])) {
                if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ep), llllIlIlI[28])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[63]];
                    g.a(llllIlIII[llllIlIlI[64]], cG);
                }
                if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ep), llllIlIlI[28])) {
                    if (C.llIlIIIllIll(Players.getLocal().getWorldLocation().getX(), llllIlIlI[65])) {
                        if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(eq), llllIlIlI[4])) {
                            AccBuilderGWD.c = llllIlIII[llllIlIlI[66]];
                            Movement.walkTo((WorldPoint)eq);

                            Time.sleepTicks((int)llllIlIlI[0]);

                        }
                        if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(eq), llllIlIlI[4])) {
                            if (C.llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[llllIlIlI[0]];
                                stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[67]];
                                TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[68]]);
                                Time.sleepTicks((int)llllIlIlI[4]);

                            }
                            g.a(cG);
                        }
                    }
                    if (C.llIlIIIlllIl(Players.getLocal().getWorldLocation().getX(), llllIlIlI[65])) {
                        if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(er), llllIlIlI[19])) {
                            AccBuilderGWD.c = llllIlIII[llllIlIlI[69]];
                            Movement.walkTo((WorldPoint)er);

                            Time.sleepTicks((int)llllIlIlI[0]);

                        }
                        if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(er), llllIlIlI[19])) {
                            if (C.llIlIIIlllII(m.ap() ? 1 : 0)) {
                                m.aq();
                            }
                            if (C.llIlIIlIIlII(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[llllIlIlI[0]];
                                stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[70]];
                                NPCs.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[71]]);
                                Time.sleepTicks((int)llllIlIlI[0]);

                            }
                        }
                    }
                }
            }
            if (C.llIlIIlIIIll(e.j(ew), llllIlIlI[72])) {
                String[] stringArray = new String[llllIlIlI[0]];
                stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[73]];
                if (C.llIlIIIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray9 = new String[llllIlIlI[0]];
                    stringArray9[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[22]];
                    TileItems.getNearest((String[])stringArray9).interact(llllIlIII[llllIlIlI[74]]);
                    Time.sleepTicks((int)llllIlIlI[6]);

                }
                String[] stringArray10 = new String[llllIlIlI[0]];
                stringArray10[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[75]];
                if (C.llIlIIIllIlI(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                    if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ep), llllIlIlI[4]) && C.llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[4])) {
                        AccBuilderGWD.c = llllIlIII[llllIlIlI[76]];
                        lIlllIlllIIlI = new WorldPoint(llllIlIlI[33], llllIlIlI[34], llllIlIlI[1]);
                        if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(er), llllIlIlI[28])) {
                            int[] nArray = new int[llllIlIlI[0]];
                            nArray[C.llllIlIlI[1]] = llllIlIlI[17];
                            Inventory.getFirst((int[])nArray).interact(llllIlIII[llllIlIlI[77]]);
                            Time.sleepTicks((int)llllIlIlI[12]);

                        }
                        if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(b.K), llllIlIlI[35]) && C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlllIlllIIlI), llllIlIlI[25])) {
                            Movement.walkTo((WorldPoint)lIlllIlllIIlI);

                            Time.sleepTicks((int)llllIlIlI[0]);

                        }
                        if ((!C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlllIlllIIlI), llllIlIlI[25]) || C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[35])) && C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(er), llllIlIlI[36])) {
                            Movement.walkTo((WorldPoint)ep);

                            Time.sleepTicks((int)llllIlIlI[0]);

                        }
                        if (!C.llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[3]) || C.llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0])) {
                            String[] stringArray11 = new String[llllIlIlI[0]];
                            stringArray11[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[78]];
                            if (C.llIlIIIllllI(TileObjects.getNearest((String[])stringArray11))) {
                                String[] stringArray12 = new String[llllIlIlI[0]];
                                stringArray12[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[79]];
                                TileObjects.getNearest((String[])stringArray12).interact(llllIlIII[llllIlIlI[80]]);
                                Time.sleepTicks((int)llllIlIlI[4]);

                            }
                        }
                    }
                    if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ep), llllIlIlI[4]) && C.llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[4])) {
                        g.a(llllIlIII[llllIlIlI[81]], cG);
                    }
                }
            }
            if (C.llIlIIlIIIll(e.j(ew), llllIlIlI[82])) {
                String[] stringArray = new String[llllIlIlI[0]];
                stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[83]];
                if (C.llIlIIIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(es), llllIlIlI[12])) {
                        AccBuilderGWD.c = llllIlIII[llllIlIlI[45]];
                        if (!C.llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[4]) || !C.llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[3]) || C.llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0])) {
                            String[] stringArray13 = new String[llllIlIlI[0]];
                            stringArray13[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[84]];
                            TileObjects.getNearest((String[])stringArray13).interact(llllIlIII[llllIlIlI[85]]);
                            Time.sleepTicks((int)llllIlIlI[4]);

                        }
                        if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[12])) {
                            lIlllIlllIIlI = new WorldPoint(llllIlIlI[86], llllIlIlI[87], llllIlIlI[1]);
                            Movement.walkTo((WorldPoint)lIlllIlllIIlI);

                        }
                        if (C.llIlIIIlllII(Players.getLocal().getWorldLocation().getPlane()) && C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[12])) {
                            Movement.walkTo((WorldPoint)es);

                            Time.sleepTicks((int)llllIlIlI[0]);

                        }
                    }
                    if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(es), llllIlIlI[12])) {
                        g.a(llllIlIII[llllIlIlI[88]], cG);
                        if (C.llIlIIIlllII(Players.getLocal().getWorldLocation().getPlane())) {
                            String[] stringArray14 = new String[llllIlIlI[0]];
                            stringArray14[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[89]];
                            TileObjects.getNearest((String[])stringArray14).interact(llllIlIII[llllIlIlI[90]]);
                            Time.sleepTicks((int)llllIlIlI[3]);

                        }
                    }
                }
                String[] stringArray15 = new String[llllIlIlI[0]];
                stringArray15[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[91]];
                if (C.llIlIIIllIlI(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                    if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(es), llllIlIlI[12]) && C.llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0])) {
                        String[] stringArray16 = new String[llllIlIlI[0]];
                        stringArray16[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[92]];
                        TileObjects.getNearest((String[])stringArray16).interact(llllIlIII[llllIlIlI[93]]);
                        Time.sleepTicks((int)llllIlIlI[3]);

                    }
                    if (C.llIlIIIllIlI((lIlllIlllIIlI = new WorldArea(llllIlIlI[94], llllIlIlI[87], llllIlIlI[37], llllIlIlI[2], llllIlIlI[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray17 = new String[llllIlIlI[0]];
                        stringArray17[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[95]];
                        TileObjects.getNearest((String[])stringArray17).interact(llllIlIII[llllIlIlI[57]]);
                        Time.sleepTicks((int)llllIlIlI[3]);

                    }
                    if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(eo), llllIlIlI[24]) && C.llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0])) {
                        AccBuilderGWD.c = llllIlIII[llllIlIlI[96]];
                        Movement.walkTo((WorldPoint)eo);

                        Time.sleepTicks((int)llllIlIlI[0]);

                    }
                    if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(eo), llllIlIlI[24]) && C.llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0])) {
                        String[] stringArray18 = new String[llllIlIlI[0]];
                        stringArray18[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[97]];
                        if (C.llIlIIIllllI(TileObjects.getNearest((String[])stringArray18))) {
                            String[] stringArray19 = new String[llllIlIlI[0]];
                            stringArray19[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[98]];
                            String[] stringArray20 = new String[llllIlIlI[0]];
                            stringArray20[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[99]];
                            Inventory.getFirst((String[])stringArray19).useOn(TileObjects.getNearest((String[])stringArray20));
                            Time.sleepTicks((int)llllIlIlI[4]);

                        }
                    }
                    g.a(cG);
                }
            }
            if (C.llIlIIlIIIll(e.j(ew), llllIlIlI[100])) {
                if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[4]) && C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[26])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[101]];
                    Movement.walkTo((WorldPoint)ev);

                    Time.sleepTicks((int)llllIlIlI[0]);

                }
                if (!C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[4]) || C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[26])) {
                    g.a(llllIlIII[llllIlIlI[102]], cG);
                }
            }
            if (C.llIlIIlIIIll(e.j(ew), llllIlIlI[103])) {
                if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(eu), llllIlIlI[12])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[104]];
                    Movement.walkTo((WorldPoint)eu);

                    Time.sleepTicks((int)llllIlIlI[0]);

                }
                if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(eu), llllIlIlI[12])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[105]];
                    int[] nArray = new int[llllIlIlI[0]];
                    nArray[C.llllIlIlI[1]] = llllIlIlI[106];
                    if (C.llIlIIIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray14 = new int[llllIlIlI[0]];
                        nArray14[C.llllIlIlI[1]] = llllIlIlI[106];
                        int[] nArray15 = new int[llllIlIlI[0]];
                        nArray15[C.llllIlIlI[1]] = llllIlIlI[107];
                        Inventory.getFirst((int[])nArray14).useOn(TileObjects.getNearest((int[])nArray15));
                        Time.sleepTicks((int)llllIlIlI[4]);

                    }
                    int[] nArray16 = new int[llllIlIlI[0]];
                    nArray16[C.llllIlIlI[1]] = llllIlIlI[108];
                    if (C.llIlIIIllIlI(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                        int[] nArray17 = new int[llllIlIlI[0]];
                        nArray17[C.llllIlIlI[1]] = llllIlIlI[108];
                        int[] nArray18 = new int[llllIlIlI[0]];
                        nArray18[C.llllIlIlI[1]] = llllIlIlI[109];
                        Inventory.getFirst((int[])nArray17).useOn(TileObjects.getNearest((int[])nArray18));
                        Time.sleepTicks((int)llllIlIlI[4]);

                    }
                    int[] nArray19 = new int[llllIlIlI[0]];
                    nArray19[C.llllIlIlI[1]] = llllIlIlI[110];
                    if (C.llIlIIIllIlI(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                        int[] nArray20 = new int[llllIlIlI[0]];
                        nArray20[C.llllIlIlI[1]] = llllIlIlI[110];
                        int[] nArray21 = new int[llllIlIlI[0]];
                        nArray21[C.llllIlIlI[1]] = llllIlIlI[111];
                        Inventory.getFirst((int[])nArray20).useOn(TileObjects.getNearest((int[])nArray21));
                        Time.sleepTicks((int)llllIlIlI[4]);

                    }
                    int[] nArray22 = new int[llllIlIlI[0]];
                    nArray22[C.llllIlIlI[1]] = llllIlIlI[112];
                    if (C.llIlIIIllIlI(Inventory.contains((int[])nArray22) ? 1 : 0)) {
                        int[] nArray23 = new int[llllIlIlI[0]];
                        nArray23[C.llllIlIlI[1]] = llllIlIlI[112];
                        int[] nArray24 = new int[llllIlIlI[0]];
                        nArray24[C.llllIlIlI[1]] = llllIlIlI[113];
                        Inventory.getFirst((int[])nArray23).useOn(TileObjects.getNearest((int[])nArray24));
                        Time.sleepTicks((int)llllIlIlI[4]);

                    }
                }
            }
            if (C.llIlIIlIIIll(e.j(ew), llllIlIlI[114])) {
                if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(eu), llllIlIlI[12]) && C.llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[3])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[115]];
                    String[] stringArray = new String[llllIlIlI[0]];
                    stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[62]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIlIII[llllIlIlI[116]]);
                    Time.sleepTicks((int)llllIlIlI[4]);

                }
                String[] stringArray = new String[llllIlIlI[0]];
                stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[117]];
                if (C.llIlIIIllllI(NPCs.getNearest((String[])stringArray))) {
                    lIlllIlllIIlI = new WorldPoint(llllIlIlI[118], llllIlIlI[119], llllIlIlI[1]);
                    if (C.llIlIIIlllII(Players.getLocal().getWorldLocation().equals((Object)lIlllIlllIIlI) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)lIlllIlllIIlI);

                        Time.sleepTicks((int)llllIlIlI[0]);

                    }
                    if (C.llIlIIIlllII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && C.llIlIIIlllll(Prayers.getPoints()) && C.llIlIIIlllIl(Skills.getLevel((Skill)Skill.PRAYER), llllIlIlI[66])) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    if (C.llIlIIIllIlI(Players.getLocal().getWorldLocation().equals((Object)lIlllIlllIIlI) ? 1 : 0)) {
                        if (C.llIlIIIlllII(m.ap() ? 1 : 0)) {
                            m.aq();
                        }
                        if (C.llIlIIIllIll(Prayers.getPoints(), llllIlIlI[43]) && C.llIlIIIllIlI(Inventory.contains((int[])f.aZ) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aZ).interact(llllIlIII[llllIlIlI[120]]);
                            Time.sleepTicks((int)llllIlIlI[0]);

                        }
                        if (C.llIlIIlIIlII(Players.getLocal().getInteracting())) {
                            String[] stringArray21 = new String[llllIlIlI[0]];
                            stringArray21[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[121]];
                            NPCs.getNearest((String[])stringArray21).interact(llllIlIII[llllIlIlI[122]]);
                            Time.sleepTicks((int)llllIlIlI[3]);

                        }
                    }
                }
                g.a(cG);
            }
            if (C.llIlIIlIIIll(e.j(ew), llllIlIlI[123])) {
                if (C.llIlIIIllIlI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[6])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[124]];
                    Movement.walkTo((WorldPoint)ev);

                    Time.sleepTicks((int)llllIlIlI[0]);

                }
                if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[6])) {
                    g.a(llllIlIII[llllIlIlI[125]], cG);
                }
                g.a(cG);
            }
            if (C.llIlIIlIIIll(e.j(ew), llllIlIlI[35])) {
                String[] stringArray = new String[llllIlIlI[0]];
                stringArray[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[126]];
                if (C.llIlIIIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[127]];
                    C.bv();
                }
                String[] stringArray22 = new String[llllIlIlI[0]];
                stringArray22[C.llllIlIlI[1]] = llllIlIII[llllIlIlI[72]];
                if (C.llIlIIIllIlI(Inventory.contains((String[])stringArray22) ? 1 : 0)) {
                    if (C.llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[6])) {
                        AccBuilderGWD.c = llllIlIII[llllIlIlI[128]];
                        Movement.walkTo((WorldPoint)ev);

                        Time.sleepTicks((int)llllIlIlI[0]);

                    }
                    if (C.llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[6])) {
                        if (C.llIlIIIllIll(dk, llllIlIlI[0])) {
                            as.no += llllIlIlI[0];
                            as.u(AccBuilderGWD.m);
                            dk += llllIlIlI[0];
                            as.no = llllIlIlI[1];
                        }
                        g.a(llllIlIII[llllIlIlI[129]], cG);
                    }
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void lIlllIllIllll;
        int[] nArray = new int[llllIlIlI[6]];
        nArray[C.llllIlIlI[1]] = llllIlIlI[17];
        nArray[C.llllIlIlI[0]] = llllIlIlI[11];
        nArray[C.llllIlIlI[3]] = llllIlIlI[13];
        nArray[C.llllIlIlI[4]] = llllIlIlI[18];
        int[] nArray2 = nArray;
        int lIlllIllIlllI = llllIlIlI[1];
        while (C.llIlIIIllIll(lIlllIllIlllI, ((void)lIlllIllIllll).length)) {
            int[] nArray3 = new int[llllIlIlI[0]];
            nArray3[C.llllIlIlI[1]] = lIlllIllIllll[lIlllIllIlllI];
            if (C.llIlIIIlllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llllIlIlI[1];
            }
            ++lIlllIllIlllI;

            if (((0x64 ^ 6) & ~(0xDD ^ 0xBF)) == 0) continue;
            return false;
        }
        return llllIlIlI[0];
    }
}

