/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.CoxTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Prep Withdraw Olm Gear", priority=20999, blocking=true)
public class PrepWithdrawOlmGearTask
extends CoxTaskBase {

    private static boolean llIlIIlIlIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIIlIlIlIII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected PrepWithdrawOlmGearTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

        return String.valueOf(var1);
    }

    private static boolean llIlIIlIlIllII(Object object) {
        return object == null;
    }

    private static void llIlIIlIlIIlIl() {
        lIIlllllIlII = new String[lIIlllllIlIl[12]];
        bh.lIIlllllIlII[bh.lIIlllllIlIl[0]] = "Finishing prep";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[2]] = "CANT FIND SUPPLY WIDGET";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[1]] = "Withdraw-All";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[5]] = "CANT FIND STORAGE";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[6]] = "Private";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[7]] = "storage";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[4]] = "Private";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[8]] = "Stamina";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[9]] = "Overload";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[10]] = "Overload";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[11]] = "Stamina potion";
    }

    private static boolean llIlIIlIlIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIlIlIlIll(int n2) {
        return n2 <= 0;
    }

    static {
        bh.llIlIIlIlIIllI();
        bh.llIlIIlIlIIlIl();
    }

    private static boolean llIlIIlIlIlIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var8_9;
        Item var2;
        bh var3;
        if (!bh.llIlIIlIlIIlll(this.cp(), this.ee()) || bh.llIlIIlIlIlIII(this.cq(), this.el)) {
            return lIIlllllIlIl[0];
        }
        System.out.println("Inv: " + Bank.Inventory.getAll().size());
        HashSet<Integer> var4 = var3.el();
        ArrayList<Integer> var5 = new ArrayList<Integer>();
        var5.addAll(var4);

        int[] var6 = new int[var4.size()];
        int lllllllllllllllIlllIlIIIIlllIIlI22 = lIIlllllIlIl[0];
        while (bh.llIlIIlIlIlIII(lllllllllllllllIlllIlIIIIlllIIlI22, var6.length)) {
            var6[lllllllllllllllIlllIlIIIIlllIIlI22] = (Integer)var5.get(lllllllllllllllIlllIlIIIIlllIIlI22);
            ++lllllllllllllllIlllIlIIIIlllIIlI22;

            if (((0x1F ^ 0x21 ^ (0xB0 ^ 0xBB)) & (8 + 2 - -102 + 58 ^ 67 + 10 - -42 + 40 ^ -1)) == 0) continue;
            return ((81 + 43 - 59 + 76 ^ 37 + 134 - 125 + 124) & (0xF ^ 0x19 ^ (0x28 ^ 0x19) ^ -1)) != 0;
        }
        List<Item> lllllllllllllllIlllIlIIIIlllIIlI22 = D.bC().c(var6);
        List<Item> var7 = D.bC().a(item -> item.getName().startsWith(lIIlllllIlII[lIIlllllIlIl[11]]));
        List<Item> var8 = D.bC().a(item -> item.getName().startsWith(lIIlllllIlII[lIIlllllIlIl[10]]));
        if (bh.llIlIIlIlIlIIl(var8.isEmpty() ? 1 : 0) && bh.llIlIIlIlIlIIl(Inventory.contains(item -> item.getName().startsWith(lIIlllllIlII[lIIlllllIlIl[9]])) ? 1 : 0)) {
            lllllllllllllllIlllIlIIIIlllIIlI22.add(var8.get(lIIlllllIlIl[0]));

        }
        int var9 = lIIlllllIlIl[1] - Inventory.getCount(item -> item.getName().startsWith(lIIlllllIlII[lIIlllllIlIl[8]]));
        Object var10 = var7.iterator();
        while (bh.llIlIIlIlIlIlI(var10.hasNext() ? 1 : 0)) {
            var2 = var10.next();
            if (bh.llIlIIlIlIlIll(var9)) {

                if (((0x69 ^ 0x3B) & ~(0xCE ^ 0x9C)) <= 0) break;
                return false;
            }
            if (bh.llIlIIlIlIllII(var2)) {

                if (3 > ((0x7E ^ 0x20 ^ (0x4F ^ 0x58)) & (67 + 52 - -5 + 15 ^ 44 + 9 - -99 + 42 ^ -1))) continue;
                return ((129 + 223 - 121 + 22 ^ 52 + 13 - -123 + 9) & (0x4B ^ 0x35 ^ (0x58 ^ 0x1E) ^ -1)) != 0;
            }
            lllllllllllllllIlllIlIIIIlllIIlI22.add(var2);

            var9 -= var2.getQuantity();

            if (((0x34 ^ 0x11) & ~(0x1E ^ 0x3B)) < 1) continue;
            return (3 & ~3) != 0;
        }
        if (bh.llIlIIlIlIlIlI(lllllllllllllllIlllIlIIIIlllIIlI22.isEmpty() ? 1 : 0)) {
            if (bh.llIlIIlIlIlIlI(Movement.getDestination().equals((Object)var3.al.bs) ? 1 : 0)) {
                return lIIlllllIlIl[0];
            }
            System.out.println(lIIlllllIlII[lIIlllllIlIl[0]]);
            Movement.setDestination((WorldPoint)var3.al.bs);
            return lIIlllllIlIl[2];
        }
        if (bh.llIlIIlIlIlIlI(D.bJ() ? 1 : 0)) {
            if (bh.llIlIIlIlIlIlI(Inventory.isFull() ? 1 : 0) && bh.llIlIIlIlIlIlI(D.bC().e(var6) ? 1 : 0)) {
                return lIIlllllIlIl[2];
            }
            var10 = lllllllllllllllIlllIlIIIIlllIIlI22.iterator();
            while (bh.llIlIIlIlIlIlI(var10.hasNext() ? 1 : 0)) {
                var2 = (Item)var10.next();
                if (bh.llIlIIlIlIllII(var2)) {

                    if (1 >= 0) continue;
                    return false;
                }
                Widget var11 = Widgets.get((int)lIIlllllIlIl[3], (int)lIIlllllIlIl[4], (int)var2.getSlot());
                if (bh.llIlIIlIlIllII(var11)) {
                    System.out.println(lIIlllllIlII[lIIlllllIlIl[2]]);
                }
                var11.interact(lIIlllllIlII[lIIlllllIlIl[1]]);

                if ((0xB9 ^ 0xB0 ^ (0x8A ^ 0x87)) > 2) continue;
                return ((0x2C ^ 0x17 ^ (0x79 ^ 0x51)) & (9 ^ 0x25 ^ (6 ^ 0x39) ^ -1)) != 0;
            }
            return lIIlllllIlIl[2];
        }
        var10 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bh.llIlIIlIlIlIlI(tileObject.getName().toLowerCase().contains(lIIlllllIlII[lIIlllllIlIl[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlllllIlIl[2]];
                stringArray[bh.lIIlllllIlIl[0]] = lIIlllllIlII[lIIlllllIlIl[4]];
                if (bh.llIlIIlIlIlIlI(tileObject.hasAction(stringArray) ? 1 : 0) && bh.llIlIIlIlIlIlI(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIIlllllIlIl[2];

                    if (((0xA1 ^ 0x91) & ~(0x86 ^ 0xB6)) == 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIlllllIlIl[0];
            return n2 != 0;
        });
        if (bh.llIlIIlIlIllII(var10)) {
            System.out.println(lIIlllllIlII[lIIlllllIlIl[5]]);
            return lIIlllllIlIl[0];
        }
        var8_9.interact(lIIlllllIlII[lIIlllllIlIl[6]]);
        return lIIlllllIlIl[2];
    }
}

