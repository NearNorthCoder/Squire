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
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.K_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
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
public class s_Unknown
implements S {
    public static /* synthetic */ boolean dq;
    public static final /* synthetic */ WorldPoint dj;
    public static final /* synthetic */ WorldPoint dk;
    public static final /* synthetic */ WorldPoint dm;
    static /* synthetic */ ArrayList<Integer> dr;
    public static /* synthetic */ List<d> bu;
    static /* synthetic */ String[] bQ;
    public static final /* synthetic */ WorldPoint di;
    public static final /* synthetic */ WorldPoint dn;
    static /* synthetic */ boolean cl;
    public static final /* synthetic */ WorldPoint dp;
    static /* synthetic */ int ck;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ int cY;
    public static final /* synthetic */ WorldPoint do;
    private static /* synthetic */ int[] lIIIIIlIIll;
    public static /* synthetic */ int cZ;
    private static /* synthetic */ String[] lIIIIIlIIIl;
    public static final /* synthetic */ WorldPoint dl;

    @Override
    public boolean V() {
        int n2;
        if (s.llIlllIllllII(e.j(cY), lIIIIIlIIll[72]) && s.llIlllIllllII(e.j(cZ), lIIIIIlIIll[3])) {
            n2 = lIIIIIlIIll[0];
            0;
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
        s.lIIIIIlIIIl[s.lIIIIIlIIll[1]] = s."Finished buying items, switching back to quest";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[0]] = s."Nav to bank";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[5]] = s."Handling banking";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[10]] = s."We are missing quest supplies, switching to BUYING";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[6]] = s."Drink";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[3]] = s."Eat";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[16]] = s."Nav to start";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[17]] = s."Starting quest";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[18]] = s."King Roald";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[19]] = s."Nav to temple door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[13]] = s."Interesting door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[20]] = s."Large door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[21]] = s."Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[22]] = s."Temple Guardian";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[23]] = s."Nav to doggo";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[24]] = s."Trapdoor";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[27]] = s."Temple Guardian";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[28]] = s."Trapdoor";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[29]] = s."Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[30]] = s."Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[31]] = s."Climb-down";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[32]] = s."Climb-down";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[33]] = s."Temple Guardian";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[34]] = s."Wield";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[35]] = s."Temple Guardian";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[36]] = s."Attack";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[37]] = s."Monument";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[38]] = s."Break";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[39]] = s."Nav to temple door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[40]] = s."Interacting door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[41]] = s."Large door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[42]] = s."Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[43]] = s."tell the king";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[44]] = s."Nav to king";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[45]] = s."talk king";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[46]] = s."King Roald";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[47]] = s."Nav to jail";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[48]] = s."Interesting door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[49]] = s."Cell door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[50]] = s."Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[51]] = s."Golden key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[52]] = s."Iron key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[53]] = s."Nav to gold key tile";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[55]] = s."Attack";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[56]] = s."Golden key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[57]] = s."Eat";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[58]] = s."Take";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[59]] = s."Golden key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[60]] = s."Nav to statues";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[61]] = s."Finding key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[15]] = s."Iron key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[62]] = s."Murky water";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[63]] = s."Getting water";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[64]] = s."Bucket";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[66]] = s."Iron key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[67]] = s."Murky water";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[68]] = s."Nav to jail";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[69]] = s."Interesting door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[70]] = s."Iron key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[71]] = s."Cell door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[72]] = s."Drezel";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[73]] = s."Blessed water";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[74]] = s."Handling chat";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[75]] = s."Drezel";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[76]] = s."Entering cell";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[77]] = s."Cell door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[78]] = s."Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[79]] = s."Blessed water";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[80]] = s."Coffin";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[81]] = s."Using water on coffin";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[82]] = s."Blessed water";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[83]] = s."Exiting cell";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[84]] = s."Cell door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[85]] = s."Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[86]] = s."Drezel";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[87]] = s."Handling chat";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[88]] = s."Drezel";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[89]] = s."Entering cell";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[90]] = s."Cell door";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[91]] = s."Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[92]] = s."Nav to final tile";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[98]] = s."Trapdoor";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[99]] = s."Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[100]] = s."Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[101]] = s."Climb-down";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[102]] = s."Climb-down";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[103]] = s."Handling chat";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[104]] = s."Drezel";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[105]] = s."Pure essence";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[106]] = s."Turning in ess";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[107]] = s."Drezel";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[108]] = s."Pure essence";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[109]] = s."Grabbing more ess";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[110]] = s."Pure essence";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[111]] = s."Nav to final tile";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[112]] = s."Trapdoor";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[113]] = s."Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[114]] = s."Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[115]] = s."Climb-down";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[116]] = s."Climb-down";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[117]] = s."Finish & Unlock morty/start nature";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[119]] = s."Drezel";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[127]] = s."Iron key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[128]] = s."Golden key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[129]] = s."Golden key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[130]] = s."Iron key";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[131]] = s."Nav to final tile";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[2]] = s."Trapdoor";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[132]] = s."Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[133]] = s."Open";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[134]] = s."Climb-down";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[135]] = s."Climb-down";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[136]] = s."Nav to bank";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[137]] = s."Handling banking";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[138]] = s."Nav to bank";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[139]] = s."Handling banking";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[140]] = s."Bucket";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[141]] = s."Bucket";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[147]] = s."Priest In Peril";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[148]] = s."ring of wealth (";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[165]] = s."I'm looking for a quest!";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[166]] = s."Yes.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[167]] = s."Ok, let me help then.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[168]] = s."Yep, now tell me what the problem is.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[169]] = s."Sure.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[170]] = s."You're right, we don't.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[171]] = s."Is there anything else interesting to do around here?";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[172]] = s."Well, what is it, I may be able to help?";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[173]] = s."Yes, I'll go and look for him.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[174]] = s."Yes, I'm sure.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[175]] = s."I'll get going.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[176]] = s."Ok, thanks.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[177]] = s."I think I've solved the puzzle!";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[178]] = s."How can I help?";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[179]] = s."Roald sent me to check on Drezel.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[180]] = s."Why is the river such a good defence?";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[181]] = s."You're right, we don't.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[182]] = s."Yes, of course.";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[183]] = s."Do you know of anything I can do in Morytania?";
        s.lIIIIIlIIIl[s.lIIIIIlIIll[184]] = s."Well, what is it, I may be able to help?";
    }

    private static void ae() {
        d var4;
        Object var30;
        block10: {
            block9: {
                int[] nArray = new int[lIIIIIlIIll[0]];
                nArray[s.lIIIIIlIIll[1]] = lIIIIIlIIll[14];
                if (s.llIlllIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIIIIIlIIll[14], lIIIIIlIIll[0], lIIIIIlIIll[142]);
                    bu.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIIIIIlIIll[0]];
                nArray2[s.lIIIIIlIIll[1]] = lIIIIIlIIll[8];
                if (s.llIlllIllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var30 = new d(lIIIIIlIIll[8], lIIIIIlIIll[0], lIIIIIlIIll[142]);
                    bu.add((d)var30);
                    0;
                }
                int[] nArray3 = new int[lIIIIIlIIll[0]];
                nArray3[s.lIIIIIlIIll[1]] = lIIIIIlIIll[11];
                if (s.llIlllIllIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    var30 = new d(lIIIIIlIIll[11], lIIIIIlIIll[3], i.bp);
                    bu.add((d)var30);
                    0;
                }
                int[] nArray4 = new int[lIIIIIlIIll[0]];
                nArray4[s.lIIIIIlIIll[1]] = lIIIIIlIIll[12];
                if (s.llIlllIllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    var30 = new d(lIIIIIlIIll[12], lIIIIIlIIll[41], lIIIIIlIIll[143]);
                    bu.add((d)var30);
                    0;
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
            var30 = new d(lIIIIIlIIll[9], lIIIIIlIIll[15], lIIIIIlIIll[107]);
            bu.add((d)var30);
            0;
        }
        if (s.llIlllIllIlII(Bank.contains((Predicate)(var30 = item -> item.getName().toLowerCase().contains(lIIIIIlIIIl[lIIIIIlIIll[148]]))) ? 1 : 0)) {
            var4 = new d(lIIIIIlIIll[144], lIIIIIlIIll[3], lIIIIIlIIll[145]);
            bu.add(var4);
            0;
        }
        int[] nArray = new int[lIIIIIlIIll[0]];
        nArray[s.lIIIIIlIIll[1]] = lIIIIIlIIll[7];
        if (s.llIlllIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            var4 = new d(lIIIIIlIIll[7], lIIIIIlIIll[51], lIIIIIlIIll[146]);
            bu.add(var4);
            0;
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
        void var22;
        BankLocation bankLocation = BankLocation.getNearest();
        if (s.llIlllIllIllI(bankLocation) && s.llIlllIllIlII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[136]];
            a.a(bankLocation);
        }
        if (s.llIlllIllIllI(var22) && s.llIlllIllIIlI(var22.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (s.llIlllIllIlII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIlIIll[4]);
                0;
            }
            if (s.llIlllIllIIlI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[137]];
                if (s.llIlllIllIlll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIIIIlIIll[6]);
                    0;
                }
                a.a(lIIIIIlIIll[7], lIIIIIlIIll[13]);
                a.a(lIIIIIlIIll[11], lIIIIIlIIll[0]);
                a.a(lIIIIIlIIll[9], lIIIIIlIIll[41]);
            }
        }
    }

    private static void bd() {
        dr.add(lIIIIIlIIll[120]);
        0;
        dr.add(lIIIIIlIIll[121]);
        0;
        dr.add(lIIIIIlIIll[122]);
        0;
        dr.add(lIIIIIlIIll[123]);
        0;
        dr.add(lIIIIIlIIll[124]);
        0;
        dr.add(lIIIIIlIIll[125]);
        0;
        dr.add(lIIIIIlIIll[126]);
        0;
        while (s.llIlllIllIlII(dr.isEmpty() ? 1 : 0) && s.llIlllIllIlII(dr.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[lIIIIIlIIll[0]];
            stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[127]];
            if (s.llIlllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                0;
                if (null == null) break;
                return;
            }
            int[] nArray = new int[lIIIIIlIIll[0]];
            nArray[s.lIIIIIlIIll[1]] = dr.get(lIIIIIlIIll[1]);
            TileObject var10 = TileObjects.getNearest((int[])nArray);
            if (s.llIlllIllIllI(var10)) {
                String[] stringArray2 = new String[lIIIIIlIIll[0]];
                stringArray2[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[128]];
                if (s.llIlllIllIIlI(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIIIIlIIll[0]];
                    stringArray3[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[129]];
                    Inventory.getFirst((String[])stringArray3).useOn(var10);
                    Time.sleepTicks((int)lIIIIIlIIll[3]);
                    0;
                }
            }
            String[] stringArray4 = new String[lIIIIIlIIll[0]];
            stringArray4[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[130]];
            if (s.llIlllIllIlII(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                dr.remove(lIIIIIlIIll[1]);
                0;
                Time.sleepTicks((int)lIIIIIlIIll[5]);
                0;
            }
            0;
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
        void var20;
        BankLocation bankLocation = BankLocation.getNearest();
        if (s.llIlllIllIllI(bankLocation) && s.llIlllIllIlII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[138]];
            a.a(bankLocation);
        }
        if (s.llIlllIllIllI(var20) && s.llIlllIllIIlI(var20.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (s.llIlllIllIlII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIlIIll[4]);
                0;
            }
            if (s.llIlllIllIIlI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[139]];
                if (s.llIlllIllIlll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIIIIlIIll[6]);
                    0;
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
                        0;
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

    private static String llIlllIIlllll(String var25, String var14) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var9 = var14.toCharArray();
        int var6 = lIIIIIlIIll[1];
        char[] var11 = var25.toCharArray();
        int var13 = var11.length;
        int var5 = lIIIIIlIIll[1];
        while (s.llIlllIllIIll(var5, var13)) {
            char var15 = var11[var5];
            var26.append((char)(var15 ^ var9[var6 % var9.length]));
            0;
            ++var6;
            ++var5;
            0;
            if ((84 + 72 - 54 + 87 ^ 148 + 98 - 186 + 125) > -1) continue;
            return null;
        }
        return String.valueOf(var26);
    }

    @Override
    public int T() {
        try {
            s.bc();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 != -1) {
            return (4 ^ 0x54 ^ (0x19 ^ 0x1E)) & (169 + 30 - 118 + 145 ^ 4 + 1 - -71 + 105 ^ -1);
        }
        return lIIIIIlIIll[117];
    }

    private static String llIlllIlIIIIl(String var7, String var8) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIIIIIlIIll[5], var18);
            return new String(var1.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
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
            TileObject var2;
            TileObject var29;
            BankLocation var23;
            if (s.llIlllIllIIll(e.j(lIIIIIlIIll[2]), lIIIIIlIIll[3])) {
                K.cY();
            }
            if (s.llIlllIllIlII(s.bf() ? 1 : 0) && s.llIlllIllIIll(e.j(cY), lIIIIIlIIll[0]) && s.llIlllIllIlIl(e.j(lIIIIIlIIll[2]), lIIIIIlIIll[3])) {
                var23 = BankLocation.getNearest();
                if (s.llIlllIllIllI(var23) && s.llIlllIllIlII(var23.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[0]];
                    a.a(var23);
                }
                if (s.llIlllIllIllI(var23) && s.llIlllIllIIlI(var23.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (s.llIlllIllIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIlIIll[4]);
                        0;
                    }
                    if (s.llIlllIllIIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[5]];
                        if (s.llIlllIllIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIIlIIll[6]);
                            0;
                        }
                        if (s.llIlllIllIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIIIlIIll[5]);
                            0;
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
                0;
            }
            int[] nArray = new int[lIIIIIlIIll[0]];
            nArray[s.lIIIIIlIIll[1]] = lIIIIIlIIll[12];
            if (s.llIlllIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0) && s.llIlllIlllIII(s.llIlllIllIIIl(e.u(), 60.0))) {
                int[] nArray3 = new int[lIIIIIlIIll[0]];
                nArray3[s.lIIIIIlIIll[1]] = lIIIIIlIIll[12];
                Inventory.getFirst((int[])nArray3).interact(lIIIIIlIIIl[lIIIIIlIIll[3]]);
                Time.sleepTicks((int)lIIIIIlIIll[0]);
                0;
            }
            if (s.llIlllIllIIll(e.j(cY), lIIIIIlIIll[0]) && s.llIlllIllIIlI(s.bf() ? 1 : 0)) {
                if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(di), lIIIIIlIIll[10])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[16]];
                    if (s.llIlllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)di);
                    0;
                    Time.sleepTicks((int)lIIIIIlIIll[0]);
                    0;
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
                    0;
                    Time.sleepTicks((int)lIIIIIlIIll[0]);
                    0;
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
                    var23 = TileObjects.getNearest((String[])stringArray2);
                    if (s.llIlllIllIllI(var23) && s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo((Locatable)var23), lIIIIIlIIll[6]) && s.llIlllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bQ);
                    }
                    if (!s.llIlllIllIIlI(Dialog.isOpen() ? 1 : 0) || s.llIlllIlllIIl(Players.getLocal().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[26], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[26], lIIIIIlIIll[1]));
                        0;
                        Time.sleepTicks((int)lIIIIIlIIll[10]);
                        0;
                    }
                }
                if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[26], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                    String[] stringArray3 = new String[lIIIIIlIIll[0]];
                    stringArray3[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[27]];
                    if (s.llIlllIlllIll(NPCs.getNearest((String[])stringArray3))) {
                        String[] stringArray4 = new String[lIIIIIlIIll[0]];
                        stringArray4[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[28]];
                        var23 = TileObjects.getNearest((String[])stringArray4);
                        if (s.llIlllIllIllI(var23) && s.llIlllIllIlII(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray5 = new String[lIIIIIlIIll[0]];
                            stringArray5[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[29]];
                            if (s.llIlllIllIIlI(var23.hasAction(stringArray5) ? 1 : 0)) {
                                var23.interact(lIIIIIlIIIl[lIIIIIlIIll[30]]);
                                Time.sleepTicks((int)lIIIIIlIIll[5]);
                                0;
                            }
                            String[] stringArray6 = new String[lIIIIIlIIll[0]];
                            stringArray6[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[31]];
                            if (s.llIlllIllIIlI(var23.hasAction(stringArray6) ? 1 : 0)) {
                                var23.interact(lIIIIIlIIIl[lIIIIIlIIll[32]]);
                                Time.sleepTicks((int)lIIIIIlIIll[5]);
                                0;
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
                        0;
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
                                0;
                            }
                        }
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[39]];
                        Movement.walkTo((WorldPoint)dj);
                        0;
                        Time.sleepTicks((int)lIIIIIlIIll[0]);
                        0;
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
                        0;
                        Time.sleepTicks((int)lIIIIIlIIll[0]);
                        0;
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
                        0;
                        Time.sleepTicks((int)lIIIIIlIIll[0]);
                        0;
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
                            0;
                            Time.sleepTicks((int)lIIIIIlIIll[0]);
                            0;
                        }
                        if (!s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dn), lIIIIIlIIll[17]) || s.llIlllIllIlII(Players.getLocal().getWorldLocation().getPlane())) {
                            if (s.llIlllIlllIll(Players.getLocal().getInteracting())) {
                                int[] nArray9 = new int[lIIIIIlIIll[0]];
                                nArray9[s.lIIIIIlIIll[1]] = lIIIIIlIIll[54];
                                NPCs.getNearest((int[])nArray9).interact(lIIIIIlIIIl[lIIIIIlIIll[55]]);
                                Time.sleepTicks((int)lIIIIIlIIll[5]);
                                0;
                            }
                            String[] stringArray10 = new String[lIIIIIlIIll[0]];
                            stringArray10[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[56]];
                            var23 = TileItems.getNearest((String[])stringArray10);
                            if (s.llIlllIllIIlI(Inventory.isFull() ? 1 : 0)) {
                                int[] nArray10 = new int[lIIIIIlIIll[0]];
                                nArray10[s.lIIIIIlIIll[1]] = lIIIIIlIIll[12];
                                Inventory.getFirst((int[])nArray10).interact(lIIIIIlIIIl[lIIIIIlIIll[57]]);
                                Time.sleepTicks((int)lIIIIIlIIll[0]);
                                0;
                            }
                            if (s.llIlllIllIllI(var23)) {
                                var23.interact(lIIIIIlIIIl[lIIIIIlIIll[58]]);
                                Time.sleepTicks((int)lIIIIIlIIll[5]);
                                0;
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
                        0;
                        Time.sleepTicks((int)lIIIIIlIIll[0]);
                        0;
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
                        0;
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
                            0;
                            Time.sleepTicks((int)lIIIIIlIIll[0]);
                            0;
                        }
                        if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dm), lIIIIIlIIll[10])) {
                            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[69]];
                            String[] stringArray17 = new String[lIIIIIlIIll[0]];
                            stringArray17[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[70]];
                            String[] stringArray18 = new String[lIIIIIlIIll[0]];
                            stringArray18[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[71]];
                            Inventory.getFirst((String[])stringArray17).useOn(TileObjects.getNearest((String[])stringArray18));
                            Time.sleepTicks((int)lIIIIIlIIll[10]);
                            0;
                        }
                    }
                }
            }
            if (s.llIlllIllIlIl(e.j(cY), lIIIIIlIIll[16])) {
                String[] stringArray = new String[lIIIIIlIIll[0]];
                stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[72]];
                var23 = NPCs.getNearest((String[])stringArray);
                String[] stringArray19 = new String[lIIIIIlIIll[0]];
                stringArray19[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[73]];
                if (s.llIlllIllIlII(Inventory.contains((String[])stringArray19) ? 1 : 0) && s.llIlllIllIllI(var23)) {
                    if (s.llIlllIllIIlI(Reachable.isInteractable((Locatable)var23) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[74]];
                        g.a(lIIIIIlIIIl[lIIIIIlIIll[75]], bQ);
                    }
                    if (s.llIlllIllIlII(Reachable.isInteractable((Locatable)var23) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[76]];
                        String[] stringArray20 = new String[lIIIIIlIIll[0]];
                        stringArray20[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[77]];
                        TileObjects.getNearest((String[])stringArray20).interact(lIIIIIlIIIl[lIIIIIlIIll[78]]);
                        Time.sleepTicks((int)lIIIIIlIIll[5]);
                        0;
                    }
                }
                String[] stringArray21 = new String[lIIIIIlIIll[0]];
                stringArray21[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[79]];
                if (s.llIlllIllIIlI(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                    String[] stringArray22 = new String[lIIIIIlIIll[0]];
                    stringArray22[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[80]];
                    var29 = TileObjects.getNearest((String[])stringArray22);
                    if (s.llIlllIllIllI(var29)) {
                        if (s.llIlllIllIIlI(Reachable.isInteractable((Locatable)var29) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[81]];
                            String[] stringArray23 = new String[lIIIIIlIIll[0]];
                            stringArray23[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[82]];
                            Inventory.getFirst((String[])stringArray23).useOn(var29);
                            Time.sleepTicks((int)lIIIIIlIIll[5]);
                            0;
                        }
                        if (s.llIlllIllIlII(Reachable.isInteractable((Locatable)var29) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[83]];
                            String[] stringArray24 = new String[lIIIIIlIIll[0]];
                            stringArray24[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[84]];
                            TileObjects.getNearest((String[])stringArray24).interact(lIIIIIlIIIl[lIIIIIlIIll[85]]);
                            Time.sleepTicks((int)lIIIIIlIIll[5]);
                            0;
                        }
                    }
                }
            }
            if (s.llIlllIllIlIl(e.j(cY), lIIIIIlIIll[17])) {
                String[] stringArray = new String[lIIIIIlIIll[0]];
                stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[86]];
                var23 = NPCs.getNearest((String[])stringArray);
                if (s.llIlllIllIllI(var23)) {
                    if (s.llIlllIllIIlI(Reachable.isInteractable((Locatable)var23) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[87]];
                        g.a(lIIIIIlIIIl[lIIIIIlIIll[88]], bQ);
                    }
                    if (s.llIlllIllIlII(Reachable.isInteractable((Locatable)var23) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[89]];
                        String[] stringArray25 = new String[lIIIIIlIIll[0]];
                        stringArray25[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[90]];
                        TileObjects.getNearest((String[])stringArray25).interact(lIIIIIlIIIl[lIIIIIlIIll[91]]);
                        Time.sleepTicks((int)lIIIIIlIIll[5]);
                        0;
                    }
                }
            }
            if (s.llIlllIllIlIl(e.j(cY), lIIIIIlIIll[18])) {
                if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIIIlIIll[3])) {
                    AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[92]];
                    var23 = new WorldArea(lIIIIIlIIll[93], lIIIIIlIIll[94], lIIIIIlIIll[60], lIIIIIlIIll[43], lIIIIIlIIll[1]);
                    if (s.llIlllIllIlII(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        var29 = new WorldArea(lIIIIIlIIll[95], lIIIIIlIIll[96], lIIIIIlIIll[48], lIIIIIlIIll[63], lIIIIIlIIll[1]);
                        if (s.llIlllIllIlII(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));
                            0;
                            Time.sleepTicks((int)lIIIIIlIIll[0]);
                            0;
                        }
                        if (s.llIlllIllIIlI(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));
                                0;
                                Time.sleepTicks((int)lIIIIIlIIll[0]);
                                0;
                            }
                            if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                                String[] stringArray = new String[lIIIIIlIIll[0]];
                                stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[98]];
                                var2 = TileObjects.getNearest((String[])stringArray);
                                if (s.llIlllIllIllI(var2)) {
                                    String[] stringArray26 = new String[lIIIIIlIIll[0]];
                                    stringArray26[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[99]];
                                    if (s.llIlllIllIIlI(var2.hasAction(stringArray26) ? 1 : 0)) {
                                        var2.interact(lIIIIIlIIIl[lIIIIIlIIll[100]]);
                                        Time.sleepTicks((int)lIIIIIlIIll[10]);
                                        0;
                                    }
                                    String[] stringArray27 = new String[lIIIIIlIIll[0]];
                                    stringArray27[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[101]];
                                    if (s.llIlllIllIIlI(var2.hasAction(stringArray27) ? 1 : 0)) {
                                        var2.interact(lIIIIIlIIIl[lIIIIIlIIll[102]]);
                                        Time.sleepTicks((int)lIIIIIlIIll[10]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (s.llIlllIllIIlI(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)dp);
                        0;
                        Time.sleepTicks((int)lIIIIIlIIll[0]);
                        0;
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
                    var23 = new WorldArea(lIIIIIlIIll[93], lIIIIIlIIll[94], lIIIIIlIIll[60], lIIIIIlIIll[43], lIIIIIlIIll[1]);
                    if (s.llIlllIllIlII(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        var29 = new WorldArea(lIIIIIlIIll[95], lIIIIIlIIll[96], lIIIIIlIIll[48], lIIIIIlIIll[63], lIIIIIlIIll[1]);
                        if (s.llIlllIllIlII(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));
                            0;
                            Time.sleepTicks((int)lIIIIIlIIll[0]);
                            0;
                        }
                        if (s.llIlllIllIIlI(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));
                                0;
                                Time.sleepTicks((int)lIIIIIlIIll[0]);
                                0;
                            }
                            if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                                String[] stringArray29 = new String[lIIIIIlIIll[0]];
                                stringArray29[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[112]];
                                var2 = TileObjects.getNearest((String[])stringArray29);
                                if (s.llIlllIllIllI(var2)) {
                                    String[] stringArray30 = new String[lIIIIIlIIll[0]];
                                    stringArray30[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[113]];
                                    if (s.llIlllIllIIlI(var2.hasAction(stringArray30) ? 1 : 0)) {
                                        var2.interact(lIIIIIlIIIl[lIIIIIlIIll[114]]);
                                        Time.sleepTicks((int)lIIIIIlIIll[10]);
                                        0;
                                    }
                                    String[] stringArray31 = new String[lIIIIIlIIll[0]];
                                    stringArray31[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[115]];
                                    if (s.llIlllIllIIlI(var2.hasAction(stringArray31) ? 1 : 0)) {
                                        var2.interact(lIIIIIlIIIl[lIIIIIlIIll[116]]);
                                        Time.sleepTicks((int)lIIIIIlIIll[10]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (s.llIlllIllIIlI(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)dp);
                        0;
                        Time.sleepTicks((int)lIIIIIlIIll[0]);
                        0;
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
                        0;
                    }
                    g.a(lIIIIIlIIIl[lIIIIIlIIll[119]], bQ);
                    g.a(bQ);
                }
            }
            g.a(bQ);
        }
    }

    private static String llIlllIlIIIII(String var17, String var3) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIIIIIlIIll[18]), "DES");
            Cipher var28 = Cipher.getInstance("DES");
            var28.init(lIIIIIlIIll[5], var19);
            return new String(var28.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
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

    private static void llIlllIllIIII() {
        lIIIIIlIIll = new int[186];
        s.lIIIIIlIIll[0] = 1;
        s.lIIIIIlIIll[1] = (5 + 186 - 82 + 92 ^ 38 + 26 - -15 + 92) & (4 + 27 - -131 + 81 ^ 75 + 113 - 107 + 64 ^ -1);
        s.lIIIIIlIIll[2] = 0x1D ^ 0x76;
        s.lIIIIIlIIll[3] = 0x5E ^ 0x65 ^ (0xF ^ 0x31);
        s.lIIIIIlIIll[4] = 0xFFFFDFEE & 0x3399;
        s.lIIIIIlIIll[5] = 2;
        s.lIIIIIlIIll[6] = 0x5A ^ 0x5E;
        s.lIIIIIlIIll[7] = 0xFFFFDFE7 & 0x3F5F;
        s.lIIIIIlIIll[8] = 0xFFFFDF9F & 0x27E5;
        s.lIIIIIlIIll[9] = 0xFFFF9FBB & 0x7F44;
        s.lIIIIIlIIll[10] = 3;
        s.lIIIIIlIIll[11] = -(0xFFFFAEBF & 0x55E5) & (0xFFFFB5F7 & 0x7FFD);
        s.lIIIIIlIIll[12] = -(0xFFFFFFED & 0x7E93) & (0xFFFFFFFB & Short.MAX_VALUE);
        s.lIIIIIlIIll[13] = 0x40 ^ 0x4A;
        s.lIIIIIlIIll[14] = -(0xFFFFFEDF & 0x7BAD) & (0xFFFFFFBF & Short.MAX_VALUE);
        s.lIIIIIlIIll[15] = 0xAD ^ 0x9F;
        s.lIIIIIlIIll[16] = 0x9E ^ 0x9A ^ 2;
        s.lIIIIIlIIll[17] = 5 + 89 - 1 + 78 ^ 60 + 112 - 155 + 155;
        s.lIIIIIlIIll[18] = 0xB0 ^ 0xB8;
        s.lIIIIIlIIll[19] = 0x76 ^ 0x7F;
        s.lIIIIIlIIll[20] = 0x43 ^ 0x66 ^ (0x6F ^ 0x41);
        s.lIIIIIlIIll[21] = 59 + 32 - 16 + 93 ^ 22 + 80 - 45 + 107;
        s.lIIIIIlIIll[22] = 0x15 ^ 0x18;
        s.lIIIIIlIIll[23] = 0xC1 ^ 0x9B ^ (0xA ^ 0x5E);
        s.lIIIIIlIIll[24] = 0xB3 ^ 0xA2 ^ (0xB9 ^ 0xA7);
        s.lIIIIIlIIll[25] = 0xFFFFCF5D & 0x3DEF;
        s.lIIIIIlIIll[26] = -(0xFFFFFA6F & 0x57D5) & (0xFFFFFFF7 & 0x5FFE);
        s.lIIIIIlIIll[27] = 3 ^ (0x7A ^ 0x69);
        s.lIIIIIlIIll[28] = 0x1F ^ 0xE;
        s.lIIIIIlIIll[29] = 0x49 ^ 0x5B;
        s.lIIIIIlIIll[30] = 0x79 ^ 0x5C ^ (0x6E ^ 0x58);
        s.lIIIIIlIIll[31] = 0x48 ^ 0x7E ^ (0x5C ^ 0x7E);
        s.lIIIIIlIIll[32] = 0x6F ^ 0x72 ^ (0x49 ^ 0x41);
        s.lIIIIIlIIll[33] = 0x74 ^ 0x44 ^ (0x87 ^ 0xA1);
        s.lIIIIIlIIll[34] = 40 + 74 - 69 + 105 ^ 84 + 40 - 114 + 119;
        s.lIIIIIlIIll[35] = 0xBD ^ 0xA5;
        s.lIIIIIlIIll[36] = 0xD9 ^ 0xC0;
        s.lIIIIIlIIll[37] = 104 + 55 - 21 + 16 ^ 123 + 39 - 104 + 70;
        s.lIIIIIlIIll[38] = 0x26 ^ 0x3D;
        s.lIIIIIlIIll[39] = 0x80 ^ 0x9C;
        s.lIIIIIlIIll[40] = 0x9F ^ 0xAC ^ (0x20 ^ 0xE);
        s.lIIIIIlIIll[41] = 0x72 ^ 0x6C;
        s.lIIIIIlIIll[42] = 2 + 207 - 35 + 45 ^ 90 + 18 - 70 + 158;
        s.lIIIIIlIIll[43] = 0xA4 ^ 0xB9 ^ (0xF9 ^ 0xC4);
        s.lIIIIIlIIll[44] = (0x33 ^ 0x7F) & ~(0x4C ^ 0) ^ (0x67 ^ 0x46);
        s.lIIIIIlIIll[45] = 0xB9 ^ 0x9B;
        s.lIIIIIlIIll[46] = 0x87 ^ 0xA4;
        s.lIIIIIlIIll[47] = 0x40 ^ 0xE ^ (0xC0 ^ 0xAA);
        s.lIIIIIlIIll[48] = 0xDB ^ 0x92 ^ (0xE3 ^ 0x8F);
        s.lIIIIIlIIll[49] = 106 + 54 - 2 + 73 ^ 172 + 180 - 302 + 143;
        s.lIIIIIlIIll[50] = 0x42 ^ 0x5D ^ (0x1B ^ 0x23);
        s.lIIIIIlIIll[51] = 0x35 ^ 0x7B ^ (8 ^ 0x6E);
        s.lIIIIIlIIll[52] = 0x37 ^ 0x1E;
        s.lIIIIIlIIll[53] = 0xF4 ^ 0xBB ^ (0x22 ^ 0x47);
        s.lIIIIIlIIll[54] = 0xFFFFCDDE & 0x3FBF;
        s.lIIIIIlIIll[55] = 0x6E ^ 0x45;
        s.lIIIIIlIIll[56] = 151 + 114 - 204 + 124 ^ 69 + 25 - 27 + 82;
        s.lIIIIIlIIll[57] = 0x13 ^ 0x3E;
        s.lIIIIIlIIll[58] = 0x7C ^ 0x4C ^ (0x5E ^ 0x40);
        s.lIIIIIlIIll[59] = 0x62 ^ 0x28 ^ (0x52 ^ 0x37);
        s.lIIIIIlIIll[60] = 0xB7 ^ 0x87;
        s.lIIIIIlIIll[61] = 5 ^ 0x34;
        s.lIIIIIlIIll[62] = 0x92 ^ 0xAA ^ (0x6D ^ 0x66);
        s.lIIIIIlIIll[63] = 0x8D ^ 0xC7 ^ (0xB9 ^ 0xC7);
        s.lIIIIIlIIll[64] = 0xB3 ^ 0xC4 ^ (0x15 ^ 0x57);
        s.lIIIIIlIIll[65] = 0xFFFFADFD & 0x5F9F;
        s.lIIIIIlIIll[66] = 0x6E ^ 0x58;
        s.lIIIIIlIIll[67] = 0xFF ^ 0xBF ^ (0xA ^ 0x7D);
        s.lIIIIIlIIll[68] = 0x4B ^ 0x11 ^ (0x1D ^ 0x7F);
        s.lIIIIIlIIll[69] = 0x2E ^ 0x17;
        s.lIIIIIlIIll[70] = 20 + 128 - 103 + 98 ^ 170 + 176 - 322 + 157;
        s.lIIIIIlIIll[71] = 0 + 157 - 12 + 35 ^ 16 + 94 - -23 + 10;
        s.lIIIIIlIIll[72] = 2 ^ (0xB8 ^ 0x86);
        s.lIIIIIlIIll[73] = 0x92 ^ 0xAF;
        s.lIIIIIlIIll[74] = 0x5B ^ 0x29 ^ (0xC1 ^ 0x8D);
        s.lIIIIIlIIll[75] = 0x73 ^ 0x4C;
        s.lIIIIIlIIll[76] = 0xEF ^ 0xAF;
        s.lIIIIIlIIll[77] = 0xDF ^ 0x9E;
        s.lIIIIIlIIll[78] = 0x54 ^ 0x31 ^ (0x53 ^ 0x74);
        s.lIIIIIlIIll[79] = 48 + 16 - -106 + 83 ^ 33 + 167 - 151 + 141;
        s.lIIIIIlIIll[80] = 0xE9 ^ 0x99 ^ (0xBC ^ 0x88);
        s.lIIIIIlIIll[81] = 0xEA ^ 0xC5 ^ (0x22 ^ 0x48);
        s.lIIIIIlIIll[82] = 0xAA ^ 0xA3 ^ (0x34 ^ 0x7B);
        s.lIIIIIlIIll[83] = 0x50 ^ 0x3A ^ (0x57 ^ 0x7A);
        s.lIIIIIlIIll[84] = 113 + 199 - 217 + 147 ^ 133 + 151 - 190 + 92;
        s.lIIIIIlIIll[85] = 0xF2 ^ 0xAA ^ (0x20 ^ 0x31);
        s.lIIIIIlIIll[86] = 0x50 ^ 0x1A;
        s.lIIIIIlIIll[87] = 0x76 ^ 0x3D;
        s.lIIIIIlIIll[88] = 0x8F ^ 0xC3;
        s.lIIIIIlIIll[89] = 52 + 100 - 104 + 95 ^ 37 + 107 - 117 + 167;
        s.lIIIIIlIIll[90] = 0xE6 ^ 0xA8;
        s.lIIIIIlIIll[91] = 232 + 74 - 176 + 116 ^ 76 + 19 - -18 + 72;
        s.lIIIIIlIIll[92] = 0x75 ^ 0x25;
        s.lIIIIIlIIll[93] = 0xFFFFEFC7 & 0x1D7F;
        s.lIIIIIlIIll[94] = -(0xFFFFDF2D & 0x38FB) & (0xFFFFBEBF & Short.MAX_VALUE);
        s.lIIIIIlIIll[95] = -(0xFFFFBAD6 & 0x67AD) & (0xFFFFFFBF & 0x2FFF);
        s.lIIIIIlIIll[96] = 0xFFFFBFDF & 0x4DA6;
        s.lIIIIIlIIll[97] = -(0xFFFF9F9B & 0x726C) & (0xFFFF9FFF & 0x7FB7);
        s.lIIIIIlIIll[98] = 0x11 ^ 0x40;
        s.lIIIIIlIIll[99] = 182 + 149 - 299 + 169 ^ 82 + 7 - 75 + 141;
        s.lIIIIIlIIll[100] = 215 + 72 - 235 + 167 ^ 128 + 107 - 220 + 121;
        s.lIIIIIlIIll[101] = 0x1E ^ 0x4A;
        s.lIIIIIlIIll[102] = 0x1A ^ 0x4F;
        s.lIIIIIlIIll[103] = 0x72 ^ 0x24;
        s.lIIIIIlIIll[104] = 0x44 ^ 0x39 ^ (0x95 ^ 0xBF);
        s.lIIIIIlIIll[105] = 0x54 ^ 0xC;
        s.lIIIIIlIIll[106] = 98 + 165 - 202 + 155 ^ 84 + 55 - 59 + 49;
        s.lIIIIIlIIll[107] = 0x4D ^ 0x17;
        s.lIIIIIlIIll[108] = 0x66 ^ 0x75 ^ (0x53 ^ 0x1B);
        s.lIIIIIlIIll[109] = 153 + 76 - 153 + 130 ^ 69 + 110 - 65 + 32;
        s.lIIIIIlIIll[110] = 0xC ^ 0x56 ^ (0x69 ^ 0x6E);
        s.lIIIIIlIIll[111] = 0x3D ^ 0x63;
        s.lIIIIIlIIll[112] = 2 ^ 0x5D;
        s.lIIIIIlIIll[113] = 0x64 ^ 0x10 ^ (0xB7 ^ 0xA3);
        s.lIIIIIlIIll[114] = 0xF ^ 0x4D ^ (0xAB ^ 0x88);
        s.lIIIIIlIIll[115] = 0x72 ^ 0x78 ^ (0xC2 ^ 0xAA);
        s.lIIIIIlIIll[116] = 0x44 ^ 0x27;
        s.lIIIIIlIIll[117] = 0x38 ^ 0x5C;
        s.lIIIIIlIIll[118] = (0x2A ^ 0x6F) + (0x21 ^ 0x57) - (0x30 ^ 0x7D) + (0x1E ^ 0x35);
        s.lIIIIIlIIll[119] = 0xE7 ^ 0x82;
        s.lIIIIIlIIll[120] = 0xFFFFAFE9 & 0x5DBE;
        s.lIIIIIlIIll[121] = 0xFFFFCFEB & 0x3DBE;
        s.lIIIIIlIIll[122] = 0xFFFF8DA7 & Short.MAX_VALUE;
        s.lIIIIIlIIll[123] = 0xFFFFCFAB & 0x3DFD;
        s.lIIIIIlIIll[124] = -(0xFFFFAA9A & 0x7777) & (0xFFFFFFF7 & 0x2FBF);
        s.lIIIIIlIIll[125] = 0xFFFFFDFF & 0xFAB;
        s.lIIIIIlIIll[126] = -(0xFFFFFAF3 & 0x355F) & (0xFFFFBDF7 & Short.MAX_VALUE);
        s.lIIIIIlIIll[127] = 0xDD ^ 0xBB;
        s.lIIIIIlIIll[128] = 0xA2 ^ 0xC5;
        s.lIIIIIlIIll[129] = 178 + 134 - 184 + 76 ^ 130 + 41 - 142 + 135;
        s.lIIIIIlIIll[130] = 0x4F ^ 0x40 ^ (0x3B ^ 0x5D);
        s.lIIIIIlIIll[131] = 0xFE ^ 0x94;
        s.lIIIIIlIIll[132] = 48 + 147 - 168 + 226 ^ 104 + 96 - 189 + 134;
        s.lIIIIIlIIll[133] = 15 + 161 - -44 + 23 ^ 67 + 116 - 140 + 115;
        s.lIIIIIlIIll[134] = 0x12 ^ 0x7C;
        s.lIIIIIlIIll[135] = 0x66 ^ 0x4F ^ (0x77 ^ 0x31);
        s.lIIIIIlIIll[136] = 0x31 ^ 0x41;
        s.lIIIIIlIIll[137] = 0x61 ^ 0x10;
        s.lIIIIIlIIll[138] = 31 + 175 - 15 + 15 ^ 121 + 72 - 49 + 44;
        s.lIIIIIlIIll[139] = 123 + 171 - 251 + 154 ^ 6 + 108 - 55 + 123;
        s.lIIIIIlIIll[140] = 0xF5 ^ 0x81;
        s.lIIIIIlIIll[141] = 0x6B ^ 0x1E;
        s.lIIIIIlIIll[142] = 0xFFFFAFBE & 0x7369;
        s.lIIIIIlIIll[143] = 0xFFFFE76E & 0x19BD;
        s.lIIIIIlIIll[144] = -(0xFFFFFF19 & 0x10E7) & (0xFFFFBFDE & 0x7EED);
        s.lIIIIIlIIll[145] = 0xFFFFFDBA & 0x63ED;
        s.lIIIIIlIIll[146] = -(0xFFFFBEE3 & 0x655F) & (0xFFFFBFC7 & 0x67FE);
        s.lIIIIIlIIll[147] = 0x72 ^ 0x2C ^ (0x8E ^ 0xA6);
        s.lIIIIIlIIll[148] = 0xC5 ^ 0xB2;
        s.lIIIIIlIIll[149] = -(0x3F ^ 0x15) & (0xFFFF9EFF & 0x6DBF);
        s.lIIIIIlIIll[150] = -(0xFFFFFA73 & 0x77EF) & (0xFFFFFFFB & 0x7FF7);
        s.lIIIIIlIIll[151] = 0xFFFFADEF & 0x5F5F;
        s.lIIIIIlIIll[152] = 0xFFFF9DFF & 0x6FA1;
        s.lIIIIIlIIll[153] = -(0xFFFFF375 & 0x1CCB) & (0xFFFFBFEE & 0x76FF);
        s.lIIIIIlIIll[154] = 0xFFFFFF6D & 0x1FDF;
        s.lIIIIIlIIll[155] = 0xFFFFFB1F & 0x1DF6;
        s.lIIIIIlIIll[156] = -(0xFFFFFF69 & 0x29F) & (0xFFFFEFFF & 0x1F5F);
        s.lIIIIIlIIll[157] = 0xFFFF8FD5 & 0x7D7E;
        s.lIIIIIlIIll[158] = -(0x84 ^ 0xC1) & (0xFFFFDFE5 & 0x2DFE);
        s.lIIIIIlIIll[159] = 0xFFFFCDDF & 0x3F7E;
        s.lIIIIIlIIll[160] = -(0xFFFFDC61 & 0x7B9F) & (0xFFFFFF9F & 0x7EFF);
        s.lIIIIIlIIll[161] = 0xFFFFFDF3 & 0xF7C;
        s.lIIIIIlIIll[162] = -(0xFFFFE97F & 0x5F89) & (0xFFFFFFAF & 0x6FFF);
        s.lIIIIIlIIll[163] = 0xFFFFE73F & 0x19EE;
        s.lIIIIIlIIll[164] = -(0xFFFFE4E5 & 0x7B5F) & (0xFFFFF7FF & 0x6977);
        s.lIIIIIlIIll[165] = 0x9D ^ 0xC0 ^ (0xB9 ^ 0x9C);
        s.lIIIIIlIIll[166] = 0x44 ^ 0x37 ^ (0x96 ^ 0x9C);
        s.lIIIIIlIIll[167] = 0x2C ^ 0x56;
        s.lIIIIIlIIll[168] = 0x3D ^ 0x68 ^ (0xEE ^ 0xC0);
        s.lIIIIIlIIll[169] = 99 + 117 - 199 + 171 ^ 178 + 82 - 171 + 103;
        s.lIIIIIlIIll[170] = 52 + 81 - 126 + 241 ^ 98 + 8 - 67 + 94;
        s.lIIIIIlIIll[171] = 0x3A ^ 0x44;
        s.lIIIIIlIIll[172] = 30 + 73 - 63 + 87;
        s.lIIIIIlIIll[173] = (0x46 ^ 9) + (0xD5 ^ 0xBB) - (0xE8 ^ 0x81) + (0x2B ^ 7);
        s.lIIIIIlIIll[174] = (0x1B ^ 0x5C) + (6 ^ 0x20) - (0x7A ^ 0x1C) + (0 ^ 0x7A);
        s.lIIIIIlIIll[175] = 60 + 95 - 127 + 102;
        s.lIIIIIlIIll[176] = 100 + 19 - -5 + 7;
        s.lIIIIIlIIll[177] = (0xF3 ^ 0x90) + (0x27 ^ 0x75) - (125 + 53 - 114 + 95) + (0x50 ^ 0x3E);
        s.lIIIIIlIIll[178] = 111 + 36 - 22 + 8;
        s.lIIIIIlIIll[179] = (0x75 ^ 8) + (5 ^ 0x7C) - (108 + 11 - 12 + 32) + (0x39 ^ 0x22);
        s.lIIIIIlIIll[180] = 20 + 73 - -11 + 31;
        s.lIIIIIlIIll[181] = (0x83 ^ 0xA0) + (0x29 ^ 9) - (0x12 ^ 6) + (0x7D ^ 0x24);
        s.lIIIIIlIIll[182] = 5 + 115 - 8 + 25;
        s.lIIIIIlIIll[183] = 79 + 24 - 69 + 94 + (121 + 2 - 57 + 70) - (118 + 5 - 111 + 193) + (0x3A ^ 0x75);
        s.lIIIIIlIIll[184] = (0x76 ^ 0x31) + (9 ^ 0x72) - (0x5C ^ 0) + (0xB7 ^ 0x92);
        s.lIIIIIlIIll[185] = (0x47 ^ 0x74) + (0x48 ^ 0x20) - (40 + 115 - 98 + 76) + (0xB0 ^ 0xC6);
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
            void var24;
            AccBuilderTempleTrek.c = lIIIIIlIIIl[lIIIIIlIIll[131]];
            WorldArea worldArea = new WorldArea(lIIIIIlIIll[93], lIIIIIlIIll[94], lIIIIIlIIll[60], lIIIIIlIIll[43], lIIIIIlIIll[1]);
            if (s.llIlllIllIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void var21;
                WorldArea worldArea2 = new WorldArea(lIIIIIlIIll[95], lIIIIIlIIll[96], lIIIIIlIIll[48], lIIIIIlIIll[63], lIIIIIlIIll[1]);
                if (s.llIlllIllIlII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));
                    0;
                    Time.sleepTicks((int)lIIIIIlIIll[0]);
                    0;
                }
                if (s.llIlllIllIIlI(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (s.llIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1]));
                        0;
                        Time.sleepTicks((int)lIIIIIlIIll[0]);
                        0;
                    }
                    if (s.llIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIlIIll[25], lIIIIIlIIll[97], lIIIIIlIIll[1])), lIIIIIlIIll[3])) {
                        String[] stringArray = new String[lIIIIIlIIll[0]];
                        stringArray[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[2]];
                        TileObject var16 = TileObjects.getNearest((String[])stringArray);
                        if (s.llIlllIllIllI(var16)) {
                            String[] stringArray2 = new String[lIIIIIlIIll[0]];
                            stringArray2[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[132]];
                            if (s.llIlllIllIIlI(var16.hasAction(stringArray2) ? 1 : 0)) {
                                var16.interact(lIIIIIlIIIl[lIIIIIlIIll[133]]);
                                Time.sleepTicks((int)lIIIIIlIIll[10]);
                                0;
                            }
                            String[] stringArray3 = new String[lIIIIIlIIll[0]];
                            stringArray3[s.lIIIIIlIIll[1]] = lIIIIIlIIIl[lIIIIIlIIll[134]];
                            if (s.llIlllIllIIlI(var16.hasAction(stringArray3) ? 1 : 0)) {
                                var16.interact(lIIIIIlIIIl[lIIIIIlIIll[135]]);
                                Time.sleepTicks((int)lIIIIIlIIll[10]);
                                0;
                            }
                        }
                    }
                }
            }
            if (s.llIlllIllIIlI(var24.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)dp);
                0;
                Time.sleepTicks((int)lIIIIIlIIll[0]);
                0;
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
                        0;
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

