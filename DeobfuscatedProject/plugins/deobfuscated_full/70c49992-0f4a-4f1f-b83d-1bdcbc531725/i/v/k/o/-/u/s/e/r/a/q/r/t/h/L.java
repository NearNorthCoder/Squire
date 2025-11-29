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
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.h;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.k;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w;
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

/* TASK: Loot -> LootTask */
@TaskDesc(name="Loot", priority=2000, blocking=true)
public class L
extends w {
    private static /* synthetic */ String[] lIlIlIlIlIlII;
    private static final /* synthetic */ int cr;
    private static /* synthetic */ int[] lIlIlIlIlIlIl;
    @Inject
    /* synthetic */ h ch;

    private static String lIllllllIIIIIll(String var32, String var26) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var26.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlIlIl[13]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIlIlIlIlIlIl[3], var5);
            return new String(var4.doFinal(Base64.getDecoder().decode(var32.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllllIIIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllllIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIllllllIIIlIII() {
        lIlIlIlIlIlIl = new int[15];
        L.lIlIlIlIlIlIl[0] = (0x95 ^ 0xA3 ^ (0xAF ^ 0xA4)) & (0x1F ^ 0x38 ^ (0xB2 ^ 0xA8) ^ -1);
        L.lIlIlIlIlIlIl[1] = 1;
        L.lIlIlIlIlIlIl[2] = 0xAB ^ 0x98 ^ (0x4D ^ 0x74);
        L.lIlIlIlIlIlIl[3] = 2;
        L.lIlIlIlIlIlIl[4] = 3;
        L.lIlIlIlIlIlIl[5] = 8 ^ 0xD;
        L.lIlIlIlIlIlIl[6] = -(0xFFFFF62A & 0x1DFF) & (0xFFFF9DFF & 0x7FED);
        L.lIlIlIlIlIlIl[7] = 0x34 ^ 0x3B;
        L.lIlIlIlIlIlIl[8] = 0xE ^ 0xA;
        L.lIlIlIlIlIlIl[9] = 0xFFFF8FF9 & 0x75CF;
        L.lIlIlIlIlIlIl[10] = 0x92 ^ 0x95 ^ 1;
        L.lIlIlIlIlIlIl[11] = 0x9C ^ 0x9B;
        L.lIlIlIlIlIlIl[12] = -(0xFFFFFF8D & 0x597B) & (0xFFFFFFFF & 0x5FDF);
        L.lIlIlIlIlIlIl[13] = 0xCF ^ 0xC7;
        L.lIlIlIlIlIlIl[14] = 3 ^ 0x2B ^ (0xA3 ^ 0x82);
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
        void var11;
        L var27;
        if (L.lIllllllIIIlIIl(tileItem)) {
            return lIlIlIlIlIlIl[0];
        }
        if (L.lIllllllIIIlIlI(Inventory.isFull() ? 1 : 0)) {
            var27.c((TileItem)var11);
            return lIlIlIlIlIlIl[1];
        }
        Item var3 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIlIlIlIlIl[1]];
            stringArray[L.lIlIlIlIlIlIl[0]] = lIlIlIlIlIlII[lIlIlIlIlIlIl[13]];
            return item.hasAction(stringArray);
        });
        if (L.lIllllllIIIlIll(var3) && L.lIllllllIIIllII(var27.a((TileItem)var11, var3) ? 1 : 0)) {
            return lIlIlIlIlIlIl[1];
        }
        return lIlIlIlIlIlIl[0];
    }

    private static void lIllllllIIIIllI() {
        lIlIlIlIlIlII = new String[lIlIlIlIlIlIl[14]];
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[0]] = L."Drop";
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[1]] = L."Eat";
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[3]] = L."Drop";
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[4]] = L."Take";
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[8]] = L."Drink";
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[5]] = L."Take";
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[10]] = L."Eat";
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[11]] = L."(1)";
        L.lIlIlIlIlIlII[L.lIlIlIlIlIlIl[13]] = L."Eat";
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
    protected L(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static String lIllllllIIIIlIl(String var7, String var22) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIlIlIlIlIlIl[3], var2);
            return new String(var1.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static String lIllllllIIIIlII(String var12, String var33) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var33.toCharArray();
        int var28 = lIlIlIlIlIlIl[0];
        char[] var25 = var12.toCharArray();
        int var6 = var25.length;
        int var10 = lIlIlIlIlIlIl[0];
        while (L.lIllllllIIIllIl(var10, var6)) {
            char var29 = var25[var10];
            var17.append((char)(var29 ^ var18[var28 % var18.length]));
            0;
            ++var28;
            ++var10;
            0;
            if (((0x1A ^ 0x11) & ~(0xA6 ^ 0xAD)) == 0) continue;
            return null;
        }
        return String.valueOf(var17);
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
        L var21;
        NPC nPC = this.cg.c(lIlIlIlIlIlIl[1]);
        if (L.lIllllllIIIlIll(nPC)) {
            int n2;
            if (L.lIllllllIIIlIlI(this.cg.y() ? 1 : 0) && L.lIllllllIIIllII(this.ag() ? 1 : 0)) {
                n2 = lIlIlIlIlIlIl[1];
                0;
                if (-1 != -1) {
                    return ((0x7A ^ 0x68) & ~(0x8A ^ 0x98) & ~((0xB1 ^ 0xAA) & ~(0x61 ^ 0x7A))) != 0;
                }
            } else {
                n2 = lIlIlIlIlIlIl[0];
            }
            return n2 != 0;
        }
        List var15 = TileItems.getAll();
        if (L.lIllllllIIIllII(var15.isEmpty() ? 1 : 0)) {
            var21.sleep(lIlIlIlIlIlIl[5]);
            return lIlIlIlIlIlIl[1];
        }
        TileItem var8 = TileItems.getAll().stream().filter(tileItem -> {
            boolean bl;
            if (!L.lIllllllIIlIIIl(tileItem.getId(), lIlIlIlIlIlIl[12]) || L.lIllllllIIIlIlI(this.V() ? 1 : 0)) {
                bl = lIlIlIlIlIlIl[1];
                0;
                if (2 == (65 + 71 - 29 + 87 ^ 189 + 43 - 66 + 32)) {
                    return ((189 + 47 - 51 + 23 ^ 101 + 106 - 79 + 31) & (0x54 ^ 0x49 ^ (0xD1 ^ 0x83) ^ -1)) != 0;
                }
            } else {
                bl = lIlIlIlIlIlIl[0];
            }
            return bl;
        }).max(Comparator.comparingInt(tileItem -> Prices.getItemPrice((int)tileItem.getId()) * tileItem.getQuantity())).orElse(null);
        if (L.lIllllllIIIlIIl(var8)) {
            return lIlIlIlIlIlIl[0];
        }
        int var23 = Prices.getItemPrice((int)var8.getId()) * var8.getQuantity();
        if (L.lIllllllIIIllII(Inventory.isFull() ? 1 : 0) && L.lIllllllIIIllIl(var23, lIlIlIlIlIlIl[6])) {
            int var30 = Skills.getBoostedLevel((Skill)Skill.HITPOINTS) - Skills.getLevel((Skill)Skill.HITPOINTS);
            if (L.lIllllllIIIllIl(var30, lIlIlIlIlIlIl[7])) {
                if (L.lIllllllIIIlIlI(var21.V() ? 1 : 0)) {
                    // empty if block
                }
                return lIlIlIlIlIlIl[0];
            }
            0;
            if (-1 > 0) {
                return false;
            }
        } else if (L.lIllllllIIIllII(Inventory.isFull() ? 1 : 0)) {
            BoostingPotion var24;
            BoostingPotion var30 = null;
            BoostingPotion[] var31 = BoostingPotion.values();
            int llllllllllllllIllIlIlIllIIlIIIll2 = var31.length;
            int var19 = lIlIlIlIlIlIl[0];
            while (L.lIllllllIIIllIl(var19, llllllllllllllIllIlIlIllIIlIIIll2)) {
                var24 = var31[var19];
                if (L.lIllllllIIIllII(Inventory.contains(item -> {
                    int n2;
                    if (L.lIllllllIIIllII(item.getName().contains(lIlIlIlIlIlII[lIlIlIlIlIlIl[11]]) ? 1 : 0) && L.lIllllllIIIllII(item.getName().equals(var24.getName()) ? 1 : 0)) {
                        n2 = lIlIlIlIlIlIl[1];
                        0;
                        if (((0x38 ^ 0x26) & ~(0x43 ^ 0x5D)) != 0) {
                            return false;
                        }
                    } else {
                        n2 = lIlIlIlIlIlIl[0];
                    }
                    return n2 != 0;
                }) ? 1 : 0)) {
                    var30 = var24;
                }
                ++var19;
                0;
                if (3 >= 0) continue;
                return false;
            }
            if (L.lIllllllIIIlIll(var30)) {
                var31 = var30;
                Skill llllllllllllllIllIlIlIllIIlIIIll2 = var30.getSkills()[lIlIlIlIlIlIl[0]];
                var19 = (int)(0.95 * (double)var30.getBoostAmount(llllllllllllllIllIlIlIllIIlIIIll2));
                if (L.lIllllllIIIllll(Skills.getLevel((Skill)llllllllllllllIllIlIlIllIIlIIIll2) + var19, Skills.getBoostedLevel((Skill)llllllllllllllIllIlIlIllIIlIIIll2)) && L.lIllllllIIIlIll(var24 = Inventory.getFirst(arg_0 -> L.a((BoostingPotion)var31, arg_0)))) {
                    var24.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[8]]);
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
            0;
            if (3 <= 2) {
                return ((119 + 182 - 261 + 182 ^ 140 + 140 - 143 + 11) & (0x5A ^ 0 ^ (0xD0 ^ 0xC0) ^ -1)) != 0;
            }
        } else {
            void var16;
            var16.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[3]]);
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
        TileItem var13 = TileItems.getNearest(var14::a);
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
        if (L.lIllllllIIIlIIl(var13)) {
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

    private static /* synthetic */ boolean a(BoostingPotion boostingPotion, Item item) {
        return item.getName().startsWith(boostingPotion.getName());
    }

    private void c(TileItem tileItem) {
        tileItem.interact(lIlIlIlIlIlII[lIlIlIlIlIlIl[4]]);
    }
}

