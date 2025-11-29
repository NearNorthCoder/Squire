/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
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
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

public class w
implements M {
    public static final /* synthetic */ WorldPoint fL;
    public static final /* synthetic */ WorldPoint fO;
    public static /* synthetic */ boolean by;
    private static /* synthetic */ String[] lIIlIIIIIlIIl;
    public static final /* synthetic */ WorldPoint fM;
    public static final /* synthetic */ WorldPoint fN;
    private static /* synthetic */ int[] lIIlIIIIlIlll;
    static /* synthetic */ boolean fP;
    public static /* synthetic */ String[] bW;
    public static /* synthetic */ List<d> bA;
    static /* synthetic */ int co;
    static /* synthetic */ boolean fQ;
    static /* synthetic */ boolean fR;
    static /* synthetic */ boolean cp;
    static /* synthetic */ boolean fS;

    /*
     * WARNING - void declaration
     */
    private static void br() {
        void var18;
        BankLocation bankLocation = BankLocation.getNearest();
        if (w.lIlIIlllllllllI(bankLocation) && w.lIlIIlllllllIlI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[303]];
            Movement.walkTo((BankLocation)bankLocation);
            0;
            Time.sleepTicks((int)lIIlIIIIlIlll[2]);
            0;
        }
        if (w.lIlIIlllllllllI(var18) && w.lIlIIlllllllIII(var18.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[304]];
            if (w.lIlIIlllllllIlI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIlIlll[18]);
                0;
            }
            if (w.lIlIIlllllllIII(Bank.isOpen() ? 1 : 0)) {
                if (w.lIlIIllllllllII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIlIIIIlIlll[9]);
                    0;
                }
                a.a(lIIlIIIIlIlll[19], lIIlIIIIlIlll[11]);
                a.a(lIIlIIIIlIlll[22], lIIlIIIIlIlll[11]);
                a.a(lIIlIIIIlIlll[21], lIIlIIIIlIlll[11]);
                a.b(f.ba, lIIlIIIIlIlll[11]);
                a.a(lIIlIIIIlIlll[35], lIIlIIIIlIlll[11]);
                a.a(lIIlIIIIlIlll[45], lIIlIIIIlIlll[1]);
                a.a(lIIlIIIIlIlll[27], lIIlIIIIlIlll[7]);
                a.a(lIIlIIIIlIlll[34], lIIlIIIIlIlll[1]);
                a.a(lIIlIIIIlIlll[24], lIIlIIIIlIlll[25]);
                a.a(lIIlIIIIlIlll[305], lIIlIIIIlIlll[1]);
                a.a(lIIlIIIIlIlll[46], lIIlIIIIlIlll[47]);
                int[] nArray = new int[lIIlIIIIlIlll[1]];
                nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                if (w.lIlIIlllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIlIIIIlIlll[1]];
                    nArray2[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                    if (w.lIlIIlllllllIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        Bank.withdraw((int)lIIlIIIIlIlll[36], (int)lIIlIIIIlIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    }
                }
            }
        }
    }

    private static boolean lIlIIllllllllll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void bs() {
        void var29;
        BankLocation bankLocation = BankLocation.getNearest();
        if (w.lIlIIlllllllllI(bankLocation) && w.lIlIIlllllllIlI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[306]];
            Movement.walkTo((BankLocation)bankLocation);
            0;
            Time.sleepTicks((int)lIIlIIIIlIlll[2]);
            0;
        }
        if (w.lIlIIlllllllllI(var29) && w.lIlIIlllllllIII(var29.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[307]];
            if (w.lIlIIlllllllIlI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIlIlll[18]);
                0;
            }
            if (w.lIlIIlllllllIII(Bank.isOpen() ? 1 : 0)) {
                if (w.lIlIIllllllllII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIlIIIIlIlll[9]);
                    0;
                }
                a.a(lIIlIIIIlIlll[19], lIIlIIIIlIlll[11]);
                a.a(lIIlIIIIlIlll[22], lIIlIIIIlIlll[11]);
                a.a(lIIlIIIIlIlll[21], lIIlIIIIlIlll[11]);
                a.b(f.ba, lIIlIIIIlIlll[2]);
                a.a(lIIlIIIIlIlll[45], lIIlIIIIlIlll[7]);
                a.a(lIIlIIIIlIlll[33], lIIlIIIIlIlll[1]);
                a.a(lIIlIIIIlIlll[32], lIIlIIIIlIlll[1]);
                a.a(lIIlIIIIlIlll[30], lIIlIIIIlIlll[1]);
                a.a(lIIlIIIIlIlll[31], lIIlIIIIlIlll[1]);
                a.a(lIIlIIIIlIlll[46], lIIlIIIIlIlll[47]);
                Bank.withdraw((String)lIIlIIIIIlIIl[lIIlIIIIlIlll[308]], (int)lIIlIIIIlIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                int[] nArray = new int[lIIlIIIIlIlll[1]];
                nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                if (w.lIlIIlllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIlIIIIlIlll[1]];
                    nArray2[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                    if (w.lIlIIlllllllIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        Bank.withdraw((int)lIIlIIIIlIlll[36], (int)lIIlIIIIlIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    }
                }
                a.a(lIIlIIIIlIlll[35], Inventory.getFreeSlots());
            }
        }
    }

    private static void lIlIIllllllIlIl() {
        lIIlIIIIIlIIl = new String[lIIlIIIIlIlll[365]];
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[0]] = w."Buying items";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[1]] = w."Finished buying items, switching back to quest";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[2]] = w."Crandor map";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[7]] = w."Drink";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[9]] = w."Drink";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[11]] = w."Shark";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[12]] = w."Shark";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[13]] = w."Eat";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[16]] = w."Nav to bank";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[17]] = w."Handling banking";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[23]] = w."We are missing teleports, switching to BUYING";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[26]] = w."We are missing steel nails, switching to BUYING";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[28]] = w."We are missing planks, switching to BUYING";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[38]] = w."We are missing quest supplies, switching to BUYING";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[40]] = w."Nav to champ guild";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[20]] = w."Talking";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[43]] = w."Guildmaster";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[29]] = w."Nav to oziach";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[50]] = w."Oziach";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[51]] = w."Rune scimitar";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[10]] = w."Wield";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[52]] = w."Wear";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[53]] = w."Wear";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[55]] = w."Maze key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[8]] = w."Nav to champ guild";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[56]] = w."Eat";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[57]] = w."Talking";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[58]] = w."Guildmaster";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[60]] = w."Where can I find the right ship?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[61]] = w."I talked to Oziach...";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[63]] = w."How can I protect myself from the dragon's breath?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[65]] = w."Maze key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[15]] = w."How can I find the route to Crandor?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[66]] = w."Where is Melzar's map piece?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[68]] = w."How can I find the route to Crandor?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[69]] = w."Where is Thalzar's map piece?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[70]] = w."How can I find the route to Crandor?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[71]] = w."Where is Lozar's map piece?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[74]] = w."Maze key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[77]] = w."Oracle";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[78]] = w."Nav to oracle";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[79]] = w."Oracle";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[80]] = w."Oracle";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[82]] = w."Lobster pot";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[84]] = w."Lobster pot";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[87]] = w."Nav to magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[88]] = w."Handling magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[89]] = w."Silk";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[90]] = w."Silk";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[91]] = w."Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[6]] = w."Lobster pot";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[92]] = w."Lobster pot";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[93]] = w."Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[94]] = w."Unfired bowl";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[95]] = w."Unfired bowl";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[96]] = w."Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[97]] = w."Wizard's mind bomb";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[98]] = w."Wizard's mind bomb";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[99]] = w."Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[100]] = w."Silk";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[101]] = w."Silk";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[102]] = w."Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[103]] = w."Lobster pot";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[104]] = w."Lobster pot";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[105]] = w."Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[106]] = w."Unfired bowl";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[107]] = w."Unfired bowl";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[108]] = w."Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[109]] = w."Wizard's mind bomb";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[110]] = w."Wizard's mind bomb";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[111]] = w."Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[112]] = w."Chest";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[113]] = w."Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[114]] = w."Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[115]] = w."Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[116]] = w."Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[117]] = w."Search";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[118]] = w."Search";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[119]] = w."Silk";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[120]] = w."Silk";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[121]] = w."Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[122]] = w."Lobster pot";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[123]] = w."Lobster pot";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[124]] = w."Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[125]] = w."Unfired bowl";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[126]] = w."Unfired bowl";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[127]] = w."Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[128]] = w."Wizard's mind bomb";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[129]] = w."Wizard's mind bomb";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[130]] = w."Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[25]] = w."Chest";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[131]] = w."Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[132]] = w."Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[133]] = w."Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[134]] = w."Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[135]] = w."Search";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[136]] = w."Search";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[137]] = w."Break";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[140]] = w."Nav to wormbrain";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[141]] = w."Can I journey on this ship?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[142]] = w."Search away, I have nothing to hide.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[143]] = w."Ok.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[144]] = w."Talking";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[145]] = w."Wormbrain";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[146]] = w."Beer glass";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[147]] = w."Beer glass";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[148]] = w."Drop";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[155]] = w."Nav to maze";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[156]] = w."Door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[157]] = w."Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[165]] = w."Getting key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[167]] = w."Attack";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[168]] = w."Take";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[171]] = w."Nav to red door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[172]] = w."Red door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[173]] = w."Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[174]] = w."Go up";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[175]] = w."Climb-up";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[179]] = w."Getting key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[181]] = w."Attack";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[182]] = w."Take";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[185]] = w."Nav to orange door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[186]] = w."Orange door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[187]] = w."Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[188]] = w."Climb-up";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[190]] = w."Getting key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[192]] = w."Attack";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[193]] = w."Take";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[195]] = w."Nav to yellow door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[196]] = w."Yellow door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[197]] = w."Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[198]] = w."Climb-down";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[201]] = w."Climb-down";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[202]] = w."Climb-down";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[208]] = w."Getting blue key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[210]] = w."Attack";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[211]] = w."Take";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[213]] = w."Nav to blue door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[214]] = w."Blue door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[215]] = w."Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[217]] = w."Getting key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[219]] = w."Attack";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[220]] = w."Take";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[223]] = w."Nav to magneta door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[224]] = w."Magenta door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[225]] = w."Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[226]] = w."Lesser demon";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[228]] = w."Attack";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[229]] = w."Take";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[231]] = w."Nav to green door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[232]] = w."Green door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[233]] = w."Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[234]] = w."Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[235]] = w."Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[236]] = w."Search";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[237]] = w."Search";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[238]] = w."Plank";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[239]] = w."Plank";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[240]] = w."Nav to boat";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[241]] = w."Customs officer";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[242]] = w."Can I journey on this ship?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[243]] = w."Search away, I have nothing to hide.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[244]] = w."Ok.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[245]] = w."Klarense";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[246]] = w."Cabin boy Jenkins";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[247]] = w."Boarding boat";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[248]] = w."Gangplank";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[249]] = w."Cross";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[250]] = w."Reparing hole";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[251]] = w."Hole";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[252]] = w."Repair";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[253]] = w."Ladder";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[254]] = w."Climb-down";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[255]] = w."Hiring ned";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[256]] = w."Ned";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[257]] = w."Draynor Village";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[14]] = w."Ned";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[72]] = w."Captain Ned";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[260]] = w."Nav to boat";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[261]] = w."Customs officer";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[262]] = w."Can I journey on this ship?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[263]] = w."Search away, I have nothing to hide.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[264]] = w."Ok.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[265]] = w."Gangplank";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[266]] = w."Cross";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[267]] = w."Captain Ned";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[268]] = w."Captain Ned";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[272]] = w."Nav to entrance";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[273]] = w."Hole";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[274]] = w."Enter";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[275]] = w."Elvarg";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[277]] = w."Nav to fight";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[278]] = w."Nav to fight";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[279]] = w."Shark";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[280]] = w."Shark";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[281]] = w."Eat";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[282]] = w."Wall";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[283]] = w."Climb-over";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[284]] = w."Elvarg boss fight";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[285]] = w."Vial";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[286]] = w."Vial";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[287]] = w."Drop";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[288]] = w."Shark";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[289]] = w."Drop";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[290]] = w."Drink";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[292]] = w."Drink";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[293]] = w."Attack";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[295]] = w."Nav to oziach";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[296]] = w."Oziach";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[297]] = w."Wear";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[298]] = w."Crandor map";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[299]] = w."Oziach";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[300]] = w."Break";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[301]] = w."Nav to bank";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[302]] = w."Handling banking";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[303]] = w."Nav to bank";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[304]] = w."Handling banking";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[306]] = w."Nav to bank";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[307]] = w."Handling banking";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[308]] = w."Maze key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[315]] = w."Dragon slayer 1 quest";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[316]] = w."ring of wealth (";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[317]] = w."Antifire";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[318]] = w."Antifire";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[319]] = w."combat";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[320]] = w."combat";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[321]] = w."Antifire";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[322]] = w."Antifire";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[323]] = w."glory";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[324]] = w."Chest";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[325]] = w."Zombie";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[326]] = w."Ladder";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[327]] = w."Climb-down";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[328]] = w."Ladder";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[329]] = w."Climb-down";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[330]] = w."Ladder";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[331]] = w."Skeleton";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[332]] = w."Ladder";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[333]] = w."Ghost";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[334]] = w."Ladder";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[335]] = w."wealth";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[336]] = w."wealth";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[337]] = w."wealth";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[338]] = w."glory";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[339]] = w."glory";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[340]] = w."glory";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[349]] = w."Can I have a quest?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[350]] = w."Yes.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[351]] = w."Can you sell me a rune platebody?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[352]] = w."The Guildmaster of the Champions' Guild told me.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[353]] = w."I thought you were going to give me a quest.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[354]] = w."A dragon, that sounds like fun.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[355]] = w."I talked to Oziach...";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[356]] = w."Where can I find the right ship?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[357]] = w."I seek a piece of the map to the island of Crandor.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[358]] = w."I believe you've got a piece of map that I need.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[359]] = w."I suppose I could pay you for the map piece...";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[360]] = w."Alright then, 10,000 it is.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[361]] = w."I'd like to buy her.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[362]] = w."Yep, sounds good.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[363]] = w."You're a sailor? Could you take me to Crandor?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[364]] = w."Yes, let's go!";
    }

    static {
        w.lIlIIllllllIllI();
        w.lIlIIllllllIlIl();
        fL = new WorldPoint(lIIlIIIIlIlll[341], lIIlIIIIlIlll[342], lIIlIIIIlIlll[0]);
        fM = new WorldPoint(lIIlIIIIlIlll[343], lIIlIIIIlIlll[344], lIIlIIIIlIlll[0]);
        fN = new WorldPoint(lIIlIIIIlIlll[345], lIIlIIIIlIlll[346], lIIlIIIIlIlll[1]);
        fO = new WorldPoint(lIIlIIIIlIlll[347], lIIlIIIIlIlll[348], lIIlIIIIlIlll[0]);
        bA = new ArrayList<d>();
        String[] stringArray = new String[lIIlIIIIlIlll[43]];
        stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[349]];
        stringArray[w.lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[350]];
        stringArray[w.lIIlIIIIlIlll[2]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[351]];
        stringArray[w.lIIlIIIIlIlll[7]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[352]];
        stringArray[w.lIIlIIIIlIlll[9]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[353]];
        stringArray[w.lIIlIIIIlIlll[11]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[354]];
        stringArray[w.lIIlIIIIlIlll[12]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[355]];
        stringArray[w.lIIlIIIIlIlll[13]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[356]];
        stringArray[w.lIIlIIIIlIlll[16]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[357]];
        stringArray[w.lIIlIIIIlIlll[17]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[358]];
        stringArray[w.lIIlIIIIlIlll[23]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[359]];
        stringArray[w.lIIlIIIIlIlll[26]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[360]];
        stringArray[w.lIIlIIIIlIlll[28]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[361]];
        stringArray[w.lIIlIIIIlIlll[38]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[362]];
        stringArray[w.lIIlIIIIlIlll[40]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[363]];
        stringArray[w.lIIlIIIIlIlll[20]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[364]];
        bW = stringArray;
    }

    private static void W() {
        block50: {
            d var15;
            block49: {
                block48: {
                    block47: {
                        block46: {
                            block45: {
                                Object var21;
                                block44: {
                                    block43: {
                                        block42: {
                                            block41: {
                                                block40: {
                                                    block39: {
                                                        block38: {
                                                            block37: {
                                                                block36: {
                                                                    block35: {
                                                                        int[] nArray = new int[lIIlIIIIlIlll[1]];
                                                                        nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[27];
                                                                        if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block35;
                                                                        int[] nArray2 = new int[lIIlIIIIlIlll[1]];
                                                                        nArray2[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[27];
                                                                        if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray2) ? 1 : 0)) break block36;
                                                                        int[] nArray3 = new int[lIIlIIIIlIlll[1]];
                                                                        nArray3[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[27];
                                                                        if (!w.lIlIIlllllllIIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIlIIIIlIlll[7])) break block36;
                                                                    }
                                                                    var21 = new d(lIIlIIIIlIlll[27], lIIlIIIIlIlll[7], lIIlIIIIlIlll[309]);
                                                                    bA.add((d)var21);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[lIIlIIIIlIlll[1]];
                                                                nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[35];
                                                                if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block37;
                                                                int[] nArray4 = new int[lIIlIIIIlIlll[1]];
                                                                nArray4[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[35];
                                                                if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray4) ? 1 : 0)) break block38;
                                                                int[] nArray5 = new int[lIIlIIIIlIlll[1]];
                                                                nArray5[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[35];
                                                                if (!w.lIlIIlllllllIIl(Bank.getFirst((int[])nArray5).getQuantity(), lIIlIIIIlIlll[63])) break block38;
                                                            }
                                                            var21 = new d(lIIlIIIIlIlll[35], lIIlIIIIlIlll[63], lIIlIIIIlIlll[309]);
                                                            bA.add((d)var21);
                                                            0;
                                                        }
                                                        int[] nArray = new int[lIIlIIIIlIlll[1]];
                                                        nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[39];
                                                        if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                            var21 = new d(lIIlIIIIlIlll[39], lIIlIIIIlIlll[1], lIIlIIIIlIlll[310]);
                                                            bA.add((d)var21);
                                                            0;
                                                        }
                                                        int[] nArray6 = new int[lIIlIIIIlIlll[1]];
                                                        nArray6[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[41];
                                                        if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                                            var21 = new d(lIIlIIIIlIlll[41], lIIlIIIIlIlll[1], lIIlIIIIlIlll[311]);
                                                            bA.add((d)var21);
                                                            0;
                                                        }
                                                        int[] nArray7 = new int[lIIlIIIIlIlll[1]];
                                                        nArray7[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[44];
                                                        if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                            var21 = new d(lIIlIIIIlIlll[44], lIIlIIIIlIlll[1], lIIlIIIIlIlll[312]);
                                                            bA.add((d)var21);
                                                            0;
                                                        }
                                                        int[] nArray8 = new int[lIIlIIIIlIlll[1]];
                                                        nArray8[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[42];
                                                        if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                            var21 = new d(lIIlIIIIlIlll[42], lIIlIIIIlIlll[7], lIIlIIIIlIlll[310]);
                                                            bA.add((d)var21);
                                                            0;
                                                        }
                                                        int[] nArray9 = new int[lIIlIIIIlIlll[1]];
                                                        nArray9[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[24];
                                                        if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray9) ? 1 : 0)) break block39;
                                                        int[] nArray10 = new int[lIIlIIIIlIlll[1]];
                                                        nArray10[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[24];
                                                        if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray10) ? 1 : 0)) break block40;
                                                        int[] nArray11 = new int[lIIlIIIIlIlll[1]];
                                                        nArray11[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[24];
                                                        if (!w.lIlIIlllllllIIl(Bank.getFirst((int[])nArray11).getQuantity(), lIIlIIIIlIlll[25])) break block40;
                                                    }
                                                    var21 = new d(lIIlIIIIlIlll[24], lIIlIIIIlIlll[25], lIIlIIIIlIlll[309]);
                                                    bA.add((d)var21);
                                                    0;
                                                }
                                                int[] nArray = new int[lIIlIIIIlIlll[1]];
                                                nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                                                if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    var21 = new d(lIIlIIIIlIlll[36], lIIlIIIIlIlll[1], h.bv);
                                                    bA.add((d)var21);
                                                    0;
                                                }
                                                int[] nArray12 = new int[lIIlIIIIlIlll[1]];
                                                nArray12[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[34];
                                                if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                                    var21 = new d(lIIlIIIIlIlll[34], lIIlIIIIlIlll[1], h.bv);
                                                    bA.add((d)var21);
                                                    0;
                                                }
                                                int[] nArray13 = new int[lIIlIIIIlIlll[1]];
                                                nArray13[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[33];
                                                if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                                    var21 = new d(lIIlIIIIlIlll[33], lIIlIIIIlIlll[1], h.bv);
                                                    bA.add((d)var21);
                                                    0;
                                                }
                                                int[] nArray14 = new int[lIIlIIIIlIlll[1]];
                                                nArray14[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[32];
                                                if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                                    var21 = new d(lIIlIIIIlIlll[32], lIIlIIIIlIlll[1], h.bv);
                                                    bA.add((d)var21);
                                                    0;
                                                }
                                                int[] nArray15 = new int[lIIlIIIIlIlll[1]];
                                                nArray15[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[30];
                                                if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray15) ? 1 : 0)) {
                                                    var21 = new d(lIIlIIIIlIlll[30], lIIlIIIIlIlll[1], h.bv);
                                                    bA.add((d)var21);
                                                    0;
                                                }
                                                int[] nArray16 = new int[lIIlIIIIlIlll[1]];
                                                nArray16[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[31];
                                                if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                                    var21 = new d(lIIlIIIIlIlll[31], lIIlIIIIlIlll[1], h.bv);
                                                    bA.add((d)var21);
                                                    0;
                                                }
                                                int[] nArray17 = new int[lIIlIIIIlIlll[1]];
                                                nArray17[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[37];
                                                if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray17) ? 1 : 0)) break block41;
                                                int[] nArray18 = new int[lIIlIIIIlIlll[1]];
                                                nArray18[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[37];
                                                if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray18) ? 1 : 0)) break block42;
                                                int[] nArray19 = new int[lIIlIIIIlIlll[1]];
                                                nArray19[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[37];
                                                if (!w.lIlIIlllllllIIl(Bank.getFirst((int[])nArray19).getQuantity(), lIIlIIIIlIlll[23])) break block42;
                                            }
                                            var21 = new d(lIIlIIIIlIlll[37], lIIlIIIIlIlll[23], h.bv);
                                            bA.add((d)var21);
                                            0;
                                        }
                                        int[] nArray = new int[lIIlIIIIlIlll[1]];
                                        nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[45];
                                        if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block43;
                                        int[] nArray20 = new int[lIIlIIIIlIlll[1]];
                                        nArray20[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[45];
                                        if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray20) ? 1 : 0)) break block44;
                                        int[] nArray21 = new int[lIIlIIIIlIlll[1]];
                                        nArray21[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[45];
                                        if (!w.lIlIIlllllllIIl(Bank.getFirst((int[])nArray21).getQuantity(), lIIlIIIIlIlll[23])) break block44;
                                    }
                                    var21 = new d(lIIlIIIIlIlll[45], lIIlIIIIlIlll[23], lIIlIIIIlIlll[47]);
                                    bA.add((d)var21);
                                    0;
                                }
                                if (w.lIlIIlllllllIlI(Bank.contains((Predicate)(var21 = item -> item.getName().toLowerCase().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[316]]))) ? 1 : 0)) {
                                    var15 = new d(lIIlIIIIlIlll[313], lIIlIIIIlIlll[11], lIIlIIIIlIlll[311]);
                                    bA.add(var15);
                                    0;
                                }
                                int[] nArray = new int[lIIlIIIIlIlll[1]];
                                nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                                if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                                int[] nArray22 = new int[lIIlIIIIlIlll[1]];
                                nArray22[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                                if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray22) ? 1 : 0)) break block46;
                                int[] nArray23 = new int[lIIlIIIIlIlll[1]];
                                nArray23[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                                if (!w.lIlIIlllllllIIl(Bank.getFirst((int[])nArray23).getQuantity(), lIIlIIIIlIlll[20])) break block46;
                            }
                            var15 = new d(lIIlIIIIlIlll[19], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]);
                            bA.add(var15);
                            0;
                        }
                        int[] nArray = new int[lIIlIIIIlIlll[1]];
                        nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[22];
                        if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block47;
                        int[] nArray24 = new int[lIIlIIIIlIlll[1]];
                        nArray24[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[22];
                        if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray24) ? 1 : 0)) break block48;
                        int[] nArray25 = new int[lIIlIIIIlIlll[1]];
                        nArray25[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[22];
                        if (!w.lIlIIlllllllIIl(Bank.getFirst((int[])nArray25).getQuantity(), lIIlIIIIlIlll[20])) break block48;
                    }
                    var15 = new d(lIIlIIIIlIlll[22], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]);
                    bA.add(var15);
                    0;
                }
                int[] nArray = new int[lIIlIIIIlIlll[1]];
                nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block49;
                int[] nArray26 = new int[lIIlIIIIlIlll[1]];
                nArray26[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray26) ? 1 : 0)) break block50;
                int[] nArray27 = new int[lIIlIIIIlIlll[1]];
                nArray27[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                if (!w.lIlIIlllllllIIl(Bank.getFirst((int[])nArray27).getQuantity(), lIIlIIIIlIlll[20])) break block50;
            }
            var15 = new d(lIIlIIIIlIlll[21], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]);
            bA.add(var15);
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void bq() {
        void var2;
        BankLocation bankLocation = BankLocation.getNearest();
        if (w.lIlIIlllllllllI(bankLocation) && w.lIlIIlllllllIlI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[301]];
            Movement.walkTo((BankLocation)bankLocation);
            0;
            Time.sleepTicks((int)lIIlIIIIlIlll[2]);
            0;
        }
        if (w.lIlIIlllllllllI(var2) && w.lIlIIlllllllIII(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[302]];
            if (w.lIlIIlllllllIlI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIlIlll[18]);
                0;
            }
            if (w.lIlIIlllllllIII(Bank.isOpen() ? 1 : 0)) {
                if (w.lIlIIllllllllII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIlIIIIlIlll[9]);
                    0;
                }
                a.a(lIIlIIIIlIlll[19], lIIlIIIIlIlll[11]);
                a.b(f.ba, lIIlIIIIlIlll[2]);
                a.a(lIIlIIIIlIlll[45], lIIlIIIIlIlll[9]);
                a.a(lIIlIIIIlIlll[41], lIIlIIIIlIlll[1]);
                a.a(lIIlIIIIlIlll[39], lIIlIIIIlIlll[1]);
                a.a(lIIlIIIIlIlll[46], lIIlIIIIlIlll[47]);
                int[] nArray = new int[lIIlIIIIlIlll[1]];
                nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                if (w.lIlIIlllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIlIIIIlIlll[1]];
                    nArray2[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                    if (w.lIlIIlllllllIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        Bank.withdraw((int)lIIlIIIIlIlll[36], (int)lIIlIIIIlIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    }
                }
                Bank.withdraw((int)lIIlIIIIlIlll[35], (int)(Inventory.getFreeSlots() - lIIlIIIIlIlll[1]), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            }
        }
    }

    private static boolean lIlIIlllllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static void bp() {
        block211: {
            WorldPoint var20;
            WorldPoint var12;
            BankLocation var37;
            block217: {
                block219: {
                    block221: {
                        block220: {
                            block218: {
                                block212: {
                                    block216: {
                                        block214: {
                                            block215: {
                                                block213: {
                                                    if (w.lIlIIlllllllIII(by ? 1 : 0)) {
                                                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[0]];
                                                        b.a(bA);
                                                        if (w.lIlIIlllllllIIl(bA.size(), lIIlIIIIlIlll[1])) {
                                                            System.out.println(lIIlIIIIIlIIl[lIIlIIIIlIlll[1]]);
                                                            by = lIIlIIIIlIlll[0];
                                                        }
                                                    }
                                                    if (!w.lIlIIlllllllIlI(by ? 1 : 0)) break block211;
                                                    String[] stringArray = new String[lIIlIIIIlIlll[1]];
                                                    stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[2]];
                                                    if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        fS = lIIlIIIIlIlll[1];
                                                        fR = lIIlIIIIlIlll[1];
                                                        fP = lIIlIIIIlIlll[1];
                                                        fQ = lIIlIIIIlIlll[1];
                                                    }
                                                    int[] nArray = new int[lIIlIIIIlIlll[1]];
                                                    nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[3];
                                                    if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                        fR = lIIlIIIIlIlll[1];
                                                    }
                                                    int[] nArray2 = new int[lIIlIIIIlIlll[1]];
                                                    nArray2[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[4];
                                                    if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                                        fP = lIIlIIIIlIlll[1];
                                                    }
                                                    int[] nArray3 = new int[lIIlIIIIlIlll[1]];
                                                    nArray3[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[5];
                                                    if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                                        fQ = lIIlIIIIlIlll[1];
                                                    }
                                                    if (w.lIlIIlllllllIII(Inventory.contains((int[])f.ba) ? 1 : 0) && w.lIlIIlllllllIIl(Movement.getRunEnergy(), lIIlIIIIlIlll[6])) {
                                                        Inventory.getFirst((int[])f.ba).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[7]]);
                                                        Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                                                        0;
                                                    }
                                                    if (w.lIlIIlllllllIII(Inventory.contains((int[])f.aX) ? 1 : 0) && w.lIlIIlllllllIIl(Prayers.getPoints(), lIIlIIIIlIlll[8])) {
                                                        Inventory.getFirst((int[])f.aX).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[9]]);
                                                    }
                                                    if (!w.lIlIIlllllllIIl(Combat.getMissingHealth(), lIIlIIIIlIlll[10]) || w.lIlIIlllllllIll(w.lIlIIllllllIlll(e.v(), 51.0))) {
                                                        String[] stringArray2 = new String[lIIlIIIIlIlll[1]];
                                                        stringArray2[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[11]];
                                                        if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                                                            String[] stringArray3 = new String[lIIlIIIIlIlll[1]];
                                                            stringArray3[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[12]];
                                                            Inventory.getFirst((String[])stringArray3).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[13]]);
                                                        }
                                                    }
                                                    if (w.lIlIIlllllllIlI(Movement.isRunEnabled() ? 1 : 0) && w.lIlIIllllllllII(Movement.getRunEnergy())) {
                                                        Movement.toggleRun();
                                                    }
                                                    if (!w.lIlIIlllllllIlI(w.S() ? 1 : 0) || !w.lIlIIlllllllIIl(e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[2]) || !w.lIlIIllllllllIl(e.I(), lIIlIIIIlIlll[15])) break block212;
                                                    var37 = BankLocation.getNearest();
                                                    if (w.lIlIIlllllllllI(var37) && w.lIlIIlllllllIlI(var37.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[16]];
                                                        Movement.walkTo((BankLocation)var37);
                                                        0;
                                                        Time.sleepTicks((int)lIIlIIIIlIlll[2]);
                                                        0;
                                                    }
                                                    if (!w.lIlIIlllllllllI(var37) || !w.lIlIIlllllllIII(var37.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block212;
                                                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[17]];
                                                    if (w.lIlIIlllllllIlI(Bank.isOpen() ? 1 : 0)) {
                                                        a.a();
                                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIlIlll[18]);
                                                        0;
                                                    }
                                                    if (!w.lIlIIlllllllIII(Bank.isOpen() ? 1 : 0)) break block212;
                                                    if (w.lIlIIllllllllII(Inventory.getAll().size())) {
                                                        Bank.depositInventory();
                                                        Time.sleepTicks((int)lIIlIIIIlIlll[9]);
                                                        0;
                                                    }
                                                    if (w.lIlIIllllllllII(Equipment.getAll().size())) {
                                                        Bank.depositEquipment();
                                                        Time.sleepTicks((int)lIIlIIIIlIlll[2]);
                                                        0;
                                                    }
                                                    int[] nArray4 = new int[lIIlIIIIlIlll[1]];
                                                    nArray4[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                                                    if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray4) ? 1 : 0)) break block213;
                                                    int[] nArray5 = new int[lIIlIIIIlIlll[1]];
                                                    nArray5[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                                                    if (!w.lIlIIllllllllIl(Bank.getFirst((int[])nArray5).getQuantity(), lIIlIIIIlIlll[20])) break block214;
                                                }
                                                int[] nArray = new int[lIIlIIIIlIlll[1]];
                                                nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                                                if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block215;
                                                int[] nArray6 = new int[lIIlIIIIlIlll[1]];
                                                nArray6[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                                                if (!w.lIlIIllllllllIl(Bank.getFirst((int[])nArray6).getQuantity(), lIIlIIIIlIlll[20])) break block214;
                                            }
                                            int[] nArray = new int[lIIlIIIIlIlll[1]];
                                            nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[22];
                                            if (!w.lIlIIlllllllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block216;
                                            int[] nArray7 = new int[lIIlIIIIlIlll[1]];
                                            nArray7[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[22];
                                            if (!w.lIlIIlllllllIIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIlIIIIlIlll[20])) break block216;
                                        }
                                        w.W();
                                        System.out.println(lIIlIIIIIlIIl[lIIlIIIIlIlll[23]]);
                                        by = lIIlIIIIlIlll[1];
                                        return;
                                    }
                                    int[] nArray = new int[lIIlIIIIlIlll[1]];
                                    nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[24];
                                    if (w.lIlIIlllllllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray8 = new int[lIIlIIIIlIlll[1]];
                                        nArray8[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[24];
                                        if (w.lIlIIlllllllIIl(Bank.getFirst((int[])nArray8).getQuantity(), lIIlIIIIlIlll[25])) {
                                            w.W();
                                            System.out.println(lIIlIIIIIlIIl[lIIlIIIIlIlll[26]]);
                                            by = lIIlIIIIlIlll[1];
                                            return;
                                        }
                                    }
                                    int[] nArray9 = new int[lIIlIIIIlIlll[1]];
                                    nArray9[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[27];
                                    if (w.lIlIIlllllllIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                        int[] nArray10 = new int[lIIlIIIIlIlll[1]];
                                        nArray10[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[27];
                                        if (w.lIlIIlllllllIIl(Bank.getFirst((int[])nArray10).getQuantity(), lIIlIIIIlIlll[7])) {
                                            w.W();
                                            System.out.println(lIIlIIIIIlIIl[lIIlIIIIlIlll[28]]);
                                            by = lIIlIIIIlIlll[1];
                                            return;
                                        }
                                    }
                                    int[] nArray11 = new int[lIIlIIIIlIlll[29]];
                                    nArray11[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                                    nArray11[w.lIIlIIIIlIlll[1]] = lIIlIIIIlIlll[22];
                                    nArray11[w.lIIlIIIIlIlll[2]] = lIIlIIIIlIlll[21];
                                    nArray11[w.lIIlIIIIlIlll[7]] = lIIlIIIIlIlll[30];
                                    nArray11[w.lIIlIIIIlIlll[9]] = lIIlIIIIlIlll[31];
                                    nArray11[w.lIIlIIIIlIlll[11]] = lIIlIIIIlIlll[32];
                                    nArray11[w.lIIlIIIIlIlll[12]] = lIIlIIIIlIlll[33];
                                    nArray11[w.lIIlIIIIlIlll[13]] = lIIlIIIIlIlll[34];
                                    nArray11[w.lIIlIIIIlIlll[16]] = lIIlIIIIlIlll[35];
                                    nArray11[w.lIIlIIIIlIlll[17]] = lIIlIIIIlIlll[36];
                                    nArray11[w.lIIlIIIIlIlll[23]] = lIIlIIIIlIlll[24];
                                    nArray11[w.lIIlIIIIlIlll[26]] = lIIlIIIIlIlll[27];
                                    nArray11[w.lIIlIIIIlIlll[28]] = lIIlIIIIlIlll[37];
                                    nArray11[w.lIIlIIIIlIlll[38]] = lIIlIIIIlIlll[39];
                                    nArray11[w.lIIlIIIIlIlll[40]] = lIIlIIIIlIlll[41];
                                    nArray11[w.lIIlIIIIlIlll[20]] = lIIlIIIIlIlll[42];
                                    nArray11[w.lIIlIIIIlIlll[43]] = lIIlIIIIlIlll[44];
                                    if (w.lIlIIlllllllIlI(e.b(nArray11) ? 1 : 0)) {
                                        w.W();
                                        System.out.println(lIIlIIIIIlIIl[lIIlIIIIlIlll[38]]);
                                        by = lIIlIIIIlIlll[1];
                                        return;
                                    }
                                    int[] nArray12 = new int[lIIlIIIIlIlll[29]];
                                    nArray12[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                                    nArray12[w.lIIlIIIIlIlll[1]] = lIIlIIIIlIlll[22];
                                    nArray12[w.lIIlIIIIlIlll[2]] = lIIlIIIIlIlll[21];
                                    nArray12[w.lIIlIIIIlIlll[7]] = lIIlIIIIlIlll[30];
                                    nArray12[w.lIIlIIIIlIlll[9]] = lIIlIIIIlIlll[31];
                                    nArray12[w.lIIlIIIIlIlll[11]] = lIIlIIIIlIlll[32];
                                    nArray12[w.lIIlIIIIlIlll[12]] = lIIlIIIIlIlll[33];
                                    nArray12[w.lIIlIIIIlIlll[13]] = lIIlIIIIlIlll[34];
                                    nArray12[w.lIIlIIIIlIlll[16]] = lIIlIIIIlIlll[35];
                                    nArray12[w.lIIlIIIIlIlll[17]] = lIIlIIIIlIlll[36];
                                    nArray12[w.lIIlIIIIlIlll[23]] = lIIlIIIIlIlll[24];
                                    nArray12[w.lIIlIIIIlIlll[26]] = lIIlIIIIlIlll[27];
                                    nArray12[w.lIIlIIIIlIlll[28]] = lIIlIIIIlIlll[37];
                                    nArray12[w.lIIlIIIIlIlll[38]] = lIIlIIIIlIlll[39];
                                    nArray12[w.lIIlIIIIlIlll[40]] = lIIlIIIIlIlll[41];
                                    nArray12[w.lIIlIIIIlIlll[20]] = lIIlIIIIlIlll[42];
                                    nArray12[w.lIIlIIIIlIlll[43]] = lIIlIIIIlIlll[44];
                                    if (w.lIlIIlllllllIII(e.b(nArray12) ? 1 : 0)) {
                                        a.a(lIIlIIIIlIlll[19], lIIlIIIIlIlll[11]);
                                        a.a(lIIlIIIIlIlll[22], lIIlIIIIlIlll[11]);
                                        a.a(lIIlIIIIlIlll[21], lIIlIIIIlIlll[11]);
                                        a.b(f.ba, lIIlIIIIlIlll[11]);
                                        a.a(lIIlIIIIlIlll[35], lIIlIIIIlIlll[13]);
                                        a.b(f.bk, lIIlIIIIlIlll[1]);
                                        a.a(lIIlIIIIlIlll[42], lIIlIIIIlIlll[1]);
                                        a.a(lIIlIIIIlIlll[44], lIIlIIIIlIlll[1]);
                                        a.a(lIIlIIIIlIlll[39], lIIlIIIIlIlll[1]);
                                        a.a(lIIlIIIIlIlll[36], lIIlIIIIlIlll[1]);
                                        a.a(lIIlIIIIlIlll[45], lIIlIIIIlIlll[2]);
                                        a.a(lIIlIIIIlIlll[46], lIIlIIIIlIlll[47]);
                                    }
                                }
                                if (w.lIlIIlllllllIII(w.S() ? 1 : 0) && w.lIlIIlllllllIIl(e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[1])) {
                                    if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(fL), lIIlIIIIlIlll[12])) {
                                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[40]];
                                        Movement.walkTo((WorldPoint)fL);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                                        0;
                                    }
                                    if (w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(fL), lIIlIIIIlIlll[12])) {
                                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[20]];
                                        g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[43]], bW, lIIlIIIIlIlll[1]);
                                    }
                                }
                                if (w.lIlIlIIIIIIIIIl(e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[1]) && w.lIlIIlllllllIII(w.S() ? 1 : 0)) {
                                    var37 = new WorldPoint(lIIlIIIIlIlll[48], lIIlIIIIlIlll[49], lIIlIIIIlIlll[0]);
                                    if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var37), lIIlIIIIlIlll[16])) {
                                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[29]];
                                        Movement.walkTo((WorldPoint)var37);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                                        0;
                                    }
                                    if (w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var37), lIIlIIIIlIlll[16])) {
                                        g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[50]], bW, lIIlIIIIlIlll[1]);
                                    }
                                }
                                if (!w.lIlIlIIIIIIIIIl(e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[2])) break block217;
                                co = lIIlIIIIlIlll[0];
                                int[] nArray = new int[lIIlIIIIlIlll[1]];
                                nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[44];
                                if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray13 = new int[lIIlIIIIlIlll[1]];
                                    nArray13[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[44];
                                    if (w.lIlIIlllllllIlI(Equipment.contains((int[])nArray13) ? 1 : 0)) {
                                        String[] stringArray = new String[lIIlIIIIlIlll[1]];
                                        stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[51]];
                                        Inventory.getFirst((String[])stringArray).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[10]]);
                                    }
                                }
                                if (w.lIlIIlllllllIII(Inventory.contains(item -> item.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[340]])) ? 1 : 0) && w.lIlIIlllllllIlI(Equipment.contains(item -> item.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[339]])) ? 1 : 0)) {
                                    Inventory.getFirst(item -> item.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[338]])).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[52]]);
                                }
                                if (w.lIlIIlllllllIII(Inventory.contains(item -> item.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[337]])) ? 1 : 0) && w.lIlIIlllllllIlI(Equipment.contains(item -> item.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[336]])) ? 1 : 0)) {
                                    Inventory.getFirst(item -> item.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[335]])).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[53]]);
                                }
                                if (!w.lIlIlIIIIIIIIlI(Vars.getBit((int)lIIlIIIIlIlll[54]), lIIlIIIIlIlll[1])) break block218;
                                String[] stringArray = new String[lIIlIIIIlIlll[1]];
                                stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[55]];
                                if (!w.lIlIIlllllllIlI(Inventory.contains((String[])stringArray) ? 1 : 0) || !w.lIlIIlllllllIlI(fS ? 1 : 0)) break block219;
                            }
                            if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(fL), lIIlIIIIlIlll[12])) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[8]];
                                if (w.lIlIIlllllllIII(Inventory.isFull() ? 1 : 0)) {
                                    int[] nArray = new int[lIIlIIIIlIlll[1]];
                                    nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[35];
                                    if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray14 = new int[lIIlIIIIlIlll[1]];
                                        nArray14[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[35];
                                        Inventory.getFirst((int[])nArray14).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[56]]);
                                        Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                                        0;
                                    }
                                }
                                Movement.walkTo((WorldPoint)fL);
                                0;
                                Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                                0;
                            }
                            if (!w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(fL), lIIlIIIIlIlll[12])) break block219;
                            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[57]];
                            if (w.lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                                g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[58]], bW, lIIlIIIIlIlll[1]);
                            }
                            if (w.lIlIlIIIIIIIIIl(Vars.getBit((int)lIIlIIIIlIlll[59]), lIIlIIIIlIlll[1])) {
                                String[] stringArray = new String[lIIlIIIIlIlll[2]];
                                stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[60]];
                                stringArray[w.lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[61]];
                                g.a(stringArray);
                            }
                            if (w.lIlIlIIIIIIIIIl(Vars.getBit((int)lIIlIIIIlIlll[62]), lIIlIIIIlIlll[1])) {
                                String[] stringArray = new String[lIIlIIIIlIlll[1]];
                                stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[63]];
                                g.a(stringArray);
                            }
                            if (w.lIlIlIIIIIIIIIl(Vars.getBit((int)lIIlIIIIlIlll[64]), lIIlIIIIlIlll[1]) && !w.lIlIIlllllllIII(Vars.getBit((int)lIIlIIIIlIlll[62]))) break block220;
                            String[] stringArray = new String[lIIlIIIIlIlll[1]];
                            stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[65]];
                            if (!w.lIlIIlllllllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block221;
                        }
                        String[] stringArray = new String[lIIlIIIIlIlll[2]];
                        stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[15]];
                        stringArray[w.lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[66]];
                        g.a(stringArray);
                    }
                    if (w.lIlIlIIIIIIIIIl(Vars.getBit((int)lIIlIIIIlIlll[67]), lIIlIIIIlIlll[1])) {
                        String[] stringArray = new String[lIIlIIIIlIlll[2]];
                        stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[68]];
                        stringArray[w.lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[69]];
                        g.a(stringArray);
                    }
                    if (w.lIlIlIIIIIIIIIl(Vars.getBit((int)lIIlIIIIlIlll[54]), lIIlIIIIlIlll[1])) {
                        String[] stringArray = new String[lIIlIIIIlIlll[2]];
                        stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[70]];
                        stringArray[w.lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[71]];
                        g.a(stringArray);
                    }
                }
                if ((w.lIlIIlllllllIlI(Vars.getBit((int)lIIlIIIIlIlll[54])) && w.lIlIIlllllllIlI(Vars.getBit((int)lIIlIIIIlIlll[67])) && !w.lIlIIlllllllIII(Vars.getBit((int)lIIlIIIIlIlll[62])) || w.lIlIlIIIIIIIIIl(e.j(lIIlIIIIlIlll[72]), lIIlIIIIlIlll[20])) && w.lIlIIlllllllIlI(Vars.getBit((int)lIIlIIIIlIlll[73]))) {
                    String[] stringArray = new String[lIIlIIIIlIlll[1]];
                    stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[74]];
                    if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        var37 = new WorldPoint(lIIlIIIIlIlll[75], lIIlIIIIlIlll[76], lIIlIIIIlIlll[0]);
                        String[] stringArray4 = new String[lIIlIIIIlIlll[1]];
                        stringArray4[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[77]];
                        if (w.lIlIlIIIIIIIIll(NPCs.getNearest((String[])stringArray4))) {
                            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[78]];
                            Movement.walkTo((WorldPoint)var37);
                            0;
                            Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                            0;
                        }
                        String[] stringArray5 = new String[lIIlIIIIlIlll[1]];
                        stringArray5[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[79]];
                        if (w.lIlIIlllllllllI(NPCs.getNearest((String[])stringArray5))) {
                            g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[80]], bW);
                        }
                    }
                }
                if (w.lIlIlIIIIIIIIIl(Vars.getBit((int)lIIlIIIIlIlll[73]), lIIlIIIIlIlll[1]) && (!w.lIlIIlllllllIII(Vars.getBit((int)lIIlIIIIlIlll[81])) || w.lIlIIlllllllIlI(fP ? 1 : 0))) {
                    String[] stringArray = new String[lIIlIIIIlIlll[1]];
                    stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[82]];
                    if (w.lIlIIlllllllIlI(Inventory.contains((String[])stringArray) ? 1 : 0) && w.lIlIIlllllllIlI(Vars.getBit((int)lIIlIIIIlIlll[83]))) {
                        w.bs();
                    }
                    String[] stringArray6 = new String[lIIlIIIIlIlll[1]];
                    stringArray6[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[84]];
                    if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        var37 = new WorldPoint(lIIlIIIIlIlll[85], lIIlIIIIlIlll[86], lIIlIIIIlIlll[0]);
                        if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var37), lIIlIIIIlIlll[9]) && w.lIlIIlllllllIlI(Vars.getBit((int)lIIlIIIIlIlll[81]))) {
                            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[87]];
                            if (w.lIlIIlllllllIII(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)var37);
                            0;
                            Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                            0;
                        }
                        if (w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var37), lIIlIIIIlIlll[23])) {
                            if (w.lIlIIlllllllIlI(Vars.getBit((int)lIIlIIIIlIlll[81]))) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[88]];
                                String[] stringArray7 = new String[lIIlIIIIlIlll[1]];
                                stringArray7[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[89]];
                                if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                    String[] stringArray8 = new String[lIIlIIIIlIlll[1]];
                                    stringArray8[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[90]];
                                    String[] stringArray9 = new String[lIIlIIIIlIlll[1]];
                                    stringArray9[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[91]];
                                    Inventory.getFirst((String[])stringArray8).useOn(TileObjects.getNearest((String[])stringArray9));
                                    Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                                    0;
                                }
                                String[] stringArray10 = new String[lIIlIIIIlIlll[1]];
                                stringArray10[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[6]];
                                if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                                    String[] stringArray11 = new String[lIIlIIIIlIlll[1]];
                                    stringArray11[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[92]];
                                    String[] stringArray12 = new String[lIIlIIIIlIlll[1]];
                                    stringArray12[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[93]];
                                    Inventory.getFirst((String[])stringArray11).useOn(TileObjects.getNearest((String[])stringArray12));
                                    Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                                    0;
                                }
                                String[] stringArray13 = new String[lIIlIIIIlIlll[1]];
                                stringArray13[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[94]];
                                if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                                    String[] stringArray14 = new String[lIIlIIIIlIlll[1]];
                                    stringArray14[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[95]];
                                    String[] stringArray15 = new String[lIIlIIIIlIlll[1]];
                                    stringArray15[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[96]];
                                    Inventory.getFirst((String[])stringArray14).useOn(TileObjects.getNearest((String[])stringArray15));
                                    Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                                    0;
                                }
                                String[] stringArray16 = new String[lIIlIIIIlIlll[1]];
                                stringArray16[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[97]];
                                if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                                    String[] stringArray17 = new String[lIIlIIIIlIlll[1]];
                                    stringArray17[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[98]];
                                    String[] stringArray18 = new String[lIIlIIIIlIlll[1]];
                                    stringArray18[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[99]];
                                    Inventory.getFirst((String[])stringArray17).useOn(TileObjects.getNearest((String[])stringArray18));
                                    Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                                    0;
                                }
                            }
                            if (w.lIlIlIIIIIIIIIl(Vars.getBit((int)lIIlIIIIlIlll[81]), lIIlIIIIlIlll[1])) {
                                String[] stringArray19 = new String[lIIlIIIIlIlll[1]];
                                stringArray19[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[100]];
                                if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray19) ? 1 : 0)) {
                                    String[] stringArray20 = new String[lIIlIIIIlIlll[1]];
                                    stringArray20[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[101]];
                                    String[] stringArray21 = new String[lIIlIIIIlIlll[1]];
                                    stringArray21[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[102]];
                                    Inventory.getFirst((String[])stringArray20).useOn(TileObjects.getNearest((String[])stringArray21));
                                    Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                                    0;
                                }
                                String[] stringArray22 = new String[lIIlIIIIlIlll[1]];
                                stringArray22[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[103]];
                                if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray22) ? 1 : 0)) {
                                    String[] stringArray23 = new String[lIIlIIIIlIlll[1]];
                                    stringArray23[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[104]];
                                    String[] stringArray24 = new String[lIIlIIIIlIlll[1]];
                                    stringArray24[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[105]];
                                    Inventory.getFirst((String[])stringArray23).useOn(TileObjects.getNearest((String[])stringArray24));
                                    Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                                    0;
                                }
                                String[] stringArray25 = new String[lIIlIIIIlIlll[1]];
                                stringArray25[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[106]];
                                if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray25) ? 1 : 0)) {
                                    String[] stringArray26 = new String[lIIlIIIIlIlll[1]];
                                    stringArray26[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[107]];
                                    String[] stringArray27 = new String[lIIlIIIIlIlll[1]];
                                    stringArray27[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[108]];
                                    Inventory.getFirst((String[])stringArray26).useOn(TileObjects.getNearest((String[])stringArray27));
                                    Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                                    0;
                                }
                                String[] stringArray28 = new String[lIIlIIIIlIlll[1]];
                                stringArray28[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[109]];
                                if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray28) ? 1 : 0)) {
                                    String[] stringArray29 = new String[lIIlIIIIlIlll[1]];
                                    stringArray29[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[110]];
                                    String[] stringArray30 = new String[lIIlIIIIlIlll[1]];
                                    stringArray30[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[111]];
                                    Inventory.getFirst((String[])stringArray29).useOn(TileObjects.getNearest((String[])stringArray30));
                                    Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                                    0;
                                }
                                String[] stringArray31 = new String[lIIlIIIIlIlll[1]];
                                stringArray31[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[112]];
                                var12 = TileObjects.getNearest((String[])stringArray31);
                                if (w.lIlIIlllllllllI(var12) && w.lIlIIlllllllIlI(fP ? 1 : 0)) {
                                    if (w.lIlIIlllllllIlI(Reachable.isInteractable((Locatable)var12) ? 1 : 0)) {
                                        String[] stringArray32 = new String[lIIlIIIIlIlll[1]];
                                        stringArray32[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[113]];
                                        TileObjects.getNearest((String[])stringArray32).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[114]]);
                                        Time.sleepTicks((int)lIIlIIIIlIlll[16]);
                                        0;
                                    }
                                    if (w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)var12) ? 1 : 0) && w.lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                                        String[] stringArray33 = new String[lIIlIIIIlIlll[1]];
                                        stringArray33[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[115]];
                                        if (w.lIlIIlllllllIII(var12.hasAction(stringArray33) ? 1 : 0)) {
                                            var12.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[116]]);
                                            Time.sleepTicks((int)lIIlIIIIlIlll[9]);
                                            0;
                                        }
                                        String[] stringArray34 = new String[lIIlIIIIlIlll[1]];
                                        stringArray34[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[117]];
                                        if (w.lIlIIlllllllIII(var12.hasAction(stringArray34) ? 1 : 0)) {
                                            var12.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[118]]);
                                            Time.sleepTicks((int)lIIlIIIIlIlll[9]);
                                            0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (w.lIlIlIIIIIIIIIl(Vars.getBit((int)lIIlIIIIlIlll[81]), lIIlIIIIlIlll[1]) && w.lIlIIlllllllIlI(fP ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIlIlll[1]];
                    stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[119]];
                    if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray35 = new String[lIIlIIIIlIlll[1]];
                        stringArray35[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[120]];
                        String[] stringArray36 = new String[lIIlIIIIlIlll[1]];
                        stringArray36[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[121]];
                        Inventory.getFirst((String[])stringArray35).useOn(TileObjects.getNearest((String[])stringArray36));
                        Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                        0;
                    }
                    String[] stringArray37 = new String[lIIlIIIIlIlll[1]];
                    stringArray37[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[122]];
                    if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray37) ? 1 : 0)) {
                        String[] stringArray38 = new String[lIIlIIIIlIlll[1]];
                        stringArray38[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[123]];
                        String[] stringArray39 = new String[lIIlIIIIlIlll[1]];
                        stringArray39[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[124]];
                        Inventory.getFirst((String[])stringArray38).useOn(TileObjects.getNearest((String[])stringArray39));
                        Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                        0;
                    }
                    String[] stringArray40 = new String[lIIlIIIIlIlll[1]];
                    stringArray40[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[125]];
                    if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray40) ? 1 : 0)) {
                        String[] stringArray41 = new String[lIIlIIIIlIlll[1]];
                        stringArray41[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[126]];
                        String[] stringArray42 = new String[lIIlIIIIlIlll[1]];
                        stringArray42[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[127]];
                        Inventory.getFirst((String[])stringArray41).useOn(TileObjects.getNearest((String[])stringArray42));
                        Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                        0;
                    }
                    String[] stringArray43 = new String[lIIlIIIIlIlll[1]];
                    stringArray43[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[128]];
                    if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray43) ? 1 : 0)) {
                        String[] stringArray44 = new String[lIIlIIIIlIlll[1]];
                        stringArray44[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[129]];
                        String[] stringArray45 = new String[lIIlIIIIlIlll[1]];
                        stringArray45[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[130]];
                        Inventory.getFirst((String[])stringArray44).useOn(TileObjects.getNearest((String[])stringArray45));
                        Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                        0;
                    }
                    String[] stringArray46 = new String[lIIlIIIIlIlll[1]];
                    stringArray46[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[25]];
                    var37 = TileObjects.getNearest((String[])stringArray46);
                    if (w.lIlIIlllllllllI(var37) && w.lIlIIlllllllIlI(fP ? 1 : 0)) {
                        if (w.lIlIIlllllllIlI(Reachable.isInteractable((Locatable)var37) ? 1 : 0)) {
                            String[] stringArray47 = new String[lIIlIIIIlIlll[1]];
                            stringArray47[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[131]];
                            TileObjects.getNearest((String[])stringArray47).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[132]]);
                            Time.sleepTicks((int)lIIlIIIIlIlll[16]);
                            0;
                        }
                        if (w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)var37) ? 1 : 0) && w.lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray48 = new String[lIIlIIIIlIlll[1]];
                            stringArray48[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[133]];
                            if (w.lIlIIlllllllIII(var37.hasAction(stringArray48) ? 1 : 0)) {
                                var37.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[134]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[9]);
                                0;
                            }
                            String[] stringArray49 = new String[lIIlIIIIlIlll[1]];
                            stringArray49[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[135]];
                            if (w.lIlIIlllllllIII(var37.hasAction(stringArray49) ? 1 : 0)) {
                                var37.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[136]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[9]);
                                0;
                            }
                        }
                    }
                }
                if (w.lIlIIlllllllIII(fP ? 1 : 0) && w.lIlIIlllllllIlI(fQ ? 1 : 0)) {
                    var37 = new WorldPoint(lIIlIIIIlIlll[85], lIIlIIIIlIlll[86], lIIlIIIIlIlll[0]);
                    if (w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var37), lIIlIIIIlIlll[23])) {
                        int[] nArray = new int[lIIlIIIIlIlll[1]];
                        nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                        Inventory.getFirst((int[])nArray).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[137]]);
                        Time.sleepTicks((int)lIIlIIIIlIlll[16]);
                        0;
                    }
                    var12 = new WorldPoint(lIIlIIIIlIlll[138], lIIlIIIIlIlll[139], lIIlIIIIlIlll[0]);
                    if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals((Object)var12) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[140]];
                        if (w.lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)var12);
                            0;
                            Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                            0;
                        }
                        String[] stringArray = new String[lIIlIIIIlIlll[7]];
                        stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[141]];
                        stringArray[w.lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[142]];
                        stringArray[w.lIIlIIIIlIlll[2]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[143]];
                        g.a(stringArray);
                    }
                    if (w.lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals((Object)var12) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[144]];
                        g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[145]], bW);
                    }
                }
                if (w.lIlIIlllllllIII(fP ? 1 : 0) && w.lIlIIlllllllIII(fQ ? 1 : 0) && w.lIlIIlllllllIlI(fR ? 1 : 0)) {
                    TileObject var23;
                    TileObject var34;
                    WorldArea var10;
                    String[] stringArray = new String[lIIlIIIIlIlll[1]];
                    stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[146]];
                    if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray50 = new String[lIIlIIIIlIlll[1]];
                        stringArray50[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[147]];
                        Inventory.getFirst((String[])stringArray50).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[148]]);
                    }
                    var37 = new WorldArea(lIIlIIIIlIlll[149], lIIlIIIIlIlll[150], lIIlIIIIlIlll[51], lIIlIIIIlIlll[10], lIIlIIIIlIlll[0]);
                    var12 = new WorldArea(lIIlIIIIlIlll[151], lIIlIIIIlIlll[152], lIIlIIIIlIlll[58], lIIlIIIIlIlll[58], lIIlIIIIlIlll[0]);
                    if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().getPlane()) && w.lIlIIlllllllIlI(var37.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllIlI(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        var20 = new WorldPoint(lIIlIIIIlIlll[153], lIIlIIIIlIlll[154], lIIlIIIIlIlll[0]);
                        if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(var20), lIIlIIIIlIlll[2])) {
                            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[155]];
                            Movement.walkTo((WorldPoint)var20);
                            0;
                            Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                            0;
                        }
                        if (w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(var20), lIIlIIIIlIlll[2])) {
                            String[] stringArray51 = new String[lIIlIIIIlIlll[1]];
                            stringArray51[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[156]];
                            TileObjects.getNearest((String[])stringArray51).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[157]]);
                            Time.sleepTicks((int)lIIlIIIIlIlll[11]);
                            0;
                        }
                    }
                    var20 = new WorldArea(lIIlIIIIlIlll[158], lIIlIIIIlIlll[159], lIIlIIIIlIlll[11], lIIlIIIIlIlll[16], lIIlIIIIlIlll[0]);
                    WorldArea var4 = new WorldArea(lIIlIIIIlIlll[160], lIIlIIIIlIlll[161], lIIlIIIIlIlll[13], lIIlIIIIlIlll[7], lIIlIIIIlIlll[0]);
                    if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().getPlane()) && w.lIlIIlllllllIII(var37.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] nArray = new int[lIIlIIIIlIlll[1]];
                        nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[162];
                        if (w.lIlIIlllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray15 = new int[lIIlIIIIlIlll[1]];
                            nArray15[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[162];
                            if (w.lIlIlIIIIIIIIll(TileItems.getNearest((int[])nArray15)) && w.lIlIIlllllllIlI(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllIlI(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllIlI(new WorldArea(lIIlIIIIlIlll[163], lIIlIIIIlIlll[164], lIIlIIIIlIlll[26], lIIlIIIIlIlll[12], lIIlIIIIlIlll[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[165]];
                                if (w.lIlIlIIIIIIIIll(Players.getLocal().getInteracting())) {
                                    int[] nArray16 = new int[lIIlIIIIlIlll[1]];
                                    nArray16[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[166];
                                    NPCs.getNearest((int[])nArray16).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[167]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray17 = new int[lIIlIIIIlIlll[1]];
                        nArray17[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[162];
                        if (w.lIlIIlllllllllI(TileItems.getNearest((int[])nArray17))) {
                            int[] nArray18 = new int[lIIlIIIIlIlll[1]];
                            nArray18[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[162];
                            TileItems.getNearest((int[])nArray18).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[168]]);
                            Time.sleepTicks((int)lIIlIIIIlIlll[7]);
                            0;
                        }
                        int[] nArray19 = new int[lIIlIIIIlIlll[1]];
                        nArray19[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[162];
                        if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray19) ? 1 : 0) && w.lIlIIlllllllIlI(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllIlI(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            var10 = new WorldPoint(lIIlIIIIlIlll[169], lIIlIIIIlIlll[170], lIIlIIIIlIlll[0]);
                            if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[171]];
                                e.b((WorldPoint)var10);
                                Time.sleepTicks((int)lIIlIIIIlIlll[2]);
                                0;
                            }
                            if (w.lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                String[] stringArray52 = new String[lIIlIIIIlIlll[1]];
                                stringArray52[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[172]];
                                TileObjects.getNearest((String[])stringArray52).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[173]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[12]);
                                0;
                            }
                        }
                        if (!w.lIlIIlllllllIlI(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || w.lIlIIlllllllIII(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            var10 = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (w.lIlIIlllllllIII(tileObject.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[334]]) ? 1 : 0) && w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                    n2 = lIIlIIIIlIlll[1];
                                    0;
                                    if (1 < ((0x75 ^ 0x42 ^ (0x7E ^ 0x1A)) & (0xD ^ 0x5C ^ 2 ^ -1))) {
                                        return ((14 + 148 - 9 + 59 ^ 88 + 170 - 107 + 31) & (2 ^ 0x18 ^ (0xD3 ^ 0xAB) ^ -1)) != 0;
                                    }
                                } else {
                                    n2 = lIIlIIIIlIlll[0];
                                }
                                return n2 != 0;
                            });
                            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[174]];
                            if (w.lIlIIlllllllllI(var10)) {
                                var10.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[175]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[7]);
                                0;
                            }
                        }
                    }
                    if (w.lIlIlIIIIIIIIIl(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIlIlll[1]) && w.lIlIIlllllllIlI(new WorldArea(lIIlIIIIlIlll[176], lIIlIIIIlIlll[177], lIIlIIIIlIlll[11], lIIlIIIIlIlll[13], lIIlIIIIlIlll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] nArray = new int[lIIlIIIIlIlll[1]];
                        nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[178];
                        if (w.lIlIIlllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray20 = new int[lIIlIIIIlIlll[1]];
                            nArray20[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[178];
                            if (w.lIlIlIIIIIIIIll(TileItems.getNearest((int[])nArray20))) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[179]];
                                var10 = NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (w.lIlIIlllllllIII(nPC.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[333]]) ? 1 : 0) && w.lIlIlIIIIIIIlII(nPC.getInteracting(), Players.getLocal()) && w.lIlIlIIIIIIIIII(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIIIIlIlll[1])) {
                                        n2 = lIIlIIIIlIlll[1];
                                        0;
                                        if ((0x5C ^ 0x58) != (0x3D ^ 0x39)) {
                                            return false;
                                        }
                                    } else {
                                        n2 = lIIlIIIIlIlll[0];
                                    }
                                    return n2 != 0;
                                });
                                if (w.lIlIlIIIIIIIIll(Players.getLocal().getInteracting()) && w.lIlIlIIIIIIIIll(var10)) {
                                    int[] nArray21 = new int[lIIlIIIIlIlll[1]];
                                    nArray21[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[180];
                                    NPCs.getNearest((int[])nArray21).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[181]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray22 = new int[lIIlIIIIlIlll[1]];
                        nArray22[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[178];
                        if (w.lIlIIlllllllllI(TileItems.getNearest((int[])nArray22))) {
                            int[] nArray23 = new int[lIIlIIIIlIlll[1]];
                            nArray23[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[178];
                            TileItems.getNearest((int[])nArray23).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[182]]);
                            Time.sleepTicks((int)lIIlIIIIlIlll[7]);
                            0;
                        }
                        var10 = new WorldArea(lIIlIIIIlIlll[183], lIIlIIIIlIlll[184], lIIlIIIIlIlll[12], lIIlIIIIlIlll[11], lIIlIIIIlIlll[1]);
                        int[] nArray24 = new int[lIIlIIIIlIlll[1]];
                        nArray24[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[178];
                        if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray24) ? 1 : 0) && w.lIlIIlllllllIlI(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            var34 = new WorldPoint(lIIlIIIIlIlll[163], lIIlIIIIlIlll[170], lIIlIIIIlIlll[1]);
                            if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals((Object)var34) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[185]];
                                e.b((WorldPoint)var34);
                                Time.sleepTicks((int)lIIlIIIIlIlll[2]);
                                0;
                            }
                            if (w.lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals((Object)var34) ? 1 : 0)) {
                                String[] stringArray53 = new String[lIIlIIIIlIlll[1]];
                                stringArray53[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[186]];
                                TileObjects.getNearest((String[])stringArray53).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[187]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[12]);
                                0;
                            }
                        }
                        if (w.lIlIIlllllllIII(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllllI(var34 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (w.lIlIIlllllllIII(tileObject.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[332]]) ? 1 : 0) && w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = lIIlIIIIlIlll[1];
                                0;
                                if (1 == 0) {
                                    return ((30 + 3 - -7 + 156 ^ 111 + 52 - -11 + 19) & (0x70 ^ 0x3C ^ (0x3C ^ 0x75) ^ -1)) != 0;
                                }
                            } else {
                                n2 = lIIlIIIIlIlll[0];
                            }
                            return n2 != 0;
                        }))) {
                            var34.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[188]]);
                            Time.sleepTicks((int)lIIlIIIIlIlll[7]);
                            0;
                        }
                    }
                    if (w.lIlIlIIIIIIIIIl(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIlIlll[2])) {
                        int[] nArray = new int[lIIlIIIIlIlll[1]];
                        nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[189];
                        if (w.lIlIIlllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray25 = new int[lIIlIIIIlIlll[1]];
                            nArray25[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[189];
                            if (w.lIlIlIIIIIIIIll(TileItems.getNearest((int[])nArray25))) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[190]];
                                var10 = NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (w.lIlIIlllllllIII(nPC.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[331]]) ? 1 : 0) && w.lIlIlIIIIIIIlII(nPC.getInteracting(), Players.getLocal()) && w.lIlIlIIIIIIIIII(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIIIIlIlll[1])) {
                                        n2 = lIIlIIIIlIlll[1];
                                        0;
                                        if (3 == -1) {
                                            return ((76 + 233 - 214 + 145 ^ 133 + 147 - 227 + 122) & (0xCB ^ 0xC0 ^ (0xDD ^ 0x89) ^ -1)) != 0;
                                        }
                                    } else {
                                        n2 = lIIlIIIIlIlll[0];
                                    }
                                    return n2 != 0;
                                });
                                if (w.lIlIlIIIIIIIIll(Players.getLocal().getInteracting()) && w.lIlIlIIIIIIIIll(var10)) {
                                    int[] nArray26 = new int[lIIlIIIIlIlll[1]];
                                    nArray26[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[191];
                                    NPCs.getNearest((int[])nArray26).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[192]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray27 = new int[lIIlIIIIlIlll[1]];
                        nArray27[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[189];
                        if (w.lIlIIlllllllllI(TileItems.getNearest((int[])nArray27))) {
                            int[] nArray28 = new int[lIIlIIIIlIlll[1]];
                            nArray28[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[189];
                            TileItems.getNearest((int[])nArray28).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[193]]);
                            Time.sleepTicks((int)lIIlIIIIlIlll[7]);
                            0;
                        }
                        var10 = new WorldArea(lIIlIIIIlIlll[149], lIIlIIIIlIlll[164], lIIlIIIIlIlll[10], lIIlIIIIlIlll[38], lIIlIIIIlIlll[2]);
                        int[] nArray29 = new int[lIIlIIIIlIlll[1]];
                        nArray29[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[189];
                        if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray29) ? 1 : 0) && w.lIlIIlllllllIlI(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            var34 = new WorldPoint(lIIlIIIIlIlll[194], lIIlIIIIlIlll[159], lIIlIIIIlIlll[2]);
                            if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals((Object)var34) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[195]];
                                e.b((WorldPoint)var34);
                                Time.sleepTicks((int)lIIlIIIIlIlll[2]);
                                0;
                            }
                            if (w.lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals((Object)var34) ? 1 : 0)) {
                                String[] stringArray54 = new String[lIIlIIIIlIlll[1]];
                                stringArray54[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[196]];
                                TileObjects.getNearest((String[])stringArray54).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[197]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[12]);
                                0;
                            }
                        }
                        if (w.lIlIIlllllllIII(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllllI(var34 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (w.lIlIIlllllllIII(tileObject.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[330]]) ? 1 : 0) && w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = lIIlIIIIlIlll[1];
                                0;
                                if (3 < 0) {
                                    return ((17 + 39 - -42 + 80 ^ 148 + 88 - 145 + 98) & (0x6F ^ 0x45 ^ (0x95 ^ 0xB0) ^ -1)) != 0;
                                }
                            } else {
                                n2 = lIIlIIIIlIlll[0];
                            }
                            return n2 != 0;
                        }))) {
                            var34.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[198]]);
                            Time.sleepTicks((int)lIIlIIIIlIlll[7]);
                            0;
                        }
                    }
                    if ((!w.lIlIIlllllllIlI((var10 = new WorldArea(lIIlIIIIlIlll[176], lIIlIIIIlIlll[177], lIIlIIIIlIlll[11], lIIlIIIIlIlll[13], lIIlIIIIlIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || w.lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIlIlll[199], lIIlIIIIlIlll[200], lIIlIIIIlIlll[1])) ? 1 : 0)) && w.lIlIIlllllllllI(var34 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (w.lIlIIlllllllIII(tileObject.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[328]]) ? 1 : 0) && w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                            String[] stringArray = new String[lIIlIIIIlIlll[1]];
                            stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[329]];
                            if (w.lIlIIlllllllIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIlIIIIlIlll[1];
                                0;
                                if ((0xC3 ^ 0xC7) == (0x68 ^ 0x6C)) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = lIIlIIIIlIlll[0];
                        return n2 != 0;
                    }))) {
                        var34.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[201]]);
                        Time.sleepTicks((int)lIIlIIIIlIlll[7]);
                        0;
                    }
                    if (w.lIlIIlllllllIII((var34 = new WorldArea(lIIlIIIIlIlll[163], lIIlIIIIlIlll[164], lIIlIIIIlIlll[26], lIIlIIIIlIlll[12], lIIlIIIIlIlll[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllllI(var23 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (w.lIlIIlllllllIII(tileObject.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[326]]) ? 1 : 0) && w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                            String[] stringArray = new String[lIIlIIIIlIlll[1]];
                            stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[327]];
                            if (w.lIlIIlllllllIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIlIIIIlIlll[1];
                                0;
                                if (3 > 0) return n2 != 0;
                                return ((0x29 ^ 0x75 ^ (0xD7 ^ 0x93)) & (13 + 80 - -66 + 63 ^ 38 + 163 - 5 + 2 ^ -1)) != 0;
                            }
                        }
                        n2 = lIIlIIIIlIlll[0];
                        return n2 != 0;
                    }))) {
                        var23.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[202]]);
                        Time.sleepTicks((int)lIIlIIIIlIlll[7]);
                        0;
                    }
                    var23 = new WorldArea(lIIlIIIIlIlll[194], lIIlIIIIlIlll[203], lIIlIIIIlIlll[43], lIIlIIIIlIlll[9], lIIlIIIIlIlll[0]);
                    WorldArea var16 = new WorldArea(lIIlIIIIlIlll[204], lIIlIIIIlIlll[205], lIIlIIIIlIlll[13], lIIlIIIIlIlll[23], lIIlIIIIlIlll[0]);
                    WorldArea var27 = new WorldArea(lIIlIIIIlIlll[169], lIIlIIIIlIlll[206], lIIlIIIIlIlll[11], lIIlIIIIlIlll[17], lIIlIIIIlIlll[0]);
                    if (w.lIlIIlllllllIII(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint var11;
                        WorldPoint var33;
                        WorldArea var1;
                        int[] nArray = new int[lIIlIIIIlIlll[1]];
                        nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[207];
                        if (w.lIlIIlllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray30 = new int[lIIlIIIIlIlll[1]];
                            nArray30[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[207];
                            if (w.lIlIlIIIIIIIIll(TileItems.getNearest((int[])nArray30)) && w.lIlIIlllllllIlI(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllIlI(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllIlI(var27.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[208]];
                                var1 = NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (w.lIlIIlllllllIII(nPC.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[325]]) ? 1 : 0) && w.lIlIlIIIIIIIlII(nPC.getInteracting(), Players.getLocal()) && w.lIlIlIIIIIIIIII(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIIIIlIlll[1])) {
                                        n2 = lIIlIIIIlIlll[1];
                                        0;
                                        
                                        }
                                    } else {
                                        n2 = lIIlIIIIlIlll[0];
                                    }
                                    return n2 != 0;
                                });
                                if (w.lIlIlIIIIIIIIll(Players.getLocal().getInteracting()) && w.lIlIlIIIIIIIIll(var1)) {
                                    int[] nArray31 = new int[lIIlIIIIlIlll[1]];
                                    nArray31[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[209];
                                    NPCs.getNearest((int[])nArray31).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[210]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray32 = new int[lIIlIIIIlIlll[1]];
                        nArray32[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[207];
                        if (w.lIlIIlllllllllI(TileItems.getNearest((int[])nArray32))) {
                            int[] nArray33 = new int[lIIlIIIIlIlll[1]];
                            nArray33[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[207];
                            TileItems.getNearest((int[])nArray33).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[211]]);
                            Time.sleepTicks((int)lIIlIIIIlIlll[7]);
                            0;
                        }
                        var1 = new WorldArea(lIIlIIIIlIlll[169], lIIlIIIIlIlll[206], lIIlIIIIlIlll[11], lIIlIIIIlIlll[17], lIIlIIIIlIlll[0]);
                        int[] nArray34 = new int[lIIlIIIIlIlll[1]];
                        nArray34[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[207];
                        if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray34) ? 1 : 0) && w.lIlIIlllllllIlI(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            var33 = new WorldPoint(lIIlIIIIlIlll[183], lIIlIIIIlIlll[212], lIIlIIIIlIlll[0]);
                            if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals((Object)var33) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[213]];
                                e.b(var33);
                                Time.sleepTicks((int)lIIlIIIIlIlll[2]);
                                0;
                            }
                            if (w.lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals((Object)var33) ? 1 : 0)) {
                                String[] stringArray55 = new String[lIIlIIIIlIlll[1]];
                                stringArray55[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[214]];
                                TileObjects.getNearest((String[])stringArray55).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[215]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[12]);
                                0;
                            }
                        }
                        if (w.lIlIIlllllllIII(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray35 = new int[lIIlIIIIlIlll[1]];
                            nArray35[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[216];
                            if (w.lIlIIlllllllIlI(Inventory.contains((int[])nArray35) ? 1 : 0)) {
                                int[] nArray36 = new int[lIIlIIIIlIlll[1]];
                                nArray36[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[216];
                                if (w.lIlIlIIIIIIIIll(TileItems.getNearest((int[])nArray36))) {
                                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[217]];
                                    if (w.lIlIIlllllllIlI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                    }
                                    if (w.lIlIlIIIIIIIIll(Players.getLocal().getInteracting())) {
                                        int[] nArray37 = new int[lIIlIIIIlIlll[1]];
                                        nArray37[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[218];
                                        NPCs.getNearest((int[])nArray37).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[219]]);
                                        Time.sleepTicks((int)lIIlIIIIlIlll[11]);
                                        0;
                                    }
                                }
                            }
                            int[] nArray38 = new int[lIIlIIIIlIlll[1]];
                            nArray38[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[216];
                            if (w.lIlIIlllllllllI(TileItems.getNearest((int[])nArray38))) {
                                if (w.lIlIIlllllllIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                }
                                int[] nArray39 = new int[lIIlIIIIlIlll[1]];
                                nArray39[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[216];
                                TileItems.getNearest((int[])nArray39).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[220]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[7]);
                                0;
                            }
                            var33 = new WorldArea(lIIlIIIIlIlll[169], lIIlIIIIlIlll[206], lIIlIIIIlIlll[11], lIIlIIIIlIlll[17], lIIlIIIIlIlll[0]);
                            int[] nArray40 = new int[lIIlIIIIlIlll[1]];
                            nArray40[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[216];
                            if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray40) ? 1 : 0) && w.lIlIIlllllllIII(var33.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllIlI(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllIlI(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                var11 = new WorldPoint(lIIlIIIIlIlll[221], lIIlIIIIlIlll[222], lIIlIIIIlIlll[0]);
                                if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals((Object)var11) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[223]];
                                    e.b(var11);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[2]);
                                    0;
                                }
                                if (w.lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals((Object)var11) ? 1 : 0)) {
                                    String[] stringArray56 = new String[lIIlIIIIlIlll[1]];
                                    stringArray56[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[224]];
                                    TileObjects.getNearest((String[])stringArray56).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[225]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[12]);
                                    0;
                                }
                            }
                        }
                        if (!w.lIlIIlllllllIlI(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || w.lIlIIlllllllIII(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray57 = new String[lIIlIIIIlIlll[1]];
                            stringArray57[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[226]];
                            var33 = NPCs.getNearest((String[])stringArray57);
                            if (w.lIlIIlllllllllI(var33)) {
                                int[] nArray41 = new int[lIIlIIIIlIlll[1]];
                                nArray41[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[227];
                                if (w.lIlIIlllllllIlI(Inventory.contains((int[])nArray41) ? 1 : 0) && w.lIlIlIIIIIIIIll(Players.getLocal().getInteracting())) {
                                    if (w.lIlIIlllllllIlI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                    }
                                    var33.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[228]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[7]);
                                    0;
                                }
                            }
                            int[] nArray42 = new int[lIIlIIIIlIlll[1]];
                            nArray42[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[227];
                            if (w.lIlIIlllllllllI(TileItems.getNearest((int[])nArray42))) {
                                int[] nArray43 = new int[lIIlIIIIlIlll[1]];
                                nArray43[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[227];
                                TileItems.getNearest((int[])nArray43).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[229]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[2]);
                                0;
                            }
                            int[] nArray44 = new int[lIIlIIIIlIlll[1]];
                            nArray44[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[227];
                            if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray44) ? 1 : 0)) {
                                var11 = new WorldPoint(lIIlIIIIlIlll[176], lIIlIIIIlIlll[230], lIIlIIIIlIlll[0]);
                                if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals((Object)var11) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[231]];
                                    e.b(var11);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[2]);
                                    0;
                                }
                                if (w.lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals((Object)var11) ? 1 : 0)) {
                                    String[] stringArray58 = new String[lIIlIIIIlIlll[1]];
                                    stringArray58[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[232]];
                                    TileObjects.getNearest((String[])stringArray58).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[233]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[12]);
                                    0;
                                }
                            }
                        }
                        if (w.lIlIIlllllllllI(var33 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (w.lIlIIlllllllIII(tileObject.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[324]]) ? 1 : 0) && w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = lIIlIIIIlIlll[1];
                                0;
                                if (1 >= (0x73 ^ 0x77)) {
                                    return false;
                                }
                            } else {
                                n2 = lIIlIIIIlIlll[0];
                            }
                            return n2 != 0;
                        }))) {
                            if (w.lIlIIlllllllIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (w.lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray59 = new String[lIIlIIIIlIlll[1]];
                                stringArray59[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[234]];
                                if (w.lIlIIlllllllIII(var33.hasAction(stringArray59) ? 1 : 0)) {
                                    var33.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[235]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[9]);
                                    0;
                                }
                                String[] stringArray60 = new String[lIIlIIIIlIlll[1]];
                                stringArray60[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[236]];
                                if (w.lIlIIlllllllIII(var33.hasAction(stringArray60) ? 1 : 0)) {
                                    var33.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[237]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[9]);
                                    0;
                                }
                            }
                        }
                    }
                }
                if (w.lIlIIlllllllIII(fQ ? 1 : 0) && w.lIlIIlllllllIII(fR ? 1 : 0) && w.lIlIIlllllllIII(fP ? 1 : 0) && w.lIlIIlllllllIlI(fS ? 1 : 0)) {
                    int[] nArray = new int[lIIlIIIIlIlll[1]];
                    nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[3];
                    if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray45 = new int[lIIlIIIIlIlll[1]];
                        nArray45[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[3];
                        int[] nArray46 = new int[lIIlIIIIlIlll[1]];
                        nArray46[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[5];
                        Inventory.getFirst((int[])nArray45).useOn(Inventory.getFirst((int[])nArray46));
                        Time.sleepTicks((int)lIIlIIIIlIlll[7]);
                        0;
                    }
                }
                if (w.lIlIIlllllllIII(fS ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIlIlll[1]];
                    stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[238]];
                    if (w.lIlIIlllllllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        w.br();
                    }
                    String[] stringArray61 = new String[lIIlIIIIlIlll[1]];
                    stringArray61[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[239]];
                    if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray61) ? 1 : 0)) {
                        if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(fO), lIIlIIIIlIlll[9])) {
                            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[240]];
                            if (w.lIlIIlllllllIII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray62 = new String[lIIlIIIIlIlll[1]];
                                stringArray62[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[241]];
                                if (w.lIlIlIIIIIIIIll(NPCs.getNearest((String[])stringArray62))) {
                                    Dialog.close();
                                }
                            }
                            if (w.lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)fO);
                                0;
                                Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                                0;
                            }
                            String[] stringArray63 = new String[lIIlIIIIlIlll[7]];
                            stringArray63[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[242]];
                            stringArray63[w.lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[243]];
                            stringArray63[w.lIIlIIIIlIlll[2]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[244]];
                            g.a(stringArray63);
                        }
                        if (w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(fO), lIIlIIIIlIlll[9])) {
                            g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[245]], bW);
                        }
                    }
                }
            }
            if (w.lIlIlIIIIIIIIIl(e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[7])) {
                co = lIIlIIIIlIlll[0];
                String[] stringArray = new String[lIIlIIIIlIlll[1]];
                stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[246]];
                var37 = NPCs.getNearest((String[])stringArray);
                if (w.lIlIlIIIIIIIIll(var37) && w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().getPlane())) {
                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[247]];
                    String[] stringArray64 = new String[lIIlIIIIlIlll[1]];
                    stringArray64[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[248]];
                    TileObjects.getNearest((String[])stringArray64).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[249]]);
                    Time.sleepTicks((int)lIIlIIIIlIlll[16]);
                    0;
                }
                if (w.lIlIlIIIIIIIIll(var37) && w.lIlIlIIIIIIIIIl(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIlIlll[1])) {
                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[250]];
                    String[] stringArray65 = new String[lIIlIIIIlIlll[1]];
                    stringArray65[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[251]];
                    TileObjects.getNearest((String[])stringArray65).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[252]]);
                    Time.sleepTicks((int)lIIlIIIIlIlll[7]);
                    0;
                }
                if (w.lIlIIlllllllllI(var37) && w.lIlIlIIIIIIIIIl(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIlIlll[1])) {
                    String[] stringArray66 = new String[lIIlIIIIlIlll[1]];
                    stringArray66[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[253]];
                    TileObjects.getNearest((String[])stringArray66).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[254]]);
                    Time.sleepTicks((int)lIIlIIIIlIlll[11]);
                    0;
                }
            }
            if (w.lIlIlIIIIIIIIIl(e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[12])) {
                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[255]];
                String[] stringArray = new String[lIIlIIIIlIlll[1]];
                stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[256]];
                var37 = NPCs.getNearest((String[])stringArray);
                if (w.lIlIlIIIIIIIIll(var37)) {
                    Equipment.getFirst(item -> item.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[323]])).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[257]]);
                    Time.sleepTicks((int)lIIlIIIIlIlll[23]);
                    0;
                    Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIIIlIlll[258], lIIlIIIIlIlll[259], lIIlIIIIlIlll[0]));
                    0;
                }
                if (w.lIlIIlllllllllI(var37)) {
                    g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[14]], bW, lIIlIIIIlIlll[1]);
                }
            }
            if (w.lIlIlIIIIIIIIIl(e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[13])) {
                if (w.lIlIIlllllllIlI(Inventory.contains(item -> item.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[322]])) ? 1 : 0)) {
                    w.bq();
                }
                if (w.lIlIIlllllllIII(Inventory.contains(item -> item.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[321]])) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIlIlll[1]];
                    stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[72]];
                    if (w.lIlIlIIIIIIIIll(NPCs.getNearest((String[])stringArray)) && w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().getPlane()) && w.lIlIIlllllllIlI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                        if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(fO), lIIlIIIIlIlll[2])) {
                            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[260]];
                            if (w.lIlIIlllllllIII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray67 = new String[lIIlIIIIlIlll[1]];
                                stringArray67[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[261]];
                                if (w.lIlIlIIIIIIIIll(NPCs.getNearest((String[])stringArray67))) {
                                    Dialog.close();
                                }
                            }
                            if (w.lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)fO);
                                0;
                                Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                                0;
                            }
                            String[] stringArray68 = new String[lIIlIIIIlIlll[7]];
                            stringArray68[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[262]];
                            stringArray68[w.lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[263]];
                            stringArray68[w.lIIlIIIIlIlll[2]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[264]];
                            g.a(stringArray68);
                        }
                        if (w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(fO), lIIlIIIIlIlll[2]) && w.lIlIIlllllllIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                            String[] stringArray69 = new String[lIIlIIIIlIlll[1]];
                            stringArray69[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[265]];
                            TileObjects.getNearest((String[])stringArray69).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[266]]);
                            Time.sleepTicks((int)lIIlIIIIlIlll[13]);
                            0;
                        }
                    }
                    String[] stringArray70 = new String[lIIlIIIIlIlll[1]];
                    stringArray70[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[267]];
                    if (w.lIlIIlllllllllI(NPCs.getNearest((String[])stringArray70)) && w.lIlIlIIIIIIIIIl(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIlIlll[1])) {
                        g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[268]], bW);
                    }
                }
            }
            if (w.lIlIlIIIIIIIIIl(e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[16])) {
                var37 = new WorldArea(lIIlIIIIlIlll[269], lIIlIIIIlIlll[270], lIIlIIIIlIlll[89], lIIlIIIIlIlll[79], lIIlIIIIlIlll[0]);
                if (w.lIlIIlllllllIlI(var37.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    var12 = new WorldPoint(lIIlIIIIlIlll[271], lIIlIIIIlIlll[259], lIIlIIIIlIlll[0]);
                    if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(var12), lIIlIIIIlIlll[7])) {
                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[272]];
                        Movement.walkTo((WorldPoint)var12);
                        0;
                        Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                        0;
                    }
                    if (w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(var12), lIIlIIIIlIlll[7])) {
                        String[] stringArray = new String[lIIlIIIIlIlll[1]];
                        stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[273]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[274]]);
                        Time.sleepTicks((int)lIIlIIIIlIlll[9]);
                        0;
                    }
                }
                if (w.lIlIIlllllllIII(var37.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIlIlll[1]];
                    stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[275]];
                    var12 = NPCs.getNearest((String[])stringArray);
                    var20 = new WorldPoint(lIIlIIIIlIlll[276], lIIlIIIIlIlll[152], lIIlIIIIlIlll[0]);
                    if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(var20), lIIlIIIIlIlll[7]) && w.lIlIlIIIIIIIIll(var12)) {
                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[277]];
                        Movement.walkTo((WorldPoint)var20);
                        0;
                        Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                        0;
                    }
                    if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(var20), lIIlIIIIlIlll[7]) && w.lIlIIlllllllllI(var12) && w.lIlIIlllllllIlI(Reachable.isInteractable((Locatable)var12) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[278]];
                        Movement.walkTo((WorldPoint)var20);
                        0;
                        Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                        0;
                    }
                    if (w.lIlIIlllllllllI(var12) && w.lIlIIlllllllIlI(Reachable.isInteractable((Locatable)var12) ? 1 : 0) && w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(var20), lIIlIIIIlIlll[7]) && w.lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                        if (w.lIlIIllllllllll(Combat.getMissingHealth(), lIIlIIIIlIlll[9])) {
                            String[] stringArray71 = new String[lIIlIIIIlIlll[1]];
                            stringArray71[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[279]];
                            if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray71) ? 1 : 0)) {
                                String[] stringArray72 = new String[lIIlIIIIlIlll[1]];
                                stringArray72[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[280]];
                                Inventory.getFirst((String[])stringArray72).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[281]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                                0;
                            }
                        }
                        String[] stringArray73 = new String[lIIlIIIIlIlll[1]];
                        stringArray73[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[282]];
                        TileObjects.getNearest((String[])stringArray73).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[283]]);
                    }
                    if (w.lIlIIlllllllllI(var12) && w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)var12) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[284]];
                        if (w.lIlIIlllllllIlI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                        }
                        if (w.lIlIIlllllllIlI(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                        }
                        if (w.lIlIIlllllllIlI(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                        }
                        String[] stringArray74 = new String[lIIlIIIIlIlll[1]];
                        stringArray74[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[285]];
                        if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray74) ? 1 : 0)) {
                            String[] stringArray75 = new String[lIIlIIIIlIlll[1]];
                            stringArray75[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[286]];
                            Inventory.getFirst((String[])stringArray75).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[287]]);
                        }
                        if (w.lIlIIlllllllIII(Inventory.isFull() ? 1 : 0)) {
                            String[] stringArray76 = new String[lIIlIIIIlIlll[1]];
                            stringArray76[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[288]];
                            Inventory.getFirst((String[])stringArray76).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[289]]);
                        }
                        if (w.lIlIlIIIIIIIIIl(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && w.lIlIIlllllllIII(Inventory.contains(item -> item.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[320]])) ? 1 : 0)) {
                            Inventory.getFirst(item -> item.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[319]])).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[290]]);
                        }
                        if (w.lIlIIlllllllIIl(Vars.getBit((int)lIIlIIIIlIlll[291]), lIIlIIIIlIlll[1]) && w.lIlIIlllllllIII(Inventory.contains(item -> item.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[318]])) ? 1 : 0)) {
                            Inventory.getFirst(item -> item.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[317]])).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[292]]);
                        }
                        if (w.lIlIlIIIIIIIIll(Players.getLocal().getInteracting())) {
                            var12.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[293]]);
                            Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                            0;
                        }
                    }
                }
            }
            if (w.lIlIlIIIIIIIIIl(e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[17])) {
                Prayers.disableAll();
                var37 = new WorldPoint(lIIlIIIIlIlll[48], lIIlIIIIlIlll[49], lIIlIIIIlIlll[0]);
                if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var37), lIIlIIIIlIlll[16]) && w.lIlIlIIIIIIIIIl(Players.getLocal().getAnimation(), lIIlIIIIlIlll[294])) {
                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[295]];
                    Movement.walkTo((WorldPoint)var37);
                    0;
                    Time.sleepTicks((int)lIIlIIIIlIlll[1]);
                    0;
                }
                if (w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var37), lIIlIIIIlIlll[16])) {
                    if (w.lIlIIlllllllIIl(co, lIIlIIIIlIlll[1])) {
                        P.lz += lIIlIIIIlIlll[1];
                        P.d(AccBuilderRat.m);
                        co += lIIlIIIIlIlll[1];
                        P.lz = lIIlIIIIlIlll[0];
                        cp = lIIlIIIIlIlll[0];
                    }
                    g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[296]], bW, lIIlIIIIlIlll[1]);
                }
            }
            int[] nArray = new int[lIIlIIIIlIlll[1]];
            nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
            if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray47 = new int[lIIlIIIIlIlll[1]];
                nArray47[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                if (w.lIlIIlllllllIlI(Equipment.contains((int[])nArray47) ? 1 : 0) && w.lIlIIllllllllII(e.j(lIIlIIIIlIlll[14]))) {
                    int[] nArray48 = new int[lIIlIIIIlIlll[1]];
                    nArray48[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                    Inventory.getFirst((int[])nArray48).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[297]]);
                }
            }
            String[] stringArray = new String[lIIlIIIIlIlll[1]];
            stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[298]];
            if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                fS = lIIlIIIIlIlll[1];
                fR = lIIlIIIIlIlll[1];
                fP = lIIlIIIIlIlll[1];
                fQ = lIIlIIIIlIlll[1];
            }
            int[] nArray49 = new int[lIIlIIIIlIlll[1]];
            nArray49[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[3];
            if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray49) ? 1 : 0)) {
                fR = lIIlIIIIlIlll[1];
            }
            int[] nArray50 = new int[lIIlIIIIlIlll[1]];
            nArray50[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[4];
            if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray50) ? 1 : 0)) {
                fP = lIIlIIIIlIlll[1];
            }
            int[] nArray51 = new int[lIIlIIIIlIlll[1]];
            nArray51[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[5];
            if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray51) ? 1 : 0)) {
                fQ = lIIlIIIIlIlll[1];
            }
            if (w.lIlIlIIIIIIIIIl(e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[23])) {
                String[] stringArray77 = new String[lIIlIIIIlIlll[1]];
                stringArray77[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[299]];
                if (w.lIlIIlllllllllI(NPCs.getNearest((String[])stringArray77))) {
                    int[] nArray52 = new int[lIIlIIIIlIlll[1]];
                    nArray52[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                    if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray52) ? 1 : 0)) {
                        int[] nArray53 = new int[lIIlIIIIlIlll[1]];
                        nArray53[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                        Inventory.getFirst((int[])nArray53).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[300]]);
                        Time.sleepTicks((int)lIIlIIIIlIlll[12]);
                        0;
                    }
                }
            }
            if (w.lIlIlIIIIIIIIIl(e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[23]) && w.lIlIIlllllllIII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            System.out.println("Setting: " + e.j(lIIlIIIIlIlll[14]));
        }
        g.a(new String[lIIlIIIIlIlll[0]]);
    }

    private static String lIlIIlllIIlIlll(String var13, String var19) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var28 = var19.toCharArray();
        int var30 = lIIlIIIIlIlll[0];
        char[] var22 = var13.toCharArray();
        int var5 = var22.length;
        int var25 = lIIlIIIIlIlll[0];
        while (w.lIlIIlllllllIIl(var25, var5)) {
            char var6 = var22[var25];
            var24.append((char)(var6 ^ var28[var30 % var28.length]));
            0;
            ++var30;
            ++var25;
            0;
            if (((0x2F ^ 0x20) & ~(0x84 ^ 0x8B)) < 3) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    @Override
    public String Z() {
        return lIIlIIIIIlIIl[lIIlIIIIlIlll[315]];
    }

    private static boolean lIlIlIIIIIIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean S() {
        void var36;
        int[] nArray = new int[lIIlIIIIlIlll[9]];
        nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
        nArray[w.lIIlIIIIlIlll[1]] = lIIlIIIIlIlll[37];
        nArray[w.lIIlIIIIlIlll[2]] = lIIlIIIIlIlll[46];
        nArray[w.lIIlIIIIlIlll[7]] = lIIlIIIIlIlll[39];
        int[] nArray2 = nArray;
        int var26 = lIIlIIIIlIlll[0];
        while (w.lIlIIlllllllIIl(var26, ((void)var36).length)) {
            int[] nArray3 = new int[lIIlIIIIlIlll[1]];
            nArray3[w.lIIlIIIIlIlll[0]] = var36[var26];
            if (w.lIlIIlllllllIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIlIIIIlIlll[0];
            }
            ++var26;
            0;
            if ((0x70 ^ 0x17 ^ (0xDD ^ 0xBF)) != 0) continue;
            return ((0x45 ^ 0x4D ^ (1 ^ 0x5B)) & (0x1F ^ 0x2C ^ (0x69 ^ 8) ^ -1)) != 0;
        }
        return lIIlIIIIlIlll[1];
    }

    private static boolean lIlIIllllllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static int lIlIIllllllIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIIllllllllII(int n2) {
        return n2 > 0;
    }

    private static void lIlIIllllllIllI() {
        lIIlIIIIlIlll = new int[366];
        w.lIIlIIIIlIlll[0] = (36 + 145 - 91 + 84 ^ 85 + 124 - 144 + 85) & (172 + 107 - 194 + 89 ^ 124 + 90 - 121 + 57 ^ -1);
        w.lIIlIIIIlIlll[1] = 1;
        w.lIIlIIIIlIlll[2] = 2;
        w.lIIlIIIIlIlll[3] = 0xFFFFF7FF & 0xDFF;
        w.lIIlIIIIlIlll[4] = -(0xFFFFFC71 & 0x6BBF) & (0xFFFFEFBB & 0x7E75);
        w.lIIlIIIIlIlll[5] = -(0xFFFFDB4E & 0x64BF) & (0xFFFFEEED & 0x571F);
        w.lIIlIIIIlIlll[6] = 18 + 121 - 94 + 117 ^ 24 + 123 - 88 + 85;
        w.lIIlIIIIlIlll[7] = 3;
        w.lIIlIIIIlIlll[8] = 0xD1 ^ 0x8D ^ (0x7F ^ 0x3B);
        w.lIIlIIIIlIlll[9] = 0xC ^ 0x7B ^ (0x67 ^ 0x14);
        w.lIIlIIIIlIlll[10] = 0x2D ^ 0x39;
        w.lIIlIIIIlIlll[11] = 0x48 ^ 0x4D;
        w.lIIlIIIIlIlll[12] = 0x1C ^ 0x1A;
        w.lIIlIIIIlIlll[13] = 0x2C ^ 0x2B;
        w.lIIlIIIIlIlll[14] = (0x4B ^ 0x77) + (39 + 133 - 110 + 87) - (125 + 130 - 100 + 27) + (12 + 145 - 35 + 27);
        w.lIIlIIIIlIlll[15] = 0x8A ^ 0xAA;
        w.lIIlIIIIlIlll[16] = 159 + 121 - 256 + 177 ^ 191 + 175 - 250 + 77;
        w.lIIlIIIIlIlll[17] = 0x6D ^ 0x51 ^ (0xA0 ^ 0x95);
        w.lIIlIIIIlIlll[18] = 0xFFFFB7BB & 0x5BCC;
        w.lIIlIIIIlIlll[19] = 0xFFFF9FE7 & 0x7F5F;
        w.lIIlIIIIlIlll[20] = 0x78 ^ 0x77;
        w.lIIlIIIIlIlll[21] = -(0xFFFFF5B7 & 0x4AFF) & (0xFFFFFFFF & 0x5FFF);
        w.lIIlIIIIlIlll[22] = -(0xFFFFD8FF & 0x67B5) & (0xFFFFDFFD & 0x7FFE);
        w.lIIlIIIIlIlll[23] = 181 + 184 - 230 + 55 ^ 125 + 46 - 105 + 114;
        w.lIIlIIIIlIlll[24] = 0xFFFFDF73 & 0x268F;
        w.lIIlIIIIlIlll[25] = 0x3F ^ 0x2C ^ (0xC6 ^ 0x8F);
        w.lIIlIIIIlIlll[26] = 0x64 ^ 0x6F;
        w.lIIlIIIIlIlll[27] = 0xFFFF8BCB & 0x77F4;
        w.lIIlIIIIlIlll[28] = 10 + 186 - 96 + 100 ^ 104 + 42 - 122 + 172;
        w.lIIlIIIIlIlll[29] = 0x6D ^ 0x57 ^ (4 ^ 0x2F);
        w.lIIlIIIIlIlll[30] = 0xFFFFAFFF & 0x56FF;
        w.lIIlIIIIlIlll[31] = -(0xFFFFB16F & 0x6E9D) & (0xFFFFF7FF & 0x2F7F);
        w.lIIlIIIIlIlll[32] = -(0xFFFFD697 & 0x3DFB) & (0xFFFFDDBF & 0x37FF);
        w.lIIlIIIIlIlll[33] = -(0xFFFFE4C6 & 0x7F3B) & (0xFFFFF7B7 & 0x6FFF);
        w.lIIlIIIIlIlll[34] = 0xFFFFDB3F & 0x2DEB;
        w.lIIlIIIIlIlll[35] = -(0xFFFFDFFD & 0x6E6F) & (0xFFFFFFFD & 0x4FEF);
        w.lIIlIIIIlIlll[36] = -(0xFFFFEFFE & 0x797D) & (0xFFFFFFFF & 0x6F7F);
        w.lIIlIIIIlIlll[37] = -(0xFFFFFE3F & 0x4DCB) & (0xFFFFFD5B & Short.MAX_VALUE);
        w.lIIlIIIIlIlll[38] = 0x65 ^ 0x68;
        w.lIIlIIIIlIlll[39] = 0xFFFFF9FD & 0xF96;
        w.lIIlIIIIlIlll[40] = 0x59 ^ 0x57;
        w.lIIlIIIIlIlll[41] = -(0xFFFFFFCF & 0x4679) & (0xFFFFF7DF & Short.MAX_VALUE);
        w.lIIlIIIIlIlll[42] = -(0xFFFFDE97 & 0x717D) & (0xFFFFFFDF & 0x7EFE);
        w.lIIlIIIIlIlll[43] = 0x5D ^ 0x1D ^ (0xF3 ^ 0xA3);
        w.lIIlIIIIlIlll[44] = 0xFFFFDFB5 & 0x257F;
        w.lIIlIIIIlIlll[45] = -(0xFFFFBEF7 & 0x7349) & (0xFFFFBFD3 & 0x7BEE);
        w.lIIlIIIIlIlll[46] = -(0xFFFFF55D & 0x3EB7) & (0xFFFFF7F7 & 0x3FFF);
        w.lIIlIIIIlIlll[47] = 0xFFFFBB9F & 0x7EF8;
        w.lIIlIIIIlIlll[48] = -(0xFFFF9839 & 0x77C7) & (0xFFFFBBFD & 0x5FFF);
        w.lIIlIIIIlIlll[49] = -(0xFFFFEF4B & 0x70B7) & (0xFFFFFDBF & 0x6FFF);
        w.lIIlIIIIlIlll[50] = 0x9C ^ 0x8E;
        w.lIIlIIIIlIlll[51] = 0x1B ^ 0x43 ^ (0x11 ^ 0x5A);
        w.lIIlIIIIlIlll[52] = 37 + 52 - -14 + 69 ^ 78 + 2 - -63 + 42;
        w.lIIlIIIIlIlll[53] = 0xB9 ^ 0xAF;
        w.lIIlIIIIlIlll[54] = 0xFFFFAEE5 & 0x5FBA;
        w.lIIlIIIIlIlll[55] = 2 ^ 0x15;
        w.lIIlIIIIlIlll[56] = 0x1B ^ 2;
        w.lIIlIIIIlIlll[57] = 0x78 ^ 0x62;
        w.lIIlIIIIlIlll[58] = 0x26 ^ 0x3D;
        w.lIIlIIIIlIlll[59] = -(0xFFFFFD57 & 0x33EF) & (0xFFFFFFF7 & 0x3FEF);
        w.lIIlIIIIlIlll[60] = 0xB3 ^ 0xA2 ^ (0x9A ^ 0x97);
        w.lIIlIIIIlIlll[61] = 0x31 ^ 0x2C;
        w.lIIlIIIIlIlll[62] = -(0xFFFFFB0E & 0x35FB) & (0xFFFFBFFF & 0x7FAB);
        w.lIIlIIIIlIlll[63] = 0x5A ^ 0x44;
        w.lIIlIIIIlIlll[64] = -(0xFFFFD38B & 0x7D75) & (0xFFFFDFFE & 0x7F9F);
        w.lIIlIIIIlIlll[65] = 0 ^ 0x1F;
        w.lIIlIIIIlIlll[66] = 0xAC ^ 0x8D;
        w.lIIlIIIIlIlll[67] = 0xFFFF9EFF & 0x6F9F;
        w.lIIlIIIIlIlll[68] = 18 + 145 - 60 + 126 ^ 167 + 110 - 133 + 55;
        w.lIIlIIIIlIlll[69] = 0x7D ^ 0x34 ^ (0x13 ^ 0x79);
        w.lIIlIIIIlIlll[70] = 86 + 130 - 211 + 174 ^ 4 + 2 - -112 + 33;
        w.lIIlIIIIlIlll[71] = 0xF3 ^ 0x93 ^ (0x45 ^ 0);
        w.lIIlIIIIlIlll[72] = 84 + 32 - -34 + 1 + (117 + 62 - 103 + 61) - (47 + 102 - 129 + 225) + (130 + 94 - 150 + 60);
        w.lIIlIIIIlIlll[73] = -(0xFFFFFDDF & 0xAE8) & (0xFFFFBFEF & 0x4FFF);
        w.lIIlIIIIlIlll[74] = 79 + 125 - 104 + 64 ^ 14 + 5 - -48 + 63;
        w.lIIlIIIIlIlll[75] = -(0xFFFFE539 & 0x7EEF) & (0xFFFFEFEE & Short.MAX_VALUE);
        w.lIIlIIIIlIlll[76] = 0xFFFFEDBD & 0x1FEF;
        w.lIIlIIIIlIlll[77] = 67 + 65 - 56 + 59 ^ 117 + 62 - 89 + 70;
        w.lIIlIIIIlIlll[78] = 0x47 ^ 0x6F;
        w.lIIlIIIIlIlll[79] = 111 + 27 - 62 + 64 ^ 144 + 29 - 107 + 99;
        w.lIIlIIIIlIlll[80] = 0xF2 ^ 0xB3 ^ (0x2D ^ 0x46);
        w.lIIlIIIIlIlll[81] = -(0xFFFFBDF6 & 0x735B) & (0xFFFFBFFF & 0x7FF7);
        w.lIIlIIIIlIlll[82] = 112 + 23 - 50 + 74 ^ 97 + 89 - 139 + 133;
        w.lIIlIIIIlIlll[83] = 0xFFFF8EA7 & 0x7FFD;
        w.lIIlIIIIlIlll[84] = 0xBF ^ 0x93;
        w.lIIlIIIIlIlll[85] = 0xFFFFDFFB & 0x2BED;
        w.lIIlIIIIlIlll[86] = -(0xFFFFF5CB & 0x1ABE) & (0xFFFFF6FD & 0x3FFB);
        w.lIIlIIIIlIlll[87] = 0x3F ^ 0x12;
        w.lIIlIIIIlIlll[88] = 0xB6 ^ 0x98;
        w.lIIlIIIIlIlll[89] = 3 ^ (0x31 ^ 0x1D);
        w.lIIlIIIIlIlll[90] = 0x78 ^ 0x5F ^ (0x85 ^ 0x92);
        w.lIIlIIIIlIlll[91] = 56 + 29 - 40 + 106 ^ 10 + 151 - 90 + 95;
        w.lIIlIIIIlIlll[92] = 0x60 ^ 0x3F ^ (4 ^ 0x68);
        w.lIIlIIIIlIlll[93] = 69 + 37 - -66 + 17 ^ 41 + 100 - 132 + 128;
        w.lIIlIIIIlIlll[94] = 29 + 37 - 31 + 104 ^ 73 + 72 - -21 + 24;
        w.lIIlIIIIlIlll[95] = 0x5B ^ 0x38 ^ (0xDE ^ 0x8B);
        w.lIIlIIIIlIlll[96] = 0x43 ^ 0x74;
        w.lIIlIIIIlIlll[97] = 0x95 ^ 0xAD;
        w.lIIlIIIIlIlll[98] = 0xFA ^ 0x84 ^ (0x40 ^ 7);
        w.lIIlIIIIlIlll[99] = 0xF4 ^ 0xB7 ^ (0x3E ^ 0x47);
        w.lIIlIIIIlIlll[100] = 22 + 66 - -15 + 59 ^ 72 + 112 - 181 + 150;
        w.lIIlIIIIlIlll[101] = 0x13 ^ 0x2F;
        w.lIIlIIIIlIlll[102] = 0x20 ^ 0x71 ^ (0xE ^ 0x62);
        w.lIIlIIIIlIlll[103] = 154 + 65 - 184 + 139 ^ 11 + 32 - -49 + 52;
        w.lIIlIIIIlIlll[104] = 27 + 69 - 79 + 112 ^ 30 + 95 - 111 + 176;
        w.lIIlIIIIlIlll[105] = 0xC1 ^ 0x81;
        w.lIIlIIIIlIlll[106] = 0x18 ^ 0x59;
        w.lIIlIIIIlIlll[107] = 0xD0 ^ 0x92;
        w.lIIlIIIIlIlll[108] = 0x1B ^ 0x58;
        w.lIIlIIIIlIlll[109] = 0x1B ^ 0x5F;
        w.lIIlIIIIlIlll[110] = 0x6B ^ 0x2E;
        w.lIIlIIIIlIlll[111] = 95 + 79 - 160 + 116 ^ 138 + 24 - 41 + 75;
        w.lIIlIIIIlIlll[112] = 0x41 ^ 6;
        w.lIIlIIIIlIlll[113] = 0x59 ^ 0x11;
        w.lIIlIIIIlIlll[114] = 0x99 ^ 0xB1 ^ (0x52 ^ 0x33);
        w.lIIlIIIIlIlll[115] = 0x72 ^ 0x2D ^ (0xB8 ^ 0xAD);
        w.lIIlIIIIlIlll[116] = 0xD9 ^ 0x92;
        w.lIIlIIIIlIlll[117] = 0x4B ^ 7;
        w.lIIlIIIIlIlll[118] = 0x5F ^ 0x10 ^ 2;
        w.lIIlIIIIlIlll[119] = 0xEA ^ 0xA6 ^ 2;
        w.lIIlIIIIlIlll[120] = 0xF ^ 0x40;
        w.lIIlIIIIlIlll[121] = 0x1C ^ 0x73 ^ (0x2B ^ 0x14);
        w.lIIlIIIIlIlll[122] = 0x97 ^ 0xC6;
        w.lIIlIIIIlIlll[123] = 0x31 ^ 0x63;
        w.lIIlIIIIlIlll[124] = 0xFB ^ 0xA8;
        w.lIIlIIIIlIlll[125] = 151 + 42 - 120 + 163 ^ 124 + 58 - 123 + 125;
        w.lIIlIIIIlIlll[126] = 0x37 ^ 0x62;
        w.lIIlIIIIlIlll[127] = 0x73 ^ 0x25;
        w.lIIlIIIIlIlll[128] = 0xE9 ^ 0xBE;
        w.lIIlIIIIlIlll[129] = 0xCC ^ 0xB8 ^ (0x7F ^ 0x53);
        w.lIIlIIIIlIlll[130] = 0x6F ^ 0x36;
        w.lIIlIIIIlIlll[131] = 100 + 60 - 106 + 190 ^ 143 + 47 - 77 + 62;
        w.lIIlIIIIlIlll[132] = 0xE2 ^ 0xBE;
        w.lIIlIIIIlIlll[133] = 0x95 ^ 0x87 ^ (0xDA ^ 0x95);
        w.lIIlIIIIlIlll[134] = 0xD5 ^ 0xA6 ^ (0x4B ^ 0x66);
        w.lIIlIIIIlIlll[135] = 0xA1 ^ 0xB3 ^ (0x8F ^ 0xC2);
        w.lIIlIIIIlIlll[136] = 0xE0 ^ 0x80;
        w.lIIlIIIIlIlll[137] = 0x63 ^ 2;
        w.lIIlIIIIlIlll[138] = -(0xFFFFA426 & 0x7BFB) & (0xFFFFFBED & 0x2FF7);
        w.lIIlIIIIlIlll[139] = -(0xFFFFFE5F & 0x61A3) & (0xFFFFFE77 & 0x6DFF);
        w.lIIlIIIIlIlll[140] = 0xFE ^ 0x9C;
        w.lIIlIIIIlIlll[141] = 0x59 ^ 0x3A;
        w.lIIlIIIIlIlll[142] = 0xE4 ^ 0x80;
        w.lIIlIIIIlIlll[143] = 0x44 ^ 0x21;
        w.lIIlIIIIlIlll[144] = 0x22 ^ 0x44;
        w.lIIlIIIIlIlll[145] = 4 ^ 8 ^ (0x55 ^ 0x3E);
        w.lIIlIIIIlIlll[146] = 35 + 160 - 151 + 177 ^ 14 + 34 - 7 + 140;
        w.lIIlIIIIlIlll[147] = 0xE8 ^ 0x89 ^ (0x94 ^ 0x9C);
        w.lIIlIIIIlIlll[148] = 0xFE ^ 0x94;
        w.lIIlIIIIlIlll[149] = -(0xFFFFDFBF & 0x24C5) & (0xFFFF8FEF & 0x7FFE);
        w.lIIlIIIIlIlll[150] = 0xFFFFDDA6 & 0x2EFF;
        w.lIIlIIIIlIlll[151] = -(0xFFFFB59A & 0x7E7F) & (0xFFFFBFFD & 0x7F7F);
        w.lIIlIIIIlIlll[152] = 0xFFFFF5FF & 0x2FA4;
        w.lIIlIIIIlIlll[153] = -(0xFFFFB63B & 0x4DC7) & (0xFFFFCFFF & 0x3F7F);
        w.lIIlIIIIlIlll[154] = -(0xFFFF9F7D & 0x61CA) & (0xFFFFFDF7 & 0xFFF);
        w.lIIlIIIIlIlll[155] = 0xAD ^ 0xC6;
        w.lIIlIIIIlIlll[156] = 0x61 ^ 0x5E ^ (0xD1 ^ 0x82);
        w.lIIlIIIIlIlll[157] = 0xCF ^ 0xA2;
        w.lIIlIIIIlIlll[158] = 0xFFFFCBF9 & 0x3F6F;
        w.lIIlIIIIlIlll[159] = 0xFFFF9CB2 & 0x6FFF;
        w.lIIlIIIIlIlll[160] = -(0xFFFFEDBF & 0x36C1) & (0xFFFFAFFF & 0x7FEB);
        w.lIIlIIIIlIlll[161] = -(0xFFFFF40D & 0x7BFB) & (0xFFFFFCFF & 0x7FBF);
        w.lIIlIIIIlIlll[162] = 0xFFFFFFD7 & 0x62F;
        w.lIIlIIIIlIlll[163] = 0xFFFF8FFA & 0x7B77;
        w.lIIlIIIIlIlll[164] = -(0xFFFFFB5F & 0x25E9) & (0xFFFFADED & Short.MAX_VALUE);
        w.lIIlIIIIlIlll[165] = 0x27 ^ 0x49;
        w.lIIlIIIIlIlll[166] = 0xFFFFFFFD & 0xF83;
        w.lIIlIIIIlIlll[167] = 0x3C ^ 0x74 ^ (0x74 ^ 0x53);
        w.lIIlIIIIlIlll[168] = 0xB1 ^ 0xC1;
        w.lIIlIIIIlIlll[169] = 0xFFFFFB7F & 0xFEE;
        w.lIIlIIIIlIlll[170] = -(0xFFFFF54B & 0x2BF5) & (0xFFFFEFFF & 0x3DF5);
        w.lIIlIIIIlIlll[171] = 0xB2 ^ 0xC3;
        w.lIIlIIIIlIlll[172] = 0 ^ 0x72;
        w.lIIlIIIIlIlll[173] = 0x42 ^ 7 ^ (0x93 ^ 0xA5);
        w.lIIlIIIIlIlll[174] = 0xCA ^ 0xBE;
        w.lIIlIIIIlIlll[175] = 0x67 ^ 0x12;
        w.lIIlIIIIlIlll[176] = 0xFFFF8BFD & 0x7F7A;
        w.lIIlIIIIlIlll[177] = -(0xFFFFFEFB & 0x215E) & (0xFFFFADFD & 0x7EFF);
        w.lIIlIIIIlIlll[178] = 0xFFFFAF6B & 0x569C;
        w.lIIlIIIIlIlll[179] = 39 + 51 - 33 + 150 ^ 21 + 103 - 81 + 142;
        w.lIIlIIIIlIlll[180] = 0xFFFFCFA7 & 0x3FDF;
        w.lIIlIIIIlIlll[181] = 134 + 25 - -82 + 8 ^ 33 + 15 - 1 + 95;
        w.lIIlIIIIlIlll[182] = 0x68 ^ 0x3C ^ (0x53 ^ 0x7F);
        w.lIIlIIIIlIlll[183] = 0xFFFF8B73 & Short.MAX_VALUE;
        w.lIIlIIIIlIlll[184] = -(0xFFFFA2EC & 0x7F17) & (0xFFFFAFF7 & 0x7EBF);
        w.lIIlIIIIlIlll[185] = 0xED ^ 0x94;
        w.lIIlIIIIlIlll[186] = 0xCA ^ 0xBF ^ (0xB8 ^ 0xB7);
        w.lIIlIIIIlIlll[187] = 0x7A ^ 0x16 ^ (0x97 ^ 0x80);
        w.lIIlIIIIlIlll[188] = 0xD5 ^ 0xA9;
        w.lIIlIIIIlIlll[189] = 0xFFFF877F & 0x7E89;
        w.lIIlIIIIlIlll[190] = 0x59 ^ 0x2F ^ (2 ^ 9);
        w.lIIlIIIIlIlll[191] = 0xFFFFCFEE & 0x3F95;
        w.lIIlIIIIlIlll[192] = 0x31 ^ 0x4F;
        w.lIIlIIIIlIlll[193] = (0x6A ^ 4) + 1 - (0x1E ^ 0x13) + (0x68 ^ 0x75);
        w.lIIlIIIIlIlll[194] = -(0xFFFFECFF & 0x7794) & (0xFFFFFFFF & 0x6FFF);
        w.lIIlIIIIlIlll[195] = (0xB1 ^ 0x86) + (0x4F ^ 0x14) - (93 + 34 - 0 + 2) + (0xDE ^ 0xB1);
        w.lIIlIIIIlIlll[196] = (0x4B ^ 0x18) + (0x37 ^ 0x2D) - (0x7E ^ 0x17) + (0x23 ^ 0x5E);
        w.lIIlIIIIlIlll[197] = 12 + 79 - -22 + 17;
        w.lIIlIIIIlIlll[198] = 44 + 126 - 58 + 19;
        w.lIIlIIIIlIlll[199] = 0xFFFFDB7F & 0x2FFB;
        w.lIIlIIIIlIlll[200] = 0xFFFFADB9 & 0x5EEE;
        w.lIIlIIIIlIlll[201] = 3 + 110 - -19 + 0;
        w.lIIlIIIIlIlll[202] = 55 + 123 - 132 + 87;
        w.lIIlIIIIlIlll[203] = -(0xFFFFCAA6 & 0x7F5D) & (0xFFFFEFFF & 0x7FB7);
        w.lIIlIIIIlIlll[204] = 0xFFFFFB75 & 0xFFF;
        w.lIIlIIIIlIlll[205] = 0xFFFFA7FF & 0x7DAE;
        w.lIIlIIIIlIlll[206] = 0xFFFFF5EB & 0x2FBF;
        w.lIIlIIIIlIlll[207] = -(0xFFFFE9F2 & 0x763F) & (0xFFFFF6BF & 0x6F7B);
        w.lIIlIIIIlIlll[208] = 44 + 103 - 40 + 27;
        w.lIIlIIIIlIlll[209] = -(0xFFFF9163 & 0x7EFE) & (0xFFFFDFFF & 0x3FED);
        w.lIIlIIIIlIlll[210] = (8 ^ 1) + (0x3C ^ 0x19) - -(0x11 ^ 0x1C) + (0xE1 ^ 0xAD);
        w.lIIlIIIIlIlll[211] = 38 + 115 - 77 + 60;
        w.lIIlIIIIlIlll[212] = -(0xFFFFAEDD & 0x5336) & (0xFFFFE7BF & 0x3FFF);
        w.lIIlIIIIlIlll[213] = (0x20 ^ 0x69) + (0x74 ^ 0x30) - (0x62 ^ 0x5B) + (0x20 ^ 0x15);
        w.lIIlIIIIlIlll[214] = 61 + 99 - 83 + 61;
        w.lIIlIIIIlIlll[215] = 129 + 87 - 161 + 84;
        w.lIIlIIIIlIlll[216] = 0xFFFFAE8F & 0x577B;
        w.lIIlIIIIlIlll[217] = 61 + 1 - -25 + 53;
        w.lIIlIIIIlIlll[218] = 0xFFFFFBF7 & 0x73F;
        w.lIIlIIIIlIlll[219] = (0xF7 ^ 0xB9) + (0x24 ^ 0xD) - (0 ^ 0x4C) + (0xCA ^ 0xA8);
        w.lIIlIIIIlIlll[220] = (0x4C ^ 0x53) + (0xB ^ 0x44) - -(1 ^ 0xC) + (0x6E ^ 0x7D);
        w.lIIlIIIIlIlll[221] = 0xFFFFFF7F & 0xBF1;
        w.lIIlIIIIlIlll[222] = 0xFFFFEFB3 & 0x35FF;
        w.lIIlIIIIlIlll[223] = 103 + 12 - 21 + 42 + (0xF8 ^ 0xB2) - (0x32 ^ 0x53) + (0xA7 ^ 0xB9);
        w.lIIlIIIIlIlll[224] = (0xD8 ^ 0xB6) + (0xB9 ^ 0xC5) - (105 + 28 - -47 + 32) + (0x45 ^ 0x3F);
        w.lIIlIIIIlIlll[225] = (0x91 ^ 0x9A) + (0x66 ^ 0x69) - -(0x19 ^ 0x27) + (1 ^ 0x38);
        w.lIIlIIIIlIlll[226] = 64 + 20 - 79 + 141;
        w.lIIlIIIIlIlll[227] = -(0xFFFFBB79 & 0x75E7) & (0xFFFFBF6D & 0x77FE);
        w.lIIlIIIIlIlll[228] = 29 + 55 - -39 + 14 + (0x31 ^ 0x20) - (24 + 14 - -95 + 11) + (86 + 114 - 153 + 90);
        w.lIIlIIIIlIlll[229] = (0xAF ^ 0x8F) + (0xD4 ^ 0xB8) - 2 + (2 ^ 8);
        w.lIIlIIIIlIlll[230] = -(0xFFFF989F & 0x7F69) & (0xFFFFBFBF & 0x7DFF);
        w.lIIlIIIIlIlll[231] = 123 + 78 - 194 + 125 + (43 + 31 - 56 + 119) - (115 + 62 - 170 + 135) + (0x55 ^ 0x43);
        w.lIIlIIIIlIlll[232] = (0x53 ^ 0x34) + (117 + 112 - 221 + 121) - (65 + 70 - 85 + 120) + (0xF6 ^ 0xAE);
        w.lIIlIIIIlIlll[233] = 141 + 17 - 122 + 115;
        w.lIIlIIIIlIlll[234] = 29 + 114 - 40 + 49;
        w.lIIlIIIIlIlll[235] = 110 + 89 - 103 + 57;
        w.lIIlIIIIlIlll[236] = 28 + 130 - 51 + 38 + (25 + 79 - 94 + 141) - (183 + 18 - 99 + 106) + (0x1B ^ 0x59);
        w.lIIlIIIIlIlll[237] = 25 + 106 - -5 + 19;
        w.lIIlIIIIlIlll[238] = 85 + 72 - 85 + 84;
        w.lIIlIIIIlIlll[239] = 53 + 60 - -19 + 25;
        w.lIIlIIIIlIlll[240] = 76 + 44 - 103 + 141;
        w.lIIlIIIIlIlll[241] = 51 + 88 - 76 + 96;
        w.lIIlIIIIlIlll[242] = 136 + 126 - 244 + 142;
        w.lIIlIIIIlIlll[243] = 127 + 128 - 152 + 58;
        w.lIIlIIIIlIlll[244] = (0x3C ^ 0x6A) + 2 - (0x18 ^ 0xA) + (0x63 ^ 0x3F);
        w.lIIlIIIIlIlll[245] = 154 + 126 - 165 + 41 + (0xA8 ^ 0x83) - (85 + 138 - 96 + 26) + (0x13 ^ 0x66);
        w.lIIlIIIIlIlll[246] = (0x80 ^ 0xBA) + (18 + 17 - 33 + 142) - (29 + 51 - 23 + 79) + (0x41 ^ 0x23);
        w.lIIlIIIIlIlll[247] = 84 + 56 - 41 + 66;
        w.lIIlIIIIlIlll[248] = 117 + 36 - 146 + 159;
        w.lIIlIIIIlIlll[249] = 165 + 91 - 216 + 127;
        w.lIIlIIIIlIlll[250] = 108 + 43 - 144 + 161;
        w.lIIlIIIIlIlll[251] = (0x3D ^ 0x47) + (164 + 93 - 213 + 124) - (0xE6 ^ 0x9F) + ((0x10 ^ 0x58) & ~(0x17 ^ 0x5F));
        w.lIIlIIIIlIlll[252] = (0x23 ^ 0xD) + (115 + 30 - -2 + 17) - (63 + 71 - 83 + 77) + (4 ^ 0x5C);
        w.lIIlIIIIlIlll[253] = (0x49 ^ 0x72) + (0xC ^ 0x50) - (0x5A ^ 0x3F) + (0x53 ^ 0x2A);
        w.lIIlIIIIlIlll[254] = 1 + (56 + 88 - 68 + 75) - (0xC5 ^ 0xA9) + (8 + 83 - -8 + 29);
        w.lIIlIIIIlIlll[255] = (0xDD ^ 0x86) + (32 + 85 - 85 + 104) - (106 + 36 - 3 + 2) + (0xFD ^ 0xAA);
        w.lIIlIIIIlIlll[256] = (0x7E ^ 0x1C) + (0xE2 ^ 0xA4) - (0x49 ^ 0x62) + (0x70 ^ 0x41);
        w.lIIlIIIIlIlll[257] = 64 + 46 - -20 + 45;
        w.lIIlIIIIlIlll[258] = -(0xFFFFF1E7 & 0x4E19) & (0xFFFFDE3A & 0x6DDF);
        w.lIIlIIIIlIlll[259] = -(0xFFFFE5F6 & 0x7A0F) & (0xFFFFEFFF & 0x7CBF);
        w.lIIlIIIIlIlll[260] = (0x81 ^ 0x94) + (0x1A ^ 0x53) - -(0x9A ^ 0x83) + (0x2F ^ 0x14);
        w.lIIlIIIIlIlll[261] = 68 + 83 - 57 + 85;
        w.lIIlIIIIlIlll[262] = 119 + 94 - 177 + 144;
        w.lIIlIIIIlIlll[263] = 131 + 70 - 106 + 86;
        w.lIIlIIIIlIlll[264] = 77 + 146 - 65 + 24;
        w.lIIlIIIIlIlll[265] = (0x92 ^ 0xB1) + (0x47 ^ 9) - -(0xD2 ^ 0xC6) + (0x1A ^ 0x28);
        w.lIIlIIIIlIlll[266] = 134 + 53 - 45 + 42;
        w.lIIlIIIIlIlll[267] = (0x45 ^ 0x42) + (0x7A ^ 0x40) - -(0xDC ^ 0x88) + (0x41 ^ 0x65);
        w.lIIlIIIIlIlll[268] = (0x15 ^ 0x3A) + (23 + 130 - 88 + 76) - (0x8C ^ 0x99) + (0xBE ^ 0xAD);
        w.lIIlIIIIlIlll[269] = -(0xFFFFCCDF & 0x7772) & (0xFFFFCF7D & 0x7FDB);
        w.lIIlIIIIlIlll[270] = -(0xFFFFCB39 & 0x76CF) & (0xFFFFE7DF & 0x7FBF);
        w.lIIlIIIIlIlll[271] = -(0xFFFFDDFF & 0x36CA) & (0xFFFFDFDB & 0x3FFF);
        w.lIIlIIIIlIlll[272] = 89 + 102 - 161 + 116 + (7 ^ 0x3C) - (66 + 128 - 130 + 101) + (95 + 47 - 34 + 39);
        w.lIIlIIIIlIlll[273] = (0x5F ^ 0x6E) + (0x2F ^ 0x60) - (0x80 ^ 0xBD) + (0x3E ^ 0x47);
        w.lIIlIIIIlIlll[274] = (0x74 ^ 0x19) + (149 + 32 - 166 + 141) - (53 + 114 - 153 + 131) + (0x65 ^ 0x20);
        w.lIIlIIIIlIlll[275] = 158 + 150 - 264 + 146;
        w.lIIlIIIIlIlll[276] = 0xFFFF8FBF & 0x7B5D;
        w.lIIlIIIIlIlll[277] = 178 + 129 - 154 + 38;
        w.lIIlIIIIlIlll[278] = 36 + 128 - 110 + 122 + (0xC1 ^ 0xBB) - (142 + 170 - 97 + 5) + (0xCA ^ 0xB8);
        w.lIIlIIIIlIlll[279] = 87 + 26 - 16 + 52 + (41 + 50 - -43 + 11) - (100 + 97 - 90 + 131) + (5 + 32 - 11 + 111);
        w.lIIlIIIIlIlll[280] = 77 + 159 - 129 + 70 + (0x6D ^ 7) - (0xFFFFB91F & 0x47F8) + (183 + 25 - 154 + 137);
        w.lIIlIIIIlIlll[281] = 63 + 36 - 43 + 95 + (0x2A ^ 0x46) - (0x1B ^ 0x77) + (0x7D ^ 0x51);
        w.lIIlIIIIlIlll[282] = (0xD8 ^ 0xB2) + (0x1A ^ 0x5E) - (0x3A ^ 0x2F) + (0 ^ 0x2B);
        w.lIIlIIIIlIlll[283] = (0xF6 ^ 0x9F) + (0x3A ^ 0x6F) - (0x8B ^ 0xA5) + (0x86 ^ 0xB3);
        w.lIIlIIIIlIlll[284] = 80 + 182 - 246 + 182;
        w.lIIlIIIIlIlll[285] = 159 + 55 - 22 + 7;
        w.lIIlIIIIlIlll[286] = 40 + 61 - -32 + 67;
        w.lIIlIIIIlIlll[287] = 116 + 1 - -23 + 61;
        w.lIIlIIIIlIlll[288] = 0 + 17 - -18 + 167;
        w.lIIlIIIIlIlll[289] = 45 + 155 - 146 + 149;
        w.lIIlIIIIlIlll[290] = (0xEE ^ 0x8E) + (128 + 120 - 142 + 78) - (128 + 41 - -17 + 7) + (0x58 ^ 0x2D);
        w.lIIlIIIIlIlll[291] = 0xFFFFBFED & 0x4F9F;
        w.lIIlIIIIlIlll[292] = 141 + 63 - 74 + 75;
        w.lIIlIIIIlIlll[293] = (0x20 ^ 0x17) + 2 - -(0x35 ^ 0x7B) + (0x2E ^ 0x69);
        w.lIIlIIIIlIlll[294] = -1;
        w.lIIlIIIIlIlll[295] = 61 + 44 - 54 + 156;
        w.lIIlIIIIlIlll[296] = (0xF5 ^ 0x8F) + (58 + 36 - 32 + 114) - (0xFFFFC999 & 0x377F) + (127 + 125 - 225 + 164);
        w.lIIlIIIIlIlll[297] = 96 + 97 - 151 + 167;
        w.lIIlIIIIlIlll[298] = 178 + 203 - 184 + 13;
        w.lIIlIIIIlIlll[299] = 68 + 44 - 11 + 62 + (62 + 137 - 106 + 68) - (148 + 45 - 18 + 3) + (0xFA ^ 0xBB);
        w.lIIlIIIIlIlll[300] = 132 + 59 - 147 + 105 + (0xC0 ^ 0x92) - (7 ^ 0x3F) + (0x49 ^ 0x6C);
        w.lIIlIIIIlIlll[301] = 166 + 121 - 149 + 75;
        w.lIIlIIIIlIlll[302] = (0x26 ^ 0x50) + (14 + 2 - -169 + 12) - (0xFFFFA93F & 0x57F9) + (48 + 165 - 17 + 16);
        w.lIIlIIIIlIlll[303] = (0x8A ^ 0x90) + (67 + 73 - 58 + 66) - (0x41 ^ 0x62) + (0x2C ^ 0x60);
        w.lIIlIIIIlIlll[304] = (0xC6 ^ 0x8D) + (0xCB ^ 0x88) - -(0xCB ^ 0x8D) + (0x86 ^ 0x82);
        w.lIIlIIIIlIlll[305] = -(0xFFFFF97D & 0x57B7) & (0xFFFFDFB6 & 0x777F);
        w.lIIlIIIIlIlll[306] = 197 + 26 - 98 + 92;
        w.lIIlIIIIlIlll[307] = 162 + 166 - 127 + 17;
        w.lIIlIIIIlIlll[308] = 154 + 59 - 74 + 55 + (0x77 ^ 0xE) - (0xF7 ^ 0x9A) + (0x1F ^ 0x12);
        w.lIIlIIIIlIlll[309] = -(0xFFFFFE5D & 0x3DBA) & (0xFFFFFFFF & 0x3FFF);
        w.lIIlIIIIlIlll[310] = 0xFFFFDEEF & 0x6F30;
        w.lIIlIIIIlIlll[311] = -(0xFFFFF465 & 0x1F9B) & (0xFFFFFFA9 & 0x75FE);
        w.lIIlIIIIlIlll[312] = -(0xFFFFDE79 & 0x75C7) & (0xFFFFDDF9 & 0xFEFE);
        w.lIIlIIIIlIlll[313] = 0xFFFFEFED & 0x3EDE;
        w.lIIlIIIIlIlll[314] = 0xFFFFD5B4 & 0x2F5F;
        w.lIIlIIIIlIlll[315] = 124 + 43 - -25 + 28;
        w.lIIlIIIIlIlll[316] = 70 + 73 - -76 + 2;
        w.lIIlIIIIlIlll[317] = (0x29 ^ 0x40) + (0xCB ^ 0x81) - -(8 ^ 0x28) + (0x71 ^ 0x7A);
        w.lIIlIIIIlIlll[318] = 116 + 204 - 220 + 123;
        w.lIIlIIIIlIlll[319] = 75 + 114 - 108 + 105 + (2 + 137 - 97 + 132) - (0xFFFFE77E & 0x19AD) + (43 + 138 - 118 + 101);
        w.lIIlIIIIlIlll[320] = 179 + 216 - 289 + 119;
        w.lIIlIIIIlIlll[321] = (0x7F ^ 0x64) + (0x80 ^ 0xA3) - -(136 + 97 - 186 + 116) + 1;
        w.lIIlIIIIlIlll[322] = 176 + 109 - 168 + 110;
        w.lIIlIIIIlIlll[323] = 56 + 134 - 9 + 47;
        w.lIIlIIIIlIlll[324] = (0xD6 ^ 0x8D) + (0x43 ^ 0x21) - -(0x1F ^ 0x19) + (0x92 ^ 0xB0);
        w.lIIlIIIIlIlll[325] = 34 + 212 - 154 + 138;
        w.lIIlIIIIlIlll[326] = (4 ^ 0x7A) + (0x57 ^ 3) - (94 + 81 - 166 + 161) + (10 + 78 - -51 + 52);
        w.lIIlIIIIlIlll[327] = 171 + 46 - 142 + 157;
        w.lIIlIIIIlIlll[328] = 105 + 71 - 169 + 184 + (0xFA ^ 0x82) - (158 + 111 - 170 + 115) + (111 + 84 - 70 + 11);
        w.lIIlIIIIlIlll[329] = 197 + 88 - 87 + 36;
        w.lIIlIIIIlIlll[330] = (0x25 ^ 0x1D) + (57 + 3 - -53 + 26) - (0x67 ^ 0x7F) + (0x5A ^ 0x1A);
        w.lIIlIIIIlIlll[331] = (0xBC ^ 0x9F) + (0x49 ^ 0x73) - -(0x8B ^ 0xAB) + (0xC8 ^ 0xA7);
        w.lIIlIIIIlIlll[332] = 87 + 175 - 151 + 126;
        w.lIIlIIIIlIlll[333] = 194 + 187 - 378 + 235;
        w.lIIlIIIIlIlll[334] = 94 + 33 - -94 + 18;
        w.lIIlIIIIlIlll[335] = 72 + 158 - 143 + 153;
        w.lIIlIIIIlIlll[336] = 133 + 28 - -7 + 13 + (0xC ^ 0x3E) - (43 + 75 - 58 + 68) + (108 + 93 - 81 + 18);
        w.lIIlIIIIlIlll[337] = (0x5B ^ 0xA) + (33 + 177 - 117 + 89) - (156 + 28 - -8 + 3) + (171 + 18 - 47 + 32);
        w.lIIlIIIIlIlll[338] = 146 + 4 - 61 + 154;
        w.lIIlIIIIlIlll[339] = 18 + 112 - -41 + 73;
        w.lIIlIIIIlIlll[340] = 186 + 136 - 288 + 211;
        w.lIIlIIIIlIlll[341] = 0xFFFFFE77 & 0xDFF;
        w.lIIlIIIIlIlll[342] = 0xFFFFBDFF & 0x4F22;
        w.lIIlIIIIlIlll[343] = 0xFFFFCFFD & 0x3BFE;
        w.lIIlIIIIlIlll[344] = -(0xFFFFFBDB & 0x3665) & (0xFFFFFFFF & 0x3FFE);
        w.lIIlIIIIlIlll[345] = -(0xFFFFBCD7 & 0x533D) & (0xFFFFDCFF & 0x3F9E);
        w.lIIlIIIIlIlll[346] = 0xFFFFFFF6 & 0xC9F;
        w.lIIlIIIIlIlll[347] = -(0xFFFFEDFB & 0x760E) & (0xFFFFFFFF & 0x6FEF);
        w.lIIlIIIIlIlll[348] = 0xFFFFCE97 & 0x3DEB;
        w.lIIlIIIIlIlll[349] = 20 + 73 - -144 + 9;
        w.lIIlIIIIlIlll[350] = 126 + 206 - 209 + 89 + ((0x72 ^ 0x30) & ~(0x1E ^ 0x5C)) - (147 + 22 - 114 + 96) + (138 + 74 - 183 + 157);
        w.lIIlIIIIlIlll[351] = (0x44 ^ 0x5A) + (93 + 44 - 95 + 124) - (0xF ^ 0x36) + (0x58 ^ 0x35);
        w.lIIlIIIIlIlll[352] = (0x5E ^ 0x66) + (151 + 49 - 43 + 25) - (168 + 182 - 168 + 32) + (92 + 10 - -33 + 90);
        w.lIIlIIIIlIlll[353] = 38 + 67 - 10 + 60 + (179 + 26 - 72 + 48) - (0x6F ^ 0x1B) + (0x46 ^ 0x58);
        w.lIIlIIIIlIlll[354] = 102 + 11 - 27 + 165;
        w.lIIlIIIIlIlll[355] = 4 + 15 - -107 + 86 + (0xB ^ 0x6E) - (0xC5 ^ 0x98) + (0x3E ^ 0x1E);
        w.lIIlIIIIlIlll[356] = 81 + 172 - 154 + 85 + (0x89 ^ 0xC3) - (0x76 ^ 0x4E) + (0x9F ^ 0xAC);
        w.lIIlIIIIlIlll[357] = 121 + 65 - 4 + 72;
        w.lIIlIIIIlIlll[358] = (0x4E ^ 0x5B) + (124 + 151 - 115 + 4) - -(0x38 ^ 0x79) + (0xB ^ 0xE);
        w.lIIlIIIIlIlll[359] = -(0xFFFFFC9B & 0x67EC) & (0xFFFFE797 & 0x7DEF);
        w.lIIlIIIIlIlll[360] = 0xFFFFB3BF & 0x4D41;
        w.lIIlIIIIlIlll[361] = -(0xFFFFECB1 & 0x576F) & (0xFFFFCFE3 & 0x753E);
        w.lIIlIIIIlIlll[362] = 0xFFFFD5DF & 0x2B23;
        w.lIIlIIIIlIlll[363] = -(0xFFFFBEDB & 0x67ED) & (0xFFFFA7EE & 0x7FDD);
        w.lIIlIIIIlIlll[364] = 0xFFFF9347 & 0x6DBD;
        w.lIIlIIIIlIlll[365] = -(0xFFFFE2DB & 0x7FFE) & (0xFFFFE7DF & 0x7BFF);
    }

    private static boolean lIlIIlllllllIll(int n2) {
        return n2 < 0;
    }

    private static String lIlIIlllIIlIlIl(String var38, String var3) {
        try {
            SecretKeySpec var31 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIIlIIIIlIlll[16]), "DES");
            Cipher var32 = Cipher.getInstance("DES");
            var32.init(lIIlIIIIlIlll[2], var31);
            return new String(var32.doFinal(Base64.getDecoder().decode(var38.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlllllllllI(Object object) {
        return object != null;
    }

    @Override
    public boolean X() {
        return lIIlIIIIlIlll[0];
    }

    private static boolean lIlIlIIIIIIIIll(Object object) {
        return object == null;
    }

    private static boolean lIlIlIIIIIIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIIIIIIIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIlIIlllIIlIllI(String var9, String var35) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var35.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIIlIIIIlIlll[2], var7);
            return new String(var14.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public int Y() {
        try {
            w.bp();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-3 >= 0) {
            return (99 + 0 - -55 + 97 ^ 51 + 33 - -33 + 44) & (0x87 ^ 0xB8 ^ (0x19 ^ 0x7C) ^ -1);
        }
        return lIIlIIIIlIlll[142];
    }

    private static boolean lIlIlIIIIIIIlII(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public boolean aa() {
        int n2;
        if (w.lIlIIllllllllIl(e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[23]) && w.lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
            n2 = lIIlIIIIlIlll[1];
            0;
            if ((0x6A ^ 0x6F) == 0) {
                return false;
            }
        } else {
            n2 = lIIlIIIIlIlll[0];
        }
        return n2 != 0;
    }

    private static boolean lIlIIlllllllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlllllllIII(int n2) {
        return n2 != 0;
    }
}

