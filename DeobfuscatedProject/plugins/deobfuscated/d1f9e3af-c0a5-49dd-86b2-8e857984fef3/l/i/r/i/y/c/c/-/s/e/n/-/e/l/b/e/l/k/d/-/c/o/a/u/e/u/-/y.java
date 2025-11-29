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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.R;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
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
public class y
implements W {
    static /* synthetic */ boolean cm;
    static /* synthetic */ int cl;
    public static final /* synthetic */ WorldPoint do;
    public static final /* synthetic */ WorldPoint dr;
    public static /* synthetic */ boolean dt;
    private static /* synthetic */ String[] lIIlllIll;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ WorldPoint dn;
    static /* synthetic */ ArrayList<Integer> dw;
    public static final /* synthetic */ WorldPoint dl;
    public static /* synthetic */ int dv;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint dp;
    public static /* synthetic */ int du;
    private static /* synthetic */ int[] lIIlllllI;
    public static final /* synthetic */ WorldPoint dm;
    public static final /* synthetic */ WorldPoint ds;
    public static final /* synthetic */ WorldPoint dq;
    static /* synthetic */ String[] bR;

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
        y.lIIlllIll[y.lIIlllllI[1]] = y."Finished buying items, switching back to quest";
        y.lIIlllIll[y.lIIlllllI[0]] = y."Nav to bank";
        y.lIIlllIll[y.lIIlllllI[5]] = y."Handling banking";
        y.lIIlllIll[y.lIIlllllI[10]] = y."We are missing quest supplies, switching to BUYING";
        y.lIIlllIll[y.lIIlllllI[6]] = y."Drink";
        y.lIIlllIll[y.lIIlllllI[3]] = y."Eat";
        y.lIIlllIll[y.lIIlllllI[16]] = y."Nav to start";
        y.lIIlllIll[y.lIIlllllI[17]] = y."Starting quest";
        y.lIIlllIll[y.lIIlllllI[18]] = y."King Roald";
        y.lIIlllIll[y.lIIlllllI[19]] = y."Nav to temple door";
        y.lIIlllIll[y.lIIlllllI[13]] = y."Interesting door";
        y.lIIlllIll[y.lIIlllllI[20]] = y."Large door";
        y.lIIlllIll[y.lIIlllllI[21]] = y."Open";
        y.lIIlllIll[y.lIIlllllI[22]] = y."Temple Guardian";
        y.lIIlllIll[y.lIIlllllI[23]] = y."Nav to doggo";
        y.lIIlllIll[y.lIIlllllI[24]] = y."Trapdoor";
        y.lIIlllIll[y.lIIlllllI[27]] = y."Temple Guardian";
        y.lIIlllIll[y.lIIlllllI[28]] = y."Trapdoor";
        y.lIIlllIll[y.lIIlllllI[29]] = y."Open";
        y.lIIlllIll[y.lIIlllllI[30]] = y."Open";
        y.lIIlllIll[y.lIIlllllI[31]] = y."Climb-down";
        y.lIIlllIll[y.lIIlllllI[32]] = y."Climb-down";
        y.lIIlllIll[y.lIIlllllI[33]] = y."Temple Guardian";
        y.lIIlllIll[y.lIIlllllI[34]] = y."Wield";
        y.lIIlllIll[y.lIIlllllI[35]] = y."Temple Guardian";
        y.lIIlllIll[y.lIIlllllI[36]] = y."Attack";
        y.lIIlllIll[y.lIIlllllI[37]] = y."Monument";
        y.lIIlllIll[y.lIIlllllI[38]] = y."Break";
        y.lIIlllIll[y.lIIlllllI[39]] = y."Nav to temple door";
        y.lIIlllIll[y.lIIlllllI[40]] = y."Interacting door";
        y.lIIlllIll[y.lIIlllllI[41]] = y."Large door";
        y.lIIlllIll[y.lIIlllllI[42]] = y."Open";
        y.lIIlllIll[y.lIIlllllI[43]] = y."tell the king";
        y.lIIlllIll[y.lIIlllllI[44]] = y."Nav to king";
        y.lIIlllIll[y.lIIlllllI[45]] = y."talk king";
        y.lIIlllIll[y.lIIlllllI[46]] = y."King Roald";
        y.lIIlllIll[y.lIIlllllI[47]] = y."Nav to jail";
        y.lIIlllIll[y.lIIlllllI[48]] = y."Interesting door";
        y.lIIlllIll[y.lIIlllllI[49]] = y."Cell door";
        y.lIIlllIll[y.lIIlllllI[50]] = y."Open";
        y.lIIlllIll[y.lIIlllllI[51]] = y."Golden key";
        y.lIIlllIll[y.lIIlllllI[52]] = y."Iron key";
        y.lIIlllIll[y.lIIlllllI[53]] = y."Nav to gold key tile";
        y.lIIlllIll[y.lIIlllllI[55]] = y."Attack";
        y.lIIlllIll[y.lIIlllllI[56]] = y."Golden key";
        y.lIIlllIll[y.lIIlllllI[57]] = y."Eat";
        y.lIIlllIll[y.lIIlllllI[58]] = y."Take";
        y.lIIlllIll[y.lIIlllllI[59]] = y."Golden key";
        y.lIIlllIll[y.lIIlllllI[60]] = y."Nav to statues";
        y.lIIlllIll[y.lIIlllllI[61]] = y."Finding key";
        y.lIIlllIll[y.lIIlllllI[15]] = y."Iron key";
        y.lIIlllIll[y.lIIlllllI[62]] = y."Murky water";
        y.lIIlllIll[y.lIIlllllI[63]] = y."Getting water";
        y.lIIlllIll[y.lIIlllllI[64]] = y."Bucket";
        y.lIIlllIll[y.lIIlllllI[66]] = y."Iron key";
        y.lIIlllIll[y.lIIlllllI[67]] = y."Murky water";
        y.lIIlllIll[y.lIIlllllI[68]] = y."Nav to jail";
        y.lIIlllIll[y.lIIlllllI[69]] = y."Interesting door";
        y.lIIlllIll[y.lIIlllllI[70]] = y."Iron key";
        y.lIIlllIll[y.lIIlllllI[71]] = y."Cell door";
        y.lIIlllIll[y.lIIlllllI[72]] = y."Drezel";
        y.lIIlllIll[y.lIIlllllI[73]] = y."Blessed water";
        y.lIIlllIll[y.lIIlllllI[74]] = y."Handling chat";
        y.lIIlllIll[y.lIIlllllI[75]] = y."Drezel";
        y.lIIlllIll[y.lIIlllllI[76]] = y."Entering cell";
        y.lIIlllIll[y.lIIlllllI[77]] = y."Cell door";
        y.lIIlllIll[y.lIIlllllI[78]] = y."Open";
        y.lIIlllIll[y.lIIlllllI[79]] = y."Blessed water";
        y.lIIlllIll[y.lIIlllllI[80]] = y."Coffin";
        y.lIIlllIll[y.lIIlllllI[81]] = y."Using water on coffin";
        y.lIIlllIll[y.lIIlllllI[82]] = y."Blessed water";
        y.lIIlllIll[y.lIIlllllI[83]] = y."Exiting cell";
        y.lIIlllIll[y.lIIlllllI[84]] = y."Cell door";
        y.lIIlllIll[y.lIIlllllI[85]] = y."Open";
        y.lIIlllIll[y.lIIlllllI[86]] = y."Drezel";
        y.lIIlllIll[y.lIIlllllI[87]] = y."Handling chat";
        y.lIIlllIll[y.lIIlllllI[88]] = y."Drezel";
        y.lIIlllIll[y.lIIlllllI[89]] = y."Entering cell";
        y.lIIlllIll[y.lIIlllllI[90]] = y."Cell door";
        y.lIIlllIll[y.lIIlllllI[91]] = y."Open";
        y.lIIlllIll[y.lIIlllllI[92]] = y."Nav to final tile";
        y.lIIlllIll[y.lIIlllllI[98]] = y."Trapdoor";
        y.lIIlllIll[y.lIIlllllI[99]] = y."Open";
        y.lIIlllIll[y.lIIlllllI[100]] = y."Open";
        y.lIIlllIll[y.lIIlllllI[101]] = y."Climb-down";
        y.lIIlllIll[y.lIIlllllI[102]] = y."Climb-down";
        y.lIIlllIll[y.lIIlllllI[103]] = y."Handling chat";
        y.lIIlllIll[y.lIIlllllI[104]] = y."Drezel";
        y.lIIlllIll[y.lIIlllllI[105]] = y."Pure essence";
        y.lIIlllIll[y.lIIlllllI[106]] = y."Turning in ess";
        y.lIIlllIll[y.lIIlllllI[107]] = y."Drezel";
        y.lIIlllIll[y.lIIlllllI[108]] = y."Pure essence";
        y.lIIlllIll[y.lIIlllllI[109]] = y."Grabbing more ess";
        y.lIIlllIll[y.lIIlllllI[110]] = y."Pure essence";
        y.lIIlllIll[y.lIIlllllI[111]] = y."Nav to final tile";
        y.lIIlllIll[y.lIIlllllI[112]] = y."Trapdoor";
        y.lIIlllIll[y.lIIlllllI[113]] = y."Open";
        y.lIIlllIll[y.lIIlllllI[114]] = y."Open";
        y.lIIlllIll[y.lIIlllllI[115]] = y."Climb-down";
        y.lIIlllIll[y.lIIlllllI[116]] = y."Climb-down";
        y.lIIlllIll[y.lIIlllllI[117]] = y."Finish & Unlock morty/start nature";
        y.lIIlllIll[y.lIIlllllI[119]] = y."Drezel";
        y.lIIlllIll[y.lIIlllllI[127]] = y."Iron key";
        y.lIIlllIll[y.lIIlllllI[128]] = y."Golden key";
        y.lIIlllIll[y.lIIlllllI[129]] = y."Golden key";
        y.lIIlllIll[y.lIIlllllI[130]] = y."Iron key";
        y.lIIlllIll[y.lIIlllllI[131]] = y."Nav to final tile";
        y.lIIlllIll[y.lIIlllllI[2]] = y."Trapdoor";
        y.lIIlllIll[y.lIIlllllI[132]] = y."Open";
        y.lIIlllIll[y.lIIlllllI[133]] = y."Open";
        y.lIIlllIll[y.lIIlllllI[134]] = y."Climb-down";
        y.lIIlllIll[y.lIIlllllI[135]] = y."Climb-down";
        y.lIIlllIll[y.lIIlllllI[136]] = y."Nav to bank";
        y.lIIlllIll[y.lIIlllllI[137]] = y."Handling banking";
        y.lIIlllIll[y.lIIlllllI[138]] = y."Nav to bank";
        y.lIIlllIll[y.lIIlllllI[139]] = y."Handling banking";
        y.lIIlllIll[y.lIIlllllI[140]] = y."Bucket";
        y.lIIlllIll[y.lIIlllllI[141]] = y."Bucket";
        y.lIIlllIll[y.lIIlllllI[147]] = y."Priest In Peril";
        y.lIIlllIll[y.lIIlllllI[148]] = y."ring of wealth (";
        y.lIIlllIll[y.lIIlllllI[165]] = y."I'm looking for a quest!";
        y.lIIlllIll[y.lIIlllllI[166]] = y."Yes.";
        y.lIIlllIll[y.lIIlllllI[167]] = y."Ok, let me help then.";
        y.lIIlllIll[y.lIIlllllI[168]] = y."Yep, now tell me what the problem is.";
        y.lIIlllIll[y.lIIlllllI[169]] = y."Sure.";
        y.lIIlllIll[y.lIIlllllI[170]] = y."You're right, we don't.";
        y.lIIlllIll[y.lIIlllllI[171]] = y."Is there anything else interesting to do around here?";
        y.lIIlllIll[y.lIIlllllI[172]] = y."Well, what is it, I may be able to help?";
        y.lIIlllIll[y.lIIlllllI[173]] = y."Yes, I'll go and look for him.";
        y.lIIlllIll[y.lIIlllllI[174]] = y."Yes, I'm sure.";
        y.lIIlllIll[y.lIIlllllI[175]] = y."I'll get going.";
        y.lIIlllIll[y.lIIlllllI[176]] = y."Ok, thanks.";
        y.lIIlllIll[y.lIIlllllI[177]] = y."I think I've solved the puzzle!";
        y.lIIlllIll[y.lIIlllllI[178]] = y."How can I help?";
        y.lIIlllIll[y.lIIlllllI[179]] = y."Roald sent me to check on Drezel.";
        y.lIIlllIll[y.lIIlllllI[180]] = y."Why is the river such a good defence?";
        y.lIIlllIll[y.lIIlllllI[181]] = y."You're right, we don't.";
        y.lIIlllIll[y.lIIlllllI[182]] = y."Yes, of course.";
        y.lIIlllIll[y.lIIlllllI[183]] = y."Do you know of anything I can do in Morytania?";
        y.lIIlllIll[y.lIIlllllI[184]] = y."Well, what is it, I may be able to help?";
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
                        0;
                    }
                    if (y.lIIIIlIlIIII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[5]];
                        if (y.lIIIIlIlIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlllllI[6]);
                            0;
                        }
                        if (y.lIIIIlIlIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIlllllI[5]);
                            0;
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
                0;
            }
            int[] nArray = new int[lIIlllllI[0]];
            nArray[y.lIIlllllI[1]] = lIIlllllI[12];
            if (y.lIIIIlIlIIII(Inventory.contains((int[])nArray) ? 1 : 0) && y.lIIIIlIlIllI(y.lIIIIlIIllll(e.u(), 60.0))) {
                int[] nArray3 = new int[lIIlllllI[0]];
                nArray3[y.lIIlllllI[1]] = lIIlllllI[12];
                Inventory.getFirst((int[])nArray3).interact(lIIlllIll[lIIlllllI[3]]);
                Time.sleepTicks((int)lIIlllllI[0]);
                0;
            }
            if (y.lIIIIlIlIIIl(e.j(du), lIIlllllI[0]) && y.lIIIIlIlIIII(y.bc() ? 1 : 0)) {
                if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dl), lIIlllllI[10])) {
                    AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[16]];
                    if (y.lIIIIlIlIIII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)dl);
                    0;
                    Time.sleepTicks((int)lIIlllllI[0]);
                    0;
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
                    0;
                    Time.sleepTicks((int)lIIlllllI[0]);
                    0;
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
                        0;
                        Time.sleepTicks((int)lIIlllllI[10]);
                        0;
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
                                0;
                            }
                            String[] stringArray6 = new String[lIIlllllI[0]];
                            stringArray6[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[31]];
                            if (y.lIIIIlIlIIII(lllllIllIllIII.hasAction(stringArray6) ? 1 : 0)) {
                                lllllIllIllIII.interact(lIIlllIll[lIIlllllI[32]]);
                                Time.sleepTicks((int)lIIlllllI[5]);
                                0;
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
                        0;
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
                                0;
                            }
                        }
                        AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[39]];
                        Movement.walkTo((WorldPoint)dm);
                        0;
                        Time.sleepTicks((int)lIIlllllI[0]);
                        0;
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
                        0;
                        Time.sleepTicks((int)lIIlllllI[0]);
                        0;
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
                        0;
                        Time.sleepTicks((int)lIIlllllI[0]);
                        0;
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
                            0;
                            Time.sleepTicks((int)lIIlllllI[0]);
                            0;
                        }
                        if (!y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dq), lIIlllllI[17]) || y.lIIIIlIlIIlI(Players.getLocal().getWorldLocation().getPlane())) {
                            if (y.lIIIIlIllIIl(Players.getLocal().getInteracting())) {
                                int[] nArray9 = new int[lIIlllllI[0]];
                                nArray9[y.lIIlllllI[1]] = lIIlllllI[54];
                                NPCs.getNearest((int[])nArray9).interact(lIIlllIll[lIIlllllI[55]]);
                                Time.sleepTicks((int)lIIlllllI[5]);
                                0;
                            }
                            String[] stringArray10 = new String[lIIlllllI[0]];
                            stringArray10[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[56]];
                            lllllIllIllIII = TileItems.getNearest((String[])stringArray10);
                            if (y.lIIIIlIlIIII(Inventory.isFull() ? 1 : 0)) {
                                int[] nArray10 = new int[lIIlllllI[0]];
                                nArray10[y.lIIlllllI[1]] = lIIlllllI[12];
                                Inventory.getFirst((int[])nArray10).interact(lIIlllIll[lIIlllllI[57]]);
                                Time.sleepTicks((int)lIIlllllI[0]);
                                0;
                            }
                            if (y.lIIIIlIlIlII(lllllIllIllIII)) {
                                lllllIllIllIII.interact(lIIlllIll[lIIlllllI[58]]);
                                Time.sleepTicks((int)lIIlllllI[5]);
                                0;
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
                        0;
                        Time.sleepTicks((int)lIIlllllI[0]);
                        0;
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
                        0;
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
                            0;
                            Time.sleepTicks((int)lIIlllllI[0]);
                            0;
                        }
                        if (y.lIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dp), lIIlllllI[10])) {
                            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[69]];
                            String[] stringArray17 = new String[lIIlllllI[0]];
                            stringArray17[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[70]];
                            String[] stringArray18 = new String[lIIlllllI[0]];
                            stringArray18[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[71]];
                            Inventory.getFirst((String[])stringArray17).useOn(TileObjects.getNearest((String[])stringArray18));
                            Time.sleepTicks((int)lIIlllllI[10]);
                            0;
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
                        0;
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
                            0;
                        }
                        if (y.lIIIIlIlIIlI(Reachable.isInteractable((Locatable)lllllIllIlIlll) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[83]];
                            String[] stringArray24 = new String[lIIlllllI[0]];
                            stringArray24[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[84]];
                            TileObjects.getNearest((String[])stringArray24).interact(lIIlllIll[lIIlllllI[85]]);
                            Time.sleepTicks((int)lIIlllllI[5]);
                            0;
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
                        0;
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
                            0;
                            Time.sleepTicks((int)lIIlllllI[0]);
                            0;
                        }
                        if (y.lIIIIlIlIIII(lllllIllIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1])), lIIlllllI[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1]));
                                0;
                                Time.sleepTicks((int)lIIlllllI[0]);
                                0;
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
                                        0;
                                    }
                                    String[] stringArray27 = new String[lIIlllllI[0]];
                                    stringArray27[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[101]];
                                    if (y.lIIIIlIlIIII(lllllIllIlIllI.hasAction(stringArray27) ? 1 : 0)) {
                                        lllllIllIlIllI.interact(lIIlllIll[lIIlllllI[102]]);
                                        Time.sleepTicks((int)lIIlllllI[10]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (y.lIIIIlIlIIII(lllllIllIllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)ds);
                        0;
                        Time.sleepTicks((int)lIIlllllI[0]);
                        0;
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
                            0;
                            Time.sleepTicks((int)lIIlllllI[0]);
                            0;
                        }
                        if (y.lIIIIlIlIIII(lllllIllIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1])), lIIlllllI[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1]));
                                0;
                                Time.sleepTicks((int)lIIlllllI[0]);
                                0;
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
                                        0;
                                    }
                                    String[] stringArray31 = new String[lIIlllllI[0]];
                                    stringArray31[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[115]];
                                    if (y.lIIIIlIlIIII(lllllIllIlIllI.hasAction(stringArray31) ? 1 : 0)) {
                                        lllllIllIlIllI.interact(lIIlllIll[lIIlllllI[116]]);
                                        Time.sleepTicks((int)lIIlllllI[10]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (y.lIIIIlIlIIII(lllllIllIllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)ds);
                        0;
                        Time.sleepTicks((int)lIIlllllI[0]);
                        0;
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
                        0;
                    }
                    g.a(lIIlllIll[lIIlllllI[119]], bR);
                    g.a(bR);
                }
            }
            g.a(bR);
        }
    }

    private static String lIIIIIllllII(String lllllIlIlIIlII, String lllllIlIlIIIll) {
        try {
            SecretKeySpec lllllIlIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIlIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIlIlIIllI = Cipher.getInstance("Blowfish");
            lllllIlIlIIllI.init(lIIlllllI[5], lllllIlIlIIlll);
            return new String(lllllIlIlIIllI.doFinal(Base64.getDecoder().decode(lllllIlIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIlIlIIlIl) {
            lllllIlIlIIlIl.printStackTrace();
            return null;
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
                0;
            }
            if (y.lIIIIlIlIIII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[139]];
                if (y.lIIIIlIlIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIlllllI[6]);
                    0;
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
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (0xC ^ 0x67 ^ (0xE6 ^ 0xC5)) & (0x89 ^ 0xC4 ^ (0xBE ^ 0xBB) ^ -1);
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

    private static void lIIIIlIIlllI() {
        lIIlllllI = new int[186];
        y.lIIlllllI[0] = 1;
        y.lIIlllllI[1] = (86 + 56 - 49 + 35 ^ 65 + 154 - 80 + 58) & (0x15 ^ 0x3E ^ (0x49 ^ 0x27) ^ -1);
        y.lIIlllllI[2] = 0x51 ^ 0x3C ^ (0x61 ^ 0x67);
        y.lIIlllllI[3] = 74 + 136 - 143 + 110 ^ 156 + 69 - 119 + 74;
        y.lIIlllllI[4] = -(0xFFFFEDFB & 0x3A35) & (0xFFFFFFF9 & 0x3BBE);
        y.lIIlllllI[5] = 2;
        y.lIIlllllI[6] = 0x3E ^ 0xE ^ (0x20 ^ 0x14);
        y.lIIlllllI[7] = 0xFFFFBF5F & 0x5FE7;
        y.lIIlllllI[8] = -(0xFFFFFADF & 0x6579) & (0xFFFFFFDD & 0x67FF);
        y.lIIlllllI[9] = -(0xFFFFC67F & 0x79AD) & (0xFFFFDFEC & 0x7F3F);
        y.lIIlllllI[10] = 3;
        y.lIIlllllI[11] = -(0xFFFFFF0B & 0xEFF) & (0xFFFFFFDB & 0x3F7F);
        y.lIIlllllI[12] = 0xFFFFC17F & 0x3FFB;
        y.lIIlllllI[13] = 0x4C ^ 0x64 ^ (0x97 ^ 0xB5);
        y.lIIlllllI[14] = -(0xFFFF9E9F & 0x6B6D) & (0xFFFFBFBF & 0x4F7F);
        y.lIIlllllI[15] = 6 ^ 0x34;
        y.lIIlllllI[16] = 0xAB ^ 0xAD;
        y.lIIlllllI[17] = 0xEC ^ 0x83 ^ (0xF ^ 0x67);
        y.lIIlllllI[18] = 0xCA ^ 0xB7 ^ (0xB6 ^ 0xC3);
        y.lIIlllllI[19] = 0x69 ^ 0x60;
        y.lIIlllllI[20] = 201 + 169 - 224 + 60 ^ 53 + 180 - 232 + 196;
        y.lIIlllllI[21] = 0x19 ^ 0x15;
        y.lIIlllllI[22] = 0x44 ^ 0x49;
        y.lIIlllllI[23] = 27 + 1 - -3 + 152 ^ 45 + 81 - -39 + 20;
        y.lIIlllllI[24] = 0x58 ^ 0x57;
        y.lIIlllllI[25] = 0xFFFFDFCD & 0x2D7F;
        y.lIIlllllI[26] = 0xFFFFBDFE & 0x4FB3;
        y.lIIlllllI[27] = 0x8B ^ 0x9B;
        y.lIIlllllI[28] = 0x2E ^ 0x46 ^ (0xCC ^ 0xB5);
        y.lIIlllllI[29] = 0xD5 ^ 0xC7;
        y.lIIlllllI[30] = 0x82 ^ 0x91;
        y.lIIlllllI[31] = 0x4C ^ 0x58;
        y.lIIlllllI[32] = 0x27 ^ 0x12 ^ (0x61 ^ 0x41);
        y.lIIlllllI[33] = 0x6F ^ 3 ^ (0x1D ^ 0x67);
        y.lIIlllllI[34] = 0xA2 ^ 0xB5;
        y.lIIlllllI[35] = 0x2E ^ 0x36;
        y.lIIlllllI[36] = 0x7E ^ 0x7A ^ (0x85 ^ 0x98);
        y.lIIlllllI[37] = 93 + 131 - 80 + 10 ^ 122 + 32 - 121 + 95;
        y.lIIlllllI[38] = 0x7D ^ 0x66 ^ (0xD4 ^ 0x98) & ~(0x58 ^ 0x14);
        y.lIIlllllI[39] = 5 ^ 0x19;
        y.lIIlllllI[40] = 0x3E ^ 0x5E ^ (0xD3 ^ 0xAE);
        y.lIIlllllI[41] = 0x64 ^ 0x53 ^ (0xB2 ^ 0x9B);
        y.lIIlllllI[42] = 0x5C ^ 0x43;
        y.lIIlllllI[43] = 0xAB ^ 0x8B;
        y.lIIlllllI[44] = 108 + 115 - 106 + 48 ^ 71 + 131 - 71 + 1;
        y.lIIlllllI[45] = 0x6C ^ 0x4E;
        y.lIIlllllI[46] = 0x53 ^ 0x2F ^ (9 ^ 0x56);
        y.lIIlllllI[47] = 63 + 74 - 120 + 114 ^ 156 + 48 - 44 + 7;
        y.lIIlllllI[48] = 61 + 7 - -65 + 54 ^ 157 + 97 - 104 + 8;
        y.lIIlllllI[49] = 0x77 ^ 0x51;
        y.lIIlllllI[50] = 0x9D ^ 0xBA;
        y.lIIlllllI[51] = 0x31 ^ 0x7B ^ (0x15 ^ 0x77);
        y.lIIlllllI[52] = 9 + 58 - -125 + 42 ^ 56 + 102 - 40 + 77;
        y.lIIlllllI[53] = 0xA7 ^ 0x8D;
        y.lIIlllllI[54] = 0xFFFF8F9E & 0x7DFF;
        y.lIIlllllI[55] = 0x9A ^ 0x9E ^ (0x5C ^ 0x73);
        y.lIIlllllI[56] = 0x1B ^ 0x11 ^ (0x34 ^ 0x12);
        y.lIIlllllI[57] = 0xAB ^ 0x86;
        y.lIIlllllI[58] = 85 + 161 - 168 + 86 ^ 13 + 115 - 23 + 33;
        y.lIIlllllI[59] = 0x42 ^ 0x6D;
        y.lIIlllllI[60] = 0x31 ^ 3 ^ 2;
        y.lIIlllllI[61] = 0xD6 ^ 0x8E ^ (8 ^ 0x61);
        y.lIIlllllI[62] = 0x97 ^ 0xC2 ^ (0xDB ^ 0xBD);
        y.lIIlllllI[63] = 0xAB ^ 0x9F;
        y.lIIlllllI[64] = 0x5B ^ 0x6E;
        y.lIIlllllI[65] = 0xFFFFCDDF & 0x3FBD;
        y.lIIlllllI[66] = 0xF5 ^ 0xC3;
        y.lIIlllllI[67] = 87 + 69 - 46 + 75 ^ 51 + 11 - 7 + 87;
        y.lIIlllllI[68] = 0x61 ^ 0x10 ^ (0xDC ^ 0x95);
        y.lIIlllllI[69] = 0x35 ^ 0xC;
        y.lIIlllllI[70] = 0xBE ^ 0x84;
        y.lIIlllllI[71] = 0x1C ^ 0x3A ^ (0x99 ^ 0x84);
        y.lIIlllllI[72] = 0x45 ^ 0x79;
        y.lIIlllllI[73] = 0xA0 ^ 0x9D;
        y.lIIlllllI[74] = 134 + 36 - 157 + 143 ^ 104 + 138 - 184 + 104;
        y.lIIlllllI[75] = 0xFD ^ 0xC2;
        y.lIIlllllI[76] = 0x65 ^ 0x25;
        y.lIIlllllI[77] = 0x6B ^ 0x62 ^ (0xCC ^ 0x84);
        y.lIIlllllI[78] = 0x12 ^ 0x50;
        y.lIIlllllI[79] = 0x6A ^ 0x29;
        y.lIIlllllI[80] = 0x1F ^ 0x5B;
        y.lIIlllllI[81] = 0x47 ^ 0x6F ^ (0x2F ^ 0x42);
        y.lIIlllllI[82] = 0x3A ^ 0x7C;
        y.lIIlllllI[83] = 0x32 ^ 0x75;
        y.lIIlllllI[84] = 0x57 ^ 0x1F;
        y.lIIlllllI[85] = 0xF1 ^ 0xB8;
        y.lIIlllllI[86] = 0xDA ^ 0x90;
        y.lIIlllllI[87] = 0xC ^ 0x47;
        y.lIIlllllI[88] = 0x3C ^ 0x1E ^ (0xC ^ 0x62);
        y.lIIlllllI[89] = 92 + 3 - 43 + 152 ^ 38 + 58 - 31 + 64;
        y.lIIlllllI[90] = 105 + 15 - 72 + 91 ^ 188 + 28 - 59 + 40;
        y.lIIlllllI[91] = 0xB ^ 0x44;
        y.lIIlllllI[92] = 0xC7 ^ 0x97;
        y.lIIlllllI[93] = -(0xFFFFF7D9 & 0x3AAF) & (0xFFFFBFFF & 0x7FCF);
        y.lIIlllllI[94] = -(0xFFFFD7EB & 0x395D) & (0xFFFFFFDF & 0x37FF);
        y.lIIlllllI[95] = 0xFFFFBDBC & 0x4F7F;
        y.lIIlllllI[96] = 0xFFFFCDBE & 0x3FC7;
        y.lIIlllllI[97] = -(0xFFFFDBE6 & 0x765B) & (0xFFFFFFFD & 0x5FF3);
        y.lIIlllllI[98] = 0x90 ^ 0xC1;
        y.lIIlllllI[99] = 0x28 ^ 0x22 ^ (0x63 ^ 0x3B);
        y.lIIlllllI[100] = 0x19 ^ 0x4A;
        y.lIIlllllI[101] = 0x57 ^ 0x15 ^ (6 ^ 0x10);
        y.lIIlllllI[102] = 80 + 55 - 21 + 35 ^ 108 + 104 - 204 + 184;
        y.lIIlllllI[103] = 0x90 ^ 0xA0 ^ (1 ^ 0x67);
        y.lIIlllllI[104] = 7 ^ 0x38 ^ (0x41 ^ 0x29);
        y.lIIlllllI[105] = 0x5A ^ 2;
        y.lIIlllllI[106] = 0x1A ^ 0x43;
        y.lIIlllllI[107] = 0x6C ^ 0x36;
        y.lIIlllllI[108] = 97 + 9 - 64 + 113 ^ 186 + 185 - 257 + 78;
        y.lIIlllllI[109] = 0xFC ^ 0xA0;
        y.lIIlllllI[110] = (0xD3 ^ 0x84) & ~(0x97 ^ 0xC0) ^ (0xFD ^ 0xA0);
        y.lIIlllllI[111] = 0xEF ^ 0x8A ^ (0x36 ^ 0xD);
        y.lIIlllllI[112] = 0xE8 ^ 0xB7;
        y.lIIlllllI[113] = 0x70 ^ 0x10;
        y.lIIlllllI[114] = 0x58 ^ 0x63 ^ (0x9A ^ 0xC0);
        y.lIIlllllI[115] = 0xD ^ 0x3F ^ (0x92 ^ 0xC2);
        y.lIIlllllI[116] = 139 + 147 - 168 + 134 ^ 6 + 64 - 62 + 151;
        y.lIIlllllI[117] = 3 ^ 0x25 ^ (0xC7 ^ 0x85);
        y.lIIlllllI[118] = (0x5E ^ 0x7E) + (0xAE ^ 0x99) - (0xE ^ 0x3B) + (0x1D ^ 0x6A);
        y.lIIlllllI[119] = 0x3F ^ 0x5A;
        y.lIIlllllI[120] = 0xFFFFAFBB & 0x5DEC;
        y.lIIlllllI[121] = -(0x50 ^ 0x55) & (0xFFFFDDBF & 0x2FEE);
        y.lIIlllllI[122] = 0xFFFFEFE7 & 0x1DBF;
        y.lIIlllllI[123] = -(0xFFFFF21F & 0x6FF3) & (0xFFFFEFBF & 0x7FFB);
        y.lIIlllllI[124] = -(0xFFFFEF79 & 0x72C7) & (0xFFFFFFE7 & 0x6FFE);
        y.lIIlllllI[125] = -(0xFFFFAF5F & 0x72F5) & (0xFFFFAFFF & Short.MAX_VALUE);
        y.lIIlllllI[126] = 0xFFFFFDAD & 0xFF7;
        y.lIIlllllI[127] = 0x80 ^ 0xB0 ^ (0xC8 ^ 0x9E);
        y.lIIlllllI[128] = 3 ^ (0xC2 ^ 0xA6);
        y.lIIlllllI[129] = 0x6A ^ 2;
        y.lIIlllllI[130] = 0x6D ^ 0x48 ^ (0x61 ^ 0x2D);
        y.lIIlllllI[131] = 0x6F ^ 5;
        y.lIIlllllI[132] = 0x12 ^ 0x7E;
        y.lIIlllllI[133] = 20 + 189 - 58 + 43 ^ 105 + 158 - 179 + 91;
        y.lIIlllllI[134] = 0xEA ^ 0x84;
        y.lIIlllllI[135] = 0xE5 ^ 0x88 ^ 2;
        y.lIIlllllI[136] = 0x79 ^ 0x2D ^ (0x84 ^ 0xA0);
        y.lIIlllllI[137] = 0xE9 ^ 0x98;
        y.lIIlllllI[138] = 0x7D ^ 6 ^ (0x8A ^ 0x83);
        y.lIIlllllI[139] = 0xCC ^ 0xBF;
        y.lIIlllllI[140] = 0xC5 ^ 0xB1;
        y.lIIlllllI[141] = (0x28 ^ 0x78) & ~(0x43 ^ 0x13) ^ (0x7B ^ 0xE);
        y.lIIlllllI[142] = 0xFFFFFBBA & 0x276D;
        y.lIIlllllI[143] = -(0xFFFFEDE3 & 0x7EDE) & (0xFFFFFFFF & 0x6DED);
        y.lIIlllllI[144] = -(0xFFFFD377 & 0x6DBA) & (0xFFFFEFFD & Short.MAX_VALUE);
        y.lIIlllllI[145] = -(0xFFFFAEFF & 0x5558) & (0xFFFFFDFF & 0x67FF);
        y.lIIlllllI[146] = 0xFFFFAFBF & 0x53C4;
        y.lIIlllllI[147] = 0xC8 ^ 0xB9 ^ (0x5A ^ 0x5D);
        y.lIIlllllI[148] = 0x70 ^ 7;
        y.lIIlllllI[149] = -(0x50 ^ 0x7A) & (0xFFFFECBF & 0x1FFF);
        y.lIIlllllI[150] = -(0xFFFFF3F7 & 0x2E0F) & (0xFFFFFFD7 & 0x2FBF);
        y.lIIlllllI[151] = -(2 ^ 0x23) & (0xFFFF9D6F & 0x6FFF);
        y.lIIlllllI[152] = 0xFFFF9DB3 & 0x6FED;
        y.lIIlllllI[153] = 0xFFFFAFEF & 0x76BE;
        y.lIIlllllI[154] = 0xFFFFFFCF & 0x1F7D;
        y.lIIlllllI[155] = 0xFFFFF9FF & 0x1F16;
        y.lIIlllllI[156] = 0xFFFFDDF7 & 0x2F5F;
        y.lIIlllllI[157] = 0xFFFFFFFE & 0xD55;
        y.lIIlllllI[158] = -(0xFFFFD87F & 0x7782) & (0xFFFFFDAD & 0x5FF3);
        y.lIIlllllI[159] = -(0xFFFFB799 & 0x5AE7) & (0xFFFF9FFF & 0x7FDE);
        y.lIIlllllI[160] = -(0xFFFF9DD1 & 0x7B2F) & (0xFFFFBFBF & 0x7FDF);
        y.lIIlllllI[161] = -(0xFFFFC02F & 0x7FD4) & (0xFFFFCD77 & 0x7FFB);
        y.lIIlllllI[162] = -(0xFFFFED19 & 0x5BF7) & (0xFFFFEFFF & 0x7FB7);
        y.lIIlllllI[163] = -(0xFFFFFFD5 & 0x6E6B) & (0xFFFFEFFE & 0x7F6F);
        y.lIIlllllI[164] = 0xFFFFF5FF & 0xB33;
        y.lIIlllllI[165] = 0xC6 ^ 0xBE;
        y.lIIlllllI[166] = 0xFD ^ 0x84;
        y.lIIlllllI[167] = 7 ^ 0x7D;
        y.lIIlllllI[168] = 45 + 61 - -136 + 3 ^ 106 + 81 - 166 + 121;
        y.lIIlllllI[169] = 0x2D ^ 0x51;
        y.lIIlllllI[170] = 6 + 128 - -82 + 26 ^ 24 + 90 - -26 + 3;
        y.lIIlllllI[171] = 0x58 ^ 0x26;
        y.lIIlllllI[172] = (0x95 ^ 0xAC) + (0xF2 ^ 0x83) - (0x74 ^ 0x4A) + (0x52 ^ 0x41);
        y.lIIlllllI[173] = (0x6D ^ 0x52) + (0x98 ^ 0x8E) - (0x28 ^ 0x7B) + (0x56 ^ 0x28);
        y.lIIlllllI[174] = 73 + 105 - 57 + 8;
        y.lIIlllllI[175] = 87 + 113 - 157 + 87;
        y.lIIlllllI[176] = (0xDF ^ 0x97) + (0xC7 ^ 0xB0) - (39 + 2 - -51 + 69) + (0xC2 ^ 0xA7);
        y.lIIlllllI[177] = (0x6A ^ 0x46) + (79 + 79 - 50 + 19) - (0x40 ^ 0xB) + (0x36 ^ 0x12);
        y.lIIlllllI[178] = 99 + 77 - 132 + 89;
        y.lIIlllllI[179] = 45 + 13 - -1 + 68 + (6 ^ 0x34) - (0xD1 ^ 0x9B) + (0x35 ^ 0x2A);
        y.lIIlllllI[180] = 83 + 97 - 83 + 32 + (0x27 ^ 0x47) - (4 + 19 - -25 + 104) + (0x8B ^ 0xB5);
        y.lIIlllllI[181] = 78 + 49 - 121 + 130;
        y.lIIlllllI[182] = (0x16 ^ 0x68) + (0x33 ^ 0x15) - (0x41 ^ 2) + (0x4C ^ 0x64);
        y.lIIlllllI[183] = (0x4A ^ 0x45) + (0xF ^ 0x74) - (0x31 ^ 0x1F) + (0x48 ^ 0x66);
        y.lIIlllllI[184] = 24 + 136 - 68 + 47;
        y.lIIlllllI[185] = (0x2A ^ 0x2E) + (0x67 ^ 0x1E) - (3 ^ 0x73) + (52 + 100 - 101 + 76);
    }

    private static void aY() {
        dw.add(lIIlllllI[120]);
        0;
        dw.add(lIIlllllI[121]);
        0;
        dw.add(lIIlllllI[122]);
        0;
        dw.add(lIIlllllI[123]);
        0;
        dw.add(lIIlllllI[124]);
        0;
        dw.add(lIIlllllI[125]);
        0;
        dw.add(lIIlllllI[126]);
        0;
        while (y.lIIIIlIlIIlI(dw.isEmpty() ? 1 : 0) && y.lIIIIlIlIIlI(dw.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[lIIlllllI[0]];
            stringArray[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[127]];
            if (y.lIIIIlIlIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                0;
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
                    0;
                }
            }
            String[] stringArray4 = new String[lIIlllllI[0]];
            stringArray4[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[130]];
            if (y.lIIIIlIlIIlI(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                dw.remove(lIIlllllI[1]);
                0;
                Time.sleepTicks((int)lIIlllllI[5]);
                0;
            }
            0;
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
                    0;
                    Time.sleepTicks((int)lIIlllllI[0]);
                    0;
                }
                if (y.lIIIIlIlIIII(lllllIllIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (y.lIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1])), lIIlllllI[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIIlllllI[25], lIIlllllI[97], lIIlllllI[1]));
                        0;
                        Time.sleepTicks((int)lIIlllllI[0]);
                        0;
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
                                0;
                            }
                            String[] stringArray3 = new String[lIIlllllI[0]];
                            stringArray3[y.lIIlllllI[1]] = lIIlllIll[lIIlllllI[134]];
                            if (y.lIIIIlIlIIII(lllllIllIIlllI.hasAction(stringArray3) ? 1 : 0)) {
                                lllllIllIIlllI.interact(lIIlllIll[lIIlllllI[135]]);
                                Time.sleepTicks((int)lIIlllllI[10]);
                                0;
                            }
                        }
                    }
                }
            }
            if (y.lIIIIlIlIIII(lllllIllIlIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)ds);
                0;
                Time.sleepTicks((int)lIIlllllI[0]);
                0;
            }
        }
    }

    private static String lIIIIIlllIll(String lllllIlIIlIlIl, String lllllIlIIlIlII) {
        try {
            SecretKeySpec lllllIlIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIlIIlIlII.getBytes(StandardCharsets.UTF_8)), lIIlllllI[18]), "DES");
            Cipher lllllIlIIllIIl = Cipher.getInstance("DES");
            lllllIlIIllIIl.init(lIIlllllI[5], lllllIlIIllIlI);
            return new String(lllllIlIIllIIl.doFinal(Base64.getDecoder().decode(lllllIlIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIlIIllIII) {
            lllllIlIIllIII.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIlllIlI(String lllllIlIllIlII, String lllllIlIllIIll) {
        lllllIlIllIlII = new String(Base64.getDecoder().decode(lllllIlIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllIlIllIlll = new StringBuilder();
        char[] lllllIlIllIllI = lllllIlIllIIll.toCharArray();
        int lllllIlIllIlIl = lIIlllllI[1];
        char[] lllllIlIlIllll = lllllIlIllIlII.toCharArray();
        int lllllIlIlIlllI = lllllIlIlIllll.length;
        int lllllIlIlIllIl = lIIlllllI[1];
        while (y.lIIIIlIlIIIl(lllllIlIlIllIl, lllllIlIlIlllI)) {
            char lllllIlIlllIlI = lllllIlIlIllll[lllllIlIlIllIl];
            lllllIlIllIlll.append((char)(lllllIlIlllIlI ^ lllllIlIllIllI[lllllIlIllIlIl % lllllIlIllIllI.length]));
            0;
            ++lllllIlIllIlIl;
            ++lllllIlIlIllIl;
            0;
            if ((0xC7 ^ 0xC3) > ((0x80 ^ 0xA1) & ~(0x41 ^ 0x60))) continue;
            return null;
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
                    d d2 = new d(lIIlllllI[14], lIIlllllI[0], lIIlllllI[142]);
                    bv.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIIlllllI[0]];
                nArray2[y.lIIlllllI[1]] = lIIlllllI[8];
                if (y.lIIIIlIlIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllllIllIIIlll = new d(lIIlllllI[8], lIIlllllI[0], lIIlllllI[142]);
                    bv.add((d)lllllIllIIIlll);
                    0;
                }
                int[] nArray3 = new int[lIIlllllI[0]];
                nArray3[y.lIIlllllI[1]] = lIIlllllI[11];
                if (y.lIIIIlIlIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lllllIllIIIlll = new d(lIIlllllI[11], lIIlllllI[3], i.bq);
                    bv.add((d)lllllIllIIIlll);
                    0;
                }
                int[] nArray4 = new int[lIIlllllI[0]];
                nArray4[y.lIIlllllI[1]] = lIIlllllI[12];
                if (y.lIIIIlIlIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lllllIllIIIlll = new d(lIIlllllI[12], lIIlllllI[41], lIIlllllI[143]);
                    bv.add((d)lllllIllIIIlll);
                    0;
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
            lllllIllIIIlll = new d(lIIlllllI[9], lIIlllllI[15], lIIlllllI[107]);
            bv.add((d)lllllIllIIIlll);
            0;
        }
        if (y.lIIIIlIlIIlI(Bank.contains((Predicate)(lllllIllIIIlll = item -> item.getName().toLowerCase().contains(lIIlllIll[lIIlllllI[148]]))) ? 1 : 0)) {
            lllllIllIIIllI = new d(lIIlllllI[144], lIIlllllI[3], lIIlllllI[145]);
            bv.add(lllllIllIIIllI);
            0;
        }
        int[] nArray = new int[lIIlllllI[0]];
        nArray[y.lIIlllllI[1]] = lIIlllllI[7];
        if (y.lIIIIlIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllIllIIIllI = new d(lIIlllllI[7], lIIlllllI[51], lIIlllllI[146]);
            bv.add(lllllIllIIIllI);
            0;
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
                0;
            }
            if (y.lIIIIlIlIIII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlllIll[lIIlllllI[137]];
                if (y.lIIIIlIlIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIlllllI[6]);
                    0;
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
                        0;
                        if ((0x95 ^ 0x91) == (0x32 ^ 0x36)) return n2 != 0;
                        return ((0x3F ^ 0xC) & ~(0x27 ^ 0x14)) != 0;
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
            0;
            if (3 < 2) {
                return ((0x42 ^ 0x5F) & ~(0x87 ^ 0x9A)) != 0;
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
                        0;
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

