/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.LHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.APHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.ASHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.GHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.JHelper;
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
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class ZHelper
implements ab {
    public static  boolean dQ;

    public static  boolean dP;
    static  String dc;
    public static  List<d> bx;
    public static  boolean dR;
    static  int dS;
    static  int dk;
    static  String h;
    static  int dL;
    public static  boolean bv;
    static  WorldPoint dg;

        return String.valueOf(llIlIIllllll);
    }

    private static boolean lllIIllIIlII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean ah() {
        int n2;
        if (z.lllIIlIlllII(e.j(dL), lIIIIlllII[152]) && z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
            n2 = lIIIIlllII[0];

            if (((0xB6 ^ 0x92) & ~(0xA2 ^ 0x86)) > 0) {
                return false;
            }
        } else {
            n2 = lIIIIlllII[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void llIlIlllIlIl;
        int[] nArray = new int[lIIIIlllII[13]];
        nArray[z.lIIIIlllII[1]] = lIIIIlllII[22];
        nArray[z.lIIIIlllII[0]] = lIIIIlllII[23];
        nArray[z.lIIIIlllII[7]] = lIIIIlllII[36];
        nArray[z.lIIIIlllII[9]] = lIIIIlllII[24];
        nArray[z.lIIIIlllII[10]] = lIIIIlllII[26];
        nArray[z.lIIIIlllII[11]] = lIIIIlllII[25];
        int[] nArray2 = nArray;
        int llIlIlllIlII = lIIIIlllII[1];
        while (z.lllIIlIIllII(llIlIlllIlII, ((void)llIlIlllIlIl).length)) {
            int[] nArray3 = new int[lIIIIlllII[0]];
            nArray3[z.lIIIIlllII[1]] = llIlIlllIlIl[llIlIlllIlII];
            if (z.lllIIlIllIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIIlllII[1];
            }
            ++llIlIlllIlII;

            if ((2 ^ 7) != 0) continue;
            return false;
        }
        return lIIIIlllII[0];
    }

    @Override
    public String ag() {
        return h;
    }

    private static boolean lllIIlIllIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void bm() {
        void llIlIlllIIlI;
        BankLocation bankLocation = BankLocation.getNearest();
        if (z.lllIIlIlllIl(bankLocation) && z.lllIIlIllIll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[236]];
            a.a(bankLocation);
        }
        if (z.lllIIlIlllIl(llIlIlllIIlI) && z.lllIIlIIlIll(llIlIlllIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (z.lllIIlIllIll(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlllII[12]);

            }
            if (z.lllIIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[237]];
                if (z.lllIIlIllllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIIIlllII[10]);

                }
                a.a(lIIIIlllII[22], lIIIIlllII[15]);
                a.a(lIIIIlllII[36], lIIIIlllII[7]);
                a.a(lIIIIlllII[14], lIIIIlllII[15]);
                a.a(lIIIIlllII[16], lIIIIlllII[11]);
                a.a(lIIIIlllII[18], lIIIIlllII[7]);
                a.a(lIIIIlllII[32], lIIIIlllII[0]);
                a.a(lIIIIlllII[30], lIIIIlllII[0]);
                a.a(lIIIIlllII[28], lIIIIlllII[0]);
                a.a(lIIIIlllII[19], lIIIIlllII[15]);
                a.a(lIIIIlllII[35], Inventory.getFreeSlots() - lIIIIlllII[0]);
            }
        }
    }

    private static boolean lllIIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIlIllllI(int n2) {
        return n2 > 0;
    }

    private static boolean lllIIlIlllll(int n2) {
        return n2 < 0;
    }

    private static boolean lllIIlIlllIl(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bn() {
        int n2;
        int[] nArray = new int[lIIIIlllII[0]];
        nArray[z.lIIIIlllII[1]] = lIIIIlllII[14];
        if (z.lllIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIIlllII[0]];
            nArray2[z.lIIIIlllII[1]] = lIIIIlllII[16];
            if (z.lllIIlIIlIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIIlllII[0]];
                nArray3[z.lIIIIlllII[1]] = lIIIIlllII[18];
                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lIIIIlllII[0];

                    if ((0x1C ^ 0x18) >= 0) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIIIIlllII[1];
        return n2 != 0;
    }

    private static boolean lllIIllIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int af() {
        try {
            z.bk();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= 2) {
            return (170 + 41 - 124 + 136 ^ 179 + 181 - 328 + 159) & (0x58 ^ 0x31 ^ (0xBC ^ 0xB5) ^ -1);
        }
        return lIIIIlllII[139];
    }

    private static int lllIIlIIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lllIIllIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lllIIlIIlIII() {
        lIIIIlIlII = new String[lIIIIlllII[309]];
        z.lIIIIlIlII[z.lIIIIlllII[1]] = "Finished buying items, switching back to quest";
        z.lIIIIlIlII[z.lIIIIlllII[0]] = "- Plague city";
        z.lIIIIlIlII[z.lIIIIlllII[7]] = "- Troll Stronghold";
        z.lIIIIlIlII[z.lIIIIlllII[9]] = "- Herblore";
        z.lIIIIlIlII[z.lIIIIlllII[10]] = z.lllIIIIllIll("", "TIQQj");
        z.lIIIIlIlII[z.lIIIIlllII[11]] = "Nav to bank";
        z.lIIIIlIlII[z.lIIIIlllII[13]] = "Handling banking";
        z.lIIIIlIlII[z.lIIIIlllII[20]] = "We are missing quest supplies, switching to BUYING";
        z.lIIIIlIlII[z.lIIIIlllII[27]] = "We are missing quest supplies, switching to BUYING";
        z.lIIIIlIlII[z.lIIIIlllII[29]] = "Drink";
        z.lIIIIlIlII[z.lIIIIlllII[15]] = "Drink";
        z.lIIIIlIlII[z.lIIIIlllII[31]] = "Shark";
        z.lIIIIlIlII[z.lIIIIlllII[33]] = "Shark";
        z.lIIIIlIlII[z.lIIIIlllII[21]] = "Eat";
        z.lIIIIlIlII[z.lIIIIlllII[38]] = "Drink";
        z.lIIIIlIlII[z.lIIIIlllII[39]] = "Nav to start";
        z.lIIIIlIlII[z.lIIIIlllII[40]] = "Sanfew";
        z.lIIIIlIlII[z.lIIIIlllII[41]] = "Nav to burthrope";
        z.lIIIIlIlII[z.lIIIIlllII[42]] = "Wear";
        z.lIIIIlIlII[z.lIIIIlllII[43]] = "Burthorpe";
        z.lIIIIlIlII[z.lIIIIlllII[44]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[45]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[46]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[47]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[37]] = "Exiting cave";
        z.lIIIIlIlII[z.lIIIIlllII[48]] = "Cave Exit";
        z.lIIIIlIlII[z.lIIIIlllII[49]] = "Exit";
        z.lIIIIlIlII[z.lIIIIlllII[50]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[53]] = "Nav to stairs";
        z.lIIIIlIlII[z.lIIIIlllII[54]] = "Going down stairs";
        z.lIIIIlIlII[z.lIIIIlllII[3]] = "Stone Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[8]] = "Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[55]] = "Burntmeat";
        z.lIIIIlIlII[z.lIIIIlllII[56]] = "Going upstairs";
        z.lIIIIlIlII[z.lIIIIlllII[57]] = "Stone Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[58]] = "Climb-up";
        z.lIIIIlIlII[z.lIIIIlllII[61]] = "Nav to exit";
        z.lIIIIlIlII[z.lIIIIlllII[62]] = "Exiting";
        z.lIIIIlIlII[z.lIIIIlllII[63]] = "Exit";
        z.lIIIIlIlII[z.lIIIIlllII[64]] = "Leave";
        z.lIIIIlIlII[z.lIIIIlllII[65]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[68]] = "Nav to Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[71]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[72]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[74]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[75]] = "Tele to ardy";
        z.lIIIIlIlII[z.lIIIIlllII[76]] = "Break";
        z.lIIIIlIlII[z.lIIIIlllII[77]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[78]] = "Parroty Pete";
        z.lIIIIlIlII[z.lIIIIlllII[81]] = "Nav to parroty pete";
        z.lIIIIlIlII[z.lIIIIlllII[6]] = "Parroty Pete";
        z.lIIIIlIlII[z.lIIIIlllII[82]] = "Parroty Pete";
        z.lIIIIlIlII[z.lIIIIlllII[83]] = "Parroty Pete";
        z.lIIIIlIlII[z.lIIIIlllII[84]] = "When did you add it?";
        z.lIIIIlIlII[z.lIIIIlllII[85]] = "Parroty Pete";
        z.lIIIIlIlII[z.lIIIIlllII[86]] = "What do you feed them?";
        z.lIIIIlIlII[z.lIIIIlllII[88]] = "Aviary Hatch";
        z.lIIIIlIlII[z.lIIIIlllII[89]] = "Parroty Pete";
        z.lIIIIlIlII[z.lIIIIlllII[90]] = "Nav to burthrope";
        z.lIIIIlIlII[z.lIIIIlllII[91]] = "Wear";
        z.lIIIIlIlII[z.lIIIIlllII[92]] = "Burthorpe";
        z.lIIIIlIlII[z.lIIIIlllII[93]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[94]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[95]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[96]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[97]] = "Exiting cave";
        z.lIIIIlIlII[z.lIIIIlllII[98]] = "Cave Exit";
        z.lIIIIlIlII[z.lIIIIlllII[99]] = "Exit";
        z.lIIIIlIlII[z.lIIIIlllII[100]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[102]] = "Nav to stairs";
        z.lIIIIlIlII[z.lIIIIlllII[103]] = "Going down stairs";
        z.lIIIIlIlII[z.lIIIIlllII[104]] = "Stone Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[105]] = "Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[106]] = "Nav to stair";
        z.lIIIIlIlII[z.lIIIIlllII[107]] = "Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[108]] = "Shark";
        z.lIIIIlIlII[z.lIIIIlllII[109]] = "Eat";
        z.lIIIIlIlII[z.lIIIIlllII[110]] = "Drink";
        z.lIIIIlIlII[z.lIIIIlllII[113]] = "Nav to rack";
        z.lIIIIlIlII[z.lIIIIlllII[114]] = "Putting parrot on rack";
        z.lIIIIlIlII[z.lIIIIlllII[115]] = "Rack";
        z.lIIIIlIlII[z.lIIIIlllII[119]] = "Nav to tegrid";
        z.lIIIIlIlII[z.lIIIIlllII[120]] = "Tegid";
        z.lIIIIlIlII[z.lIIIIlllII[121]] = "Sanfew won't be happy...";
        z.lIIIIlIlII[z.lIIIIlllII[122]] = "Tegid";
        z.lIIIIlIlII[z.lIIIIlllII[123]] = "Nav to burthrope";
        z.lIIIIlIlII[z.lIIIIlllII[124]] = "Wear";
        z.lIIIIlIlII[z.lIIIIlllII[125]] = "Burthorpe";
        z.lIIIIlIlII[z.lIIIIlllII[126]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[127]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[128]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[129]] = "Troll potion";
        z.lIIIIlIlII[z.lIIIIlllII[130]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[131]] = "Exiting cave";
        z.lIIIIlIlII[z.lIIIIlllII[132]] = "Cave Exit";
        z.lIIIIlIlII[z.lIIIIlllII[133]] = "Exit";
        z.lIIIIlIlII[z.lIIIIlllII[136]] = "Troll thistle";
        z.lIIIIlIlII[z.lIIIIlllII[137]] = "Getting thistle";
        z.lIIIIlIlII[z.lIIIIlllII[138]] = "Thistle";
        z.lIIIIlIlII[z.lIIIIlllII[30]] = "Pick";
        z.lIIIIlIlII[z.lIIIIlllII[139]] = "Troll thistle";
        z.lIIIIlIlII[z.lIIIIlllII[142]] = "Nav to FM tile";
        z.lIIIIlIlII[z.lIIIIlllII[143]] = "Burning fire";
        z.lIIIIlIlII[z.lIIIIlllII[144]] = "Tinderbox";
        z.lIIIIlIlII[z.lIIIIlllII[145]] = "Logs";
        z.lIIIIlIlII[z.lIIIIlllII[146]] = "Burning thistle";
        z.lIIIIlIlII[z.lIIIIlllII[147]] = "Troll thistle";
        z.lIIIIlIlII[z.lIIIIlllII[148]] = "Fire";
        z.lIIIIlIlII[z.lIIIIlllII[149]] = "Crushing thistle";
        z.lIIIIlIlII[z.lIIIIlllII[150]] = "Mixing potion";
        z.lIIIIlIlII[z.lIIIIlllII[152]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[153]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[154]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[155]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[156]] = "Exiting cave";
        z.lIIIIlIlII[z.lIIIIlllII[157]] = "Cave Exit";
        z.lIIIIlIlII[z.lIIIIlllII[158]] = "Exit";
        z.lIIIIlIlII[z.lIIIIlllII[159]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[160]] = "Nav to stairs";
        z.lIIIIlIlII[z.lIIIIlllII[161]] = "Going down stairs";
        z.lIIIIlIlII[z.lIIIIlllII[162]] = "Stone Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[163]] = "Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[164]] = "Nav to stair";
        z.lIIIIlIlII[z.lIIIIlllII[165]] = "Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[166]] = "Shark";
        z.lIIIIlIlII[z.lIIIIlllII[167]] = "Eat";
        z.lIIIIlIlII[z.lIIIIlllII[168]] = "Drink";
        z.lIIIIlIlII[z.lIIIIlllII[169]] = "Nav to rack";
        z.lIIIIlIlII[z.lIIIIlllII[170]] = "Getting parrot";
        z.lIIIIlIlII[z.lIIIIlllII[171]] = "Rack";
        z.lIIIIlIlII[z.lIIIIlllII[172]] = "Search";
        z.lIIIIlIlII[z.lIIIIlllII[177]] = "Nav to stairs";
        z.lIIIIlIlII[z.lIIIIlllII[178]] = "Go upstairs";
        z.lIIIIlIlII[z.lIIIIlllII[179]] = "Stone Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[180]] = "Climb-up";
        z.lIIIIlIlII[z.lIIIIlllII[183]] = "Nav to stair";
        z.lIIIIlIlII[z.lIIIIlllII[184]] = "Climb-up";
        z.lIIIIlIlII[z.lIIIIlllII[185]] = "Exiting stronghold";
        z.lIIIIlIlII[z.lIIIIlllII[186]] = "Exit";
        z.lIIIIlIlII[z.lIIIIlllII[187]] = "Use";
        z.lIIIIlIlII[z.lIIIIlllII[188]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[189]] = "Nav to Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[190]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[191]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[192]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[193]] = "Exiting cave";
        z.lIIIIlIlII[z.lIIIIlllII[194]] = "Cave Exit";
        z.lIIIIlIlII[z.lIIIIlllII[195]] = "Exit";
        z.lIIIIlIlII[z.lIIIIlllII[196]] = "Eadgar";
        z.lIIIIlIlII[z.lIIIIlllII[197]] = "Nav to stairs";
        z.lIIIIlIlII[z.lIIIIlllII[198]] = "Going down stairs";
        z.lIIIIlIlII[z.lIIIIlllII[199]] = "Stone Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[200]] = "Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[201]] = "Burntmeat";
        z.lIIIIlIlII[z.lIIIIlllII[203]] = "Burntmeat";
        z.lIIIIlIlII[z.lIIIIlllII[204]] = "So, where can I get some goutweed?";
        z.lIIIIlIlII[z.lIIIIlllII[205]] = "Getting key";
        z.lIIIIlIlII[z.lIIIIlllII[206]] = "Open";
        z.lIIIIlIlII[z.lIIIIlllII[207]] = "Open";
        z.lIIIIlIlII[z.lIIIIlllII[208]] = "Search";
        z.lIIIIlIlII[z.lIIIIlllII[209]] = "Go downstairs";
        z.lIIIIlIlII[z.lIIIIlllII[210]] = "Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[212]] = "Nav to start";
        z.lIIIIlIlII[z.lIIIIlllII[213]] = "Sanfew";
        z.lIIIIlIlII[z.lIIIIlllII[214]] = "Break";
        z.lIIIIlIlII[z.lIIIIlllII[2]] = "Entering maze";
        z.lIIIIlIlII[z.lIIIIlllII[225]] = "Open";
        z.lIIIIlIlII[z.lIIIIlllII[226]] = "Open";
        z.lIIIIlIlII[z.lIIIIlllII[227]] = "Open";
        z.lIIIIlIlII[z.lIIIIlllII[233]] = "Run to first hide spot";
        z.lIIIIlIlII[z.lIIIIlllII[234]] = "Run to crate";
        z.lIIIIlIlII[z.lIIIIlllII[235]] = "Search";
        z.lIIIIlIlII[z.lIIIIlllII[236]] = "Nav to bank";
        z.lIIIIlIlII[z.lIIIIlllII[237]] = "Handling banking";
        z.lIIIIlIlII[z.lIIIIlllII[260]] = "ring of wealth (";
        z.lIIIIlIlII[z.lIIIIlllII[261]] = "Goutweed";
        z.lIIIIlIlII[z.lIIIIlllII[269]] = "Door";
        z.lIIIIlIlII[z.lIIIIlllII[270]] = "Stone Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[271]] = "Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[276]] = "Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[277]] = "Climb-up";
        z.lIIIIlIlII[z.lIIIIlllII[278]] = "Prayer";
        z.lIIIIlIlII[z.lIIIIlllII[279]] = "Prayer";
        z.lIIIIlIlII[z.lIIIIlllII[280]] = "Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[281]] = "Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[282]] = "Fire";
        z.lIIIIlIlII[z.lIIIIlllII[283]] = "Fire";
        z.lIIIIlIlII[z.lIIIIlllII[284]] = "Games";
        z.lIIIIlIlII[z.lIIIIlllII[285]] = "Games";
        z.lIIIIlIlII[z.lIIIIlllII[286]] = "Games";
        z.lIIIIlIlII[z.lIIIIlllII[287]] = "Games";
        z.lIIIIlIlII[z.lIIIIlllII[288]] = "Prayer";
        z.lIIIIlIlII[z.lIIIIlllII[289]] = "Prayer";
        z.lIIIIlIlII[z.lIIIIlllII[290]] = "Staircase";
        z.lIIIIlIlII[z.lIIIIlllII[291]] = "Climb-down";
        z.lIIIIlIlII[z.lIIIIlllII[292]] = "Games";
        z.lIIIIlIlII[z.lIIIIlllII[293]] = "Games";
        z.lIIIIlIlII[z.lIIIIlllII[294]] = "Games";
        z.lIIIIlIlII[z.lIIIIlllII[295]] = "Games";
        z.lIIIIlIlII[z.lIIIIlllII[296]] = "Games";
        z.lIIIIlIlII[z.lIIIIlllII[297]] = "Games";
        z.lIIIIlIlII[z.lIIIIlllII[298]] = "Games";
        z.lIIIIlIlII[z.lIIIIlllII[299]] = "Games";
        z.lIIIIlIlII[z.lIIIIlllII[300]] = "poison";
        z.lIIIIlIlII[z.lIIIIlllII[301]] = "poison";
        z.lIIIIlIlII[z.lIIIIlllII[305]] = "Yes.";
        z.lIIIIlIlII[z.lIIIIlllII[306]] = "Have you any more work for me, to help reclaim the circle?";
        z.lIIIIlIlII[z.lIIIIlllII[307]] = "I need to find some goutweed.";
        z.lIIIIlIlII[z.lIIIIlllII[308]] = z.lllIIIIllIIl("4OhJuqW0hxo=", "cozxa");
    }

    private static  boolean a(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (z.lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[269]]) ? 1 : 0) && z.lllIIllIIIIl(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIlllII[9])) {
            n2 = lIIIIlllII[0];

        } else {
            n2 = lIIIIlllII[1];
        }
        return n2 != 0;
    }

    private static boolean lllIIlIlllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIIllIIIll(Object object) {
        return object == null;
    }

    @Override
    public boolean ae() {
        return lIIIIlllII[1];
    }

    static {
        z.lllIIlIIlIIl();
        z.lllIIlIIlIII();
        bx = new ArrayList<d>();
        dg = new WorldPoint(lIIIIlllII[302], lIIIIlllII[303], lIIIIlllII[0]);
        dL = lIIIIlllII[304];
        dS = lIIIIlllII[1];
        String[] stringArray = new String[lIIIIlllII[9]];
        stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[305]];
        stringArray[z.lIIIIlllII[0]] = lIIIIlIlII[lIIIIlllII[306]];
        stringArray[z.lIIIIlllII[7]] = lIIIIlIlII[lIIIIlllII[307]];
        cG = stringArray;
        dc = lIIIIlIlII[lIIIIlllII[308]];
        h = "Eadgars Ruse " + dc;
    }

    private static boolean lllIIlIIlIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void bl() {
        void llIllIIIIIII;
        void llIllIIIIIIl;
        void llIlIlllllll;
        NPC llIlIllllIll;
        NPC llIlIllllIlI;
        WorldArea worldArea = new WorldArea(lIIIIlllII[215], lIIIIlllII[216], lIIIIlllII[42], lIIIIlllII[38], lIIIIlllII[1]);
        WorldArea worldArea2 = new WorldArea(lIIIIlllII[215], lIIIIlllII[217], lIIIIlllII[38], lIIIIlllII[31], lIIIIlllII[1]);
        WorldPoint worldPoint = new WorldPoint(lIIIIlllII[218], lIIIIlllII[219], lIIIIlllII[1]);
        if (z.lllIIlIllIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.lllIIlIllIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint2 = new WorldPoint(lIIIIlllII[220], lIIIIlllII[219], lIIIIlllII[1]);
            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[2]];
            Movement.walkTo((WorldPoint)worldPoint);

            Time.sleepTicks((int)lIIIIlllII[0]);

            WorldArea worldArea3 = new WorldArea(lIIIIlllII[221], lIIIIlllII[217], lIIIIlllII[20], lIIIIlllII[29], lIIIIlllII[1]);
            WorldArea worldArea4 = new WorldArea(lIIIIlllII[222], lIIIIlllII[223], lIIIIlllII[11], lIIIIlllII[20], lIIIIlllII[1]);
            if ((!z.lllIIlIllIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || z.lllIIlIIlIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && z.lllIIlIlllIl(llIlIllllIlI = TileObjects.getNearest(arg_0 -> z.a((WorldPoint)(llIlIllllIll = new WorldPoint(lIIIIlllII[224], lIIIIlllII[219], lIIIIlllII[1])), arg_0)))) {
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[225]];
                if (z.lllIIlIIlIll(llIlIllllIlI.hasAction(stringArray) ? 1 : 0)) {
                    llIlIllllIlI.interact(lIIIIlIlII[lIIIIlllII[226]]);
                    Time.sleepTicks((int)lIIIIlllII[9]);

                }
                String[] stringArray2 = new String[lIIIIlllII[0]];
                stringArray2[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[227]];
                if (z.lllIIlIllIll(llIlIllllIlI.hasAction(stringArray2) ? 1 : 0) && z.lllIIlIllIll(Players.getLocal().getWorldLocation().equals((Object)llIlIlllllll) ? 1 : 0)) {
                    e.c((WorldPoint)llIlIlllllll);
                    Time.sleepTicks((int)lIIIIlllII[7]);

                }
            }
        }
        if (!z.lllIIlIllIll(llIllIIIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !z.lllIIlIllIll(llIllIIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || z.lllIIlIIlIll(Players.getLocal().getWorldLocation().equals((Object)llIlIlllllll) ? 1 : 0)) {
            TileObject llIlIllllIII;
            WorldArea llIlIllllllI = new WorldArea(lIIIIlllII[215], lIIIIlllII[228], lIIIIlllII[27], lIIIIlllII[13], lIIIIlllII[1]);
            WorldPoint llIlIlllllIl = new WorldPoint(lIIIIlllII[229], lIIIIlllII[230], lIIIIlllII[1]);
            NPC llIlIlllllII = NPCs.getNearest(nPC -> {
                int n2;
                if (z.lllIIllIIIlI(nPC.getId(), lIIIIlllII[268]) && z.lllIIlIIlIll(llIlIllllllI.contains(nPC.getWorldLocation()) ? 1 : 0)) {
                    n2 = lIIIIlllII[0];

                    if (1 >= 2) {
                        return false;
                    }
                } else {
                    n2 = lIIIIlllII[1];
                }
                return n2 != 0;
            });
            llIlIllllIll = NPCs.getNearest(nPC -> {
                int n2;
                if (z.lllIIllIIIlI(nPC.getId(), lIIIIlllII[266]) && (!z.lllIIlIllIll(nPC.getWorldLocation().equals((Object)new WorldPoint(lIIIIlllII[231], lIIIIlllII[267], lIIIIlllII[1])) ? 1 : 0) || !z.lllIIlIllIll(nPC.getWorldLocation().equals((Object)new WorldPoint(lIIIIlllII[262], lIIIIlllII[267], lIIIIlllII[1])) ? 1 : 0) || z.lllIIlIIlIll(nPC.getWorldLocation().equals((Object)new WorldPoint(lIIIIlllII[229], lIIIIlllII[267], lIIIIlllII[1])) ? 1 : 0))) {
                    n2 = lIIIIlllII[0];

                    if (2 >= (0x34 ^ 0x30)) {
                        return false;
                    }
                } else {
                    n2 = lIIIIlllII[1];
                }
                return n2 != 0;
            });
            llIlIllllIlI = NPCs.getNearest(nPC -> {
                int n2;
                if (z.lllIIllIIIlI(nPC.getId(), lIIIIlllII[263]) && (!z.lllIIlIllIll(nPC.getWorldLocation().equals((Object)new WorldPoint(lIIIIlllII[262], lIIIIlllII[264], lIIIIlllII[1])) ? 1 : 0) || z.lllIIlIIlIll(nPC.getWorldLocation().equals((Object)new WorldPoint(lIIIIlllII[265], lIIIIlllII[264], lIIIIlllII[1])) ? 1 : 0))) {
                    n2 = lIIIIlllII[0];

                } else {
                    n2 = lIIIIlllII[1];
                }
                return n2 != 0;
            });
            WorldPoint llIlIllllIIl = new WorldPoint(lIIIIlllII[231], lIIIIlllII[232], lIIIIlllII[1]);
            if (z.lllIIlIlllIl(llIlIlllllII) && z.lllIIlIlllIl(llIlIllllIll) && z.lllIIllIIIII(Players.getLocal().getWorldLocation().getY(), lIIIIlllII[217]) && z.lllIIlIlllII(Movement.getRunEnergy(), lIIIIlllII[44])) {
                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[233]];
                e.c(llIlIllllIIl);
                Time.sleepTicks((int)lIIIIlllII[7]);

            }
            if (z.lllIIlIIlIll(Players.getLocal().getWorldLocation().equals((Object)llIlIllllIIl) ? 1 : 0) && z.lllIIlIlllIl(llIlIllllIlI)) {
                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[234]];
                e.c(llIlIlllllIl);
                Time.sleepTicks((int)lIIIIlllII[7]);

            }
            if (z.lllIIlIIlIll(Players.getLocal().getWorldLocation().equals((Object)llIlIlllllIl) ? 1 : 0) && z.lllIIlIlllIl(llIlIllllIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (z.lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[261]]) ? 1 : 0) && z.lllIIlIIlIll(tileObject.getWorldLocation().equals((Object)new WorldPoint(lIIIIlllII[262], lIIIIlllII[230], lIIIIlllII[1])) ? 1 : 0)) {
                    n2 = lIIIIlllII[0];

                } else {
                    n2 = lIIIIlllII[1];
                }
                return n2 != 0;
            }))) {
                llIlIllllIII.interact(lIIIIlIlII[lIIIIlllII[235]]);
                Time.sleepTicks((int)lIIIIlllII[7]);

            }
        }
    }

    private static void Q() {
        block58: {
            d llIlIllIlllI;
            block57: {
                block56: {
                    block55: {
                        block54: {
                            block53: {
                                block52: {
                                    block51: {
                                        block50: {
                                            block49: {
                                                Object llIlIllIllll;
                                                block48: {
                                                    block47: {
                                                        block46: {
                                                            block45: {
                                                                block44: {
                                                                    block43: {
                                                                        block42: {
                                                                            block41: {
                                                                                block40: {
                                                                                    block39: {
                                                                                        int[] nArray = new int[lIIIIlllII[0]];
                                                                                        nArray[z.lIIIIlllII[1]] = lIIIIlllII[238];
                                                                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                                                                                        int[] nArray2 = new int[lIIIIlllII[0]];
                                                                                        nArray2[z.lIIIIlllII[1]] = lIIIIlllII[238];
                                                                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) break block40;
                                                                                        int[] nArray3 = new int[lIIIIlllII[0]];
                                                                                        nArray3[z.lIIIIlllII[1]] = lIIIIlllII[238];
                                                                                        if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIlllII[15])) break block40;
                                                                                    }
                                                                                    llIlIllIllll = new DHelper(lIIIIlllII[238], lIIIIlllII[15], e.c(lIIIIlllII[239], lIIIIlllII[240]));
                                                                                    bx.add((DHelper) lIlIllIllll);

                                                                                }
                                                                                int[] nArray = new int[lIIIIlllII[0]];
                                                                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[19];
                                                                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                                                                int[] nArray4 = new int[lIIIIlllII[0]];
                                                                                nArray4[z.lIIIIlllII[1]] = lIIIIlllII[19];
                                                                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) break block42;
                                                                                int[] nArray5 = new int[lIIIIlllII[0]];
                                                                                nArray5[z.lIIIIlllII[1]] = lIIIIlllII[19];
                                                                                if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray5).getQuantity(), lIIIIlllII[15])) break block42;
                                                                            }
                                                                            llIlIllIllll = new DHelper(lIIIIlllII[19], lIIIIlllII[15], lIIIIlllII[241]);
                                                                            bx.add((DHelper) lIlIllIllll);

                                                                        }
                                                                        int[] nArray = new int[lIIIIlllII[0]];
                                                                        nArray[z.lIIIIlllII[1]] = lIIIIlllII[14];
                                                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block43;
                                                                        int[] nArray6 = new int[lIIIIlllII[0]];
                                                                        nArray6[z.lIIIIlllII[1]] = lIIIIlllII[14];
                                                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) break block44;
                                                                        int[] nArray7 = new int[lIIIIlllII[0]];
                                                                        nArray7[z.lIIIIlllII[1]] = lIIIIlllII[14];
                                                                        if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIlllII[15])) break block44;
                                                                    }
                                                                    llIlIllIllll = new DHelper(lIIIIlllII[14], lIIIIlllII[15], e.c(lIIIIlllII[242], lIIIIlllII[243]));
                                                                    bx.add((DHelper) lIlIllIllll);

                                                                }
                                                                int[] nArray = new int[lIIIIlllII[0]];
                                                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[16];
                                                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                                                                int[] nArray8 = new int[lIIIIlllII[0]];
                                                                nArray8[z.lIIIIlllII[1]] = lIIIIlllII[16];
                                                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray8) ? 1 : 0)) break block46;
                                                                int[] nArray9 = new int[lIIIIlllII[0]];
                                                                nArray9[z.lIIIIlllII[1]] = lIIIIlllII[16];
                                                                if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray9).getQuantity(), lIIIIlllII[11])) break block46;
                                                            }
                                                            llIlIllIllll = new DHelper(lIIIIlllII[16], lIIIIlllII[11], e.c(lIIIIlllII[242], lIIIIlllII[243]));
                                                            bx.add((DHelper) lIlIllIllll);

                                                        }
                                                        int[] nArray = new int[lIIIIlllII[0]];
                                                        nArray[z.lIIIIlllII[1]] = lIIIIlllII[28];
                                                        if (z.lllIIlIllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                            llIlIllIllll = new DHelper(lIIIIlllII[28], lIIIIlllII[0], e.c(lIIIIlllII[244], lIIIIlllII[245]));
                                                            bx.add((DHelper) lIlIllIllll);

                                                        }
                                                        int[] nArray10 = new int[lIIIIlllII[0]];
                                                        nArray10[z.lIIIIlllII[1]] = lIIIIlllII[32];
                                                        if (z.lllIIlIllIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                                            llIlIllIllll = new DHelper(lIIIIlllII[32], lIIIIlllII[0], e.c(lIIIIlllII[244], lIIIIlllII[245]));
                                                            bx.add((DHelper) lIlIllIllll);

                                                        }
                                                        int[] nArray11 = new int[lIIIIlllII[0]];
                                                        nArray11[z.lIIIIlllII[1]] = lIIIIlllII[30];
                                                        if (z.lllIIlIllIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                                            llIlIllIllll = new DHelper(lIIIIlllII[30], lIIIIlllII[0], e.c(lIIIIlllII[246], lIIIIlllII[247]));
                                                            bx.add((DHelper) lIlIllIllll);

                                                        }
                                                        int[] nArray12 = new int[lIIIIlllII[0]];
                                                        nArray12[z.lIIIIlllII[1]] = lIIIIlllII[24];
                                                        if (z.lllIIlIllIll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                                            llIlIllIllll = new DHelper(lIIIIlllII[24], lIIIIlllII[0], e.c(lIIIIlllII[244], lIIIIlllII[245]));
                                                            bx.add((DHelper) lIlIllIllll);

                                                        }
                                                        int[] nArray13 = new int[lIIIIlllII[0]];
                                                        nArray13[z.lIIIIlllII[1]] = lIIIIlllII[34];
                                                        if (z.lllIIlIllIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                                            llIlIllIllll = new DHelper(lIIIIlllII[34], lIIIIlllII[11], e.c(lIIIIlllII[248], lIIIIlllII[249]));
                                                            bx.add((DHelper) lIlIllIllll);

                                                        }
                                                        int[] nArray14 = new int[lIIIIlllII[0]];
                                                        nArray14[z.lIIIIlllII[1]] = lIIIIlllII[25];
                                                        if (z.lllIIlIllIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                                            llIlIllIllll = new DHelper(lIIIIlllII[25], lIIIIlllII[0], e.c(lIIIIlllII[250], lIIIIlllII[251]));
                                                            bx.add((DHelper) lIlIllIllll);

                                                        }
                                                        int[] nArray15 = new int[lIIIIlllII[0]];
                                                        nArray15[z.lIIIIlllII[1]] = lIIIIlllII[26];
                                                        if (z.lllIIlIllIll(Bank.contains((int[])nArray15) ? 1 : 0)) {
                                                            llIlIllIllll = new DHelper(lIIIIlllII[26], lIIIIlllII[0], e.c(lIIIIlllII[250], lIIIIlllII[251]));
                                                            bx.add((DHelper) lIlIllIllll);

                                                        }
                                                        int[] nArray16 = new int[lIIIIlllII[0]];
                                                        nArray16[z.lIIIIlllII[1]] = lIIIIlllII[18];
                                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray16) ? 1 : 0)) break block47;
                                                        int[] nArray17 = new int[lIIIIlllII[0]];
                                                        nArray17[z.lIIIIlllII[1]] = lIIIIlllII[18];
                                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray17) ? 1 : 0)) break block48;
                                                        int[] nArray18 = new int[lIIIIlllII[0]];
                                                        nArray18[z.lIIIIlllII[1]] = lIIIIlllII[18];
                                                        if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray18).getQuantity(), lIIIIlllII[7])) break block48;
                                                    }
                                                    llIlIllIllll = new DHelper(lIIIIlllII[18], lIIIIlllII[7], e.c(lIIIIlllII[250], lIIIIlllII[251]));
                                                    bx.add((DHelper) lIlIllIllll);

                                                }
                                                if (z.lllIIlIllIll(Bank.contains((Predicate)(llIlIllIllll = item -> item.getName().toLowerCase().contains(lIIIIlIlII[lIIIIlllII[260]]))) ? 1 : 0)) {
                                                    llIlIllIlllI = new DHelper(lIIIIlllII[252], lIIIIlllII[11], lIIIIlllII[253]);
                                                    bx.add(llIlIllIlllI);

                                                }
                                                int[] nArray = new int[lIIIIlllII[0]];
                                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[254];
                                                if (z.lllIIlIllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    llIlIllIlllI = new DHelper(lIIIIlllII[254], lIIIIlllII[0], lIIIIlllII[255]);
                                                    bx.add(llIlIllIlllI);

                                                }
                                                int[] nArray19 = new int[lIIIIlllII[0]];
                                                nArray19[z.lIIIIlllII[1]] = lIIIIlllII[17];
                                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray19) ? 1 : 0)) break block49;
                                                int[] nArray20 = new int[lIIIIlllII[0]];
                                                nArray20[z.lIIIIlllII[1]] = lIIIIlllII[17];
                                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray20) ? 1 : 0)) break block50;
                                                int[] nArray21 = new int[lIIIIlllII[0]];
                                                nArray21[z.lIIIIlllII[1]] = lIIIIlllII[17];
                                                if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray21).getQuantity(), lIIIIlllII[15])) break block50;
                                            }
                                            llIlIllIlllI = new DHelper(lIIIIlllII[17], lIIIIlllII[15], e.c(lIIIIlllII[256], lIIIIlllII[257]));
                                            bx.add(llIlIllIlllI);

                                        }
                                        int[] nArray = new int[lIIIIlllII[0]];
                                        nArray[z.lIIIIlllII[1]] = lIIIIlllII[36];
                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block51;
                                        int[] nArray22 = new int[lIIIIlllII[0]];
                                        nArray22[z.lIIIIlllII[1]] = lIIIIlllII[36];
                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray22) ? 1 : 0)) break block52;
                                        int[] nArray23 = new int[lIIIIlllII[0]];
                                        nArray23[z.lIIIIlllII[1]] = lIIIIlllII[36];
                                        if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray23).getQuantity(), lIIIIlllII[10])) break block52;
                                    }
                                    llIlIllIlllI = new DHelper(lIIIIlllII[36], lIIIIlllII[10], j.ch);
                                    bx.add(llIlIllIlllI);

                                }
                                int[] nArray = new int[lIIIIlllII[0]];
                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[35];
                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block53;
                                int[] nArray24 = new int[lIIIIlllII[0]];
                                nArray24[z.lIIIIlllII[1]] = lIIIIlllII[35];
                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray24) ? 1 : 0)) break block54;
                                int[] nArray25 = new int[lIIIIlllII[0]];
                                nArray25[z.lIIIIlllII[1]] = lIIIIlllII[35];
                                if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray25).getQuantity(), lIIIIlllII[44])) break block54;
                            }
                            llIlIllIlllI = new DHelper(lIIIIlllII[35], lIIIIlllII[44], lIIIIlllII[241]);
                            bx.add(llIlIllIlllI);

                        }
                        int[] nArray = new int[lIIIIlllII[0]];
                        nArray[z.lIIIIlllII[1]] = lIIIIlllII[22];
                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block55;
                        int[] nArray26 = new int[lIIIIlllII[0]];
                        nArray26[z.lIIIIlllII[1]] = lIIIIlllII[22];
                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray26) ? 1 : 0)) break block56;
                        int[] nArray27 = new int[lIIIIlllII[0]];
                        nArray27[z.lIIIIlllII[1]] = lIIIIlllII[22];
                        if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray27).getQuantity(), lIIIIlllII[39])) break block56;
                    }
                    llIlIllIlllI = new DHelper(lIIIIlllII[22], lIIIIlllII[65], lIIIIlllII[258]);
                    bx.add(llIlIllIlllI);

                }
                int[] nArray = new int[lIIIIlllII[0]];
                nArray[z.lIIIIlllII[1]] = lIIIIlllII[23];
                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block57;
                int[] nArray28 = new int[lIIIIlllII[0]];
                nArray28[z.lIIIIlllII[1]] = lIIIIlllII[23];
                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray28) ? 1 : 0)) break block58;
                int[] nArray29 = new int[lIIIIlllII[0]];
                nArray29[z.lIIIIlllII[1]] = lIIIIlllII[23];
                if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray29).getQuantity(), lIIIIlllII[39])) break block58;
            }
            llIlIllIlllI = new DHelper(lIIIIlllII[23], lIIIIlllII[39], lIIIIlllII[259]);
            bx.add(llIlIllIlllI);

        }
    }

    public static void bk() {
        block177: {
            WorldPoint llIllIIIlllI;
            BankLocation llIllIIIllll;
            block180: {
                block186: {
                    block182: {
                        block185: {
                            block184: {
                                block183: {
                                    block181: {
                                        block179: {
                                            block178: {
                                                if (z.lllIIlIIlIll(bv ? 1 : 0)) {
                                                    b.a(bx);
                                                    if (z.lllIIlIIllII(bx.size(), lIIIIlllII[0])) {
                                                        System.out.println(lIIIIlIlII[lIIIIlllII[1]]);
                                                        bv = lIIIIlllII[1];
                                                    }
                                                }
                                                if (!z.lllIIlIllIll(bv ? 1 : 0)) break block177;
                                                if (!z.lllIIlIlllII(e.j(lIIIIlllII[2]), lIIIIlllII[3])) break block178;
                                                int[] nArray = new int[lIIIIlllII[0]];
                                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[4];
                                                if (!z.lllIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block179;
                                            }
                                            dc = lIIIIlIlII[lIIIIlllII[0]];
                                            F.bG();
                                        }
                                        if (z.lllIIlIlllII(e.j(lIIIIlllII[2]), lIIIIlllII[3])) {
                                            int[] nArray = new int[lIIIIlllII[0]];
                                            nArray[z.lIIIIlllII[1]] = lIIIIlllII[4];
                                            if (z.lllIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0) && z.lllIIlIIllII(e.j(lIIIIlllII[5]), lIIIIlllII[6])) {
                                                dc = lIIIIlIlII[lIIIIlllII[7]];
                                                L.cl();
                                            }
                                        }
                                        if (z.lllIIlIlllII(e.j(lIIIIlllII[2]), lIIIIlllII[3])) {
                                            int[] nArray = new int[lIIIIlllII[0]];
                                            nArray[z.lIIIIlllII[1]] = lIIIIlllII[4];
                                            if (z.lllIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0) && z.lllIIlIlllII(e.j(lIIIIlllII[5]), lIIIIlllII[6]) && z.lllIIlIIllII(Skills.getLevel((Skill)Skill.HERBLORE), lIIIIlllII[8])) {
                                                dc = lIIIIlIlII[lIIIIlllII[9]];
                                                ap.eK();
                                            }
                                        }
                                        e.t();
                                        if (!z.lllIIlIllIll(z.an() ? 1 : 0) || !z.lllIIlIlllII(e.j(lIIIIlllII[2]), lIIIIlllII[3])) break block180;
                                        int[] nArray = new int[lIIIIlllII[0]];
                                        nArray[z.lIIIIlllII[1]] = lIIIIlllII[4];
                                        if (!z.lllIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0) || !z.lllIIlIlllII(e.j(lIIIIlllII[5]), lIIIIlllII[6]) || !z.lllIIlIlllII(Skills.getLevel((Skill)Skill.HERBLORE), lIIIIlllII[8]) || !z.lllIIlIIllII(e.j(dL), lIIIIlllII[0])) break block180;
                                        dc = lIIIIlIlII[lIIIIlllII[10]];
                                        llIllIIIllll = BankLocation.getNearest();
                                        if (z.lllIIlIlllIl(llIllIIIllll) && z.lllIIlIllIll(llIllIIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[11]];
                                            a.a(llIllIIIllll);
                                        }
                                        if (!z.lllIIlIlllIl(llIllIIIllll) || !z.lllIIlIIlIll(llIllIIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block180;
                                        if (z.lllIIlIllIll(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlllII[12]);

                                        }
                                        if (!z.lllIIlIIlIll(Bank.isOpen() ? 1 : 0)) break block180;
                                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[13]];
                                        if (z.lllIIlIllllI(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lIIIIlllII[10]);

                                        }
                                        if (z.lllIIlIllllI(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lIIIIlllII[7]);

                                        }
                                        int[] nArray2 = new int[lIIIIlllII[0]];
                                        nArray2[z.lIIIIlllII[1]] = lIIIIlllII[14];
                                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) break block181;
                                        int[] nArray3 = new int[lIIIIlllII[0]];
                                        nArray3[z.lIIIIlllII[1]] = lIIIIlllII[14];
                                        if (!z.lllIIlIlllII(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIlllII[15])) break block182;
                                    }
                                    int[] nArray = new int[lIIIIlllII[0]];
                                    nArray[z.lIIIIlllII[1]] = lIIIIlllII[16];
                                    if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block183;
                                    int[] nArray4 = new int[lIIIIlllII[0]];
                                    nArray4[z.lIIIIlllII[1]] = lIIIIlllII[16];
                                    if (!z.lllIIlIlllII(Bank.getFirst((int[])nArray4).getQuantity(), lIIIIlllII[11])) break block182;
                                }
                                int[] nArray = new int[lIIIIlllII[0]];
                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[17];
                                if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block184;
                                int[] nArray5 = new int[lIIIIlllII[0]];
                                nArray5[z.lIIIIlllII[1]] = lIIIIlllII[17];
                                if (!z.lllIIlIlllII(Bank.getFirst((int[])nArray5).getQuantity(), lIIIIlllII[11])) break block182;
                            }
                            int[] nArray = new int[lIIIIlllII[0]];
                            nArray[z.lIIIIlllII[1]] = lIIIIlllII[18];
                            if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block185;
                            int[] nArray6 = new int[lIIIIlllII[0]];
                            nArray6[z.lIIIIlllII[1]] = lIIIIlllII[18];
                            if (!z.lllIIlIlllII(Bank.getFirst((int[])nArray6).getQuantity(), lIIIIlllII[7])) break block182;
                        }
                        int[] nArray = new int[lIIIIlllII[0]];
                        nArray[z.lIIIIlllII[1]] = lIIIIlllII[19];
                        if (!z.lllIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block186;
                        int[] nArray7 = new int[lIIIIlllII[0]];
                        nArray7[z.lIIIIlllII[1]] = lIIIIlllII[19];
                        if (!z.lllIIlIIllII(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIlllII[11])) break block186;
                    }
                    z.Q();
                    System.out.println(lIIIIlIlII[lIIIIlllII[20]]);
                    bv = lIIIIlllII[0];
                    return;
                }
                int[] nArray = new int[lIIIIlllII[21]];
                nArray[z.lIIIIlllII[1]] = lIIIIlllII[22];
                nArray[z.lIIIIlllII[0]] = lIIIIlllII[23];
                nArray[z.lIIIIlllII[7]] = lIIIIlllII[24];
                nArray[z.lIIIIlllII[9]] = lIIIIlllII[25];
                nArray[z.lIIIIlllII[10]] = lIIIIlllII[26];
                nArray[z.lIIIIlllII[11]] = lIIIIlllII[18];
                nArray[z.lIIIIlllII[13]] = lIIIIlllII[14];
                nArray[z.lIIIIlllII[20]] = lIIIIlllII[16];
                nArray[z.lIIIIlllII[27]] = lIIIIlllII[28];
                nArray[z.lIIIIlllII[29]] = lIIIIlllII[30];
                nArray[z.lIIIIlllII[15]] = lIIIIlllII[17];
                nArray[z.lIIIIlllII[31]] = lIIIIlllII[32];
                nArray[z.lIIIIlllII[33]] = lIIIIlllII[19];
                if (z.lllIIlIllIll(e.d(nArray) ? 1 : 0)) {
                    z.Q();
                    System.out.println(lIIIIlIlII[lIIIIlllII[27]]);
                    bv = lIIIIlllII[0];
                    return;
                }
                int[] nArray8 = new int[lIIIIlllII[21]];
                nArray8[z.lIIIIlllII[1]] = lIIIIlllII[22];
                nArray8[z.lIIIIlllII[0]] = lIIIIlllII[23];
                nArray8[z.lIIIIlllII[7]] = lIIIIlllII[24];
                nArray8[z.lIIIIlllII[9]] = lIIIIlllII[25];
                nArray8[z.lIIIIlllII[10]] = lIIIIlllII[26];
                nArray8[z.lIIIIlllII[11]] = lIIIIlllII[18];
                nArray8[z.lIIIIlllII[13]] = lIIIIlllII[14];
                nArray8[z.lIIIIlllII[20]] = lIIIIlllII[16];
                nArray8[z.lIIIIlllII[27]] = lIIIIlllII[28];
                nArray8[z.lIIIIlllII[29]] = lIIIIlllII[30];
                nArray8[z.lIIIIlllII[15]] = lIIIIlllII[17];
                nArray8[z.lIIIIlllII[31]] = lIIIIlllII[32];
                nArray8[z.lIIIIlllII[33]] = lIIIIlllII[19];
                if (z.lllIIlIIlIll(e.d(nArray8) ? 1 : 0)) {
                    a.a(lIIIIlllII[22], lIIIIlllII[15]);
                    a.a(lIIIIlllII[25], lIIIIlllII[0]);
                    a.a(lIIIIlllII[26], lIIIIlllII[0]);
                    a.a(lIIIIlllII[23], lIIIIlllII[15]);
                    a.a(lIIIIlllII[34], lIIIIlllII[0]);
                    a.a(lIIIIlllII[35], lIIIIlllII[13]);
                    a.a(lIIIIlllII[17], lIIIIlllII[7]);
                    a.a(lIIIIlllII[36], lIIIIlllII[9]);
                    a.a(lIIIIlllII[24], lIIIIlllII[0]);
                    a.a(lIIIIlllII[19], lIIIIlllII[15]);
                }
            }
            if (z.lllIIlIIlIll(Inventory.contains((int[])f.bc) ? 1 : 0) && z.lllIIlIIllII(Movement.getRunEnergy(), lIIIIlllII[6])) {
                Inventory.getFirst((int[])f.bc).interact(lIIIIlIlII[lIIIIlllII[29]]);
                Time.sleepTicks((int)lIIIIlllII[0]);

            }
            if (z.lllIIlIIlIll(Inventory.contains((int[])f.aZ) ? 1 : 0) && z.lllIIlIIllII(Prayers.getPoints(), lIIIIlllII[37])) {
                Inventory.getFirst((int[])f.aZ).interact(lIIIIlIlII[lIIIIlllII[15]]);
            }
            if (z.lllIIlIlllll(z.lllIIlIIlIlI(e.w(), 60.0))) {
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[31]];
                if (z.lllIIlIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIIlllII[0]];
                    stringArray2[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[33]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIIlIlII[lIIIIlllII[21]]);
                    Time.sleepTicks((int)lIIIIlllII[7]);

                }
            }
            if (z.lllIIlIIlIll(e.s() ? 1 : 0) && z.lllIIlIIlIll(Inventory.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[301]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[300]])).interact(lIIIIlIlII[lIIIIlllII[38]]);
                Time.sleepTicks((int)lIIIIlllII[7]);

            }
            if (z.lllIIlIllIll(e.j(dL)) && z.lllIIlIIlIll(z.an() ? 1 : 0)) {
                if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[39]];
                    if (z.lllIIlIIlIll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)dg);

                    Time.sleepTicks((int)lIIIIlllII[0]);

                }
                if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                    g.a(lIIIIlIlII[lIIIIlllII[40]], cG, lIIIIlllII[0]);
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[15])) {
                dk = lIIIIlllII[1];
                if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[41]];
                    if (z.lllIIlIIlIll(Inventory.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[299]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[298]])).interact(lIIIIlIlII[lIIIIlllII[42]]);
                    }
                    if (z.lllIIlIIlIll(Equipment.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[297]])) ? 1 : 0)) {
                        Equipment.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[296]])).interact(lIIIIlIlII[lIIIIlllII[43]]);
                        Time.sleepTicks((int)lIIIIlllII[13]);

                    }
                }
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[44]];
                if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray))) {
                    L.cp();
                }
                String[] stringArray3 = new String[lIIIIlllII[0]];
                stringArray3[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[45]];
                if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray3))) {
                    g.a(lIIIIlIlII[lIIIIlllII[46]], cG);
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[39])) {
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[47]];
                if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[37]];
                    String[] stringArray4 = new String[lIIIIlllII[0]];
                    stringArray4[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[48]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIIIIlIlII[lIIIIlllII[49]]);
                    Time.sleepTicks((int)lIIIIlllII[9]);

                }
                String[] stringArray5 = new String[lIIIIlllII[0]];
                stringArray5[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[50]];
                if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray5))) {
                    if (z.lllIIlIllIll(L.cq() ? 1 : 0)) {
                        L.co();
                    }
                    if (z.lllIIlIIlIll(L.cq() ? 1 : 0)) {
                        if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                            llIllIIIllll = new WorldPoint(lIIIIlllII[51], lIIIIlllII[52], lIIIIlllII[7]);
                            if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[53]];
                                Movement.walkTo((WorldPoint)llIllIIIllll);

                                Time.sleepTicks((int)lIIIIlllII[0]);

                            }
                            if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[54]];
                                String[] stringArray6 = new String[lIIIIlllII[0]];
                                stringArray6[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[3]];
                                TileObjects.getNearest((String[])stringArray6).interact(lIIIIlIlII[lIIIIlllII[8]]);
                                Time.sleepTicks((int)lIIIIlllII[10]);

                            }
                        }
                        if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0])) {
                            g.a(lIIIIlIlII[lIIIIlllII[55]], cG);
                        }
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[48])) {
                if (z.lllIIlIIlIll(L.cq() ? 1 : 0)) {
                    if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0])) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[56]];
                        String[] stringArray = new String[lIIIIlllII[0]];
                        stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[57]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIIlIlII[lIIIIlllII[58]]);
                        Time.sleepTicks((int)lIIIIlllII[10]);

                    }
                    if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                        llIllIIIllll = new WorldPoint(lIIIIlllII[59], lIIIIlllII[60], lIIIIlllII[7]);
                        if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[9])) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[61]];
                            Movement.walkTo((WorldPoint)llIllIIIllll);

                            Time.sleepTicks((int)lIIIIlllII[0]);

                        }
                        if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[9])) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[62]];
                            String[] stringArray = new String[lIIIIlllII[0]];
                            stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[63]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIIIlIlII[lIIIIlllII[64]]);
                            Time.sleepTicks((int)lIIIIlllII[9]);

                        }
                    }
                }
                if (z.lllIIlIllIll(L.cq() ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIlllII[0]];
                    stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[65]];
                    if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray))) {
                        llIllIIIllll = new WorldArea(lIIIIlllII[66], lIIIIlllII[67], lIIIIlllII[44], lIIIIlllII[43], lIIIIlllII[1]);
                        if (z.lllIIlIIlIll(llIllIIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[68]];
                            llIllIIIlllI = new WorldPoint(lIIIIlllII[69], lIIIIlllII[70], lIIIIlllII[1]);
                            Movement.walkTo((WorldPoint)llIllIIIlllI);

                            Time.sleepTicks((int)lIIIIlllII[0]);

                        }
                        if (z.lllIIlIllIll(llIllIIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            L.cp();
                        }
                    }
                }
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[71]];
                if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray))) {
                    g.a(lIIIIlIlII[lIIIIlllII[72]], cG);
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[3])) {
                int[] nArray = new int[lIIIIlllII[0]];
                nArray[z.lIIIIlllII[1]] = lIIIIlllII[73];
                if (z.lllIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIlllII[0]];
                    stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[74]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray))) {
                        int[] nArray9 = new int[lIIIIlllII[0]];
                        nArray9[z.lIIIIlllII[1]] = lIIIIlllII[23];
                        if (z.lllIIlIIlIll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[75]];
                            int[] nArray10 = new int[lIIIIlllII[0]];
                            nArray10[z.lIIIIlllII[1]] = lIIIIlllII[23];
                            Inventory.getFirst((int[])nArray10).interact(lIIIIlIlII[lIIIIlllII[76]]);
                            Time.sleepTicks((int)lIIIIlllII[13]);

                        }
                    }
                    String[] stringArray7 = new String[lIIIIlllII[0]];
                    stringArray7[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[77]];
                    if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray7))) {
                        String[] stringArray8 = new String[lIIIIlllII[0]];
                        stringArray8[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[78]];
                        if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray8))) {
                            llIllIIIllll = new WorldPoint(lIIIIlllII[79], lIIIIlllII[80], lIIIIlllII[1]);
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[81]];
                            Movement.walkTo((WorldPoint)llIllIIIllll);

                            Time.sleepTicks((int)lIIIIlllII[0]);

                        }
                    }
                    String[] stringArray9 = new String[lIIIIlllII[0]];
                    stringArray9[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[6]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray9))) {
                        if (z.lllIIlIllIll(dP ? 1 : 0) && z.lllIIlIllIll(dQ ? 1 : 0)) {
                            g.a(lIIIIlIlII[lIIIIlllII[82]], cG);
                        }
                        if (z.lllIIlIllIll(dP ? 1 : 0)) {
                            String[] stringArray10 = new String[lIIIIlllII[0]];
                            stringArray10[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[84]];
                            g.a(lIIIIlIlII[lIIIIlllII[83]], stringArray10);
                        }
                        if (z.lllIIlIIlIll(dP ? 1 : 0) && z.lllIIlIllIll(dQ ? 1 : 0)) {
                            String[] stringArray11 = new String[lIIIIlllII[0]];
                            stringArray11[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[86]];
                            g.a(lIIIIlIlII[lIIIIlllII[85]], stringArray11);
                        }
                        if (z.lllIIlIIlIll(dQ ? 1 : 0) && z.lllIIlIIlIll(dP ? 1 : 0)) {
                            int[] nArray11 = new int[lIIIIlllII[0]];
                            nArray11[z.lIIIIlllII[1]] = lIIIIlllII[26];
                            if (z.lllIIlIIlIll(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIIIIlllII[0]];
                                nArray12[z.lIIIIlllII[1]] = lIIIIlllII[26];
                                int[] nArray13 = new int[lIIIIlllII[0]];
                                nArray13[z.lIIIIlllII[1]] = lIIIIlllII[25];
                                Inventory.getFirst((int[])nArray12).useOn(Inventory.getFirst((int[])nArray13));
                            }
                            int[] nArray14 = new int[lIIIIlllII[0]];
                            nArray14[z.lIIIIlllII[1]] = lIIIIlllII[87];
                            if (z.lllIIlIIlIll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                int[] nArray15 = new int[lIIIIlllII[0]];
                                nArray15[z.lIIIIlllII[1]] = lIIIIlllII[87];
                                String[] stringArray12 = new String[lIIIIlllII[0]];
                                stringArray12[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[88]];
                                Inventory.getFirst((int[])nArray15).useOn(TileObjects.getNearest((String[])stringArray12));
                            }
                        }
                    }
                }
                int[] nArray16 = new int[lIIIIlllII[0]];
                nArray16[z.lIIIIlllII[1]] = lIIIIlllII[73];
                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIlllII[0]];
                    stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[89]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray))) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[90]];
                        if (z.lllIIlIIlIll(Inventory.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[295]])) ? 1 : 0)) {
                            Inventory.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[294]])).interact(lIIIIlIlII[lIIIIlllII[91]]);
                        }
                        if (z.lllIIlIIlIll(Equipment.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[293]])) ? 1 : 0)) {
                            Equipment.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[292]])).interact(lIIIIlIlII[lIIIIlllII[92]]);
                            Time.sleepTicks((int)lIIIIlllII[13]);

                        }
                    }
                    String[] stringArray13 = new String[lIIIIlllII[0]];
                    stringArray13[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[93]];
                    if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray13))) {
                        L.cp();
                    }
                    String[] stringArray14 = new String[lIIIIlllII[0]];
                    stringArray14[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[94]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray14))) {
                        g.a(lIIIIlIlII[lIIIIlllII[95]], cG);
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[6])) {
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[96]];
                if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[97]];
                    String[] stringArray15 = new String[lIIIIlllII[0]];
                    stringArray15[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[98]];
                    TileObjects.getNearest((String[])stringArray15).interact(lIIIIlIlII[lIIIIlllII[99]]);
                    Time.sleepTicks((int)lIIIIlllII[9]);

                }
                String[] stringArray16 = new String[lIIIIlllII[0]];
                stringArray16[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[100]];
                if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray16))) {
                    if (z.lllIIlIllIll(L.cq() ? 1 : 0)) {
                        L.co();
                    }
                    if (z.lllIIlIIlIll(L.cq() ? 1 : 0)) {
                        if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                            llIllIIIllll = new WorldPoint(lIIIIlllII[51], lIIIIlllII[101], lIIIIlllII[7]);
                            if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[102]];
                                Movement.walkTo((WorldPoint)llIllIIIllll);

                                Time.sleepTicks((int)lIIIIlllII[0]);

                            }
                            if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[103]];
                                String[] stringArray17 = new String[lIIIIlllII[0]];
                                stringArray17[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[104]];
                                TileObjects.getNearest((String[])stringArray17).interact(lIIIIlIlII[lIIIIlllII[105]]);
                                Time.sleepTicks((int)lIIIIlllII[10]);

                            }
                        }
                        if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0]) && z.lllIIlIlllIl(llIllIIIllll = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (z.lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[290]]) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIIlllII[0]];
                                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[291]];
                                if (z.lllIIlIIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lIIIIlllII[0];

                                    if (-3 < 0) return n2 != 0;
                                    return ((146 + 183 - 315 + 201 ^ 144 + 120 - 236 + 117) & (0x11 ^ 0x1E ^ (0x51 ^ 0x18) ^ -1)) != 0;
                                }
                            }
                            n2 = lIIIIlllII[1];
                            return n2 != 0;
                        }))) {
                            if (z.lllIIlIllIll(Reachable.isInteractable((Locatable)llIllIIIllll) ? 1 : 0)) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[106]];
                                Movement.walkTo((WorldPoint)llIllIIIllll.getWorldLocation());

                                Time.sleepTicks((int)lIIIIlllII[0]);

                            }
                            if (z.lllIIlIIlIll(Reachable.isInteractable((Locatable)llIllIIIllll) ? 1 : 0)) {
                                llIllIIIllll.interact(lIIIIlIlII[lIIIIlllII[107]]);
                                Time.sleepTicks((int)lIIIIlllII[7]);

                            }
                        }
                        if (z.lllIIlIllIll(Players.getLocal().getWorldLocation().getPlane())) {
                            if (z.lllIIlIlllll(z.lllIIlIIlIlI(e.w(), 100.0))) {
                                int[] nArray = new int[lIIIIlllII[0]];
                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[35];
                                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    String[] stringArray18 = new String[lIIIIlllII[0]];
                                    stringArray18[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[108]];
                                    Inventory.getFirst((String[])stringArray18).interact(lIIIIlIlII[lIIIIlllII[109]]);
                                    Time.sleepTicks((int)lIIIIlllII[0]);

                                }
                            }
                            if (z.lllIIllIIlII(Prayers.getPoints(), Skills.getLevel((Skill)Skill.PRAYER)) && z.lllIIlIIlIll(Inventory.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[289]])) ? 1 : 0)) {
                                Inventory.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[288]])).interact(lIIIIlIlII[lIIIIlllII[110]]);
                                Time.sleepTicks((int)lIIIIlllII[0]);

                            }
                            llIllIIIllll = new WorldPoint(lIIIIlllII[111], lIIIIlllII[112], lIIIIlllII[1]);
                            if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[15])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[113]];
                                Movement.walkTo((WorldPoint)llIllIIIllll);

                                Time.sleepTicks((int)lIIIIlllII[0]);

                            }
                            if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[15])) {
                                int[] nArray = new int[lIIIIlllII[0]];
                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[73];
                                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[114]];
                                    int[] nArray17 = new int[lIIIIlllII[0]];
                                    nArray17[z.lIIIIlllII[1]] = lIIIIlllII[73];
                                    String[] stringArray19 = new String[lIIIIlllII[0]];
                                    stringArray19[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[115]];
                                    Inventory.getFirst((int[])nArray17).useOn(TileObjects.getNearest((String[])stringArray19));
                                    Time.sleepTicks((int)lIIIIlllII[9]);

                                }
                            }
                        }
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[92])) {
                int[] nArray = new int[lIIIIlllII[0]];
                nArray[z.lIIIIlllII[1]] = lIIIIlllII[116];
                if (z.lllIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (z.lllIIlIllIll(z.bn() ? 1 : 0)) {
                        z.bm();
                    }
                    if (z.lllIIlIIlIll(z.bn() ? 1 : 0)) {
                        llIllIIIllll = new WorldPoint(lIIIIlllII[117], lIIIIlllII[118], lIIIIlllII[1]);
                        if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[11])) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[119]];
                            Movement.walkTo((WorldPoint)llIllIIIllll);

                            Time.sleepTicks((int)lIIIIlllII[0]);

                        }
                        if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[11])) {
                            String[] stringArray = new String[lIIIIlllII[0]];
                            stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[121]];
                            g.a(lIIIIlIlII[lIIIIlllII[120]], stringArray);
                        }
                    }
                }
                int[] nArray18 = new int[lIIIIlllII[0]];
                nArray18[z.lIIIIlllII[1]] = lIIIIlllII[116];
                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIlllII[0]];
                    stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[122]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray))) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[123]];
                        if (z.lllIIlIIlIll(Inventory.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[287]])) ? 1 : 0)) {
                            Inventory.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[286]])).interact(lIIIIlIlII[lIIIIlllII[124]]);
                        }
                        if (z.lllIIlIIlIll(Equipment.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[285]])) ? 1 : 0)) {
                            Equipment.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[284]])).interact(lIIIIlIlII[lIIIIlllII[125]]);
                            Time.sleepTicks((int)lIIIIlllII[13]);

                        }
                    }
                    String[] stringArray20 = new String[lIIIIlllII[0]];
                    stringArray20[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[126]];
                    if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray20))) {
                        L.cp();
                    }
                    String[] stringArray21 = new String[lIIIIlllII[0]];
                    stringArray21[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[127]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray21))) {
                        g.a(lIIIIlIlII[lIIIIlllII[128]], cG);
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[103])) {
                g.a(new String[lIIIIlllII[1]]);
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[115])) {
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[129]];
                if (z.lllIIlIllIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray22 = new String[lIIIIlllII[0]];
                    stringArray22[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[130]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray22))) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[131]];
                        String[] stringArray23 = new String[lIIIIlllII[0]];
                        stringArray23[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[132]];
                        TileObjects.getNearest((String[])stringArray23).interact(lIIIIlIlII[lIIIIlllII[133]]);
                        Time.sleepTicks((int)lIIIIlllII[10]);

                    }
                    int[] nArray = new int[lIIIIlllII[0]];
                    nArray[z.lIIIIlllII[1]] = lIIIIlllII[134];
                    if (z.lllIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray19 = new int[lIIIIlllII[0]];
                        nArray19[z.lIIIIlllII[1]] = lIIIIlllII[135];
                        if (z.lllIIlIllIll(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                            String[] stringArray24 = new String[lIIIIlllII[0]];
                            stringArray24[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[136]];
                            if (z.lllIIlIllIll(Inventory.contains((String[])stringArray24) ? 1 : 0)) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[137]];
                                String[] stringArray25 = new String[lIIIIlllII[0]];
                                stringArray25[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[138]];
                                NPCs.getNearest((String[])stringArray25).interact(lIIIIlIlII[lIIIIlllII[30]]);
                                Time.sleepTicks((int)lIIIIlllII[9]);

                            }
                            String[] stringArray26 = new String[lIIIIlllII[0]];
                            stringArray26[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[139]];
                            if (z.lllIIlIIlIll(Inventory.contains((String[])stringArray26) ? 1 : 0)) {
                                if (z.lllIIllIIIll(TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (z.lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[283]]) ? 1 : 0) && z.lllIIllIIIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIlllII[140], lIIIIlllII[141], lIIIIlllII[1])), lIIIIlllII[15])) {
                                        n2 = lIIIIlllII[0];

                                        }
                                    } else {
                                        n2 = lIIIIlllII[1];
                                    }
                                    return n2 != 0;
                                }))) {
                                    llIllIIIllll = new WorldPoint(lIIIIlllII[140], lIIIIlllII[141], lIIIIlllII[1]);
                                    if (z.lllIIlIllIll(Players.getLocal().getWorldLocation().equals((Object)llIllIIIllll) ? 1 : 0)) {
                                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[142]];
                                        Movement.walkTo((WorldPoint)llIllIIIllll);

                                        Time.sleepTicks((int)lIIIIlllII[0]);

                                    }
                                    if (z.lllIIlIIlIll(Players.getLocal().getWorldLocation().equals((Object)llIllIIIllll) ? 1 : 0)) {
                                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[143]];
                                        String[] stringArray27 = new String[lIIIIlllII[0]];
                                        stringArray27[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[144]];
                                        String[] stringArray28 = new String[lIIIIlllII[0]];
                                        stringArray28[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[145]];
                                        Inventory.getFirst((String[])stringArray27).useOn(Inventory.getFirst((String[])stringArray28));
                                        Time.sleepTicks((int)lIIIIlllII[11]);

                                    }
                                }
                                if (z.lllIIlIlllIl(TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (z.lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[282]]) ? 1 : 0) && z.lllIIllIIIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIlllII[140], lIIIIlllII[141], lIIIIlllII[1])), lIIIIlllII[15])) {
                                        n2 = lIIIIlllII[0];

                                    } else {
                                        n2 = lIIIIlllII[1];
                                    }
                                    return n2 != 0;
                                }))) {
                                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[146]];
                                    String[] stringArray29 = new String[lIIIIlllII[0]];
                                    stringArray29[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[147]];
                                    String[] stringArray30 = new String[lIIIIlllII[0]];
                                    stringArray30[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[148]];
                                    Inventory.getFirst((String[])stringArray29).useOn(TileObjects.getNearest((String[])stringArray30));
                                    Time.sleepTicks((int)lIIIIlllII[9]);

                                }
                            }
                        }
                        int[] nArray20 = new int[lIIIIlllII[0]];
                        nArray20[z.lIIIIlllII[1]] = lIIIIlllII[135];
                        if (z.lllIIlIIlIll(Inventory.contains((int[])nArray20) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[149]];
                            int[] nArray21 = new int[lIIIIlllII[0]];
                            nArray21[z.lIIIIlllII[1]] = lIIIIlllII[135];
                            int[] nArray22 = new int[lIIIIlllII[0]];
                            nArray22[z.lIIIIlllII[1]] = lIIIIlllII[28];
                            Inventory.getFirst((int[])nArray21).useOn(Inventory.getFirst((int[])nArray22));
                            Time.sleepTicks((int)lIIIIlllII[7]);

                        }
                    }
                    int[] nArray23 = new int[lIIIIlllII[0]];
                    nArray23[z.lIIIIlllII[1]] = lIIIIlllII[134];
                    if (z.lllIIlIIlIll(Inventory.contains((int[])nArray23) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[150]];
                        int[] nArray24 = new int[lIIIIlllII[0]];
                        nArray24[z.lIIIIlllII[1]] = lIIIIlllII[134];
                        int[] nArray25 = new int[lIIIIlllII[0]];
                        nArray25[z.lIIIIlllII[1]] = lIIIIlllII[30];
                        Inventory.getFirst((int[])nArray24).useOn(Inventory.getFirst((int[])nArray25));
                        Time.sleepTicks((int)lIIIIlllII[7]);

                    }
                }
                int[] nArray = new int[lIIIIlllII[0]];
                nArray[z.lIIIIlllII[1]] = lIIIIlllII[151];
                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    String[] stringArray31 = new String[lIIIIlllII[0]];
                    stringArray31[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[152]];
                    if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray31))) {
                        L.cp();
                    }
                    String[] stringArray32 = new String[lIIIIlllII[0]];
                    stringArray32[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[153]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray32))) {
                        g.a(lIIIIlIlII[lIIIIlllII[154]], cG);
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[123])) {
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[155]];
                if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[156]];
                    String[] stringArray33 = new String[lIIIIlllII[0]];
                    stringArray33[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[157]];
                    TileObjects.getNearest((String[])stringArray33).interact(lIIIIlIlII[lIIIIlllII[158]]);
                    Time.sleepTicks((int)lIIIIlllII[10]);

                }
                String[] stringArray34 = new String[lIIIIlllII[0]];
                stringArray34[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[159]];
                if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray34))) {
                    if (z.lllIIlIllIll(L.cq() ? 1 : 0)) {
                        L.co();
                    }
                    if (z.lllIIlIIlIll(L.cq() ? 1 : 0)) {
                        if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                            llIllIIIllll = new WorldPoint(lIIIIlllII[51], lIIIIlllII[101], lIIIIlllII[7]);
                            if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[160]];
                                Movement.walkTo((WorldPoint)llIllIIIllll);

                                Time.sleepTicks((int)lIIIIlllII[0]);

                            }
                            if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[161]];
                                String[] stringArray35 = new String[lIIIIlllII[0]];
                                stringArray35[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[162]];
                                TileObjects.getNearest((String[])stringArray35).interact(lIIIIlIlII[lIIIIlllII[163]]);
                                Time.sleepTicks((int)lIIIIlllII[10]);

                            }
                        }
                        if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0]) && z.lllIIlIlllIl(llIllIIIllll = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (z.lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[280]]) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIIlllII[0]];
                                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[281]];
                                if (z.lllIIlIIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lIIIIlllII[0];

                                    if (3 != (0x56 ^ 0x63 ^ (0x7D ^ 0x4C))) return n2 != 0;
                                    return ((152 + 175 - 178 + 32 ^ 130 + 27 - 54 + 40) & (0x3D ^ 9 ^ (0xD ^ 3) ^ -1)) != 0;
                                }
                            }
                            n2 = lIIIIlllII[1];
                            return n2 != 0;
                        }))) {
                            if (z.lllIIlIllIll(Reachable.isInteractable((Locatable)llIllIIIllll) ? 1 : 0)) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[164]];
                                Movement.walkTo((WorldPoint)llIllIIIllll.getWorldLocation());

                                Time.sleepTicks((int)lIIIIlllII[0]);

                            }
                            if (z.lllIIlIIlIll(Reachable.isInteractable((Locatable)llIllIIIllll) ? 1 : 0)) {
                                llIllIIIllll.interact(lIIIIlIlII[lIIIIlllII[165]]);
                                Time.sleepTicks((int)lIIIIlllII[7]);

                            }
                        }
                        if (z.lllIIlIllIll(Players.getLocal().getWorldLocation().getPlane())) {
                            if (z.lllIIlIlllll(z.lllIIlIIlIlI(e.w(), 100.0))) {
                                int[] nArray = new int[lIIIIlllII[0]];
                                nArray[z.lIIIIlllII[1]] = lIIIIlllII[35];
                                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    String[] stringArray36 = new String[lIIIIlllII[0]];
                                    stringArray36[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[166]];
                                    Inventory.getFirst((String[])stringArray36).interact(lIIIIlIlII[lIIIIlllII[167]]);
                                    Time.sleepTicks((int)lIIIIlllII[0]);

                                }
                            }
                            if (z.lllIIllIIlII(Prayers.getPoints(), Skills.getLevel((Skill)Skill.PRAYER)) && z.lllIIlIIlIll(Inventory.contains(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[279]])) ? 1 : 0)) {
                                Inventory.getFirst(item -> item.getName().contains(lIIIIlIlII[lIIIIlllII[278]])).interact(lIIIIlIlII[lIIIIlllII[168]]);
                                Time.sleepTicks((int)lIIIIlllII[0]);

                            }
                            llIllIIIllll = new WorldPoint(lIIIIlllII[111], lIIIIlllII[112], lIIIIlllII[1]);
                            if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[15])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[169]];
                                Movement.walkTo((WorldPoint)llIllIIIllll);

                                Time.sleepTicks((int)lIIIIlllII[0]);

                            }
                            if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[15])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[170]];
                                String[] stringArray37 = new String[lIIIIlllII[0]];
                                stringArray37[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[171]];
                                TileObjects.getNearest((String[])stringArray37).interact(lIIIIlIlII[lIIIIlllII[172]]);
                                Time.sleepTicks((int)lIIIIlllII[10]);

                            }
                        }
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[124])) {
                TileObject llIllIIIllIl;
                llIllIIIllll = new WorldArea(lIIIIlllII[173], lIIIIlllII[174], lIIIIlllII[72], lIIIIlllII[47], lIIIIlllII[1]);
                if (z.lllIIlIIlIll(llIllIIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    llIllIIIlllI = new WorldPoint(lIIIIlllII[175], lIIIIlllII[176], lIIIIlllII[1]);
                    if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(llIllIIIlllI), lIIIIlllII[11])) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[177]];
                        Movement.walkTo((WorldPoint)llIllIIIlllI);

                        Time.sleepTicks((int)lIIIIlllII[0]);

                    }
                    if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(llIllIIIlllI), lIIIIlllII[11])) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[178]];
                        String[] stringArray = new String[lIIIIlllII[0]];
                        stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[179]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIIlIlII[lIIIIlllII[180]]);
                        Time.sleepTicks((int)lIIIIlllII[9]);

                    }
                }
                if (z.lllIIlIIlIll((llIllIIIlllI = new WorldArea(lIIIIlllII[181], lIIIIlllII[182], lIIIIlllII[53], lIIIIlllII[42], lIIIIlllII[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.lllIIlIlllIl(llIllIIIllIl = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (z.lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[276]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIIlllII[0]];
                        stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[277]];
                        if (z.lllIIlIIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIIIIlllII[0];

                            if (null == null) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIIIIlllII[1];
                    return n2 != 0;
                }))) {
                    if (z.lllIIlIllIll(Reachable.isInteractable((Locatable)llIllIIIllIl) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[183]];
                        Movement.walkTo((WorldPoint)llIllIIIllIl.getWorldLocation());

                        Time.sleepTicks((int)lIIIIlllII[0]);

                    }
                    if (z.lllIIlIIlIll(Reachable.isInteractable((Locatable)llIllIIIllIl) ? 1 : 0)) {
                        llIllIIIllIl.interact(lIIIIlIlII[lIIIIlllII[184]]);
                        Time.sleepTicks((int)lIIIIlllII[7]);

                    }
                }
                if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[185]];
                    String[] stringArray = new String[lIIIIlllII[0]];
                    stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[186]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIIlIlII[lIIIIlllII[187]]);
                    Time.sleepTicks((int)lIIIIlllII[10]);

                }
                if (z.lllIIlIllIll(L.cq() ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIlllII[0]];
                    stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[188]];
                    if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray))) {
                        llIllIIIllIl = new WorldArea(lIIIIlllII[66], lIIIIlllII[67], lIIIIlllII[44], lIIIIlllII[43], lIIIIlllII[1]);
                        if (z.lllIIlIIlIll(llIllIIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[189]];
                            WorldPoint llIllIIIllII = new WorldPoint(lIIIIlllII[69], lIIIIlllII[70], lIIIIlllII[1]);
                            Movement.walkTo((WorldPoint)llIllIIIllII);

                            Time.sleepTicks((int)lIIIIlllII[0]);

                        }
                        if (z.lllIIlIllIll(llIllIIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            L.cp();
                        }
                    }
                    String[] stringArray38 = new String[lIIIIlllII[0]];
                    stringArray38[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[190]];
                    if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray38))) {
                        g.a(lIIIIlIlII[lIIIIlllII[191]], cG);
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[125])) {
                String[] stringArray = new String[lIIIIlllII[0]];
                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[192]];
                if (z.lllIIlIlllIl(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[193]];
                    String[] stringArray39 = new String[lIIIIlllII[0]];
                    stringArray39[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[194]];
                    TileObjects.getNearest((String[])stringArray39).interact(lIIIIlIlII[lIIIIlllII[195]]);
                    Time.sleepTicks((int)lIIIIlllII[9]);

                }
                String[] stringArray40 = new String[lIIIIlllII[0]];
                stringArray40[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[196]];
                if (z.lllIIllIIIll(NPCs.getNearest((String[])stringArray40))) {
                    if (z.lllIIlIllIll(L.cq() ? 1 : 0)) {
                        L.co();
                    }
                    if (z.lllIIlIIlIll(L.cq() ? 1 : 0)) {
                        if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                            llIllIIIllll = new WorldPoint(lIIIIlllII[51], lIIIIlllII[52], lIIIIlllII[7]);
                            if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[197]];
                                Movement.walkTo((WorldPoint)llIllIIIllll);

                                Time.sleepTicks((int)lIIIIlllII[0]);

                            }
                            if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIllll), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[198]];
                                String[] stringArray41 = new String[lIIIIlllII[0]];
                                stringArray41[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[199]];
                                TileObjects.getNearest((String[])stringArray41).interact(lIIIIlIlII[lIIIIlllII[200]]);
                                Time.sleepTicks((int)lIIIIlllII[10]);

                            }
                        }
                        if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0])) {
                            g.a(lIIIIlIlII[lIIIIlllII[201]], cG);
                        }
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[128])) {
                int[] nArray = new int[lIIIIlllII[0]];
                nArray[z.lIIIIlllII[1]] = lIIIIlllII[202];
                if (z.lllIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (z.lllIIlIllIll(dR ? 1 : 0)) {
                        String[] stringArray = new String[lIIIIlllII[0]];
                        stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[204]];
                        g.a(lIIIIlIlII[lIIIIlllII[203]], stringArray);
                    }
                    if (z.lllIIlIIlIll(dR ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[205]];
                        llIllIIIllll = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (z.lllIIllIIIlI(tileObject.getId(), lIIIIlllII[275]) && z.lllIIllIIIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIlllII[273], lIIIIlllII[274], lIIIIlllII[0])), lIIIIlllII[7])) {
                                n2 = lIIIIlllII[0];

                                }
                            } else {
                                n2 = lIIIIlllII[1];
                            }
                            return n2 != 0;
                        });
                        if (z.lllIIlIlllIl(llIllIIIllll)) {
                            String[] stringArray = new String[lIIIIlllII[0]];
                            stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[206]];
                            if (z.lllIIlIIlIll(llIllIIIllll.hasAction(stringArray) ? 1 : 0)) {
                                llIllIIIllll.interact(lIIIIlIlII[lIIIIlllII[207]]);
                                Time.sleepTicks((int)lIIIIlllII[9]);

                            }
                        }
                        if (z.lllIIlIlllIl(TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (z.lllIIllIIIlI(tileObject.getId(), lIIIIlllII[272]) && z.lllIIllIIIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIlllII[273], lIIIIlllII[274], lIIIIlllII[0])), lIIIIlllII[7])) {
                                n2 = lIIIIlllII[0];

                                if (((32 + 150 - 177 + 166 ^ 135 + 10 - 93 + 103) & (0xA0 ^ 0xA5 ^ (0x4D ^ 0x78) ^ -1)) == -1) {
                                    return ((1 ^ (0x91 ^ 0x97)) & (0xF8 ^ 0xA0 ^ (0xEF ^ 0xB0) ^ -1)) != 0;
                                }
                            } else {
                                n2 = lIIIIlllII[1];
                            }
                            return n2 != 0;
                        }))) {
                            TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (z.lllIIllIIIlI(tileObject.getId(), lIIIIlllII[272]) && z.lllIIllIIIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIlllII[273], lIIIIlllII[274], lIIIIlllII[0])), lIIIIlllII[7])) {
                                    n2 = lIIIIlllII[0];

                                    }
                                } else {
                                    n2 = lIIIIlllII[1];
                                }
                                return n2 != 0;
                            }).interact(lIIIIlIlII[lIIIIlllII[208]]);
                            Time.sleepTicks((int)lIIIIlllII[9]);

                        }
                    }
                }
                int[] nArray26 = new int[lIIIIlllII[0]];
                nArray26[z.lIIIIlllII[1]] = lIIIIlllII[202];
                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray26) ? 1 : 0)) {
                    if (z.lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0])) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[209]];
                        TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (z.lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[270]]) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIIlllII[0]];
                                stringArray[z.lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[271]];
                                if (z.lllIIlIIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lIIIIlllII[0];

                                    if (3 >= 0) return n2 != 0;
                                    return false;
                                }
                            }
                            n2 = lIIIIlllII[1];
                            return n2 != 0;
                        }).interact(lIIIIlIlII[lIIIIlllII[210]]);
                        Time.sleepTicks((int)lIIIIlllII[9]);

                    }
                    if (z.lllIIlIllIll(Players.getLocal().getWorldLocation().getPlane())) {
                        z.bl();
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[139])) {
                int[] nArray = new int[lIIIIlllII[0]];
                nArray[z.lIIIIlllII[1]] = lIIIIlllII[211];
                if (z.lllIIlIIllII(Inventory.getAll((int[])nArray).size(), lIIIIlllII[9]) && z.lllIIlIllIll(Players.getLocal().getWorldLocation().getPlane())) {
                    z.bl();
                }
                int[] nArray27 = new int[lIIIIlllII[0]];
                nArray27[z.lIIIIlllII[1]] = lIIIIlllII[211];
                if (z.lllIIlIlllII(Inventory.getAll((int[])nArray27).size(), lIIIIlllII[9])) {
                    if (z.lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[212]];
                        if (z.lllIIlIIlIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)dg);

                        Time.sleepTicks((int)lIIIIlllII[0]);

                    }
                    if (z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                        if (z.lllIIlIIllII(dk, lIIIIlllII[0])) {
                            as.nH += lIIIIlllII[0];
                            as.u(AccBuilderGWD.m);
                            dk += lIIIIlllII[0];
                            as.nH = lIIIIlllII[1];
                        }
                        g.a(lIIIIlIlII[lIIIIlllII[213]], cG, lIIIIlllII[0]);
                    }
                }
            }
            if (z.lllIIllIIIlI(e.j(dL), lIIIIlllII[152]) && z.lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                int[] nArray = new int[lIIIIlllII[0]];
                nArray[z.lIIIIlllII[1]] = lIIIIlllII[22];
                if (z.lllIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray28 = new int[lIIIIlllII[0]];
                    nArray28[z.lIIIIlllII[1]] = lIIIIlllII[22];
                    Inventory.getFirst((int[])nArray28).interact(lIIIIlIlII[lIIIIlllII[214]]);
                    Time.sleepTicks((int)lIIIIlllII[13]);

                }
            }
        }
    }

    private static boolean lllIIllIIIII(int n2, int n3) {
        return n2 > n3;
    }
}

