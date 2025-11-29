/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.BHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.CHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.FHelper;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.VHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.YHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.ZHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.BHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.DHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.FHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.GHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.JHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.NHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.OHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.THelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.VHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.XHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.ZHelper;
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
import net.runelite.api.Locatable;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

public class UHelper
implements K {
    static  WorldPoint di;
    static  WorldArea dh;
    private static  int dk;
    
    public static  List<d> bp;
    static  boolean dd;
    public static  boolean bn;
    static  WorldArea dg;
    static  WorldPoint cV;
    static  WorldPoint dj;
    
    static  int dc;
    static  WorldArea df;
    
    private static  String dl;

    private static boolean lIIlIlIIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlIIIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int ad() {
        try {
            u.bc();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 == 0) {
            return (0x4C ^ 0x18) & ~(0x5F ^ 0xB);
        }
        return lIlIlllIIl[100];
    }

    private static boolean lIIlIIlllllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIIllllIlI(int n2) {
        return n2 != 0;
    }

    static {
        u.lIIlIIllllIII();
        u.lIIlIIlllIlII();
        bp = new ArrayList<d>();
        df = new WorldArea(lIlIlllIIl[163], lIlIlllIIl[56], lIlIlllIIl[16], lIlIlllIIl[4], lIlIlllIIl[1]);
        dg = new WorldArea(lIlIlllIIl[164], lIlIlllIIl[165], lIlIlllIIl[166], lIlIlllIIl[142], lIlIlllIIl[1]);
        dh = new WorldArea(lIlIlllIIl[164], lIlIlllIIl[165], lIlIlllIIl[166], lIlIlllIIl[142], lIlIlllIIl[0]);
        cV = new WorldPoint(lIlIlllIIl[167], lIlIlllIIl[168], lIlIlllIIl[1]);
        di = new WorldPoint(lIlIlllIIl[169], lIlIlllIIl[170], lIlIlllIIl[1]);
        dj = new WorldPoint(lIlIlllIIl[171], lIlIlllIIl[172], lIlIlllIIl[1]);
        String[] stringArray = new String[lIlIlllIIl[21]];
        stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[173]];
        stringArray[u.lIlIlllIIl[0]] = lIlIllIllI[lIlIlllIIl[174]];
        stringArray[u.lIlIlllIIl[9]] = lIlIllIllI[lIlIlllIIl[175]];
        stringArray[u.lIlIlllIIl[11]] = lIlIllIllI[lIlIlllIIl[176]];
        stringArray[u.lIlIlllIIl[13]] = lIlIllIllI[lIlIlllIIl[100]];
        stringArray[u.lIlIlllIIl[8]] = lIlIllIllI[lIlIlllIIl[177]];
        stringArray[u.lIlIlllIIl[16]] = lIlIllIllI[lIlIlllIIl[178]];
        stringArray[u.lIlIlllIIl[20]] = lIlIllIllI[lIlIlllIIl[179]];
        cy = stringArray;
        dk = lIlIlllIIl[1];
        dl = lIlIllIllI[lIlIlllIIl[180]];
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIIlllllll(Object object) {
        return object != null;
    }

    private static void lIIlIIlllIlII() {
        lIlIllIllI = new String[lIlIlllIIl[181]];
        u.lIlIllIllI[u.lIlIlllIIl[1]] = "Finished buying items, switching back to quest";
        u.lIlIllIllI[u.lIlIlllIIl[0]] = "Waterfall";
        u.lIlIllIllI[u.lIlIlllIIl[9]] = "Priest in Peril";
        u.lIlIllIllI[u.lIlIlllIIl[11]] = "Ernest the Chicken";
        u.lIlIllIllI[u.lIlIlllIIl[13]] = "Crafting";
        u.lIlIllIllI[u.lIlIlllIIl[8]] = "Woodcutting";
        u.lIlIllIllI[u.lIlIlllIIl[16]] = "Training range";
        u.lIlIllIllI[u.lIlIlllIIl[20]] = "Varrock Quiz";
        u.lIlIllIllI[u.lIlIlllIIl[21]] = "RFD Dwarf";
        u.lIlIllIllI[u.lIlIlllIIl[19]] = "A Porcine";
        u.lIlIllIllI[u.lIlIlllIIl[4]] = "Antique lamp";
        u.lIlIllIllI[u.lIlIlllIIl[23]] = "Client of Kourend";
        u.lIlIllIllI[u.lIlIlllIIl[24]] = "Antique lamp";
        u.lIlIllIllI[u.lIlIlllIIl[25]] = u.lIIlIIllIlIII("LQhRsnJzlBU=", "ijRbv");
        u.lIlIllIllI[u.lIlIlllIIl[26]] = "Nav to bank";
        u.lIlIllIllI[u.lIlIlllIIl[28]] = "Handling banking";
        u.lIlIllIllI[u.lIlIlllIIl[35]] = "We are missing quest supplies, switching to BUYING";
        u.lIlIllIllI[u.lIlIlllIIl[42]] = "We are missing quest supplies, switching to BUYING";
        u.lIlIllIllI[u.lIlIlllIIl[46]] = "Drink";
        u.lIlIllIllI[u.lIlIlllIIl[12]] = "Drink";
        u.lIlIllIllI[u.lIlIlllIIl[48]] = "Shark";
        u.lIlIllIllI[u.lIlIlllIIl[49]] = "Shark";
        u.lIlIllIllI[u.lIlIlllIIl[50]] = "Eat";
        u.lIlIllIllI[u.lIlIlllIIl[51]] = "Nav to start";
        u.lIlIllIllI[u.lIlIlllIIl[47]] = "Ava";
        u.lIlIllIllI[u.lIlIlllIIl[54]] = "Bookcase";
        u.lIlIllIllI[u.lIlIlllIIl[55]] = "Search";
        u.lIlIllIllI[u.lIlIlllIIl[57]] = "Bookcase";
        u.lIlIllIllI[u.lIlIlllIIl[58]] = "Search";
        u.lIlIllIllI[u.lIlIlllIIl[59]] = "Wear";
        u.lIlIllIllI[u.lIlIlllIIl[64]] = "Nav to charter";
        u.lIlIllIllI[u.lIlIlllIIl[65]] = "Trader Crewmember";
        u.lIlIllIllI[u.lIlIlllIIl[10]] = "Trade";
        u.lIlIllIllI[u.lIlIlllIIl[66]] = "Break";
        u.lIlIllIllI[u.lIlIlllIIl[67]] = "Nav to ecto";
        u.lIlIllIllI[u.lIlIlllIIl[14]] = "Bones";
        u.lIlIllIllI[u.lIlIlllIIl[68]] = "Staircase";
        u.lIlIllIllI[u.lIlIlllIIl[69]] = "Climb-up";
        u.lIlIllIllI[u.lIlIlllIIl[70]] = "Loader";
        u.lIlIllIllI[u.lIlIlllIIl[71]] = "Bones";
        u.lIlIllIllI[u.lIlIlllIIl[22]] = "Bones";
        u.lIlIllIllI[u.lIlIlllIIl[72]] = "Loader";
        u.lIlIllIllI[u.lIlIlllIIl[75]] = "Bones";
        u.lIlIllIllI[u.lIlIlllIIl[76]] = "Staircase";
        u.lIlIllIllI[u.lIlIlllIIl[77]] = "Climb-down";
        u.lIlIllIllI[u.lIlIlllIIl[78]] = "Bonemeal";
        u.lIlIllIllI[u.lIlIlllIIl[79]] = "Ectofuntus";
        u.lIlIllIllI[u.lIlIlllIIl[80]] = "Worship";
        u.lIlIllIllI[u.lIlIlllIIl[81]] = "Bonemeal";
        u.lIlIllIllI[u.lIlIlllIIl[82]] = "Ghost disciple";
        u.lIlIllIllI[u.lIlIlllIIl[15]] = "Malcolm";
        u.lIlIllIllI[u.lIlIlllIIl[84]] = "Alice";
        u.lIlIllIllI[u.lIlIlllIIl[85]] = "Malcolm";
        u.lIlIllIllI[u.lIlIlllIIl[86]] = "Alice";
        u.lIlIllIllI[u.lIlIlllIIl[87]] = "Malcolm";
        u.lIlIllIllI[u.lIlIlllIIl[88]] = "Alice";
        u.lIlIllIllI[u.lIlIlllIIl[93]] = "Nav to crone";
        u.lIlIllIllI[u.lIlIlllIIl[94]] = "Old crone";
        u.lIlIllIllI[u.lIlIlllIIl[96]] = "Malcolm";
        u.lIlIllIllI[u.lIlIlllIIl[98]] = "Malcolm";
        u.lIlIllIllI[u.lIlIlllIIl[6]] = "Malcolm";
        u.lIlIllIllI[u.lIlIlllIIl[101]] = "Undead chicken";
        u.lIlIllIllI[u.lIlIlllIIl[102]] = "Iron bar";
        u.lIlIllIllI[u.lIlIlllIIl[104]] = "Iron bar";
        u.lIlIllIllI[u.lIlIlllIIl[107]] = "Witch";
        u.lIlIllIllI[u.lIlIlllIIl[3]] = "Witch";
        u.lIlIllIllI[u.lIlIlllIIl[109]] = "Bar magnet";
        u.lIlIllIllI[u.lIlIlllIIl[113]] = "Nav to mine";
        u.lIlIllIllI[u.lIlIlllIIl[114]] = "Hammer";
        u.lIlIllIllI[u.lIlIlllIIl[115]] = "Selected iron";
        u.lIlIllIllI[u.lIlIlllIIl[89]] = "Bar magnet";
        u.lIlIllIllI[u.lIlIlllIIl[119]] = "Undead tree";
        u.lIlIllIllI[u.lIlIlllIIl[120]] = "Chop";
        u.lIlIllIllI[u.lIlIlllIIl[90]] = "Wear";
        u.lIlIllIllI[u.lIlIlllIIl[125]] = "Nav to npc";
        u.lIlIllIllI[u.lIlIlllIIl[126]] = "Turael";
        u.lIlIllIllI[u.lIlIlllIIl[95]] = "Turael";
        u.lIlIllIllI[u.lIlIlllIIl[128]] = "Undead twigs";
        u.lIlIllIllI[u.lIlIlllIIl[129]] = "Undead tree";
        u.lIlIllIllI[u.lIlIlllIIl[130]] = "Chop";
        u.lIlIllIllI[u.lIlIlllIIl[97]] = "Undead twigs";
        u.lIlIllIllI[u.lIlIlllIIl[134]] = "Research notes";
        u.lIlIllIllI[u.lIlIlllIIl[135]] = "Translate";
        u.lIlIllIllI[u.lIlIlllIIl[138]] = "A pattern";
        u.lIlIllIllI[u.lIlIlllIIl[139]] = "A pattern";
        u.lIlIllIllI[u.lIlIlllIIl[140]] = "Hard leather";
        u.lIlIllIllI[u.lIlIlllIIl[142]] = "Bookcase";
        u.lIlIllIllI[u.lIlIlllIIl[143]] = "Search";
        u.lIlIllIllI[u.lIlIlllIIl[144]] = "Nav to start";
        u.lIlIllIllI[u.lIlIlllIIl[145]] = "Ava";
        u.lIlIllIllI[u.lIlIlllIIl[99]] = "Bookcase";
        u.lIlIllIllI[u.lIlIlllIIl[146]] = "Search";
        u.lIlIllIllI[u.lIlIlllIIl[159]] = u.lIIlIIllIlIII("Q+y6/DJ09Ks=", "WuBpj");
        u.lIlIllIllI[u.lIlIlllIIl[160]] = "Animal Magnetism";
        u.lIlIllIllI[u.lIlIlllIIl[161]] = "ring of wealth (";
        u.lIlIllIllI[u.lIlIlllIIl[162]] = "Drop";
        u.lIlIllIllI[u.lIlIlllIIl[173]] = "Yes.";
        u.lIlIllIllI[u.lIlIlllIIl[174]] = "I'm here about a quest.";
        u.lIlIllIllI[u.lIlIlllIIl[175]] = "Okay, you need it more than I do, I suppose.";
        u.lIlIllIllI[u.lIlIlllIIl[176]] = "Could I buy those chickens now, then?";
        u.lIlIllIllI[u.lIlIlllIIl[100]] = "Could I buy 2 chickens?";
        u.lIlIllIllI[u.lIlIlllIIl[177]] = "I'm here about a quest.";
        u.lIlIllIllI[u.lIlIlllIIl[178]] = "Hello, I'm here about those trees again.";
        u.lIlIllIllI[u.lIlIlllIIl[179]] = "I'd love one, thanks.";
        u.lIlIllIllI[u.lIlIlllIIl[180]] = u.lIIlIIllIIlll("", "THcbi");
    }

    private static boolean lIIlIIllllllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ac() {
        return lIlIlllIIl[1];
    }

    public static void bc() {
        block115: {
            WorldPoint var2;
            Object var3;
            block116: {
                block123: {
                    block118: {
                        block122: {
                            block121: {
                                block120: {
                                    block119: {
                                        block117: {
                                            if (u.lIIlIIllllIlI(bn ? 1 : 0)) {
                                                b.a(bp);
                                                if (u.lIIlIIllllIll(bp.size(), lIlIlllIIl[0])) {
                                                    System.out.println(lIlIllIllI[lIlIlllIIl[1]]);
                                                    bn = lIlIlllIIl[1];
                                                }
                                            }
                                            if (!u.lIIlIIlllllII(bn ? 1 : 0) || !u.lIIlIIllllIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[2])) break block115;
                                            if (u.lIIlIIllllIll(e.j(lIlIlllIIl[3]), lIlIlllIIl[4])) {
                                                dl = lIlIllIllI[lIlIlllIIl[0]];
                                                C.bL();
                                            }
                                            if (u.lIIlIIlllllIl(e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && (!u.lIIlIIllllllI(e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) || u.lIIlIIllllIll(e.j(lIlIlllIIl[7]), lIlIlllIIl[8]))) {
                                                dl = lIlIllIllI[lIlIlllIIl[9]];
                                                x.bk();
                                            }
                                            if (u.lIIlIIlllllIl(e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[7]), lIlIlllIIl[8]) && u.lIIlIIllllIll(e.j(lIlIlllIIl[10]), lIlIlllIIl[11])) {
                                                dl = lIlIllIllI[lIlIlllIIl[11]];
                                                F.ce();
                                            }
                                            if (u.lIIlIIlllllIl(e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[7]), lIlIlllIIl[8]) && u.lIIlIIlllllIl(e.j(lIlIlllIIl[10]), lIlIlllIIl[11]) && u.lIIlIIllllIll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIIl[12])) {
                                                dl = lIlIllIllI[lIlIlllIIl[13]];
                                                V.dr();
                                            }
                                            if (u.lIIlIIlllllIl(e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[7]), lIlIlllIIl[8]) && u.lIIlIIlllllIl(e.j(lIlIlllIIl[10]), lIlIlllIIl[11]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIIl[12]) && u.lIIlIIllllIll(Skills.getLevel((Skill)Skill.WOODCUTTING), lIlIlllIIl[14])) {
                                                dl = lIlIllIllI[lIlIlllIIl[8]];
                                                Y.dQ();
                                            }
                                            if (u.lIIlIIlllllIl(e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[7]), lIlIlllIIl[8]) && u.lIIlIIlllllIl(e.j(lIlIlllIIl[10]), lIlIlllIIl[11]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIIl[12]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIlIlllIIl[14]) && u.lIIlIIllllIll(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIIl[15])) {
                                                dl = lIlIllIllI[lIlIlllIIl[16]];
                                                if (u.lIIlIIllllIll(dk, lIlIlllIIl[0])) {
                                                    o.cB = lIlIlllIIl[1];
                                                    dk += lIlIlllIIl[0];
                                                }
                                                n.ay();
                                            }
                                            if (u.lIIlIIlllllIl(e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[7]), lIlIlllIIl[8]) && u.lIIlIIlllllIl(e.j(lIlIlllIIl[10]), lIlIlllIIl[11]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIIl[12]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIlIlllIIl[14]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIIl[15])) {
                                                if (!u.lIIlIIllllllI(e.j(lIlIlllIIl[17]), lIlIlllIIl[18]) || u.lIIlIIllllIll(Skills.getLevel((Skill)Skill.HUNTER), lIlIlllIIl[19])) {
                                                    dl = lIlIllIllI[lIlIlllIIl[20]];
                                                    B.bI();
                                                }
                                                if (u.lIIlIIllllllI(e.j(lIlIlllIIl[17]), lIlIlllIIl[18]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.HUNTER), lIlIlllIIl[19]) && u.lIIlIIllllIll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIlllIIl[6])) {
                                                    dl = lIlIllIllI[lIlIlllIIl[21]];
                                                    z.bD();
                                                }
                                                if (u.lIIlIIllllllI(e.j(lIlIlllIIl[17]), lIlIlllIIl[18]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.HUNTER), lIlIlllIIl[19]) && u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIlllIIl[6]) && u.lIIlIIllllIll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlllIIl[22])) {
                                                    dl = lIlIllIllI[lIlIlllIIl[19]];
                                                    t.ba();
                                                }
                                                if (u.lIIlIIllllllI(e.j(lIlIlllIIl[17]), lIlIlllIIl[18]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.HUNTER), lIlIlllIIl[19]) && u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIlllIIl[6]) && u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlllIIl[22]) && u.lIIlIIllllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlIlllIIl[19])) {
                                                    String[] stringArray = new String[lIlIlllIIl[0]];
                                                    stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[4]];
                                                    if (u.lIIlIIlllllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        dl = lIlIllIllI[lIlIlllIIl[23]];
                                                        v.bf();
                                                    }
                                                }
                                                v.bg();
                                            }
                                            if (!u.lIIlIIlllllII(u.al() ? 1 : 0) || !u.lIIlIIlllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) || !u.lIIlIIllllllI(e.j(lIlIlllIIl[17]), lIlIlllIIl[18]) || !u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.HUNTER), lIlIlllIIl[19]) || !u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIIl[15]) || !u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIlllIIl[6]) || !u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlllIIl[22]) || !u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlIlllIIl[19])) break block116;
                                            String[] stringArray = new String[lIlIlllIIl[0]];
                                            stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[24]];
                                            if (!u.lIIlIIlllllII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block116;
                                            dl = lIlIllIllI[lIlIlllIIl[25]];
                                            var3 = BankLocation.getNearest();
                                            if (u.lIIlIIlllllll(var3) && u.lIIlIIlllllII(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[26]];
                                                a.a((BankLocation)var3);
                                            }
                                            if (!u.lIIlIIlllllll(var3) || !u.lIIlIIllllIlI(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block116;
                                            if (u.lIIlIIlllllII(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlllIIl[27]);

                                            }
                                            if (!u.lIIlIIllllIlI(Bank.isOpen() ? 1 : 0)) break block116;
                                            AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[28]];
                                            if (u.lIIlIlIIIIIII(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIlIlllIIl[13]);

                                            }
                                            if (u.lIIlIlIIIIIII(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIlIlllIIl[9]);

                                            }
                                            int[] nArray = new int[lIlIlllIIl[0]];
                                            nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[29];
                                            if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block117;
                                            int[] nArray2 = new int[lIlIlllIIl[0]];
                                            nArray2[u.lIlIlllIIl[1]] = lIlIlllIIl[29];
                                            if (!u.lIIlIIllllllI(Bank.getFirst((int[])nArray2).getQuantity(), lIlIlllIIl[8])) break block118;
                                        }
                                        int[] nArray = new int[lIlIlllIIl[0]];
                                        nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[30];
                                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block119;
                                        int[] nArray3 = new int[lIlIlllIIl[0]];
                                        nArray3[u.lIlIlllIIl[1]] = lIlIlllIIl[30];
                                        if (!u.lIIlIIllllllI(Bank.getFirst((int[])nArray3).getQuantity(), lIlIlllIIl[16])) break block118;
                                    }
                                    int[] nArray = new int[lIlIlllIIl[0]];
                                    nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[31];
                                    if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block120;
                                    int[] nArray4 = new int[lIlIlllIIl[0]];
                                    nArray4[u.lIlIlllIIl[1]] = lIlIlllIIl[31];
                                    if (!u.lIIlIIllllllI(Bank.getFirst((int[])nArray4).getQuantity(), lIlIlllIIl[28])) break block118;
                                }
                                int[] nArray = new int[lIlIlllIIl[0]];
                                nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[32];
                                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block121;
                                int[] nArray5 = new int[lIlIlllIIl[0]];
                                nArray5[u.lIlIlllIIl[1]] = lIlIlllIIl[32];
                                if (!u.lIIlIIllllllI(Bank.getFirst((int[])nArray5).getQuantity(), lIlIlllIIl[13])) break block118;
                            }
                            int[] nArray = new int[lIlIlllIIl[0]];
                            nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[33];
                            if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block122;
                            int[] nArray6 = new int[lIlIlllIIl[0]];
                            nArray6[u.lIlIlllIIl[1]] = lIlIlllIIl[33];
                            if (!u.lIIlIIllllllI(Bank.getFirst((int[])nArray6).getQuantity(), lIlIlllIIl[8])) break block118;
                        }
                        int[] nArray = new int[lIlIlllIIl[0]];
                        nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[34];
                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block123;
                        int[] nArray7 = new int[lIlIlllIIl[0]];
                        nArray7[u.lIlIlllIIl[1]] = lIlIlllIIl[34];
                        if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray7).getQuantity(), lIlIlllIIl[13])) break block123;
                    }
                    u.O();
                    System.out.println(lIlIllIllI[lIlIlllIIl[35]]);
                    bn = lIlIlllIIl[0];
                    return;
                }
                int[] nArray = new int[lIlIlllIIl[23]];
                nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[36];
                nArray[u.lIlIlllIIl[0]] = lIlIlllIIl[37];
                nArray[u.lIlIlllIIl[9]] = lIlIlllIIl[33];
                nArray[u.lIlIlllIIl[11]] = lIlIlllIIl[38];
                nArray[u.lIlIlllIIl[13]] = lIlIlllIIl[32];
                nArray[u.lIlIlllIIl[8]] = lIlIlllIIl[34];
                nArray[u.lIlIlllIIl[16]] = lIlIlllIIl[39];
                nArray[u.lIlIlllIIl[20]] = lIlIlllIIl[40];
                nArray[u.lIlIlllIIl[21]] = lIlIlllIIl[41];
                nArray[u.lIlIlllIIl[19]] = lIlIlllIIl[30];
                nArray[u.lIlIlllIIl[4]] = lIlIlllIIl[31];
                if (u.lIIlIIlllllII(e.b(nArray) ? 1 : 0)) {
                    u.O();
                    System.out.println(lIlIllIllI[lIlIlllIIl[42]]);
                    bn = lIlIlllIIl[0];
                    return;
                }
                int[] nArray8 = new int[lIlIlllIIl[23]];
                nArray8[u.lIlIlllIIl[1]] = lIlIlllIIl[36];
                nArray8[u.lIlIlllIIl[0]] = lIlIlllIIl[37];
                nArray8[u.lIlIlllIIl[9]] = lIlIlllIIl[33];
                nArray8[u.lIlIlllIIl[11]] = lIlIlllIIl[38];
                nArray8[u.lIlIlllIIl[13]] = lIlIlllIIl[32];
                nArray8[u.lIlIlllIIl[8]] = lIlIlllIIl[34];
                nArray8[u.lIlIlllIIl[16]] = lIlIlllIIl[39];
                nArray8[u.lIlIlllIIl[20]] = lIlIlllIIl[40];
                nArray8[u.lIlIlllIIl[21]] = lIlIlllIIl[41];
                nArray8[u.lIlIlllIIl[19]] = lIlIlllIIl[30];
                nArray8[u.lIlIlllIIl[4]] = lIlIlllIIl[31];
                if (u.lIIlIIllllIlI(e.b(nArray8) ? 1 : 0)) {
                    a.a(lIlIlllIIl[34], lIlIlllIIl[13]);
                    a.a(lIlIlllIIl[37], lIlIlllIIl[0]);
                    a.a(lIlIlllIIl[43], lIlIlllIIl[0]);
                    a.a(lIlIlllIIl[32], lIlIlllIIl[13]);
                    a.a(lIlIlllIIl[29], lIlIlllIIl[13]);
                    a.a(lIlIlllIIl[40], lIlIlllIIl[0]);
                    a.a(lIlIlllIIl[41], lIlIlllIIl[0]);
                    a.a(lIlIlllIIl[36], lIlIlllIIl[4]);
                    a.a(lIlIlllIIl[30], lIlIlllIIl[4]);
                    a.a(lIlIlllIIl[31], lIlIlllIIl[28]);
                    a.a(lIlIlllIIl[44], lIlIlllIIl[0]);
                    a.a(lIlIlllIIl[45], lIlIlllIIl[27]);
                }
            }
            if (u.lIIlIIllllIlI(Inventory.contains((int[])f.aU) ? 1 : 0) && u.lIIlIIllllIll(Movement.getRunEnergy(), lIlIlllIIl[15])) {
                Inventory.getFirst((int[])f.aU).interact(lIlIllIllI[lIlIlllIIl[46]]);
                Time.sleepTicks((int)lIlIlllIIl[0]);

            }
            if (u.lIIlIIllllIlI(Inventory.contains((int[])f.aR) ? 1 : 0) && u.lIIlIIllllIll(Prayers.getPoints(), lIlIlllIIl[47])) {
                Inventory.getFirst((int[])f.aR).interact(lIlIllIllI[lIlIlllIIl[12]]);
            }
            if (u.lIIlIlIIIIIIl(u.lIIlIIllllIIl(e.UHelper(), 60.0))) {
                String[] stringArray = new String[lIlIlllIIl[0]];
                stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[48]];
                if (u.lIIlIIllllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIlIlllIIl[0]];
                    stringArray2[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[49]];
                    Inventory.getFirst((String[])stringArray2).interact(lIlIllIllI[lIlIlllIIl[50]]);
                    Time.sleepTicks((int)lIlIlllIIl[9]);

                }
            }
            if (u.lIIlIIllllIlI(u.al() ? 1 : 0) && u.lIIlIIlllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (u.lIIlIIlllllII(df.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlllIIl[21])) {
                    AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[51]];
                    if (u.lIIlIIllllIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)cV);

                    Time.sleepTicks((int)lIlIlllIIl[0]);

                }
                if (u.lIIlIIllllIlI(df.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlllIIl[21])) {
                    dc = lIlIlllIIl[1];
                    g.a(lIlIllIllI[lIlIlllIIl[47]], cy);
                }
                if (u.lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIlIlllIIl[52], lIlIlllIIl[53], lIlIlllIIl[1])) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIlllIIl[0]];
                    stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[54]];
                    TileObjects.getNearest((String[])stringArray).interact(lIlIllIllI[lIlIlllIIl[55]]);
                    Time.sleepTicks((int)lIlIlllIIl[9]);

                }
                if (u.lIIlIIllllIlI((var3 = new WorldArea(lIlIlllIIl[52], lIlIlllIIl[56], lIlIlllIIl[16], lIlIlllIIl[4], lIlIlllIIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIlllIIl[0]];
                    stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[57]];
                    TileObjects.getNearest((String[])stringArray).interact(lIlIllIllI[lIlIlllIIl[58]]);
                    Time.sleepTicks((int)lIlIlllIIl[9]);

                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[4])) {
                int[] nArray = new int[lIlIlllIIl[0]];
                nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[44];
                if (u.lIIlIIlllllII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray9 = new int[lIlIlllIIl[0]];
                    nArray9[u.lIlIlllIIl[1]] = lIlIlllIIl[44];
                    Inventory.getFirst((int[])nArray9).interact(lIlIllIllI[lIlIlllIIl[59]]);
                }
                int[] nArray10 = new int[lIlIlllIIl[0]];
                nArray10[u.lIlIlllIIl[1]] = lIlIlllIIl[60];
                if (u.lIIlIIlllllII(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                    block114: {
                        var3 = new WorldPoint(lIlIlllIIl[61], lIlIlllIIl[62], lIlIlllIIl[1]);
                        int[] nArray11 = new int[lIlIlllIIl[0]];
                        nArray11[u.lIlIlllIIl[1]] = lIlIlllIIl[63];
                        if (u.lIIlIIlllllII(Inventory.contains((int[])nArray11) ? 1 : 0) && u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var3), lIlIlllIIl[48])) {
                            if (u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(di), lIlIlllIIl[8])) {
                                AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[64]];
                                Movement.walkTo((WorldPoint)di);

                                Time.sleepTicks((int)lIlIlllIIl[0]);

                            }
                            if (u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(di), lIlIlllIIl[8])) {
                                if (u.lIIlIIlllllII(Shop.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIlIlllIIl[0]];
                                    stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[65]];
                                    NPCs.getNearest((String[])stringArray).interact(lIlIllIllI[lIlIlllIIl[10]]);
                                    Time.sleepTicks((int)lIlIlllIIl[9]);

                                }
                                if (u.lIIlIIllllIlI(Shop.isOpen() ? 1 : 0)) {
                                    Shop.buyFive((int)lIlIlllIIl[63]);
                                    Time.sleepTicks((int)lIlIlllIIl[11]);

                                }
                            }
                        }
                        int[] nArray12 = new int[lIlIlllIIl[0]];
                        nArray12[u.lIlIlllIIl[1]] = lIlIlllIIl[63];
                        if (u.lIIlIIllllIlI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                            if (u.lIIlIIlllllII(dg.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.lIIlIIlllllII(dh.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                int[] nArray13 = new int[lIlIlllIIl[0]];
                                nArray13[u.lIlIlllIIl[1]] = lIlIlllIIl[31];
                                if (u.lIIlIIllllIlI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                    int[] nArray14 = new int[lIlIlllIIl[0]];
                                    nArray14[u.lIlIlllIIl[1]] = lIlIlllIIl[31];
                                    Inventory.getFirst((int[])nArray14).interact(lIlIllIllI[lIlIlllIIl[66]]);
                                    Time.sleepTicks((int)lIlIlllIIl[20]);

                                }
                            }
                            if (!u.lIIlIIlllllII(dg.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || u.lIIlIIllllIlI(dh.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                var2 = new WorldPoint(lIlIlllIIl[61], lIlIlllIIl[62], lIlIlllIIl[1]);
                                if (u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(var2), lIlIlllIIl[8]) && u.lIIlIIlllllII(Players.getLocal().getWorldLocation().getPlane())) {
                                    AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[67]];
                                    Movement.walkTo((WorldPoint)var2);

                                    Time.sleepTicks((int)lIlIlllIIl[0]);

                                }
                                String[] stringArray = new String[lIlIlllIIl[0]];
                                stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[14]];
                                if (u.lIIlIIllllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    if (u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(var2), lIlIlllIIl[8]) && u.lIIlIIlllllII(Players.getLocal().getWorldLocation().getPlane())) {
                                        String[] stringArray3 = new String[lIlIlllIIl[0]];
                                        stringArray3[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[68]];
                                        TileObjects.getNearest((String[])stringArray3).interact(lIlIllIllI[lIlIlllIIl[69]]);
                                        Time.sleepTicks((int)lIlIlllIIl[13]);

                                    }
                                    String[] stringArray4 = new String[lIlIlllIIl[0]];
                                    stringArray4[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[70]];
                                    if (u.lIIlIIlllllll(TileObjects.getNearest((String[])stringArray4))) {
                                        String[] stringArray5 = new String[lIlIlllIIl[0]];
                                        stringArray5[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[71]];
                                        if (u.lIIlIIllllIlI(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                            String[] stringArray6 = new String[lIlIlllIIl[0]];
                                            stringArray6[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[22]];
                                            String[] stringArray7 = new String[lIlIlllIIl[0]];
                                            stringArray7[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[72]];
                                            Inventory.getFirst((String[])stringArray6).useOn(TileObjects.getNearest((String[])stringArray7));
                                            Time.sleep((long)e.c(lIlIlllIIl[73], lIlIlllIIl[74]));

                                        }
                                    }
                                }
                                String[] stringArray8 = new String[lIlIlllIIl[0]];
                                stringArray8[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[75]];
                                if (u.lIIlIIlllllII(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                    if (u.lIIlIIlllllIl(Players.getLocal().getWorldLocation().getPlane(), lIlIlllIIl[0])) {
                                        String[] stringArray9 = new String[lIlIlllIIl[0]];
                                        stringArray9[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[76]];
                                        TileObjects.getNearest((String[])stringArray9).interact(lIlIllIllI[lIlIlllIIl[77]]);
                                        Time.sleepTicks((int)lIlIlllIIl[8]);

                                    }
                                    if (u.lIIlIIlllllII(Players.getLocal().getWorldLocation().getPlane())) {
                                        do {
                                            String[] stringArray10 = new String[lIlIlllIIl[0]];
                                            stringArray10[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[78]];
                                            if (!u.lIIlIIllllIlI(Inventory.contains((String[])stringArray10) ? 1 : 0)) break block114;
                                            String[] stringArray11 = new String[lIlIlllIIl[0]];
                                            stringArray11[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[79]];
                                            TileObjects.getNearest((String[])stringArray11).interact(lIlIllIllI[lIlIlllIIl[80]]);
                                            Time.sleepTicks((int)lIlIlllIIl[9]);

                                        } while ((0x75 ^ 0x70) > 0);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    int[] nArray15 = new int[lIlIlllIIl[0]];
                    nArray15[u.lIlIlllIIl[1]] = lIlIlllIIl[32];
                    if (u.lIIlIIlllllII(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIlllIIl[0]];
                        stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[81]];
                        if (u.lIIlIIlllllII(Inventory.contains((String[])stringArray) ? 1 : 0) && u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var3), lIlIlllIIl[48])) {
                            if (u.lIIlIIlllllII(Dialog.isOpen() ? 1 : 0)) {
                                g.a(lIlIllIllI[lIlIlllIIl[82]], cy);
                                Time.sleepTicks((int)lIlIlllIIl[0]);

                            }
                            g.a(cy);
                        }
                    }
                }
                int[] nArray16 = new int[lIlIlllIIl[0]];
                nArray16[u.lIlIlllIIl[1]] = lIlIlllIIl[60];
                if (u.lIIlIIllllIlI(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlIlllIIl[9]];
                    nArray17[u.lIlIlllIIl[1]] = lIlIlllIIl[83];
                    nArray17[u.lIlIlllIIl[0]] = lIlIlllIIl[29];
                    if (u.lIIlIIllllIlI(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                        int[] nArray18 = new int[lIlIlllIIl[9]];
                        nArray18[u.lIlIlllIIl[1]] = lIlIlllIIl[83];
                        nArray18[u.lIlIlllIIl[0]] = lIlIlllIIl[29];
                        Inventory.getAll((int[])nArray18).stream().forEach(item -> item.interact(lIlIllIllI[lIlIlllIIl[162]]));
                    }
                    if (u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(dj), lIlIlllIIl[20])) {
                        Movement.walkTo((WorldPoint)dj);

                        Time.sleepTicks((int)lIlIlllIIl[0]);

                    }
                    if (u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(dj), lIlIlllIIl[20])) {
                        g.a(lIlIllIllI[lIlIlllIIl[15]], cy);
                    }
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[48])) {
                g.a(lIlIllIllI[lIlIlllIIl[84]], cy);
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[64])) {
                g.a(lIlIllIllI[lIlIlllIIl[85]], cy);
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[22])) {
                g.a(lIlIllIllI[lIlIlllIIl[86]], cy);
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[15])) {
                g.a(lIlIllIllI[lIlIlllIIl[87]], cy);
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[6])) {
                g.a(lIlIllIllI[lIlIlllIIl[88]], cy);
            }
            if (!u.lIIlIlIIIIlII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[89]) || u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[90])) {
                var3 = new WorldPoint(lIlIlllIIl[91], lIlIlllIIl[92], lIlIlllIIl[1]);
                if (u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var3), lIlIlllIIl[11])) {
                    AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[93]];
                    Movement.walkTo((WorldPoint)var3);

                    Time.sleepTicks((int)lIlIlllIIl[0]);

                }
                if (u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var3), lIlIlllIIl[11])) {
                    g.a(lIlIllIllI[lIlIlllIIl[94]], cy);
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[95])) {
                if (u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(dj), lIlIlllIIl[20])) {
                    Movement.walkTo((WorldPoint)dj);

                    Time.sleepTicks((int)lIlIlllIIl[0]);

                }
                if (u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(dj), lIlIlllIIl[20])) {
                    g.a(lIlIllIllI[lIlIlllIIl[96]], cy);
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[97])) {
                g.a(lIlIllIllI[lIlIlllIIl[98]], cy);
            }
            if (!u.lIIlIlIIIIlII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[99]) || u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[100])) {
                g.a(lIlIllIllI[lIlIlllIIl[6]], cy);
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[100])) {
                String[] stringArray = new String[lIlIlllIIl[0]];
                stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[101]];
                if (u.lIIlIIllllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray12 = new String[lIlIlllIIl[0]];
                    stringArray12[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[102]];
                    if (u.lIIlIIlllllII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        var3 = new HashMap();
                        ((HashMap)var3).put(lIlIlllIIl[33], lIlIlllIIl[8]);

                        ((HashMap)var3).put(lIlIlllIIl[38], lIlIlllIIl[0]);

                        ((HashMap)var3).put(lIlIlllIIl[39], lIlIlllIIl[0]);

                        ((HashMap)var3).put(lIlIlllIIl[103], lIlIlllIIl[0]);

                        e.a((HashMap<Integer, Integer>)var3, lIlIlllIIl[1], lIlIlllIIl[1]);
                    }
                    String[] stringArray13 = new String[lIlIlllIIl[0]];
                    stringArray13[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[104]];
                    if (u.lIIlIIllllIlI(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        u.bd();
                    }
                }
            }
            if (!u.lIIlIlIIIIlII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[105]) || u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[106])) {
                String[] stringArray = new String[lIlIlllIIl[0]];
                stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[107]];
                var3 = NPCs.getNearest((String[])stringArray);
                if (u.lIIlIIlllllll(var3)) {
                    if (u.lIIlIIllllIlI(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
                        g.a(lIlIllIllI[lIlIlllIIl[3]], cy);
                    }
                    if (u.lIIlIIlllllII(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
                        Movement.walkTo((Locatable)var3);

                        Time.sleepTicks((int)lIlIlllIIl[0]);

                    }
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[108])) {
                String[] stringArray = new String[lIlIlllIIl[0]];
                stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[109]];
                if (u.lIIlIIlllllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    var3 = new WorldPoint(lIlIlllIIl[110], lIlIlllIIl[111], lIlIlllIIl[1]);
                    var2 = new WorldPoint(lIlIlllIIl[110], lIlIlllIIl[112], lIlIlllIIl[1]);
                    if (u.lIIlIIlllllII(Players.getLocal().getWorldLocation().equals(var3) ? 1 : 0) && u.lIIlIIlllllII(Players.getLocal().getWorldLocation().equals((Object)var2) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[113]];
                        Movement.walkTo((WorldPoint)var3);

                        Time.sleepTicks((int)lIlIlllIIl[0]);

                    }
                    if (u.lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals(var3) ? 1 : 0) && u.lIIlIIlllllII(Players.getLocal().getWorldLocation().equals((Object)var2) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)var2);

                    }
                    if (u.lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals((Object)var2) ? 1 : 0)) {
                        String[] stringArray14 = new String[lIlIlllIIl[0]];
                        stringArray14[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[114]];
                        String[] stringArray15 = new String[lIlIlllIIl[0]];
                        stringArray15[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[115]];
                        Inventory.getFirst((String[])stringArray14).useOn(Inventory.getFirst((String[])stringArray15));
                        Time.sleepTicks((int)lIlIlllIIl[11]);

                    }
                }
                String[] stringArray16 = new String[lIlIlllIIl[0]];
                stringArray16[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[89]];
                if (u.lIIlIIllllIlI(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    u.bd();
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[116])) {
                var3 = new WorldPoint(lIlIlllIIl[117], lIlIlllIIl[118], lIlIlllIIl[1]);
                if (u.lIIlIIlllllII(Players.getLocal().getWorldLocation().equals(var3) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)var3);

                    Time.sleepTicks((int)lIlIlllIIl[0]);

                }
                if (u.lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals(var3) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIlllIIl[0]];
                    stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[119]];
                    NPCs.getNearest((String[])stringArray).interact(lIlIllIllI[lIlIlllIIl[120]]);
                    Time.sleepTicks((int)lIlIlllIIl[0]);

                }
            }
            if (!u.lIIlIlIIIIlII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[121]) || u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[122])) {
                var3 = new WorldPoint(lIlIlllIIl[123], lIlIlllIIl[124], lIlIlllIIl[1]);
                if (u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var3), lIlIlllIIl[9])) {
                    if (u.lIIlIIllllIlI(Inventory.contains((int[])f.aN) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aN).interact(lIlIllIllI[lIlIlllIIl[90]]);
                    }
                    AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[125]];
                    Movement.walkTo((WorldPoint)var3);

                    Time.sleepTicks((int)lIlIlllIIl[0]);

                }
                if (u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var3), lIlIlllIIl[9])) {
                    String[] stringArray = new String[lIlIlllIIl[0]];
                    stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[126]];
                    var2 = NPCs.getNearest((String[])stringArray);
                    if (u.lIIlIIlllllll(var2)) {
                        if (u.lIIlIIllllIlI(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
                            g.a(lIlIllIllI[lIlIlllIIl[95]], cy);
                        }
                        if (u.lIIlIIlllllII(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
                            Movement.walkTo((Locatable)var2);

                            Time.sleepTicks((int)lIlIlllIIl[0]);

                        }
                    }
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[127])) {
                String[] stringArray = new String[lIlIlllIIl[0]];
                stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[128]];
                if (u.lIIlIIlllllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    var3 = new WorldPoint(lIlIlllIIl[117], lIlIlllIIl[118], lIlIlllIIl[1]);
                    if (u.lIIlIIlllllII(Players.getLocal().getWorldLocation().equals(var3) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)var3);

                        Time.sleepTicks((int)lIlIlllIIl[0]);

                    }
                    if (u.lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals(var3) ? 1 : 0)) {
                        String[] stringArray17 = new String[lIlIlllIIl[0]];
                        stringArray17[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[129]];
                        NPCs.getNearest((String[])stringArray17).interact(lIlIllIllI[lIlIlllIIl[130]]);
                        Time.sleepTicks((int)lIlIlllIIl[0]);

                    }
                }
                String[] stringArray18 = new String[lIlIlllIIl[0]];
                stringArray18[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[97]];
                if (u.lIIlIIllllIlI(Inventory.contains((String[])stringArray18) ? 1 : 0)) {
                    u.bd();
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[131])) {
                u.bd();
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[132])) {
                if (u.lIIlIIllllIlI(Widgets.get((int)lIlIlllIIl[133]).isEmpty() ? 1 : 0)) {
                    String[] stringArray = new String[lIlIlllIIl[0]];
                    stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[134]];
                    Inventory.getFirst((String[])stringArray).interact(lIlIllIllI[lIlIlllIIl[135]]);
                    Time.sleepTicks((int)lIlIlllIIl[13]);

                }
                if (u.lIIlIIlllllII(Widgets.get((int)lIlIlllIIl[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click((int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[55]).getClickPoint().getX(), (int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[55]).getClickPoint().getY(), (boolean)lIlIlllIIl[0]);
                    Time.sleepTicks((int)lIlIlllIIl[9]);

                    Mouse.click((int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[65]).getClickPoint().getX(), (int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[65]).getClickPoint().getY(), (boolean)lIlIlllIIl[0]);
                    Time.sleepTicks((int)lIlIlllIIl[9]);

                    Mouse.click((int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[67]).getClickPoint().getX(), (int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[67]).getClickPoint().getY(), (boolean)lIlIlllIIl[0]);
                    Time.sleepTicks((int)lIlIlllIIl[9]);

                    Mouse.click((int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[22]).getClickPoint().getX(), (int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[22]).getClickPoint().getY(), (boolean)lIlIlllIIl[0]);
                    Time.sleepTicks((int)lIlIlllIIl[9]);

                    Mouse.click((int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[76]).getClickPoint().getX(), (int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[76]).getClickPoint().getY(), (boolean)lIlIlllIIl[0]);
                    Time.sleepTicks((int)lIlIlllIIl[9]);

                    Mouse.click((int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[79]).getClickPoint().getX(), (int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[79]).getClickPoint().getY(), (boolean)lIlIlllIIl[0]);
                    Time.sleepTicks((int)lIlIlllIIl[8]);

                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[136])) {
                u.bd();
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[137])) {
                String[] stringArray = new String[lIlIlllIIl[0]];
                stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[138]];
                if (u.lIIlIIllllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray19 = new String[lIlIlllIIl[0]];
                    stringArray19[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[139]];
                    String[] stringArray20 = new String[lIlIlllIIl[0]];
                    stringArray20[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[140]];
                    Inventory.getFirst((String[])stringArray19).useOn(Inventory.getFirst((String[])stringArray20));
                    Time.sleepTicks((int)lIlIlllIIl[9]);

                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[141])) {
                if (u.lIIlIIllllIll(dc, lIlIlllIIl[0])) {
                    Z.nh += lIlIlllIIl[0];
                    Z.p(AccBuilderShamans.m);
                    dc += lIlIlllIIl[0];
                    Z.nh = lIlIlllIIl[1];
                    dd = lIlIlllIIl[1];
                }
                u.bd();
            }
            g.a(cy);
        }
    }

    private static boolean lIIlIIlllllII(int n2) {
        return n2 == 0;
    }

    private static void bd() {
        WorldArea worldArea = new WorldArea(lIlIlllIIl[52], lIlIlllIIl[56], lIlIlllIIl[16], lIlIlllIIl[4], lIlIlllIIl[1]);
        if (u.lIIlIIllllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lIlIlllIIl[0]];
            stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[142]];
            TileObjects.getNearest((String[])stringArray).interact(lIlIllIllI[lIlIlllIIl[143]]);
            Time.sleepTicks((int)lIlIlllIIl[9]);

        }
        if (u.lIIlIIlllllII(df.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlllIIl[21])) {
            AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[144]];
            if (u.lIIlIIllllIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)cV);

            Time.sleepTicks((int)lIlIlllIIl[0]);

        }
        if (u.lIIlIIllllIlI(df.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlllIIl[21])) {
            g.a(lIlIllIllI[lIlIlllIIl[145]], cy);
        }
        if (u.lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIlIlllIIl[52], lIlIlllIIl[53], lIlIlllIIl[1])) ? 1 : 0)) {
            String[] stringArray = new String[lIlIlllIIl[0]];
            stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[99]];
            TileObjects.getNearest((String[])stringArray).interact(lIlIllIllI[lIlIlllIIl[146]]);
            Time.sleepTicks((int)lIlIlllIIl[9]);

        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean al() {
        void var4;
        int[] nArray = new int[lIlIlllIIl[20]];
        nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[36];
        nArray[u.lIlIlllIIl[0]] = lIlIlllIIl[37];
        nArray[u.lIlIlllIIl[9]] = lIlIlllIIl[34];
        nArray[u.lIlIlllIIl[11]] = lIlIlllIIl[40];
        nArray[u.lIlIlllIIl[13]] = lIlIlllIIl[41];
        nArray[u.lIlIlllIIl[8]] = lIlIlllIIl[30];
        nArray[u.lIlIlllIIl[16]] = lIlIlllIIl[31];
        int[] nArray2 = nArray;
        int var5 = lIlIlllIIl[1];
        while (u.lIIlIIllllIll(var5, ((void)var4).length)) {
            int[] nArray3 = new int[lIlIlllIIl[0]];
            nArray3[u.lIlIlllIIl[1]] = var4[var5];
            if (u.lIIlIIlllllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIlIlllIIl[1];
            }
            ++var5;

            if ((0x5C ^ 0x59 ^ (0x71 ^ 0x4D) & ~(0xA9 ^ 0x95)) > 0) continue;
            return ((0xE9 ^ 0x81 ^ (0x1A ^ 0x27)) & (195 + 169 - 178 + 27 ^ 14 + 105 - 36 + 45 ^ -1)) != 0;
        }
        return lIlIlllIIl[0];
    }

    private static void O() {
        block46: {
            d var6;
            block45: {
                block44: {
                    block43: {
                        Object var7;
                        block42: {
                            block41: {
                                block40: {
                                    block39: {
                                        block38: {
                                            block37: {
                                                block36: {
                                                    block35: {
                                                        block34: {
                                                            block33: {
                                                                block32: {
                                                                    block31: {
                                                                        int[] nArray = new int[lIlIlllIIl[0]];
                                                                        nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[43];
                                                                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                        int[] nArray2 = new int[lIlIlllIIl[0]];
                                                                        nArray2[u.lIlIlllIIl[1]] = lIlIlllIIl[43];
                                                                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray2) ? 1 : 0)) break block32;
                                                                        int[] nArray3 = new int[lIlIlllIIl[0]];
                                                                        nArray3[u.lIlIlllIIl[1]] = lIlIlllIIl[43];
                                                                        if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray3).getQuantity(), lIlIlllIIl[4])) break block32;
                                                                    }
                                                                    var7 = new DHelper(lIlIlllIIl[43], lIlIlllIIl[4], e.c(lIlIlllIIl[147], lIlIlllIIl[148]));
                                                                    bp.add((DHelper) ar7);

                                                                }
                                                                int[] nArray = new int[lIlIlllIIl[0]];
                                                                nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[30];
                                                                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                int[] nArray4 = new int[lIlIlllIIl[0]];
                                                                nArray4[u.lIlIlllIIl[1]] = lIlIlllIIl[30];
                                                                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) break block34;
                                                                int[] nArray5 = new int[lIlIlllIIl[0]];
                                                                nArray5[u.lIlIlllIIl[1]] = lIlIlllIIl[30];
                                                                if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray5).getQuantity(), lIlIlllIIl[16])) break block34;
                                                            }
                                                            var7 = new DHelper(lIlIlllIIl[30], lIlIlllIIl[16], lIlIlllIIl[149]);
                                                            bp.add((DHelper) ar7);

                                                        }
                                                        int[] nArray = new int[lIlIlllIIl[0]];
                                                        nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[31];
                                                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block35;
                                                        int[] nArray6 = new int[lIlIlllIIl[0]];
                                                        nArray6[u.lIlIlllIIl[1]] = lIlIlllIIl[31];
                                                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray6) ? 1 : 0)) break block36;
                                                        int[] nArray7 = new int[lIlIlllIIl[0]];
                                                        nArray7[u.lIlIlllIIl[1]] = lIlIlllIIl[31];
                                                        if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray7).getQuantity(), lIlIlllIIl[28])) break block36;
                                                    }
                                                    var7 = new DHelper(lIlIlllIIl[31], lIlIlllIIl[28], lIlIlllIIl[150]);
                                                    bp.add((DHelper) ar7);

                                                }
                                                int[] nArray = new int[lIlIlllIIl[0]];
                                                nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[103];
                                                if (u.lIIlIIlllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    var7 = new DHelper(lIlIlllIIl[103], lIlIlllIIl[8], lIlIlllIIl[151]);
                                                    bp.add((DHelper) ar7);

                                                }
                                                int[] nArray8 = new int[lIlIlllIIl[0]];
                                                nArray8[u.lIlIlllIIl[1]] = lIlIlllIIl[37];
                                                if (u.lIIlIIlllllII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                    var7 = new DHelper(lIlIlllIIl[37], lIlIlllIIl[0], lIlIlllIIl[27]);
                                                    bp.add((DHelper) ar7);

                                                }
                                                int[] nArray9 = new int[lIlIlllIIl[0]];
                                                nArray9[u.lIlIlllIIl[1]] = lIlIlllIIl[32];
                                                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block37;
                                                int[] nArray10 = new int[lIlIlllIIl[0]];
                                                nArray10[u.lIlIlllIIl[1]] = lIlIlllIIl[32];
                                                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray10) ? 1 : 0)) break block38;
                                                int[] nArray11 = new int[lIlIlllIIl[0]];
                                                nArray11[u.lIlIlllIIl[1]] = lIlIlllIIl[32];
                                                if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray11).getQuantity(), lIlIlllIIl[13])) break block38;
                                            }
                                            var7 = new DHelper(lIlIlllIIl[32], lIlIlllIIl[13], lIlIlllIIl[27]);
                                            bp.add((DHelper) ar7);

                                        }
                                        int[] nArray = new int[lIlIlllIIl[0]];
                                        nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[33];
                                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                                        int[] nArray12 = new int[lIlIlllIIl[0]];
                                        nArray12[u.lIlIlllIIl[1]] = lIlIlllIIl[33];
                                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray12) ? 1 : 0)) break block40;
                                        int[] nArray13 = new int[lIlIlllIIl[0]];
                                        nArray13[u.lIlIlllIIl[1]] = lIlIlllIIl[33];
                                        if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray13).getQuantity(), lIlIlllIIl[8])) break block40;
                                    }
                                    var7 = new DHelper(lIlIlllIIl[33], lIlIlllIIl[8], lIlIlllIIl[27]);
                                    bp.add((DHelper) ar7);

                                }
                                int[] nArray = new int[lIlIlllIIl[0]];
                                nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[29];
                                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                int[] nArray14 = new int[lIlIlllIIl[0]];
                                nArray14[u.lIlIlllIIl[1]] = lIlIlllIIl[29];
                                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray14) ? 1 : 0)) break block42;
                                int[] nArray15 = new int[lIlIlllIIl[0]];
                                nArray15[u.lIlIlllIIl[1]] = lIlIlllIIl[29];
                                if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray15).getQuantity(), lIlIlllIIl[8])) break block42;
                            }
                            var7 = new DHelper(lIlIlllIIl[29], lIlIlllIIl[13], lIlIlllIIl[27]);
                            bp.add((DHelper) ar7);

                        }
                        int[] nArray = new int[lIlIlllIIl[0]];
                        nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[39];
                        if (u.lIIlIIlllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var7 = new DHelper(lIlIlllIIl[39], lIlIlllIIl[0], lIlIlllIIl[27]);
                            bp.add((DHelper) ar7);

                        }
                        int[] nArray16 = new int[lIlIlllIIl[0]];
                        nArray16[u.lIlIlllIIl[1]] = lIlIlllIIl[38];
                        if (u.lIIlIIlllllII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                            var7 = new DHelper(lIlIlllIIl[38], lIlIlllIIl[0], lIlIlllIIl[27]);
                            bp.add((DHelper) ar7);

                        }
                        int[] nArray17 = new int[lIlIlllIIl[0]];
                        nArray17[u.lIlIlllIIl[1]] = lIlIlllIIl[40];
                        if (u.lIIlIIlllllII(Bank.contains((int[])nArray17) ? 1 : 0)) {
                            var7 = new DHelper(lIlIlllIIl[40], lIlIlllIIl[0], lIlIlllIIl[152]);
                            bp.add((DHelper) ar7);

                        }
                        int[] nArray18 = new int[lIlIlllIIl[0]];
                        nArray18[u.lIlIlllIIl[1]] = lIlIlllIIl[41];
                        if (u.lIIlIIlllllII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            var7 = new DHelper(lIlIlllIIl[41], lIlIlllIIl[0], lIlIlllIIl[153] + e.c(lIlIlllIIl[154], lIlIlllIIl[155]));
                            bp.add((DHelper) ar7);

                        }
                        if (u.lIIlIIlllllII(Bank.contains((Predicate)(var7 = item -> item.getName().toLowerCase().contains(lIlIllIllI[lIlIlllIIl[161]]))) ? 1 : 0)) {
                            var6 = new DHelper(lIlIlllIIl[156], lIlIlllIIl[8], lIlIlllIIl[157]);
                            bp.add(var6);

                        }
                        int[] nArray19 = new int[lIlIlllIIl[0]];
                        nArray19[u.lIlIlllIIl[1]] = lIlIlllIIl[34];
                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray19) ? 1 : 0)) break block43;
                        int[] nArray20 = new int[lIlIlllIIl[0]];
                        nArray20[u.lIlIlllIIl[1]] = lIlIlllIIl[34];
                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray20) ? 1 : 0)) break block44;
                        int[] nArray21 = new int[lIlIlllIIl[0]];
                        nArray21[u.lIlIlllIIl[1]] = lIlIlllIIl[34];
                        if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray21).getQuantity(), lIlIlllIIl[13])) break block44;
                    }
                    var6 = new DHelper(lIlIlllIIl[34], lIlIlllIIl[13], j.bZ);
                    bp.add(var6);

                }
                int[] nArray = new int[lIlIlllIIl[0]];
                nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[36];
                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray22 = new int[lIlIlllIIl[0]];
                nArray22[u.lIlIlllIIl[1]] = lIlIlllIIl[36];
                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray22) ? 1 : 0)) break block46;
                int[] nArray23 = new int[lIlIlllIIl[0]];
                nArray23[u.lIlIlllIIl[1]] = lIlIlllIIl[36];
                if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray23).getQuantity(), lIlIlllIIl[28])) break block46;
            }
            var6 = new DHelper(lIlIlllIIl[36], lIlIlllIIl[22], lIlIlllIIl[158]);
            bp.add(var6);

        }
    }

    @Override
    public boolean af() {
        boolean bl;
        if (u.lIIlIIllllllI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[2])) {
            bl = lIlIlllIIl[0];

            if (-1 > (0xC1 ^ 0xC5)) {
                return false;
            }
        } else {
            bl = lIlIlllIIl[1];
        }
        return bl;
    }

    private static boolean lIIlIlIIIIIIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIIlIlIIIIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIlIIIIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIlIIIIlII(int n2, int n3) {
        return n2 != n3;
    }

    private static int lIIlIIllllIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public String ae() {
        if (u.lIIlIlIIIIlIl(dl, lIlIllIllI[lIlIlllIIl[159]])) {
            return lIlIllIllI[lIlIlllIIl[160]];
        }
        return "Animal Magnetism - " + dl;
    }

    private static boolean lIIlIIllllIll(int n2, int n3) {
        return n2 < n3;
    }
}

