/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.BoostingPotion
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.BoostingPotion;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Loot", priority=2000, blocking=true)
public class LootTask
extends VorkathManager {
    
    private static final  int cr;
    
    @Inject
     h ch;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static boolean var10(int n2, int n3) {
        return n2 > n3;
    }

    private static void var11() {
        var2 = new int[15];
        L.var2[0] = (0x95 ^ 0xA3 ^ (0xAF ^ 0xA4)) & (0x1F ^ 0x38 ^ (0xB2 ^ 0xA8) ^ -1);
        L.var2[1] = 1;
        L.var2[2] = 0xAB ^ 0x98 ^ (0x4D ^ 0x74);
        L.var2[3] = 2;
        L.var2[4] = 3;
        L.var2[5] = 8 ^ 0xD;
        L.var2[6] = -(0xFFFFF62A & 0x1DFF) & (0xFFFF9DFF & 0x7FED);
        L.var2[7] = 0x34 ^ 0x3B;
        L.var2[8] = 0xE ^ 0xA;
        L.var2[9] = 0xFFFF8FF9 & 0x75CF;
        L.var2[10] = 0x92 ^ 0x95 ^ 1;
        L.var2[11] = 0x9C ^ 0x9B;
        L.var2[12] = -(0xFFFFFF8D & 0x597B) & (0xFFFFFFFF & 0x5FDF);
        L.var2[13] = 0xCF ^ 0xC7;
        L.var2[14] = 3 ^ 0x2B ^ (0xA3 ^ 0x82);
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(TileItem tileItem) {
        void var14;
        L var15;
        if (L.var16(tileItem)) {
            return var2[0];
        }
        if (L.var12(Inventory.isFull() ? 1 : 0)) {
            var15.c((TileItem)var14);
            return var2[1];
        }
        Item var17 = Inventory.getFirst(item -> {
            String[] stringArray = new String[var2[1]];
            stringArray[L.var2[0]] = var1[var2[13]];
            return item.hasAction(stringArray);
        });
        if (L.var18(var17) && L.var9(var15.a((TileItem)var14, var17) ? 1 : 0)) {
            return var2[1];
        }
        return var2[0];
    }

    private static void var19() {
        var1 = new String[var2[14]];
        L.var1[L.var2[0]] = "Drop";
        L.var1[L.var2[1]] = "Eat";
        L.var1[L.var2[3]] = "Drop";
        L.var1[L.var2[4]] = "Take";
        L.var1[L.var2[8]] = "Drink";
        L.var1[L.var2[5]] = "Take";
        L.var1[L.var2[10]] = "Eat";
        L.var1[L.var2[11]] = "(1)";
        L.var1[L.var2[13]] = "Eat";
    }

    static {
        L.var11();
        L.var19();
        cr = var2[6];
    }

    private static boolean var20(int n2, int n3) {
        return n2 >= n3;
    }

    private void v(Item item) {
        item.interact(var1[var2[0]]);
    }

    private Item a(List<k> list, TileItem tileItem) {
        Item item;
        Item item2 = h.a(list);
        if (L.var18(item2) && L.var13(Prices.getItemPrice((int)item2.getId()), Prices.getItemPrice((int)tileItem.getId()))) {
            item = item2;
            0;
            if (-2 > 0) {
                return null;
            }
        } else {
            item = null;
        }
        return item;
    }

    private k b(List<k> list, TileItem tileItem) {
        return list.stream().filter(k2 -> k2.M().equals(tileItem.getName())).findFirst().orElse(null);
    }

    @Inject
    protected LootTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static String var27(String var28, String var29) {
        var28 = new String(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var31 = var29.toCharArray();
        int var32 = var2[0];
        char[] var33 = var28.toCharArray();
        int var34 = var33.length;
        int var35 = var2[0];
        while (L.var13(var35, var34)) {
            char var36 = var33[var35];
            var30.append((char)(var36 ^ var31[var32 % var31.length]));
            0;
            ++var32;
            ++var35;
            0;
            if (((0x1A ^ 0x11) & ~(0xA6 ^ 0xAD)) == 0) continue;
            return null;
        }
        return String.valueOf(var30);
    }

    private void a(Item item, TileItem tileItem) {
        this.v(item);
        this.c(tileItem);
    }

    private static boolean var37(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var3_3;
        L var38;
        NPC nPC = this.cg.c(var2[1]);
        if (L.var18(nPC)) {
            int n2;
            if (L.var12(this.cg.y() ? 1 : 0) && L.var9(this.ag() ? 1 : 0)) {
                n2 = var2[1];
                0;
                if (-1 != -1) {
                    return ((0x7A ^ 0x68) & ~(0x8A ^ 0x98) & ~((0xB1 ^ 0xAA) & ~(0x61 ^ 0x7A))) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }
        List var39 = TileItems.getAll();
        if (L.var9(var39.isEmpty() ? 1 : 0)) {
            var38.sleep(var2[5]);
            return var2[1];
        }
        TileItem var40 = TileItems.getAll().stream().filter(tileItem -> {
            boolean bl;
            if (!L.var37(tileItem.getId(), var2[12]) || L.var12(this.V() ? 1 : 0)) {
                bl = var2[1];
                0;
                if (2 == (65 + 71 - 29 + 87 ^ 189 + 43 - 66 + 32)) {
                    return ((189 + 47 - 51 + 23 ^ 101 + 106 - 79 + 31) & (0x54 ^ 0x49 ^ (0xD1 ^ 0x83) ^ -1)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        }).max(Comparator.comparingInt(tileItem -> Prices.getItemPrice((int)tileItem.getId()) * tileItem.getQuantity())).orElse(null);
        if (L.var16(var40)) {
            return var2[0];
        }
        int var41 = Prices.getItemPrice((int)var40.getId()) * var40.getQuantity();
        if (L.var9(Inventory.isFull() ? 1 : 0) && L.var13(var41, var2[6])) {
            int var42 = Skills.getBoostedLevel((SkiSkill.HITPOINTS) - Skills.getLevel((SkiSkill.HITPOINTS);
            if (L.var13(var42, var2[7])) {
                if (L.var12(var38.V() ? 1 : 0)) {
                    // empty if block
                }
                return var2[0];
            }
            0;
            if (-1 > 0) {
                return ((0xBC ^ 0xB5) & ~(0x10 ^ 0x19)) != 0;
            }
        } else if (L.var9(Inventory.isFull() ? 1 : 0)) {
            BoostingPotion var43;
            BoostingPotion var42 = null;
            BoostingPotion[] var44 = BoostingPotion.values();
            int llllllllllllllIllIlIlIllIIlIIIll2 = var44.length;
            int var45 = var2[0];
            while (L.var13(var45, llllllllllllllIllIlIlIllIIlIIIll2)) {
                var43 = var44[var45];
                if (L.var9(Inventory.contains(item -> {
                    int n2;
                    if (L.var9(item.getName().contains(var1[var2[11]]) ? 1 : 0) && L.var9(item.getName().equals(var43.getName()) ? 1 : 0)) {
                        n2 = var2[1];
                        0;
                        if (((0x38 ^ 0x26) & ~(0x43 ^ 0x5D)) != 0) {
                            return ((0x1C ^ 0x27) & ~(0x21 ^ 0x1A)) != 0;
                        }
                    } else {
                        n2 = var2[0];
                    }
                    return n2 != 0;
                }) ? 1 : 0)) {
                    var42 = var43;
                }
                ++var45;
                0;
                
                return ((0xFA ^ 0xA5) & ~(0x14 ^ 0x4B)) != 0;
            }
            if (L.var18(var42)) {
                var44 = var42;
                Skill llllllllllllllIllIlIlIllIIlIIIll2 = var42.getSkills()[var2[0]];
                var45 = (int)(0.95 * (double)var42.getBoostAmount(llllllllllllllIllIlIlIllIIlIIIll2));
                if (L.var20(Skills.getLevel((SkillllllllllllllIllIlIlIllIIlIIIll2) + var45, Skills.getBoostedLevel((SkillllllllllllllIllIlIlIllIIlIIIll2)) && L.var18(var43 = Inventory.getFirst(arg_0 -> L.a((BoostingPotion)var44, arg_0)))) {
                    var43.interact(var1[var2[8]]);
                    return var2[1];
                }
            }
        }
        return this.b((TileItem)var3_3);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(TileItem tileItem, Item item) {
        int n2 = this.cf.getBoostedSkillLevel(Skill.HITPOINTS) - this.cf.getRealSkillLevel(Skill.HITPOINTS);
        if (L.var10(n2, var2[2])) {
            item.interact(var1[var2[1]]);
            0;
            if (3 <= 2) {
                return ((119 + 182 - 261 + 182 ^ 140 + 140 - 143 + 11) & (0x5A ^ 0 ^ (0xD0 ^ 0xC0) ^ -1)) != 0;
            }
        } else {
            void var46;
            var46.interact(var1[var2[3]]);
        }
        this.c(tileItem);
        return var2[0];
    }

    private static boolean var47(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean ag() {
        void var1_1;
        L var48;
        int[] nArray = new int[var2[1]];
        nArray[L.var2[0]] = var2[9];
        if (L.var18(Projectiles.getNearest((int[])nArray))) {
            return var2[0];
        }
        if (L.var47(Inventory.getFreeSlots(), var2[1])) {
            return var2[0];
        }
        TileItem var49 = TileItems.getNearest(var48::a);
        if (L.var12(var48.cg.E() ? 1 : 0)) {
            return var2[0];
        }
        if (L.var9(Inventory.contains(item -> {
            String[] stringArray = new String[var2[1]];
            stringArray[L.var2[0]] = var1[var2[10]];
            return item.hasAction(stringArray);
        }) ? 1 : 0)) {
            return var2[0];
        }
        if (L.var16(var49)) {
            return var2[0];
        }
        var1_1.interact(var1[var2[5]]);
        return var2[1];
    }

    private static boolean var16(Object object) {
        return object == null;
    }

    private static boolean var18(Object object) {
        return object != null;
    }

    private static  boolean a(BoostingPotion boostingPotion, Item item) {
        return item.getName().startsWith(boostingPotion.getName());
    }

    private void c(TileItem tileItem) {
        tileItem.interact(var1[var2[4]]);
    }
}

