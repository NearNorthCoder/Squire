/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
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
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.9e609a1b-c462-421a-8c76-4c9774ea7671Manager;
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
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;

public class THelper
implements M {
    
    static  WorldPoint fD;
    static  WorldPoint fy;
    static  boolean cp;
    
    public static  List<d> bA;
    static  String[] bW;
    public static  boolean fx;
    static  WorldPoint fA;
    private final  int fF = 0;
    static  WorldPoint fC;
    static  WorldPoint fz;
    private static final  String fw;
    static  WorldPoint fB;
    static  WorldPoint fd;
    private static final  HashMap<Integer, String> fv;
    static  int co;
    
    public static  boolean by;

    private static boolean lIlIIllIIllllII(int n2) {
        return n2 != 0;
    }

    public THelper() {
        this.fF = lIIIlllllIlll[0];
    }

    @Override
    public int Y() {
        try {
            t.bg();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x48 ^ 0x4C) < (0x1D ^ 0x19)) {
            return (0x36 ^ 0x27) & ~(0x1F ^ 0xE);
        }
        return lIIIlllllIlll[86];
    }

    private static void bh() {
        if (!t.lIlIIllIlIIIllI(fE) || t.lIlIIllIIlllllI(Vars.getBit((int)lIIIlllllIlll[70])) && t.lIlIIllIIlllllI(Vars.getBit((int)lIIIlllllIlll[71]))) {
            return;
        }
        String[] stringArray = new String[lIIIlllllIlll[10]];
        stringArray[t.lIIIlllllIlll[0]] = fv.get(Vars.getBit((int)lIIIlllllIlll[70]));
        stringArray[t.lIIIlllllIlll[1]] = fv.get(Vars.getBit((int)lIIIlllllIlll[71]));
        stringArray[t.lIIIlllllIlll[3]] = fv.get(Vars.getBit((int)lIIIlllllIlll[72]));
        stringArray[t.lIIIlllllIlll[5]] = fv.get(Vars.getBit((int)lIIIlllllIlll[73]));
        stringArray[t.lIIIlllllIlll[4]] = fv.get(Vars.getBit((int)lIIIlllllIlll[74]));
        fE = stringArray;
        String string = "Say the following in order: " + String.join((CharSequence)lIIIlllllIIll[lIIIlllllIlll[75]], fE);
        System.out.println(string);
    }

    private static boolean lIlIIllIlIIIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIllIlIIIllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean S() {
        void var1;
        int[] nArray = new int[lIIIlllllIlll[3]];
        nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[6];
        nArray[t.lIIIlllllIlll[1]] = lIIIlllllIlll[8];
        int[] nArray2 = nArray;
        int var2 = lIIIlllllIlll[0];
        while (t.lIlIIllIIllllIl(var2, ((void)var1).length)) {
            int[] nArray3 = new int[lIIIlllllIlll[1]];
            nArray3[t.lIIIlllllIlll[0]] = var1[var2];
            if (t.lIlIIllIIlllllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIlllllIlll[0];
            }
            ++var2;

            if ((2 + 16 - 17 + 163 ^ 66 + 14 - 48 + 128) == (0x67 ^ 0x16 ^ (0xFD ^ 0x88))) continue;
            return ((0x6A ^ 0x1B ^ (0x68 ^ 0x5B)) & (0xF ^ 0x3A ^ (0xE9 ^ 0x9E) ^ -1)) != 0;
        }
        return lIIIlllllIlll[1];
    }

    @Override
    public String Z() {
        return lIIIlllllIIll[lIIIlllllIlll[87]];
    }

        return String.valueOf(var3);
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (t.lIlIIllIlIIIlll(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIIIlllllIlll[5])) {
            bl = lIIIlllllIlll[1];

            if (-1 > 2) {
                return ((0xFB ^ 0xBD ^ (4 ^ 0x17)) & (203 + 103 - 297 + 242 ^ 115 + 26 - 98 + 131 ^ -1)) != 0;
            }
        } else {
            bl = lIIIlllllIlll[0];
        }
        return bl;
    }

    static {
        t.lIlIIllIIlllIlI();
        t.lIlIIllIIlIllll();
        fw = lIIIlllllIIll[lIIIlllllIlll[90]];
        fv = new 9e609a1b-c462-421a-8c76-4c9774ea7671Manager();
        bA = new ArrayList<d>();
        fd = new WorldPoint(lIIIlllllIlll[91], lIIIlllllIlll[92], lIIIlllllIlll[0]);
        fy = new WorldPoint(lIIIlllllIlll[93], lIIIlllllIlll[94], lIIIlllllIlll[0]);
        fz = new WorldPoint(lIIIlllllIlll[93], lIIIlllllIlll[95], lIIIlllllIlll[3]);
        fA = new WorldPoint(lIIIlllllIlll[96], lIIIlllllIlll[97], lIIIlllllIlll[0]);
        fB = new WorldPoint(lIIIlllllIlll[96], lIIIlllllIlll[98], lIIIlllllIlll[0]);
        fC = new WorldPoint(lIIIlllllIlll[99], lIIIlllllIlll[100], lIIIlllllIlll[1]);
        fD = new WorldPoint(lIIIlllllIlll[101], lIIIlllllIlll[102], lIIIlllllIlll[0]);
        String[] stringArray = new String[lIIIlllllIlll[31]];
        stringArray[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[103]];
        stringArray[t.lIIIlllllIlll[1]] = lIIIlllllIIll[lIIIlllllIlll[104]];
        stringArray[t.lIIIlllllIlll[3]] = lIIIlllllIIll[lIIIlllllIlll[105]];
        stringArray[t.lIIIlllllIlll[5]] = lIIIlllllIIll[lIIIlllllIlll[106]];
        stringArray[t.lIIIlllllIlll[4]] = lIIIlllllIIll[lIIIlllllIlll[107]];
        stringArray[t.lIIIlllllIlll[10]] = lIIIlllllIIll[lIIIlllllIlll[108]];
        stringArray[t.lIIIlllllIlll[16]] = lIIIlllllIIll[lIIIlllllIlll[109]];
        stringArray[t.lIIIlllllIlll[18]] = lIIIlllllIIll[lIIIlllllIlll[110]];
        stringArray[t.lIIIlllllIlll[19]] = lIIIlllllIIll[lIIIlllllIlll[111]];
        stringArray[t.lIIIlllllIlll[20]] = lIIIlllllIIll[lIIIlllllIlll[112]];
        stringArray[t.lIIIlllllIlll[12]] = lIIIlllllIIll[lIIIlllllIlll[113]];
        stringArray[t.lIIIlllllIlll[23]] = lIIIlllllIIll[lIIIlllllIlll[114]];
        stringArray[t.lIIIlllllIlll[25]] = lIIIlllllIIll[lIIIlllllIlll[115]];
        stringArray[t.lIIIlllllIlll[26]] = lIIIlllllIIll[lIIIlllllIlll[116]];
        stringArray[t.lIIIlllllIlll[27]] = lIIIlllllIIll[lIIIlllllIlll[117]];
        stringArray[t.lIIIlllllIlll[28]] = lIIIlllllIIll[lIIIlllllIlll[118]];
        stringArray[t.lIIIlllllIlll[29]] = lIIIlllllIIll[lIIIlllllIlll[119]];
        stringArray[t.lIIIlllllIlll[30]] = lIIIlllllIIll[lIIIlllllIlll[120]];
        bW = stringArray;
    }

    /*
     * WARNING - void declaration
     */
    private static void bi() {
        void var4;
        BankLocation bankLocation = BankLocation.getNearest();
        if (t.lIlIIllIIllllll(bankLocation) && t.lIlIIllIIlllllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[76]];
            a.a(bankLocation);
        }
        if (t.lIlIIllIIllllll(var4) && t.lIlIIllIIllllII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (t.lIlIIllIIlllllI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllllIlll[2]);

                Time.sleepTicks((int)lIIIlllllIlll[5]);

            }
            if (t.lIlIIllIIllllII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[77]];
                if (t.lIlIIllIIllllII(fx ? 1 : 0)) {
                    int[] nArray = new int[lIIIlllllIlll[1]];
                    nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[48];
                    if (t.lIlIIllIIlllllI(Inventory.contains((int[])nArray) ? 1 : 0) && t.lIlIIllIlIIIIII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIIIlllllIlll[4]);

                    }
                }
                if (t.lIlIIllIlIIIIII(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIIIlllllIlll[3]);

                }
                if (t.lIlIIllIIllllII(fx ? 1 : 0)) {
                    int[] nArray = new int[lIIIlllllIlll[1]];
                    nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[48];
                    if (t.lIlIIllIIllllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        a.a(lIIIlllllIlll[11], lIIIlllllIlll[1]);
                        a.a(lIIIlllllIlll[6], lIIIlllllIlll[12]);
                        a.a(lIIIlllllIlll[48], lIIIlllllIlll[1]);
                        a.a(lIIIlllllIlll[24], lIIIlllllIlll[1]);
                        a.a(lIIIlllllIlll[46], lIIIlllllIlll[1]);
                        Time.sleepTicks((int)lIIIlllllIlll[1]);

                        int[] nArray2 = new int[lIIIlllllIlll[1]];
                        nArray2[t.lIIIlllllIlll[0]] = lIIIlllllIlll[11];
                        if (t.lIlIIllIIlllllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            a.a(lIIIlllllIlll[78], lIIIlllllIlll[1]);
                        }
                        a.a(lIIIlllllIlll[17], Inventory.getFreeSlots() - lIIIlllllIlll[1]);
                    }
                }
                if (t.lIlIIllIIllllII(fx ? 1 : 0)) {
                    int[] nArray = new int[lIIIlllllIlll[1]];
                    nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[48];
                    if (t.lIlIIllIIlllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (t.lIlIIllIIlllllI(Equipment.contains((int[])f.aW) ? 1 : 0) && t.lIlIIllIIlllllI(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                            a.b(f.aW, lIIIlllllIlll[1]);
                        }
                        if (t.lIlIIllIIllllII(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aW).interact(lIIIlllllIIll[lIIIlllllIlll[79]]);
                            Time.sleepTicks((int)lIIIlllllIlll[5]);

                        }
                        if (t.lIlIIllIIlllllI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIIIlllllIlll[10]);

                        }
                        if (t.lIlIIllIIllllII(Bank.isOpen() ? 1 : 0)) {
                            a.a(lIIIlllllIlll[11], lIIIlllllIlll[1]);
                            a.a(lIIIlllllIlll[6], lIIIlllllIlll[12]);
                            a.a(lIIIlllllIlll[7], lIIIlllllIlll[9]);
                        }
                    }
                }
            }
        }
    }

    private static boolean lIlIIllIlIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIllIIlllllI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean X() {
        return lIIIlllllIlll[0];
    }

    private static boolean lIlIIllIlIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIllIlIIIIIl(int n2) {
        return n2 < 0;
    }

    private static int lIlIIllIIlllIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIIllIlIIlIII(Object object, Object object2) {
        return object == object2;
    }

    private static void lIlIIllIIlIllll() {
        lIIIlllllIIll = new String[lIIIlllllIlll[121]];
        t.lIIIlllllIIll[t.lIIIlllllIlll[0]] = "Finished buying items, switching back to quest";
        t.lIIIlllllIIll[t.lIIIlllllIlll[1]] = "Nav to bank";
        t.lIIIlllllIIll[t.lIIIlllllIlll[3]] = "Handling banking";
        t.lIIIlllllIIll[t.lIIIlllllIlll[5]] = "We are missing quest supplies, switching to BUYING";
        t.lIIIlllllIIll[t.lIIIlllllIlll[4]] = "We are missing quest supplies, switching to BUYING";
        t.lIIIlllllIIll[t.lIIIlllllIlll[10]] = "Wear";
        t.lIIIlllllIIll[t.lIIIlllllIlll[16]] = "Drink";
        t.lIIIlllllIIll[t.lIIIlllllIlll[18]] = "Eat";
        t.lIIIlllllIIll[t.lIIIlllllIlll[19]] = "Nav to start";
        t.lIIIlllllIIll[t.lIIIlllllIlll[20]] = "Aris";
        t.lIIIlllllIIll[t.lIIIlllllIlll[12]] = "Nav to sir pyrsin";
        t.lIIIlllllIIll[t.lIIIlllllIlll[23]] = "Sir Prysin";
        t.lIIIlllllIIll[t.lIIIlllllIlll[25]] = "Silverlight";
        t.lIIIlllllIIll[t.lIIIlllllIlll[26]] = "Nav to captain";
        t.lIIIlllllIIll[t.lIIIlllllIlll[27]] = "Captain Rovin";
        t.lIIIlllllIIll[t.lIIIlllllIlll[28]] = "Bucket of water";
        t.lIIIlllllIIll[t.lIIIlllllIlll[29]] = "Nav to drain";
        t.lIIIlllllIIll[t.lIIIlllllIlll[30]] = "Bucket of water";
        t.lIIIlllllIIll[t.lIIIlllllIlll[31]] = "Drain";
        t.lIIIlllllIIll[t.lIIIlllllIlll[32]] = "Bucket of water";
        t.lIIIlllllIIll[t.lIIIlllllIlll[33]] = "Nav to sewer key";
        t.lIIIlllllIIll[t.lIIIlllllIlll[34]] = "Manhole";
        t.lIIIlllllIIll[t.lIIIlllllIlll[35]] = "Manhole";
        t.lIIIlllllIIll[t.lIIIlllllIlll[36]] = "Open";
        t.lIIIlllllIIll[t.lIIIlllllIlll[37]] = "Manhole";
        t.lIIIlllllIIll[t.lIIIlllllIlll[9]] = "Open";
        t.lIIIlllllIIll[t.lIIIlllllIlll[38]] = "Manhole";
        t.lIIIlllllIIll[t.lIIIlllllIlll[39]] = "Manhole";
        t.lIIIlllllIIll[t.lIIIlllllIlll[40]] = "Climb-down";
        t.lIIIlllllIIll[t.lIIIlllllIlll[41]] = "Manhole";
        t.lIIIlllllIIll[t.lIIIlllllIlll[42]] = "Climb-down";
        t.lIIIlllllIIll[t.lIIIlllllIlll[43]] = "Rusty key";
        t.lIIIlllllIIll[t.lIIIlllllIlll[44]] = "Rusty key";
        t.lIIIlllllIIll[t.lIIIlllllIlll[45]] = "Take";
        t.lIIIlllllIIll[t.lIIIlllllIlll[47]] = "Silverlight";
        t.lIIIlllllIIll[t.lIIIlllllIlll[49]] = "Bones";
        t.lIIIlllllIIll[t.lIIIlllllIlll[50]] = "Bones";
        t.lIIIlllllIIll[t.lIIIlllllIlll[51]] = "Nav to wizard";
        t.lIIIlllllIIll[t.lIIIlllllIlll[52]] = "Wizard Traiborn";
        t.lIIIlllllIIll[t.lIIIlllllIlll[53]] = "Silverlight";
        t.lIIIlllllIIll[t.lIIIlllllIlll[54]] = "Nav to sir pyrsin";
        t.lIIIlllllIIll[t.lIIIlllllIlll[55]] = "Sir Prysin";
        t.lIIIlllllIIll[t.lIIIlllllIlll[56]] = "Silverlight";
        t.lIIIlllllIIll[t.lIIIlllllIlll[57]] = "Delrith";
        t.lIIIlllllIIll[t.lIIIlllllIlll[58]] = "Weakened Delrith";
        t.lIIIlllllIIll[t.lIIIlllllIlll[59]] = "Nav to demon";
        t.lIIIlllllIIll[t.lIIIlllllIlll[60]] = "Delrith";
        t.lIIIlllllIIll[t.lIIIlllllIlll[61]] = "Weakened Delrith";
        t.lIIIlllllIIll[t.lIIIlllllIlll[62]] = "Attack";
        t.lIIIlllllIIll[t.lIIIlllllIlll[63]] = "Delrith";
        t.lIIIlllllIIll[t.lIIIlllllIlll[15]] = "Delrith";
        t.lIIIlllllIIll[t.lIIIlllllIlll[64]] = "Delrith";
        t.lIIIlllllIIll[t.lIIIlllllIlll[65]] = "Attack";
        t.lIIIlllllIIll[t.lIIIlllllIlll[66]] = "Banishing";
        t.lIIIlllllIIll[t.lIIIlllllIlll[67]] = "[";
        t.lIIIlllllIIll[t.lIIIlllllIlll[68]] = "Weakened Delrith";
        t.lIIIlllllIIll[t.lIIIlllllIlll[69]] = "Banishing";
        t.lIIIlllllIIll[t.lIIIlllllIlll[75]] = ", ";
        t.lIIIlllllIIll[t.lIIIlllllIlll[76]] = "Nav to bank";
        t.lIIIlllllIIll[t.lIIIlllllIlll[77]] = "Handling banking";
        t.lIIIlllllIIll[t.lIIIlllllIlll[79]] = "Wear";
        t.lIIIlllllIIll[t.lIIIlllllIlll[87]] = "Demon Slayer";
        t.lIIIlllllIIll[t.lIIIlllllIlll[88]] = "ring of wealth (";
        t.lIIIlllllIIll[t.lIIIlllllIlll[89]] = "wizard";
        t.lIIIlllllIIll[t.lIIIlllllIlll[90]] = "Now what was that incantation again?";
        t.lIIIlllllIIll[t.lIIIlllllIlll[103]] = "Yes.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[104]] = "The Demon Slayer Quest";
        t.lIIIlllllIIll[t.lIIIlllllIlll[105]] = "Okay, where is he? I'll kill him for you!";
        t.lIIIlllllIIll[t.lIIIlllllIlll[106]] = "So how did Wally kill Delrith?";
        t.lIIIlllllIIll[t.lIIIlllllIlll[107]] = "What is the magical incantation?";
        t.lIIIlllllIIll[t.lIIIlllllIlll[108]] = "Aris said I should come and talk to you.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[109]] = "I need to find Silverlight.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[110]] = "He's back and unfortunately I've got to deal with him.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[111]] = "So give me the keys!";
        t.lIIIlllllIIll[t.lIIIlllllIlll[112]] = "Yes I know, but this is important.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[113]] = "There's a demon who wants to invade this city.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[114]] = "Yes, very.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[115]] = "It's not them who are going to fight the demon, it's me.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[116]] = "Sir Prysin said you would give me the key.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[117]] = "Why did he give you one of the keys then?";
        t.lIIIlllllIIll[t.lIIIlllllIlll[118]] = "Talk about Demon Slayer.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[119]] = "Well, have you got any keys knocking around?";
        t.lIIIlllllIIll[t.lIIIlllllIlll[120]] = "I'll get the bones for you.";
    }

    private static boolean lIlIIllIIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void W() {
        block17: {
            d var5;
            block16: {
                block15: {
                    block14: {
                        Object var6;
                        block13: {
                            block12: {
                                int[] nArray = new int[lIIIlllllIlll[1]];
                                nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[7];
                                if (!t.lIlIIllIIllllII(Bank.contains((int[])nArray) ? 1 : 0)) break block12;
                                int[] nArray2 = new int[lIIIlllllIlll[1]];
                                nArray2[t.lIIIlllllIlll[0]] = lIIIlllllIlll[7];
                                if (!t.lIlIIllIIllllII(Bank.contains((int[])nArray2) ? 1 : 0)) break block13;
                                int[] nArray3 = new int[lIIIlllllIlll[1]];
                                nArray3[t.lIIIlllllIlll[0]] = lIIIlllllIlll[7];
                                if (!t.lIlIIllIIllllIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllllIlll[9])) break block13;
                            }
                            var6 = new DHelper(lIIIlllllIlll[7], lIIIlllllIlll[9], lIIIlllllIlll[80]);
                            bA.add((DHelper) ar6);

                        }
                        int[] nArray = new int[lIIIlllllIlll[1]];
                        nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[8];
                        if (t.lIlIIllIIlllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var6 = new DHelper(lIIIlllllIlll[8], lIIIlllllIlll[1], lIIIlllllIlll[81]);
                            bA.add((DHelper) ar6);

                        }
                        if (t.lIlIIllIIlllllI(Bank.contains((Predicate)(var6 = item -> item.getName().toLowerCase().contains(lIIIlllllIIll[lIIIlllllIlll[88]]))) ? 1 : 0)) {
                            var5 = new DHelper(lIIIlllllIlll[82], lIIIlllllIlll[10], lIIIlllllIlll[83]);
                            bA.add(var5);

                        }
                        int[] nArray4 = new int[lIIIlllllIlll[1]];
                        nArray4[t.lIIIlllllIlll[0]] = lIIIlllllIlll[17];
                        if (!t.lIlIIllIIllllII(Bank.contains((int[])nArray4) ? 1 : 0)) break block14;
                        int[] nArray5 = new int[lIIIlllllIlll[1]];
                        nArray5[t.lIIIlllllIlll[0]] = lIIIlllllIlll[17];
                        if (!t.lIlIIllIIllllII(Bank.contains((int[])nArray5) ? 1 : 0)) break block15;
                        int[] nArray6 = new int[lIIIlllllIlll[1]];
                        nArray6[t.lIIIlllllIlll[0]] = lIIIlllllIlll[17];
                        if (!t.lIlIIllIIllllIl(Bank.getFirst((int[])nArray6).getQuantity(), lIIIlllllIlll[10])) break block15;
                    }
                    var5 = new DHelper(lIIIlllllIlll[17], lIIIlllllIlll[12], lIIIlllllIlll[84]);
                    bA.add(var5);

                }
                int[] nArray = new int[lIIIlllllIlll[1]];
                nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[11];
                if (t.lIlIIllIIlllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var5 = new DHelper(lIIIlllllIlll[11], lIIIlllllIlll[4], h.bv);
                    bA.add(var5);

                }
                int[] nArray7 = new int[lIIIlllllIlll[1]];
                nArray7[t.lIIIlllllIlll[0]] = lIIIlllllIlll[6];
                if (!t.lIlIIllIIllllII(Bank.contains((int[])nArray7) ? 1 : 0)) break block16;
                int[] nArray8 = new int[lIIIlllllIlll[1]];
                nArray8[t.lIIIlllllIlll[0]] = lIIIlllllIlll[6];
                if (!t.lIlIIllIIllllII(Bank.contains((int[])nArray8) ? 1 : 0)) break block17;
                int[] nArray9 = new int[lIIIlllllIlll[1]];
                nArray9[t.lIIIlllllIlll[0]] = lIIIlllllIlll[6];
                if (!t.lIlIIllIIllllIl(Bank.getFirst((int[])nArray9).getQuantity(), lIIIlllllIlll[28])) break block17;
            }
            var5 = new DHelper(lIIIlllllIlll[6], lIIIlllllIlll[54], lIIIlllllIlll[85]);
            bA.add(var5);

        }
    }

    private static boolean lIlIIllIlIIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIllIIllllll(Object object) {
        return object != null;
    }

    private static boolean lIlIIllIlIIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIllIlIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    public static void bg() {
        block77: {
            block78: {
                Object var7;
                block80: {
                    block79: {
                        if (t.lIlIIllIIllllII(by ? 1 : 0)) {
                            b.a(bA);
                            if (t.lIlIIllIIllllIl(bA.size(), lIIIlllllIlll[1])) {
                                System.out.println(lIIIlllllIIll[lIIIlllllIlll[0]]);
                                by = lIIIlllllIlll[0];
                            }
                        }
                        if (!t.lIlIIllIIlllllI(by ? 1 : 0)) break block77;
                        if (t.lIlIIllIIlllllI(t.S() ? 1 : 0) && t.lIlIIllIIlllllI(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                            var7 = BankLocation.getNearest();
                            if (t.lIlIIllIIllllll(var7) && t.lIlIIllIIlllllI(var7.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[1]];
                                a.a((BankLocation)var7);
                            }
                            if (t.lIlIIllIIllllll(var7) && t.lIlIIllIIllllII(var7.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (t.lIlIIllIIlllllI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllllIlll[2]);

                                }
                                if (t.lIlIIllIIllllII(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[3]];
                                    if (t.lIlIIllIlIIIIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIIlllllIlll[4]);

                                    }
                                    if (t.lIlIIllIlIIIIII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIIlllllIlll[3]);

                                    }
                                    int[] nArray = new int[lIIIlllllIlll[5]];
                                    nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[6];
                                    nArray[t.lIIIlllllIlll[1]] = lIIIlllllIlll[7];
                                    nArray[t.lIIIlllllIlll[3]] = lIIIlllllIlll[8];
                                    if (t.lIlIIllIIlllllI(e.b(nArray) ? 1 : 0)) {
                                        t.W();
                                        System.out.println(lIIIlllllIIll[lIIIlllllIlll[5]]);
                                        by = lIIIlllllIlll[1];
                                        return;
                                    }
                                    int[] nArray2 = new int[lIIIlllllIlll[1]];
                                    nArray2[t.lIIIlllllIlll[0]] = lIIIlllllIlll[7];
                                    if (t.lIlIIllIIllllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                        int[] nArray3 = new int[lIIIlllllIlll[1]];
                                        nArray3[t.lIIIlllllIlll[0]] = lIIIlllllIlll[7];
                                        if (t.lIlIIllIIllllIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllllIlll[9])) {
                                            t.W();
                                            System.out.println(lIIIlllllIIll[lIIIlllllIlll[4]]);
                                            by = lIIIlllllIlll[1];
                                            return;
                                        }
                                    }
                                    int[] nArray4 = new int[lIIIlllllIlll[5]];
                                    nArray4[t.lIIIlllllIlll[0]] = lIIIlllllIlll[6];
                                    nArray4[t.lIIIlllllIlll[1]] = lIIIlllllIlll[7];
                                    nArray4[t.lIIIlllllIlll[3]] = lIIIlllllIlll[8];
                                    if (t.lIlIIllIIllllII(e.b(nArray4) ? 1 : 0)) {
                                        if (t.lIlIIllIIlllllI(Equipment.contains((int[])f.aW) ? 1 : 0) && t.lIlIIllIIlllllI(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                                            a.b(f.aW, lIIIlllllIlll[1]);
                                        }
                                        if (t.lIlIIllIIllllII(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                                            Inventory.getFirst((int[])f.aW).interact(lIIIlllllIIll[lIIIlllllIlll[10]]);
                                            Time.sleepTicks((int)lIIIlllllIlll[5]);

                                        }
                                        if (t.lIlIIllIIlllllI(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepTicks((int)lIIIlllllIlll[5]);

                                        }
                                        a.a(lIIIlllllIlll[11], lIIIlllllIlll[1]);
                                        a.a(lIIIlllllIlll[8], lIIIlllllIlll[1]);
                                        a.a(lIIIlllllIlll[6], lIIIlllllIlll[12]);
                                        a.a(lIIIlllllIlll[13], lIIIlllllIlll[14]);
                                    }
                                }
                            }
                        }
                        if (t.lIlIIllIIllllII(Inventory.contains((int[])f.ba) ? 1 : 0) && t.lIlIIllIIllllIl(Movement.getRunEnergy(), lIIIlllllIlll[15])) {
                            Inventory.getFirst((int[])f.ba).interact(lIIIlllllIIll[lIIIlllllIlll[16]]);
                            Time.sleepTicks((int)lIIIlllllIlll[1]);

                        }
                        int[] nArray = new int[lIIIlllllIlll[1]];
                        nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[17];
                        if (t.lIlIIllIIllllII(Inventory.contains((int[])nArray) ? 1 : 0) && t.lIlIIllIlIIIIIl(t.lIlIIllIIlllIll(e.v(), 55.0))) {
                            int[] nArray5 = new int[lIIIlllllIlll[1]];
                            nArray5[t.lIIIlllllIlll[0]] = lIIIlllllIlll[17];
                            Inventory.getFirst((int[])nArray5).interact(lIIIlllllIIll[lIIIlllllIlll[18]]);
                        }
                        if (t.lIlIIllIIllllII(t.S() ? 1 : 0) && t.lIlIIllIIlllllI(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                            if (t.lIlIIllIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIIlllllIlll[4]) && t.lIlIIllIIlllllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[19]];
                                Movement.walkTo((WorldPoint)fd);

                                Time.sleepTicks((int)lIIIlllllIlll[1]);

                            }
                            if (t.lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fd), lIIIlllllIlll[4])) {
                                g.a(lIIIlllllIIll[lIIIlllllIlll[20]], bW);
                            }
                        }
                        if (t.lIlIIllIlIIIlII(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIIIlllllIlll[1])) {
                            var7 = new WorldArea(lIIIlllllIlll[21], lIIIlllllIlll[22], lIIIlllllIlll[19], lIIIlllllIlll[18], lIIIlllllIlll[0]);
                            if (t.lIlIIllIIlllllI(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[12]];
                                Movement.walkTo((WorldPoint)fy);

                                Time.sleepTicks((int)lIIIlllllIlll[1]);

                            }
                            if (t.lIlIIllIIllllII(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                g.a(lIIIlllllIIll[lIIIlllllIlll[23]], bW);
                            }
                        }
                        if (!t.lIlIIllIlIIIlII(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIIIlllllIlll[3])) break block78;
                        co = lIIIlllllIlll[0];
                        int[] nArray6 = new int[lIIIlllllIlll[1]];
                        nArray6[t.lIIIlllllIlll[0]] = lIIIlllllIlll[24];
                        if (t.lIlIIllIIlllllI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                            String[] stringArray = new String[lIIIlllllIlll[1]];
                            stringArray[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[25]];
                            if (t.lIlIIllIIlllllI(Equipment.contains((String[])stringArray) ? 1 : 0) && t.lIlIIllIIlllllI(fx ? 1 : 0)) {
                                if (!t.lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fz), lIIIlllllIlll[4]) || t.lIlIIllIlIIIlIl(Players.getLocal().getWorldLocation().getPlane(), lIIIlllllIlll[3])) {
                                    AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[26]];
                                    Movement.walkTo((WorldPoint)fz);

                                    Time.sleepTicks((int)lIIIlllllIlll[1]);

                                }
                                if (t.lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fz), lIIIlllllIlll[4])) {
                                    g.a(lIIIlllllIIll[lIIIlllllIlll[27]], bW);
                                }
                            }
                        }
                        int[] nArray7 = new int[lIIIlllllIlll[1]];
                        nArray7[t.lIIIlllllIlll[0]] = lIIIlllllIlll[24];
                        if (t.lIlIIllIIllllII(Inventory.contains((int[])nArray7) ? 1 : 0) && t.lIlIIllIIlllllI(fx ? 1 : 0)) {
                            String[] stringArray = new String[lIIIlllllIlll[1]];
                            stringArray[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[28]];
                            if (t.lIlIIllIIllllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (t.lIlIIllIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(fA), lIIIlllllIlll[4])) {
                                    AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[29]];
                                    Movement.walkTo((WorldPoint)fA);

                                    Time.sleepTicks((int)lIIIlllllIlll[1]);

                                }
                                if (t.lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fA), lIIIlllllIlll[4])) {
                                    String[] stringArray2 = new String[lIIIlllllIlll[1]];
                                    stringArray2[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[30]];
                                    String[] stringArray3 = new String[lIIIlllllIlll[1]];
                                    stringArray3[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[31]];
                                    Inventory.getFirst((String[])stringArray2).useOn(TileObjects.getNearest((String[])stringArray3));
                                    Time.sleepTicks((int)lIIIlllllIlll[10]);

                                }
                            }
                            String[] stringArray4 = new String[lIIIlllllIlll[1]];
                            stringArray4[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[32]];
                            if (t.lIlIIllIIlllllI(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                                if (t.lIlIIllIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(fB), lIIIlllllIlll[4])) {
                                    AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[33]];
                                    String[] stringArray5 = new String[lIIIlllllIlll[1]];
                                    stringArray5[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[34]];
                                    if (t.lIlIIllIIllllll(TileObjects.getNearest((String[])stringArray5))) {
                                        String[] stringArray6 = new String[lIIIlllllIlll[1]];
                                        stringArray6[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[35]];
                                        String[] stringArray7 = new String[lIIIlllllIlll[1]];
                                        stringArray7[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[36]];
                                        if (t.lIlIIllIIllllII(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[lIIIlllllIlll[1]];
                                            stringArray8[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[37]];
                                            TileObjects.getNearest((String[])stringArray8).interact(lIIIlllllIIll[lIIIlllllIlll[9]]);
                                            Time.sleepTicks((int)lIIIlllllIlll[3]);

                                        }
                                    }
                                    String[] stringArray9 = new String[lIIIlllllIlll[1]];
                                    stringArray9[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[38]];
                                    if (t.lIlIIllIIllllll(TileObjects.getNearest((String[])stringArray9))) {
                                        String[] stringArray10 = new String[lIIIlllllIlll[1]];
                                        stringArray10[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[39]];
                                        String[] stringArray11 = new String[lIIIlllllIlll[1]];
                                        stringArray11[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[40]];
                                        if (t.lIlIIllIIllllII(TileObjects.getNearest((String[])stringArray10).hasAction(stringArray11) ? 1 : 0)) {
                                            String[] stringArray12 = new String[lIIIlllllIlll[1]];
                                            stringArray12[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[41]];
                                            TileObjects.getNearest((String[])stringArray12).interact(lIIIlllllIIll[lIIIlllllIlll[42]]);
                                            Time.sleepTicks((int)lIIIlllllIlll[3]);

                                        }
                                    }
                                    Movement.walkTo((WorldPoint)fB);

                                    Time.sleepTicks((int)lIIIlllllIlll[1]);

                                }
                                if (t.lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fB), lIIIlllllIlll[4])) {
                                    String[] stringArray13 = new String[lIIIlllllIlll[1]];
                                    stringArray13[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[43]];
                                    if (t.lIlIIllIIllllll(TileObjects.getNearest((String[])stringArray13))) {
                                        String[] stringArray14 = new String[lIIIlllllIlll[1]];
                                        stringArray14[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[44]];
                                        TileObjects.getNearest((String[])stringArray14).interact(lIIIlllllIIll[lIIIlllllIlll[45]]);
                                        Time.sleepTicks((int)lIIIlllllIlll[4]);

                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[lIIIlllllIlll[1]];
                        nArray8[t.lIIIlllllIlll[0]] = lIIIlllllIlll[24];
                        if (t.lIlIIllIIllllII(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[lIIIlllllIlll[1]];
                            nArray9[t.lIIIlllllIlll[0]] = lIIIlllllIlll[46];
                            if (t.lIlIIllIIllllII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                fx = lIIIlllllIlll[1];
                            }
                        }
                        if (t.lIlIIllIIllllII(fx ? 1 : 0)) {
                            String[] stringArray = new String[lIIIlllllIlll[1]];
                            stringArray[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[47]];
                            if (t.lIlIIllIIlllllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIIlllllIlll[1]];
                                nArray10[t.lIIIlllllIlll[0]] = lIIIlllllIlll[48];
                                if (t.lIlIIllIIlllllI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    String[] stringArray15 = new String[lIIIlllllIlll[1]];
                                    stringArray15[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[49]];
                                    if (t.lIlIIllIIlllllI(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                                        t.bi();
                                    }
                                    String[] stringArray16 = new String[lIIIlllllIlll[1]];
                                    stringArray16[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[50]];
                                    if (t.lIlIIllIIllllII(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                                        if (t.lIlIIllIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(fC), lIIIlllllIlll[3])) {
                                            AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[51]];
                                            Movement.walkTo((WorldPoint)fC);

                                            Time.sleepTicks((int)lIIIlllllIlll[1]);

                                        }
                                        if (t.lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fC), lIIIlllllIlll[3])) {
                                            g.a(lIIIlllllIIll[lIIIlllllIlll[52]], bW);
                                        }
                                    }
                                }
                            }
                        }
                        if (t.lIlIIllIIllllII(fx ? 1 : 0)) {
                            int[] nArray11 = new int[lIIIlllllIlll[1]];
                            nArray11[t.lIIIlllllIlll[0]] = lIIIlllllIlll[48];
                            if (t.lIlIIllIIllllII(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIlllllIlll[1]];
                                stringArray[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[53]];
                                if (t.lIlIIllIIlllllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                                    int[] nArray12 = new int[lIIIlllllIlll[1]];
                                    nArray12[t.lIIIlllllIlll[0]] = lIIIlllllIlll[24];
                                    if (t.lIlIIllIIlllllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                        t.bi();
                                    }
                                    int[] nArray13 = new int[lIIIlllllIlll[1]];
                                    nArray13[t.lIIIlllllIlll[0]] = lIIIlllllIlll[24];
                                    if (t.lIlIIllIIllllII(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                        var7 = new WorldArea(lIIIlllllIlll[21], lIIIlllllIlll[22], lIIIlllllIlll[19], lIIIlllllIlll[18], lIIIlllllIlll[0]);
                                        if (t.lIlIIllIIlllllI(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[54]];
                                            Movement.walkTo((WorldPoint)fy);

                                            Time.sleepTicks((int)lIIIlllllIlll[1]);

                                        }
                                        if (t.lIlIIllIIllllII(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            g.a(lIIIlllllIIll[lIIIlllllIlll[55]], bW);
                                        }
                                    }
                                }
                            }
                        }
                        String[] stringArray = new String[lIIIlllllIlll[1]];
                        stringArray[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[56]];
                        if (!t.lIlIIllIIllllII(Equipment.contains((String[])stringArray) ? 1 : 0)) break block78;
                        String[] stringArray17 = new String[lIIIlllllIlll[1]];
                        stringArray17[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[57]];
                        if (t.lIlIIllIlIIIllI(NPCs.getNearest((String[])stringArray17))) {
                            String[] stringArray18 = new String[lIIIlllllIlll[1]];
                            stringArray18[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[58]];
                            if (t.lIlIIllIlIIIllI(NPCs.getNearest((String[])stringArray18))) {
                                AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[59]];
                                Movement.walkTo((WorldPoint)fD);

                                Time.sleepTicks((int)lIIIlllllIlll[1]);

                            }
                        }
                        String[] stringArray19 = new String[lIIIlllllIlll[1]];
                        stringArray19[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[60]];
                        if (!t.lIlIIllIlIIIllI(NPCs.getNearest((String[])stringArray19))) break block79;
                        String[] stringArray20 = new String[lIIIlllllIlll[1]];
                        stringArray20[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[61]];
                        if (!t.lIlIIllIIllllll(NPCs.getNearest((String[])stringArray20))) break block80;
                    }
                    if (t.lIlIIllIlIIIllI(fE)) {
                        t.bh();
                    }
                    if (t.lIlIIllIIllllll(var7 = NPCs.getNearest(nPC -> {
                        int n2;
                        if (t.lIlIIllIIllllII(nPC.getName().contains(lIIIlllllIIll[lIIIlllllIlll[89]]) ? 1 : 0) && t.lIlIIllIlIIlIII(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lIIIlllllIlll[1];

                            if (((12 + 106 - 83 + 203 ^ 42 + 156 - 81 + 53) & (51 + 35 - -104 + 25 ^ 31 + 87 - -2 + 27 ^ -1)) != 0) {
                                return false;
                            }
                        } else {
                            n2 = lIIIlllllIlll[0];
                        }
                        return n2 != 0;
                    })) && t.lIlIIllIlIIIllI(Players.getLocal().getInteracting())) {
                        var7.interact(lIIIlllllIIll[lIIIlllllIlll[62]]);
                        Time.sleepTicks((int)lIIIlllllIlll[3]);

                    }
                    if (t.lIlIIllIlIIIllI(var7) && t.lIlIIllIlIIIllI(Players.getLocal().getInteracting())) {
                        String[] stringArray = new String[lIIIlllllIlll[1]];
                        stringArray[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[63]];
                        if (t.lIlIIllIIllllll(NPCs.getNearest((String[])stringArray))) {
                            String[] stringArray21 = new String[lIIIlllllIlll[1]];
                            stringArray21[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[15]];
                            if (t.lIlIIllIIlllllI(NPCs.getNearest((String[])stringArray21).isDead() ? 1 : 0) && t.lIlIIllIIlllllI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray22 = new String[lIIIlllllIlll[1]];
                                stringArray22[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[64]];
                                NPCs.getNearest((String[])stringArray22).interact(lIIIlllllIIll[lIIIlllllIlll[65]]);
                            }
                        }
                    }
                    if (t.lIlIIllIIllllII(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[66]];
                        List var8 = Dialog.getOptions();
                        if (t.lIlIIllIIlllllI(var8.isEmpty() ? 1 : 0)) {
                            int var9 = lIIIlllllIlll[0];
                            while (t.lIlIIllIIllllIl(var9, var8.size())) {
                                if (t.lIlIIllIIllllII(((Widget)var8.get(var9)).getText().contains(lIIIlllllIIll[lIIIlllllIlll[67]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIlllllIlll[1]];
                                    stringArray[t.lIIIlllllIlll[0]] = ((Widget)var8.get(var9)).getText();
                                    Dialog.chooseOption((String[])stringArray);

                                    Time.sleepTicks((int)lIIIlllllIlll[3]);

                                    if (1 > ((18 + 41 - -27 + 78 ^ 145 + 27 - 125 + 113) & (0xB4 ^ 0x94 ^ (0xBA ^ 0x9E) ^ -1))) break;
                                    return;
                                }
                                ++var9;

                                if (1 != 3) continue;
                                return;
                            }
                        }
                    }
                }
                String[] stringArray = new String[lIIIlllllIlll[1]];
                stringArray[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[68]];
                if (t.lIlIIllIIllllll(NPCs.getNearest((String[])stringArray))) {
                    if (t.lIlIIllIIllllIl(co, lIIIlllllIlll[1]) && t.lIlIIllIIlllllI(cp ? 1 : 0)) {
                        P.lB += lIIIlllllIlll[1];
                        P.d(AccBuilderRat.m);
                        co += lIIIlllllIlll[1];
                        P.lB = lIIIlllllIlll[0];
                        cp = lIIIlllllIlll[1];
                    }
                    if (t.lIlIIllIIllllII(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[69]];
                        var7 = Dialog.getOptions();
                        if (t.lIlIIllIIlllllI(var7.isEmpty() ? 1 : 0)) {
                            int var8 = lIIIlllllIlll[0];
                            while (t.lIlIIllIIllllIl(var8, var7.size())) {
                                String var9 = fE[var8];
                                int var10 = lIIIlllllIlll[0];
                                while (t.lIlIIllIIllllIl(var10, var7.size())) {
                                    if (t.lIlIIllIIllllII(((Widget)var7.get(var10)).getText().contains(var9) ? 1 : 0)) {
                                        System.out.println("Selecting: " + ((Widget)var7.get(var10)).getText());
                                        Time.sleepTicks((int)lIIIlllllIlll[3]);

                                        String[] stringArray23 = new String[lIIIlllllIlll[1]];
                                        stringArray23[t.lIIIlllllIlll[0]] = ((Widget)var7.get(var10)).getText();
                                        Dialog.chooseOption((String[])stringArray23);

                                        Time.sleepTicks((int)lIIIlllllIlll[12]);

                                        if (3 != 2) break;
                                        return;
                                    }
                                    ++var10;

                                    if (-2 < 0) continue;
                                    return;
                                }
                                ++var8;

                                if (1 < (0x17 ^ 0x13)) continue;
                                return;
                            }
                        }
                    }
                }
            }
            g.a(bW);
        }
    }
}

