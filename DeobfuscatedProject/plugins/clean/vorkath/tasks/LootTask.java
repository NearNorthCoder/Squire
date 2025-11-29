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
import gg.squire.vorkath.tasks.KHelper;
import gg.squire.vorkath.tasks.VorkathTaskBase;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
extends VorkathTaskBase {
    
    private static final  int cr;
    
    @Inject
     h ch;

    private static boolean lIllllllIIIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllllIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllllllIIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllllIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(TileItem tileItem) {
        void var1;
        L var2;
        if (L.lIllllllIIIlIIl(tileItem)) {
            return lIlIlIlIlIlIl[0];
        }
        if (L.lIllllllIIIlIlI(Inventory.isFull() ? 1 : 0)) {
            var2.c((TileItem)var1);
            return lIlIlIlIlIlIl[1];
        }
        Item var3 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIlIlIlIlIl[1]];
            stringArray[L.lIlIlIlIlIlIl[0]] = lIlIlIlIlIlII[lIlIlIlIlIlIl[13]];
            return item.hasAction(stringArray);
        });
        if (L.lIllllllIIIlIll(var3) && L.lIllllllIIIllII(var2.a((TileItem)var1, var3) ? 1 : 0)) {
            return lIlIlIlIlIlIl[1];
        }
        return lIlIlIlIlIlIl[0];
    }

    private static void lIllllllIIIIllI() {
        lIlIlIlIlIlII = new String[lIlIlIlIlIlIl[14]];
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[0]] = "Drop";
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[1]] = "Eat";
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[3]] = "Drop";
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[4]] = "Take";
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[8]] = "Drink";
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[5]] = "Take";
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[10]] = "Eat";
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[11]] = "(1)";
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[13]] = "Eat";
    }

    static {
        L.lIllllllIIIlIII();
        L.lIllllllIIIIllI();
        cr = lIlIlIlIlIlIl[6];
    }

    private static boolean lIllllllIIIllll(int n2, int n3) {
        return n2 >= n3;
    }

    private void v(Item item) {
        item.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[0]]);
    }

    private Item a(List<k> list, TileItem tileItem) {
        Item item;
        Item item2 = h.a(list);
        if (L.lIllllllIIIlIll(item2) && L.lIllllllIIIllIl(Prices.getItemPrice((int)item2.getId()), Prices.getItemPrice((int)tileItem.getId()))) {
            item = item2;

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

        return String.valueOf(var4);
    }

    private void a(Item item, TileItem tileItem) {
        this.v(item);
        this.c(tileItem);
    }

    private static boolean lIllllllIIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var3_3;
        L var5;
        NPC nPC = this.cg.c(lIlIlIlIlIlIl[1]);
        if (L.lIllllllIIIlIll(nPC)) {
            int n2;
            if (L.lIllllllIIIlIlI(this.cg.y() ? 1 : 0) && L.lIllllllIIIllII(this.ag() ? 1 : 0)) {
                n2 = lIlIlIlIlIlIl[1];

                if (-1 != -1) {
                    return ((0x7A ^ 0x68) & ~(0x8A ^ 0x98) & ~((0xB1 ^ 0xAA) & ~(0x61 ^ 0x7A))) != 0;
                }
            } else {
                n2 = lIlIlIlIlIlIl[0];
            }
            return n2 != 0;
        }
        List var6 = TileItems.getAll();
        if (L.lIllllllIIIllII(var6.isEmpty() ? 1 : 0)) {
            var5.sleep(lIlIlIlIlIlIl[5]);
            return lIlIlIlIlIlIl[1];
        }
        TileItem var7 = TileItems.getAll().stream().filter(tileItem -> {
            boolean bl;
            if (!L.lIllllllIIlIIIl(tileItem.getId(), lIlIlIlIlIlIl[12]) || L.lIllllllIIIlIlI(this.V() ? 1 : 0)) {
                bl = lIlIlIlIlIlIl[1];

                if (2 == (65 + 71 - 29 + 87 ^ 189 + 43 - 66 + 32)) {
                    return ((189 + 47 - 51 + 23 ^ 101 + 106 - 79 + 31) & (0x54 ^ 0x49 ^ (0xD1 ^ 0x83) ^ -1)) != 0;
                }
            } else {
                bl = lIlIlIlIlIlIl[0];
            }
            return bl;
        }).max(Comparator.comparingInt(tileItem -> Prices.getItemPrice((int)tileItem.getId()) * tileItem.getQuantity())).orElse(null);
        if (L.lIllllllIIIlIIl(var7)) {
            return lIlIlIlIlIlIl[0];
        }
        int var8 = Prices.getItemPrice((int)var7.getId()) * var7.getQuantity();
        if (L.lIllllllIIIllII(Inventory.isFull() ? 1 : 0) && L.lIllllllIIIllIl(var8, lIlIlIlIlIlIl[6])) {
            int var9 = Skills.getBoostedLevel((Skill)Skill.HITPOINTS) - Skills.getLevel((Skill)Skill.HITPOINTS);
            if (L.lIllllllIIIllIl(var9, lIlIlIlIlIlIl[7])) {
                if (L.lIllllllIIIlIlI(var5.V() ? 1 : 0)) {
                    // empty if block
                }
                return lIlIlIlIlIlIl[0];
            }

        } else if (L.lIllllllIIIllII(Inventory.isFull() ? 1 : 0)) {
            BoostingPotion var10;
            BoostingPotion var9 = null;
            BoostingPotion[] var11 = BoostingPotion.values();
            int llllllllllllllIllIlIlIllIIlIIIll2 = var11.length;
            int var12 = lIlIlIlIlIlIl[0];
            while (L.lIllllllIIIllIl(var12, llllllllllllllIllIlIlIllIIlIIIll2)) {
                var10 = var11[var12];
                if (L.lIllllllIIIllII(Inventory.contains(item -> {
                    int n2;
                    if (L.lIllllllIIIllII(item.getName().contains(lIlIlIlIlIlII[lIlIlIlIlIlIl[11]]) ? 1 : 0) && L.lIllllllIIIllII(item.getName().equals(var10.getName()) ? 1 : 0)) {
                        n2 = lIlIlIlIlIlIl[1];

                        if (((0x38 ^ 0x26) & ~(0x43 ^ 0x5D)) != 0) {
                            return false;
                        }
                    } else {
                        n2 = lIlIlIlIlIlIl[0];
                    }
                    return n2 != 0;
                }) ? 1 : 0)) {
                    var9 = var10;
                }
                ++var12;

                if (3 >= 0) continue;
                return false;
            }
            if (L.lIllllllIIIlIll(var9)) {
                var11 = var9;
                Skill llllllllllllllIllIlIlIllIIlIIIll2 = var9.getSkills()[lIlIlIlIlIlIl[0]];
                var12 = (int)(0.95 * (double)var9.getBoostAmount(llllllllllllllIllIlIlIllIIlIIIll2));
                if (L.lIllllllIIIllll(Skills.getLevel((Skill)llllllllllllllIllIlIlIllIIlIIIll2) + var12, Skills.getBoostedLevel((Skill)llllllllllllllIllIlIlIllIIlIIIll2)) && L.lIllllllIIIlIll(var10 = Inventory.getFirst(arg_0 -> L.a((BoostingPotion)var11, arg_0)))) {
                    var10.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[8]]);
                    return lIlIlIlIlIlIl[1];
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
        if (L.lIllllllIIIlllI(n2, lIlIlIlIlIlIl[2])) {
            item.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[1]]);

            if (3 <= 2) {
                return ((119 + 182 - 261 + 182 ^ 140 + 140 - 143 + 11) & (0x5A ^ 0 ^ (0xD0 ^ 0xC0) ^ -1)) != 0;
            }
        } else {
            void var13;
            var13.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[3]]);
        }
        this.c(tileItem);
        return lIlIlIlIlIlIl[0];
    }

    private static boolean lIllllllIIlIIII(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean ag() {
        void var1_1;
        L var14;
        int[] nArray = new int[lIlIlIlIlIlIl[1]];
        nArray[L.lIlIlIlIlIlIl[0]] = lIlIlIlIlIlIl[9];
        if (L.lIllllllIIIlIll(Projectiles.getNearest((int[])nArray))) {
            return lIlIlIlIlIlIl[0];
        }
        if (L.lIllllllIIlIIII(Inventory.getFreeSlots(), lIlIlIlIlIlIl[1])) {
            return lIlIlIlIlIlIl[0];
        }
        TileItem var15 = TileItems.getNearest(var14::a);
        if (L.lIllllllIIIlIlI(var14.cg.E() ? 1 : 0)) {
            return lIlIlIlIlIlIl[0];
        }
        if (L.lIllllllIIIllII(Inventory.contains(item -> {
            String[] stringArray = new String[lIlIlIlIlIlIl[1]];
            stringArray[L.lIlIlIlIlIlIl[0]] = lIlIlIlIlIlII[lIlIlIlIlIlIl[10]];
            return item.hasAction(stringArray);
        }) ? 1 : 0)) {
            return lIlIlIlIlIlIl[0];
        }
        if (L.lIllllllIIIlIIl(var15)) {
            return lIlIlIlIlIlIl[0];
        }
        var1_1.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[5]]);
        return lIlIlIlIlIlIl[1];
    }

    private static boolean lIllllllIIIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIllllllIIIlIll(Object object) {
        return object != null;
    }

    private static  boolean a(BoostingPotion boostingPotion, Item item) {
        return item.getName().startsWith(boostingPotion.getName());
    }

    private void c(TileItem tileItem) {
        tileItem.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[4]]);
    }
}

