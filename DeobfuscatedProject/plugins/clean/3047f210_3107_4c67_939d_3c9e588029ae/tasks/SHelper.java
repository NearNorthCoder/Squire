/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.KHelper;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.ACHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.BHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.GHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.IHelper;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class SHelper
implements S {
    public static  boolean dq;
    public static final  WorldPoint dj;
    public static final  WorldPoint dk;
    public static final  WorldPoint dm;
    static  ArrayList<Integer> dr;
    public static  List<d> bu;
    static  String[] bQ;
    public static final  WorldPoint di;
    public static final  WorldPoint dn;
    static  boolean cl;
    public static final  WorldPoint dp;
    static  int ck;
    public static  boolean bs;
    public static  int cY;
    public static final  WorldPoint do;
    
    public static  int cZ;
    
    public static final  WorldPoint dl;

    @Override
    public boolean V() {
        int n2;
        if (s.llIlllIllllII(e.j(cY), lIIIIIlIIll[72]) && s.llIlllIllllII(e.j(cZ), lIIIIIlIIll[3])) {
            n2 = lIIIIIlIIll[0];

            if (1 != 1) {
                return ((0x47 ^ 0x2D ^ (0xD5 ^ 0xB6)) & (0x91 ^ 0x9C ^ (0xAB ^ 0xAF) ^ -1)) != 0;
            }
        } else {
            n2 = lIIIIIlIIll[1];
        }
        return n2 != 0;
    }

    private static boolean llIlllIllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIllllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIlllIlIIIll() {
        lIIIIIlIIIl = new String[lIIIIIlIIll[185]];
        s.lIIIIIlIIIl[s.lIIIIIlIIll[1]] = "Finished buying items, switching back to quest";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[0]] = "Nav to bank";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[5]] = "Handling banking";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[10]] = "We are missing quest supplies, switching to BUYING";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[6]] = "Drink";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[3]] = "Eat";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[16]] = "Nav to start";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[17]] = "Starting quest";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[18]] = "King Roald";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[19]] = "Nav to temple door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[13]] = "Interesting door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[20]] = "Large door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[21]] = "Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[22]] = "Temple Guardian";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[23]] = "Nav to doggo";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[24]] = "Trapdoor";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[27]] = "Temple Guardian";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[28]] = "Trapdoor";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[29]] = "Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[30]] = "Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[31]] = "Climb-down";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[32]] = "Climb-down";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[33]] = "Temple Guardian";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[34]] = "Wield";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[35]] = "Temple Guardian";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[36]] = "Attack";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[37]] = "Monument";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[38]] = "Break";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[39]] = "Nav to temple door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[40]] = "Interacting door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[41]] = "Large door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[42]] = "Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[43]] = "tell the king";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[44]] = "Nav to king";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[45]] = "talk king";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[46]] = "King Roald";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[47]] = "Nav to jail";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[48]] = "Interesting door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[49]] = "Cell door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[50]] = "Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[51]] = "Golden key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[52]] = "Iron key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[53]] = "Nav to gold key tile";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[55]] = "Attack";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[56]] = "Golden key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[57]] = "Eat";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[58]] = "Take";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[59]] = "Golden key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[60]] = "Nav to statues";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[61]] = "Finding key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[15]] = "Iron key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[62]] = "Murky water";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[63]] = "Getting water";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[64]] = "Bucket";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[66]] = "Iron key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[67]] = "Murky water";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[68]] = "Nav to jail";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[69]] = "Interesting door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[70]] = "Iron key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[71]] = "Cell door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[72]] = "Drezel";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[73]] = "Blessed water";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[74]] = "Handling chat";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[75]] = "\tۨ&Z¼$";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[76]] = "Entering cell";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[77]] = "Cell door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[78]] = "Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[79]] = "Blessed water";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[80]] = "Coffin";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[81]] = "Using water on coffin";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[82]] = "Blessed water";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[83]] = "Exiting cell";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[84]] = "Cell door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[85]] = "Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[86]] = "Drezel";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[87]] = "Handling chat";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[88]] = "Drezel";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[89]] = "Entering cell";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[90]] = "Cell door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[91]] = "Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[92]] = "Nav to final tile";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[98]] = "Trapdoor";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[99]] = "Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[100]] = "Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[101]] = "Climb-down";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[102]] = "Climb-down";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[103]] = "Handling chat";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[104]] = "Drezel";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[105]] = "Pure essence";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[106]] = "Turning in ess";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[107]] = "Drezel";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[108]] = "Pure essence";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[109]] = "Grabbing more ess";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[110]] = "Pure essence";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[111]] = "Nav to final tile";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[112]] = "Trapdoor";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[113]] = "Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[114]] = "Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[115]] = "Climb-down";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[116]] = "Climb-down";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[117]] = "Finish & Unlock morty/start nature";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[119]] = "Drezel";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[127]] = "Iron key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[128]] = "Golden key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[129]] = "Golden key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[130]] = "Iron key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[131]] = "Nav to final tile";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[2]] = "Trapdoor";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[132]] = "Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[133]] = "Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[134]] = "Climb-down";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[135]] = "Climb-down";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[136]] = "Nav to bank";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[137]] = "Handling banking";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[138]] = "Nav to bank";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[139]] = "Handling banking";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[140]] = "Bucket";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[141]] = "Bucket";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[147]] = "Priest In Peril";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[148]] = "ring of wealth (";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[165]] = "I'm looking for a quest!";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[166]] = "Yes.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[167]] = "Ok, let me help then.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[168]] = "Yep, now tell me what the problem is.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[169]] = "Sure.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[170]] = "You're right, we don't.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[171]] = "Is there anything else interesting to do around here?";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[172]] = "Well, what is it, I may be able to help?";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[173]] = "Yes, I'll go and look for him.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[174]] = "Yes, I'm sure.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[175]] = "I'll get going.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[176]] = "Ok, thanks.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[177]] = "I think I've solved the puzzle!";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[178]] = "How can I help?";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[179]] = "Roald sent me to check on Drezel.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[180]] = "Why is the river such a good defence?";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[181]] = "You're right, we don't.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[182]] = "Yes, of course.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[183]] = "Do you know of anything I can do in Morytania?";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[184]] = "Well, what is it, I may be able to help?";
    }

    private static void ae() {
        d var1;
        Object var2;
        block10: {
            block9: {
                int[] nArray = new int[lIIIIIlIIll[0]];
                nArray[s.lIIIIIlIIll[1]] = lIIIIIlIIll[14];
                if (s.llIlllIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lIIIIIlIIll[14], lIIIIIlIIll[0], lIIIIIlIIll[142]);
                    bu.add(d2);

                }
                int[] nArray2 = new int[lIIIIIlIIll[0]];
                nArray2[s.lIIIIIlIIll[1]] = lIIIIIlIIll[8];
                if (s.llIlllIllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var2 = new DHelper(lIIIIIlIIll[8], lIIIIIlIIll[0], lIIIIIlIIll[142]);
                    bu.add((DHelper) ar2);

                }
                int[] nArray3 = new int[lIIIIIlIIll[0]];
                nArray3[s.lIIIIIlIIll[1]] = lIIIIIlIIll[11];
                if (s.llIlllIllIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    var2 = new DHelper(lIIIIIlIIll[11], lIIIIIlIIll[3], i.bp);
                    bu.add((DHelper) ar2);

                }
                int[] nArray4 = new int[lIIIIIlIIll[0]];
                nArray4[s.lIIIIIlIIll[1]] = lIIIIIlIIll[12];
                if (s.llIlllIllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    var2 = new DHelper(lIIIIIlIIll[12], lIIIIIlIIll[41], lIIIIIlIIll[143]);
                    bu.add((DHelper) ar2);

                }
                int[] nArray5 = new int[lIIIIIlIIll[0]];
                nArray5[s.lIIIIIlIIll[1]] = lIIIIIlIIll[9];
                if (!s.llIlllIllIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[lIIIIIlIIll[0]];
                nArray6[s.lIIIIIlIIll[1]] = lIIIIIlIIll[9];
                if (!s.llIlllIllIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[lIIIIIlIIll[0]];
                nArray7[s.lIIIIIlIIll[1]] = lIIIIIlIIll[9];
                if (!s.llIlllIllIIll(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIIlIIll[15])) break block10;
            }
            var2 = new DHelper(lIIIIIlIIll[9], lIIIIIlIIll[15], lIIIIIlIIll[107]);
            bu.add((DHelper) ar2);

        }
        if (s.llIlllIllIlII(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lIIIIIlIIIl[lIIIIIlIIll[148]]))) ? 1 : 0)) {
            var1 = new DHelper(lIIIIIlIIll[144], lIIIIIlIIll[3], lIIIIIlIIll[145]);
            bu.add(var1);

        }
        int[] nArray = new int[lIIIIIlIIll[0]];
        nArray[s.lIIIIIlIIll[1]] = lIIIIIlIIll[7];
        if (s.llIlllIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            var1 = new DHelper(lIIIIIlIIll[7], lIIIIIlIIll[51], lIIIIIlIIll[146]);
            bu.add(var1);

        }
    }

    private static boolean llIlllIllIlll(int n2) {
        return n2 > 0;
    }

    private static boolean llIlllIlllIII(int n2) {
        return n2 < 0;
    }

    private static boolean llIlllIllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlllIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void aM() {
        void var3;
        BankLocation bankLocation = BankLocation.getNearest();
        if (s.llIlllIllIllI(bankLocation) && s.llIlllIllIlII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[136]];
            a.a(bankLocation);
        }
        if (s.llIlllIllIllI(var3) && s.llIlllIllIIlI(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (s.llIlllIllIlII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIlIIll[4]);

            }
            if (s.llIlllIllIIlI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[137]];
                if (s.llIlllIllIlll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIIIIlIIll[6]);

                }
                a.a(lIIIIIlIIll[7], lIIIIIlIIll[13]);
                a.a(lIIIIIlIIll[11], lIIIIIlIIll[0]);
                a.a(lIIIIIlIIll[9], lIIIIIlIIll[41]);
            }
        }
    }

    private static void bd() {
        dr.add(lIIIIIlIIll[120]);

        dr.add(lIIIIIlIIll[121]);

        dr.add(lIIIIIlIIll[122]);

        dr.add(lIIIIIlIIll[123]);

        dr.add(lIIIIIlIIll[124]);

        dr.add(lIIIIIlIIll[125]);

        dr.add(lIIIIIlIIll[126]);

        while (s.llIlllIllIlII(dr.isEmpty() ? 1 : 0) && s.llIlllIllIlII(dr.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[lIIIIIlIIll[0]];
            stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[127]];
            if (s.llIlllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {

                if (null == null) break;
                return;
            }
            int[] nArray = new int[lIIIIIlIIll[0]];
            nArray[s.lIIIIIlIIll[1]] = dr.get(lIIIIIlIIll[1]);
            TileObject var4 = TileObjects.getNearest((int[])nArray);
            if (s.llIlllIllIllI(var4)) {
                String[] stringArray2 = new String[lIIIIIlIIll[0]];
                stringArray2[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[128]];
                if (s.llIlllIllIIlI(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIIIIlIIll[0]];
                    stringArray3[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[129]];
                    Inventory.getFirst((String[])stringArray3).useOn(var4);
                    Time.sleepTicks((int)lIIIIIlIIll[3]);

                }
            }
            String[] stringArray4 = new String[lIIIIIlIIll[0]];
            stringArray4[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[130]];
            if (s.llIlllIllIlII(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                dr.remove(lIIIIIlIIll[1]);

                Time.sleepTicks((int)lIIIIIlIIll[5]);

            }

            if (-(0x5F ^ 0x7E ^ (0x79 ^ 0x5D)) < 0) continue;
            return;
        }
    }

    private static boolean llIlllIlllIIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void aN() {
        void var5;
        BankLocation bankLocation = BankLocation.getNearest();
        if (s.llIlllIllIllI(bankLocation) && s.llIlllIllIlII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[138]];
            a.a(bankLocation);
        }
        if (s.llIlllIllIllI(var5) && s.llIlllIllIIlI(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (s.llIlllIllIlII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIlIIll[4]);

            }
            if (s.llIlllIllIIlI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[139]];
                if (s.llIlllIllIlll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIIIIlIIll[6]);

                }
                a.a(lIIIIIlIIll[7], lIIIIIlIIll[13]);
                a.a(lIIIIIlIIll[8], lIIIIIlIIll[0]);
                a.a(lIIIIIlIIll[11], lIIIIIlIIll[0]);
                a.a(lIIIIIlIIll[12], lIIIIIlIIll[3]);
                a.a(lIIIIIlIIll[9], lIIIIIlIIll[41]);
            }
        }
    }

    private static boolean llIlllIlllIll(Object object) {
        return object == null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bf() {
        int n2;
        String[] stringArray = new String[lIIIIIlIIll[0]];
        stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[140]];
        if (s.llIlllIllIlll(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIIIIIlIIll[0]];
            nArray[s.lIIIIIlIIll[1]] = lIIIIIlIIll[12];
            if (s.llIlllIllIlll(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIIIIIlIIll[0]];
                nArray2[s.lIIIIIlIIll[1]] = lIIIIIlIIll[11];
                if (s.llIlllIllIlll(Inventory.getCount((int[])nArray2))) {
                    int[] nArray3 = new int[lIIIIIlIIll[0]];
                    nArray3[s.lIIIIIlIIll[1]] = lIIIIIlIIll[7];
                    if (s.llIlllIllIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = lIIIIIlIIll[0];

                        if (null == null) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = lIIIIIlIIll[1];
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIIIIIlIIIl[lIIIIIlIIll[147]];
    }

        return String.valueOf(var6);
    }

    @Override
    public int T() {
        try {
            s.bc();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 != -1) {
            return (4 ^ 0x54 ^ (0x19 ^ 0x1E)) & (169 + 30 - 118 + 145 ^ 4 + 1 - -71 + 105 ^ -1);
        }
        return lIIIIIlIIll[117];
    }

    public static void bc() {
        if (s.llIlllIllIIlI(bs ? 1 : 0)) {
            b.a(bu);
            if (s.llIlllIllIIll(bu.size(), lIIIIIlIIll[0])) {
                System.out.println(lIIIIIlIIIl[lIIIIIlIIll[1]]);
                bs = lIIIIIlIIll[1];
            }
        }
        if (s.llIlllIllIlII(bs ? 1 : 0)) {
            TileObject var7;
            TileObject var8;
            BankLocation var9;
            if (s.llIlllIllIIll(e.j(lIIIIIlIIll[2]), lIIIIIlIIll[3])) {
                K.cY();
            }
            if (s.llIlllIllIlII(s.bf() ? 1 : 0) && s.llIlllIllIIll(e.j(cY), lIIIIIlIIll[0]) && s.llIlllIllIlIl(e.j(lIIIIIlIIll[2]), lIIIIIlIIll[3])) {
                var9 = BankLocation.getNearest();
                if (s.llIlllIllIllI(var9) && s.llIlllIllIlII(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[0]];
                    a.a(var9);
                }
                if (s.llIlllIllIllI(var9) && s.llIlllIllIIlI(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (s.llIlllIllIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIlIIll[4]);

                    }
                    if (s.llIlllIllIIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[5]];
                        if (s.llIlllIllIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIIlIIll[6]);

                        }
                        if (s.llIlllIllIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIIIlIIll[5]);

                        }
                        int[] nArray = new int[lIIIIIlIIll[3]];
                        nArray[s.lIIIIIlIIll[1]] = lIIIIIlIIll[7];
                        nArray[s.lIIIIIlIIll[0]] = lIIIIIlIIll[8];
                        nArray[s.lIIIIIlIIll[5]] = lIIIIIlIIll[9];
                        nArray[s.lIIIIIlIIll[10]] = lIIIIIlIIll[11];
                        nArray[s.lIIIIIlIIll[6]] = lIIIIIlIIll[12];
                        if (s.llIlllIllIlII(e.b(nArray) ? 1 : 0)) {
                            s.ae();
                            System.out.println(lIIIIIlIIIl[lIIIIIlIIll[10]]);
                            bs = lIIIIIlIIll[0];
                            return;
                        }
                        int[] nArray2 = new int[lIIIIIlIIll[3]];
                        nArray2[s.lIIIIIlIIll[1]] = lIIIIIlIIll[7];
                        nArray2[s.lIIIIIlIIll[0]] = lIIIIIlIIll[8];
                        nArray2[s.lIIIIIlIIll[5]] = lIIIIIlIIll[9];
                        nArray2[s.lIIIIIlIIll[10]] = lIIIIIlIIll[11];
                        nArray2[s.lIIIIIlIIll[6]] = lIIIIIlIIll[12];
                        if (s.llIlllIllIIlI(e.b(nArray2) ? 1 : 0)) {
                            a.a(lIIIIIlIIll[7], lIIIIIlIIll[13]);
                            a.a(lIIIIIlIIll[14], lIIIIIlIIll[0]);
                            a.a(lIIIIIlIIll[8], lIIIIIlIIll[0]);
                            a.a(lIIIIIlIIll[11], lIIIIIlIIll[6]);
                            a.a(lIIIIIlIIll[12], lIIIIIlIIll[13]);
                        }
                    }
                }
            }
            if (s.llIlllIllIIlI(Inventory.contains((int[])f.aU) ? 1 : 0) && s.llIlllIllIIll(Movement.getRunEnergy(), lIIIIIlIIll[15])) {
                Inventory.getFirst((int[])f.aU).interact(lIIIIIlIIIl[lIIIIIlIIll[6]]);
                Time.sleepTicks((int)lIIIIIlIIll[0]);

            }
            int[] nArray = new int[lIIIIIlIIll[0]];
            nArray[s.lIIIIIlIIll[1]] = lIIIIIlIIll[12];
            if (s.llIlllIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0) && s.llIlllIlllIII(s.llIlllIllIIIl(e.u(), 60.0))) {
                int[] nArray3 = new int[lIIIIIlIIll[0]];
                nArray3[s.lIIIIIlIIll[1]] = lIIIIIlIIll[12];
                Inventory.getFirst((int[])nArray3).interact(lIIIIIlIIIl[lIIIIIlIIll[3]]);
                Time.sleepTicks((int)lIIIIIlIIll[0]);

            }
            if (s.llIlllIllIIll(e.j(cY), lIIIIIlIIll[0]) && s.llIlllIllIIlI(s.bf() ? 1 : 0)) {
                if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(di), lIIIIIlIIll[10])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[16]];
                    if (s.llIlllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)di);

                    Time.sleepTicks((int)lIIIIIlIIll[0]);

                }
                if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(di), lIIIIIlIIll[10])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[17]];
                    g.a(lIIIIIlIIIl[lIIIIIlIIll[18]], bQ);
                }
            }
            if (s.llIlllIllIlIl(e.j(cY), lIIIIIlIIll[0])) {
                if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dj), lIIIIIlIIll[5])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[19]];
                    Movement.walkTo((WorldPoint)dj);

                    Time.sleepTicks((int)lIIIIIlIIll[0]);

                }
                if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dj), lIIIIIlIIll[5])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[13]];
                    if (s.llIlllIllIlII(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[lIIIIIlIIll[0]];
                        stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[20]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIIIlIIIl[lIIIIIlIIll[21]]);
                    }
                    g.a(bQ);
                }
            }
            if (s.llIlllIllIlIl(e.j(cY), lIIIIIlIIll[5])) {
                String[] stringArray = new String[lIIIIIlIIll[0]];
                stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[22]];
                if (s.llIlllIlllIll(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[23]];
                    String[] stringArray2 = new String[lIIIIIlIIll[0]];
                    stringArray2[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[24]];
                    var9 = TileObjects.getNearest((String[])stringArray2);
                    if (s.llIlllIllIllI(var9) && s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo((Locatable)var9), lIIIIIlIIll[6]) && s.llIlllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bQ);
                    }
                    if (!s.llIlllIllIIlI(Dialog.isOpen() ? 1 : 0) || s.llIlllIlllIIl(Players.getLocal().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[26], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[26], lIIIIIlIIll[1]));

                        Time.sleepTicks((int)lIIIIIlIIll[10]);

                    }
                }
                if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[26], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                    String[] stringArray3 = new String[lIIIIIlIIll[0]];
                    stringArray3[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[27]];
                    if (s.llIlllIlllIll(NPCs.getNearest((String[])stringArray3))) {
                        String[] stringArray4 = new String[lIIIIIlIIll[0]];
                        stringArray4[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[28]];
                        var9 = TileObjects.getNearest((String[])stringArray4);
                        if (s.llIlllIllIllI(var9) && s.llIlllIllIlII(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray5 = new String[lIIIIIlIIll[0]];
                            stringArray5[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[29]];
                            if (s.llIlllIllIIlI(var9.hasAction(stringArray5) ? 1 : 0)) {
                                var9.interact(lIIIIIlIIIl[lIIIIIlIIll[30]]);
                                Time.sleepTicks((int)lIIIIIlIIll[5]);

                            }
                            String[] stringArray6 = new String[lIIIIIlIIll[0]];
                            stringArray6[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[31]];
                            if (s.llIlllIllIIlI(var9.hasAction(stringArray6) ? 1 : 0)) {
                                var9.interact(lIIIIIlIIIl[lIIIIIlIIll[32]]);
                                Time.sleepTicks((int)lIIIIIlIIll[5]);

                            }
                        }
                        g.a(bQ);
                    }
                }
                String[] stringArray7 = new String[lIIIIIlIIll[0]];
                stringArray7[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[33]];
                if (s.llIlllIllIllI(NPCs.getNearest((String[])stringArray7))) {
                    int[] nArray4 = new int[lIIIIIlIIll[0]];
                    nArray4[s.lIIIIIlIIll[1]] = lIIIIIlIIll[14];
                    if (s.llIlllIllIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIIIIIlIIll[0]];
                        nArray5[s.lIIIIIlIIll[1]] = lIIIIIlIIll[14];
                        if (s.llIlllIllIlII(Equipment.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lIIIIIlIIll[0]];
                            nArray6[s.lIIIIIlIIll[1]] = lIIIIIlIIll[14];
                            Inventory.getFirst((int[])nArray6).interact(lIIIIIlIIIl[lIIIIIlIIll[34]]);
                        }
                    }
                    if (s.llIlllIlllIll(Players.getLocal().getInteracting())) {
                        String[] stringArray8 = new String[lIIIIIlIIll[0]];
                        stringArray8[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[35]];
                        NPCs.getNearest((String[])stringArray8).interact(lIIIIIlIIIl[lIIIIIlIIll[36]]);
                        Time.sleepTicks((int)lIIIIIlIIll[5]);

                    }
                }
            }
            if (s.llIlllIllIlIl(e.j(cY), lIIIIIlIIll[10])) {
                if (s.llIlllIllIlII(dq ? 1 : 0)) {
                    if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dj), lIIIIIlIIll[5])) {
                        String[] stringArray = new String[lIIIIIlIIll[0]];
                        stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[37]];
                        if (s.llIlllIllIllI(TileObjects.getNearest((String[])stringArray))) {
                            int[] nArray7 = new int[lIIIIIlIIll[0]];
                            nArray7[s.lIIIIIlIIll[1]] = lIIIIIlIIll[7];
                            if (s.llIlllIllIIlI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIIIlIIll[0]];
                                nArray8[s.lIIIIIlIIll[1]] = lIIIIIlIIll[7];
                                Inventory.getFirst((int[])nArray8).interact(lIIIIIlIIIl[lIIIIIlIIll[38]]);
                                Time.sleepTicks((int)lIIIIIlIIll[3]);

                            }
                        }
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[39]];
                        Movement.walkTo((WorldPoint)dj);

                        Time.sleepTicks((int)lIIIIIlIIll[0]);

                    }
                    if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dj), lIIIIIlIIll[5])) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[40]];
                        if (s.llIlllIllIlII(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lIIIIIlIIll[0]];
                            stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[41]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIIIIlIIIl[lIIIIIlIIll[42]]);
                        }
                        g.a(bQ);
                        if (s.llIlllIllIIlI(Dialog.isOpen() ? 1 : 0) && s.llIlllIllIIlI(Dialog.getText().contains(lIIIIIlIIIl[lIIIIIlIIll[43]]) ? 1 : 0)) {
                            dq = lIIIIIlIIll[0];
                        }
                    }
                }
                if (s.llIlllIllIIlI(dq ? 1 : 0)) {
                    if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(di), lIIIIIlIIll[10])) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[44]];
                        Movement.walkTo((WorldPoint)di);

                        Time.sleepTicks((int)lIIIIIlIIll[0]);

                    }
                    if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(di), lIIIIIlIIll[10])) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[45]];
                        g.a(lIIIIIlIIIl[lIIIIIlIIll[46]], bQ);
                    }
                }
            }
            if (s.llIlllIllIlIl(e.j(cY), lIIIIIlIIll[6])) {
                ck = lIIIIIlIIll[1];
                if (s.llIlllIllIlII(s.aa() ? 1 : 0)) {
                    s.aN();
                }
                if (s.llIlllIllIIlI(s.aa() ? 1 : 0)) {
                    if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dm), lIIIIIlIIll[10])) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[47]];
                        if (s.llIlllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)dm);

                        Time.sleepTicks((int)lIIIIIlIIll[0]);

                    }
                    if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dm), lIIIIIlIIll[10])) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[48]];
                        if (s.llIlllIllIlII(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lIIIIIlIIll[0]];
                            stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[49]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIIIIlIIIl[lIIIIIlIIll[50]]);
                        }
                        g.a(bQ);
                    }
                }
            }
            if (s.llIlllIllIlIl(e.j(cY), lIIIIIlIIll[3])) {
                String[] stringArray = new String[lIIIIIlIIll[0]];
                stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[51]];
                if (s.llIlllIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray9 = new String[lIIIIIlIIll[0]];
                    stringArray9[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[52]];
                    if (s.llIlllIllIlII(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                        if (!s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dn), lIIIIIlIIll[17]) || s.llIlllIllIIlI(Players.getLocal().getWorldLocation().getPlane())) {
                            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[53]];
                            Movement.walkTo((WorldPoint)dn);

                            Time.sleepTicks((int)lIIIIIlIIll[0]);

                        }
                        if (!s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dn), lIIIIIlIIll[17]) || s.llIlllIllIlII(Players.getLocal().getWorldLocation().getPlane())) {
                            if (s.llIlllIlllIll(Players.getLocal().getInteracting())) {
                                int[] nArray9 = new int[lIIIIIlIIll[0]];
                                nArray9[s.lIIIIIlIIll[1]] = lIIIIIlIIll[54];
                                NPCs.getNearest((int[])nArray9).interact(lIIIIIlIIIl[lIIIIIlIIll[55]]);
                                Time.sleepTicks((int)lIIIIIlIIll[5]);

                            }
                            String[] stringArray10 = new String[lIIIIIlIIll[0]];
                            stringArray10[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[56]];
                            var9 = TileItems.getNearest((String[])stringArray10);
                            if (s.llIlllIllIIlI(Inventory.isFull() ? 1 : 0)) {
                                int[] nArray10 = new int[lIIIIIlIIll[0]];
                                nArray10[s.lIIIIIlIIll[1]] = lIIIIIlIIll[12];
                                Inventory.getFirst((int[])nArray10).interact(lIIIIIlIIIl[lIIIIIlIIll[57]]);
                                Time.sleepTicks((int)lIIIIIlIIll[0]);

                            }
                            if (s.llIlllIllIllI(var9)) {
                                var9.interact(lIIIIIlIIIl[lIIIIIlIIll[58]]);
                                Time.sleepTicks((int)lIIIIIlIIll[5]);

                            }
                        }
                    }
                }
                String[] stringArray11 = new String[lIIIIIlIIll[0]];
                stringArray11[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[59]];
                if (s.llIlllIllIIlI(Inventory.contains((String[])stringArray11) ? 1 : 0)) {
                    if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(do), lIIIIIlIIll[13])) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[60]];
                        Movement.walkTo((WorldPoint)do);

                        Time.sleepTicks((int)lIIIIIlIIll[0]);

                    }
                    if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(do), lIIIIIlIIll[13])) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[61]];
                        s.bd();
                    }
                }
                String[] stringArray12 = new String[lIIIIIlIIll[0]];
                stringArray12[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[15]];
                if (s.llIlllIllIIlI(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lIIIIIlIIll[0]];
                    stringArray13[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[62]];
                    if (s.llIlllIllIlII(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[63]];
                        String[] stringArray14 = new String[lIIIIIlIIll[0]];
                        stringArray14[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[64]];
                        int[] nArray11 = new int[lIIIIIlIIll[0]];
                        nArray11[s.lIIIIIlIIll[1]] = lIIIIIlIIll[65];
                        Inventory.getFirst((String[])stringArray14).useOn(TileObjects.getNearest((int[])nArray11));
                        Time.sleepTicks((int)lIIIIIlIIll[6]);

                    }
                }
                String[] stringArray15 = new String[lIIIIIlIIll[0]];
                stringArray15[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[66]];
                if (s.llIlllIllIIlI(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                    String[] stringArray16 = new String[lIIIIIlIIll[0]];
                    stringArray16[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[67]];
                    if (s.llIlllIllIIlI(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                        if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dm), lIIIIIlIIll[10])) {
                            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[68]];
                            if (s.llIlllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)dm);

                            Time.sleepTicks((int)lIIIIIlIIll[0]);

                        }
                        if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dm), lIIIIIlIIll[10])) {
                            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[69]];
                            String[] stringArray17 = new String[lIIIIIlIIll[0]];
                            stringArray17[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[70]];
                            String[] stringArray18 = new String[lIIIIIlIIll[0]];
                            stringArray18[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[71]];
                            Inventory.getFirst((String[])stringArray17).useOn(TileObjects.getNearest((String[])stringArray18));
                            Time.sleepTicks((int)lIIIIIlIIll[10]);

                        }
                    }
                }
            }
            if (s.llIlllIllIlIl(e.j(cY), lIIIIIlIIll[16])) {
                String[] stringArray = new String[lIIIIIlIIll[0]];
                stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[72]];
                var9 = NPCs.getNearest((String[])stringArray);
                String[] stringArray19 = new String[lIIIIIlIIll[0]];
                stringArray19[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[73]];
                if (s.llIlllIllIlII(Inventory.contains((String[])stringArray19) ? 1 : 0) && s.llIlllIllIllI(var9)) {
                    if (s.llIlllIllIIlI(Reachable.isInteractable((Locatable)var9) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[74]];
                        g.a(lIIIIIlIIIl[lIIIIIlIIll[75]], bQ);
                    }
                    if (s.llIlllIllIlII(Reachable.isInteractable((Locatable)var9) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[76]];
                        String[] stringArray20 = new String[lIIIIIlIIll[0]];
                        stringArray20[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[77]];
                        TileObjects.getNearest((String[])stringArray20).interact(lIIIIIlIIIl[lIIIIIlIIll[78]]);
                        Time.sleepTicks((int)lIIIIIlIIll[5]);

                    }
                }
                String[] stringArray21 = new String[lIIIIIlIIll[0]];
                stringArray21[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[79]];
                if (s.llIlllIllIIlI(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                    String[] stringArray22 = new String[lIIIIIlIIll[0]];
                    stringArray22[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[80]];
                    var8 = TileObjects.getNearest((String[])stringArray22);
                    if (s.llIlllIllIllI(var8)) {
                        if (s.llIlllIllIIlI(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[81]];
                            String[] stringArray23 = new String[lIIIIIlIIll[0]];
                            stringArray23[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[82]];
                            Inventory.getFirst((String[])stringArray23).useOn(var8);
                            Time.sleepTicks((int)lIIIIIlIIll[5]);

                        }
                        if (s.llIlllIllIlII(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[83]];
                            String[] stringArray24 = new String[lIIIIIlIIll[0]];
                            stringArray24[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[84]];
                            TileObjects.getNearest((String[])stringArray24).interact(lIIIIIlIIIl[lIIIIIlIIll[85]]);
                            Time.sleepTicks((int)lIIIIIlIIll[5]);

                        }
                    }
                }
            }
            if (s.llIlllIllIlIl(e.j(cY), lIIIIIlIIll[17])) {
                String[] stringArray = new String[lIIIIIlIIll[0]];
                stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[86]];
                var9 = NPCs.getNearest((String[])stringArray);
                if (s.llIlllIllIllI(var9)) {
                    if (s.llIlllIllIIlI(Reachable.isInteractable((Locatable)var9) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[87]];
                        g.a(lIIIIIlIIIl[lIIIIIlIIll[88]], bQ);
                    }
                    if (s.llIlllIllIlII(Reachable.isInteractable((Locatable)var9) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[89]];
                        String[] stringArray25 = new String[lIIIIIlIIll[0]];
                        stringArray25[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[90]];
                        TileObjects.getNearest((String[])stringArray25).interact(lIIIIIlIIIl[lIIIIIlIIll[91]]);
                        Time.sleepTicks((int)lIIIIIlIIll[5]);

                    }
                }
            }
            if (s.llIlllIllIlIl(e.j(cY), lIIIIIlIIll[18])) {
                if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[92]];
                    var9 = new WorldArea(lIIIIIlIIll[93], lIIIIIlIIll[94], lIIIIIlIIll[60], lIIIIIlIIll[43], lIIIIIlIIll[1]);
                    if (s.llIlllIllIlII(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        var8 = new WorldArea(lIIIIIlIIll[95], lIIIIIlIIll[96], lIIIIIlIIll[48], lIIIIIlIIll[63], lIIIIIlIIll[1]);
                        if (s.llIlllIllIlII(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));

                            Time.sleepTicks((int)lIIIIIlIIll[0]);

                        }
                        if (s.llIlllIllIIlI(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));

                                Time.sleepTicks((int)lIIIIIlIIll[0]);

                            }
                            if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                                String[] stringArray = new String[lIIIIIlIIll[0]];
                                stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[98]];
                                var7 = TileObjects.getNearest((String[])stringArray);
                                if (s.llIlllIllIllI(var7)) {
                                    String[] stringArray26 = new String[lIIIIIlIIll[0]];
                                    stringArray26[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[99]];
                                    if (s.llIlllIllIIlI(var7.hasAction(stringArray26) ? 1 : 0)) {
                                        var7.interact(lIIIIIlIIIl[lIIIIIlIIll[100]]);
                                        Time.sleepTicks((int)lIIIIIlIIll[10]);

                                    }
                                    String[] stringArray27 = new String[lIIIIIlIIll[0]];
                                    stringArray27[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[101]];
                                    if (s.llIlllIllIIlI(var7.hasAction(stringArray27) ? 1 : 0)) {
                                        var7.interact(lIIIIIlIIIl[lIIIIIlIIll[102]]);
                                        Time.sleepTicks((int)lIIIIIlIIll[10]);

                                    }
                                }
                            }
                        }
                    }
                    if (s.llIlllIllIIlI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)dp);

                        Time.sleepTicks((int)lIIIIIlIIll[0]);

                    }
                }
                if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[103]];
                    g.a(lIIIIIlIIIl[lIIIIIlIIll[104]], bQ);
                }
            }
            if (s.llIlllIllllII(e.j(cY), lIIIIIlIIll[13]) && s.llIlllIllIIll(e.j(cY), lIIIIIlIIll[72])) {
                if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3])) {
                    String[] stringArray = new String[lIIIIIlIIll[0]];
                    stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[105]];
                    if (s.llIlllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[106]];
                        if (s.llIlllIllIIll(ck, lIIIIIlIIll[0])) {
                            ac.kB += lIIIIIlIIll[0];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lIIIIIlIIll[0];
                            ac.kB = lIIIIIlIIll[1];
                            cl = lIIIIIlIIll[1];
                        }
                        g.a(lIIIIIlIIIl[lIIIIIlIIll[107]], bQ);
                    }
                }
                String[] stringArray = new String[lIIIIIlIIll[0]];
                stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[108]];
                if (s.llIlllIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0) && s.llIlllIllIIll(e.j(cY), lIIIIIlIIll[72])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[109]];
                    s.aM();
                }
                String[] stringArray28 = new String[lIIIIIlIIll[0]];
                stringArray28[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[110]];
                if (s.llIlllIllIIlI(Inventory.contains((String[])stringArray28) ? 1 : 0) && s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3]) && s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[111]];
                    var9 = new WorldArea(lIIIIIlIIll[93], lIIIIIlIIll[94], lIIIIIlIIll[60], lIIIIIlIIll[43], lIIIIIlIIll[1]);
                    if (s.llIlllIllIlII(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        var8 = new WorldArea(lIIIIIlIIll[95], lIIIIIlIIll[96], lIIIIIlIIll[48], lIIIIIlIIll[63], lIIIIIlIIll[1]);
                        if (s.llIlllIllIlII(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));

                            Time.sleepTicks((int)lIIIIIlIIll[0]);

                        }
                        if (s.llIlllIllIIlI(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));

                                Time.sleepTicks((int)lIIIIIlIIll[0]);

                            }
                            if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                                String[] stringArray29 = new String[lIIIIIlIIll[0]];
                                stringArray29[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[112]];
                                var7 = TileObjects.getNearest((String[])stringArray29);
                                if (s.llIlllIllIllI(var7)) {
                                    String[] stringArray30 = new String[lIIIIIlIIll[0]];
                                    stringArray30[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[113]];
                                    if (s.llIlllIllIIlI(var7.hasAction(stringArray30) ? 1 : 0)) {
                                        var7.interact(lIIIIIlIIIl[lIIIIIlIIll[114]]);
                                        Time.sleepTicks((int)lIIIIIlIIll[10]);

                                    }
                                    String[] stringArray31 = new String[lIIIIIlIIll[0]];
                                    stringArray31[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[115]];
                                    if (s.llIlllIllIIlI(var7.hasAction(stringArray31) ? 1 : 0)) {
                                        var7.interact(lIIIIIlIIIl[lIIIIIlIIll[116]]);
                                        Time.sleepTicks((int)lIIIIIlIIll[10]);

                                    }
                                }
                            }
                        }
                    }
                    if (s.llIlllIllIIlI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)dp);

                        Time.sleepTicks((int)lIIIIIlIIll[0]);

                    }
                }
            }
            if (s.llIlllIllllII(e.j(cY), lIIIIIlIIll[72]) && s.llIlllIllIIll(e.j(cZ), lIIIIIlIIll[3])) {
                AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[117]];
                if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3])) {
                    s.be();
                }
                if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3])) {
                    if (s.llIlllIllIllI(Widgets.get((int)lIIIIIlIIll[118], (int)lIIIIIlIIll[27]))) {
                        Mouse.click((int)Widgets.get((int)lIIIIIlIIll[118], (int)lIIIIIlIIll[27]).getClickPoint().getX(), (int)Widgets.get((int)lIIIIIlIIll[118], (int)lIIIIIlIIll[27]).getClickPoint().getY(), (boolean)lIIIIIlIIll[0]);
                        Time.sleepTicks((int)lIIIIIlIIll[10]);

                    }
                    g.a(lIIIIIlIIIl[lIIIIIlIIll[119]], bQ);
                    g.a(bQ);
                }
            }
            g.a(bQ);
        }
    }

    static {
        s.llIlllIllIIII();
        s.llIlllIlIIIll();
        di = new WorldPoint(lIIIIIlIIll[149], lIIIIIlIIll[150], lIIIIIlIIll[1]);
        dj = new WorldPoint(lIIIIIlIIll[151], lIIIIIlIIll[152], lIIIIIlIIll[1]);
        dk = new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[153], lIIIIIlIIll[1]);
        dl = new WorldPoint(lIIIIIlIIll[154], lIIIIIlIIll[155], lIIIIIlIIll[1]);
        dm = new WorldPoint(lIIIIIlIIll[156], lIIIIIlIIll[152], lIIIIIlIIll[5]);
        dn = new WorldPoint(lIIIIIlIIll[157], lIIIIIlIIll[158], lIIIIIlIIll[1]);
        do = new WorldPoint(lIIIIIlIIll[159], lIIIIIlIIll[160], lIIIIIlIIll[1]);
        dp = new WorldPoint(lIIIIIlIIll[161], lIIIIIlIIll[162], lIIIIIlIIll[1]);
        bu = new ArrayList<d>();
        cY = lIIIIIlIIll[163];
        cZ = lIIIIIlIIll[164];
        String[] stringArray = new String[lIIIIIlIIll[31]];
        stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[165]];
        stringArray[s.lIIIIIlIIll[0]] = lIIIIIlIIIl[lIIIIIlIIll[166]];
        stringArray[s.lIIIIIlIIll[5]] = lIIIIIlIIIl[lIIIIIlIIll[167]];
        stringArray[s.lIIIIIlIIll[10]] = lIIIIIlIIIl[lIIIIIlIIll[168]];
        stringArray[s.lIIIIIlIIll[6]] = lIIIIIlIIIl[lIIIIIlIIll[169]];
        stringArray[s.lIIIIIlIIll[3]] = lIIIIIlIIIl[lIIIIIlIIll[170]];
        stringArray[s.lIIIIIlIIll[16]] = lIIIIIlIIIl[lIIIIIlIIll[171]];
        stringArray[s.lIIIIIlIIll[17]] = lIIIIIlIIIl[lIIIIIlIIll[172]];
        stringArray[s.lIIIIIlIIll[18]] = lIIIIIlIIIl[lIIIIIlIIll[173]];
        stringArray[s.lIIIIIlIIll[19]] = lIIIIIlIIIl[lIIIIIlIIll[174]];
        stringArray[s.lIIIIIlIIll[13]] = lIIIIIlIIIl[lIIIIIlIIll[175]];
        stringArray[s.lIIIIIlIIll[20]] = lIIIIIlIIIl[lIIIIIlIIll[176]];
        stringArray[s.lIIIIIlIIll[21]] = lIIIIIlIIIl[lIIIIIlIIll[177]];
        stringArray[s.lIIIIIlIIll[22]] = lIIIIIlIIIl[lIIIIIlIIll[178]];
        stringArray[s.lIIIIIlIIll[23]] = lIIIIIlIIIl[lIIIIIlIIll[179]];
        stringArray[s.lIIIIIlIIll[24]] = lIIIIIlIIIl[lIIIIIlIIll[180]];
        stringArray[s.lIIIIIlIIll[27]] = lIIIIIlIIIl[lIIIIIlIIll[181]];
        stringArray[s.lIIIIIlIIll[28]] = lIIIIIlIIIl[lIIIIIlIIll[182]];
        stringArray[s.lIIIIIlIIll[29]] = lIIIIIlIIIl[lIIIIIlIIll[183]];
        stringArray[s.lIIIIIlIIll[30]] = lIIIIIlIIIl[lIIIIIlIIll[184]];
        bQ = stringArray;
        dr = new ArrayList();
    }

    @Override
    public boolean S() {
        return lIIIIIlIIll[1];
    }

    private static boolean llIlllIllIlII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void be() {
        if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3])) {
            void var10;
            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[131]];
            WorldArea worldArea = new WorldArea(lIIIIIlIIll[93], lIIIIIlIIll[94], lIIIIIlIIll[60], lIIIIIlIIll[43], lIIIIIlIIll[1]);
            if (s.llIlllIllIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void var11;
                WorldArea worldArea2 = new WorldArea(lIIIIIlIIll[95], lIIIIIlIIll[96], lIIIIIlIIll[48], lIIIIIlIIll[63], lIIIIIlIIll[1]);
                if (s.llIlllIllIlII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));

                    Time.sleepTicks((int)lIIIIIlIIll[0]);

                }
                if (s.llIlllIllIIlI(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));

                        Time.sleepTicks((int)lIIIIIlIIll[0]);

                    }
                    if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                        String[] stringArray = new String[lIIIIIlIIll[0]];
                        stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[2]];
                        TileObject var12 = TileObjects.getNearest((String[])stringArray);
                        if (s.llIlllIllIllI(var12)) {
                            String[] stringArray2 = new String[lIIIIIlIIll[0]];
                            stringArray2[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[132]];
                            if (s.llIlllIllIIlI(var12.hasAction(stringArray2) ? 1 : 0)) {
                                var12.interact(lIIIIIlIIIl[lIIIIIlIIll[133]]);
                                Time.sleepTicks((int)lIIIIIlIIll[10]);

                            }
                            String[] stringArray3 = new String[lIIIIIlIIll[0]];
                            stringArray3[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[134]];
                            if (s.llIlllIllIIlI(var12.hasAction(stringArray3) ? 1 : 0)) {
                                var12.interact(lIIIIIlIIIl[lIIIIIlIIll[135]]);
                                Time.sleepTicks((int)lIIIIIlIIll[10]);

                            }
                        }
                    }
                }
            }
            if (s.llIlllIllIIlI(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)dp);

                Time.sleepTicks((int)lIIIIIlIIll[0]);

            }
        }
    }

    private static boolean llIlllIlllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static int llIlllIllIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        String[] stringArray = new String[lIIIIIlIIll[0]];
        stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[141]];
        if (s.llIlllIllIlll(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIIIIIlIIll[0]];
            nArray[s.lIIIIIlIIll[1]] = lIIIIIlIIll[12];
            if (s.llIlllIllIlll(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIIIIIlIIll[0]];
                nArray2[s.lIIIIIlIIll[1]] = lIIIIIlIIll[7];
                if (s.llIlllIllIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIIIIIlIIll[0]];
                    nArray3[s.lIIIIIlIIll[1]] = lIIIIIlIIll[9];
                    if (s.llIlllIllIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = lIIIIIlIIll[0];

                        if (1 > -1) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = lIIIIIlIIll[1];
        return n2 != 0;
    }

    private static boolean llIlllIllIllI(Object object) {
        return object != null;
    }
}

