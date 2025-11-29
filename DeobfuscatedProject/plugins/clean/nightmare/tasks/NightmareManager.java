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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
        if (h.lIIIllIlIlllIll(this.aQ() ? 1 : 0) && h.lIIIllIlIlllIll(this.aR() ? 1 : 0) && h.lIIIllIlIlllIll(this.aS() ? 1 : 0)) {
            n2 = lllIllIlllII[2];

            if (-1 >= (0xDD ^ 0xC7 ^ (0x28 ^ 0x36))) {
                return ((0x6F ^ 0x42 ^ (0xA3 ^ 0x84)) & (89 + 16 - 16 + 77 ^ 1 + 70 - -36 + 65 ^ -1)) != 0;
            }
        } else {
            n2 = lllIllIlllII[0];
        }
        return n2 != 0;
    }

    public TileItem aH() {
        return TileItems.getNearest(tileItem -> tileItem.hasInventoryAction(lllIllIllIlI[lllIllIlllII[42]]));
    }

    static {
        h.lIIIllIlIlllIlI();
        h.lIIIllIlIllIIlI();
        bw = LoggerFactory.getLogger(NightmareManager.class);
        bx = new NightmareManager();
    }

    private boolean aF() {
        SpellBook.Necromancy necromancy = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        return necromancy.canCast();
    }

    private static boolean lIIIllIlIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean aG() {
        void var2_2;
        int var1;
        Item var2;
        Item var3;
        TileItem var4;
        h var5;
        if (h.lIIIllIlIlllIll(this.by.assistantMode() ? 1 : 0)) {
            return lllIllIlllII[0];
        }
        int n2 = var5.aT();
        TileItem var6 = null;
        if (h.lIIIllIlIllllII(var5.aR() ? 1 : 0)) {
            var6 = var5.aI();

            }
        } else if (h.lIIIllIlIllllII(var5.aQ() ? 1 : 0)) {
            var6 = var5.aH();

            if (1 < 0) {
                return false;
            }
        } else if ((!h.lIIIllIlIllllII(var5.aF() ? 1 : 0) || h.lIIIllIlIllllIl(Skills.getBoostedLevel((Skill)Skill.PRAYER), var5.by.restorePrayerAt())) && h.lIIIllIlIllllII(Inventory.contains(item -> {
            int n2;
            if (!h.lIIIllIlIllllII(item.getName().contains(lllIllIllIlI[lllIllIlllII[50]]) ? 1 : 0) || h.lIIIllIlIlllIll(item.getName().contains(lllIllIllIlI[lllIllIlllII[51]]) ? 1 : 0)) {
                n2 = lllIllIlllII[2];

            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            var6 = var5.aJ();
        }
        if (h.lIIIllIlIlllllI(var6)) {
            var6 = TileItems.getAll(tileItem -> {
                int n2;
                if (h.lIIIllIlIllllll(tileItem.getName()) && h.lIIIllIlIlllIll(bx.containsKey(tileItem.getName()) ? 1 : 0)) {
                    n2 = lllIllIlllII[2];

                    if (2 <= 0) {
                        return ((0xD ^ 0x3C ^ (5 ^ 0x7E)) & (54 + 19 - -7 + 59 ^ 47 + 105 - 92 + 133 ^ -1)) != 0;
                    }
                } else {
                    n2 = lllIllIlllII[0];
                }
                return n2 != 0;
            }).stream().max(Comparator.comparingInt(tileItem -> bx.get(tileItem.getName()) * tileItem.getQuantity())).orElse(null);
        }
        if (h.lIIIllIlIllllll(var4 = var5.aK())) {
            var6 = var4;
        }
        if (h.lIIIllIlIlllllI(var6) && h.lIIIllIlIlllllI(var6 = (TileItem)TileItems.getAll(tileItem -> {
            boolean bl;
            if (h.lIIIllIllIIIIIl(tileItem.getId(), lllIllIlllII[49])) {
                bl = lllIllIlllII[2];

                if (3 > 3) {
                    return false;
                }
            } else {
                bl = lllIllIlllII[0];
            }
            return bl;
        }).stream().min(Comparator.comparingInt(tileItem -> tileItem.distanceTo((Locatable)Players.getLocal()))).orElse(null))) {
            return lllIllIlllII[0];
        }
        if (h.lIIIllIllIIIIII(var6, var4) && h.lIIIllIlIlllIll(Inventory.isFull() ? 1 : 0)) {
            var3 = Inventory.getFirst(item -> {
                int n2;
                String[] stringArray = new String[lllIllIlllII[1]];
                stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[46]];
                stringArray[h.lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[47]];
                if (h.lIIIllIlIlllIll(item.hasAction(stringArray) ? 1 : 0) && h.lIIIllIllIIIlII(item.getId(), lllIllIlllII[48])) {
                    n2 = lllIllIlllII[2];

                    if (3 == (110 + 154 - 128 + 20 ^ 14 + 32 - -89 + 17)) {
                        return ((61 + 96 - 125 + 126 ^ 110 + 135 - 112 + 58) & (0xF2 ^ 0xAA ^ (0xC8 ^ 0xB1) ^ -1)) != 0;
                    }
                } else {
                    n2 = lllIllIlllII[0];
                }
                return n2 != 0;
            });
            var2 = var5.aO().orElse(null);
            if (h.lIIIllIlIlllllI(var2)) {
                bw.debug(lllIllIllIlI[lllIllIlllII[0]]);
                if (h.lIIIllIlIllllll(var3)) {
                    String[] stringArray = new String[lllIllIlllII[1]];
                    stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[2]];
                    stringArray[h.lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[1]];
                    var3.interact(stringArray);
                    return lllIllIlllII[2];
                }
                return lllIllIlllII[0];
            }
            var1 = var5.a(var2, var6) ? 1 : 0;
            if (h.lIIIllIlIlllIll(var1)) {
                bw.info(lllIllIllIlI[lllIllIlllII[3]], (Object)var2.getName(), (Object)var6.getName());
                String[] stringArray = new String[lllIllIlllII[1]];
                stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[4]];
                stringArray[h.lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[5]];
                var2.interact(stringArray);
                return lllIllIlllII[2];
            }
        }
        if (!h.lIIIllIlIllllII(var6.isStackable() ? 1 : 0) || h.lIIIllIlIlllIll(var6.isNoted() ? 1 : 0)) {
            int[] nArray = new int[lllIllIlllII[2]];
            nArray[h.lllIllIlllII[0]] = var6.getId();
            if (h.lIIIllIlIlllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Object[] objectArray = new Object[lllIllIlllII[2]];
                objectArray[h.lllIllIlllII[0]] = var6.getName();
                Log.info((String)lllIllIllIlI[lllIllIlllII[6]], (Object[])objectArray);
                var6.interact(lllIllIllIlI[lllIllIlllII[7]]);
                return lllIllIlllII[2];
            }
        }
        if (h.lIIIllIlIlllIll(Inventory.isFull() ? 1 : 0)) {
            var3 = Inventory.getFirst(item -> {
                int n2;
                block3: {
                    block2: {
                        String[] stringArray = new String[lllIllIlllII[2]];
                        stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[43]];
                        if (!h.lIIIllIlIllllII(item.hasAction(stringArray) ? 1 : 0)) break block2;
                        String[] stringArray2 = new String[lllIllIlllII[2]];
                        stringArray2[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[44]];
                        if (!h.lIIIllIlIlllIll(item.hasAction(stringArray2) ? 1 : 0) || !h.lIIIllIlIlllIll(item.getName().toLowerCase().contains(lllIllIllIlI[lllIllIlllII[45]]) ? 1 : 0)) break block3;
                    }
                    n2 = lllIllIlllII[2];

                    if (1 <= 1) return n2 != 0;
                    return false;
                }
                n2 = lllIllIlllII[0];
                return n2 != 0;
            });
            var2 = var5.aO().orElse(null);
            if (h.lIIIllIlIlllllI(var2)) {
                if (h.lIIIllIlIlllIll(n2)) {
                    Object[] objectArray = new Object[lllIllIlllII[2]];
                    objectArray[h.lllIllIlllII[0]] = var6.getName();
                    Log.info((String)lllIllIllIlI[lllIllIlllII[8]], (Object[])objectArray);
                    return lllIllIlllII[0];
                }
                if (h.lIIIllIlIllllll(var3)) {
                    bw.info(lllIllIllIlI[lllIllIlllII[9]], (Object)var3.getName(), (Object)var6.getName());
                    String[] stringArray = new String[lllIllIlllII[1]];
                    stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[10]];
                    stringArray[h.lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[11]];
                    var3.interact(stringArray);
                    return lllIllIlllII[2];
                }
                return lllIllIlllII[0];
            }
            if (h.lIIIllIllIIIIIl(var2.getId(), var6.getId())) {
                bw.info(lllIllIllIlI[lllIllIlllII[12]], (Object)var2.getName(), (Object)var6.getName());
                return lllIllIlllII[0];
            }
            var1 = var5.a(var2, var6) ? 1 : 0;
            if (h.lIIIllIlIlllIll(var1)) {
                bw.info(lllIllIllIlI[lllIllIlllII[13]], (Object)var2.getName(), (Object)var6.getName());
                String[] stringArray = new String[lllIllIlllII[1]];
                stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[14]];
                stringArray[h.lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[15]];
                var2.interact(stringArray);
                return lllIllIlllII[2];
            }
            bw.info(lllIllIllIlI[lllIllIlllII[16]], (Object)var6.getName());
            return lllIllIlllII[0];
        }
        if (h.lIIIllIlIlllIll(var6.hasInventoryAction(lllIllIllIlI[lllIllIlllII[17]]) ? 1 : 0) && h.lIIIllIllIIIIlI(Inventory.getFreeSlots(), lllIllIlllII[2])) {
            bw.info(lllIllIllIlI[lllIllIlllII[18]], (Object)var6.getName());
            return lllIllIlllII[0];
        }
        Object[] objectArray = new Object[lllIllIlllII[2]];
        objectArray[h.lllIllIlllII[0]] = var2_2.getName();
        Log.info((String)lllIllIllIlI[lllIllIlllII[19]], (Object[])objectArray);
        var2_2.interact(lllIllIllIlI[lllIllIlllII[20]]);
        return lllIllIlllII[2];
    }

    private TileItem aK() {
        return TileItems.getNearest(tileItem -> {
            int n2;
            TileItem var7;
            if (h.lIIIllIlIlllllI(tileItem.getName())) {
                return lllIllIlllII[0];
            }
            String var8 = var7.getName().toLowerCase();
            if (!(h.lIIIllIlIllllII(var8.contains(lllIllIllIlI[lllIllIlllII[32]]) ? 1 : 0) && h.lIIIllIlIllllII(var8.contains(lllIllIllIlI[lllIllIlllII[33]]) ? 1 : 0) && h.lIIIllIlIllllII(var8.contains(lllIllIllIlI[lllIllIlllII[34]]) ? 1 : 0) && h.lIIIllIlIllllII(var8.contains(lllIllIllIlI[lllIllIlllII[35]]) ? 1 : 0) && h.lIIIllIlIllllII(var8.contains(lllIllIllIlI[lllIllIlllII[36]]) ? 1 : 0) && !h.lIIIllIlIlllIll(var8.contains(lllIllIllIlI[lllIllIlllII[37]]) ? 1 : 0))) {
                n2 = lllIllIlllII[2];

                if (3 > (0x27 ^ 0x47 ^ (0x78 ^ 0x1C))) {
                    return ((0x95 ^ 0x91 ^ (0xAC ^ 0x9A)) & (0xB4 ^ 0xC4 ^ (0xFD ^ 0xBF) ^ -1)) != 0;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        });
    }

    private static void lIIIllIlIllIIlI() {
        lllIllIllIlI = new String[lllIllIlllII[52]];
        h.lllIllIllIlI[h.lllIllIlllII[0]] = "Inventory is full and worstInv is null; we stuck fam?";
        h.lllIllIllIlI[h.lllIllIlllII[2]] = "Eat";
        h.lllIllIllIlI[h.lllIllIlllII[1]] = "Drop";
        h.lllIllIllIlI[h.lllIllIlllII[3]] = "Dropping worst inventory item: {} to make room for PRIORITY loot {}";
        h.lllIllIllIlI[h.lllIllIlllII[4]] = "Eat";
        h.lllIllIllIlI[h.lllIllIlllII[5]] = "Drop";
        h.lllIllIllIlI[h.lllIllIlllII[6]] = "Looting stacking or noted item that we already have! => {}";
        h.lllIllIllIlI[h.lllIllIlllII[7]] = "Take";
        h.lllIllIllIlI[h.lllIllIlllII[8]] = "Inventory is full and worstInv is null; and we have supplies for another kill; saving {} for later....";
        h.lllIllIllIlI[h.lllIllIlllII[9]] = "Inventory is full and worstInv is null; and no supplies for next kill... so we're eating or drinking {} to make room for {} ";
        h.lllIllIllIlI[h.lllIllIlllII[10]] = "Eat";
        h.lllIllIllIlI[h.lllIllIlllII[11]] = "Drop";
        h.lllIllIllIlI[h.lllIllIlllII[12]] = "Doing nothing since... Worst inventory item {} is the same as the loot item {}";
        h.lllIllIllIlI[h.lllIllIlllII[13]] = "Dropping worst inventory item: {} to make room for loot {}";
        h.lllIllIllIlI[h.lllIllIlllII[14]] = "Eat";
        h.lllIllIllIlI[h.lllIllIlllII[15]] = "Drop";
        h.lllIllIllIlI[h.lllIllIlllII[16]] = "Inventory is full and worstInv is not worse than loot; ignoring loot {}";
        h.lllIllIllIlI[h.lllIllIlllII[17]] = "Eat";
        h.lllIllIllIlI[h.lllIllIlllII[18]] = "Inventory is full almost full, so we're ignoring ignoring food {} since we would waste it anyways!";
        h.lllIllIllIlI[h.lllIllIlllII[19]] = "Looting {}";
        h.lllIllIllIlI[h.lllIllIlllII[20]] = "Take";
        h.lllIllIllIlI[h.lllIllIlllII[21]] = "[LootManager]: Nothing to loot, teleporting out!";
        h.lllIllIllIlI[h.lllIllIlllII[23]] = "combat potion";
        h.lllIllIllIlI[h.lllIllIlllII[24]] = "super strength";
        h.lllIllIllIlI[h.lllIllIlllII[25]] = "sanfew";
        h.lllIllIllIlI[h.lllIllIlllII[26]] = "balm";
        h.lllIllIllIlI[h.lllIllIlllII[27]] = "Eat";
        h.lllIllIllIlI[h.lllIllIlllII[28]] = "sleepwalker";
        h.lllIllIllIlI[h.lllIllIlllII[29]] = "husk";
        h.lllIllIllIlI[h.lllIllIlllII[30]] = "Coins";
        h.lllIllIllIlI[h.lllIllIlllII[32]] = "orb";
        h.lllIllIllIlI[h.lllIllIlllII[33]] = "tablet";
        h.lllIllIllIlI[h.lllIllIlllII[34]] = "egg";
        h.lllIllIllIlI[h.lllIllIlllII[35]] = "dreams";
        h.lllIllIllIlI[h.lllIllIlllII[36]] = "inquisitor";
        h.lllIllIllIlI[h.lllIllIlllII[37]] = "staff";
        h.lllIllIllIlI[h.lllIllIlllII[38]] = "Drink";
        h.lllIllIllIlI[h.lllIllIlllII[39]] = "sanfew";
        h.lllIllIllIlI[h.lllIllIlllII[40]] = "prayer";
        h.lllIllIllIlI[h.lllIllIlllII[41]] = "Drink";
        h.lllIllIllIlI[h.lllIllIlllII[22]] = "sanfew";
        h.lllIllIllIlI[h.lllIllIlllII[42]] = "Eat";
        h.lllIllIllIlI[h.lllIllIlllII[43]] = "Eat";
        h.lllIllIllIlI[h.lllIllIlllII[44]] = "Drink";
        h.lllIllIllIlI[h.lllIllIlllII[45]] = "balm";
        h.lllIllIllIlI[h.lllIllIlllII[46]] = "Eat";
        h.lllIllIllIlI[h.lllIllIlllII[47]] = "Empty";
        h.lllIllIllIlI[h.lllIllIlllII[50]] = "Sanfew";
        h.lllIllIllIlI[h.lllIllIlllII[51]] = "Prayer";
    }

    private boolean aS() {
        boolean bl;
        int n2 = Inventory.getAll(item -> {
            boolean bl;
            String string = item.getName().toLowerCase();
            if (!h.lIIIllIlIllllII(string.contains(lllIllIllIlI[lllIllIlllII[23]]) ? 1 : 0) || h.lIIIllIlIlllIll(string.contains(lllIllIllIlI[lllIllIlllII[24]]) ? 1 : 0)) {
                bl = lllIllIlllII[2];

                if (((0x24 ^ 0x31 ^ (0x5A ^ 0x7E)) & (167 + 41 - 202 + 237 ^ 116 + 44 - 38 + 72 ^ -1)) != 0) {
                    return false;
                }
            } else {
                bl = lllIllIlllII[0];
            }
            return bl;
        }).stream().map(item -> Character.valueOf(item.getName().charAt(item.getName().indexOf(lllIllIlllII[22]) + lllIllIlllII[2]))).mapToInt(Character::getNumericValue).sum();
        if (!h.lIIIllIlIllllII(n2) || h.lIIIllIlIlllIll(this.by.continueWithNoPots() ? 1 : 0)) {
            bl = lllIllIlllII[2];

            if (-1 > 2) {
                return false;
            }
        } else {
            bl = lllIllIlllII[0];
        }
        return bl;
    }

    public Optional<Item> aO() {
        return Inventory.getAll(item -> {
            int n2;
            if (h.lIIIllIlIllllll(item.getName()) && h.lIIIllIlIlllIll(bx.containsKey(item.getName()) ? 1 : 0)) {
                n2 = lllIllIlllII[2];

                if (2 == 0) {
                    return (2 & (2 ^ -1)) != 0;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        }).stream().filter(item -> {
            boolean bl;
            if (h.lIIIllIlIllllII(item.getName().equals(lllIllIllIlI[lllIllIlllII[30]]) ? 1 : 0)) {
                bl = lllIllIlllII[2];

                }
            } else {
                bl = lllIllIlllII[0];
            }
            return bl;
        }).min(Comparator.comparingInt(item -> bx.get(item.getName()) * item.getQuantity()));
    }

    public int a(TileItem tileItem) {
        return bx.getOrDefault(tileItem.getName(), lllIllIlllII[0]);
    }

    public TileItem aI() {
        return TileItems.getNearest(tileItem -> {
            int n2;
            if (h.lIIIllIlIlllIll(tileItem.hasInventoryAction(lllIllIllIlI[lllIllIlllII[41]]) ? 1 : 0) && h.lIIIllIlIlllIll(tileItem.getName().toLowerCase().contains(lllIllIllIlI[lllIllIlllII[22]]) ? 1 : 0)) {
                n2 = lllIllIlllII[2];

                if (2 > 3) {
                    return ((47 + 4 - -16 + 68 ^ 124 + 84 - 119 + 40) & (1 ^ (0x6D ^ 0x6A) ^ -1)) != 0;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        });
    }

    private boolean aR() {
        boolean bl;
        int n2 = Inventory.getAll(item -> {
            int n2;
            String string = item.getName().toLowerCase();
            if (!h.lIIIllIlIllllII(string.contains(lllIllIllIlI[lllIllIlllII[25]]) ? 1 : 0) || h.lIIIllIlIlllIll(string.contains(lllIllIllIlI[lllIllIlllII[26]]) ? 1 : 0)) {
                n2 = lllIllIlllII[2];

                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        }).stream().map(item -> Character.valueOf(item.getName().charAt(item.getName().indexOf(lllIllIlllII[22]) + lllIllIlllII[2]))).mapToInt(Character::getNumericValue).sum();
        if (h.lIIIllIllIIIIll(n2, this.by.teleportCleanse())) {
            bl = lllIllIlllII[2];

            if ((0x70 ^ 0x47 ^ (0x86 ^ 0xB5)) < 3) {
                return ((130 + 50 - 47 + 4 ^ 60 + 53 - 65 + 86) & (0x1D ^ 0x52 ^ (0x6D ^ 0x2D) ^ -1)) != 0;
            }
        } else {
            bl = lllIllIlllII[0];
        }
        return bl;
    }

    private static boolean lIIIllIlIlllllI(Object object) {
        return object == null;
    }

    @Inject
    public NightmareManager(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        this.by = squireNightmareConfig;
        this.bz = squireNightmarePlugin;
    }

    private static boolean lIIIllIlIllllII(int n2) {
        return n2 == 0;
    }

    public int b(TileItem tileItem) {
        return this.a(tileItem) * tileItem.getQuantity();
    }

    private static boolean lIIIllIllIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    public Optional<TileItem> aN() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (h.lIIIllIlIllllll(tileItem.getName()) && h.lIIIllIlIlllIll(bx.containsKey(tileItem.getName()) ? 1 : 0)) {
                n2 = lllIllIlllII[2];

                if (((0xD7 ^ 0xBE ^ (0x65 ^ 0x11)) & (0xCE ^ 0xA1 ^ (0xF7 ^ 0x85) ^ -1)) < 0) {
                    return ((0x3D ^ 0x35 ^ (0x7C ^ 0x3C)) & (0xA2 ^ 0x81 ^ (0x34 ^ 0x5F) ^ -1)) != 0;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        }).stream().filter(tileItem -> {
            int n2;
            if (h.lIIIllIlIlllIll(tileItem.isStackable() ? 1 : 0)) {
                int[] nArray = new int[lllIllIlllII[2]];
                nArray[h.lllIllIlllII[0]] = tileItem.getId();
                if (h.lIIIllIlIlllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    n2 = lllIllIlllII[2];

                    if (-(92 + 58 - 148 + 125 ^ (0xE9 ^ 0x92)) <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIllIlllII[0];
            return n2 != 0;
        }).max(Comparator.comparingInt(object -> ((TileItem)object).getQuantity() * bx.getOrDefault(((TileItem)object).getName(), lllIllIlllII[31])).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }

    private static boolean lIIIllIlIllllll(Object object) {
        return object != null;
    }

    private static boolean lIIIllIllIIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIllIllIIIlII(int n2, int n3) {
        return n2 != n3;
    }

        return String.valueOf(var9);
    }

    public TileItem aJ() {
        return TileItems.getNearest(tileItem -> {
            int n2;
            if (h.lIIIllIlIlllIll(tileItem.hasInventoryAction(lllIllIllIlI[lllIllIlllII[38]]) ? 1 : 0) && (!h.lIIIllIlIllllII(tileItem.getName().toLowerCase().contains(lllIllIllIlI[lllIllIlllII[39]]) ? 1 : 0) || h.lIIIllIlIlllIll(tileItem.getName().toLowerCase().contains(lllIllIllIlI[lllIllIlllII[40]]) ? 1 : 0))) {
                n2 = lllIllIlllII[2];

                if (2 == 1) {
                    return false;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        });
    }

    public boolean a(Item item, TileItem tileItem) {
        boolean bl;
        int n2;
        int n3 = bx.get(item.getName()) * item.getQuantity();
        if (h.lIIIllIlIllllIl(n3, n2 = bx.get(tileItem.getName()) * tileItem.getQuantity())) {
            bl = lllIllIlllII[2];

            }
        } else {
            bl = lllIllIlllII[0];
        }
        return bl;
    }

    private static boolean lIIIllIllIIIIII(Object object, Object object2) {
        return object == object2;
    }

    public boolean aP() {
        int n2 = this.aG() ? 1 : 0;
        if (h.lIIIllIlIllllII(n2)) {
            bw.info(lllIllIllIlI[lllIllIlllII[21]]);
            return this.bz.m();
        }
        return lllIllIlllII[2];
    }

    private static boolean lIIIllIllIIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private TileItem aL() {
        TileItem tileItem = this.aM().orElse(null);
        if (h.lIIIllIlIlllIll(Inventory.isFull() ? 1 : 0)) {
            return this.aN().orElse(null);
        }
        return tileItem;
    }

    public Optional<TileItem> aM() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (h.lIIIllIlIllllll(tileItem.getName()) && h.lIIIllIlIlllIll(bx.containsKey(tileItem.getName()) ? 1 : 0)) {
                n2 = lllIllIlllII[2];

                if (1 < 0) {
                    return false;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        }).stream().max(Comparator.comparingInt(object -> ((TileItem)object).getQuantity() * bx.getOrDefault(((TileItem)object).getName(), lllIllIlllII[31])).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }

    private static boolean lIIIllIlIlllIll(int n2) {
        return n2 != 0;
    }

    private boolean aQ() {
        boolean bl;
        int n2 = Inventory.getCount((boolean)lllIllIlllII[2], item -> {
            String[] stringArray = new String[lllIllIlllII[2]];
            stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[27]];
            return item.hasAction(stringArray);
        });
        if (h.lIIIllIllIIIIll(n2, this.by.minimumFood())) {
            bl = lllIllIlllII[2];

            if (1 <= 0) {
                return false;
            }
        } else {
            bl = lllIllIlllII[0];
        }
        return bl;
    }

    public boolean c(TileItem tileItem) {
        int n2;
        h var10;
        int n3;
        int var11;
        int n4;
        if (h.lIIIllIlIllllll(NPCs.getNearest(nPC -> {
            int n2;
            if (h.lIIIllIlIlllIll(nPC.getName().equalsIgnoreCase(lllIllIllIlI[lllIllIlllII[29]]) ? 1 : 0) && h.lIIIllIlIllllII(nPC.isDead() ? 1 : 0)) {
                n2 = lllIllIlllII[2];

                if (-1 == 2) {
                    return false;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        }))) {
            n4 = lllIllIlllII[2];

            if ((119 + 96 - 129 + 103 ^ 37 + 64 - 21 + 105) != (0x59 ^ 0x7A ^ (0xB8 ^ 0x9F))) {
                return ((0x64 ^ 0x27 ^ (0x30 ^ 0x69)) & (120 + 106 - 212 + 128 ^ 120 + 125 - 239 + 142 ^ -1)) != 0;
            }
        } else {
            n4 = var11 = lllIllIlllII[0];
        }
        if (h.lIIIllIlIllllll(NPCs.getNearest(nPC -> {
            int n2;
            if (h.lIIIllIlIlllIll(nPC.getName().equalsIgnoreCase(lllIllIllIlI[lllIllIlllII[28]]) ? 1 : 0) && h.lIIIllIlIllllII(nPC.isDead() ? 1 : 0)) {
                n2 = lllIllIlllII[2];

                if (-(0xC5 ^ 0xC0) >= 0) {
                    return false;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        }))) {
            n3 = lllIllIlllII[2];

            if (-1 > ((0x5E ^ 3) & ~(0x62 ^ 0x3F))) {
                return false;
            }
        } else {
            n3 = lllIllIlllII[0];
        }
        int var12 = n3;
        NPC var13 = SquireNightmarePlugin.d();
        int n5 = e.ax().isEmpty();
        if (h.lIIIllIlIllllII(var11) && h.lIIIllIlIllllII(var12) && h.lIIIllIlIlllllI(var10.bz.aj()) && h.lIIIllIlIllllII(var10.bz.ap()) && h.lIIIllIlIlllIll(n5)) {
            n2 = lllIllIlllII[2];

            if (((0x86 ^ 0xB8 ^ (0x76 ^ 0x61)) & (0x5A ^ 0x15 ^ (0x4D ^ 0x2B) ^ -1)) != 0) {
                return ((0x41 ^ 5 ^ (0xA6 ^ 0x83)) & (106 + 65 - 51 + 119 ^ 117 + 118 - 110 + 17 ^ -1)) != 0;
            }
        } else {
            n2 = lllIllIlllII[0];
        }
        return n2 != 0;
    }
}

