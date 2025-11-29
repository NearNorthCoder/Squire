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

public class WHelper
implements M {
    public static final  WorldPoint fL;
    public static final  WorldPoint fO;
    public static  boolean by;
    
    public static final  WorldPoint fM;
    public static final  WorldPoint fN;
    
    static  boolean fP;
    public static  String[] bW;
    public static  List<d> bA;
    static  int co;
    static  boolean fQ;
    static  boolean fR;
    static  boolean cp;
    static  boolean fS;

    /*
     * WARNING - void declaration
     */
    private static void br() {
        void var1;
        BankLocation bankLocation = BankLocation.getNearest();
        if (w.lIlIIlllllllllI(bankLocation) && w.lIlIIlllllllIlI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[303]];
            Movement.walkTo((BankLocation)bankLocation);

            Time.sleepTicks((int)lIIlIIIIlIlll[2]);

        }
        if (w.lIlIIlllllllllI(var1) && w.lIlIIlllllllIII(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[304]];
            if (w.lIlIIlllllllIlI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIlIlll[18]);

            }
            if (w.lIlIIlllllllIII(Bank.isOpen() ? 1 : 0)) {
                if (w.lIlIIllllllllII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIlIIIIlIlll[9]);

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
        void var2;
        BankLocation bankLocation = BankLocation.getNearest();
        if (w.lIlIIlllllllllI(bankLocation) && w.lIlIIlllllllIlI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[306]];
            Movement.walkTo((BankLocation)bankLocation);

            Time.sleepTicks((int)lIIlIIIIlIlll[2]);

        }
        if (w.lIlIIlllllllllI(var2) && w.lIlIIlllllllIII(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[307]];
            if (w.lIlIIlllllllIlI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIlIlll[18]);

            }
            if (w.lIlIIlllllllIII(Bank.isOpen() ? 1 : 0)) {
                if (w.lIlIIllllllllII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIlIIIIlIlll[9]);

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
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[0]] = "Buying items";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[1]] = "Finished buying items, switching back to quest";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[2]] = "Crandor map";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[7]] = "Drink";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[9]] = "Drink";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[11]] = "Shark";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[12]] = "Shark";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[13]] = "Eat";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[16]] = "Nav to bank";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[17]] = "Handling banking";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[23]] = "We are missing teleports, switching to BUYING";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[26]] = "We are missing steel nails, switching to BUYING";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[28]] = "We are missing planks, switching to BUYING";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[38]] = "We are missing quest supplies, switching to BUYING";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[40]] = "Nav to champ guild";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[20]] = "Talking";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[43]] = "Guildmaster";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[29]] = "Nav to oziach";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[50]] = "Oziach";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[51]] = "Rune scimitar";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[10]] = "Wield";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[52]] = "Wear";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[53]] = "Wear";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[55]] = "Maze key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[8]] = "Nav to champ guild";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[56]] = "Eat";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[57]] = "Talking";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[58]] = "Guildmaster";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[60]] = "Where can I find the right ship?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[61]] = "I talked to Oziach...";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[63]] = "How can I protect myself from the dragon's breath?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[65]] = "Maze key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[15]] = "How can I find the route to Crandor?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[66]] = "Where is Melzar's map piece?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[68]] = "How can I find the route to Crandor?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[69]] = "Where is Thalzar's map piece?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[70]] = "How can I find the route to Crandor?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[71]] = "Where is Lozar's map piece?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[74]] = "Maze key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[77]] = "Oracle";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[78]] = "Nav to oracle";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[79]] = "Oracle";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[80]] = "Oracle";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[82]] = "Lobster pot";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[84]] = "Lobster pot";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[87]] = "Nav to magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[88]] = "Handling magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[89]] = "Silk";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[90]] = "Silk";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[91]] = "Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[6]] = "Lobster pot";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[92]] = "Lobster pot";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[93]] = "Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[94]] = "Unfired bowl";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[95]] = "Unfired bowl";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[96]] = "Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[97]] = "Wizard's mind bomb";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[98]] = "Wizard's mind bomb";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[99]] = "Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[100]] = "Silk";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[101]] = "Silk";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[102]] = "Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[103]] = "Lobster pot";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[104]] = "Lobster pot";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[105]] = "Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[106]] = "Unfired bowl";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[107]] = "Unfired bowl";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[108]] = "Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[109]] = "Wizard's mind bomb";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[110]] = "Wizard's mind bomb";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[111]] = "Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[112]] = "Chest";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[113]] = "Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[114]] = "Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[115]] = "Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[116]] = "Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[117]] = "Search";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[118]] = "Search";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[119]] = "Silk";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[120]] = "Silk";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[121]] = "Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[122]] = "Lobster pot";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[123]] = "Lobster pot";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[124]] = "Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[125]] = "Unfired bowl";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[126]] = "Unfired bowl";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[127]] = "Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[128]] = "Wizard's mind bomb";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[129]] = "Wizard's mind bomb";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[130]] = "Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[25]] = "Chest";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[131]] = "Magic door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[132]] = "Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[133]] = "Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[134]] = "Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[135]] = "Search";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[136]] = "Search";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[137]] = "Break";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[140]] = "Nav to wormbrain";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[141]] = "Can I journey on this ship?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[142]] = "Search away, I have nothing to hide.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[143]] = "Ok.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[144]] = "Talking";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[145]] = "Wormbrain";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[146]] = "Beer glass";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[147]] = "Beer glass";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[148]] = "Drop";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[155]] = "Nav to maze";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[156]] = "Door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[157]] = "Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[165]] = "Getting key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[167]] = "Attack";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[168]] = "Take";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[171]] = "Nav to red door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[172]] = "Red door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[173]] = "Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[174]] = "Go up";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[175]] = "Climb-up";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[179]] = "Getting key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[181]] = "Attack";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[182]] = "Take";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[185]] = "Nav to orange door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[186]] = "Orange door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[187]] = "Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[188]] = "Climb-up";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[190]] = "Getting key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[192]] = "Attack";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[193]] = "Take";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[195]] = "Nav to yellow door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[196]] = "Yellow door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[197]] = "Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[198]] = "Climb-down";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[201]] = "Climb-down";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[202]] = "Climb-down";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[208]] = "Getting blue key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[210]] = "Attack";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[211]] = "Take";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[213]] = "Nav to blue door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[214]] = "Blue door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[215]] = "Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[217]] = "Getting key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[219]] = "Attack";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[220]] = "Take";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[223]] = "Nav to magneta door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[224]] = "Magenta door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[225]] = "Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[226]] = "Lesser demon";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[228]] = "Attack";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[229]] = "Take";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[231]] = "Nav to green door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[232]] = "Green door";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[233]] = "Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[234]] = "Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[235]] = "Open";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[236]] = "Search";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[237]] = "Search";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[238]] = "Plank";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[239]] = "Plank";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[240]] = "Nav to boat";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[241]] = "Customs officer";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[242]] = "Can I journey on this ship?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[243]] = "Search away, I have nothing to hide.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[244]] = "Ok.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[245]] = "Klarense";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[246]] = "Cabin boy Jenkins";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[247]] = "Boarding boat";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[248]] = "Gangplank";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[249]] = "Cross";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[250]] = "Reparing hole";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[251]] = "Hole";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[252]] = "Repair";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[253]] = "Ladder";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[254]] = "Climb-down";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[255]] = "Hiring ned";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[256]] = "Ned";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[257]] = "Draynor Village";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[14]] = "Ned";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[72]] = "Captain Ned";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[260]] = "Nav to boat";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[261]] = "Customs officer";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[262]] = "Can I journey on this ship?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[263]] = "Search away, I have nothing to hide.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[264]] = "Ok.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[265]] = "Gangplank";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[266]] = "Cross";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[267]] = "Captain Ned";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[268]] = "Captain Ned";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[272]] = "Nav to entrance";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[273]] = "Hole";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[274]] = "Enter";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[275]] = "Elvarg";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[277]] = "Nav to fight";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[278]] = "Nav to fight";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[279]] = "Shark";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[280]] = "Shark";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[281]] = "Eat";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[282]] = "Wall";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[283]] = "Climb-over";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[284]] = "Elvarg boss fight";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[285]] = "Vial";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[286]] = "Vial";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[287]] = "Drop";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[288]] = "Shark";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[289]] = "Drop";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[290]] = "Drink";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[292]] = "Drink";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[293]] = "Attack";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[295]] = "Nav to oziach";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[296]] = "Oziach";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[297]] = "Wear";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[298]] = "Crandor map";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[299]] = "Oziach";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[300]] = "Break";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[301]] = "Nav to bank";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[302]] = "Handling banking";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[303]] = "Nav to bank";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[304]] = "Handling banking";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[306]] = "Nav to bank";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[307]] = "Handling banking";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[308]] = "Maze key";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[315]] = "Dragon slayer 1 quest";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[316]] = "ring of wealth (";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[317]] = "Antifire";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[318]] = "Antifire";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[319]] = "combat";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[320]] = "combat";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[321]] = "Antifire";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[322]] = "Antifire";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[323]] = "glory";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[324]] = "Chest";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[325]] = "Zombie";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[326]] = "Ladder";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[327]] = "Climb-down";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[328]] = "Ladder";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[329]] = "Climb-down";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[330]] = "Ladder";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[331]] = "Skeleton";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[332]] = "Ladder";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[333]] = "Ghost";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[334]] = "Ladder";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[335]] = "wealth";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[336]] = "wealth";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[337]] = "wealth";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[338]] = "glory";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[339]] = "glory";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[340]] = "glory";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[349]] = "Can I have a quest?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[350]] = "Yes.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[351]] = "Can you sell me a rune platebody?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[352]] = "The Guildmaster of the Champions' Guild told me.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[353]] = "I thought you were going to give me a quest.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[354]] = "A dragon, that sounds like fun.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[355]] = "I talked to Oziach...";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[356]] = "Where can I find the right ship?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[357]] = "I seek a piece of the map to the island of Crandor.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[358]] = "I believe you've got a piece of map that I need.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[359]] = "I suppose I could pay you for the map piece...";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[360]] = "Alright then, 10,000 it is.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[361]] = "I'd like to buy her.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[362]] = "Yep, sounds good.";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[363]] = "You're a sailor? Could you take me to Crandor?";
        w.lIIlIIIIIlIIl[w.lIIlIIIIlIlll[364]] = "Yes, let's go!";
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
            d var3;
            block49: {
                block48: {
                    block47: {
                        block46: {
                            block45: {
                                Object var4;
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
                                                                    var4 = new DHelper(lIIlIIIIlIlll[27], lIIlIIIIlIlll[7], lIIlIIIIlIlll[309]);
                                                                    bA.add((DHelper) ar4);

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
                                                            var4 = new DHelper(lIIlIIIIlIlll[35], lIIlIIIIlIlll[63], lIIlIIIIlIlll[309]);
                                                            bA.add((DHelper) ar4);

                                                        }
                                                        int[] nArray = new int[lIIlIIIIlIlll[1]];
                                                        nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[39];
                                                        if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                            var4 = new DHelper(lIIlIIIIlIlll[39], lIIlIIIIlIlll[1], lIIlIIIIlIlll[310]);
                                                            bA.add((DHelper) ar4);

                                                        }
                                                        int[] nArray6 = new int[lIIlIIIIlIlll[1]];
                                                        nArray6[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[41];
                                                        if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                                            var4 = new DHelper(lIIlIIIIlIlll[41], lIIlIIIIlIlll[1], lIIlIIIIlIlll[311]);
                                                            bA.add((DHelper) ar4);

                                                        }
                                                        int[] nArray7 = new int[lIIlIIIIlIlll[1]];
                                                        nArray7[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[44];
                                                        if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                            var4 = new DHelper(lIIlIIIIlIlll[44], lIIlIIIIlIlll[1], lIIlIIIIlIlll[312]);
                                                            bA.add((DHelper) ar4);

                                                        }
                                                        int[] nArray8 = new int[lIIlIIIIlIlll[1]];
                                                        nArray8[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[42];
                                                        if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                            var4 = new DHelper(lIIlIIIIlIlll[42], lIIlIIIIlIlll[7], lIIlIIIIlIlll[310]);
                                                            bA.add((DHelper) ar4);

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
                                                    var4 = new DHelper(lIIlIIIIlIlll[24], lIIlIIIIlIlll[25], lIIlIIIIlIlll[309]);
                                                    bA.add((DHelper) ar4);

                                                }
                                                int[] nArray = new int[lIIlIIIIlIlll[1]];
                                                nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                                                if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    var4 = new DHelper(lIIlIIIIlIlll[36], lIIlIIIIlIlll[1], h.bv);
                                                    bA.add((DHelper) ar4);

                                                }
                                                int[] nArray12 = new int[lIIlIIIIlIlll[1]];
                                                nArray12[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[34];
                                                if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                                    var4 = new DHelper(lIIlIIIIlIlll[34], lIIlIIIIlIlll[1], h.bv);
                                                    bA.add((DHelper) ar4);

                                                }
                                                int[] nArray13 = new int[lIIlIIIIlIlll[1]];
                                                nArray13[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[33];
                                                if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                                    var4 = new DHelper(lIIlIIIIlIlll[33], lIIlIIIIlIlll[1], h.bv);
                                                    bA.add((DHelper) ar4);

                                                }
                                                int[] nArray14 = new int[lIIlIIIIlIlll[1]];
                                                nArray14[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[32];
                                                if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                                    var4 = new DHelper(lIIlIIIIlIlll[32], lIIlIIIIlIlll[1], h.bv);
                                                    bA.add((DHelper) ar4);

                                                }
                                                int[] nArray15 = new int[lIIlIIIIlIlll[1]];
                                                nArray15[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[30];
                                                if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray15) ? 1 : 0)) {
                                                    var4 = new DHelper(lIIlIIIIlIlll[30], lIIlIIIIlIlll[1], h.bv);
                                                    bA.add((DHelper) ar4);

                                                }
                                                int[] nArray16 = new int[lIIlIIIIlIlll[1]];
                                                nArray16[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[31];
                                                if (w.lIlIIlllllllIlI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                                    var4 = new DHelper(lIIlIIIIlIlll[31], lIIlIIIIlIlll[1], h.bv);
                                                    bA.add((DHelper) ar4);

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
                                            var4 = new DHelper(lIIlIIIIlIlll[37], lIIlIIIIlIlll[23], h.bv);
                                            bA.add((DHelper) ar4);

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
                                    var4 = new DHelper(lIIlIIIIlIlll[45], lIIlIIIIlIlll[23], lIIlIIIIlIlll[47]);
                                    bA.add((DHelper) ar4);

                                }
                                if (w.lIlIIlllllllIlI(Bank.contains((Predicate)(var4 = item -> item.getName().toLowerCase().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[316]]))) ? 1 : 0)) {
                                    var3 = new DHelper(lIIlIIIIlIlll[313], lIIlIIIIlIlll[11], lIIlIIIIlIlll[311]);
                                    bA.add(var3);

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
                            var3 = new DHelper(lIIlIIIIlIlll[19], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]);
                            bA.add(var3);

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
                    var3 = new DHelper(lIIlIIIIlIlll[22], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]);
                    bA.add(var3);

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
            var3 = new DHelper(lIIlIIIIlIlll[21], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]);
            bA.add(var3);

        }
    }

    /*
     * WARNING - void declaration
     */
    private static void bq() {
        void var5;
        BankLocation bankLocation = BankLocation.getNearest();
        if (w.lIlIIlllllllllI(bankLocation) && w.lIlIIlllllllIlI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[301]];
            Movement.walkTo((BankLocation)bankLocation);

            Time.sleepTicks((int)lIIlIIIIlIlll[2]);

        }
        if (w.lIlIIlllllllllI(var5) && w.lIlIIlllllllIII(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[302]];
            if (w.lIlIIlllllllIlI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIlIlll[18]);

            }
            if (w.lIlIIlllllllIII(Bank.isOpen() ? 1 : 0)) {
                if (w.lIlIIllllllllII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIlIIIIlIlll[9]);

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
            WorldPoint var6;
            WorldPoint var7;
            BankLocation var8;
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
                                                    var8 = BankLocation.getNearest();
                                                    if (w.lIlIIlllllllllI(var8) && w.lIlIIlllllllIlI(var8.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[16]];
                                                        Movement.walkTo((BankLocation)var8);

                                                        Time.sleepTicks((int)lIIlIIIIlIlll[2]);

                                                    }
                                                    if (!w.lIlIIlllllllllI(var8) || !w.lIlIIlllllllIII(var8.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block212;
                                                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[17]];
                                                    if (w.lIlIIlllllllIlI(Bank.isOpen() ? 1 : 0)) {
                                                        a.a();
                                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIlIlll[18]);

                                                    }
                                                    if (!w.lIlIIlllllllIII(Bank.isOpen() ? 1 : 0)) break block212;
                                                    if (w.lIlIIllllllllII(Inventory.getAll().size())) {
                                                        Bank.depositInventory();
                                                        Time.sleepTicks((int)lIIlIIIIlIlll[9]);

                                                    }
                                                    if (w.lIlIIllllllllII(Equipment.getAll().size())) {
                                                        Bank.depositEquipment();
                                                        Time.sleepTicks((int)lIIlIIIIlIlll[2]);

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

                                        Time.sleepTicks((int)lIIlIIIIlIlll[1]);

                                    }
                                    if (w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(fL), lIIlIIIIlIlll[12])) {
                                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[20]];
                                        g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[43]], bW, lIIlIIIIlIlll[1]);
                                    }
                                }
                                if (w.lIlIlIIIIIIIIIl(e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[1]) && w.lIlIIlllllllIII(w.S() ? 1 : 0)) {
                                    var8 = new WorldPoint(lIIlIIIIlIlll[48], lIIlIIIIlIlll[49], lIIlIIIIlIlll[0]);
                                    if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var8), lIIlIIIIlIlll[16])) {
                                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[29]];
                                        Movement.walkTo((WorldPoint)var8);

                                        Time.sleepTicks((int)lIIlIIIIlIlll[1]);

                                    }
                                    if (w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var8), lIIlIIIIlIlll[16])) {
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

                                    }
                                }
                                Movement.walkTo((WorldPoint)fL);

                                Time.sleepTicks((int)lIIlIIIIlIlll[1]);

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
                        var8 = new WorldPoint(lIIlIIIIlIlll[75], lIIlIIIIlIlll[76], lIIlIIIIlIlll[0]);
                        String[] stringArray4 = new String[lIIlIIIIlIlll[1]];
                        stringArray4[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[77]];
                        if (w.lIlIlIIIIIIIIll(NPCs.getNearest((String[])stringArray4))) {
                            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[78]];
                            Movement.walkTo((WorldPoint)var8);

                            Time.sleepTicks((int)lIIlIIIIlIlll[1]);

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
                        var8 = new WorldPoint(lIIlIIIIlIlll[85], lIIlIIIIlIlll[86], lIIlIIIIlIlll[0]);
                        if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var8), lIIlIIIIlIlll[9]) && w.lIlIIlllllllIlI(Vars.getBit((int)lIIlIIIIlIlll[81]))) {
                            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[87]];
                            if (w.lIlIIlllllllIII(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)var8);

                            Time.sleepTicks((int)lIIlIIIIlIlll[1]);

                        }
                        if (w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var8), lIIlIIIIlIlll[23])) {
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

                                }
                                String[] stringArray31 = new String[lIIlIIIIlIlll[1]];
                                stringArray31[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[112]];
                                var7 = TileObjects.getNearest((String[])stringArray31);
                                if (w.lIlIIlllllllllI(var7) && w.lIlIIlllllllIlI(fP ? 1 : 0)) {
                                    if (w.lIlIIlllllllIlI(Reachable.isInteractable((Locatable)var7) ? 1 : 0)) {
                                        String[] stringArray32 = new String[lIIlIIIIlIlll[1]];
                                        stringArray32[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[113]];
                                        TileObjects.getNearest((String[])stringArray32).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[114]]);
                                        Time.sleepTicks((int)lIIlIIIIlIlll[16]);

                                    }
                                    if (w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)var7) ? 1 : 0) && w.lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                                        String[] stringArray33 = new String[lIIlIIIIlIlll[1]];
                                        stringArray33[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[115]];
                                        if (w.lIlIIlllllllIII(var7.hasAction(stringArray33) ? 1 : 0)) {
                                            var7.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[116]]);
                                            Time.sleepTicks((int)lIIlIIIIlIlll[9]);

                                        }
                                        String[] stringArray34 = new String[lIIlIIIIlIlll[1]];
                                        stringArray34[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[117]];
                                        if (w.lIlIIlllllllIII(var7.hasAction(stringArray34) ? 1 : 0)) {
                                            var7.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[118]]);
                                            Time.sleepTicks((int)lIIlIIIIlIlll[9]);

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

                    }
                    String[] stringArray46 = new String[lIIlIIIIlIlll[1]];
                    stringArray46[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[25]];
                    var8 = TileObjects.getNearest((String[])stringArray46);
                    if (w.lIlIIlllllllllI(var8) && w.lIlIIlllllllIlI(fP ? 1 : 0)) {
                        if (w.lIlIIlllllllIlI(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
                            String[] stringArray47 = new String[lIIlIIIIlIlll[1]];
                            stringArray47[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[131]];
                            TileObjects.getNearest((String[])stringArray47).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[132]]);
                            Time.sleepTicks((int)lIIlIIIIlIlll[16]);

                        }
                        if (w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)var8) ? 1 : 0) && w.lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray48 = new String[lIIlIIIIlIlll[1]];
                            stringArray48[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[133]];
                            if (w.lIlIIlllllllIII(var8.hasAction(stringArray48) ? 1 : 0)) {
                                var8.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[134]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[9]);

                            }
                            String[] stringArray49 = new String[lIIlIIIIlIlll[1]];
                            stringArray49[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[135]];
                            if (w.lIlIIlllllllIII(var8.hasAction(stringArray49) ? 1 : 0)) {
                                var8.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[136]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[9]);

                            }
                        }
                    }
                }
                if (w.lIlIIlllllllIII(fP ? 1 : 0) && w.lIlIIlllllllIlI(fQ ? 1 : 0)) {
                    var8 = new WorldPoint(lIIlIIIIlIlll[85], lIIlIIIIlIlll[86], lIIlIIIIlIlll[0]);
                    if (w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var8), lIIlIIIIlIlll[23])) {
                        int[] nArray = new int[lIIlIIIIlIlll[1]];
                        nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                        Inventory.getFirst((int[])nArray).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[137]]);
                        Time.sleepTicks((int)lIIlIIIIlIlll[16]);

                    }
                    var7 = new WorldPoint(lIIlIIIIlIlll[138], lIIlIIIIlIlll[139], lIIlIIIIlIlll[0]);
                    if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[140]];
                        if (w.lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)var7);

                            Time.sleepTicks((int)lIIlIIIIlIlll[1]);

                        }
                        String[] stringArray = new String[lIIlIIIIlIlll[7]];
                        stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[141]];
                        stringArray[w.lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[142]];
                        stringArray[w.lIIlIIIIlIlll[2]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[143]];
                        g.a(stringArray);
                    }
                    if (w.lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[144]];
                        g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[145]], bW);
                    }
                }
                if (w.lIlIIlllllllIII(fP ? 1 : 0) && w.lIlIIlllllllIII(fQ ? 1 : 0) && w.lIlIIlllllllIlI(fR ? 1 : 0)) {
                    TileObject var9;
                    TileObject var10;
                    WorldArea var11;
                    String[] stringArray = new String[lIIlIIIIlIlll[1]];
                    stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[146]];
                    if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray50 = new String[lIIlIIIIlIlll[1]];
                        stringArray50[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[147]];
                        Inventory.getFirst((String[])stringArray50).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[148]]);
                    }
                    var8 = new WorldArea(lIIlIIIIlIlll[149], lIIlIIIIlIlll[150], lIIlIIIIlIlll[51], lIIlIIIIlIlll[10], lIIlIIIIlIlll[0]);
                    var7 = new WorldArea(lIIlIIIIlIlll[151], lIIlIIIIlIlll[152], lIIlIIIIlIlll[58], lIIlIIIIlIlll[58], lIIlIIIIlIlll[0]);
                    if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().getPlane()) && w.lIlIIlllllllIlI(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllIlI(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        var6 = new WorldPoint(lIIlIIIIlIlll[153], lIIlIIIIlIlll[154], lIIlIIIIlIlll[0]);
                        if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(var6), lIIlIIIIlIlll[2])) {
                            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[155]];
                            Movement.walkTo((WorldPoint)var6);

                            Time.sleepTicks((int)lIIlIIIIlIlll[1]);

                        }
                        if (w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(var6), lIIlIIIIlIlll[2])) {
                            String[] stringArray51 = new String[lIIlIIIIlIlll[1]];
                            stringArray51[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[156]];
                            TileObjects.getNearest((String[])stringArray51).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[157]]);
                            Time.sleepTicks((int)lIIlIIIIlIlll[11]);

                        }
                    }
                    var6 = new WorldArea(lIIlIIIIlIlll[158], lIIlIIIIlIlll[159], lIIlIIIIlIlll[11], lIIlIIIIlIlll[16], lIIlIIIIlIlll[0]);
                    WorldArea var12 = new WorldArea(lIIlIIIIlIlll[160], lIIlIIIIlIlll[161], lIIlIIIIlIlll[13], lIIlIIIIlIlll[7], lIIlIIIIlIlll[0]);
                    if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().getPlane()) && w.lIlIIlllllllIII(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] nArray = new int[lIIlIIIIlIlll[1]];
                        nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[162];
                        if (w.lIlIIlllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray15 = new int[lIIlIIIIlIlll[1]];
                            nArray15[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[162];
                            if (w.lIlIlIIIIIIIIll(TileItems.getNearest((int[])nArray15)) && w.lIlIIlllllllIlI(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllIlI(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllIlI(new WorldArea(lIIlIIIIlIlll[163], lIIlIIIIlIlll[164], lIIlIIIIlIlll[26], lIIlIIIIlIlll[12], lIIlIIIIlIlll[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[165]];
                                if (w.lIlIlIIIIIIIIll(Players.getLocal().getInteracting())) {
                                    int[] nArray16 = new int[lIIlIIIIlIlll[1]];
                                    nArray16[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[166];
                                    NPCs.getNearest((int[])nArray16).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[167]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[11]);

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

                        }
                        int[] nArray19 = new int[lIIlIIIIlIlll[1]];
                        nArray19[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[162];
                        if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray19) ? 1 : 0) && w.lIlIIlllllllIlI(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllIlI(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            var11 = new WorldPoint(lIIlIIIIlIlll[169], lIIlIIIIlIlll[170], lIIlIIIIlIlll[0]);
                            if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals((Object)var11) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[171]];
                                e.b((WorldPoint)var11);
                                Time.sleepTicks((int)lIIlIIIIlIlll[2]);

                            }
                            if (w.lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals((Object)var11) ? 1 : 0)) {
                                String[] stringArray52 = new String[lIIlIIIIlIlll[1]];
                                stringArray52[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[172]];
                                TileObjects.getNearest((String[])stringArray52).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[173]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[12]);

                            }
                        }
                        if (!w.lIlIIlllllllIlI(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || w.lIlIIlllllllIII(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            var11 = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (w.lIlIIlllllllIII(tileObject.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[334]]) ? 1 : 0) && w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                    n2 = lIIlIIIIlIlll[1];

                                    if (1 < ((0x75 ^ 0x42 ^ (0x7E ^ 0x1A)) & (0xD ^ 0x5C ^ 2 ^ -1))) {
                                        return ((14 + 148 - 9 + 59 ^ 88 + 170 - 107 + 31) & (2 ^ 0x18 ^ (0xD3 ^ 0xAB) ^ -1)) != 0;
                                    }
                                } else {
                                    n2 = lIIlIIIIlIlll[0];
                                }
                                return n2 != 0;
                            });
                            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[174]];
                            if (w.lIlIIlllllllllI(var11)) {
                                var11.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[175]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[7]);

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
                                var11 = NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (w.lIlIIlllllllIII(nPC.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[333]]) ? 1 : 0) && w.lIlIlIIIIIIIlII(nPC.getInteracting(), Players.getLocal()) && w.lIlIlIIIIIIIIII(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIIIIlIlll[1])) {
                                        n2 = lIIlIIIIlIlll[1];

                                        if ((0x5C ^ 0x58) != (0x3D ^ 0x39)) {
                                            return false;
                                        }
                                    } else {
                                        n2 = lIIlIIIIlIlll[0];
                                    }
                                    return n2 != 0;
                                });
                                if (w.lIlIlIIIIIIIIll(Players.getLocal().getInteracting()) && w.lIlIlIIIIIIIIll(var11)) {
                                    int[] nArray21 = new int[lIIlIIIIlIlll[1]];
                                    nArray21[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[180];
                                    NPCs.getNearest((int[])nArray21).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[181]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[11]);

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

                        }
                        var11 = new WorldArea(lIIlIIIIlIlll[183], lIIlIIIIlIlll[184], lIIlIIIIlIlll[12], lIIlIIIIlIlll[11], lIIlIIIIlIlll[1]);
                        int[] nArray24 = new int[lIIlIIIIlIlll[1]];
                        nArray24[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[178];
                        if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray24) ? 1 : 0) && w.lIlIIlllllllIlI(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            var10 = new WorldPoint(lIIlIIIIlIlll[163], lIIlIIIIlIlll[170], lIIlIIIIlIlll[1]);
                            if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[185]];
                                e.b((WorldPoint)var10);
                                Time.sleepTicks((int)lIIlIIIIlIlll[2]);

                            }
                            if (w.lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                String[] stringArray53 = new String[lIIlIIIIlIlll[1]];
                                stringArray53[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[186]];
                                TileObjects.getNearest((String[])stringArray53).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[187]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[12]);

                            }
                        }
                        if (w.lIlIIlllllllIII(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllllI(var10 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (w.lIlIIlllllllIII(tileObject.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[332]]) ? 1 : 0) && w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = lIIlIIIIlIlll[1];

                                if (1 == 0) {
                                    return ((30 + 3 - -7 + 156 ^ 111 + 52 - -11 + 19) & (0x70 ^ 0x3C ^ (0x3C ^ 0x75) ^ -1)) != 0;
                                }
                            } else {
                                n2 = lIIlIIIIlIlll[0];
                            }
                            return n2 != 0;
                        }))) {
                            var10.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[188]]);
                            Time.sleepTicks((int)lIIlIIIIlIlll[7]);

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
                                var11 = NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (w.lIlIIlllllllIII(nPC.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[331]]) ? 1 : 0) && w.lIlIlIIIIIIIlII(nPC.getInteracting(), Players.getLocal()) && w.lIlIlIIIIIIIIII(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIIIIlIlll[1])) {
                                        n2 = lIIlIIIIlIlll[1];

                                        if (3 == -1) {
                                            return ((76 + 233 - 214 + 145 ^ 133 + 147 - 227 + 122) & (0xCB ^ 0xC0 ^ (0xDD ^ 0x89) ^ -1)) != 0;
                                        }
                                    } else {
                                        n2 = lIIlIIIIlIlll[0];
                                    }
                                    return n2 != 0;
                                });
                                if (w.lIlIlIIIIIIIIll(Players.getLocal().getInteracting()) && w.lIlIlIIIIIIIIll(var11)) {
                                    int[] nArray26 = new int[lIIlIIIIlIlll[1]];
                                    nArray26[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[191];
                                    NPCs.getNearest((int[])nArray26).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[192]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[11]);

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

                        }
                        var11 = new WorldArea(lIIlIIIIlIlll[149], lIIlIIIIlIlll[164], lIIlIIIIlIlll[10], lIIlIIIIlIlll[38], lIIlIIIIlIlll[2]);
                        int[] nArray29 = new int[lIIlIIIIlIlll[1]];
                        nArray29[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[189];
                        if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray29) ? 1 : 0) && w.lIlIIlllllllIlI(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            var10 = new WorldPoint(lIIlIIIIlIlll[194], lIIlIIIIlIlll[159], lIIlIIIIlIlll[2]);
                            if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[195]];
                                e.b((WorldPoint)var10);
                                Time.sleepTicks((int)lIIlIIIIlIlll[2]);

                            }
                            if (w.lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                String[] stringArray54 = new String[lIIlIIIIlIlll[1]];
                                stringArray54[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[196]];
                                TileObjects.getNearest((String[])stringArray54).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[197]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[12]);

                            }
                        }
                        if (w.lIlIIlllllllIII(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllllI(var10 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (w.lIlIIlllllllIII(tileObject.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[330]]) ? 1 : 0) && w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = lIIlIIIIlIlll[1];

                                if (3 < 0) {
                                    return ((17 + 39 - -42 + 80 ^ 148 + 88 - 145 + 98) & (0x6F ^ 0x45 ^ (0x95 ^ 0xB0) ^ -1)) != 0;
                                }
                            } else {
                                n2 = lIIlIIIIlIlll[0];
                            }
                            return n2 != 0;
                        }))) {
                            var10.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[198]]);
                            Time.sleepTicks((int)lIIlIIIIlIlll[7]);

                        }
                    }
                    if ((!w.lIlIIlllllllIlI((var11 = new WorldArea(lIIlIIIIlIlll[176], lIIlIIIIlIlll[177], lIIlIIIIlIlll[11], lIIlIIIIlIlll[13], lIIlIIIIlIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || w.lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIlIlll[199], lIIlIIIIlIlll[200], lIIlIIIIlIlll[1])) ? 1 : 0)) && w.lIlIIlllllllllI(var10 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (w.lIlIIlllllllIII(tileObject.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[328]]) ? 1 : 0) && w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                            String[] stringArray = new String[lIIlIIIIlIlll[1]];
                            stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[329]];
                            if (w.lIlIIlllllllIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIlIIIIlIlll[1];

                                if ((0xC3 ^ 0xC7) == (0x68 ^ 0x6C)) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = lIIlIIIIlIlll[0];
                        return n2 != 0;
                    }))) {
                        var10.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[201]]);
                        Time.sleepTicks((int)lIIlIIIIlIlll[7]);

                    }
                    if (w.lIlIIlllllllIII((var10 = new WorldArea(lIIlIIIIlIlll[163], lIIlIIIIlIlll[164], lIIlIIIIlIlll[26], lIIlIIIIlIlll[12], lIIlIIIIlIlll[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllllI(var9 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (w.lIlIIlllllllIII(tileObject.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[326]]) ? 1 : 0) && w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                            String[] stringArray = new String[lIIlIIIIlIlll[1]];
                            stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[327]];
                            if (w.lIlIIlllllllIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIlIIIIlIlll[1];

                                if (3 > 0) return n2 != 0;
                                return ((0x29 ^ 0x75 ^ (0xD7 ^ 0x93)) & (13 + 80 - -66 + 63 ^ 38 + 163 - 5 + 2 ^ -1)) != 0;
                            }
                        }
                        n2 = lIIlIIIIlIlll[0];
                        return n2 != 0;
                    }))) {
                        var9.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[202]]);
                        Time.sleepTicks((int)lIIlIIIIlIlll[7]);

                    }
                    var9 = new WorldArea(lIIlIIIIlIlll[194], lIIlIIIIlIlll[203], lIIlIIIIlIlll[43], lIIlIIIIlIlll[9], lIIlIIIIlIlll[0]);
                    WorldArea var13 = new WorldArea(lIIlIIIIlIlll[204], lIIlIIIIlIlll[205], lIIlIIIIlIlll[13], lIIlIIIIlIlll[23], lIIlIIIIlIlll[0]);
                    WorldArea var14 = new WorldArea(lIIlIIIIlIlll[169], lIIlIIIIlIlll[206], lIIlIIIIlIlll[11], lIIlIIIIlIlll[17], lIIlIIIIlIlll[0]);
                    if (w.lIlIIlllllllIII(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint var15;
                        WorldPoint var16;
                        WorldArea var17;
                        int[] nArray = new int[lIIlIIIIlIlll[1]];
                        nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[207];
                        if (w.lIlIIlllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray30 = new int[lIIlIIIIlIlll[1]];
                            nArray30[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[207];
                            if (w.lIlIlIIIIIIIIll(TileItems.getNearest((int[])nArray30)) && w.lIlIIlllllllIlI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllIlI(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllIlI(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[208]];
                                var17 = NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (w.lIlIIlllllllIII(nPC.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[325]]) ? 1 : 0) && w.lIlIlIIIIIIIlII(nPC.getInteracting(), Players.getLocal()) && w.lIlIlIIIIIIIIII(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIIIIlIlll[1])) {
                                        n2 = lIIlIIIIlIlll[1];

                                        }
                                    } else {
                                        n2 = lIIlIIIIlIlll[0];
                                    }
                                    return n2 != 0;
                                });
                                if (w.lIlIlIIIIIIIIll(Players.getLocal().getInteracting()) && w.lIlIlIIIIIIIIll(var17)) {
                                    int[] nArray31 = new int[lIIlIIIIlIlll[1]];
                                    nArray31[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[209];
                                    NPCs.getNearest((int[])nArray31).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[210]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[11]);

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

                        }
                        var17 = new WorldArea(lIIlIIIIlIlll[169], lIIlIIIIlIlll[206], lIIlIIIIlIlll[11], lIIlIIIIlIlll[17], lIIlIIIIlIlll[0]);
                        int[] nArray34 = new int[lIIlIIIIlIlll[1]];
                        nArray34[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[207];
                        if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray34) ? 1 : 0) && w.lIlIIlllllllIlI(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            var16 = new WorldPoint(lIIlIIIIlIlll[183], lIIlIIIIlIlll[212], lIIlIIIIlIlll[0]);
                            if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals((Object)var16) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[213]];
                                e.b(var16);
                                Time.sleepTicks((int)lIIlIIIIlIlll[2]);

                            }
                            if (w.lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals((Object)var16) ? 1 : 0)) {
                                String[] stringArray55 = new String[lIIlIIIIlIlll[1]];
                                stringArray55[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[214]];
                                TileObjects.getNearest((String[])stringArray55).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[215]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[12]);

                            }
                        }
                        if (w.lIlIIlllllllIII(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
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

                            }
                            var16 = new WorldArea(lIIlIIIIlIlll[169], lIIlIIIIlIlll[206], lIIlIIIIlIlll[11], lIIlIIIIlIlll[17], lIIlIIIIlIlll[0]);
                            int[] nArray40 = new int[lIIlIIIIlIlll[1]];
                            nArray40[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[216];
                            if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray40) ? 1 : 0) && w.lIlIIlllllllIII(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllIlI(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIlIIlllllllIlI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                var15 = new WorldPoint(lIIlIIIIlIlll[221], lIIlIIIIlIlll[222], lIIlIIIIlIlll[0]);
                                if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals((Object)var15) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[223]];
                                    e.b(var15);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[2]);

                                }
                                if (w.lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals((Object)var15) ? 1 : 0)) {
                                    String[] stringArray56 = new String[lIIlIIIIlIlll[1]];
                                    stringArray56[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[224]];
                                    TileObjects.getNearest((String[])stringArray56).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[225]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[12]);

                                }
                            }
                        }
                        if (!w.lIlIIlllllllIlI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || w.lIlIIlllllllIII(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray57 = new String[lIIlIIIIlIlll[1]];
                            stringArray57[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[226]];
                            var16 = NPCs.getNearest((String[])stringArray57);
                            if (w.lIlIIlllllllllI(var16)) {
                                int[] nArray41 = new int[lIIlIIIIlIlll[1]];
                                nArray41[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[227];
                                if (w.lIlIIlllllllIlI(Inventory.contains((int[])nArray41) ? 1 : 0) && w.lIlIlIIIIIIIIll(Players.getLocal().getInteracting())) {
                                    if (w.lIlIIlllllllIlI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                    }
                                    var16.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[228]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[7]);

                                }
                            }
                            int[] nArray42 = new int[lIIlIIIIlIlll[1]];
                            nArray42[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[227];
                            if (w.lIlIIlllllllllI(TileItems.getNearest((int[])nArray42))) {
                                int[] nArray43 = new int[lIIlIIIIlIlll[1]];
                                nArray43[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[227];
                                TileItems.getNearest((int[])nArray43).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[229]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[2]);

                            }
                            int[] nArray44 = new int[lIIlIIIIlIlll[1]];
                            nArray44[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[227];
                            if (w.lIlIIlllllllIII(Inventory.contains((int[])nArray44) ? 1 : 0)) {
                                var15 = new WorldPoint(lIIlIIIIlIlll[176], lIIlIIIIlIlll[230], lIIlIIIIlIlll[0]);
                                if (w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals((Object)var15) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[231]];
                                    e.b(var15);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[2]);

                                }
                                if (w.lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals((Object)var15) ? 1 : 0)) {
                                    String[] stringArray58 = new String[lIIlIIIIlIlll[1]];
                                    stringArray58[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[232]];
                                    TileObjects.getNearest((String[])stringArray58).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[233]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[12]);

                                }
                            }
                        }
                        if (w.lIlIIlllllllllI(var16 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (w.lIlIIlllllllIII(tileObject.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[324]]) ? 1 : 0) && w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = lIIlIIIIlIlll[1];

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
                                if (w.lIlIIlllllllIII(var16.hasAction(stringArray59) ? 1 : 0)) {
                                    var16.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[235]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[9]);

                                }
                                String[] stringArray60 = new String[lIIlIIIIlIlll[1]];
                                stringArray60[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[236]];
                                if (w.lIlIIlllllllIII(var16.hasAction(stringArray60) ? 1 : 0)) {
                                    var16.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[237]]);
                                    Time.sleepTicks((int)lIIlIIIIlIlll[9]);

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

                                Time.sleepTicks((int)lIIlIIIIlIlll[1]);

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
                var8 = NPCs.getNearest((String[])stringArray);
                if (w.lIlIlIIIIIIIIll(var8) && w.lIlIIlllllllIlI(Players.getLocal().getWorldLocation().getPlane())) {
                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[247]];
                    String[] stringArray64 = new String[lIIlIIIIlIlll[1]];
                    stringArray64[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[248]];
                    TileObjects.getNearest((String[])stringArray64).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[249]]);
                    Time.sleepTicks((int)lIIlIIIIlIlll[16]);

                }
                if (w.lIlIlIIIIIIIIll(var8) && w.lIlIlIIIIIIIIIl(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIlIlll[1])) {
                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[250]];
                    String[] stringArray65 = new String[lIIlIIIIlIlll[1]];
                    stringArray65[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[251]];
                    TileObjects.getNearest((String[])stringArray65).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[252]]);
                    Time.sleepTicks((int)lIIlIIIIlIlll[7]);

                }
                if (w.lIlIIlllllllllI(var8) && w.lIlIlIIIIIIIIIl(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIlIlll[1])) {
                    String[] stringArray66 = new String[lIIlIIIIlIlll[1]];
                    stringArray66[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[253]];
                    TileObjects.getNearest((String[])stringArray66).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[254]]);
                    Time.sleepTicks((int)lIIlIIIIlIlll[11]);

                }
            }
            if (w.lIlIlIIIIIIIIIl(e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[12])) {
                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[255]];
                String[] stringArray = new String[lIIlIIIIlIlll[1]];
                stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[256]];
                var8 = NPCs.getNearest((String[])stringArray);
                if (w.lIlIlIIIIIIIIll(var8)) {
                    Equipment.getFirst(item -> item.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[323]])).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[257]]);
                    Time.sleepTicks((int)lIIlIIIIlIlll[23]);

                    Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIIIlIlll[258], lIIlIIIIlIlll[259], lIIlIIIIlIlll[0]));

                }
                if (w.lIlIIlllllllllI(var8)) {
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

                                Time.sleepTicks((int)lIIlIIIIlIlll[1]);

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
                var8 = new WorldArea(lIIlIIIIlIlll[269], lIIlIIIIlIlll[270], lIIlIIIIlIlll[89], lIIlIIIIlIlll[79], lIIlIIIIlIlll[0]);
                if (w.lIlIIlllllllIlI(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    var7 = new WorldPoint(lIIlIIIIlIlll[271], lIIlIIIIlIlll[259], lIIlIIIIlIlll[0]);
                    if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(var7), lIIlIIIIlIlll[7])) {
                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[272]];
                        Movement.walkTo((WorldPoint)var7);

                        Time.sleepTicks((int)lIIlIIIIlIlll[1]);

                    }
                    if (w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(var7), lIIlIIIIlIlll[7])) {
                        String[] stringArray = new String[lIIlIIIIlIlll[1]];
                        stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[273]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[274]]);
                        Time.sleepTicks((int)lIIlIIIIlIlll[9]);

                    }
                }
                if (w.lIlIIlllllllIII(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIlIlll[1]];
                    stringArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[275]];
                    var7 = NPCs.getNearest((String[])stringArray);
                    var6 = new WorldPoint(lIIlIIIIlIlll[276], lIIlIIIIlIlll[152], lIIlIIIIlIlll[0]);
                    if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(var6), lIIlIIIIlIlll[7]) && w.lIlIlIIIIIIIIll(var7)) {
                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[277]];
                        Movement.walkTo((WorldPoint)var6);

                        Time.sleepTicks((int)lIIlIIIIlIlll[1]);

                    }
                    if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(var6), lIIlIIIIlIlll[7]) && w.lIlIIlllllllllI(var7) && w.lIlIIlllllllIlI(Reachable.isInteractable((Locatable)var7) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[278]];
                        Movement.walkTo((WorldPoint)var6);

                        Time.sleepTicks((int)lIIlIIIIlIlll[1]);

                    }
                    if (w.lIlIIlllllllllI(var7) && w.lIlIIlllllllIlI(Reachable.isInteractable((Locatable)var7) ? 1 : 0) && w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(var6), lIIlIIIIlIlll[7]) && w.lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                        if (w.lIlIIllllllllll(Combat.getMissingHealth(), lIIlIIIIlIlll[9])) {
                            String[] stringArray71 = new String[lIIlIIIIlIlll[1]];
                            stringArray71[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[279]];
                            if (w.lIlIIlllllllIII(Inventory.contains((String[])stringArray71) ? 1 : 0)) {
                                String[] stringArray72 = new String[lIIlIIIIlIlll[1]];
                                stringArray72[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[280]];
                                Inventory.getFirst((String[])stringArray72).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[281]]);
                                Time.sleepTicks((int)lIIlIIIIlIlll[1]);

                            }
                        }
                        String[] stringArray73 = new String[lIIlIIIIlIlll[1]];
                        stringArray73[w.lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[282]];
                        TileObjects.getNearest((String[])stringArray73).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[283]]);
                    }
                    if (w.lIlIIlllllllllI(var7) && w.lIlIIlllllllIII(Reachable.isInteractable((Locatable)var7) ? 1 : 0)) {
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
                            var7.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[293]]);
                            Time.sleepTicks((int)lIIlIIIIlIlll[1]);

                        }
                    }
                }
            }
            if (w.lIlIlIIIIIIIIIl(e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[17])) {
                Prayers.disableAll();
                var8 = new WorldPoint(lIIlIIIIlIlll[48], lIIlIIIIlIlll[49], lIIlIIIIlIlll[0]);
                if (w.lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var8), lIIlIIIIlIlll[16]) && w.lIlIlIIIIIIIIIl(Players.getLocal().getAnimation(), lIIlIIIIlIlll[294])) {
                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[295]];
                    Movement.walkTo((WorldPoint)var8);

                    Time.sleepTicks((int)lIIlIIIIlIlll[1]);

                }
                if (w.lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var8), lIIlIIIIlIlll[16])) {
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

        return String.valueOf(var18);
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
        void var19;
        int[] nArray = new int[lIIlIIIIlIlll[9]];
        nArray[w.lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
        nArray[w.lIIlIIIIlIlll[1]] = lIIlIIIIlIlll[37];
        nArray[w.lIIlIIIIlIlll[2]] = lIIlIIIIlIlll[46];
        nArray[w.lIIlIIIIlIlll[7]] = lIIlIIIIlIlll[39];
        int[] nArray2 = nArray;
        int var20 = lIIlIIIIlIlll[0];
        while (w.lIlIIlllllllIIl(var20, ((void)var19).length)) {
            int[] nArray3 = new int[lIIlIIIIlIlll[1]];
            nArray3[w.lIIlIIIIlIlll[0]] = var19[var20];
            if (w.lIlIIlllllllIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIlIIIIlIlll[0];
            }
            ++var20;

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

    private static boolean lIlIIlllllllIll(int n2) {
        return n2 < 0;
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

    @Override
    public int Y() {
        try {
            w.bp();

        }
        catch (Exception exception) {
            // empty catch block
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

