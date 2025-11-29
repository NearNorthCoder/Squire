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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.CHelper;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.QHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.THelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.UHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.GHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.IHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.MHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.NHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.QHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.SHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.UHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.WHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.YHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.ZHelper;
import gg.squire.account.AccBuilderRogues;
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

public class RHelper
implements G {
    static  WorldArea co;
    private static  String ct;
    static  int ck;
    public static  boolean bt;
    static  WorldPoint cr;
    static  WorldPoint cq;
    
    static  boolean cl;
    static  WorldPoint cg;
    static  WorldArea cp;
    
    private static  int cs;
    static  WorldArea cn;
    
    public static  List<d> bv;

    private static void aF() {
        WorldArea worldArea = new WorldArea(lIIlIIIIII[52], lIIlIIIIII[56], lIIlIIIIII[16], lIIlIIIIII[4], lIIlIIIIII[1]);
        if (r.llllIlIIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lIIlIIIIII[0]];
            stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[142]];
            TileObjects.getNearest((String[])stringArray).interact(lIIIlllIll[lIIlIIIIII[143]]);
            Time.sleepTicks((int)lIIlIIIIII[9]);

        }
        if (r.llllIlIIlIll(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(cg), lIIlIIIIII[21])) {
            AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[144]];
            if (r.llllIlIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)cg);

            Time.sleepTicks((int)lIIlIIIIII[0]);

        }
        if (r.llllIlIIlIIl(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cg), lIIlIIIIII[21])) {
            g.a(lIIIlllIll[lIIlIIIIII[145]], bR);
        }
        if (r.llllIlIIlIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIII[52], lIIlIIIIII[53], lIIlIIIIII[1])) ? 1 : 0)) {
            String[] stringArray = new String[lIIlIIIIII[0]];
            stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[99]];
            TileObjects.getNearest((String[])stringArray).interact(lIIIlllIll[lIIlIIIIII[146]]);
            Time.sleepTicks((int)lIIlIIIIII[9]);

        }
    }

    private static boolean llllIlIIlIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void llIIIlIlllI;
        int[] nArray = new int[lIIlIIIIII[20]];
        nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[36];
        nArray[r.lIIlIIIIII[0]] = lIIlIIIIII[37];
        nArray[r.lIIlIIIIII[9]] = lIIlIIIIII[34];
        nArray[r.lIIlIIIIII[11]] = lIIlIIIIII[40];
        nArray[r.lIIlIIIIII[13]] = lIIlIIIIII[41];
        nArray[r.lIIlIIIIII[8]] = lIIlIIIIII[30];
        nArray[r.lIIlIIIIII[16]] = lIIlIIIIII[31];
        int[] nArray2 = nArray;
        int llIIIlIllIl = lIIlIIIIII[1];
        while (r.llllIlIIlIlI(llIIIlIllIl, ((void)llIIIlIlllI).length)) {
            int[] nArray3 = new int[lIIlIIIIII[0]];
            nArray3[r.lIIlIIIIII[1]] = llIIIlIlllI[llIIIlIllIl];
            if (r.llllIlIIlIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIlIIIIII[1];
            }
            ++llIIIlIllIl;

            if (1 >= 0) continue;
            return ((32 + 110 - -32 + 10 ^ 105 + 119 - 130 + 65) & (0xD ^ 0x75 ^ (0xD5 ^ 0x8A) ^ -1)) != 0;
        }
        return lIIlIIIIII[0];
    }

    private static boolean llllIlIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void llllIIllIlII() {
        lIIIlllIll = new String[lIIlIIIIII[181]];
        r.lIIIlllIll[r.lIIlIIIIII[1]] = "Finished buying items, switching back to quest";
        r.lIIIlllIll[r.lIIlIIIIII[0]] = "Waterfall";
        r.lIIIlllIll[r.lIIlIIIIII[9]] = "Priest in Peril";
        r.lIIIlllIll[r.lIIlIIIIII[11]] = "Ernest the Chicken";
        r.lIIIlllIll[r.lIIlIIIIII[13]] = "Crafting";
        r.lIIIlllIll[r.lIIlIIIIII[8]] = "Woodcutting";
        r.lIIIlllIll[r.lIIlIIIIII[16]] = "Training range";
        r.lIIIlllIll[r.lIIlIIIIII[20]] = "Varrock Quiz";
        r.lIIIlllIll[r.lIIlIIIIII[21]] = "RFD Dwarf";
        r.lIIIlllIll[r.lIIlIIIIII[19]] = "A Porcine";
        r.lIIIlllIll[r.lIIlIIIIII[4]] = "Antique lamp";
        r.lIIIlllIll[r.lIIlIIIIII[23]] = "Client of Kourend";
        r.lIIIlllIll[r.lIIlIIIIII[24]] = "Antique lamp";
        r.lIIIlllIll[r.lIIlIIIIII[25]] = "(";
        r.lIIIlllIll[r.lIIlIIIIII[26]] = "Nav to bank";
        r.lIIIlllIll[r.lIIlIIIIII[28]] = "Handling banking";
        r.lIIIlllIll[r.lIIlIIIIII[35]] = "We are missing quest supplies, switching to BUYING";
        r.lIIIlllIll[r.lIIlIIIIII[42]] = "We are missing quest supplies, switching to BUYING";
        r.lIIIlllIll[r.lIIlIIIIII[46]] = "Drink";
        r.lIIIlllIll[r.lIIlIIIIII[12]] = "Drink";
        r.lIIIlllIll[r.lIIlIIIIII[48]] = "Shark";
        r.lIIIlllIll[r.lIIlIIIIII[49]] = "Shark";
        r.lIIIlllIll[r.lIIlIIIIII[50]] = "Eat";
        r.lIIIlllIll[r.lIIlIIIIII[51]] = "Nav to start";
        r.lIIIlllIll[r.lIIlIIIIII[47]] = "Ava";
        r.lIIIlllIll[r.lIIlIIIIII[54]] = "Bookcase";
        r.lIIIlllIll[r.lIIlIIIIII[55]] = "Search";
        r.lIIIlllIll[r.lIIlIIIIII[57]] = "Bookcase";
        r.lIIIlllIll[r.lIIlIIIIII[58]] = "Search";
        r.lIIIlllIll[r.lIIlIIIIII[59]] = "Wear";
        r.lIIIlllIll[r.lIIlIIIIII[64]] = "Nav to charter";
        r.lIIIlllIll[r.lIIlIIIIII[65]] = "Trader Crewmember";
        r.lIIIlllIll[r.lIIlIIIIII[10]] = "Trade";
        r.lIIIlllIll[r.lIIlIIIIII[66]] = "Break";
        r.lIIIlllIll[r.lIIlIIIIII[67]] = "Nav to ecto";
        r.lIIIlllIll[r.lIIlIIIIII[14]] = "Bones";
        r.lIIIlllIll[r.lIIlIIIIII[68]] = "Staircase";
        r.lIIIlllIll[r.lIIlIIIIII[69]] = "Climb-up";
        r.lIIIlllIll[r.lIIlIIIIII[70]] = "Loader";
        r.lIIIlllIll[r.lIIlIIIIII[71]] = "Bones";
        r.lIIIlllIll[r.lIIlIIIIII[22]] = "Bones";
        r.lIIIlllIll[r.lIIlIIIIII[72]] = "J''";
        r.lIIIlllIll[r.lIIlIIIIII[75]] = "Bones";
        r.lIIIlllIll[r.lIIlIIIIII[76]] = "Staircase";
        r.lIIIlllIll[r.lIIlIIIIII[77]] = "Climb-down";
        r.lIIIlllIll[r.lIIlIIIIII[78]] = "Bonemeal";
        r.lIIIlllIll[r.lIIlIIIIII[79]] = "Ectofuntus";
        r.lIIIlllIll[r.lIIlIIIIII[80]] = "Worship";
        r.lIIIlllIll[r.lIIlIIIIII[81]] = "Bonemeal";
        r.lIIIlllIll[r.lIIlIIIIII[82]] = "Ghost disciple";
        r.lIIIlllIll[r.lIIlIIIIII[15]] = "Malcolm";
        r.lIIIlllIll[r.lIIlIIIIII[84]] = "Alice";
        r.lIIIlllIll[r.lIIlIIIIII[85]] = "Malcolm";
        r.lIIIlllIll[r.lIIlIIIIII[86]] = "Alice";
        r.lIIIlllIll[r.lIIlIIIIII[87]] = "Malcolm";
        r.lIIIlllIll[r.lIIlIIIIII[88]] = "Alice";
        r.lIIIlllIll[r.lIIlIIIIII[93]] = "Nav to crone";
        r.lIIIlllIll[r.lIIlIIIIII[94]] = "Old crone";
        r.lIIIlllIll[r.lIIlIIIIII[96]] = "Malcolm";
        r.lIIIlllIll[r.lIIlIIIIII[98]] = "Malcolm";
        r.lIIIlllIll[r.lIIlIIIIII[6]] = "Malcolm";
        r.lIIIlllIll[r.lIIlIIIIII[101]] = "Undead chicken";
        r.lIIIlllIll[r.lIIlIIIIII[102]] = "Iron bar";
        r.lIIIlllIll[r.lIIlIIIIII[104]] = "Iron bar";
        r.lIIIlllIll[r.lIIlIIIIII[107]] = "Witch";
        r.lIIIlllIll[r.lIIlIIIIII[3]] = "Witch";
        r.lIIIlllIll[r.lIIlIIIIII[109]] = "Bar magnet";
        r.lIIIlllIll[r.lIIlIIIIII[113]] = "Nav to mine";
        r.lIIIlllIll[r.lIIlIIIIII[114]] = "Hammer";
        r.lIIIlllIll[r.lIIlIIIIII[115]] = "Selected iron";
        r.lIIIlllIll[r.lIIlIIIIII[89]] = "Bar magnet";
        r.lIIIlllIll[r.lIIlIIIIII[119]] = "Undead tree";
        r.lIIIlllIll[r.lIIlIIIIII[120]] = "Chop";
        r.lIIIlllIll[r.lIIlIIIIII[90]] = "Wear";
        r.lIIIlllIll[r.lIIlIIIIII[125]] = "Nav to npc";
        r.lIIIlllIll[r.lIIlIIIIII[126]] = "Turael";
        r.lIIIlllIll[r.lIIlIIIIII[95]] = "Turael";
        r.lIIIlllIll[r.lIIlIIIIII[128]] = "Undead twigs";
        r.lIIIlllIll[r.lIIlIIIIII[129]] = "Undead tree";
        r.lIIIlllIll[r.lIIlIIIIII[130]] = "Chop";
        r.lIIIlllIll[r.lIIlIIIIII[97]] = "Undead twigs";
        r.lIIIlllIll[r.lIIlIIIIII[134]] = "Research notes";
        r.lIIIlllIll[r.lIIlIIIIII[135]] = "Translate";
        r.lIIIlllIll[r.lIIlIIIIII[138]] = "A pattern";
        r.lIIIlllIll[r.lIIlIIIIII[139]] = "A pattern";
        r.lIIIlllIll[r.lIIlIIIIII[140]] = "Hard leather";
        r.lIIIlllIll[r.lIIlIIIIII[142]] = "Bookcase";
        r.lIIIlllIll[r.lIIlIIIIII[143]] = "Search";
        r.lIIIlllIll[r.lIIlIIIIII[144]] = "Nav to start";
        r.lIIIlllIll[r.lIIlIIIIII[145]] = "Ava";
        r.lIIIlllIll[r.lIIlIIIIII[99]] = "Bookcase";
        r.lIIIlllIll[r.lIIlIIIIII[146]] = "Search";
        r.lIIIlllIll[r.lIIlIIIIII[159]] = r.llllIIlIIIII("kLedPdlz+sw=", "bhYTU");
        r.lIIIlllIll[r.lIIlIIIIII[160]] = "Animal Magnetism";
        r.lIIIlllIll[r.lIIlIIIIII[161]] = "ring of wealth (";
        r.lIIIlllIll[r.lIIlIIIIII[162]] = "Drop";
        r.lIIIlllIll[r.lIIlIIIIII[173]] = "Yes.";
        r.lIIIlllIll[r.lIIlIIIIII[174]] = "I'm here about a quest.";
        r.lIIIlllIll[r.lIIlIIIIII[175]] = "Okay, you need it more than I do, I suppose.";
        r.lIIIlllIll[r.lIIlIIIIII[176]] = "Could I buy those chickens now, then?";
        r.lIIIlllIll[r.lIIlIIIIII[100]] = "Could I buy 2 chickens?";
        r.lIIIlllIll[r.lIIlIIIIII[177]] = "I'm here about a quest.";
        r.lIIIlllIll[r.lIIlIIIIII[178]] = "Hello, I'm here about those trees again.";
        r.lIIIlllIll[r.lIIlIIIIII[179]] = "I'd love one, thanks.";
        r.lIIIlllIll[r.lIIlIIIIII[180]] = r.llllIIlIIIII("P+8fwxVlSVs=", "yxhUb");
    }

    private static boolean llllIlIIlllI(Object object) {
        return object != null;
    }

    private static void af() {
        block46: {
            d llIIIlIlIIl;
            block45: {
                block44: {
                    block43: {
                        Object llIIIlIlIlI;
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
                                                                        int[] nArray = new int[lIIlIIIIII[0]];
                                                                        nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[43];
                                                                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                        int[] nArray2 = new int[lIIlIIIIII[0]];
                                                                        nArray2[r.lIIlIIIIII[1]] = lIIlIIIIII[43];
                                                                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block32;
                                                                        int[] nArray3 = new int[lIIlIIIIII[0]];
                                                                        nArray3[r.lIIlIIIIII[1]] = lIIlIIIIII[43];
                                                                        if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray3).getQuantity(), lIIlIIIIII[4])) break block32;
                                                                    }
                                                                    llIIIlIlIlI = new DHelper(lIIlIIIIII[43], lIIlIIIIII[4], e.c(lIIlIIIIII[147], lIIlIIIIII[148]));
                                                                    bv.add((DHelper) lIIIlIlIlI);

                                                                }
                                                                int[] nArray = new int[lIIlIIIIII[0]];
                                                                nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[30];
                                                                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                int[] nArray4 = new int[lIIlIIIIII[0]];
                                                                nArray4[r.lIIlIIIIII[1]] = lIIlIIIIII[30];
                                                                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block34;
                                                                int[] nArray5 = new int[lIIlIIIIII[0]];
                                                                nArray5[r.lIIlIIIIII[1]] = lIIlIIIIII[30];
                                                                if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray5).getQuantity(), lIIlIIIIII[16])) break block34;
                                                            }
                                                            llIIIlIlIlI = new DHelper(lIIlIIIIII[30], lIIlIIIIII[16], lIIlIIIIII[149]);
                                                            bv.add((DHelper) lIIIlIlIlI);

                                                        }
                                                        int[] nArray = new int[lIIlIIIIII[0]];
                                                        nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[31];
                                                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block35;
                                                        int[] nArray6 = new int[lIIlIIIIII[0]];
                                                        nArray6[r.lIIlIIIIII[1]] = lIIlIIIIII[31];
                                                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block36;
                                                        int[] nArray7 = new int[lIIlIIIIII[0]];
                                                        nArray7[r.lIIlIIIIII[1]] = lIIlIIIIII[31];
                                                        if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIIlIIIIII[28])) break block36;
                                                    }
                                                    llIIIlIlIlI = new DHelper(lIIlIIIIII[31], lIIlIIIIII[28], lIIlIIIIII[150]);
                                                    bv.add((DHelper) lIIIlIlIlI);

                                                }
                                                int[] nArray = new int[lIIlIIIIII[0]];
                                                nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[103];
                                                if (r.llllIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    llIIIlIlIlI = new DHelper(lIIlIIIIII[103], lIIlIIIIII[8], lIIlIIIIII[151]);
                                                    bv.add((DHelper) lIIIlIlIlI);

                                                }
                                                int[] nArray8 = new int[lIIlIIIIII[0]];
                                                nArray8[r.lIIlIIIIII[1]] = lIIlIIIIII[37];
                                                if (r.llllIlIIlIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                    llIIIlIlIlI = new DHelper(lIIlIIIIII[37], lIIlIIIIII[0], lIIlIIIIII[27]);
                                                    bv.add((DHelper) lIIIlIlIlI);

                                                }
                                                int[] nArray9 = new int[lIIlIIIIII[0]];
                                                nArray9[r.lIIlIIIIII[1]] = lIIlIIIIII[32];
                                                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block37;
                                                int[] nArray10 = new int[lIIlIIIIII[0]];
                                                nArray10[r.lIIlIIIIII[1]] = lIIlIIIIII[32];
                                                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block38;
                                                int[] nArray11 = new int[lIIlIIIIII[0]];
                                                nArray11[r.lIIlIIIIII[1]] = lIIlIIIIII[32];
                                                if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray11).getQuantity(), lIIlIIIIII[13])) break block38;
                                            }
                                            llIIIlIlIlI = new DHelper(lIIlIIIIII[32], lIIlIIIIII[13], lIIlIIIIII[27]);
                                            bv.add((DHelper) lIIIlIlIlI);

                                        }
                                        int[] nArray = new int[lIIlIIIIII[0]];
                                        nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[33];
                                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                                        int[] nArray12 = new int[lIIlIIIIII[0]];
                                        nArray12[r.lIIlIIIIII[1]] = lIIlIIIIII[33];
                                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray12) ? 1 : 0)) break block40;
                                        int[] nArray13 = new int[lIIlIIIIII[0]];
                                        nArray13[r.lIIlIIIIII[1]] = lIIlIIIIII[33];
                                        if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray13).getQuantity(), lIIlIIIIII[8])) break block40;
                                    }
                                    llIIIlIlIlI = new DHelper(lIIlIIIIII[33], lIIlIIIIII[8], lIIlIIIIII[27]);
                                    bv.add((DHelper) lIIIlIlIlI);

                                }
                                int[] nArray = new int[lIIlIIIIII[0]];
                                nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[29];
                                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                int[] nArray14 = new int[lIIlIIIIII[0]];
                                nArray14[r.lIIlIIIIII[1]] = lIIlIIIIII[29];
                                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block42;
                                int[] nArray15 = new int[lIIlIIIIII[0]];
                                nArray15[r.lIIlIIIIII[1]] = lIIlIIIIII[29];
                                if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray15).getQuantity(), lIIlIIIIII[8])) break block42;
                            }
                            llIIIlIlIlI = new DHelper(lIIlIIIIII[29], lIIlIIIIII[13], lIIlIIIIII[27]);
                            bv.add((DHelper) lIIIlIlIlI);

                        }
                        int[] nArray = new int[lIIlIIIIII[0]];
                        nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[39];
                        if (r.llllIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            llIIIlIlIlI = new DHelper(lIIlIIIIII[39], lIIlIIIIII[0], lIIlIIIIII[27]);
                            bv.add((DHelper) lIIIlIlIlI);

                        }
                        int[] nArray16 = new int[lIIlIIIIII[0]];
                        nArray16[r.lIIlIIIIII[1]] = lIIlIIIIII[38];
                        if (r.llllIlIIlIll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                            llIIIlIlIlI = new DHelper(lIIlIIIIII[38], lIIlIIIIII[0], lIIlIIIIII[27]);
                            bv.add((DHelper) lIIIlIlIlI);

                        }
                        int[] nArray17 = new int[lIIlIIIIII[0]];
                        nArray17[r.lIIlIIIIII[1]] = lIIlIIIIII[40];
                        if (r.llllIlIIlIll(Bank.contains((int[])nArray17) ? 1 : 0)) {
                            llIIIlIlIlI = new DHelper(lIIlIIIIII[40], lIIlIIIIII[0], lIIlIIIIII[152]);
                            bv.add((DHelper) lIIIlIlIlI);

                        }
                        int[] nArray18 = new int[lIIlIIIIII[0]];
                        nArray18[r.lIIlIIIIII[1]] = lIIlIIIIII[41];
                        if (r.llllIlIIlIll(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            llIIIlIlIlI = new DHelper(lIIlIIIIII[41], lIIlIIIIII[0], lIIlIIIIII[153] + e.c(lIIlIIIIII[154], lIIlIIIIII[155]));
                            bv.add((DHelper) lIIIlIlIlI);

                        }
                        if (r.llllIlIIlIll(Bank.contains((Predicate)(llIIIlIlIlI = item -> item.getName().toLowerCase().contains(lIIIlllIll[lIIlIIIIII[161]]))) ? 1 : 0)) {
                            llIIIlIlIIl = new DHelper(lIIlIIIIII[156], lIIlIIIIII[8], lIIlIIIIII[157]);
                            bv.add(llIIIlIlIIl);

                        }
                        int[] nArray19 = new int[lIIlIIIIII[0]];
                        nArray19[r.lIIlIIIIII[1]] = lIIlIIIIII[34];
                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray19) ? 1 : 0)) break block43;
                        int[] nArray20 = new int[lIIlIIIIII[0]];
                        nArray20[r.lIIlIIIIII[1]] = lIIlIIIIII[34];
                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray20) ? 1 : 0)) break block44;
                        int[] nArray21 = new int[lIIlIIIIII[0]];
                        nArray21[r.lIIlIIIIII[1]] = lIIlIIIIII[34];
                        if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray21).getQuantity(), lIIlIIIIII[13])) break block44;
                    }
                    llIIIlIlIIl = new DHelper(lIIlIIIIII[34], lIIlIIIIII[13], i.bq);
                    bv.add(llIIIlIlIIl);

                }
                int[] nArray = new int[lIIlIIIIII[0]];
                nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[36];
                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray22 = new int[lIIlIIIIII[0]];
                nArray22[r.lIIlIIIIII[1]] = lIIlIIIIII[36];
                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray22) ? 1 : 0)) break block46;
                int[] nArray23 = new int[lIIlIIIIII[0]];
                nArray23[r.lIIlIIIIII[1]] = lIIlIIIIII[36];
                if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray23).getQuantity(), lIIlIIIIII[28])) break block46;
            }
            llIIIlIlIIl = new DHelper(lIIlIIIIII[36], lIIlIIIIII[22], lIIlIIIIII[158]);
            bv.add(llIIIlIlIIl);

        }
    }

    private static boolean llllIlIlIlII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllIlIlIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllIlIlIIII(int n2) {
        return n2 < 0;
    }

    private static boolean llllIlIlIIll(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public String U() {
        if (r.llllIlIlIlII(ct, lIIIlllIll[lIIlIIIIII[159]])) {
            return lIIIlllIll[lIIlIIIIII[160]];
        }
        return "Animal Magnetism - " + ct;
    }

    public static void aE() {
        block115: {
            WorldPoint llIIIllIIll;
            Object llIIIllIlII;
            block116: {
                block123: {
                    block118: {
                        block122: {
                            block121: {
                                block120: {
                                    block119: {
                                        block117: {
                                            if (r.llllIlIIlIIl(bt ? 1 : 0)) {
                                                b.a(bv);
                                                if (r.llllIlIIlIlI(bv.size(), lIIlIIIIII[0])) {
                                                    System.out.println(lIIIlllIll[lIIlIIIIII[1]]);
                                                    bt = lIIlIIIIII[1];
                                                }
                                            }
                                            if (!r.llllIlIIlIll(bt ? 1 : 0) || !r.llllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[2])) break block115;
                                            if (r.llllIlIIlIlI(e.j(lIIlIIIIII[3]), lIIlIIIIII[4])) {
                                                ct = lIIIlllIll[lIIlIIIIII[0]];
                                                z.bn();
                                            }
                                            if (r.llllIlIIllII(e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && (!r.llllIlIIllIl(e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) || r.llllIlIIlIlI(e.j(lIIlIIIIII[7]), lIIlIIIIII[8]))) {
                                                ct = lIIIlllIll[lIIlIIIIII[9]];
                                                u.aM();
                                            }
                                            if (r.llllIlIIllII(e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && r.llllIlIIllIl(e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) && r.llllIlIIllIl(e.j(lIIlIIIIII[7]), lIIlIIIIII[8]) && r.llllIlIIlIlI(e.j(lIIlIIIIII[10]), lIIlIIIIII[11])) {
                                                ct = lIIIlllIll[lIIlIIIIII[11]];
                                                C.bH();
                                            }
                                            if (r.llllIlIIllII(e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && r.llllIlIIllIl(e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) && r.llllIlIIllIl(e.j(lIIlIIIIII[7]), lIIlIIIIII[8]) && r.llllIlIIllII(e.j(lIIlIIIIII[10]), lIIlIIIIII[11]) && r.llllIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIIlIIIIII[12])) {
                                                ct = lIIIlllIll[lIIlIIIIII[13]];
                                                Q.cT();
                                            }
                                            if (r.llllIlIIllII(e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && r.llllIlIIllIl(e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) && r.llllIlIIllIl(e.j(lIIlIIIIII[7]), lIIlIIIIII[8]) && r.llllIlIIllII(e.j(lIIlIIIIII[10]), lIIlIIIIII[11]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.CRAFTING), lIIlIIIIII[12]) && r.llllIlIIlIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIlIIIIII[14])) {
                                                ct = lIIIlllIll[lIIlIIIIII[8]];
                                                T.ds();
                                            }
                                            if (r.llllIlIIllII(e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && r.llllIlIIllIl(e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) && r.llllIlIIllIl(e.j(lIIlIIIIII[7]), lIIlIIIIII[8]) && r.llllIlIIllII(e.j(lIIlIIIIII[10]), lIIlIIIIII[11]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.CRAFTING), lIIlIIIIII[12]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIlIIIIII[14]) && r.llllIlIIlIlI(Skills.getLevel((Skill)Skill.RANGED), lIIlIIIIII[15])) {
                                                ct = lIIIlllIll[lIIlIIIIII[16]];
                                                if (r.llllIlIIlIlI(cs, lIIlIIIIII[0])) {
                                                    n.bU = lIIlIIIIII[1];
                                                    cs += lIIlIIIIII[0];
                                                }
                                                m.ap();
                                            }
                                            if (r.llllIlIIllII(e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && r.llllIlIIllIl(e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) && r.llllIlIIllIl(e.j(lIIlIIIIII[7]), lIIlIIIIII[8]) && r.llllIlIIllII(e.j(lIIlIIIIII[10]), lIIlIIIIII[11]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.CRAFTING), lIIlIIIIII[12]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIlIIIIII[14]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIIIIII[15])) {
                                                if (!r.llllIlIIllIl(e.j(lIIlIIIIII[17]), lIIlIIIIII[18]) || r.llllIlIIlIlI(Skills.getLevel((Skill)Skill.HUNTER), lIIlIIIIII[19])) {
                                                    ct = lIIIlllIll[lIIlIIIIII[20]];
                                                    y.bk();
                                                }
                                                if (r.llllIlIIllIl(e.j(lIIlIIIIII[17]), lIIlIIIIII[18]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.HUNTER), lIIlIIIIII[19]) && r.llllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlIIIIII[6])) {
                                                    ct = lIIIlllIll[lIIlIIIIII[21]];
                                                    w.bf();
                                                }
                                                if (r.llllIlIIllIl(e.j(lIIlIIIIII[17]), lIIlIIIIII[18]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.HUNTER), lIIlIIIIII[19]) && r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlIIIIII[6]) && r.llllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIIIIII[22])) {
                                                    ct = lIIIlllIll[lIIlIIIIII[19]];
                                                    q.aC();
                                                }
                                                if (r.llllIlIIllIl(e.j(lIIlIIIIII[17]), lIIlIIIIII[18]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.HUNTER), lIIlIIIIII[19]) && r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlIIIIII[6]) && r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIIIIII[22]) && r.llllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIlIIIIII[19])) {
                                                    String[] stringArray = new String[lIIlIIIIII[0]];
                                                    stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[4]];
                                                    if (r.llllIlIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        ct = lIIIlllIll[lIIlIIIIII[23]];
                                                        s.aH();
                                                    }
                                                }
                                                s.aI();
                                            }
                                            if (!r.llllIlIIlIll(r.ab() ? 1 : 0) || !r.llllIlIIlIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) || !r.llllIlIIllIl(e.j(lIIlIIIIII[17]), lIIlIIIIII[18]) || !r.llllIlIIllIl(Skills.getLevel((Skill)Skill.HUNTER), lIIlIIIIII[19]) || !r.llllIlIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIIIIII[15]) || !r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlIIIIII[6]) || !r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIIIIII[22]) || !r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIlIIIIII[19])) break block116;
                                            String[] stringArray = new String[lIIlIIIIII[0]];
                                            stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[24]];
                                            if (!r.llllIlIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block116;
                                            ct = lIIIlllIll[lIIlIIIIII[25]];
                                            llIIIllIlII = BankLocation.getNearest();
                                            if (r.llllIlIIlllI(llIIIllIlII) && r.llllIlIIlIll(llIIIllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[26]];
                                                a.a((BankLocation)llIIIllIlII);
                                            }
                                            if (!r.llllIlIIlllI(llIIIllIlII) || !r.llllIlIIlIIl(llIIIllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block116;
                                            if (r.llllIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIII[27]);

                                            }
                                            if (!r.llllIlIIlIIl(Bank.isOpen() ? 1 : 0)) break block116;
                                            AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[28]];
                                            if (r.llllIlIIllll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIlIIIIII[13]);

                                            }
                                            if (r.llllIlIIllll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIlIIIIII[9]);

                                            }
                                            int[] nArray = new int[lIIlIIIIII[0]];
                                            nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[29];
                                            if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block117;
                                            int[] nArray2 = new int[lIIlIIIIII[0]];
                                            nArray2[r.lIIlIIIIII[1]] = lIIlIIIIII[29];
                                            if (!r.llllIlIIllIl(Bank.getFirst((int[])nArray2).getQuantity(), lIIlIIIIII[8])) break block118;
                                        }
                                        int[] nArray = new int[lIIlIIIIII[0]];
                                        nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[30];
                                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block119;
                                        int[] nArray3 = new int[lIIlIIIIII[0]];
                                        nArray3[r.lIIlIIIIII[1]] = lIIlIIIIII[30];
                                        if (!r.llllIlIIllIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIlIIIIII[16])) break block118;
                                    }
                                    int[] nArray = new int[lIIlIIIIII[0]];
                                    nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[31];
                                    if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block120;
                                    int[] nArray4 = new int[lIIlIIIIII[0]];
                                    nArray4[r.lIIlIIIIII[1]] = lIIlIIIIII[31];
                                    if (!r.llllIlIIllIl(Bank.getFirst((int[])nArray4).getQuantity(), lIIlIIIIII[28])) break block118;
                                }
                                int[] nArray = new int[lIIlIIIIII[0]];
                                nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[32];
                                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block121;
                                int[] nArray5 = new int[lIIlIIIIII[0]];
                                nArray5[r.lIIlIIIIII[1]] = lIIlIIIIII[32];
                                if (!r.llllIlIIllIl(Bank.getFirst((int[])nArray5).getQuantity(), lIIlIIIIII[13])) break block118;
                            }
                            int[] nArray = new int[lIIlIIIIII[0]];
                            nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[33];
                            if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block122;
                            int[] nArray6 = new int[lIIlIIIIII[0]];
                            nArray6[r.lIIlIIIIII[1]] = lIIlIIIIII[33];
                            if (!r.llllIlIIllIl(Bank.getFirst((int[])nArray6).getQuantity(), lIIlIIIIII[8])) break block118;
                        }
                        int[] nArray = new int[lIIlIIIIII[0]];
                        nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[34];
                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block123;
                        int[] nArray7 = new int[lIIlIIIIII[0]];
                        nArray7[r.lIIlIIIIII[1]] = lIIlIIIIII[34];
                        if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIIlIIIIII[13])) break block123;
                    }
                    r.af();
                    System.out.println(lIIIlllIll[lIIlIIIIII[35]]);
                    bt = lIIlIIIIII[0];
                    return;
                }
                int[] nArray = new int[lIIlIIIIII[23]];
                nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[36];
                nArray[r.lIIlIIIIII[0]] = lIIlIIIIII[37];
                nArray[r.lIIlIIIIII[9]] = lIIlIIIIII[33];
                nArray[r.lIIlIIIIII[11]] = lIIlIIIIII[38];
                nArray[r.lIIlIIIIII[13]] = lIIlIIIIII[32];
                nArray[r.lIIlIIIIII[8]] = lIIlIIIIII[34];
                nArray[r.lIIlIIIIII[16]] = lIIlIIIIII[39];
                nArray[r.lIIlIIIIII[20]] = lIIlIIIIII[40];
                nArray[r.lIIlIIIIII[21]] = lIIlIIIIII[41];
                nArray[r.lIIlIIIIII[19]] = lIIlIIIIII[30];
                nArray[r.lIIlIIIIII[4]] = lIIlIIIIII[31];
                if (r.llllIlIIlIll(e.b(nArray) ? 1 : 0)) {
                    r.af();
                    System.out.println(lIIIlllIll[lIIlIIIIII[42]]);
                    bt = lIIlIIIIII[0];
                    return;
                }
                int[] nArray8 = new int[lIIlIIIIII[23]];
                nArray8[r.lIIlIIIIII[1]] = lIIlIIIIII[36];
                nArray8[r.lIIlIIIIII[0]] = lIIlIIIIII[37];
                nArray8[r.lIIlIIIIII[9]] = lIIlIIIIII[33];
                nArray8[r.lIIlIIIIII[11]] = lIIlIIIIII[38];
                nArray8[r.lIIlIIIIII[13]] = lIIlIIIIII[32];
                nArray8[r.lIIlIIIIII[8]] = lIIlIIIIII[34];
                nArray8[r.lIIlIIIIII[16]] = lIIlIIIIII[39];
                nArray8[r.lIIlIIIIII[20]] = lIIlIIIIII[40];
                nArray8[r.lIIlIIIIII[21]] = lIIlIIIIII[41];
                nArray8[r.lIIlIIIIII[19]] = lIIlIIIIII[30];
                nArray8[r.lIIlIIIIII[4]] = lIIlIIIIII[31];
                if (r.llllIlIIlIIl(e.b(nArray8) ? 1 : 0)) {
                    a.a(lIIlIIIIII[34], lIIlIIIIII[13]);
                    a.a(lIIlIIIIII[37], lIIlIIIIII[0]);
                    a.a(lIIlIIIIII[43], lIIlIIIIII[0]);
                    a.a(lIIlIIIIII[32], lIIlIIIIII[13]);
                    a.a(lIIlIIIIII[29], lIIlIIIIII[13]);
                    a.a(lIIlIIIIII[40], lIIlIIIIII[0]);
                    a.a(lIIlIIIIII[41], lIIlIIIIII[0]);
                    a.a(lIIlIIIIII[36], lIIlIIIIII[4]);
                    a.a(lIIlIIIIII[30], lIIlIIIIII[4]);
                    a.a(lIIlIIIIII[31], lIIlIIIIII[28]);
                    a.a(lIIlIIIIII[44], lIIlIIIIII[0]);
                    a.a(lIIlIIIIII[45], lIIlIIIIII[27]);
                }
            }
            if (r.llllIlIIlIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && r.llllIlIIlIlI(Movement.getRunEnergy(), lIIlIIIIII[15])) {
                Inventory.getFirst((int[])f.aV).interact(lIIIlllIll[lIIlIIIIII[46]]);
                Time.sleepTicks((int)lIIlIIIIII[0]);

            }
            if (r.llllIlIIlIIl(Inventory.contains((int[])f.aS) ? 1 : 0) && r.llllIlIIlIlI(Prayers.getPoints(), lIIlIIIIII[47])) {
                Inventory.getFirst((int[])f.aS).interact(lIIIlllIll[lIIlIIIIII[12]]);
            }
            if (r.llllIlIlIIII(r.llllIlIIlIII(e.u(), 60.0))) {
                String[] stringArray = new String[lIIlIIIIII[0]];
                stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[48]];
                if (r.llllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIlIIIIII[0]];
                    stringArray2[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[49]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIlllIll[lIIlIIIIII[50]]);
                    Time.sleepTicks((int)lIIlIIIIII[9]);

                }
            }
            if (r.llllIlIIlIIl(r.ab() ? 1 : 0) && r.llllIlIIlIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (r.llllIlIIlIll(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(cg), lIIlIIIIII[21])) {
                    AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[51]];
                    if (r.llllIlIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)cg);

                    Time.sleepTicks((int)lIIlIIIIII[0]);

                }
                if (r.llllIlIIlIIl(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cg), lIIlIIIIII[21])) {
                    ck = lIIlIIIIII[1];
                    g.a(lIIIlllIll[lIIlIIIIII[47]], bR);
                }
                if (r.llllIlIIlIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIII[52], lIIlIIIIII[53], lIIlIIIIII[1])) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIII[0]];
                    stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[54]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlllIll[lIIlIIIIII[55]]);
                    Time.sleepTicks((int)lIIlIIIIII[9]);

                }
                if (r.llllIlIIlIIl((llIIIllIlII = new WorldArea(lIIlIIIIII[52], lIIlIIIIII[56], lIIlIIIIII[16], lIIlIIIIII[4], lIIlIIIIII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIII[0]];
                    stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[57]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlllIll[lIIlIIIIII[58]]);
                    Time.sleepTicks((int)lIIlIIIIII[9]);

                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[4])) {
                int[] nArray = new int[lIIlIIIIII[0]];
                nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[44];
                if (r.llllIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray9 = new int[lIIlIIIIII[0]];
                    nArray9[r.lIIlIIIIII[1]] = lIIlIIIIII[44];
                    Inventory.getFirst((int[])nArray9).interact(lIIIlllIll[lIIlIIIIII[59]]);
                }
                int[] nArray10 = new int[lIIlIIIIII[0]];
                nArray10[r.lIIlIIIIII[1]] = lIIlIIIIII[60];
                if (r.llllIlIIlIll(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                    block114: {
                        llIIIllIlII = new WorldPoint(lIIlIIIIII[61], lIIlIIIIII[62], lIIlIIIIII[1]);
                        int[] nArray11 = new int[lIIlIIIIII[0]];
                        nArray11[r.lIIlIIIIII[1]] = lIIlIIIIII[63];
                        if (r.llllIlIIlIll(Inventory.contains((int[])nArray11) ? 1 : 0) && r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIIIllIlII), lIIlIIIIII[48])) {
                            if (r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(cq), lIIlIIIIII[8])) {
                                AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[64]];
                                Movement.walkTo((WorldPoint)cq);

                                Time.sleepTicks((int)lIIlIIIIII[0]);

                            }
                            if (r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cq), lIIlIIIIII[8])) {
                                if (r.llllIlIIlIll(Shop.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIIlIIIIII[0]];
                                    stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[65]];
                                    NPCs.getNearest((String[])stringArray).interact(lIIIlllIll[lIIlIIIIII[10]]);
                                    Time.sleepTicks((int)lIIlIIIIII[9]);

                                }
                                if (r.llllIlIIlIIl(Shop.isOpen() ? 1 : 0)) {
                                    Shop.buyFive((int)lIIlIIIIII[63]);
                                    Time.sleepTicks((int)lIIlIIIIII[11]);

                                }
                            }
                        }
                        int[] nArray12 = new int[lIIlIIIIII[0]];
                        nArray12[r.lIIlIIIIII[1]] = lIIlIIIIII[63];
                        if (r.llllIlIIlIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                            if (r.llllIlIIlIll(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.llllIlIIlIll(cp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                int[] nArray13 = new int[lIIlIIIIII[0]];
                                nArray13[r.lIIlIIIIII[1]] = lIIlIIIIII[31];
                                if (r.llllIlIIlIIl(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                    int[] nArray14 = new int[lIIlIIIIII[0]];
                                    nArray14[r.lIIlIIIIII[1]] = lIIlIIIIII[31];
                                    Inventory.getFirst((int[])nArray14).interact(lIIIlllIll[lIIlIIIIII[66]]);
                                    Time.sleepTicks((int)lIIlIIIIII[20]);

                                }
                            }
                            if (!r.llllIlIIlIll(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || r.llllIlIIlIIl(cp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                llIIIllIIll = new WorldPoint(lIIlIIIIII[61], lIIlIIIIII[62], lIIlIIIIII[1]);
                                if (r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(llIIIllIIll), lIIlIIIIII[8]) && r.llllIlIIlIll(Players.getLocal().getWorldLocation().getPlane())) {
                                    AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[67]];
                                    Movement.walkTo((WorldPoint)llIIIllIIll);

                                    Time.sleepTicks((int)lIIlIIIIII[0]);

                                }
                                String[] stringArray = new String[lIIlIIIIII[0]];
                                stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[14]];
                                if (r.llllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    if (r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(llIIIllIIll), lIIlIIIIII[8]) && r.llllIlIIlIll(Players.getLocal().getWorldLocation().getPlane())) {
                                        String[] stringArray3 = new String[lIIlIIIIII[0]];
                                        stringArray3[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[68]];
                                        TileObjects.getNearest((String[])stringArray3).interact(lIIIlllIll[lIIlIIIIII[69]]);
                                        Time.sleepTicks((int)lIIlIIIIII[13]);

                                    }
                                    String[] stringArray4 = new String[lIIlIIIIII[0]];
                                    stringArray4[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[70]];
                                    if (r.llllIlIIlllI(TileObjects.getNearest((String[])stringArray4))) {
                                        String[] stringArray5 = new String[lIIlIIIIII[0]];
                                        stringArray5[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[71]];
                                        if (r.llllIlIIlIIl(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                            String[] stringArray6 = new String[lIIlIIIIII[0]];
                                            stringArray6[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[22]];
                                            String[] stringArray7 = new String[lIIlIIIIII[0]];
                                            stringArray7[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[72]];
                                            Inventory.getFirst((String[])stringArray6).useOn(TileObjects.getNearest((String[])stringArray7));
                                            Time.sleep((long)e.c(lIIlIIIIII[73], lIIlIIIIII[74]));

                                        }
                                    }
                                }
                                String[] stringArray8 = new String[lIIlIIIIII[0]];
                                stringArray8[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[75]];
                                if (r.llllIlIIlIll(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                    if (r.llllIlIIllII(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIII[0])) {
                                        String[] stringArray9 = new String[lIIlIIIIII[0]];
                                        stringArray9[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[76]];
                                        TileObjects.getNearest((String[])stringArray9).interact(lIIIlllIll[lIIlIIIIII[77]]);
                                        Time.sleepTicks((int)lIIlIIIIII[8]);

                                    }
                                    if (r.llllIlIIlIll(Players.getLocal().getWorldLocation().getPlane())) {
                                        do {
                                            String[] stringArray10 = new String[lIIlIIIIII[0]];
                                            stringArray10[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[78]];
                                            if (!r.llllIlIIlIIl(Inventory.contains((String[])stringArray10) ? 1 : 0)) break block114;
                                            String[] stringArray11 = new String[lIIlIIIIII[0]];
                                            stringArray11[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[79]];
                                            TileObjects.getNearest((String[])stringArray11).interact(lIIIlllIll[lIIlIIIIII[80]]);
                                            Time.sleepTicks((int)lIIlIIIIII[9]);

                                        } while (1 <= 3);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    int[] nArray15 = new int[lIIlIIIIII[0]];
                    nArray15[r.lIIlIIIIII[1]] = lIIlIIIIII[32];
                    if (r.llllIlIIlIll(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIIIII[0]];
                        stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[81]];
                        if (r.llllIlIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0) && r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIIIllIlII), lIIlIIIIII[48])) {
                            if (r.llllIlIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                g.a(lIIIlllIll[lIIlIIIIII[82]], bR);
                                Time.sleepTicks((int)lIIlIIIIII[0]);

                            }
                            g.a(bR);
                        }
                    }
                }
                int[] nArray16 = new int[lIIlIIIIII[0]];
                nArray16[r.lIIlIIIIII[1]] = lIIlIIIIII[60];
                if (r.llllIlIIlIIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIlIIIIII[9]];
                    nArray17[r.lIIlIIIIII[1]] = lIIlIIIIII[83];
                    nArray17[r.lIIlIIIIII[0]] = lIIlIIIIII[29];
                    if (r.llllIlIIlIIl(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                        int[] nArray18 = new int[lIIlIIIIII[9]];
                        nArray18[r.lIIlIIIIII[1]] = lIIlIIIIII[83];
                        nArray18[r.lIIlIIIIII[0]] = lIIlIIIIII[29];
                        Inventory.getAll((int[])nArray18).stream().forEach(item -> item.interact(lIIIlllIll[lIIlIIIIII[162]]));
                    }
                    if (r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(cr), lIIlIIIIII[20])) {
                        Movement.walkTo((WorldPoint)cr);

                        Time.sleepTicks((int)lIIlIIIIII[0]);

                    }
                    if (r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cr), lIIlIIIIII[20])) {
                        g.a(lIIIlllIll[lIIlIIIIII[15]], bR);
                    }
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[48])) {
                g.a(lIIIlllIll[lIIlIIIIII[84]], bR);
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[64])) {
                g.a(lIIIlllIll[lIIlIIIIII[85]], bR);
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[22])) {
                g.a(lIIIlllIll[lIIlIIIIII[86]], bR);
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[15])) {
                g.a(lIIIlllIll[lIIlIIIIII[87]], bR);
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[6])) {
                g.a(lIIIlllIll[lIIlIIIIII[88]], bR);
            }
            if (!r.llllIlIlIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[89]) || r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[90])) {
                llIIIllIlII = new WorldPoint(lIIlIIIIII[91], lIIlIIIIII[92], lIIlIIIIII[1]);
                if (r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIIIllIlII), lIIlIIIIII[11])) {
                    AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[93]];
                    Movement.walkTo((WorldPoint)llIIIllIlII);

                    Time.sleepTicks((int)lIIlIIIIII[0]);

                }
                if (r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIIIllIlII), lIIlIIIIII[11])) {
                    g.a(lIIIlllIll[lIIlIIIIII[94]], bR);
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[95])) {
                if (r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(cr), lIIlIIIIII[20])) {
                    Movement.walkTo((WorldPoint)cr);

                    Time.sleepTicks((int)lIIlIIIIII[0]);

                }
                if (r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cr), lIIlIIIIII[20])) {
                    g.a(lIIIlllIll[lIIlIIIIII[96]], bR);
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[97])) {
                g.a(lIIIlllIll[lIIlIIIIII[98]], bR);
            }
            if (!r.llllIlIlIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[99]) || r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[100])) {
                g.a(lIIIlllIll[lIIlIIIIII[6]], bR);
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[100])) {
                String[] stringArray = new String[lIIlIIIIII[0]];
                stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[101]];
                if (r.llllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray12 = new String[lIIlIIIIII[0]];
                    stringArray12[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[102]];
                    if (r.llllIlIIlIll(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        llIIIllIlII = new HashMap();
                        ((HashMap)llIIIllIlII).put(lIIlIIIIII[33], lIIlIIIIII[8]);

                        ((HashMap)llIIIllIlII).put(lIIlIIIIII[38], lIIlIIIIII[0]);

                        ((HashMap)llIIIllIlII).put(lIIlIIIIII[39], lIIlIIIIII[0]);

                        ((HashMap)llIIIllIlII).put(lIIlIIIIII[103], lIIlIIIIII[0]);

                        e.a((HashMap<Integer, Integer>)llIIIllIlII, lIIlIIIIII[1], lIIlIIIIII[1]);
                    }
                    String[] stringArray13 = new String[lIIlIIIIII[0]];
                    stringArray13[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[104]];
                    if (r.llllIlIIlIIl(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        r.aF();
                    }
                }
            }
            if (!r.llllIlIlIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[105]) || r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[106])) {
                String[] stringArray = new String[lIIlIIIIII[0]];
                stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[107]];
                llIIIllIlII = NPCs.getNearest((String[])stringArray);
                if (r.llllIlIIlllI(llIIIllIlII)) {
                    if (r.llllIlIIlIIl(Reachable.isInteractable((Locatable)llIIIllIlII) ? 1 : 0)) {
                        g.a(lIIIlllIll[lIIlIIIIII[3]], bR);
                    }
                    if (r.llllIlIIlIll(Reachable.isInteractable((Locatable)llIIIllIlII) ? 1 : 0)) {
                        Movement.walkTo((Locatable)llIIIllIlII);

                        Time.sleepTicks((int)lIIlIIIIII[0]);

                    }
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[108])) {
                String[] stringArray = new String[lIIlIIIIII[0]];
                stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[109]];
                if (r.llllIlIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    llIIIllIlII = new WorldPoint(lIIlIIIIII[110], lIIlIIIIII[111], lIIlIIIIII[1]);
                    llIIIllIIll = new WorldPoint(lIIlIIIIII[110], lIIlIIIIII[112], lIIlIIIIII[1]);
                    if (r.llllIlIIlIll(Players.getLocal().getWorldLocation().equals(llIIIllIlII) ? 1 : 0) && r.llllIlIIlIll(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIll) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[113]];
                        Movement.walkTo((WorldPoint)llIIIllIlII);

                        Time.sleepTicks((int)lIIlIIIIII[0]);

                    }
                    if (r.llllIlIIlIIl(Players.getLocal().getWorldLocation().equals(llIIIllIlII) ? 1 : 0) && r.llllIlIIlIll(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIll) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIllIIll);

                    }
                    if (r.llllIlIIlIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIll) ? 1 : 0)) {
                        String[] stringArray14 = new String[lIIlIIIIII[0]];
                        stringArray14[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[114]];
                        String[] stringArray15 = new String[lIIlIIIIII[0]];
                        stringArray15[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[115]];
                        Inventory.getFirst((String[])stringArray14).useOn(Inventory.getFirst((String[])stringArray15));
                        Time.sleepTicks((int)lIIlIIIIII[11]);

                    }
                }
                String[] stringArray16 = new String[lIIlIIIIII[0]];
                stringArray16[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[89]];
                if (r.llllIlIIlIIl(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    r.aF();
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[116])) {
                llIIIllIlII = new WorldPoint(lIIlIIIIII[117], lIIlIIIIII[118], lIIlIIIIII[1]);
                if (r.llllIlIIlIll(Players.getLocal().getWorldLocation().equals(llIIIllIlII) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)llIIIllIlII);

                    Time.sleepTicks((int)lIIlIIIIII[0]);

                }
                if (r.llllIlIIlIIl(Players.getLocal().getWorldLocation().equals(llIIIllIlII) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIII[0]];
                    stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[119]];
                    NPCs.getNearest((String[])stringArray).interact(lIIIlllIll[lIIlIIIIII[120]]);
                    Time.sleepTicks((int)lIIlIIIIII[0]);

                }
            }
            if (!r.llllIlIlIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[121]) || r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[122])) {
                llIIIllIlII = new WorldPoint(lIIlIIIIII[123], lIIlIIIIII[124], lIIlIIIIII[1]);
                if (r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIIIllIlII), lIIlIIIIII[9])) {
                    if (r.llllIlIIlIIl(Inventory.contains((int[])f.aO) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aO).interact(lIIIlllIll[lIIlIIIIII[90]]);
                    }
                    AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[125]];
                    Movement.walkTo((WorldPoint)llIIIllIlII);

                    Time.sleepTicks((int)lIIlIIIIII[0]);

                }
                if (r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIIIllIlII), lIIlIIIIII[9])) {
                    String[] stringArray = new String[lIIlIIIIII[0]];
                    stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[126]];
                    llIIIllIIll = NPCs.getNearest((String[])stringArray);
                    if (r.llllIlIIlllI(llIIIllIIll)) {
                        if (r.llllIlIIlIIl(Reachable.isInteractable((Locatable)llIIIllIIll) ? 1 : 0)) {
                            g.a(lIIIlllIll[lIIlIIIIII[95]], bR);
                        }
                        if (r.llllIlIIlIll(Reachable.isInteractable((Locatable)llIIIllIIll) ? 1 : 0)) {
                            Movement.walkTo((Locatable)llIIIllIIll);

                            Time.sleepTicks((int)lIIlIIIIII[0]);

                        }
                    }
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[127])) {
                String[] stringArray = new String[lIIlIIIIII[0]];
                stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[128]];
                if (r.llllIlIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    llIIIllIlII = new WorldPoint(lIIlIIIIII[117], lIIlIIIIII[118], lIIlIIIIII[1]);
                    if (r.llllIlIIlIll(Players.getLocal().getWorldLocation().equals(llIIIllIlII) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIllIlII);

                        Time.sleepTicks((int)lIIlIIIIII[0]);

                    }
                    if (r.llllIlIIlIIl(Players.getLocal().getWorldLocation().equals(llIIIllIlII) ? 1 : 0)) {
                        String[] stringArray17 = new String[lIIlIIIIII[0]];
                        stringArray17[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[129]];
                        NPCs.getNearest((String[])stringArray17).interact(lIIIlllIll[lIIlIIIIII[130]]);
                        Time.sleepTicks((int)lIIlIIIIII[0]);

                    }
                }
                String[] stringArray18 = new String[lIIlIIIIII[0]];
                stringArray18[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[97]];
                if (r.llllIlIIlIIl(Inventory.contains((String[])stringArray18) ? 1 : 0)) {
                    r.aF();
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[131])) {
                r.aF();
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[132])) {
                if (r.llllIlIIlIIl(Widgets.get((int)lIIlIIIIII[133]).isEmpty() ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIII[0]];
                    stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[134]];
                    Inventory.getFirst((String[])stringArray).interact(lIIIlllIll[lIIlIIIIII[135]]);
                    Time.sleepTicks((int)lIIlIIIIII[13]);

                }
                if (r.llllIlIIlIll(Widgets.get((int)lIIlIIIIII[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click((int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[55]).getClickPoint().getX(), (int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[55]).getClickPoint().getY(), (boolean)lIIlIIIIII[0]);
                    Time.sleepTicks((int)lIIlIIIIII[9]);

                    Mouse.click((int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[65]).getClickPoint().getX(), (int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[65]).getClickPoint().getY(), (boolean)lIIlIIIIII[0]);
                    Time.sleepTicks((int)lIIlIIIIII[9]);

                    Mouse.click((int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[67]).getClickPoint().getX(), (int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[67]).getClickPoint().getY(), (boolean)lIIlIIIIII[0]);
                    Time.sleepTicks((int)lIIlIIIIII[9]);

                    Mouse.click((int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[22]).getClickPoint().getX(), (int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[22]).getClickPoint().getY(), (boolean)lIIlIIIIII[0]);
                    Time.sleepTicks((int)lIIlIIIIII[9]);

                    Mouse.click((int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[76]).getClickPoint().getX(), (int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[76]).getClickPoint().getY(), (boolean)lIIlIIIIII[0]);
                    Time.sleepTicks((int)lIIlIIIIII[9]);

                    Mouse.click((int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[79]).getClickPoint().getX(), (int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[79]).getClickPoint().getY(), (boolean)lIIlIIIIII[0]);
                    Time.sleepTicks((int)lIIlIIIIII[8]);

                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[136])) {
                r.aF();
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[137])) {
                String[] stringArray = new String[lIIlIIIIII[0]];
                stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[138]];
                if (r.llllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray19 = new String[lIIlIIIIII[0]];
                    stringArray19[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[139]];
                    String[] stringArray20 = new String[lIIlIIIIII[0]];
                    stringArray20[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[140]];
                    Inventory.getFirst((String[])stringArray19).useOn(Inventory.getFirst((String[])stringArray20));
                    Time.sleepTicks((int)lIIlIIIIII[9]);

                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[141])) {
                if (r.llllIlIIlIlI(ck, lIIlIIIIII[0])) {
                    U.lP += lIIlIIIIII[0];
                    U.o(AccBuilderRogues.m);
                    ck += lIIlIIIIII[0];
                    U.lP = lIIlIIIIII[1];
                    cl = lIIlIIIIII[1];
                }
                r.aF();
            }
            g.a(bR);
        }
    }

    private static boolean llllIlIIllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIlIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIlIIllll(int n2) {
        return n2 > 0;
    }

    @Override
    public int T() {
        try {
            r.aE();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIlIIIIII[100];
    }

    static {
        r.llllIlIIIlll();
        r.llllIIllIlII();
        bv = new ArrayList<d>();
        cn = new WorldArea(lIIlIIIIII[163], lIIlIIIIII[56], lIIlIIIIII[16], lIIlIIIIII[4], lIIlIIIIII[1]);
        co = new WorldArea(lIIlIIIIII[164], lIIlIIIIII[165], lIIlIIIIII[166], lIIlIIIIII[142], lIIlIIIIII[1]);
        cp = new WorldArea(lIIlIIIIII[164], lIIlIIIIII[165], lIIlIIIIII[166], lIIlIIIIII[142], lIIlIIIIII[0]);
        cg = new WorldPoint(lIIlIIIIII[167], lIIlIIIIII[168], lIIlIIIIII[1]);
        cq = new WorldPoint(lIIlIIIIII[169], lIIlIIIIII[170], lIIlIIIIII[1]);
        cr = new WorldPoint(lIIlIIIIII[171], lIIlIIIIII[172], lIIlIIIIII[1]);
        String[] stringArray = new String[lIIlIIIIII[21]];
        stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[173]];
        stringArray[r.lIIlIIIIII[0]] = lIIIlllIll[lIIlIIIIII[174]];
        stringArray[r.lIIlIIIIII[9]] = lIIIlllIll[lIIlIIIIII[175]];
        stringArray[r.lIIlIIIIII[11]] = lIIIlllIll[lIIlIIIIII[176]];
        stringArray[r.lIIlIIIIII[13]] = lIIIlllIll[lIIlIIIIII[100]];
        stringArray[r.lIIlIIIIII[8]] = lIIIlllIll[lIIlIIIIII[177]];
        stringArray[r.lIIlIIIIII[16]] = lIIIlllIll[lIIlIIIIII[178]];
        stringArray[r.lIIlIIIIII[20]] = lIIIlllIll[lIIlIIIIII[179]];
        bR = stringArray;
        cs = lIIlIIIIII[1];
        ct = lIIIlllIll[lIIlIIIIII[180]];
    }

    private static int llllIlIIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean V() {
        boolean bl;
        if (r.llllIlIIllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[2])) {
            bl = lIIlIIIIII[0];

            if (((0x57 ^ 0x65 ^ (0x63 ^ 0x5D)) & (0x19 ^ 0x2A ^ (0x70 ^ 0x4F) ^ -1)) != 0) {
                return (2 & (2 ^ -1)) != 0;
            }
        } else {
            bl = lIIlIIIIII[1];
        }
        return bl;
    }

    private static boolean llllIlIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean S() {
        return lIIlIIIIII[1];
    }

    private static boolean llllIlIIlIll(int n2) {
        return n2 == 0;
    }

        return String.valueOf(llIIIIIIIII);
    }
}

