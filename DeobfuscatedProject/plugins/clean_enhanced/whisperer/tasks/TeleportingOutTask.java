/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.whisperer.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.Iterator;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.whisperer.tasks.WhispererManager;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Teleporting out", priority=0x7FFFFFFF, blocking=true)
public class TeleportingOutTask
extends WhispererTaskBase {
    @Inject
    private  a f;
    private static final  int ab;

    static {
        t.var3();
        t.var4();
        ab = 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean c(boolean bl) {
        Item var5;
        void var6;
        int[] nArray = new int[2];
        nArray[1] = 5;
        Item item2 = Inventory.getFirst((int[])nArray);
        if item2 != null {
            item2.interact(var1[2]);
            return 2;
        }
        int[] nArray2 = new int[6];
        nArray2[1] = 7;
        nArray2[2] = 8;
        Item var7 = Inventory.getFirst((int[])nArray2);
        if var7 != null {
            var7.interact(var1[6]);
            return 2;
        }
        if (((int == 0)var6) && (var5 = Inventory.getFirst(item -> item.getName( != null).contains(var1[3])))) {
            if ((Dialog.isViewingOptions( != 0) ? 1 : 0)) {
                Dialog.chooseOption((int)9);
                0;
                return 2;
            }
            var5.interact(var1[9]);
            return 2;
        }
        var5 = Inventory.getFirst(item -> {
            boolean bl;
            Item var8;
            if ((!(item.hasAction(var1[var2[14]]::equals == 0) ? 1 : 0) || (item.hasAction(var1[var2[15]]::equals != 0) ? 1 : 0)) && (var8.getId() != var2[16])) {
                bl = 2;
                0;
                if (1 >= 2) {
                    return ((0xA7 ^ 0xA0) & ~(0x5A ^ 0x5D)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        });
        if var5 != null {
            String[] stringArray = new String[6];
            stringArray[1] = var1[var2[10]];
            stringArray[2] = var1[var2[11]];
            var5.interact(stringArray);
            return 2;
        }
        Iterator var9 = SpellBook.getCurrent().getCastableSpells().iterator();
        while ((var9.hasNext( != 0) ? 1 : 0)) {
            Spell var10 = (Spevar9.next();
            String var11 = var10.toString().toLowerCase();
            if ((var11.contains(var1[var2[12]] != 0) ? 1 : 0) && (var11.contains(var1[var2[13]] == 0) ? 1 : 0)) {
                Magic.cast((Spevar10);
                return 2;
            }
            0;
            if ((0x54 ^ 0x29 ^ (0x53 ^ 0x2B)) > 0) continue;
            return ((47 + 184 - 70 + 64 ^ 15 + 126 - 11 + 52) & (0x18 ^ 0x7E ^ (0xB9 ^ 0x88) ^ -1)) != 0;
        }
        return 1;
    }

    @Override
    public boolean run() {
        t var12;
        if ((this.p.b(0 == 0) ? 1 : 0)) {
            return 1;
        }
        int var13 = 1;
        if ((var12.W.j( == null))) {
            var13 = var12.TeleportingOutTask() ? 1 : 0;
            0;
            if ((0xAE ^ 0xAA) < 1) {
                return ((0xF7 ^ 0xA4) & ~(0x3B ^ 0x68)) != 0;
            }
        } else {
            var13 = var12.u() ? 1 : 0;
        }
        if var13 {
            boolean bl;
            TileItem var14;
            if ((Inventory.isFull( == 0) ? 1 : 0) && (var12.W.j( == null)) && (var14 = TileItem != nullTileItems.getAll().stream().max(Comparator.comparingInt(tileItem -> tileItem.getQuantity() * Prices.getItemPrice((int)tileItem.getId()))).orElse(null))) {
                var14.interact(var1[1]);
                return 2;
            }
            if ((var12.W.j( != null))) {
                bl = 2;
                0;
                if null != null {
                    return ((0xFC ^ 0x95 ^ (0x3A ^ 0x48)) & (0xCA ^ 0xAF ^ (0xCC ^ 0xB2) ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            if ((var12.cbl)) {
                var12.f.a(2);
            }
            return 2;
        }
        return 1;
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 1;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 1;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (2 < 3) continue;
            return null;
        }
        return String.valueOf(var18);
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    private boolean TeleportingOutTask() {
        t var31;
        int n2 = 1;
        int n3 = Inventory.getAll(item -> {
            int n2;
            if (!(item.getName( == 0).contains(var1[var2[27]]) ? 1 : 0) || (item.getName( != 0).contains(var1[var2[28]]) ? 1 : 0)) {
                n2 = 2;
                0;
                if null != null {
                    return ((0x46 ^ 0x3C ^ (0xE5 ^ 0xA7)) & (0x47 ^ 0x4A ^ (0xF3 ^ 0xC6) ^ -1)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        }).stream().mapToInt(item -> Integer.parseInt(item.getName().split(var1[var2[24]])[2].replace(var1[var2[25]], var1[var2[26]]))).sum();
        if ((this.i.prayDoses( < this.i.prayDoses())) {
            int var32 = 2;
        }
        int var33 = Inventory.getAll(item -> item.getName().contains(var1[var2[23]])).stream().mapToInt(item -> Integer.parseInt(item.getName().split(var1[var2[20]])[2].replace(var1[var2[21]], var1[var2[22]]))).sum();
        if ((var33 += Inventory.getCount(item -> {
            String[] stringArray = new String[2];
            stringArray[1] = var1[var2[19]];
            return item.hasAction(stringArray);
        }) < var31.i.food())) {
            n2 = 2;
        }
        return n2 != 0;
    }

    private boolean u() {
        if ((Prayers.getPoints() <= 3) && (Inventory.contains(item -> {
            int n2;
            if (!t.var34(item.getName( == 0).contains(var1[var2[17]]) ? 1 : 0) || (item.getName( != 0).contains(var1[var2[18]]) ? 1 : 0)) {
                n2 = 2;
                0;
                if ((0x56 ^ 0x52) == 0) {
                    return ((0x77 ^ 0x6A) & ~(0xA0 ^ 0xBD)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            return 2;
        }
        if ((Combat.getCurrentHealth() <= 4)) {
            return 2;
        }
        return 1;
    }

    @Override
    public boolean p() {
        return 1;
    }

        catch (Exception var40) {
            var40.printStackTrace();
            return null;
        }
    }

}

