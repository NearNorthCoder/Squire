/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.moons.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.moons.tasks.CaveNavTask;
import gg.squire.moons.tasks.LHelper;

@TaskDesc(name="Prep supplies")
public class PrepSuppliesTask
extends Task {
    static  WorldArea K;
    
    static  WorldArea Q;
    static final  WorldArea at;
    static final  WorldArea au;
    static  int an;
    static  int am;
    static  WorldArea ap;
    static final  WorldArea as;
    static  WorldPoint al;
    static  WorldArea aq;
    private final  SquireMoonsOfPerilConfig aj;
    static  WorldPoint ak;
    
    static  long ao;
    static final  WorldArea ar;

    static {
        k.lIIlIlllIIlIIIl();
        k.lIIlIlllIIIIllI();
        ak = new WorldPoint(lIIIIIIIlllll[95], lIIIIIIIlllll[96], lIIIIIIIlllll[0]);
        al = new WorldPoint(lIIIIIIIlllll[97], lIIIIIIIlllll[98], lIIIIIIIlllll[0]);
        am = lIIIIIIIlllll[0];
        ao = System.currentTimeMillis();
        ap = new WorldArea(lIIIIIIIlllll[99], lIIIIIIIlllll[100], lIIIIIIIlllll[51], lIIIIIIIlllll[57], lIIIIIIIlllll[0]);
        aq = new WorldArea(lIIIIIIIlllll[101], lIIIIIIIlllll[102], lIIIIIIIlllll[54], lIIIIIIIlllll[50], lIIIIIIIlllll[0]);
        Q = new WorldArea(lIIIIIIIlllll[103], lIIIIIIIlllll[100], lIIIIIIIlllll[51], lIIIIIIIlllll[57], lIIIIIIIlllll[0]);
        K = new WorldArea(lIIIIIIIlllll[104], lIIIIIIIlllll[105], lIIIIIIIlllll[55], lIIIIIIIlllll[55], lIIIIIIIlllll[0]);
        ar = new WorldArea(lIIIIIIIlllll[106], lIIIIIIIlllll[107], lIIIIIIIlllll[66], lIIIIIIIlllll[80], lIIIIIIIlllll[0]);
        as = new WorldArea(lIIIIIIIlllll[106], lIIIIIIIlllll[108], lIIIIIIIlllll[82], lIIIIIIIlllll[109], lIIIIIIIlllll[0]);
        at = new WorldArea(lIIIIIIIlllll[110], lIIIIIIIlllll[102], lIIIIIIIlllll[74], lIIIIIIIlllll[77], lIIIIIIIlllll[0]);
        au = new WorldArea(lIIIIIIIlllll[111], lIIIIIIIlllll[112], lIIIIIIIlllll[63], lIIIIIIIlllll[59], lIIIIIIIlllll[1]);
    }

    private static int lIIlIlllIIllIIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lIIlIlllIIlllll(int n, int n2) {
        return n <= n2;
    }

        return String.valueOf(var1);
    }

    private static int lIIlIlllIlIIIIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lIIlIlllIIlIIll(int n) {
        return n != 0;
    }

    private static boolean lIIlIlllIIllIlI(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlIlllIlIIIlI(int n) {
        return n > 0;
    }

    private static boolean lIIlIlllIIlIllI(Object object) {
        return object != null;
    }

    public static void f() {
        block5: {
            block4: {
                if (!k.lIIlIlllIIlIIll(Inventory.contains(item -> item.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[94]])) ? 1 : 0)) break block4;
                String[] stringArray = new String[lIIIIIIIlllll[1]];
                stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[0]];
                if (!k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block5;
            }
            k.h();
            return;
        }
        if (k.lIIlIlllIIlIIll(Inventory.contains(item -> item.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[93]])) ? 1 : 0)) {
            k.g();
            k.i();
            return;
        }
    }

    private static boolean lIIlIlllIIllllI(int n, int n2) {
        return n > n2;
    }

    private static boolean lIIlIlllIIlllIl(int n) {
        return n == 0;
    }

    private static void lIIlIlllIIIIllI() {
        lIIIIIIIllllI = new String[lIIIIIIIlllll[113]];
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[0]] = "Moonlight grub paste";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[1]] = "Moonlight potion(1)";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[2]] = "Moonlight potion(2)";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[3]] = "Moonlight potion(3)";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[4]] = "Moonlight potion(2)";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[5]] = "Vial of water";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[6]] = "Vial of water";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[7]] = "Drop";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[9]] = "Drinking tea";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[10]] = "Make-cuppa";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[13]] = "Nav to streambound door";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[14]] = "Passing entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[15]] = "Pass-through";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[18]] = "Nav to earthbound door";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[19]] = "Passing entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[20]] = "Pass-through";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[23]] = "Nav to streambound door";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[24]] = "Passing entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[25]] = "Pass-through";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[26]] = "Vial";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[27]] = "Vial";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[28]] = "Drop";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[29]] = "Raw bream";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[30]] = "Raw bream";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[31]] = "Drop";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[32]] = "Cooked bream";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[33]] = "Cooked bream";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[34]] = "Drop";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[37]] = "Nav to supplies";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[38]] = "Get Herb supplies";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[39]] = "Supply crates";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[40]] = "Moonlight grub paste";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[41]] = "Moonlight grub";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[42]] = "Moonlight grub";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[43]] = "Moonlight grub";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[48]] = "Nav to grub tile";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[49]] = "Gathering grubs";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[50]] = "Grubby sapling";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[51]] = "Collect-from";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[52]] = "Moonlight grub";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[53]] = "Moonlight grub";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[54]] = "Crushing grubs";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[55]] = "Moonlight grub";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[56]] = "Moonlight grub paste";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[57]] = "Moonlight grub";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[58]] = "Mixing potions";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[59]] = "Moonlight grub paste";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[60]] = "Drinking tea";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[61]] = "Make-cuppa";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[62]] = "Nav to streambound door";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[63]] = "Passing entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[64]] = "Pass-through";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[65]] = "Nav to earthbound door";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[66]] = "Passing entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[67]] = "Pass-through";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[68]] = "Nav to streambound door";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[69]] = "Passing entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[70]] = "Pass-through";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[71]] = "Raw bream";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[73]] = "Nav to supplies";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[74]] = "Get net";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[75]] = "Supply crates";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[76]] = "Nav to fishing tile";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[77]] = "Fishing";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[78]] = "Fish";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[79]] = "Raw bream";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[80]] = "Nav to stove";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[81]] = "Cooking fish";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[82]] = "Cooking stove";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[83]] = "Cook";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[8]] = "Fishing spot";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[84]] = "Fish";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[85]] = "Entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[86]] = "Entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[87]] = "Entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[88]] = "Cooking stove";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[89]] = "Entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[90]] = "Entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[91]] = "Entrance";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[92]] = "Cooking stove";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[93]] = "Moonlight potion";
        k.lIIIIIIIllllI[k.lIIIIIIIlllll[94]] = "Moonlight potion";
    }

    private static boolean lIIlIlllIIllIll(Object object) {
        return object == null;
    }

    private static boolean lIIlIlllIIlIlll(int n, int n2) {
        return n >= n2;
    }

    /*
     * WARNING - void declaration
     */
    private static void g() {
        void var2;
        String[] stringArray = new String[lIIIIIIIlllll[1]];
        stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[1]];
        Item item = Inventory.getFirst((String[])stringArray);
        String[] stringArray2 = new String[lIIIIIIIlllll[1]];
        stringArray2[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[2]];
        Item item2 = Inventory.getFirst((String[])stringArray2);
        String[] stringArray3 = new String[lIIIIIIIlllll[1]];
        stringArray3[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[3]];
        Item item3 = Inventory.getFirst((String[])stringArray3);
        if (k.lIIlIlllIIlIllI(item) && k.lIIlIlllIIlIllI(item3)) {
            item.useOn(item3);
            return;
        }
        if (k.lIIlIlllIIlIllI(var2)) {
            void var3;
            void var4;
            String[] stringArray4 = new String[lIIIIIIIlllll[1]];
            stringArray4[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[4]];
            List var5 = Inventory.getAll((String[])stringArray4);
            if (k.lIIlIlllIIlIlll(var5.size(), lIIIIIIIlllll[2])) {
                ((Item)var5.get(lIIIIIIIlllll[0])).useOn((Item)var5.get(lIIIIIIIlllll[1]));
                return;
            }
            if (k.lIIlIlllIIlIllI(var4)) {
                var4.useOn((Item)var2);
                return;
            }
            if (k.lIIlIlllIIlIllI(var3)) {
                var2.useOn((Item)var3);
                return;
            }
        }
        String[] stringArray5 = new String[lIIIIIIIlllll[1]];
        stringArray5[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[5]];
        if (k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
            String[] stringArray6 = new String[lIIIIIIIlllll[1]];
            stringArray6[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[6]];
            Inventory.getFirst((String[])stringArray6).interact(lIIIIIIIllllI[lIIIIIIIlllll[7]]);
            return;
        }
    }

    private static void i() {
        TileObject var6;
        WorldPoint var7;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n;
            if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[88]]) ? 1 : 0) && k.lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIIlllll[5])) {
                n = lIIIIIIIlllll[1];

            } else {
                n = lIIIIIIIlllll[0];
            }
            return n != 0;
        });
        if (k.lIIlIlllIIlIllI(tileObject2) && k.lIIlIlllIIllIlI(Movement.getRunEnergy(), lIIIIIIIlllll[8])) {
            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[60]];
            tileObject2.interact(lIIIIIIIllllI[lIIIIIIIlllll[61]]);
            return;
        }
        if (k.lIIlIlllIIlIIll(au.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var7 = new WorldPoint(lIIIIIIIlllll[11], lIIIIIIIlllll[12], lIIIIIIIlllll[1]);
            var6 = TileObjects.getNearest(tileObject -> {
                int n;
                if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[87]]) ? 1 : 0) && k.lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(var7), lIIIIIIIlllll[5])) {
                    n = lIIIIIIIlllll[1];

                    if (((0x30 ^ 0x7A ^ (0xAA ^ 0x83)) & (0xE7 ^ 0xB0 ^ (0xF4 ^ 0xC0) ^ -1)) > 0) {
                        return ((76 + 92 - 2 + 70 ^ 6 + 64 - -53 + 59) & (0x7E ^ 0x20 ^ (3 ^ 7) ^ -1)) != 0;
                    }
                } else {
                    n = lIIIIIIIlllll[0];
                }
                return n != 0;
            });
            if (k.lIIlIlllIIllIll(var6)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[62]];
                Movement.walkTo((WorldPoint)var7);

                return;
            }
            if (k.lIIlIlllIIlIllI(var6)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[63]];
                var6.interact(lIIIIIIIllllI[lIIIIIIIlllll[64]]);
                return;
            }
        }
        if (k.lIIlIlllIIlIIll(ar.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var7 = new WorldPoint(lIIIIIIIlllll[16], lIIIIIIIlllll[17], lIIIIIIIlllll[0]);
            var6 = TileObjects.getNearest(tileObject -> {
                int n;
                if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[86]]) ? 1 : 0) && k.lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(var7), lIIIIIIIlllll[5])) {
                    n = lIIIIIIIlllll[1];

                    if (2 == 0) {
                        return false;
                    }
                } else {
                    n = lIIIIIIIlllll[0];
                }
                return n != 0;
            });
            if (k.lIIlIlllIIllIll(var6)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[65]];
                Movement.walkTo((WorldPoint)var7);

                return;
            }
            if (k.lIIlIlllIIlIllI(var6)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[66]];
                var6.interact(lIIIIIIIllllI[lIIIIIIIlllll[67]]);
                return;
            }
        }
        if (k.lIIlIlllIIlIIll(as.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var7 = new WorldPoint(lIIIIIIIlllll[21], lIIIIIIIlllll[22], lIIIIIIIlllll[0]);
            var6 = TileObjects.getNearest(tileObject -> {
                int n;
                if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[85]]) ? 1 : 0) && k.lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(var7), lIIIIIIIlllll[7])) {
                    n = lIIIIIIIlllll[1];

                    if (2 < 2) {
                        return false;
                    }
                } else {
                    n = lIIIIIIIlllll[0];
                }
                return n != 0;
            });
            if (k.lIIlIlllIIllIll(var6)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[68]];
                Movement.walkTo((WorldPoint)var7);

                return;
            }
            if (k.lIIlIlllIIlIllI(var6)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[69]];
                var6.interact(lIIIIIIIllllI[lIIIIIIIlllll[70]]);
                return;
            }
        }
        if (k.lIIlIlllIIlIIll(at.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (k.lIIlIlllIIlllIl(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIIlllll[1]];
                stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[71]];
                if (!k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0) || k.lIIlIlllIlIIIlI(Inventory.getFreeSlots())) {
                    int[] nArray = new int[lIIIIIIIlllll[1]];
                    nArray[k.lIIIIIIIlllll[0]] = lIIIIIIIlllll[72];
                    if (k.lIIlIlllIIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (k.lIIlIlllIIllllI(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[73]];
                            Movement.walkTo((WorldPoint)al);

                            return;
                        }
                        if (k.lIIlIlllIIlllll(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[74]];
                            String[] stringArray2 = new String[lIIIIIIIlllll[1]];
                            stringArray2[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[75]];
                            var7 = TileObjects.getNearest((String[])stringArray2);
                            if (k.lIIlIlllIIlIllI(var7)) {
                                var7.interact(lIIIIIIIlllll[1]);
                                return;
                            }
                        }
                    }
                    int[] nArray2 = new int[lIIIIIIIlllll[1]];
                    nArray2[k.lIIIIIIIlllll[0]] = lIIIIIIIlllll[72];
                    if (k.lIIlIlllIIlIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        if (k.lIIlIlllIIllllI(Players.getLocal().getWorldLocation().distanceTo(ak), lIIIIIIIlllll[9])) {
                            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[76]];
                            Movement.walkTo((WorldPoint)ak);

                            return;
                        }
                        if (k.lIIlIlllIIlllll(Players.getLocal().getWorldLocation().distanceTo(ak), lIIIIIIIlllll[9]) && k.lIIlIlllIIlIllI(var7 = TileObjects.getNearest(tileObject -> {
                            int n;
                            if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[8]]) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIIIIIlllll[1]];
                                stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[84]];
                                if (k.lIIlIlllIIlIIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n = lIIIIIIIlllll[1];

                                    if (null == null) return n != 0;
                                    return (3 & ~3) != 0;
                                }
                            }
                            n = lIIIIIIIlllll[0];
                            return n != 0;
                        }))) {
                            am = lIIIIIIIlllll[0];
                            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[77]];
                            var7.interact(lIIIIIIIllllI[lIIIIIIIlllll[78]]);
                            return;
                        }
                    }
                }
            }
            if (k.lIIlIlllIIlIIll(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIIlllll[1]];
                stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[79]];
                if (k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (k.lIIlIlllIIllllI(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                        ao = System.currentTimeMillis() + (long)l.a(lIIIIIIIlllll[46], lIIIIIIIlllll[47]);
                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[80]];
                        Movement.walkTo((WorldPoint)al);

                        return;
                    }
                    if (k.lIIlIlllIIlllll(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[81]];
                        if (k.lIIlIlllIlIIIII(k.lIIlIlllIlIIIIl(System.currentTimeMillis(), ao))) {
                            am = lIIIIIIIlllll[0];
                            ao = System.currentTimeMillis() + (long)l.a(lIIIIIIIlllll[46], lIIIIIIIlllll[47]);
                        }
                        String[] stringArray3 = new String[lIIIIIIIlllll[1]];
                        stringArray3[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[82]];
                        var7 = TileObjects.getNearest((String[])stringArray3);
                        if (k.lIIlIlllIIlIllI(var7) && k.lIIlIlllIIllIlI(am, lIIIIIIIlllll[3])) {
                            var7.interact(lIIIIIIIllllI[lIIIIIIIlllll[83]]);
                            am += lIIIIIIIlllll[1];
                            return;
                        }
                    }
                }
            }
        }
    }

    public static boolean j() {
        int n;
        if (!k.lIIlIlllIIlllIl(ap.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !k.lIIlIlllIIlllIl(aq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !k.lIIlIlllIIlllIl(Q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || k.lIIlIlllIIlIIll(K.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n = lIIIIIIIlllll[1];

            }
        } else {
            n = lIIIIIIIlllll[0];
        }
        return n != 0;
    }

    private static boolean lIIlIlllIlIIIII(int n) {
        return n >= 0;
    }

    public boolean run() {
        an = this.aj.makeXPotions();
        if (k.lIIlIlllIIlIIll(k.j() ? 1 : 0)) {
            return lIIIIIIIlllll[0];
        }
        if (k.lIIlIlllIIlIIll(h.d() ? 1 : 0)) {
            return lIIIIIIIlllll[0];
        }
        k.f();
        return lIIIIIIIlllll[0];
    }

    private static void h() {
        block31: {
            block34: {
                block36: {
                    TileObject var8;
                    WorldPoint var9;
                    block35: {
                        block33: {
                            block32: {
                                TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
                                    int n;
                                    if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[92]]) ? 1 : 0) && k.lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIIlllll[5])) {
                                        n = lIIIIIIIlllll[1];

                                        }
                                    } else {
                                        n = lIIIIIIIlllll[0];
                                    }
                                    return n != 0;
                                });
                                if (k.lIIlIlllIIlIllI(tileObject2) && k.lIIlIlllIIllIlI(Movement.getRunEnergy(), lIIIIIIIlllll[8])) {
                                    SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[9]];
                                    tileObject2.interact(lIIIIIIIllllI[lIIIIIIIlllll[10]]);
                                    return;
                                }
                                if (k.lIIlIlllIIlIIll(au.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var9 = new WorldPoint(lIIIIIIIlllll[11], lIIIIIIIlllll[12], lIIIIIIIlllll[1]);
                                    var8 = TileObjects.getNearest(tileObject -> {
                                        int n;
                                        if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[91]]) ? 1 : 0) && k.lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(var9), lIIIIIIIlllll[5])) {
                                            n = lIIIIIIIlllll[1];

                                            if (-(0x49 ^ 0x4C) >= 0) {
                                                return false;
                                            }
                                        } else {
                                            n = lIIIIIIIlllll[0];
                                        }
                                        return n != 0;
                                    });
                                    if (k.lIIlIlllIIllIll(var8)) {
                                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[13]];
                                        Movement.walkTo((WorldPoint)var9);

                                        return;
                                    }
                                    if (k.lIIlIlllIIlIllI(var8)) {
                                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[14]];
                                        var8.interact(lIIIIIIIllllI[lIIIIIIIlllll[15]]);
                                        return;
                                    }
                                }
                                if (k.lIIlIlllIIlIIll(ar.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var9 = new WorldPoint(lIIIIIIIlllll[16], lIIIIIIIlllll[17], lIIIIIIIlllll[0]);
                                    var8 = TileObjects.getNearest(tileObject -> {
                                        int n;
                                        if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[90]]) ? 1 : 0) && k.lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(var9), lIIIIIIIlllll[5])) {
                                            n = lIIIIIIIlllll[1];

                                            if (3 < 0) {
                                                return false;
                                            }
                                        } else {
                                            n = lIIIIIIIlllll[0];
                                        }
                                        return n != 0;
                                    });
                                    if (k.lIIlIlllIIllIll(var8)) {
                                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[18]];
                                        Movement.walkTo((WorldPoint)var9);

                                        return;
                                    }
                                    if (k.lIIlIlllIIlIllI(var8)) {
                                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[19]];
                                        var8.interact(lIIIIIIIllllI[lIIIIIIIlllll[20]]);
                                        return;
                                    }
                                }
                                if (k.lIIlIlllIIlIIll(as.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var9 = new WorldPoint(lIIIIIIIlllll[21], lIIIIIIIlllll[22], lIIIIIIIlllll[0]);
                                    var8 = TileObjects.getNearest(tileObject -> {
                                        int n;
                                        if (k.lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[89]]) ? 1 : 0) && k.lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(var9), lIIIIIIIlllll[7])) {
                                            n = lIIIIIIIlllll[1];

                                        } else {
                                            n = lIIIIIIIlllll[0];
                                        }
                                        return n != 0;
                                    });
                                    if (k.lIIlIlllIIllIll(var8)) {
                                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[23]];
                                        Movement.walkTo((WorldPoint)var9);

                                        return;
                                    }
                                    if (k.lIIlIlllIIlIllI(var8)) {
                                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[24]];
                                        var8.interact(lIIIIIIIllllI[lIIIIIIIlllll[25]]);
                                        return;
                                    }
                                }
                                if (!k.lIIlIlllIIlIIll(at.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block31;
                                if (k.lIIlIlllIIllIlI(Inventory.getFreeSlots(), lIIIIIIIlllll[6])) {
                                    String[] stringArray = new String[lIIIIIIIlllll[1]];
                                    stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[26]];
                                    if (k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                        String[] stringArray2 = new String[lIIIIIIIlllll[1]];
                                        stringArray2[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[27]];
                                        Inventory.getFirst((String[])stringArray2).interact(lIIIIIIIllllI[lIIIIIIIlllll[28]]);
                                        return;
                                    }
                                    String[] stringArray3 = new String[lIIIIIIIlllll[1]];
                                    stringArray3[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[29]];
                                    if (k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                        String[] stringArray4 = new String[lIIIIIIIlllll[1]];
                                        stringArray4[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[30]];
                                        Inventory.getFirst((String[])stringArray4).interact(lIIIIIIIllllI[lIIIIIIIlllll[31]]);
                                        return;
                                    }
                                    String[] stringArray5 = new String[lIIIIIIIlllll[1]];
                                    stringArray5[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[32]];
                                    if (k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                        String[] stringArray6 = new String[lIIIIIIIlllll[1]];
                                        stringArray6[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[33]];
                                        Inventory.getFirst((String[])stringArray6).interact(lIIIIIIIllllI[lIIIIIIIlllll[34]]);
                                        return;
                                    }
                                }
                                int[] nArray = new int[lIIIIIIIlllll[1]];
                                nArray[k.lIIIIIIIlllll[0]] = lIIIIIIIlllll[35];
                                if (!k.lIIlIlllIIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block32;
                                int[] nArray2 = new int[lIIIIIIIlllll[1]];
                                nArray2[k.lIIIIIIIlllll[0]] = lIIIIIIIlllll[36];
                                if (!k.lIIlIlllIIlllIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block33;
                            }
                            if (k.lIIlIlllIIllllI(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[37]];
                                Movement.walkTo((WorldPoint)al);

                                return;
                            }
                            if (k.lIIlIlllIIlllll(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[38]];
                                String[] stringArray = new String[lIIIIIIIlllll[1]];
                                stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[39]];
                                var9 = TileObjects.getNearest((String[])stringArray);
                                if (k.lIIlIlllIIlIllI(var9)) {
                                    var9.interact(lIIIIIIIlllll[3]);
                                    return;
                                }
                            }
                        }
                        int[] nArray = new int[lIIIIIIIlllll[1]];
                        nArray[k.lIIIIIIIlllll[0]] = lIIIIIIIlllll[35];
                        if (!k.lIIlIlllIIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block31;
                        int[] nArray3 = new int[lIIIIIIIlllll[1]];
                        nArray3[k.lIIIIIIIlllll[0]] = lIIIIIIIlllll[36];
                        if (!k.lIIlIlllIIlIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block31;
                        String[] stringArray = new String[lIIIIIIIlllll[1]];
                        stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[40]];
                        if (!k.lIIlIlllIIlllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block34;
                        String[] stringArray7 = new String[lIIIIIIIlllll[1]];
                        stringArray7[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[41]];
                        if (!k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray7) ? 1 : 0)) break block35;
                        String[] stringArray8 = new String[lIIIIIIIlllll[1]];
                        stringArray8[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[42]];
                        if (!k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray8) ? 1 : 0)) break block36;
                        String[] stringArray9 = new String[lIIIIIIIlllll[1]];
                        stringArray9[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[43]];
                        if (!k.lIIlIlllIIllIlI(Inventory.getCount((String[])stringArray9), lIIIIIIIlllll[2])) break block36;
                    }
                    var9 = new WorldPoint(lIIIIIIIlllll[44], lIIIIIIIlllll[45], lIIIIIIIlllll[0]);
                    if (k.lIIlIlllIIllllI(Players.getLocal().getWorldLocation().distanceTo(var9), lIIIIIIIlllll[13])) {
                        am = lIIIIIIIlllll[0];
                        ao = System.currentTimeMillis() + (long)l.a(lIIIIIIIlllll[46], lIIIIIIIlllll[47]);
                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[48]];
                        Movement.walkTo((WorldPoint)var9);

                        return;
                    }
                    if (k.lIIlIlllIIlllll(Players.getLocal().getWorldLocation().distanceTo(var9), lIIIIIIIlllll[13])) {
                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[49]];
                        if (k.lIIlIlllIlIIIII(k.lIIlIlllIIllIIl(System.currentTimeMillis(), ao))) {
                            am = lIIIIIIIlllll[0];
                            ao = System.currentTimeMillis() + (long)l.a(lIIIIIIIlllll[46], lIIIIIIIlllll[47]);
                        }
                        String[] stringArray = new String[lIIIIIIIlllll[1]];
                        stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[50]];
                        var8 = TileObjects.getNearest((String[])stringArray);
                        if (k.lIIlIlllIIlIllI(var8) && k.lIIlIlllIIllIlI(am, lIIIIIIIlllll[3])) {
                            var8.interact(lIIIIIIIllllI[lIIIIIIIlllll[51]]);
                            am += lIIIIIIIlllll[1];
                            return;
                        }
                    }
                }
                String[] stringArray = new String[lIIIIIIIlllll[1]];
                stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[52]];
                if (k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray10 = new String[lIIIIIIIlllll[1]];
                    stringArray10[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[53]];
                    if (k.lIIlIlllIIlIlll(Inventory.getCount((String[])stringArray10), lIIIIIIIlllll[2])) {
                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[54]];
                        int[] nArray = new int[lIIIIIIIlllll[1]];
                        nArray[k.lIIIIIIIlllll[0]] = lIIIIIIIlllll[35];
                        String[] stringArray11 = new String[lIIIIIIIlllll[1]];
                        stringArray11[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[55]];
                        Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((String[])stringArray11));
                        return;
                    }
                }
            }
            String[] stringArray = new String[lIIIIIIIlllll[1]];
            stringArray[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[56]];
            if (k.lIIlIlllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray12 = new String[lIIIIIIIlllll[1]];
                stringArray12[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[57]];
                if (k.lIIlIlllIIlllIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[58]];
                    int[] nArray = new int[lIIIIIIIlllll[1]];
                    nArray[k.lIIIIIIIlllll[0]] = lIIIIIIIlllll[36];
                    String[] stringArray13 = new String[lIIIIIIIlllll[1]];
                    stringArray13[k.lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[59]];
                    Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((String[])stringArray13));
                    return;
                }
            }
        }
    }

    @Inject
    public PrepSuppliesTask(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.aj = squireMoonsOfPerilConfig;
    }
}

