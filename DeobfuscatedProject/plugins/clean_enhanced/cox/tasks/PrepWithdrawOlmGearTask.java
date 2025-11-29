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
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
extends CoxManager {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    protected PrepWithdrawOlmGearTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 0;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (1 != (67 + 174 - 152 + 87 ^ 35 + 93 - 88 + 140)) continue;
            return null;
        }
        return String.valueOf(var12);
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var8_9;
        Item var25;
        bh var26;
        if (!(this.cp() >= this.ee()) || (this.cq() < this.el)) {
            return 0;
        }
        System.out.println("Inv: " + Bank.Inventory.getAll().size());
        HashSet<Integer> var27 = var26.el();
        ArrayList<Integer> var28 = new ArrayList<Integer>();
        var28.addAll(var27);
        0;
        int[] var29 = new int[var27.size()];
        int lllllllllllllllIlllIlIIIIlllIIlI22 = 0;
        while (lllllllllllllllIlllIlIIIIlllIIlI22 < var29.length) {
            var29[lllllllllllllllIlllIlIIIIlllIIlI22] = (Integer)var28.get(lllllllllllllllIlllIlIIIIlllIIlI22);
            ++lllllllllllllllIlllIlIIIIlllIIlI22;
            0;
            if (((0x1F ^ 0x21 ^ (0xB0 ^ 0xBB)) & (8 + 2 - -102 + 58 ^ 67 + 10 - -42 + 40 ^ -1)) == 0) continue;
            return ((81 + 43 - 59 + 76 ^ 37 + 134 - 125 + 124) & (0xF ^ 0x19 ^ (0x28 ^ 0x19) ^ -1)) != 0;
        }
        List<Item> lllllllllllllllIlllIlIIIIlllIIlI22 = D.bC().c(var29);
        List<Item> var30 = D.bC().a(item -> item.getName().startsWith(var2[var1[11]]));
        List<Item> var31 = D.bC().a(item -> item.getName().startsWith(var2[var1[10]]));
        if ((var31.isEmpty( == 0) ? 1 : 0) && (Inventory.contains(item -> item.getName( == 0).startsWith(var2[9])) ? 1 : 0)) {
            lllllllllllllllIlllIlIIIIlllIIlI22.add(var31.get(0));
            0;
        }
        int var32 = 1 - Inventory.getCount(item -> item.getName().startsWith(var2[8]));
        Object var33 = var30.iterator();
        while ((var33.hasNext( != 0) ? 1 : 0)) {
            var25 = var33.next();
            if (var32 <= 0) {
                0;
                if (((0x69 ^ 0x3B) & ~(0xCE ^ 0x9C)) <= 0) break;
                return ((0xB0 ^ 0xBF) & ~(0xC ^ 3)) != 0;
            }
            if var25 == null {
                0;
                if (3 > ((0x7E ^ 0x20 ^ (0x4F ^ 0x58)) & (67 + 52 - -5 + 15 ^ 44 + 9 - -99 + 42 ^ -1))) continue;
                return ((129 + 223 - 121 + 22 ^ 52 + 13 - -123 + 9) & (0x4B ^ 0x35 ^ (0x58 ^ 0x1E) ^ -1)) != 0;
            }
            lllllllllllllllIlllIlIIIIlllIIlI22.add(var25);
            0;
            var32 -= var25.getQuantity();
            0;
            if (((0x34 ^ 0x11) & ~(0x1E ^ 0x3B)) < 1) continue;
            return (3 & ~3) != 0;
        }
        if ((lllllllllllllllIlllIlIIIIlllIIlI22.isEmpty( != 0) ? 1 : 0)) {
            if ((Movement.getDestination( != 0).equals((Object)var26.al.bs) ? 1 : 0)) {
                return 0;
            }
            System.out.println(var2[0]);
            Movement.setDestination((WorldPoint)var26.al.bs);
            return 2;
        }
        if ((D.bJ( != 0) ? 1 : 0)) {
            if ((Inventory.isFull( != 0) ? 1 : 0) && (D.bC( != 0).e(var29) ? 1 : 0)) {
                return 2;
            }
            var33 = lllllllllllllllIlllIlIIIIlllIIlI22.iterator();
            while ((var33.hasNext( != 0) ? 1 : 0)) {
                var25 = (Item)var33.next();
                if var25 == null {
                    0;
                    
                    return ((0xD2 ^ 0x81) & ~(0x43 ^ 0x10)) != 0;
                }
                Widget var34 = Widgets.get((int)3, (int)4, (int)var25.getSlot());
                if var34 == null {
                    System.out.println(var2[2]);
                }
                var34.interact(var2[1]);
                0;
                if ((0xB9 ^ 0xB0 ^ (0x8A ^ 0x87)) > 2) continue;
                return ((0x2C ^ 0x17 ^ (0x79 ^ 0x51)) & (9 ^ 0x25 ^ (6 ^ 0x39) ^ -1)) != 0;
            }
            return 2;
        }
        var33 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).toLowerCase().contains(var2[7]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[0] = var2[4];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 2;
                    0;
                    if (((0xA1 ^ 0x91) & ~(0x86 ^ 0xB6)) == 0) return n2 != 0;
                    return ((0x3B ^ 0x37) & ~(0x70 ^ 0x7C)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var33 == null {
            System.out.println(var2[5]);
            return 0;
        }
        var8_9.interact(var2[6]);
        return 2;
    }
}

