/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.PHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.AHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.BHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.DHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.EHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.FHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.GHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.HHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.VHelper;
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
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

public class QHelper
implements M {
     WorldArea fl;
    public static  WorldPoint fi;
    static  int co;
    
    public static  WorldPoint ff;
    public static  WorldPoint fj;
    public static  boolean by;
    
    public static  List<d> bA;
    public static  WorldPoint fg;
    static  String[] bW;
    public static  WorldPoint fh;
    public static  WorldArea fc;
    public static  WorldPoint fe;
     WorldArea fm;
    static  boolean cp;
     WorldArea fk;
    public static  WorldPoint fd;

    private static boolean lIlIIlIIIIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIlIIIlIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIIIIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIIIIlllII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean S() {
        void var1;
        int[] nArray = new int[lIIIlllIlIIII[13]];
        nArray[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
        nArray[q.lIIIlllIlIIII[5]] = lIIIlllIlIIII[15];
        nArray[q.lIIIlllIlIIII[6]] = lIIIlllIlIIII[16];
        nArray[q.lIIIlllIlIIII[11]] = lIIIlllIlIIII[17];
        nArray[q.lIIIlllIlIIII[12]] = lIIIlllIlIIII[18];
        nArray[q.lIIIlllIlIIII[19]] = lIIIlllIlIIII[20];
        nArray[q.lIIIlllIlIIII[21]] = lIIIlllIlIIII[22];
        nArray[q.lIIIlllIlIIII[23]] = lIIIlllIlIIII[24];
        int[] nArray2 = nArray;
        int var2 = lIIIlllIlIIII[4];
        while (q.lIlIIlIIIIllIll(var2, ((void)var1).length)) {
            int[] nArray3 = new int[lIIIlllIlIIII[5]];
            nArray3[q.lIIIlllIlIIII[4]] = var1[var2];
            if (q.lIlIIlIIIIlllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIlllIlIIII[4];
            }
            ++var2;

            if (((0xF7 ^ 0xC5) & ~(0x45 ^ 0x77)) == 0) continue;
            return false;
        }
        return lIIIlllIlIIII[5];
    }

        return String.valueOf(var3);
    }

    static {
        q.lIlIIlIIIIllIII();
        q.lIlIIlIIIIlIlll();
        fc = new WorldArea(lIIIlllIlIIII[98], lIIIlllIlIIII[99], lIIIlllIlIIII[100], lIIIlllIlIIII[101], lIIIlllIlIIII[4]);
        bA = new ArrayList<d>();
        fd = new WorldPoint(lIIIlllIlIIII[102], lIIIlllIlIIII[56], lIIIlllIlIIII[4]);
        fe = new WorldPoint(lIIIlllIlIIII[103], lIIIlllIlIIII[104], lIIIlllIlIIII[4]);
        ff = new WorldPoint(lIIIlllIlIIII[105], lIIIlllIlIIII[106], lIIIlllIlIIII[4]);
        fg = new WorldPoint(lIIIlllIlIIII[107], lIIIlllIlIIII[108], lIIIlllIlIIII[4]);
        fh = new WorldPoint(lIIIlllIlIIII[109], lIIIlllIlIIII[110], lIIIlllIlIIII[4]);
        fi = new WorldPoint(lIIIlllIlIIII[111], lIIIlllIlIIII[112], lIIIlllIlIIII[4]);
        fj = new WorldPoint(lIIIlllIlIIII[113], lIIIlllIlIIII[114], lIIIlllIlIIII[4]);
        String[] stringArray = new String[lIIIlllIlIIII[11]];
        stringArray[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[115]];
        stringArray[q.lIIIlllIlIIII[5]] = lIIIlllIIllll[lIIIlllIlIIII[116]];
        stringArray[q.lIIIlllIlIIII[6]] = lIIIlllIIllll[lIIIlllIlIIII[117]];
        bW = stringArray;
    }

    private static boolean lIlIIlIIIlIIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIlIIlIIIIlIlll() {
        lIIIlllIIllll = new String[lIIIlllIlIIII[118]];
        q.lIIIlllIIllll[q.lIIIlllIlIIII[4]] = "Finished buying items, switching back to quest";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[5]] = "Need 16 QP";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[6]] = "Nav to bank";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[11]] = "Handling banking";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[12]] = "We are missing quest supplies, switching to BUYING";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[19]] = "Drink";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[21]] = "Drink";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[23]] = "Nav to start";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[13]] = "Starting quest";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[32]] = "Willow";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[25]] = "Longhall door";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[35]] = "Open";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[36]] = "Longhall door";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[37]] = "Open";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[38]] = "Longhall door";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[34]] = "Open";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[9]] = "Nav to checkal";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[51]] = "Perform";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[52]] = "talk";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[53]] = "Checkal";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[55]] = "Nav to atlas";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[57]] = "Longhall door";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[58]] = "Open";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[31]] = "Longhall door";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[59]] = "Open";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[60]] = "Longhall door";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[61]] = "Open";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[62]] = "Atlas";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[63]] = "talk";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[64]] = "Atlas";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[66]] = "Nav to marley";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[7]] = "Talk";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[67]] = "Marley";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[68]] = "Nav to cook";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[69]] = "talk";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[70]] = "Cook";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[71]] = "Steak sandwich";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[72]] = "Knife";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[73]] = "Bread";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[74]] = "Steak sandwich";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[50]] = "Nav to marley";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[75]] = "Talk";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[76]] = "Marley";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[77]] = "Nav to burntof";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[78]] = "Burntof";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[79]] = "Nav to dungeon";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[80]] = "Starting quest";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[81]] = "Willow";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[82]] = "Wield";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[83]] = "Mining pillars";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[30]] = "Mine";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[84]] = "Eat";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[86]] = "Tele to varrock";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[87]] = "Break";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[94]] = "Below Ice Mountain";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[95]] = "ring of wealth (";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[96]] = "pillar";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[97]] = "Mine";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[115]] = "Yes.";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[116]] = "I was wondering if you'd be able to make me a Steak sandwich?";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[117]] = "Rock.";
    }

    @Override
    public boolean aa() {
        int n2;
        if (!(!q.lIlIIlIIIIllllI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[85]) || q.lIlIIlIIIIlllII(fc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && q.lIlIIlIIIIlllII(this.fk.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && q.lIlIIlIIIIlllII(this.fl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !q.lIlIIlIIIIllIlI(this.fm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0))) {
            n2 = lIIIlllIlIIII[5];

            if ((0x5F ^ 0x5A) <= 0) {
                return false;
            }
        } else {
            n2 = lIIIlllIlIIII[4];
        }
        return n2 != 0;
    }

    private static void W() {
        block12: {
            d var4;
            block11: {
                Object var5;
                int[] nArray = new int[lIIIlllIlIIII[5]];
                nArray[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[18];
                if (q.lIlIIlIIIIlllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lIIIlllIlIIII[18], lIIIlllIlIIII[5], lIIIlllIlIIII[88]);
                    bA.add(d2);

                }
                int[] nArray2 = new int[lIIIlllIlIIII[5]];
                nArray2[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[24];
                if (q.lIlIIlIIIIlllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var5 = new DHelper(lIIIlllIlIIII[24], lIIIlllIlIIII[5], lIIIlllIlIIII[88]);
                    bA.add((DHelper) ar5);

                }
                int[] nArray3 = new int[lIIIlllIlIIII[5]];
                nArray3[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[16];
                if (q.lIlIIlIIIIlllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    var5 = new DHelper(lIIIlllIlIIII[16], lIIIlllIlIIII[5], lIIIlllIlIIII[88]);
                    bA.add((DHelper) ar5);

                }
                int[] nArray4 = new int[lIIIlllIlIIII[5]];
                nArray4[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[20];
                if (q.lIlIIlIIIIlllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    var5 = new DHelper(lIIIlllIlIIII[20], lIIIlllIlIIII[5], lIIIlllIlIIII[89]);
                    bA.add((DHelper) ar5);

                }
                int[] nArray5 = new int[lIIIlllIlIIII[5]];
                nArray5[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[17];
                if (q.lIlIIlIIIIlllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    var5 = new DHelper(lIIIlllIlIIII[17], lIIIlllIlIIII[5], lIIIlllIlIIII[89]);
                    bA.add((DHelper) ar5);

                }
                int[] nArray6 = new int[lIIIlllIlIIII[5]];
                nArray6[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[22];
                if (q.lIlIIlIIIIlllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    var5 = new DHelper(lIIIlllIlIIII[22], lIIIlllIlIIII[25], lIIIlllIlIIII[90]);
                    bA.add((DHelper) ar5);

                }
                if (q.lIlIIlIIIIlllII(Bank.contains((Predicate)(var5 = item -> item.getName().toLowerCase().contains(lIIIlllIIllll[lIIIlllIlIIII[95]]))) ? 1 : 0)) {
                    var4 = new DHelper(lIIIlllIlIIII[91], lIIIlllIlIIII[19], lIIIlllIlIIII[92]);
                    bA.add(var4);

                }
                int[] nArray7 = new int[lIIIlllIlIIII[5]];
                nArray7[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[15];
                if (q.lIlIIlIIIIlllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    var4 = new DHelper(lIIIlllIlIIII[15], lIIIlllIlIIII[12], h.bv);
                    bA.add(var4);

                }
                int[] nArray8 = new int[lIIIlllIlIIII[5]];
                nArray8[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                if (!q.lIlIIlIIIIllIlI(Bank.contains((int[])nArray8) ? 1 : 0)) break block11;
                int[] nArray9 = new int[lIIIlllIlIIII[5]];
                nArray9[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                if (!q.lIlIIlIIIIllIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block12;
                int[] nArray10 = new int[lIIIlllIlIIII[5]];
                nArray10[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                if (!q.lIlIIlIIIIllIll(Bank.getFirst((int[])nArray10).getQuantity(), lIIIlllIlIIII[34])) break block12;
            }
            var4 = new DHelper(lIIIlllIlIIII[14], lIIIlllIlIIII[50], lIIIlllIlIIII[93]);
            bA.add(var4);

        }
    }

    public static void ba() {
        if (q.lIlIIlIIIIllIlI(by ? 1 : 0)) {
            b.a(bA);
            if (q.lIlIIlIIIIllIll(bA.size(), lIIIlllIlIIII[5])) {
                System.out.println(lIIIlllIIllll[lIIIlllIlIIII[4]]);
                by = lIIIlllIlIIII[4];
            }
        }
        if (q.lIlIIlIIIIlllII(by ? 1 : 0)) {
            WorldArea var6;
            if (q.lIlIIlIIIIllIll(e.j(lIIIlllIlIIII[7]), lIIIlllIlIIII[8])) {
                v.bl();
            }
            if (q.lIlIIlIIIIlllIl(e.j(lIIIlllIlIIII[7]), lIIIlllIlIIII[8]) && q.lIlIIlIIIIllIll(e.I(), lIIIlllIlIIII[9])) {
                System.out.println(lIIIlllIIllll[lIIIlllIlIIII[5]]);
                AccBuilderRat.d = lIIIlllIlIIII[5];
                return;
            }
            if (q.lIlIIlIIIIlllII(q.S() ? 1 : 0) && q.lIlIIlIIIIlllII(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId())) && q.lIlIIlIIIIlllIl(e.j(lIIIlllIlIIII[7]), lIIIlllIlIIII[8]) && q.lIlIIlIIIIllllI(e.I(), lIIIlllIlIIII[9])) {
                var6 = BankLocation.getNearest();
                if (q.lIlIIlIIIIlllll(var6) && q.lIlIIlIIIIlllII(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[6]];
                    a.a((BankLocation)var6);
                }
                if (q.lIlIIlIIIIlllll(var6) && q.lIlIIlIIIIllIlI(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (q.lIlIIlIIIIlllII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIlIIII[10]);

                    }
                    if (q.lIlIIlIIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[11]];
                        if (q.lIlIIlIIIlIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIlllIlIIII[12]);

                        }
                        if (q.lIlIIlIIIlIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIlllIlIIII[6]);

                        }
                        int[] nArray = new int[lIIIlllIlIIII[13]];
                        nArray[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                        nArray[q.lIIIlllIlIIII[5]] = lIIIlllIlIIII[15];
                        nArray[q.lIIIlllIlIIII[6]] = lIIIlllIlIIII[16];
                        nArray[q.lIIIlllIlIIII[11]] = lIIIlllIlIIII[17];
                        nArray[q.lIIIlllIlIIII[12]] = lIIIlllIlIIII[18];
                        nArray[q.lIIIlllIlIIII[19]] = lIIIlllIlIIII[20];
                        nArray[q.lIIIlllIlIIII[21]] = lIIIlllIlIIII[22];
                        nArray[q.lIIIlllIlIIII[23]] = lIIIlllIlIIII[24];
                        if (q.lIlIIlIIIIlllII(e.b(nArray) ? 1 : 0)) {
                            q.W();
                            System.out.println(lIIIlllIIllll[lIIIlllIlIIII[12]]);
                            by = lIIIlllIlIIII[5];
                            return;
                        }
                        int[] nArray2 = new int[lIIIlllIlIIII[13]];
                        nArray2[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                        nArray2[q.lIIIlllIlIIII[5]] = lIIIlllIlIIII[15];
                        nArray2[q.lIIIlllIlIIII[6]] = lIIIlllIlIIII[16];
                        nArray2[q.lIIIlllIlIIII[11]] = lIIIlllIlIIII[17];
                        nArray2[q.lIIIlllIlIIII[12]] = lIIIlllIlIIII[18];
                        nArray2[q.lIIIlllIlIIII[19]] = lIIIlllIlIIII[20];
                        nArray2[q.lIIIlllIlIIII[21]] = lIIIlllIlIIII[22];
                        nArray2[q.lIIIlllIlIIII[23]] = lIIIlllIlIIII[24];
                        if (q.lIlIIlIIIIllIlI(e.b(nArray2) ? 1 : 0)) {
                            a.a(lIIIlllIlIIII[14], lIIIlllIlIIII[25]);
                            a.a(lIIIlllIlIIII[22], lIIIlllIlIIII[25]);
                            a.a(lIIIlllIlIIII[15], lIIIlllIlIIII[6]);
                            a.a(lIIIlllIlIIII[16], lIIIlllIlIIII[5]);
                            a.a(lIIIlllIlIIII[17], lIIIlllIlIIII[5]);
                            a.a(lIIIlllIlIIII[18], lIIIlllIlIIII[5]);
                            a.a(lIIIlllIlIIII[24], lIIIlllIlIIII[5]);
                            a.a(lIIIlllIlIIII[20], lIIIlllIlIIII[5]);
                            a.a(lIIIlllIlIIII[26], lIIIlllIlIIII[6]);
                            a.a(lIIIlllIlIIII[27], lIIIlllIlIIII[5]);
                            a.a(lIIIlllIlIIII[28], lIIIlllIlIIII[19]);
                            int[] nArray3 = new int[lIIIlllIlIIII[5]];
                            nArray3[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[15];
                            if (q.lIlIIlIIIIlllIl(Inventory.getAll((int[])nArray3).size(), lIIIlllIlIIII[5])) {
                                a.a(lIIIlllIlIIII[29], lIIIlllIlIIII[6]);
                            }
                        }
                    }
                }
            }
            if (q.lIlIIlIIIIllIlI(Inventory.contains((int[])f.ba) ? 1 : 0) && q.lIlIIlIIIIllIll(Movement.getRunEnergy(), lIIIlllIlIIII[30])) {
                Inventory.getFirst((int[])f.ba).interact(lIIIlllIIllll[lIIIlllIlIIII[19]]);
                Time.sleepTicks((int)lIIIlllIlIIII[5]);

            }
            if (q.lIlIIlIIIIllIll(Prayers.getPoints(), lIIIlllIlIIII[31]) && q.lIlIIlIIIIllIlI(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                Inventory.getFirst((int[])f.aX).interact(lIIIlllIIllll[lIIIlllIlIIII[21]]);
                Time.sleepTicks((int)lIIIlllIlIIII[6]);

            }
            if (q.lIlIIlIIIIllIlI(q.S() ? 1 : 0) && q.lIlIIlIIIIlllII(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()))) {
                if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fd), lIIIlllIlIIII[19])) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[23]];
                    if (q.lIlIIlIIIIllIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)fd);

                    Time.sleepTicks((int)lIIIlllIlIIII[5]);

                }
                if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIIlllIlIIII[19])) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[13]];
                    g.a(lIIIlllIIllll[lIIIlllIlIIII[32]], bW);
                }
            }
            if (!q.lIlIIlIIIlIIIll(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[19]) || q.lIlIIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[23])) {
                g.a(bW);
            }
            if (q.lIlIIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[25])) {
                if (!q.lIlIIlIIIIllllI(Vars.getBit((int)lIIIlllIlIIII[33]), lIIIlllIlIIII[19]) || q.lIlIIlIIIIlllIl(Vars.getBit((int)lIIIlllIlIIII[33]), lIIIlllIlIIII[34])) {
                    if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fe), lIIIlllIlIIII[5])) {
                        if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(ff), lIIIlllIlIIII[21])) {
                            String[] stringArray = new String[lIIIlllIlIIII[5]];
                            stringArray[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[25]];
                            String[] stringArray2 = new String[lIIIlllIlIIII[5]];
                            stringArray2[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[35]];
                            if (q.lIlIIlIIIIllIlI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                                String[] stringArray3 = new String[lIIIlllIlIIII[5]];
                                stringArray3[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[36]];
                                TileObjects.getNearest((String[])stringArray3).interact(lIIIlllIIllll[lIIIlllIlIIII[37]]);
                                Time.sleepTicks((int)lIIIlllIlIIII[6]);

                            }
                            String[] stringArray4 = new String[lIIIlllIlIIII[5]];
                            stringArray4[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[38]];
                            String[] stringArray5 = new String[lIIIlllIlIIII[5]];
                            stringArray5[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[34]];
                            if (q.lIlIIlIIIIlllII(TileObjects.getNearest((String[])stringArray4).hasAction(stringArray5) ? 1 : 0)) {
                                WorldArea worldArea = new WorldPoint[lIIIlllIlIIII[19]];
                                worldArea[q.lIIIlllIlIIII[4]] = new WorldPoint(lIIIlllIlIIII[39], lIIIlllIlIIII[40], lIIIlllIlIIII[4]);
                                worldArea[q.lIIIlllIlIIII[5]] = new WorldPoint(lIIIlllIlIIII[41], lIIIlllIlIIII[42], lIIIlllIlIIII[4]);
                                worldArea[q.lIIIlllIlIIII[6]] = new WorldPoint(lIIIlllIlIIII[43], lIIIlllIlIIII[44], lIIIlllIlIIII[4]);
                                worldArea[q.lIIIlllIlIIII[11]] = new WorldPoint(lIIIlllIlIIII[45], lIIIlllIlIIII[46], lIIIlllIlIIII[4]);
                                worldArea[q.lIIIlllIlIIII[12]] = new WorldPoint(lIIIlllIlIIII[47], lIIIlllIlIIII[48], lIIIlllIlIIII[4]);
                                var6 = worldArea;
                                Walker.walkAlong(Arrays.asList(var6), new HashMap());

                                Time.sleepTicks((int)lIIIlllIlIIII[5]);

                            }
                        }
                        if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ff), lIIIlllIlIIII[21])) {
                            AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[9]];
                            Movement.walkTo((WorldPoint)fe);

                            Time.sleepTicks((int)lIIIlllIlIIII[5]);

                        }
                    }
                    if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fe), lIIIlllIlIIII[5])) {
                        if (q.lIlIIlIIIIlllIl(Vars.getBit((int)lIIIlllIlIIII[33]), lIIIlllIlIIII[34]) && q.lIlIIlIIIIlllll(Widgets.get((int)lIIIlllIlIIII[49], (int)lIIIlllIlIIII[6])) && q.lIlIIlIIIIlllII(Players.getLocal().isAnimating() ? 1 : 0)) {
                            Widgets.get((int)lIIIlllIlIIII[49], (int)lIIIlllIlIIII[6]).getChild(lIIIlllIlIIII[50]).interact(lIIIlllIIllll[lIIIlllIlIIII[51]]);
                            Time.sleepTicks((int)lIIIlllIlIIII[6]);

                        }
                        if (q.lIlIIlIIIIllIll(Vars.getBit((int)lIIIlllIlIIII[33]), lIIIlllIlIIII[19])) {
                            AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[52]];
                            g.a(lIIIlllIIllll[lIIIlllIlIIII[53]], bW);
                        }
                    }
                }
                if (q.lIlIIlIIIIlllIl(Vars.getBit((int)lIIIlllIlIIII[33]), lIIIlllIlIIII[19])) {
                    var6 = new WorldArea(lIIIlllIlIIII[54], lIIIlllIlIIII[40], lIIIlllIlIIII[32], lIIIlllIlIIII[25], lIIIlllIlIIII[4]);
                    if (q.lIlIIlIIIIlllII(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[55]];
                        if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ff), lIIIlllIlIIII[21])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIIlllIlIIII[41], lIIIlllIlIIII[56], lIIIlllIlIIII[4]));

                            Time.sleepTicks((int)lIIIlllIlIIII[5]);

                        }
                        if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(ff), lIIIlllIlIIII[21])) {
                            String[] stringArray = new String[lIIIlllIlIIII[5]];
                            stringArray[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[57]];
                            String[] stringArray6 = new String[lIIIlllIlIIII[5]];
                            stringArray6[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[58]];
                            if (q.lIlIIlIIIIllIlI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray6) ? 1 : 0)) {
                                String[] stringArray7 = new String[lIIIlllIlIIII[5]];
                                stringArray7[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[31]];
                                TileObjects.getNearest((String[])stringArray7).interact(lIIIlllIIllll[lIIIlllIlIIII[59]]);
                                Time.sleepTicks((int)lIIIlllIlIIII[6]);

                            }
                            String[] stringArray8 = new String[lIIIlllIlIIII[5]];
                            stringArray8[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[60]];
                            String[] stringArray9 = new String[lIIIlllIlIIII[5]];
                            stringArray9[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[61]];
                            if (q.lIlIIlIIIIlllII(TileObjects.getNearest((String[])stringArray8).hasAction(stringArray9) ? 1 : 0)) {
                                g.a(lIIIlllIIllll[lIIIlllIlIIII[62]], bW);
                            }
                        }
                    }
                    if (q.lIlIIlIIIIllIlI(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[63]];
                        g.a(lIIIlllIIllll[lIIIlllIlIIII[64]], bW);
                    }
                }
                if (q.lIlIIlIIIIlllIl(Vars.getBit((int)lIIIlllIlIIII[33]), lIIIlllIlIIII[25])) {
                    g.a(bW);
                }
            }
            if (q.lIlIIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[34])) {
                co = lIIIlllIlIIII[4];
                if (q.lIlIIlIIIIlllII(Vars.getBit((int)lIIIlllIlIIII[65]))) {
                    if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fg), lIIIlllIlIIII[19])) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[66]];
                        Movement.walkTo((WorldPoint)fg);

                        Time.sleepTicks((int)lIIIlllIlIIII[5]);

                    }
                    if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fg), lIIIlllIlIIII[19])) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[7]];
                        g.a(lIIIlllIIllll[lIIIlllIlIIII[67]], bW);
                    }
                }
                if (q.lIlIIlIIIIlllIl(Vars.getBit((int)lIIIlllIlIIII[65]), lIIIlllIlIIII[19])) {
                    if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fh), lIIIlllIlIIII[21])) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[68]];
                        Movement.walkTo((WorldPoint)fh);

                        Time.sleepTicks((int)lIIIlllIlIIII[5]);

                    }
                    if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fh), lIIIlllIlIIII[21])) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[69]];
                        g.a(lIIIlllIIllll[lIIIlllIlIIII[70]], bW);
                    }
                }
                if (q.lIlIIlIIIIlllIl(Vars.getBit((int)lIIIlllIlIIII[65]), lIIIlllIlIIII[25])) {
                    String[] stringArray = new String[lIIIlllIlIIII[5]];
                    stringArray[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[71]];
                    if (q.lIlIIlIIIIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray10 = new String[lIIIlllIlIIII[5]];
                        stringArray10[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[72]];
                        String[] stringArray11 = new String[lIIIlllIlIIII[5]];
                        stringArray11[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[73]];
                        Inventory.getFirst((String[])stringArray10).useOn(Inventory.getFirst((String[])stringArray11));
                        Time.sleepTicks((int)lIIIlllIlIIII[5]);

                    }
                    String[] stringArray12 = new String[lIIIlllIlIIII[5]];
                    stringArray12[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[74]];
                    if (q.lIlIIlIIIIllIlI(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fg), lIIIlllIlIIII[19])) {
                            AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[50]];
                            Movement.walkTo((WorldPoint)fg);

                            Time.sleepTicks((int)lIIIlllIlIIII[5]);

                        }
                        if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fg), lIIIlllIlIIII[19])) {
                            AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[75]];
                            g.a(lIIIlllIIllll[lIIIlllIlIIII[76]], bW);
                        }
                    }
                }
                if (q.lIlIIlIIIIlllIl(Vars.getBit((int)lIIIlllIlIIII[65]), lIIIlllIlIIII[70])) {
                    g.a(bW);
                }
                if (q.lIlIIlIIIIlllIl(Vars.getBit((int)lIIIlllIlIIII[65]), lIIIlllIlIIII[50])) {
                    if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fi), lIIIlllIlIIII[13])) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[77]];
                        Movement.walkTo((WorldPoint)fi);

                        Time.sleepTicks((int)lIIIlllIlIIII[5]);

                    }
                    if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fi), lIIIlllIlIIII[13])) {
                        g.a(lIIIlllIIllll[lIIIlllIlIIII[78]], bW);
                    }
                }
                g.a(bW);
            }
            if (q.lIlIIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[55])) {
                if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fj), lIIIlllIlIIII[19])) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[79]];
                    if (q.lIlIIlIIIIllIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)fj);

                    Time.sleepTicks((int)lIIIlllIlIIII[5]);

                }
                if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fj), lIIIlllIlIIII[19])) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[80]];
                    g.a(lIIIlllIIllll[lIIIlllIlIIII[81]], bW);
                }
            }
            if (!q.lIlIIlIIIlIIIll(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[60]) || !q.lIlIIlIIIlIIIll(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[66]) || q.lIlIIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[50])) {
                g.a(bW);
            }
            if (q.lIlIIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[70])) {
                g.a(bW);
                int[] nArray = new int[lIIIlllIlIIII[5]];
                nArray[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[27];
                if (q.lIlIIlIIIIlllII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIlllIlIIII[5]];
                    nArray4[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[27];
                    if (q.lIlIIlIIIIllIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIIIlllIlIIII[5]];
                        nArray5[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[27];
                        Inventory.getFirst((int[])nArray5).interact(lIIIlllIIllll[lIIIlllIlIIII[82]]);
                        Time.sleepTicks((int)lIIIlllIlIIII[5]);

                    }
                }
                if (q.lIlIIlIIIIlllII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && q.lIlIIlIIIIllllI(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIlIIII[77]) && q.lIlIIlIIIlIIIII(Prayers.getPoints())) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                if (q.lIlIIlIIIIlllll(var6 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (q.lIlIIlIIIIllIlI(tileObject.getName().contains(lIIIlllIIllll[lIIIlllIlIIII[96]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlllIlIIII[5]];
                        stringArray[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[97]];
                        if (q.lIlIIlIIIIllIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIIIlllIlIIII[5];

                            if (2 <= 2) return n2 != 0;
                            return ((175 + 77 - 61 + 40 ^ 33 + 21 - -83 + 45) & (3 ^ 0x59 ^ (0x5E ^ 0x55) ^ -1)) != 0;
                        }
                    }
                    n2 = lIIIlllIlIIII[4];
                    return n2 != 0;
                }))) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[83]];
                    var6.interact(lIIIlllIIllll[lIIIlllIlIIII[30]]);
                    Time.sleepTicks((int)lIIIlllIlIIII[12]);

                }
                if (q.lIlIIlIIIlIIlII(q.lIlIIlIIIIllIIl(e.v(), 50.0))) {
                    int[] nArray6 = new int[lIIIlllIlIIII[5]];
                    nArray6[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[28];
                    if (q.lIlIIlIIIIllIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                        int[] nArray7 = new int[lIIIlllIlIIII[5]];
                        nArray7[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[28];
                        Inventory.getFirst((int[])nArray7).interact(lIIIlllIIllll[lIIIlllIlIIII[84]]);
                        Time.sleepTicks((int)lIIIlllIlIIII[5]);

                    }
                }
            }
            if (q.lIlIIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[85]) && q.lIlIIlIIIIlllII(fc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[86]];
                if (q.lIlIIlIIIIllIll(co, lIIIlllIlIIII[5])) {
                    P.lF += lIIIlllIlIIII[5];
                    P.d(AccBuilderRat.m);
                    co += lIIIlllIlIIII[5];
                    P.lF = lIIIlllIlIIII[4];
                    cp = lIIIlllIlIIII[4];
                }
                int[] nArray = new int[lIIIlllIlIIII[5]];
                nArray[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                if (q.lIlIIlIIIIllIlI(Inventory.contains((int[])nArray) ? 1 : 0) && q.lIlIIlIIIIlllII(Players.getLocal().isAnimating() ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIlllIlIIII[5]];
                    nArray8[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                    Inventory.getFirst((int[])nArray8).interact(lIIIlllIIllll[lIIIlllIlIIII[87]]);
                    Time.sleepTicks((int)lIIIlllIlIIII[12]);

                }
            }
            g.a(new String[lIIIlllIlIIII[4]]);
        }
    }

    private static boolean lIlIIlIIIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIIIlIIIII(int n2) {
        return n2 > 0;
    }

    @Override
    public String Z() {
        return lIIIlllIIllll[lIIIlllIlIIII[94]];
    }

    private static boolean lIlIIlIIIlIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int Y() {
        try {
            q.ba();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIIlllIlIIII[8];
    }

    private static boolean lIlIIlIIIIlllll(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIIIIllIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean X() {
        return lIIIlllIlIIII[4];
    }

    public QHelper() {
        this.fk = new WorldArea(lIIIlllIlIIII[0], lIIIlllIlIIII[1], lIIIlllIlIIII[2], lIIIlllIlIIII[3], lIIIlllIlIIII[4]);
        this.fl = new WorldArea(lIIIlllIlIIII[0], lIIIlllIlIIII[1], lIIIlllIlIIII[2], lIIIlllIlIIII[3], lIIIlllIlIIII[5]);
        this.fm = new WorldArea(lIIIlllIlIIII[0], lIIIlllIlIIII[1], lIIIlllIlIIII[2], lIIIlllIlIIII[3], lIIIlllIlIIII[6]);
    }

    private static boolean lIlIIlIIIlIIlII(int n2) {
        return n2 < 0;
    }

    private static int lIlIIlIIIIllIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }
}

