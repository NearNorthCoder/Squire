/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.SpellBook$Necromancy
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.SpellBook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@Singleton
public class NightmareManager {
    private final  SquireNightmareConfig by;
    private static final  HashMap<String, Integer> bx;
    private final  SquireNightmarePlugin bz;
    
    private static final  Logger bw;

    private boolean aT() {
        int n2;
        if (h.var3(this.aQ() ? 1 : 0) && h.var3(this.aR() ? 1 : 0) && h.var3(this.aS() ? 1 : 0)) {
            n2 = var2[2];
            0;
            if (-1 >= (0xDD ^ 0xC7 ^ (0x28 ^ 0x36))) {
                return ((0x6F ^ 0x42 ^ (0xA3 ^ 0x84)) & (89 + 16 - 16 + 77 ^ 1 + 70 - -36 + 65 ^ -1)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        return n2 != 0;
    }

    public TileItem aH() {
        return TileItems.getNearest(tileItem -> tileItem.hasInventoryAction(var1[var2[42]]));
    }

    static {
        h.var4();
        h.var5();
        bw = LoggerFactory.getLogger(NightmareManager.class);
        bx = new NightmareManager();
    }

    private boolean aF() {
        SpellBook.Necromancy necromancy = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        return necromancy.canCast();
    }

    private static void var4() {
        var2 = new int[53];
        h.var2[0] = (34 + 138 - 159 + 159 ^ 84 + 64 - 126 + 128) & (0xA7 ^ 0xBD ^ (0xE0 ^ 0xC0) ^ -1);
        h.var2[1] = 2;
        h.var2[2] = 1;
        h.var2[3] = 3;
        h.var2[4] = 0x7E ^ 0x7A;
        h.var2[5] = 0x91 ^ 0xAE ^ (0x6E ^ 0x54);
        h.var2[6] = 0x34 ^ 0x16 ^ (0x36 ^ 0x12);
        h.var2[7] = 0x20 ^ 0x27;
        h.var2[8] = 0x4E ^ 0x75 ^ (0xA7 ^ 0x94);
        h.var2[9] = 0x1D ^ 0x42 ^ (0xD7 ^ 0x81);
        h.var2[10] = 0x20 ^ 0x65 ^ (0xF2 ^ 0xBD);
        h.var2[11] = 0xBA ^ 0xB1;
        h.var2[12] = 0x26 ^ 0x5E ^ (0xF0 ^ 0x84);
        h.var2[13] = 0x33 ^ 0x55 ^ (0x67 ^ 0xC);
        h.var2[14] = 0x9F ^ 0x91;
        h.var2[15] = 0xA1 ^ 0xAE;
        h.var2[16] = 0x4B ^ 0x5B;
        h.var2[17] = 0x36 ^ 0x27;
        h.var2[18] = 0x60 ^ 0x72;
        h.var2[19] = 0xAF ^ 0x96 ^ (0 ^ 0x2A);
        h.var2[20] = 0x12 ^ 6;
        h.var2[21] = 47 + 39 - -66 + 63 ^ 129 + 143 - 122 + 44;
        h.var2[22] = 0x4E ^ 0x66;
        h.var2[23] = 91 + 40 - 100 + 106 ^ 106 + 79 - 53 + 27;
        h.var2[24] = 0x60 ^ 0x77;
        h.var2[25] = 0x4B ^ 0x53;
        h.var2[26] = 110 + 160 - 148 + 54 ^ 42 + 98 - -27 + 2;
        h.var2[27] = 202 + 137 - 269 + 148 ^ 46 + 24 - 58 + 180;
        h.var2[28] = 0x2A ^ 0x43 ^ (0x7C ^ 0xE);
        h.var2[29] = 40 + 75 - 33 + 107 ^ 78 + 101 - 163 + 145;
        h.var2[30] = 0xB2 ^ 0xAC ^ 3;
        h.var2[31] = -1;
        h.var2[32] = 138 + 49 - 145 + 137 ^ 84 + 99 - 179 + 169;
        h.var2[33] = 0x25 ^ 0x3A;
        h.var2[34] = 0x8A ^ 0xAA;
        h.var2[35] = 0x31 ^ 0x10;
        h.var2[36] = 0x1C ^ 0x12 ^ (0x1F ^ 0x33);
        h.var2[37] = 0xB2 ^ 0x91;
        h.var2[38] = 0x89 ^ 0xAD;
        h.var2[39] = 141 + 101 - 131 + 31 ^ 28 + 129 - 86 + 100;
        h.var2[40] = 118 + 55 - 99 + 90 ^ 16 + 83 - 6 + 37;
        h.var2[41] = 0x16 ^ 0x1F ^ (0x81 ^ 0xAF);
        h.var2[42] = 0xEF ^ 0x94 ^ (0 ^ 0x52);
        h.var2[43] = 0x5A ^ 0x70;
        h.var2[44] = 0xCB ^ 0x9B ^ (0xD2 ^ 0xA9);
        h.var2[45] = 131 + 48 - 71 + 39 ^ 86 + 63 - 75 + 117;
        h.var2[46] = 5 ^ 0x26 ^ (0xA9 ^ 0xA7);
        h.var2[47] = 0xE0 ^ 0x8D ^ (0xC6 ^ 0x85);
        h.var2[48] = 0xFFFFF99F & 0x16FB;
        h.var2[49] = 0xFFFFD3F7 & 0x2FEB;
        h.var2[50] = 0x15 ^ 0x3A;
        h.var2[51] = 0x8F ^ 0xBF;
        h.var2[52] = 0x1A ^ 0x2B;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean aG() {
        void var2_2;
        int var7;
        Item var8;
        Item var9;
        TileItem var10;
        h var11;
        if (h.var3(this.by.assistantMode() ? 1 : 0)) {
            return var2[0];
        }
        int n2 = var11.aT();
        TileItem var12 = null;
        if (h.var13(var11.aR() ? 1 : 0)) {
            var12 = var11.aI();
            0;
            if null != null {
                return (2 & (2 ^ -1)) != 0;
            }
        } else if (h.var13(var11.aQ() ? 1 : 0)) {
            var12 = var11.aH();
            0;
            if (1 < 0) {
                return ((0xAA ^ 0xBE) & ~(0x64 ^ 0x70)) != 0;
            }
        } else if ((!h.var13(var11.aF() ? 1 : 0) || h.var6(Skills.getBoostedLevel((SkiSkill.PRAYER), var11.by.restorePrayerAt())) && h.var13(Inventory.contains(item -> {
            int n2;
            if (!h.var13(item.getName().contains(var1[var2[50]]) ? 1 : 0) || h.var3(item.getName().contains(var1[var2[51]]) ? 1 : 0)) {
                n2 = var2[2];
                0;
                if (-1 > 0) {
                    return ((0x87 ^ 0x96) & ~(0xD4 ^ 0xC5)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            var12 = var11.aJ();
        }
        if (h.var14(var12)) {
            var12 = TileItems.getAll(tileItem -> {
                int n2;
                if (h.var15(tileItem.getName()) && h.var3(bx.containsKey(tileItem.getName()) ? 1 : 0)) {
                    n2 = var2[2];
                    0;
                    if (2 <= 0) {
                        return ((0xD ^ 0x3C ^ (5 ^ 0x7E)) & (54 + 19 - -7 + 59 ^ 47 + 105 - 92 + 133 ^ -1)) != 0;
                    }
                } else {
                    n2 = var2[0];
                }
                return n2 != 0;
            }).stream().max(Comparator.comparingInt(tileItem -> bx.get(tileItem.getName()) * tileItem.getQuantity())).orElse(null);
        }
        if (h.var15(var10 = var11.aK())) {
            var12 = var10;
        }
        if (h.var14(var12) && h.var14(var12 = (TileItem)TileItems.getAll(tileItem -> {
            boolean bl;
            if (h.var16(tileItem.getId(), var2[49])) {
                bl = var2[2];
                0;
                if (3 > 3) {
                    return ((9 ^ 0x52) & ~(0x7D ^ 0x26)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        }).stream().min(Comparator.comparingInt(tileItem -> tileItem.distanceTo((Locatable)Players.getLocal()))).orElse(null))) {
            return var2[0];
        }
        if (h.var17(var12, var10) && h.var3(Inventory.isFull() ? 1 : 0)) {
            var9 = Inventory.getFirst(item -> {
                int n2;
                String[] stringArray = new String[var2[1]];
                stringArray[h.var2[0]] = var1[var2[46]];
                stringArray[h.var2[2]] = var1[var2[47]];
                if (h.var3(item.hasAction(stringArray) ? 1 : 0) && h.var18(item.getId(), var2[48])) {
                    n2 = var2[2];
                    0;
                    if (3 == (110 + 154 - 128 + 20 ^ 14 + 32 - -89 + 17)) {
                        return ((61 + 96 - 125 + 126 ^ 110 + 135 - 112 + 58) & (0xF2 ^ 0xAA ^ (0xC8 ^ 0xB1) ^ -1)) != 0;
                    }
                } else {
                    n2 = var2[0];
                }
                return n2 != 0;
            });
            var8 = var11.aO().orElse(null);
            if (h.var14(var8)) {
                bw.debug(var1[var2[0]]);
                if (h.var15(var9)) {
                    String[] stringArray = new String[var2[1]];
                    stringArray[h.var2[0]] = var1[var2[2]];
                    stringArray[h.var2[2]] = var1[var2[1]];
                    var9.interact(stringArray);
                    return var2[2];
                }
                return var2[0];
            }
            var7 = var11.a(var8, var12) ? 1 : 0;
            if (h.var3(var7)) {
                bw.info(var1[var2[3]], (Object)var8.getName(), (Object)var12.getName());
                String[] stringArray = new String[var2[1]];
                stringArray[h.var2[0]] = var1[var2[4]];
                stringArray[h.var2[2]] = var1[var2[5]];
                var8.interact(stringArray);
                return var2[2];
            }
        }
        if (!h.var13(var12.isStackable() ? 1 : 0) || h.var3(var12.isNoted() ? 1 : 0)) {
            int[] nArray = new int[var2[2]];
            nArray[h.var2[0]] = var12.getId();
            if (h.var3(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Object[] objectArray = new Object[var2[2]];
                objectArray[h.var2[0]] = var12.getName();
                Log.info((String)var1[var2[6]], (Object[])objectArray);
                var12.interact(var1[var2[7]]);
                return var2[2];
            }
        }
        if (h.var3(Inventory.isFull() ? 1 : 0)) {
            var9 = Inventory.getFirst(item -> {
                int n2;
                block3: {
                    block2: {
                        String[] stringArray = new String[var2[2]];
                        stringArray[h.var2[0]] = var1[var2[43]];
                        if (!h.var13(item.hasAction(stringArray) ? 1 : 0)) break block2;
                        String[] stringArray2 = new String[var2[2]];
                        stringArray2[h.var2[0]] = var1[var2[44]];
                        if (!h.var3(item.hasAction(stringArray2) ? 1 : 0) || !h.var3(item.getName().toLowerCase().contains(var1[var2[45]]) ? 1 : 0)) break block3;
                    }
                    n2 = var2[2];
                    0;
                    if (1 <= 1) return n2 != 0;
                    return ((0x6D ^ 0x5B) & ~(0x5E ^ 0x68)) != 0;
                }
                n2 = var2[0];
                return n2 != 0;
            });
            var8 = var11.aO().orElse(null);
            if (h.var14(var8)) {
                if (h.var3(n2)) {
                    Object[] objectArray = new Object[var2[2]];
                    objectArray[h.var2[0]] = var12.getName();
                    Log.info((String)var1[var2[8]], (Object[])objectArray);
                    return var2[0];
                }
                if (h.var15(var9)) {
                    bw.info(var1[var2[9]], (Object)var9.getName(), (Object)var12.getName());
                    String[] stringArray = new String[var2[1]];
                    stringArray[h.var2[0]] = var1[var2[10]];
                    stringArray[h.var2[2]] = var1[var2[11]];
                    var9.interact(stringArray);
                    return var2[2];
                }
                return var2[0];
            }
            if (h.var16(var8.getId(), var12.getId())) {
                bw.info(var1[var2[12]], (Object)var8.getName(), (Object)var12.getName());
                return var2[0];
            }
            var7 = var11.a(var8, var12) ? 1 : 0;
            if (h.var3(var7)) {
                bw.info(var1[var2[13]], (Object)var8.getName(), (Object)var12.getName());
                String[] stringArray = new String[var2[1]];
                stringArray[h.var2[0]] = var1[var2[14]];
                stringArray[h.var2[2]] = var1[var2[15]];
                var8.interact(stringArray);
                return var2[2];
            }
            bw.info(var1[var2[16]], (Object)var12.getName());
            return var2[0];
        }
        if (h.var3(var12.hasInventoryAction(var1[var2[17]]) ? 1 : 0) && h.var19(Inventory.getFreeSlots(), var2[2])) {
            bw.info(var1[var2[18]], (Object)var12.getName());
            return var2[0];
        }
        Object[] objectArray = new Object[var2[2]];
        objectArray[h.var2[0]] = var2_2.getName();
        Log.info((String)var1[var2[19]], (Object[])objectArray);
        var2_2.interact(var1[var2[20]]);
        return var2[2];
    }

    private TileItem aK() {
        return TileItems.getNearest(tileItem -> {
            int n2;
            TileItem var20;
            if (h.var14(tileItem.getName())) {
                return var2[0];
            }
            String var21 = var20.getName().toLowerCase();
            if (!(h.var13(var21.contains(var1[var2[32]]) ? 1 : 0) && h.var13(var21.contains(var1[var2[33]]) ? 1 : 0) && h.var13(var21.contains(var1[var2[34]]) ? 1 : 0) && h.var13(var21.contains(var1[var2[35]]) ? 1 : 0) && h.var13(var21.contains(var1[var2[36]]) ? 1 : 0) && !h.var3(var21.contains(var1[var2[37]]) ? 1 : 0))) {
                n2 = var2[2];
                0;
                if (3 > (0x27 ^ 0x47 ^ (0x78 ^ 0x1C))) {
                    return ((0x95 ^ 0x91 ^ (0xAC ^ 0x9A)) & (0xB4 ^ 0xC4 ^ (0xFD ^ 0xBF) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
    }

    private static void var5() {
        var1 = new String[var2[52]];
        h.var1[h.var2[0]] = "Inventory is full and worstInv is null; we stuck fam?";
        h.var1[h.var2[2]] = "Eat";
        h.var1[h.var2[1]] = "Drop";
        h.var1[h.var2[3]] = "Dropping worst inventory item: {} to make room for PRIORITY loot {}";
        h.var1[h.var2[4]] = "Eat";
        h.var1[h.var2[5]] = "Drop";
        h.var1[h.var2[6]] = "Looting stacking or noted item that we already have! => {}";
        h.var1[h.var2[7]] = "Take";
        h.var1[h.var2[8]] = "Inventory is full and worstInv is null; and we have supplies for another kill; saving {} for later....";
        h.var1[h.var2[9]] = "Inventory is full and worstInv is null; and no supplies for next kill... so we're eating or drinking {} to make room for {} ";
        h.var1[h.var2[10]] = "Eat";
        h.var1[h.var2[11]] = "Drop";
        h.var1[h.var2[12]] = "Doing nothing since... Worst inventory item {} is the same as the loot item {}";
        h.var1[h.var2[13]] = "Dropping worst inventory item: {} to make room for loot {}";
        h.var1[h.var2[14]] = "Eat";
        h.var1[h.var2[15]] = "Drop";
        h.var1[h.var2[16]] = "Inventory is full and worstInv is not worse than loot; ignoring loot {}";
        h.var1[h.var2[17]] = "Eat";
        h.var1[h.var2[18]] = "Inventory is full almost full, so we're ignoring ignoring food {} since we would waste it anyways!";
        h.var1[h.var2[19]] = "Looting {}";
        h.var1[h.var2[20]] = "Take";
        h.var1[h.var2[21]] = "[LootManager]: Nothing to loot, teleporting out!";
        h.var1[h.var2[23]] = "combat potion";
        h.var1[h.var2[24]] = "super strength";
        h.var1[h.var2[25]] = "sanfew";
        h.var1[h.var2[26]] = "balm";
        h.var1[h.var2[27]] = "Eat";
        h.var1[h.var2[28]] = "sleepwalker";
        h.var1[h.var2[29]] = "husk";
        h.var1[h.var2[30]] = "Coins";
        h.var1[h.var2[32]] = "orb";
        h.var1[h.var2[33]] = "tablet";
        h.var1[h.var2[34]] = "egg";
        h.var1[h.var2[35]] = "dreams";
        h.var1[h.var2[36]] = "inquisitor";
        h.var1[h.var2[37]] = "staff";
        h.var1[h.var2[38]] = "Drink";
        h.var1[h.var2[39]] = "sanfew";
        h.var1[h.var2[40]] = "prayer";
        h.var1[h.var2[41]] = "Drink";
        h.var1[h.var2[22]] = "sanfew";
        h.var1[h.var2[42]] = "Eat";
        h.var1[h.var2[43]] = "Eat";
        h.var1[h.var2[44]] = "Drink";
        h.var1[h.var2[45]] = "balm";
        h.var1[h.var2[46]] = "Eat";
        h.var1[h.var2[47]] = "Empty";
        h.var1[h.var2[50]] = "Sanfew";
        h.var1[h.var2[51]] = "Prayer";
    }

    private boolean aS() {
        boolean bl;
        int n2 = Inventory.getAll(item -> {
            boolean bl;
            String string = item.getName().toLowerCase();
            if (!h.var13(string.contains(var1[var2[23]]) ? 1 : 0) || h.var3(string.contains(var1[var2[24]]) ? 1 : 0)) {
                bl = var2[2];
                0;
                if (((0x24 ^ 0x31 ^ (0x5A ^ 0x7E)) & (167 + 41 - 202 + 237 ^ 116 + 44 - 38 + 72 ^ -1)) != 0) {
                    return ((25 + 160 - 101 + 121 ^ 77 + 75 - 149 + 155) & (23 + 74 - -59 + 43 ^ 133 + 7 - 4 + 12 ^ -1)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        }).stream().map(item -> Character.valueOf(item.getName().charAt(item.getName().indexOf(var2[22]) + var2[2]))).mapToInt(Character::getNumericValue).sum();
        if (!h.var13(n2) || h.var3(this.by.continueWithNoPots() ? 1 : 0)) {
            bl = var2[2];
            0;
            if (-1 > 2) {
                return ((0x7E ^ 0x4C) & ~(0x44 ^ 0x76)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    public Optional<Item> aO() {
        return Inventory.getAll(item -> {
            int n2;
            if (h.var15(item.getName()) && h.var3(bx.containsKey(item.getName()) ? 1 : 0)) {
                n2 = var2[2];
                0;
                
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }).stream().filter(item -> {
            boolean bl;
            if (h.var13(item.getName().equals(var1[var2[30]]) ? 1 : 0)) {
                bl = var2[2];
                0;
                if null != null {
                    return ((6 ^ 0x2D ^ (8 ^ 0x74)) & (115 + 204 - 159 + 57 ^ 123 + 129 - 110 + 0 ^ -1)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        }).min(Comparator.comparingInt(item -> bx.get(item.getName()) * item.getQuantity()));
    }

    public int a(TileItem tileItem) {
        return bx.getOrDefault(tileItem.getName(), var2[0]);
    }

    public TileItem aI() {
        return TileItems.getNearest(tileItem -> {
            int n2;
            if (h.var3(tileItem.hasInventoryAction(var1[var2[41]]) ? 1 : 0) && h.var3(tileItem.getName().toLowerCase().contains(var1[var2[22]]) ? 1 : 0)) {
                n2 = var2[2];
                0;
                if (2 > 3) {
                    return ((47 + 4 - -16 + 68 ^ 124 + 84 - 119 + 40) & (1 ^ (0x6D ^ 0x6A) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
    }

    private boolean aR() {
        boolean bl;
        int n2 = Inventory.getAll(item -> {
            int n2;
            String string = item.getName().toLowerCase();
            if (!h.var13(string.contains(var1[var2[25]]) ? 1 : 0) || h.var3(string.contains(var1[var2[26]]) ? 1 : 0)) {
                n2 = var2[2];
                0;
                if null != null {
                    return ((84 + 22 - 67 + 122 ^ 16 + 22 - 5 + 139) & (0x81 ^ 0xA7 ^ (0xAB ^ 0x80) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }).stream().map(item -> Character.valueOf(item.getName().charAt(item.getName().indexOf(var2[22]) + var2[2]))).mapToInt(Character::getNumericValue).sum();
        if (h.var22(n2, this.by.teleportCleanse())) {
            bl = var2[2];
            0;
            if ((0x70 ^ 0x47 ^ (0x86 ^ 0xB5)) < 3) {
                return ((130 + 50 - 47 + 4 ^ 60 + 53 - 65 + 86) & (0x1D ^ 0x52 ^ (0x6D ^ 0x2D) ^ -1)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    private static boolean var14(Object object) {
        return object == null;
    }

    @Inject
    public NightmareManager(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        this.by = squireNightmareConfig;
        this.bz = squireNightmarePlugin;
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }

    public int b(TileItem tileItem) {
        return this.a(tileItem) * tileItem.getQuantity();
    }

    private static boolean var22(int n2, int n3) {
        return n2 >= n3;
    }

    public Optional<TileItem> aN() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (h.var15(tileItem.getName()) && h.var3(bx.containsKey(tileItem.getName()) ? 1 : 0)) {
                n2 = var2[2];
                0;
                if (((0xD7 ^ 0xBE ^ (0x65 ^ 0x11)) & (0xCE ^ 0xA1 ^ (0xF7 ^ 0x85) ^ -1)) < 0) {
                    return ((0x3D ^ 0x35 ^ (0x7C ^ 0x3C)) & (0xA2 ^ 0x81 ^ (0x34 ^ 0x5F) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }).stream().filter(tileItem -> {
            int n2;
            if (h.var3(tileItem.isStackable() ? 1 : 0)) {
                int[] nArray = new int[var2[2]];
                nArray[h.var2[0]] = tileItem.getId();
                if (h.var3(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    n2 = var2[2];
                    0;
                    if (-(92 + 58 - 148 + 125 ^ (0xE9 ^ 0x92)) <= 0) return n2 != 0;
                    return ((127 + 84 - 87 + 51 ^ 58 + 109 - 11 + 31) & (2 + 38 - -36 + 88 ^ 150 + 3 - -10 + 13 ^ -1)) != 0;
                }
            }
            n2 = var2[0];
            return n2 != 0;
        }).max(Comparator.comparingInt(object -> ((TileItem)object).getQuantity() * bx.getOrDefault(((TileItem)object).getName(), var2[31])).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static boolean var15(Object object) {
        return object != null;
    }

    private static boolean var16(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var18(int n2, int n3) {
        return n2 != n3;
    }

    private static String var29(String var30, String var31) {
        var30 = new String(Base64.getDecoder().decode(var30.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var32 = new StringBuilder();
        char[] var33 = var31.toCharArray();
        int var34 = var2[0];
        char[] var35 = var30.toCharArray();
        int var36 = var35.length;
        int var37 = var2[0];
        while (h.var6(var37, var36)) {
            char var38 = var35[var37];
            var32.append((char)(var38 ^ var33[var34 % var33.length]));
            0;
            ++var34;
            ++var37;
            0;
            if ((0x2D ^ 0x28) != 0) continue;
            return null;
        }
        return String.valueOf(var32);
    }

    public TileItem aJ() {
        return TileItems.getNearest(tileItem -> {
            int n2;
            if (h.var3(tileItem.hasInventoryAction(var1[var2[38]]) ? 1 : 0) && (!h.var13(tileItem.getName().toLowerCase().contains(var1[var2[39]]) ? 1 : 0) || h.var3(tileItem.getName().toLowerCase().contains(var1[var2[40]]) ? 1 : 0))) {
                n2 = var2[2];
                0;
                if (2 == 1) {
                    return ((4 + 9 - -123 + 34 ^ 128 + 95 - 221 + 128) & (59 + 45 - -13 + 15 ^ 35 + 71 - 91 + 157 ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
    }

    public boolean a(Item item, TileItem tileItem) {
        boolean bl;
        int n2;
        int n3 = bx.get(item.getName()) * item.getQuantity();
        if (h.var6(n3, n2 = bx.get(tileItem.getName()) * tileItem.getQuantity())) {
            bl = var2[2];
            0;
            if null != null {
                return ((27 + 96 - 22 + 32 ^ 118 + 69 - 52 + 22) & (0x73 ^ 0xF ^ (0x11 ^ 0x75) ^ -1) & ((141 + 116 - 245 + 212 ^ 117 + 91 - 96 + 83) & (0xEC ^ 0xA7 ^ (0xE3 ^ 0x8B) ^ -1) ^ -1)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    private static boolean var17(Object object, Object object2) {
        return object == object2;
    }

    public boolean aP() {
        int n2 = this.aG() ? 1 : 0;
        if (h.var13(n2)) {
            bw.info(var1[var2[21]]);
            return this.bz.m();
        }
        return var2[2];
    }

        catch (Exception var44) {
            var44.printStackTrace();
            return null;
        }
    }

    private static boolean var19(int n2, int n3) {
        return n2 <= n3;
    }

    private TileItem aL() {
        TileItem tileItem = this.aM().orElse(null);
        if (h.var3(Inventory.isFull() ? 1 : 0)) {
            return this.aN().orElse(null);
        }
        return tileItem;
    }

    public Optional<TileItem> aM() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (h.var15(tileItem.getName()) && h.var3(bx.containsKey(tileItem.getName()) ? 1 : 0)) {
                n2 = var2[2];
                0;
                if (1 < 0) {
                    return ((0xA1 ^ 0xAD) & ~(0x7A ^ 0x76)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }).stream().max(Comparator.comparingInt(object -> ((TileItem)object).getQuantity() * bx.getOrDefault(((TileItem)object).getName(), var2[31])).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private boolean aQ() {
        boolean bl;
        int n2 = Inventory.getCount((boolean)var2[2], item -> {
            String[] stringArray = new String[var2[2]];
            stringArray[h.var2[0]] = var1[var2[27]];
            return item.hasAction(stringArray);
        });
        if (h.var22(n2, this.by.minimumFood())) {
            bl = var2[2];
            0;
            if (1 <= 0) {
                return ((0x4C ^ 0x1D) & ~(0xCC ^ 0x9D)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    public boolean c(TileItem tileItem) {
        int n2;
        h var45;
        int n3;
        int var46;
        int n4;
        if (h.var15(NPCs.getNearest(nPC -> {
            int n2;
            if (h.var3(nPC.getName().equalsIgnoreCase(var1[var2[29]]) ? 1 : 0) && h.var13(nPC.isDead() ? 1 : 0)) {
                n2 = var2[2];
                0;
                if (-1 == 2) {
                    return ((95 + 125 - 93 + 2 ^ 129 + 140 - 186 + 67) & (22 + 10 - -36 + 65 ^ 119 + 24 - 102 + 105 ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }))) {
            n4 = var2[2];
            0;
            if ((119 + 96 - 129 + 103 ^ 37 + 64 - 21 + 105) != (0x59 ^ 0x7A ^ (0xB8 ^ 0x9F))) {
                return ((0x64 ^ 0x27 ^ (0x30 ^ 0x69)) & (120 + 106 - 212 + 128 ^ 120 + 125 - 239 + 142 ^ -1)) != 0;
            }
        } else {
            n4 = var46 = var2[0];
        }
        if (h.var15(NPCs.getNearest(nPC -> {
            int n2;
            if (h.var3(nPC.getName().equalsIgnoreCase(var1[var2[28]]) ? 1 : 0) && h.var13(nPC.isDead() ? 1 : 0)) {
                n2 = var2[2];
                0;
                if (-(0xC5 ^ 0xC0) >= 0) {
                    return ((4 ^ 0x3C) & ~(0x49 ^ 0x71)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }))) {
            n3 = var2[2];
            0;
            if (-1 > ((0x5E ^ 3) & ~(0x62 ^ 0x3F))) {
                return ((0xD7 ^ 0x8B) & ~(0xD7 ^ 0x8B)) != 0;
            }
        } else {
            n3 = var2[0];
        }
        int var47 = n3;
        NPC var48 = SquireNightmarePlugin.d();
        int n5 = e.ax().isEmpty();
        if (h.var13(var46) && h.var13(var47) && h.var14(var45.bz.aj()) && h.var13(var45.bz.ap()) && h.var3(n5)) {
            n2 = var2[2];
            0;
            if (((0x86 ^ 0xB8 ^ (0x76 ^ 0x61)) & (0x5A ^ 0x15 ^ (0x4D ^ 0x2B) ^ -1)) != 0) {
                return ((0x41 ^ 5 ^ (0xA6 ^ 0x83)) & (106 + 65 - 51 + 119 ^ 117 + 118 - 110 + 17 ^ -1)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        return n2 != 0;
    }
}

