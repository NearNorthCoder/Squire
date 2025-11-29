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
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.i;

@Singleton
public class h {
    private final /* synthetic */ SquireNightmareConfig by;
    private static final /* synthetic */ HashMap<String, Integer> bx;
    private final /* synthetic */ SquireNightmarePlugin bz;
    private static /* synthetic */ String[] lllIllIllIlI;
    private static final /* synthetic */ Logger bw;
    private static /* synthetic */ int[] lllIllIlllII;

    private boolean aT() {
        int n2;
        if (h.lIIIllIlIlllIll(this.aQ() ? 1 : 0) && h.lIIIllIlIlllIll(this.aR() ? 1 : 0) && h.lIIIllIlIlllIll(this.aS() ? 1 : 0)) {
            n2 = lllIllIlllII[2];
            0;
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
        bw = LoggerFactory.getLogger(h.class);
        bx = new i();
    }

    private boolean aF() {
        SpellBook.Necromancy necromancy = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        return necromancy.canCast();
    }

    private static void lIIIllIlIlllIlI() {
        lllIllIlllII = new int[53];
        h.lllIllIlllII[0] = (34 + 138 - 159 + 159 ^ 84 + 64 - 126 + 128) & (0xA7 ^ 0xBD ^ (0xE0 ^ 0xC0) ^ -1);
        h.lllIllIlllII[1] = 2;
        h.lllIllIlllII[2] = 1;
        h.lllIllIlllII[3] = 3;
        h.lllIllIlllII[4] = 0x7E ^ 0x7A;
        h.lllIllIlllII[5] = 0x91 ^ 0xAE ^ (0x6E ^ 0x54);
        h.lllIllIlllII[6] = 0x34 ^ 0x16 ^ (0x36 ^ 0x12);
        h.lllIllIlllII[7] = 0x20 ^ 0x27;
        h.lllIllIlllII[8] = 0x4E ^ 0x75 ^ (0xA7 ^ 0x94);
        h.lllIllIlllII[9] = 0x1D ^ 0x42 ^ (0xD7 ^ 0x81);
        h.lllIllIlllII[10] = 0x20 ^ 0x65 ^ (0xF2 ^ 0xBD);
        h.lllIllIlllII[11] = 0xBA ^ 0xB1;
        h.lllIllIlllII[12] = 0x26 ^ 0x5E ^ (0xF0 ^ 0x84);
        h.lllIllIlllII[13] = 0x33 ^ 0x55 ^ (0x67 ^ 0xC);
        h.lllIllIlllII[14] = 0x9F ^ 0x91;
        h.lllIllIlllII[15] = 0xA1 ^ 0xAE;
        h.lllIllIlllII[16] = 0x4B ^ 0x5B;
        h.lllIllIlllII[17] = 0x36 ^ 0x27;
        h.lllIllIlllII[18] = 0x60 ^ 0x72;
        h.lllIllIlllII[19] = 0xAF ^ 0x96 ^ (0 ^ 0x2A);
        h.lllIllIlllII[20] = 0x12 ^ 6;
        h.lllIllIlllII[21] = 47 + 39 - -66 + 63 ^ 129 + 143 - 122 + 44;
        h.lllIllIlllII[22] = 0x4E ^ 0x66;
        h.lllIllIlllII[23] = 91 + 40 - 100 + 106 ^ 106 + 79 - 53 + 27;
        h.lllIllIlllII[24] = 0x60 ^ 0x77;
        h.lllIllIlllII[25] = 0x4B ^ 0x53;
        h.lllIllIlllII[26] = 110 + 160 - 148 + 54 ^ 42 + 98 - -27 + 2;
        h.lllIllIlllII[27] = 202 + 137 - 269 + 148 ^ 46 + 24 - 58 + 180;
        h.lllIllIlllII[28] = 0x2A ^ 0x43 ^ (0x7C ^ 0xE);
        h.lllIllIlllII[29] = 40 + 75 - 33 + 107 ^ 78 + 101 - 163 + 145;
        h.lllIllIlllII[30] = 0xB2 ^ 0xAC ^ 3;
        h.lllIllIlllII[31] = -1;
        h.lllIllIlllII[32] = 138 + 49 - 145 + 137 ^ 84 + 99 - 179 + 169;
        h.lllIllIlllII[33] = 0x25 ^ 0x3A;
        h.lllIllIlllII[34] = 0x8A ^ 0xAA;
        h.lllIllIlllII[35] = 0x31 ^ 0x10;
        h.lllIllIlllII[36] = 0x1C ^ 0x12 ^ (0x1F ^ 0x33);
        h.lllIllIlllII[37] = 0xB2 ^ 0x91;
        h.lllIllIlllII[38] = 0x89 ^ 0xAD;
        h.lllIllIlllII[39] = 141 + 101 - 131 + 31 ^ 28 + 129 - 86 + 100;
        h.lllIllIlllII[40] = 118 + 55 - 99 + 90 ^ 16 + 83 - 6 + 37;
        h.lllIllIlllII[41] = 0x16 ^ 0x1F ^ (0x81 ^ 0xAF);
        h.lllIllIlllII[42] = 0xEF ^ 0x94 ^ (0 ^ 0x52);
        h.lllIllIlllII[43] = 0x5A ^ 0x70;
        h.lllIllIlllII[44] = 0xCB ^ 0x9B ^ (0xD2 ^ 0xA9);
        h.lllIllIlllII[45] = 131 + 48 - 71 + 39 ^ 86 + 63 - 75 + 117;
        h.lllIllIlllII[46] = 5 ^ 0x26 ^ (0xA9 ^ 0xA7);
        h.lllIllIlllII[47] = 0xE0 ^ 0x8D ^ (0xC6 ^ 0x85);
        h.lllIllIlllII[48] = 0xFFFFF99F & 0x16FB;
        h.lllIllIlllII[49] = 0xFFFFD3F7 & 0x2FEB;
        h.lllIllIlllII[50] = 0x15 ^ 0x3A;
        h.lllIllIlllII[51] = 0x8F ^ 0xBF;
        h.lllIllIlllII[52] = 0x1A ^ 0x2B;
    }

    private static boolean lIIIllIlIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean aG() {
        void var2_2;
        int var11;
        Item var27;
        Item var1;
        TileItem var9;
        h var10;
        if (h.lIIIllIlIlllIll(this.by.assistantMode() ? 1 : 0)) {
            return lllIllIlllII[0];
        }
        int n2 = var10.aT();
        TileItem var22 = null;
        if (h.lIIIllIlIllllII(var10.aR() ? 1 : 0)) {
            var22 = var10.aI();
            0;
            
            }
        } else if (h.lIIIllIlIllllII(var10.aQ() ? 1 : 0)) {
            var22 = var10.aH();
            0;
            if (1 < 0) {
                return false;
            }
        } else if ((!h.lIIIllIlIllllII(var10.aF() ? 1 : 0) || h.lIIIllIlIllllIl(Skills.getBoostedLevel((Skill)Skill.PRAYER), var10.by.restorePrayerAt())) && h.lIIIllIlIllllII(Inventory.contains(item -> {
            int n2;
            if (!h.lIIIllIlIllllII(item.getName().contains(lllIllIllIlI[lllIllIlllII[50]]) ? 1 : 0) || h.lIIIllIlIlllIll(item.getName().contains(lllIllIllIlI[lllIllIlllII[51]]) ? 1 : 0)) {
                n2 = lllIllIlllII[2];
                0;
                if (-1 > 0) {
                    return false;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            var22 = var10.aJ();
        }
        if (h.lIIIllIlIlllllI(var22)) {
            var22 = TileItems.getAll(tileItem -> {
                int n2;
                if (h.lIIIllIlIllllll(tileItem.getName()) && h.lIIIllIlIlllIll(bx.containsKey(tileItem.getName()) ? 1 : 0)) {
                    n2 = lllIllIlllII[2];
                    0;
                    if (2 <= 0) {
                        return ((0xD ^ 0x3C ^ (5 ^ 0x7E)) & (54 + 19 - -7 + 59 ^ 47 + 105 - 92 + 133 ^ -1)) != 0;
                    }
                } else {
                    n2 = lllIllIlllII[0];
                }
                return n2 != 0;
            }).stream().max(Comparator.comparingInt(tileItem -> bx.get(tileItem.getName()) * tileItem.getQuantity())).orElse(null);
        }
        if (h.lIIIllIlIllllll(var9 = var10.aK())) {
            var22 = var9;
        }
        if (h.lIIIllIlIlllllI(var22) && h.lIIIllIlIlllllI(var22 = (TileItem)TileItems.getAll(tileItem -> {
            boolean bl;
            if (h.lIIIllIllIIIIIl(tileItem.getId(), lllIllIlllII[49])) {
                bl = lllIllIlllII[2];
                0;
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
        if (h.lIIIllIllIIIIII(var22, var9) && h.lIIIllIlIlllIll(Inventory.isFull() ? 1 : 0)) {
            var1 = Inventory.getFirst(item -> {
                int n2;
                String[] stringArray = new String[lllIllIlllII[1]];
                stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[46]];
                stringArray[h.lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[47]];
                if (h.lIIIllIlIlllIll(item.hasAction(stringArray) ? 1 : 0) && h.lIIIllIllIIIlII(item.getId(), lllIllIlllII[48])) {
                    n2 = lllIllIlllII[2];
                    0;
                    if (3 == (110 + 154 - 128 + 20 ^ 14 + 32 - -89 + 17)) {
                        return ((61 + 96 - 125 + 126 ^ 110 + 135 - 112 + 58) & (0xF2 ^ 0xAA ^ (0xC8 ^ 0xB1) ^ -1)) != 0;
                    }
                } else {
                    n2 = lllIllIlllII[0];
                }
                return n2 != 0;
            });
            var27 = var10.aO().orElse(null);
            if (h.lIIIllIlIlllllI(var27)) {
                bw.debug(lllIllIllIlI[lllIllIlllII[0]]);
                if (h.lIIIllIlIllllll(var1)) {
                    String[] stringArray = new String[lllIllIlllII[1]];
                    stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[2]];
                    stringArray[h.lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[1]];
                    var1.interact(stringArray);
                    return lllIllIlllII[2];
                }
                return lllIllIlllII[0];
            }
            var11 = var10.a(var27, var22) ? 1 : 0;
            if (h.lIIIllIlIlllIll(var11)) {
                bw.info(lllIllIllIlI[lllIllIlllII[3]], (Object)var27.getName(), (Object)var22.getName());
                String[] stringArray = new String[lllIllIlllII[1]];
                stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[4]];
                stringArray[h.lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[5]];
                var27.interact(stringArray);
                return lllIllIlllII[2];
            }
        }
        if (!h.lIIIllIlIllllII(var22.isStackable() ? 1 : 0) || h.lIIIllIlIlllIll(var22.isNoted() ? 1 : 0)) {
            int[] nArray = new int[lllIllIlllII[2]];
            nArray[h.lllIllIlllII[0]] = var22.getId();
            if (h.lIIIllIlIlllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Object[] objectArray = new Object[lllIllIlllII[2]];
                objectArray[h.lllIllIlllII[0]] = var22.getName();
                Log.info((String)lllIllIllIlI[lllIllIlllII[6]], (Object[])objectArray);
                var22.interact(lllIllIllIlI[lllIllIlllII[7]]);
                return lllIllIlllII[2];
            }
        }
        if (h.lIIIllIlIlllIll(Inventory.isFull() ? 1 : 0)) {
            var1 = Inventory.getFirst(item -> {
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
                    0;
                    if (1 <= 1) return n2 != 0;
                    return false;
                }
                n2 = lllIllIlllII[0];
                return n2 != 0;
            });
            var27 = var10.aO().orElse(null);
            if (h.lIIIllIlIlllllI(var27)) {
                if (h.lIIIllIlIlllIll(n2)) {
                    Object[] objectArray = new Object[lllIllIlllII[2]];
                    objectArray[h.lllIllIlllII[0]] = var22.getName();
                    Log.info((String)lllIllIllIlI[lllIllIlllII[8]], (Object[])objectArray);
                    return lllIllIlllII[0];
                }
                if (h.lIIIllIlIllllll(var1)) {
                    bw.info(lllIllIllIlI[lllIllIlllII[9]], (Object)var1.getName(), (Object)var22.getName());
                    String[] stringArray = new String[lllIllIlllII[1]];
                    stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[10]];
                    stringArray[h.lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[11]];
                    var1.interact(stringArray);
                    return lllIllIlllII[2];
                }
                return lllIllIlllII[0];
            }
            if (h.lIIIllIllIIIIIl(var27.getId(), var22.getId())) {
                bw.info(lllIllIllIlI[lllIllIlllII[12]], (Object)var27.getName(), (Object)var22.getName());
                return lllIllIlllII[0];
            }
            var11 = var10.a(var27, var22) ? 1 : 0;
            if (h.lIIIllIlIlllIll(var11)) {
                bw.info(lllIllIllIlI[lllIllIlllII[13]], (Object)var27.getName(), (Object)var22.getName());
                String[] stringArray = new String[lllIllIlllII[1]];
                stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[14]];
                stringArray[h.lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[15]];
                var27.interact(stringArray);
                return lllIllIlllII[2];
            }
            bw.info(lllIllIllIlI[lllIllIlllII[16]], (Object)var22.getName());
            return lllIllIlllII[0];
        }
        if (h.lIIIllIlIlllIll(var22.hasInventoryAction(lllIllIllIlI[lllIllIlllII[17]]) ? 1 : 0) && h.lIIIllIllIIIIlI(Inventory.getFreeSlots(), lllIllIlllII[2])) {
            bw.info(lllIllIllIlI[lllIllIlllII[18]], (Object)var22.getName());
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
            TileItem var3;
            if (h.lIIIllIlIlllllI(tileItem.getName())) {
                return lllIllIlllII[0];
            }
            String var19 = var3.getName().toLowerCase();
            if (!(h.lIIIllIlIllllII(var19.contains(lllIllIllIlI[lllIllIlllII[32]]) ? 1 : 0) && h.lIIIllIlIllllII(var19.contains(lllIllIllIlI[lllIllIlllII[33]]) ? 1 : 0) && h.lIIIllIlIllllII(var19.contains(lllIllIllIlI[lllIllIlllII[34]]) ? 1 : 0) && h.lIIIllIlIllllII(var19.contains(lllIllIllIlI[lllIllIlllII[35]]) ? 1 : 0) && h.lIIIllIlIllllII(var19.contains(lllIllIllIlI[lllIllIlllII[36]]) ? 1 : 0) && !h.lIIIllIlIlllIll(var19.contains(lllIllIllIlI[lllIllIlllII[37]]) ? 1 : 0))) {
                n2 = lllIllIlllII[2];
                0;
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
        h.lllIllIllIlI[h.lllIllIlllII[0]] = h."Inventory is full and worstInv is null; we stuck fam?";
        h.lllIllIllIlI[h.lllIllIlllII[2]] = h."Eat";
        h.lllIllIllIlI[h.lllIllIlllII[1]] = h."Drop";
        h.lllIllIllIlI[h.lllIllIlllII[3]] = h."Dropping worst inventory item: {} to make room for PRIORITY loot {}";
        h.lllIllIllIlI[h.lllIllIlllII[4]] = h."Eat";
        h.lllIllIllIlI[h.lllIllIlllII[5]] = h."Drop";
        h.lllIllIllIlI[h.lllIllIlllII[6]] = h."Looting stacking or noted item that we already have! => {}";
        h.lllIllIllIlI[h.lllIllIlllII[7]] = h."Take";
        h.lllIllIllIlI[h.lllIllIlllII[8]] = h."Inventory is full and worstInv is null; and we have supplies for another kill; saving {} for later....";
        h.lllIllIllIlI[h.lllIllIlllII[9]] = h."Inventory is full and worstInv is null; and no supplies for next kill... so we're eating or drinking {} to make room for {} ";
        h.lllIllIllIlI[h.lllIllIlllII[10]] = h."Eat";
        h.lllIllIllIlI[h.lllIllIlllII[11]] = h."Drop";
        h.lllIllIllIlI[h.lllIllIlllII[12]] = h."Doing nothing since... Worst inventory item {} is the same as the loot item {}";
        h.lllIllIllIlI[h.lllIllIlllII[13]] = h."Dropping worst inventory item: {} to make room for loot {}";
        h.lllIllIllIlI[h.lllIllIlllII[14]] = h."Eat";
        h.lllIllIllIlI[h.lllIllIlllII[15]] = h."Drop";
        h.lllIllIllIlI[h.lllIllIlllII[16]] = h."Inventory is full and worstInv is not worse than loot; ignoring loot {}";
        h.lllIllIllIlI[h.lllIllIlllII[17]] = h."Eat";
        h.lllIllIllIlI[h.lllIllIlllII[18]] = h."Inventory is full almost full, so we're ignoring ignoring food {} since we would waste it anyways!";
        h.lllIllIllIlI[h.lllIllIlllII[19]] = h."Looting {}";
        h.lllIllIllIlI[h.lllIllIlllII[20]] = h."Take";
        h.lllIllIllIlI[h.lllIllIlllII[21]] = h."[LootManager]: Nothing to loot, teleporting out!";
        h.lllIllIllIlI[h.lllIllIlllII[23]] = h."combat potion";
        h.lllIllIllIlI[h.lllIllIlllII[24]] = h."super strength";
        h.lllIllIllIlI[h.lllIllIlllII[25]] = h."sanfew";
        h.lllIllIllIlI[h.lllIllIlllII[26]] = h."balm";
        h.lllIllIllIlI[h.lllIllIlllII[27]] = h."Eat";
        h.lllIllIllIlI[h.lllIllIlllII[28]] = h."sleepwalker";
        h.lllIllIllIlI[h.lllIllIlllII[29]] = h."husk";
        h.lllIllIllIlI[h.lllIllIlllII[30]] = h."Coins";
        h.lllIllIllIlI[h.lllIllIlllII[32]] = h."orb";
        h.lllIllIllIlI[h.lllIllIlllII[33]] = h."tablet";
        h.lllIllIllIlI[h.lllIllIlllII[34]] = h."egg";
        h.lllIllIllIlI[h.lllIllIlllII[35]] = h."dreams";
        h.lllIllIllIlI[h.lllIllIlllII[36]] = h."inquisitor";
        h.lllIllIllIlI[h.lllIllIlllII[37]] = h."staff";
        h.lllIllIllIlI[h.lllIllIlllII[38]] = h."Drink";
        h.lllIllIllIlI[h.lllIllIlllII[39]] = h."sanfew";
        h.lllIllIllIlI[h.lllIllIlllII[40]] = h."prayer";
        h.lllIllIllIlI[h.lllIllIlllII[41]] = h."Drink";
        h.lllIllIllIlI[h.lllIllIlllII[22]] = h."sanfew";
        h.lllIllIllIlI[h.lllIllIlllII[42]] = h."Eat";
        h.lllIllIllIlI[h.lllIllIlllII[43]] = h."Eat";
        h.lllIllIllIlI[h.lllIllIlllII[44]] = h."Drink";
        h.lllIllIllIlI[h.lllIllIlllII[45]] = h."balm";
        h.lllIllIllIlI[h.lllIllIlllII[46]] = h."Eat";
        h.lllIllIllIlI[h.lllIllIlllII[47]] = h."Empty";
        h.lllIllIllIlI[h.lllIllIlllII[50]] = h."Sanfew";
        h.lllIllIllIlI[h.lllIllIlllII[51]] = h."Prayer";
    }

    private boolean aS() {
        boolean bl;
        int n2 = Inventory.getAll(item -> {
            boolean bl;
            String string = item.getName().toLowerCase();
            if (!h.lIIIllIlIllllII(string.contains(lllIllIllIlI[lllIllIlllII[23]]) ? 1 : 0) || h.lIIIllIlIlllIll(string.contains(lllIllIllIlI[lllIllIlllII[24]]) ? 1 : 0)) {
                bl = lllIllIlllII[2];
                0;
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
            0;
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
                0;
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
                0;
                
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
                0;
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
                0;
                
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        }).stream().map(item -> Character.valueOf(item.getName().charAt(item.getName().indexOf(lllIllIlllII[22]) + lllIllIlllII[2]))).mapToInt(Character::getNumericValue).sum();
        if (h.lIIIllIllIIIIll(n2, this.by.teleportCleanse())) {
            bl = lllIllIlllII[2];
            0;
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
    public h(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
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
                0;
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
                    0;
                    if (-(92 + 58 - 148 + 125 ^ (0xE9 ^ 0x92)) <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIllIlllII[0];
            return n2 != 0;
        }).max(Comparator.comparingInt(object -> ((TileItem)object).getQuantity() * bx.getOrDefault(((TileItem)object).getName(), lllIllIlllII[31])).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }

    private static String lIIIllIlIlIlIll(String var25, String var4) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lllIllIlllII[8]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lllIllIlllII[1], var2);
            return new String(var7.doFinal(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
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

    private static String lIIIllIlIlIlIlI(String var17, String var23) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var16 = var23.toCharArray();
        int var14 = lllIllIlllII[0];
        char[] var29 = var17.toCharArray();
        int var18 = var29.length;
        int var8 = lllIllIlllII[0];
        while (h.lIIIllIlIllllIl(var8, var18)) {
            char var24 = var29[var8];
            var5.append((char)(var24 ^ var16[var14 % var16.length]));
            0;
            ++var14;
            ++var8;
            0;
            if ((0x2D ^ 0x28) != 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    public TileItem aJ() {
        return TileItems.getNearest(tileItem -> {
            int n2;
            if (h.lIIIllIlIlllIll(tileItem.hasInventoryAction(lllIllIllIlI[lllIllIlllII[38]]) ? 1 : 0) && (!h.lIIIllIlIllllII(tileItem.getName().toLowerCase().contains(lllIllIllIlI[lllIllIlllII[39]]) ? 1 : 0) || h.lIIIllIlIlllIll(tileItem.getName().toLowerCase().contains(lllIllIllIlI[lllIllIlllII[40]]) ? 1 : 0))) {
                n2 = lllIllIlllII[2];
                0;
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
            0;
            
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

    private static String lIIIllIlIlIlIIl(String var15, String var12) {
        try {
            SecretKeySpec var26 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(lllIllIlllII[1], var26);
            return new String(var20.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
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
                0;
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
            0;
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
        h var28;
        int n3;
        int var6;
        int n4;
        if (h.lIIIllIlIllllll(NPCs.getNearest(nPC -> {
            int n2;
            if (h.lIIIllIlIlllIll(nPC.getName().equalsIgnoreCase(lllIllIllIlI[lllIllIlllII[29]]) ? 1 : 0) && h.lIIIllIlIllllII(nPC.isDead() ? 1 : 0)) {
                n2 = lllIllIlllII[2];
                0;
                if (-1 == 2) {
                    return false;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        }))) {
            n4 = lllIllIlllII[2];
            0;
            if ((119 + 96 - 129 + 103 ^ 37 + 64 - 21 + 105) != (0x59 ^ 0x7A ^ (0xB8 ^ 0x9F))) {
                return ((0x64 ^ 0x27 ^ (0x30 ^ 0x69)) & (120 + 106 - 212 + 128 ^ 120 + 125 - 239 + 142 ^ -1)) != 0;
            }
        } else {
            n4 = var6 = lllIllIlllII[0];
        }
        if (h.lIIIllIlIllllll(NPCs.getNearest(nPC -> {
            int n2;
            if (h.lIIIllIlIlllIll(nPC.getName().equalsIgnoreCase(lllIllIllIlI[lllIllIlllII[28]]) ? 1 : 0) && h.lIIIllIlIllllII(nPC.isDead() ? 1 : 0)) {
                n2 = lllIllIlllII[2];
                0;
                if (-(0xC5 ^ 0xC0) >= 0) {
                    return false;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        }))) {
            n3 = lllIllIlllII[2];
            0;
            if (-1 > ((0x5E ^ 3) & ~(0x62 ^ 0x3F))) {
                return false;
            }
        } else {
            n3 = lllIllIlllII[0];
        }
        int var21 = n3;
        NPC lllllllllllllllIIllIIllIIIIlIIll = SquireNightmarePlugin.d();
        int n5 = e.ax().isEmpty();
        if (h.lIIIllIlIllllII(var6) && h.lIIIllIlIllllII(var21) && h.lIIIllIlIlllllI(var28.bz.aj()) && h.lIIIllIlIllllII(var28.bz.ap()) && h.lIIIllIlIlllIll(n5)) {
            n2 = lllIllIlllII[2];
            0;
            if (((0x86 ^ 0xB8 ^ (0x76 ^ 0x61)) & (0x5A ^ 0x15 ^ (0x4D ^ 0x2B) ^ -1)) != 0) {
                return ((0x41 ^ 5 ^ (0xA6 ^ 0x83)) & (106 + 65 - 51 + 119 ^ 117 + 118 - 110 + 17 ^ -1)) != 0;
            }
        } else {
            n2 = lllIllIlllII[0];
        }
        return n2 != 0;
    }
}

