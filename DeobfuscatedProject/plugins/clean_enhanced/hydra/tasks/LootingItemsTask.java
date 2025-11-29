/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.events.ItemDespawned
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hydra.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import gg.squire.hydra.tasks.HydraManager;
import gg.squire.hydra.tasks.HydraManager;
import gg.squire.hydra.tasks.AlchingItemsTask;

@TaskDesc(name="Looting Items", priority=10, blocking=true, register=true)
public class LootingItemsTask
extends Task {
    
    private final  SquireAlchemicalHydraConfig ba;
    private final  Set<TileItem> bb;
    private final  a aY;
    private final  c aZ;

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        TileItem tileItem = itemDespawned.getItem();
        if (A.var3(tileItem.getId(), var1[7])) {
            this.bb.clear();
        }
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var1[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var1[0];
        while (A.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (1 != 2) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean var23(int n2) {
        return n2 != 0;
    }

    private static void var24() {
        var2 = new String[var1[27]];
        A.var2[A.var1[0]] = "Eat";
        A.var2[A.var1[3]] = "Drop";
        A.var2[A.var1[5]] = "Eat";
        A.var2[A.var1[6]] = "Drop";
        A.var2[A.var1[8]] = "Take";
        A.var2[A.var1[13]] = "Hydra";
        A.var2[A.var1[2]] = "bones";
        A.var2[A.var1[14]] = "Bury";
        A.var2[A.var1[15]] = "Empty";
        A.var2[A.var1[16]] = "Eat";
        A.var2[A.var1[4]] = "Eat";
        A.var2[A.var1[17]] = "Empty";
        A.var2[A.var1[18]] = "Eat";
        A.var2[A.var1[19]] = "Bury";
        A.var2[A.var1[20]] = "Eat";
        A.var2[A.var1[21]] = "Super restore";
        A.var2[A.var1[22]] = "ranging potion";
        A.var2[A.var1[23]] = "bastion potion";
        A.var2[A.var1[24]] = "ranging";
        A.var2[A.var1[25]] = "restore";
        A.var2[A.var1[1]] = "Prayer";
        A.var2[A.var1[26]] = "Eat";
    }

    private TileItem aj() {
        int[] nArray = new int[var1[3]];
        nArray[A.var1[0]] = var1[9];
        return TileItems.getNearest((int[])nArray);
    }

    private TileItem ao() {
        return TileItems.getNearest(tileItem -> {
            int n2;
            if (A.var23(tileItem.getName().startsWith(var2[var1[13]]) ? 1 : 0) && A.var4(tileItem.getName().contains(var2[var1[2]]) ? 1 : 0)) {
                n2 = var1[3];
                0;
                if (3 != 3) {
                    return ((0x39 ^ 0x1C) & ~(0x7F ^ 0x5A)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
    }

    private static boolean var25(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var26(int n2, int n3) {
        return n2 > n3;
    }

    private TileItem am() {
        int[] nArray = new int[var1[3]];
        nArray[A.var1[0]] = var1[10];
        return TileItems.getNearest((int[])nArray);
    }

    private static boolean var27(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public LootingItemsTask(a a2, c c2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.bb = new HashSet<TileItem>();
        this.aY = a2;
        this.aZ = c2;
        this.ba = squireAlchemicalHydraConfig;
    }

    /*
     * WARNING - void declaration
     */
    private TileItem ap() {
        void var28;
        A var29;
        TileItem tileItem = this.aZ.p().orElse(null);
        if (A.var5(tileItem)) {
            return null;
        }
        if (A.var3(var29.aZ.a((TileItem)var28), var1[12])) {
            return var28;
        }
        if (A.var23(Inventory.isFull() ? 1 : 0)) {
            return var29.aZ.q().orElse((TileItem)var28);
        }
        return tileItem;
    }

    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        TileItem tileItem = itemSpawned.getItem();
        if (A.var3(tileItem.getId(), var1[7])) {
            this.bb.add(tileItem);
            0;
        }
    }

    private static void var30() {
        var1 = new int[28];
        A.var1[0] = (0x19 ^ 0x3B) & ~(0x36 ^ 0x14);
        A.var1[1] = 0x97 ^ 0x83;
        A.var1[2] = 111 + 57 - 38 + 25 ^ 123 + 69 - 96 + 61;
        A.var1[3] = 1;
        A.var1[4] = 0x16 ^ 0x1C;
        A.var1[5] = 2;
        A.var1[6] = 3;
        A.var1[7] = -(0xFFFFDD5D & 0x2EBF) & (0xFFFFFFFF & 0xFFF);
        A.var1[8] = 0x9D ^ 0x99;
        A.var1[9] = 5 + 13 - -73 + 78;
        A.var1[10] = 0xFFFFCDED & 0x3393;
        A.var1[11] = 0xFFFFEBFB & 0x1FD6;
        A.var1[12] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        A.var1[13] = 3 ^ 6;
        A.var1[14] = 0x12 ^ 0x15;
        A.var1[15] = 0x32 ^ 0x7E ^ (0x3C ^ 0x78);
        A.var1[16] = 0xAE ^ 0x98 ^ (0x42 ^ 0x7D);
        A.var1[17] = 0x9A ^ 0x91;
        A.var1[18] = 0x58 ^ 0x54;
        A.var1[19] = 170 + 123 - 93 + 5 ^ 88 + 117 - 31 + 18;
        A.var1[20] = 6 + 131 - 124 + 149 ^ 48 + 101 - 62 + 85;
        A.var1[21] = 0xA4 ^ 0xAB;
        A.var1[22] = 121 + 98 - 106 + 45 ^ 11 + 12 - 5 + 124;
        A.var1[23] = 0x1B ^ 0xA;
        A.var1[24] = 0xB1 ^ 0xA3;
        A.var1[25] = 0x14 ^ 0x26 ^ (0x92 ^ 0xB3);
        A.var1[26] = 0xB9 ^ 0xAC;
        A.var1[27] = 0xEA ^ 0xAE ^ (0x39 ^ 0x6B);
    }

        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    private TileItem an() {
        int[] nArray = new int[var1[3]];
        nArray[A.var1[0]] = var1[11];
        return TileItems.getNearest((int[])nArray);
    }

    private static  boolean a(boolean bl, Predicate predicate, TileItem tileItem) {
        boolean bl2;
        if (!A.var23(bl) || A.var4(predicate.test(tileItem.getName()) ? 1 : 0)) {
            bl2 = var1[3];
            0;
            if (-2 >= 0) {
                return ((0xF2 ^ 0xA4) & ~(0x78 ^ 0x2E)) != 0;
            }
        } else {
            bl2 = var1[0];
        }
        return bl2;
    }

    private TileItem al() {
        return TileItems.getNearest(tileItem -> {
            int n2;
            if (A.var23(tileItem.isStackable() ? 1 : 0)) {
                int[] nArray = new int[var1[3]];
                nArray[A.var1[0]] = tileItem.getId();
                if (A.var23(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    n2 = var1[3];
                    0;
                    if (2 >= ((0x21 ^ 0xF ^ (0xB8 ^ 0xC1)) & (12 + 197 - 57 + 91 ^ 61 + 102 - 72 + 73 ^ -1))) return n2 != 0;
                    return ((0x24 ^ 0x45 ^ (0x7E ^ 0x2F)) & (182 + 115 - 290 + 239 ^ 78 + 193 - 139 + 66 ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        });
    }

    private static boolean var37(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        TileItem var38;
        A var39;
        block25: {
            TileItem var40;
            block26: {
                TileItem var41;
                if (A.var4(this.aY.g() ? 1 : 0)) {
                    return var1[0];
                }
                if (A.var37(var39.aY.k())) {
                    return var1[0];
                }
                var38 = var41 = var39.al();
                if (A.var26(Combat.getMissingHealth(), var1[1]) && A.var4(Inventory.contains(item -> {
                    String[] stringArray = new String[var1[3]];
                    stringArray[A.var1[0]] = var2[var1[26]];
                    return item.hasAction(stringArray);
                }) ? 1 : 0)) {
                    var38 = var39.am();
                    0;
                    if ((0xC6 ^ 0xC2) == 0) {
                        return ((0x3C ^ 8) & ~(0x7D ^ 0x49)) != 0;
                    }
                } else if (A.var15(Skills.getBoostedLevel((SkiSkill.PRAYER), var39.ba.restorePrayAt()) && A.var4(Inventory.contains(item -> {
                    int n2;
                    if (!A.var4(item.getName().contains(var2[var1[25]]) ? 1 : 0) || A.var23(item.getName().contains(var2[var1[1]]) ? 1 : 0)) {
                        n2 = var1[3];
                        0;
                        if (3 > 3) {
                            return (1 & (1 ^ -1)) != 0;
                        }
                    } else {
                        n2 = var1[0];
                    }
                    return n2 != 0;
                }) ? 1 : 0)) {
                    var38 = var39.an();
                    0;
                    if (((0x79 ^ 0x7F ^ (0x5A ^ 0x53)) & (0x68 ^ 0x12 ^ (0x6C ^ 0x19) ^ -1)) > 3) {
                        return ((59 + 110 - 36 + 116 ^ 32 + 111 - 73 + 128) & (0x3F ^ 0x5D ^ (0x39 ^ 0x64) ^ -1)) != 0;
                    }
                } else if (A.var27(Skills.getBoostedLevel((SkiSkill.RANGED) - Skills.getLevel((SkiSkill.RANGED), var1[2]) && A.var4(Inventory.contains(item -> item.getName().toLowerCase().contains(var2[var1[24]])) ? 1 : 0)) {
                    var38 = var39.aj();
                    0;
                    if (2 == ((0x64 ^ 0x68) & ~(6 ^ 0xA))) {
                        return ((0x83 ^ 0xC5) & ~(0x7B ^ 0x3D)) != 0;
                    }
                } else if (A.var5(var41)) {
                    var38 = var39.ak();
                }
                if (A.var5(var38)) {
                    var40 = string -> {
                        boolean bl;
                        if (!A.var4(string.toLowerCase().contains(var2[var1[22]]) ? 1 : 0) || A.var23(string.toLowerCase().contains(var2[var1[23]]) ? 1 : 0)) {
                            bl = var1[3];
                            0;
                            if (((0xBC ^ 0x82) & ~(0xBC ^ 0x82)) >= 2) {
                                return ((0x34 ^ 0x12) & ~(0xA7 ^ 0x81)) != 0;
                            }
                        } else {
                            bl = var1[0];
                        }
                        return bl;
                    };
                    boolean var42 = Inventory.contains(item -> var40.test(item.getName()));
                    var38 = TileItems.getAll().stream().filter(arg_0 -> A.a(var42, (Predicate)var40, arg_0)).filter(tileItem -> {
                        boolean bl;
                        if (A.var4(tileItem.getName().startsWith(var2[var1[21]]) ? 1 : 0)) {
                            bl = var1[3];
                            0;
                            if null != null {
                                return ((0xF ^ 0x2C) & ~(0xB6 ^ 0x95)) != 0;
                            }
                        } else {
                            bl = var1[0];
                        }
                        return bl;
                    }).max(Comparator.comparingInt(tileItem -> Prices.getItemPrice((int)tileItem.getId()) * tileItem.getQuantity())).orElse(null);
                }
                if (A.var5(var38)) {
                    return var1[0];
                }
                var40 = var39.ao();
                if (A.var37(var40)) {
                    var38 = var40;
                }
                if (!A.var23(Inventory.isFull() ? 1 : 0)) break block25;
                if (!A.var23(var38.isStackable() ? 1 : 0)) break block26;
                int[] nArray = new int[var1[3]];
                nArray[A.var1[0]] = var38.getId();
                if (!A.var4(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
            }
            Stream stream = y.aU.stream();
            String string2 = var38.getName();
            Objects.requireNonNull(string2);
            0;
            if (!A.var4(stream.anyMatch(string2::contains) ? 1 : 0) || !A.var4(var38.isNoted() ? 1 : 0) || A.var23(var38.isStackable() ? 1 : 0)) {
                Item var42 = Inventory.getFirst(item -> {
                    String[] stringArray = new String[var1[3]];
                    stringArray[A.var1[0]] = var2[var1[20]];
                    return item.hasAction(stringArray);
                });
                if (A.var37(var42) && A.var26(Combat.getMissingHealth(), var1[4])) {
                    var42.interact(var2[var1[0]]);
                    return var1[3];
                }
                Item var43 = Inventory.getFirst(item -> {
                    String[] stringArray = new String[var1[5]];
                    stringArray[A.var1[0]] = var2[var1[18]];
                    stringArray[A.var1[3]] = var2[var1[19]];
                    return item.hasAction(stringArray);
                });
                if (A.var5(var43)) {
                    var43 = Inventory.getFirst(item -> {
                        String[] stringArray = new String[var1[3]];
                        stringArray[A.var1[0]] = var2[var1[17]];
                        return item.hasAction(stringArray);
                    });
                }
                var43.interact(var2[var1[3]]);
                return var1[3];
            }
            if (A.var26(Combat.getMissingHealth(), var1[1]) && A.var23(Inventory.contains(item -> {
                String[] stringArray = new String[var1[3]];
                stringArray[A.var1[0]] = var2[var1[4]];
                return item.hasAction(stringArray);
            }) ? 1 : 0)) {
                Inventory.getFirst(item -> {
                    String[] stringArray = new String[var1[3]];
                    stringArray[A.var1[0]] = var2[var1[16]];
                    return item.hasAction(stringArray);
                }).interact(var2[var1[5]]);
                return var1[3];
            }
            if (A.var25(var38, var40)) {
                Inventory.getFirst(item -> {
                    String[] stringArray = new String[var1[5]];
                    stringArray[A.var1[0]] = var2[var1[14]];
                    stringArray[A.var1[3]] = var2[var1[15]];
                    return item.hasAction(stringArray);
                }).interact(var2[var1[6]]);
                return var1[3];
            }
            return var1[0];
        }
        if (A.var3(var38.getId(), var1[7]) && A.var4(var39.bb.contains(var38) ? 1 : 0)) {
            return var1[0];
        }
        var2_2.interact(var2[var1[8]]);
        return var1[3];
    }

    static {
        A.var30();
        A.var24();
    }

    private TileItem ak() {
        return TileItems.getAll().stream().filter(tileItem -> {
            Stream stream = y.aU.stream();
            String string = tileItem.getName();
            Objects.requireNonNull(string);
            0;
            return stream.anyMatch(string::contains);
        }).max(Comparator.comparingInt(tileItem -> Prices.getItemPrice((int)tileItem.getId()))).orElse(null);
    }
}

