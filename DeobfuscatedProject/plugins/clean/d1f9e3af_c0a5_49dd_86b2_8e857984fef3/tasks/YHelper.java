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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.RHelper;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ANHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
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
public class YHelper
implements W {
    static  boolean cm;
    static  int cl;
    public static final  WorldPoint do;
    public static final  WorldPoint dr;
    public static  boolean dt;
    
    public static  List<d> bv;
    public static final  WorldPoint dn;
    static  ArrayList<Integer> dw;
    public static final  WorldPoint dl;
    public static  int dv;
    public static  boolean bt;
    public static final  WorldPoint dp;
    public static  int du;
    
    public static final  WorldPoint dm;
    public static final  WorldPoint ds;
    public static final  WorldPoint dq;
    static  String[] bR;

    static {
        y.lIIIIlIIlllI();
        y.lIIIIlIIlIlI();
        dl = new WorldPoint(lIIlllllI[149], lIIlllllI[150], lIIlllllI[1]);
        dm = new WorldPoint(lIIlllllI[151], lIIlllllI[152], lIIlllllI[1]);
        dn = new WorldPoint(lIIlllllI[25], lIIlllllI[153], lIIlllllI[1]);
        do = new WorldPoint(lIIlllllI[154], lIIlllllI[155], lIIlllllI[1]);
        dp = new WorldPoint(lIIlllllI[156], lIIlllllI[152], lIIlllllI[5]);
        dq = new WorldPoint(lIIlllllI[157], lIIlllllI[158], lIIlllllI[1]);
        dr = new WorldPoint(lIIlllllI[159], lIIlllllI[160], lIIlllllI[1]);
        ds = new WorldPoint(lIIlllllI[161], lIIlllllI[162], lIIlllllI[1]);
        bv = new ArrayList<d>();
        du = lIIlllllI[163];
        dv = lIIlllllI[164];
        String[] stringArray = new String[lIIlllllI[31]];
        stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[165]];
        stringArray[y.lIIlllllI[0]] = lIIlllIll[lIIlllllI[166]];
        stringArray[y.lIIlllllI[5]] = lIIlllIll[lIIlllllI[167]];
        stringArray[y.lIIlllllI[10]] = lIIlllIll[lIIlllllI[168]];
        stringArray[y.lIIlllllI[6]] = lIIlllIll[lIIlllllI[169]];
        stringArray[y.lIIlllllI[3]] = lIIlllIll[lIIlllllI[170]];
        stringArray[y.lIIlllllI[16]] = lIIlllIll[lIIlllllI[171]];
        stringArray[y.lIIlllllI[17]] = lIIlllIll[lIIlllllI[172]];
        stringArray[y.lIIlllllI[18]] = lIIlllIll[lIIlllllI[173]];
        stringArray[y.lIIlllllI[19]] = lIIlllIll[lIIlllllI[174]];
        stringArray[y.lIIlllllI[13]] = lIIlllIll[lIIlllllI[175]];
        stringArray[y.lIIlllllI[20]] = lIIlllIll[lIIlllllI[176]];
        stringArray[y.lIIlllllI[21]] = lIIlllIll[lIIlllllI[177]];
        stringArray[y.lIIlllllI[22]] = lIIlllIll[lIIlllllI[178]];
        stringArray[y.lIIlllllI[23]] = lIIlllIll[lIIlllllI[179]];
        stringArray[y.lIIlllllI[24]] = lIIlllIll[lIIlllllI[180]];
        stringArray[y.lIIlllllI[27]] = lIIlllIll[lIIlllllI[181]];
        stringArray[y.lIIlllllI[28]] = lIIlllIll[lIIlllllI[182]];
        stringArray[y.lIIlllllI[29]] = lIIlllIll[lIIlllllI[183]];
        stringArray[y.lIIlllllI[30]] = lIIlllIll[lIIlllllI[184]];
        bR = stringArray;
        dw = new ArrayList();
    }

    @Override
    public String U() {
        return lIIlllIll[lIIlllllI[147]];
    }

    private static void lIIIIlIIlIlI() {
        lIIlllIll = new String[lIIlllllI[185]];
        y.lIIlllIll[y.lIIlllllI[1]] = "Finished buying items, switching back to quest";
        y.lIIlllIll[y.lIIlllllI[0]] = "Nav to bank";
        y.lIIlllIll[y.lIIlllllI[5]] = "Handling banking";
        y.lIIlllIll[y.lIIlllllI[10]] = "We are missing quest supplies, switching to BUYING";
        y.lIIlllIll[y.lIIlllllI[6]] = "Drink";
        y.lIIlllIll[y.lIIlllllI[3]] = "Eat";
        y.lIIlllIll[y.lIIlllllI[16]] = "Nav to start";
        y.lIIlllIll[y.lIIlllllI[17]] = "Starting quest";
        y.lIIlllIll[y.lIIlllllI[18]] = "King Roald";
        y.lIIlllIll[y.lIIlllllI[19]] = "Nav to temple door";
        y.lIIlllIll[y.lIIlllllI[13]] = "Interesting door";
        y.lIIlllIll[y.lIIlllllI[20]] = "Large door";
        y.lIIlllIll[y.lIIlllllI[21]] = "Open";
        y.lIIlllIll[y.lIIlllllI[22]] = "Temple Guardian";
        y.lIIlllIll[y.lIIlllllI[23]] = "Nav to doggo";
        y.lIIlllIll[y.lIIlllllI[24]] = "Trapdoor";
        y.lIIlllIll[y.lIIlllllI[27]] = "Temple Guardian";
        y.lIIlllIll[y.lIIlllllI[28]] = "Trapdoor";
        y.lIIlllIll[y.lIIlllllI[29]] = "Open";
        y.lIIlllIll[y.lIIlllllI[30]] = "Open";
        y.lIIlllIll[y.lIIlllllI[31]] = "Climb-down";
        y.lIIlllIll[y.lIIlllllI[32]] = "Climb-down";
        y.lIIlllIll[y.lIIlllllI[33]] = "Temple Guardian";
        y.lIIlllIll[y.lIIlllllI[34]] = "Wield";
        y.lIIlllIll[y.lIIlllllI[35]] = "Temple Guardian";
        y.lIIlllIll[y.lIIlllllI[36]] = "Attack";
        y.lIIlllIll[y.lIIlllllI[37]] = "Monument";
        y.lIIlllIll[y.lIIlllllI[38]] = "Break";
        y.lIIlllIll[y.lIIlllllI[39]] = "Nav to temple door";
        y.lIIlllIll[y.lIIlllllI[40]] = "Interacting door";
        y.lIIlllIll[y.lIIlllllI[41]] = "Large door";
        y.lIIlllIll[y.lIIlllllI[42]] = "Open";
        y.lIIlllIll[y.lIIlllllI[43]] = "tell the king";
        y.lIIlllIll[y.lIIlllllI[44]] = "Nav to king";
        y.lIIlllIll[y.lIIlllllI[45]] = "talk king";
        y.lIIlllIll[y.lIIlllllI[46]] = "King Roald";
        y.lIIlllIll[y.lIIlllllI[47]] = "Nav to jail";
        y.lIIlllIll[y.lIIlllllI[48]] = "Interesting door";
        y.lIIlllIll[y.lIIlllllI[49]] = "Cell door";
        y.lIIlllIll[y.lIIlllllI[50]] = "Open";
        y.lIIlllIll[y.lIIlllllI[51]] = "Golden key";
        y.lIIlllIll[y.lIIlllllI[52]] = "Iron key";
        y.lIIlllIll[y.lIIlllllI[53]] = "Nav to gold key tile";
        y.lIIlllIll[y.lIIlllllI[55]] = "Attack";
        y.lIIlllIll[y.lIIlllllI[56]] = "Golden key";
        y.lIIlllIll[y.lIIlllllI[57]] = "Eat";
        y.lIIlllIll[y.lIIlllllI[58]] = "Take";
        y.lIIlllIll[y.lIIlllllI[59]] = "Golden key";
        y.lIIlllIll[y.lIIlllllI[60]] = "Nav to statues";
        y.lIIlllIll[y.lIIlllllI[61]] = "Finding key";
        y.lIIlllIll[y.lIIlllllI[15]] = "Iron key";
        y.lIIlllIll[y.lIIlllllI[62]] = "Murky water";
        y.lIIlllIll[y.lIIlllllI[63]] = "Getting water";
        y.lIIlllIll[y.lIIlllllI[64]] = "Bucket";
        y.lIIlllIll[y.lIIlllllI[66]] = "Iron key";
        y.lIIlllIll[y.lIIlllllI[67]] = "Murky water";
        y.lIIlllIll[y.lIIlllllI[68]] = "Nav to jail";
        y.lIIlllIll[y.lIIlllllI[69]] = "Interesting door";
        y.lIIlllIll[y.lIIlllllI[70]] = "Iron key";
        y.lIIlllIll[y.lIIlllllI[71]] = "Cell door";
        y.lIIlllIll[y.lIIlllllI[72]] = "Drezel";
        y.lIIlllIll[y.lIIlllllI[73]] = "Blessed water";
        y.lIIlllIll[y.lIIlllllI[74]] = "Handling chat";
        y.lIIlllIll[y.lIIlllllI[75]] = "Drezel";
        y.lIIlllIll[y.lIIlllllI[76]] = "Entering cell";
        y.lIIlllIll[y.lIIlllllI[77]] = "Cell door";
        y.lIIlllIll[y.lIIlllllI[78]] = "Open";
        y.lIIlllIll[y.lIIlllllI[79]] = "Blessed water";
        y.lIIlllIll[y.lIIlllllI[80]] = "Coffin";
        y.lIIlllIll[y.lIIlllllI[81]] = "Using water on coffin";
        y.lIIlllIll[y.lIIlllllI[82]] = "Blessed water";
        y.lIIlllIll[y.lIIlllllI[83]] = "Exiting cell";
        y.lIIlllIll[y.lIIlllllI[84]] = "Cell door";
        y.lIIlllIll[y.lIIlllllI[85]] = "Open";
        y.lIIlllIll[y.lIIlllllI[86]] = "Drezel";
        y.lIIlllIll[y.lIIlllllI[87]] = "Handling chat";
        y.lIIlllIll[y.lIIlllllI[88]] = "Drezel";
        y.lIIlllIll[y.lIIlllllI[89]] = "Entering cell";
        y.lIIlllIll[y.lIIlllllI[90]] = "Cell door";
        y.lIIlllIll[y.lIIlllllI[91]] = "Open";
        y.lIIlllIll[y.lIIlllllI[92]] = "Nav to final tile";
        y.lIIlllIll[y.lIIlllllI[98]] = "Trapdoor";
        y.lIIlllIll[y.lIIlllllI[99]] = "Open";
        y.lIIlllIll[y.lIIlllllI[100]] = "Open";
        y.lIIlllIll[y.lIIlllllI[101]] = "Climb-down";
        y.lIIlllIll[y.lIIlllllI[102]] = "Climb-down";
        y.lIIlllIll[y.lIIlllllI[103]] = "Handling chat";
        y.lIIlllIll[y.lIIlllllI[104]] = "Drezel";
        y.lIIlllIll[y.lIIlllllI[105]] = "Pure essence";
        y.lIIlllIll[y.lIIlllllI[106]] = "Turning in ess";
        y.lIIlllIll[y.lIIlllllI[107]] = "Drezel";
        y.lIIlllIll[y.lIIlllllI[108]] = "Pure essence";
        y.lIIlllIll[y.lIIlllllI[109]] = "Grabbing more ess";
        y.lIIlllIll[y.lIIlllllI[110]] = "Pure essence";
        y.lIIlllIll[y.lIIlllllI[111]] = "Nav to final tile";
        y.lIIlllIll[y.lIIlllllI[112]] = "Trapdoor";
        y.lIIlllIll[y.lIIlllllI[113]] = "Open";
        y.lIIlllIll[y.lIIlllllI[114]] = "Open";
        y.lIIlllIll[y.lIIlllllI[115]] = "Climb-down";
        y.lIIlllIll[y.lIIlllllI[116]] = "Climb-down";
        y.lIIlllIll[y.lIIlllllI[117]] = "Finish & Unlock morty/start nature";
        y.lIIlllIll[y.lIIlllllI[119]] = "Drezel";
        y.lIIlllIll[y.lIIlllllI[127]] = "Iron key";
        y.lIIlllIll[y.lIIlllllI[128]] = "Golden key";
        y.lIIlllIll[y.lIIlllllI[129]] = "Golden key";
        y.lIIlllIll[y.lIIlllllI[130]] = "Iron key";
        y.lIIlllIll[y.lIIlllllI[131]] = "Nav to final tile";
        y.lIIlllIll[y.lIIlllllI[2]] = "Trapdoor";
        y.lIIlllIll[y.lIIlllllI[132]] = "Open";
        y.lIIlllIll[y.lIIlllllI[133]] = "Open";
        y.lIIlllIll[y.lIIlllllI[134]] = "Climb-down";
        y.lIIlllIll[y.lIIlllllI[135]] = "Climb-down";
        y.lIIlllIll[y.lIIlllllI[136]] = "Nav to bank";
        y.lIIlllIll[y.lIIlllllI[137]] = "Handling banking";
        y.lIIlllIll[y.lIIlllllI[138]] = "Nav to bank";
        y.lIIlllIll[y.lIIlllllI[139]] = "Handling banking";
        y.lIIlllIll[y.lIIlllllI[140]] = "Bucket";
        y.lIIlllIll[y.lIIlllllI[141]] = "Bucket";
        y.lIIlllIll[y.lIIlllllI[147]] = "Priest In Peril";
        y.lIIlllIll[y.lIIlllllI[148]] = "ring of wealth (";
        y.lIIlllIll[y.lIIlllllI[165]] = "I'm looking for a quest!";
        y.lIIlllIll[y.lIIlllllI[166]] = "Yes.";
        y.lIIlllIll[y.lIIlllllI[167]] = "Ok, let me help then.";
        y.lIIlllIll[y.lIIlllllI[168]] = "Yep, now tell me what the problem is.";
        y.lIIlllIll[y.lIIlllllI[169]] = "Sure.";
        y.lIIlllIll[y.lIIlllllI[170]] = "You're right, we don't.";
        y.lIIlllIll[y.lIIlllllI[171]] = "Is there anything else interesting to do around here?";
        y.lIIlllIll[y.lIIlllllI[172]] = "Well, what is it, I may be able to help?";
        y.lIIlllIll[y.lIIlllllI[173]] = "Yes, I'll go and look for him.";
        y.lIIlllIll[y.lIIlllllI[174]] = "Yes, I'm sure.";
        y.lIIlllIll[y.lIIlllllI[175]] = "I'll get going.";
        y.lIIlllIll[y.lIIlllllI[176]] = "Ok, thanks.";
        y.lIIlllIll[y.lIIlllllI[177]] = "I think I've solved the puzzle!";
        y.lIIlllIll[y.lIIlllllI[178]] = "How can I help?";
        y.lIIlllIll[y.lIIlllllI[179]] = "Roald sent me to check on Drezel.";
        y.lIIlllIll[y.lIIlllllI[180]] = "Why is the river such a good defence?";
        y.lIIlllIll[y.lIIlllllI[181]] = "You're right, we don't.";
        y.lIIlllIll[y.lIIlllllI[182]] = "Yes, of course.";
        y.lIIlllIll[y.lIIlllllI[183]] = "Do you know of anything I can do in Morytania?";
        y.lIIlllIll[y.lIIlllllI[184]] = "Well, what is it, I may be able to help?";
    }

    private static boolean lIIIIlIllIIl(Object object) {
        return object == null;
    }

    private static boolean lIIIIlIlIlll(int n2, int n3) {
        return n2 > n3;
    }

    public static void aX() {
        if (y.lIIIIlIlIIII(bt ? 1 : 0)) {
            b.a(bv);
            if (y.lIIIIlIlIIIl(bv.size(), lIIlllllI[0])) {
                System.out.println(lIIlllIll[lIIlllllI[1]]);
                bt = lIIlllllI[1];
            }
        }
        if (y.lIIIIlIlIIlI(bt ? 1 : 0)) {
            TileObject lllllIllIlIllI;
            TileObject lllllIllIlIlll;
            BankLocation lllllIllIllIII;
            if (y.lIIIIlIlIIIl(e.j(lIIlllllI[2]), lIIlllllI[3])) {
                R.cU();
            }
            if (y.lIIIIlIlIIlI(y.bc() ? 1 : 0) && y.lIIIIlIlIIIl(e.j(du), lIIlllllI[0]) && y.lIIIIlIlIIll(e.j(lIIlllllI[2]), lIIlllllI[3])) {
                lllllIllIllIII = BankLocation.getNearest();
                if (y.lIIIIlIlIlII(lllllIllIllIII) && y.lIIIIlIlIIlI(lllllIllIllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[0]];
                    a.a(lllllIllIllIII);
                }
                if (y.lIIIIlIlIlII(lllllIllIllIII) && y.lIIIIlIlIIII(lllllIllIllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (y.lIIIIlIlIIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlllllI[4]);

                    }
                    if (y.lIIIIlIlIIII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[5]];
                        if (y.lIIIIlIlIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlllllI[6]);

                        }
                        if (y.lIIIIlIlIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIlllllI[5]);

                        }
                        int[] nArray = new int[lIIlllllI[3]];
                        nArray[y.lIIlllllI[1]] = lIIlllllI[7];
                        nArray[y.lIIlllllI[0]] = lIIlllllI[8];
                        nArray[y.lIIlllllI[5]] = lIIlllllI[9];
                        nArray[y.lIIlllllI[10]] = lIIlllllI[11];
                        nArray[y.lIIlllllI[6]] = lIIlllllI[12];
                        if (y.lIIIIlIlIIlI(e.b(nArray) ? 1 : 0)) {
                            y.af();
                            System.out.println(lIIlllIll[lIIlllllI[10]]);
                            bt = lIIlllllI[0];
                            return;
                        }
                        int[] nArray2 = new int[lIIlllllI[3]];
                        nArray2[y.lIIlllllI[1]] = lIIlllllI[7];
                        nArray2[y.lIIlllllI[0]] = lIIlllllI[8];
                        nArray2[y.lIIlllllI[5]] = lIIlllllI[9];
                        nArray2[y.lIIlllllI[10]] = lIIlllllI[11];
                        nArray2[y.lIIlllllI[6]] = lIIlllllI[12];
                        if (y.lIIIIlIlIIII(e.b(nArray2) ? 1 : 0)) {
                            a.a(lIIlllllI[7], lIIlllllI[13]);
                            a.a(lIIlllllI[14], lIIlllllI[0]);
                            a.a(lIIlllllI[8], lIIlllllI[0]);
                            a.a(lIIlllllI[11], lIIlllllI[6]);
                            a.a(lIIlllllI[12], lIIlllllI[13]);
                        }
                    }
                }
            }
            if (y.lIIIIlIlIIII(Inventory.contains((int[])f.aV) ? 1 : 0) && y.lIIIIlIlIIIl(Movement.getRunEnergy(), lIIlllllI[15])) {
                Inventory.getFirst((int[])f.aV).interact(lIIlllIll[lIIlllllI[6]]);
                Time.sleepTicks((int)lIIlllllI[0]);

            }
            int[] nArray = new int[lIIlllllI[0]];
            nArray[y.lIIlllllI[1]] = lIIlllllI[12];
            if (y.lIIIIlIlIIII(Inventory.contains((int[])nArray) ? 1 : 0) && y.lIIIIlIlIllI(y.lIIIIlIIllll(e.u(), 60.0))) {
                int[] nArray3 = new int[lIIlllllI[0]];
                nArray3[y.lIIlllllI[1]] = lIIlllllI[12];
                Inventory.getFirst((int[])nArray3).interact(lIIlllIll[lIIlllllI[3]]);
                Time.sleepTicks((int)lIIlllllI[0]);

            }
            if (y.lIIIIlIlIIIl(e.j(du), lIIlllllI[0]) && y.lIIIIlIlIIII(y.bc() ? 1 : 0)) {
                if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dl), lIIlllllI[10])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[16]];
                    if (y.lIIIIlIlIIII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)dl);

                    Time.sleepTicks((int)lIIlllllI[0]);

                }
                if (y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dl), lIIlllllI[10])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[17]];
                    g.a(lIIlllIll[lIIlllllI[18]], bR);
                }
            }
            if (y.lIIIIlIlIIll(e.j(du), lIIlllllI[0])) {
                if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dm), lIIlllllI[5])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[19]];
                    Movement.walkTo((WorldPoint)dm);

                    Time.sleepTicks((int)lIIlllllI[0]);

                }
                if (y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dm), lIIlllllI[5])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[13]];
                    if (y.lIIIIlIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[lIIlllllI[0]];
                        stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[20]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIlllIll[lIIlllllI[21]]);
                    }
                    g.a(bR);
                }
            }
            if (y.lIIIIlIlIIll(e.j(du), lIIlllllI[5])) {
                String[] stringArray = new String[lIIlllllI[0]];
                stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[22]];
                if (y.lIIIIlIllIIl(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[23]];
                    String[] stringArray2 = new String[lIIlllllI[0]];
                    stringArray2[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[24]];
                    lllllIllIllIII = TileObjects.getNearest((String[])stringArray2);
                    if (y.lIIIIlIlIlII(lllllIllIllIII) && y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo((Locatable)lllllIllIllIII), lIIlllllI[6]) && y.lIIIIlIlIIII(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bR);
                    }
                    if (!y.lIIIIlIlIIII(Dialog.isOpen() ? 1 : 0) || y.lIIIIlIlIlll(Players.getLocal().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[26], lIIlllllI[1])), lIIlllllI[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIIlllllI[25], lIIlllllI[26], lIIlllllI[1]));

                        Time.sleepTicks((int)lIIlllllI[10]);

                    }
                }
                if (y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[26], lIIlllllI[1])), lIIlllllI[3])) {
                    String[] stringArray3 = new String[lIIlllllI[0]];
                    stringArray3[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[27]];
                    if (y.lIIIIlIllIIl(NPCs.getNearest((String[])stringArray3))) {
                        String[] stringArray4 = new String[lIIlllllI[0]];
                        stringArray4[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[28]];
                        lllllIllIllIII = TileObjects.getNearest((String[])stringArray4);
                        if (y.lIIIIlIlIlII(lllllIllIllIII) && y.lIIIIlIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray5 = new String[lIIlllllI[0]];
                            stringArray5[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[29]];
                            if (y.lIIIIlIlIIII(lllllIllIllIII.hasAction(stringArray5) ? 1 : 0)) {
                                lllllIllIllIII.interact(lIIlllIll[lIIlllllI[30]]);
                                Time.sleepTicks((int)lIIlllllI[5]);

                            }
                            String[] stringArray6 = new String[lIIlllllI[0]];
                            stringArray6[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[31]];
                            if (y.lIIIIlIlIIII(lllllIllIllIII.hasAction(stringArray6) ? 1 : 0)) {
                                lllllIllIllIII.interact(lIIlllIll[lIIlllllI[32]]);
                                Time.sleepTicks((int)lIIlllllI[5]);

                            }
                        }
                        g.a(bR);
                    }
                }
                String[] stringArray7 = new String[lIIlllllI[0]];
                stringArray7[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[33]];
                if (y.lIIIIlIlIlII(NPCs.getNearest((String[])stringArray7))) {
                    int[] nArray4 = new int[lIIlllllI[0]];
                    nArray4[y.lIIlllllI[1]] = lIIlllllI[14];
                    if (y.lIIIIlIlIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIIlllllI[0]];
                        nArray5[y.lIIlllllI[1]] = lIIlllllI[14];
                        if (y.lIIIIlIlIIlI(Equipment.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lIIlllllI[0]];
                            nArray6[y.lIIlllllI[1]] = lIIlllllI[14];
                            Inventory.getFirst((int[])nArray6).interact(lIIlllIll[lIIlllllI[34]]);
                        }
                    }
                    if (y.lIIIIlIllIIl(Players.getLocal().getInteracting())) {
                        String[] stringArray8 = new String[lIIlllllI[0]];
                        stringArray8[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[35]];
                        NPCs.getNearest((String[])stringArray8).interact(lIIlllIll[lIIlllllI[36]]);
                        Time.sleepTicks((int)lIIlllllI[5]);

                    }
                }
            }
            if (y.lIIIIlIlIIll(e.j(du), lIIlllllI[10])) {
                if (y.lIIIIlIlIIlI(dt ? 1 : 0)) {
                    if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dm), lIIlllllI[5])) {
                        String[] stringArray = new String[lIIlllllI[0]];
                        stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[37]];
                        if (y.lIIIIlIlIlII(TileObjects.getNearest((String[])stringArray))) {
                            int[] nArray7 = new int[lIIlllllI[0]];
                            nArray7[y.lIIlllllI[1]] = lIIlllllI[7];
                            if (y.lIIIIlIlIIII(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIlllllI[0]];
                                nArray8[y.lIIlllllI[1]] = lIIlllllI[7];
                                Inventory.getFirst((int[])nArray8).interact(lIIlllIll[lIIlllllI[38]]);
                                Time.sleepTicks((int)lIIlllllI[3]);

                            }
                        }
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[39]];
                        Movement.walkTo((WorldPoint)dm);

                        Time.sleepTicks((int)lIIlllllI[0]);

                    }
                    if (y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dm), lIIlllllI[5])) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[40]];
                        if (y.lIIIIlIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lIIlllllI[0]];
                            stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[41]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIlllIll[lIIlllllI[42]]);
                        }
                        g.a(bR);
                        if (y.lIIIIlIlIIII(Dialog.isOpen() ? 1 : 0) && y.lIIIIlIlIIII(Dialog.getText().contains(lIIlllIll[lIIlllllI[43]]) ? 1 : 0)) {
                            dt = lIIlllllI[0];
                        }
                    }
                }
                if (y.lIIIIlIlIIII(dt ? 1 : 0)) {
                    if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dl), lIIlllllI[10])) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[44]];
                        Movement.walkTo((WorldPoint)dl);

                        Time.sleepTicks((int)lIIlllllI[0]);

                    }
                    if (y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dl), lIIlllllI[10])) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[45]];
                        g.a(lIIlllIll[lIIlllllI[46]], bR);
                    }
                }
            }
            if (y.lIIIIlIlIIll(e.j(du), lIIlllllI[6])) {
                cl = lIIlllllI[1];
                if (y.lIIIIlIlIIlI(y.ab() ? 1 : 0)) {
                    y.bb();
                }
                if (y.lIIIIlIlIIII(y.ab() ? 1 : 0)) {
                    if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dp), lIIlllllI[10])) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[47]];
                        if (y.lIIIIlIlIIII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)dp);

                        Time.sleepTicks((int)lIIlllllI[0]);

                    }
                    if (y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dp), lIIlllllI[10])) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[48]];
                        if (y.lIIIIlIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lIIlllllI[0]];
                            stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[49]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIlllIll[lIIlllllI[50]]);
                        }
                        g.a(bR);
                    }
                }
            }
            if (y.lIIIIlIlIIll(e.j(du), lIIlllllI[3])) {
                String[] stringArray = new String[lIIlllllI[0]];
                stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[51]];
                if (y.lIIIIlIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray9 = new String[lIIlllllI[0]];
                    stringArray9[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[52]];
                    if (y.lIIIIlIlIIlI(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                        if (!y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dq), lIIlllllI[17]) || y.lIIIIlIlIIII(Players.getLocal().getWorldLocation().getPlane())) {
                            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[53]];
                            Movement.walkTo((WorldPoint)dq);

                            Time.sleepTicks((int)lIIlllllI[0]);

                        }
                        if (!y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dq), lIIlllllI[17]) || y.lIIIIlIlIIlI(Players.getLocal().getWorldLocation().getPlane())) {
                            if (y.lIIIIlIllIIl(Players.getLocal().getInteracting())) {
                                int[] nArray9 = new int[lIIlllllI[0]];
                                nArray9[y.lIIlllllI[1]] = lIIlllllI[54];
                                NPCs.getNearest((int[])nArray9).interact(lIIlllIll[lIIlllllI[55]]);
                                Time.sleepTicks((int)lIIlllllI[5]);

                            }
                            String[] stringArray10 = new String[lIIlllllI[0]];
                            stringArray10[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[56]];
                            lllllIllIllIII = TileItems.getNearest((String[])stringArray10);
                            if (y.lIIIIlIlIIII(Inventory.isFull() ? 1 : 0)) {
                                int[] nArray10 = new int[lIIlllllI[0]];
                                nArray10[y.lIIlllllI[1]] = lIIlllllI[12];
                                Inventory.getFirst((int[])nArray10).interact(lIIlllIll[lIIlllllI[57]]);
                                Time.sleepTicks((int)lIIlllllI[0]);

                            }
                            if (y.lIIIIlIlIlII(lllllIllIllIII)) {
                                lllllIllIllIII.interact(lIIlllIll[lIIlllllI[58]]);
                                Time.sleepTicks((int)lIIlllllI[5]);

                            }
                        }
                    }
                }
                String[] stringArray11 = new String[lIIlllllI[0]];
                stringArray11[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[59]];
                if (y.lIIIIlIlIIII(Inventory.contains((String[])stringArray11) ? 1 : 0)) {
                    if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dr), lIIlllllI[13])) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[60]];
                        Movement.walkTo((WorldPoint)dr);

                        Time.sleepTicks((int)lIIlllllI[0]);

                    }
                    if (y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dr), lIIlllllI[13])) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[61]];
                        y.aY();
                    }
                }
                String[] stringArray12 = new String[lIIlllllI[0]];
                stringArray12[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[15]];
                if (y.lIIIIlIlIIII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lIIlllllI[0]];
                    stringArray13[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[62]];
                    if (y.lIIIIlIlIIlI(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[63]];
                        String[] stringArray14 = new String[lIIlllllI[0]];
                        stringArray14[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[64]];
                        int[] nArray11 = new int[lIIlllllI[0]];
                        nArray11[y.lIIlllllI[1]] = lIIlllllI[65];
                        Inventory.getFirst((String[])stringArray14).useOn(TileObjects.getNearest((int[])nArray11));
                        Time.sleepTicks((int)lIIlllllI[6]);

                    }
                }
                String[] stringArray15 = new String[lIIlllllI[0]];
                stringArray15[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[66]];
                if (y.lIIIIlIlIIII(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                    String[] stringArray16 = new String[lIIlllllI[0]];
                    stringArray16[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[67]];
                    if (y.lIIIIlIlIIII(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                        if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dp), lIIlllllI[10])) {
                            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[68]];
                            if (y.lIIIIlIlIIII(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)dp);

                            Time.sleepTicks((int)lIIlllllI[0]);

                        }
                        if (y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dp), lIIlllllI[10])) {
                            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[69]];
                            String[] stringArray17 = new String[lIIlllllI[0]];
                            stringArray17[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[70]];
                            String[] stringArray18 = new String[lIIlllllI[0]];
                            stringArray18[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[71]];
                            Inventory.getFirst((String[])stringArray17).useOn(TileObjects.getNearest((String[])stringArray18));
                            Time.sleepTicks((int)lIIlllllI[10]);

                        }
                    }
                }
            }
            if (y.lIIIIlIlIIll(e.j(du), lIIlllllI[16])) {
                String[] stringArray = new String[lIIlllllI[0]];
                stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[72]];
                lllllIllIllIII = NPCs.getNearest((String[])stringArray);
                String[] stringArray19 = new String[lIIlllllI[0]];
                stringArray19[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[73]];
                if (y.lIIIIlIlIIlI(Inventory.contains((String[])stringArray19) ? 1 : 0) && y.lIIIIlIlIlII(lllllIllIllIII)) {
                    if (y.lIIIIlIlIIII(Reachable.isInteractable((Locatable)lllllIllIllIII) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[74]];
                        g.a(lIIlllIll[lIIlllllI[75]], bR);
                    }
                    if (y.lIIIIlIlIIlI(Reachable.isInteractable((Locatable)lllllIllIllIII) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[76]];
                        String[] stringArray20 = new String[lIIlllllI[0]];
                        stringArray20[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[77]];
                        TileObjects.getNearest((String[])stringArray20).interact(lIIlllIll[lIIlllllI[78]]);
                        Time.sleepTicks((int)lIIlllllI[5]);

                    }
                }
                String[] stringArray21 = new String[lIIlllllI[0]];
                stringArray21[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[79]];
                if (y.lIIIIlIlIIII(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                    String[] stringArray22 = new String[lIIlllllI[0]];
                    stringArray22[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[80]];
                    lllllIllIlIlll = TileObjects.getNearest((String[])stringArray22);
                    if (y.lIIIIlIlIlII(lllllIllIlIlll)) {
                        if (y.lIIIIlIlIIII(Reachable.isInteractable((Locatable)lllllIllIlIlll) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[81]];
                            String[] stringArray23 = new String[lIIlllllI[0]];
                            stringArray23[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[82]];
                            Inventory.getFirst((String[])stringArray23).useOn(lllllIllIlIlll);
                            Time.sleepTicks((int)lIIlllllI[5]);

                        }
                        if (y.lIIIIlIlIIlI(Reachable.isInteractable((Locatable)lllllIllIlIlll) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[83]];
                            String[] stringArray24 = new String[lIIlllllI[0]];
                            stringArray24[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[84]];
                            TileObjects.getNearest((String[])stringArray24).interact(lIIlllIll[lIIlllllI[85]]);
                            Time.sleepTicks((int)lIIlllllI[5]);

                        }
                    }
                }
            }
            if (y.lIIIIlIlIIll(e.j(du), lIIlllllI[17])) {
                String[] stringArray = new String[lIIlllllI[0]];
                stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[86]];
                lllllIllIllIII = NPCs.getNearest((String[])stringArray);
                if (y.lIIIIlIlIlII(lllllIllIllIII)) {
                    if (y.lIIIIlIlIIII(Reachable.isInteractable((Locatable)lllllIllIllIII) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[87]];
                        g.a(lIIlllIll[lIIlllllI[88]], bR);
                    }
                    if (y.lIIIIlIlIIlI(Reachable.isInteractable((Locatable)lllllIllIllIII) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[89]];
                        String[] stringArray25 = new String[lIIlllllI[0]];
                        stringArray25[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[90]];
                        TileObjects.getNearest((String[])stringArray25).interact(lIIlllIll[lIIlllllI[91]]);
                        Time.sleepTicks((int)lIIlllllI[5]);

                    }
                }
            }
            if (y.lIIIIlIlIIll(e.j(du), lIIlllllI[18])) {
                if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ds), lIIlllllI[3])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[92]];
                    lllllIllIllIII = new WorldArea(lIIlllllI[93], lIIlllllI[94], lIIlllllI[60], lIIlllllI[43], lIIlllllI[1]);
                    if (y.lIIIIlIlIIlI(lllllIllIllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        lllllIllIlIlll = new WorldArea(lIIlllllI[95], lIIlllllI[96], lIIlllllI[48], lIIlllllI[63], lIIlllllI[1]);
                        if (y.lIIIIlIlIIlI(lllllIllIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1]));

                            Time.sleepTicks((int)lIIlllllI[0]);

                        }
                        if (y.lIIIIlIlIIII(lllllIllIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1])), lIIlllllI[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1]));

                                Time.sleepTicks((int)lIIlllllI[0]);

                            }
                            if (y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1])), lIIlllllI[3])) {
                                String[] stringArray = new String[lIIlllllI[0]];
                                stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[98]];
                                lllllIllIlIllI = TileObjects.getNearest((String[])stringArray);
                                if (y.lIIIIlIlIlII(lllllIllIlIllI)) {
                                    String[] stringArray26 = new String[lIIlllllI[0]];
                                    stringArray26[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[99]];
                                    if (y.lIIIIlIlIIII(lllllIllIlIllI.hasAction(stringArray26) ? 1 : 0)) {
                                        lllllIllIlIllI.interact(lIIlllIll[lIIlllllI[100]]);
                                        Time.sleepTicks((int)lIIlllllI[10]);

                                    }
                                    String[] stringArray27 = new String[lIIlllllI[0]];
                                    stringArray27[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[101]];
                                    if (y.lIIIIlIlIIII(lllllIllIlIllI.hasAction(stringArray27) ? 1 : 0)) {
                                        lllllIllIlIllI.interact(lIIlllIll[lIIlllllI[102]]);
                                        Time.sleepTicks((int)lIIlllllI[10]);

                                    }
                                }
                            }
                        }
                    }
                    if (y.lIIIIlIlIIII(lllllIllIllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)ds);

                        Time.sleepTicks((int)lIIlllllI[0]);

                    }
                }
                if (y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ds), lIIlllllI[3])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[103]];
                    g.a(lIIlllIll[lIIlllllI[104]], bR);
                }
            }
            if (y.lIIIIlIllIlI(e.j(du), lIIlllllI[13]) && y.lIIIIlIlIIIl(e.j(du), lIIlllllI[72])) {
                if (y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ds), lIIlllllI[3])) {
                    String[] stringArray = new String[lIIlllllI[0]];
                    stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[105]];
                    if (y.lIIIIlIlIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[106]];
                        if (y.lIIIIlIlIIIl(cl, lIIlllllI[0])) {
                            an.nr += lIIlllllI[0];
                            an.o(AccBuilderEasyClues.m);
                            cl += lIIlllllI[0];
                            an.nr = lIIlllllI[1];
                            cm = lIIlllllI[1];
                        }
                        g.a(lIIlllIll[lIIlllllI[107]], bR);
                    }
                }
                String[] stringArray = new String[lIIlllllI[0]];
                stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[108]];
                if (y.lIIIIlIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0) && y.lIIIIlIlIIIl(e.j(du), lIIlllllI[72])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[109]];
                    y.ba();
                }
                String[] stringArray28 = new String[lIIlllllI[0]];
                stringArray28[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[110]];
                if (y.lIIIIlIlIIII(Inventory.contains((String[])stringArray28) ? 1 : 0) && y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ds), lIIlllllI[3]) && y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ds), lIIlllllI[3])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[111]];
                    lllllIllIllIII = new WorldArea(lIIlllllI[93], lIIlllllI[94], lIIlllllI[60], lIIlllllI[43], lIIlllllI[1]);
                    if (y.lIIIIlIlIIlI(lllllIllIllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        lllllIllIlIlll = new WorldArea(lIIlllllI[95], lIIlllllI[96], lIIlllllI[48], lIIlllllI[63], lIIlllllI[1]);
                        if (y.lIIIIlIlIIlI(lllllIllIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1]));

                            Time.sleepTicks((int)lIIlllllI[0]);

                        }
                        if (y.lIIIIlIlIIII(lllllIllIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1])), lIIlllllI[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1]));

                                Time.sleepTicks((int)lIIlllllI[0]);

                            }
                            if (y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1])), lIIlllllI[3])) {
                                String[] stringArray29 = new String[lIIlllllI[0]];
                                stringArray29[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[112]];
                                lllllIllIlIllI = TileObjects.getNearest((String[])stringArray29);
                                if (y.lIIIIlIlIlII(lllllIllIlIllI)) {
                                    String[] stringArray30 = new String[lIIlllllI[0]];
                                    stringArray30[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[113]];
                                    if (y.lIIIIlIlIIII(lllllIllIlIllI.hasAction(stringArray30) ? 1 : 0)) {
                                        lllllIllIlIllI.interact(lIIlllIll[lIIlllllI[114]]);
                                        Time.sleepTicks((int)lIIlllllI[10]);

                                    }
                                    String[] stringArray31 = new String[lIIlllllI[0]];
                                    stringArray31[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[115]];
                                    if (y.lIIIIlIlIIII(lllllIllIlIllI.hasAction(stringArray31) ? 1 : 0)) {
                                        lllllIllIlIllI.interact(lIIlllIll[lIIlllllI[116]]);
                                        Time.sleepTicks((int)lIIlllllI[10]);

                                    }
                                }
                            }
                        }
                    }
                    if (y.lIIIIlIlIIII(lllllIllIllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)ds);

                        Time.sleepTicks((int)lIIlllllI[0]);

                    }
                }
            }
            if (y.lIIIIlIllIlI(e.j(du), lIIlllllI[72]) && y.lIIIIlIlIIIl(e.j(dv), lIIlllllI[3])) {
                AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[117]];
                if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ds), lIIlllllI[3])) {
                    y.aZ();
                }
                if (y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ds), lIIlllllI[3])) {
                    if (y.lIIIIlIlIlII(Widgets.get((int)lIIlllllI[118], (int)lIIlllllI[27]))) {
                        Mouse.click((int)Widgets.get((int)lIIlllllI[118], (int)lIIlllllI[27]).getClickPoint().getX(), (int)Widgets.get((int)lIIlllllI[118], (int)lIIlllllI[27]).getClickPoint().getY(), (boolean)lIIlllllI[0]);
                        Time.sleepTicks((int)lIIlllllI[10]);

                    }
                    g.a(lIIlllIll[lIIlllllI[119]], bR);
                    g.a(bR);
                }
            }
            g.a(bR);
        }
    }

    private static boolean lIIIIlIlIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIlIllIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIlIlIllI(int n2) {
        return n2 < 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void bb() {
        void lllllIllIIlIlI;
        BankLocation bankLocation = BankLocation.getNearest();
        if (y.lIIIIlIlIlII(bankLocation) && y.lIIIIlIlIIlI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[138]];
            a.a(bankLocation);
        }
        if (y.lIIIIlIlIlII(lllllIllIIlIlI) && y.lIIIIlIlIIII(lllllIllIIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIIIIlIlIIlI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlllllI[4]);

            }
            if (y.lIIIIlIlIIII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[139]];
                if (y.lIIIIlIlIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIlllllI[6]);

                }
                a.a(lIIlllllI[7], lIIlllllI[13]);
                a.a(lIIlllllI[8], lIIlllllI[0]);
                a.a(lIIlllllI[11], lIIlllllI[0]);
                a.a(lIIlllllI[12], lIIlllllI[3]);
                a.a(lIIlllllI[9], lIIlllllI[41]);
            }
        }
    }

    @Override
    public int T() {
        try {
            y.aX();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIlllllI[117];
    }

    private static boolean lIIIIlIlIIlI(int n2) {
        return n2 == 0;
    }

    private static int lIIIIlIIllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean S() {
        return lIIlllllI[1];
    }

    private static boolean lIIIIlIllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void aY() {
        dw.add(lIIlllllI[120]);

        dw.add(lIIlllllI[121]);

        dw.add(lIIlllllI[122]);

        dw.add(lIIlllllI[123]);

        dw.add(lIIlllllI[124]);

        dw.add(lIIlllllI[125]);

        dw.add(lIIlllllI[126]);

        while (y.lIIIIlIlIIlI(dw.isEmpty() ? 1 : 0) && y.lIIIIlIlIIlI(dw.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[lIIlllllI[0]];
            stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[127]];
            if (y.lIIIIlIlIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {

                if (((2 ^ 0x21 ^ (0x66 ^ 0x17)) & (0x4E ^ 0x36 ^ (0x97 ^ 0xBD) ^ -1)) == 0) break;
                return;
            }
            int[] nArray = new int[lIIlllllI[0]];
            nArray[y.lIIlllllI[1]] = dw.get(lIIlllllI[1]);
            TileObject lllllIllIlIlII = TileObjects.getNearest((int[])nArray);
            if (y.lIIIIlIlIlII(lllllIllIlIlII)) {
                String[] stringArray2 = new String[lIIlllllI[0]];
                stringArray2[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[128]];
                if (y.lIIIIlIlIIII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIlllllI[0]];
                    stringArray3[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[129]];
                    Inventory.getFirst((String[])stringArray3).useOn(lllllIllIlIlII);
                    Time.sleepTicks((int)lIIlllllI[3]);

                }
            }
            String[] stringArray4 = new String[lIIlllllI[0]];
            stringArray4[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[130]];
            if (y.lIIIIlIlIIlI(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                dw.remove(lIIlllllI[1]);

                Time.sleepTicks((int)lIIlllllI[5]);

            }

            if ((0x21 ^ 0x25) > 3) continue;
            return;
        }
    }

    private static boolean lIIIIlIlIIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void aZ() {
        if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(ds), lIIlllllI[3])) {
            void lllllIllIlIIII;
            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[131]];
            WorldArea worldArea = new WorldArea(lIIlllllI[93], lIIlllllI[94], lIIlllllI[60], lIIlllllI[43], lIIlllllI[1]);
            if (y.lIIIIlIlIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void lllllIllIIllll;
                WorldArea worldArea2 = new WorldArea(lIIlllllI[95], lIIlllllI[96], lIIlllllI[48], lIIlllllI[63], lIIlllllI[1]);
                if (y.lIIIIlIlIIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1]));

                    Time.sleepTicks((int)lIIlllllI[0]);

                }
                if (y.lIIIIlIlIIII(lllllIllIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1])), lIIlllllI[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1]));

                        Time.sleepTicks((int)lIIlllllI[0]);

                    }
                    if (y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1])), lIIlllllI[3])) {
                        String[] stringArray = new String[lIIlllllI[0]];
                        stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[2]];
                        TileObject lllllIllIIlllI = TileObjects.getNearest((String[])stringArray);
                        if (y.lIIIIlIlIlII(lllllIllIIlllI)) {
                            String[] stringArray2 = new String[lIIlllllI[0]];
                            stringArray2[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[132]];
                            if (y.lIIIIlIlIIII(lllllIllIIlllI.hasAction(stringArray2) ? 1 : 0)) {
                                lllllIllIIlllI.interact(lIIlllIll[lIIlllllI[133]]);
                                Time.sleepTicks((int)lIIlllllI[10]);

                            }
                            String[] stringArray3 = new String[lIIlllllI[0]];
                            stringArray3[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[134]];
                            if (y.lIIIIlIlIIII(lllllIllIIlllI.hasAction(stringArray3) ? 1 : 0)) {
                                lllllIllIIlllI.interact(lIIlllIll[lIIlllllI[135]]);
                                Time.sleepTicks((int)lIIlllllI[10]);

                            }
                        }
                    }
                }
            }
            if (y.lIIIIlIlIIII(lllllIllIlIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)ds);

                Time.sleepTicks((int)lIIlllllI[0]);

            }
        }
    }

        return String.valueOf(lllllIlIllIlll);
    }

    private static void af() {
        d lllllIllIIIllI;
        Object lllllIllIIIlll;
        block10: {
            block9: {
                int[] nArray = new int[lIIlllllI[0]];
                nArray[y.lIIlllllI[1]] = lIIlllllI[14];
                if (y.lIIIIlIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lIIlllllI[14], lIIlllllI[0], lIIlllllI[142]);
                    bv.add(d2);

                }
                int[] nArray2 = new int[lIIlllllI[0]];
                nArray2[y.lIIlllllI[1]] = lIIlllllI[8];
                if (y.lIIIIlIlIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllllIllIIIlll = new DHelper(lIIlllllI[8], lIIlllllI[0], lIIlllllI[142]);
                    bv.add((DHelper) llllIllIIIlll);

                }
                int[] nArray3 = new int[lIIlllllI[0]];
                nArray3[y.lIIlllllI[1]] = lIIlllllI[11];
                if (y.lIIIIlIlIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lllllIllIIIlll = new DHelper(lIIlllllI[11], lIIlllllI[3], i.bq);
                    bv.add((DHelper) llllIllIIIlll);

                }
                int[] nArray4 = new int[lIIlllllI[0]];
                nArray4[y.lIIlllllI[1]] = lIIlllllI[12];
                if (y.lIIIIlIlIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lllllIllIIIlll = new DHelper(lIIlllllI[12], lIIlllllI[41], lIIlllllI[143]);
                    bv.add((DHelper) llllIllIIIlll);

                }
                int[] nArray5 = new int[lIIlllllI[0]];
                nArray5[y.lIIlllllI[1]] = lIIlllllI[9];
                if (!y.lIIIIlIlIIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[lIIlllllI[0]];
                nArray6[y.lIIlllllI[1]] = lIIlllllI[9];
                if (!y.lIIIIlIlIIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[lIIlllllI[0]];
                nArray7[y.lIIlllllI[1]] = lIIlllllI[9];
                if (!y.lIIIIlIlIIIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIlllllI[15])) break block10;
            }
            lllllIllIIIlll = new DHelper(lIIlllllI[9], lIIlllllI[15], lIIlllllI[107]);
            bv.add((DHelper) llllIllIIIlll);

        }
        if (y.lIIIIlIlIIlI(Bank.contains((Predicate)(lllllIllIIIlll = item -> item.getName().toLowerCase().contains(lIIlllIll[lIIlllllI[148]]))) ? 1 : 0)) {
            lllllIllIIIllI = new DHelper(lIIlllllI[144], lIIlllllI[3], lIIlllllI[145]);
            bv.add(lllllIllIIIllI);

        }
        int[] nArray = new int[lIIlllllI[0]];
        nArray[y.lIIlllllI[1]] = lIIlllllI[7];
        if (y.lIIIIlIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllIllIIIllI = new DHelper(lIIlllllI[7], lIIlllllI[51], lIIlllllI[146]);
            bv.add(lllllIllIIIllI);

        }
    }

    /*
     * WARNING - void declaration
     */
    private static void ba() {
        void lllllIllIIllII;
        BankLocation bankLocation = BankLocation.getNearest();
        if (y.lIIIIlIlIlII(bankLocation) && y.lIIIIlIlIIlI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[136]];
            a.a(bankLocation);
        }
        if (y.lIIIIlIlIlII(lllllIllIIllII) && y.lIIIIlIlIIII(lllllIllIIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIIIIlIlIIlI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlllllI[4]);

            }
            if (y.lIIIIlIlIIII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[137]];
                if (y.lIIIIlIlIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIlllllI[6]);

                }
                a.a(lIIlllllI[7], lIIlllllI[13]);
                a.a(lIIlllllI[11], lIIlllllI[0]);
                a.a(lIIlllllI[9], lIIlllllI[41]);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        String[] stringArray = new String[lIIlllllI[0]];
        stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[141]];
        if (y.lIIIIlIlIlIl(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIIlllllI[0]];
            nArray[y.lIIlllllI[1]] = lIIlllllI[12];
            if (y.lIIIIlIlIlIl(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIIlllllI[0]];
                nArray2[y.lIIlllllI[1]] = lIIlllllI[7];
                if (y.lIIIIlIlIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIIlllllI[0]];
                    nArray3[y.lIIlllllI[1]] = lIIlllllI[9];
                    if (y.lIIIIlIlIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = lIIlllllI[0];

                        if ((0x95 ^ 0x91) == (0x32 ^ 0x36)) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = lIIlllllI[1];
        return n2 != 0;
    }

    @Override
    public boolean V() {
        int n2;
        if (y.lIIIIlIllIlI(e.j(du), lIIlllllI[72]) && y.lIIIIlIllIlI(e.j(dv), lIIlllllI[3])) {
            n2 = lIIlllllI[0];

            if (3 < 2) {
                return false;
            }
        } else {
            n2 = lIIlllllI[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIIlIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIlIlIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIlIlIlII(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bc() {
        int n2;
        String[] stringArray = new String[lIIlllllI[0]];
        stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[140]];
        if (y.lIIIIlIlIlIl(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIIlllllI[0]];
            nArray[y.lIIlllllI[1]] = lIIlllllI[12];
            if (y.lIIIIlIlIlIl(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIIlllllI[0]];
                nArray2[y.lIIlllllI[1]] = lIIlllllI[11];
                if (y.lIIIIlIlIlIl(Inventory.getCount((int[])nArray2))) {
                    int[] nArray3 = new int[lIIlllllI[0]];
                    nArray3[y.lIIlllllI[1]] = lIIlllllI[7];
                    if (y.lIIIIlIlIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = lIIlllllI[0];

                        if ((0x7D ^ 0x14 ^ (0xF2 ^ 0x9F)) >= -1) return n2 != 0;
                        return ((3 ^ (0x3B ^ 0x34)) & (0xAD ^ 0x9A ^ (0x9A ^ 0xA1) ^ -1)) != 0;
                    }
                }
            }
        }
        n2 = lIIlllllI[1];
        return n2 != 0;
    }
}

