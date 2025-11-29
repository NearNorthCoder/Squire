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
            "".length();
            if (-" ".length() >= (0xDD ^ 0xC7 ^ (0x28 ^ 0x36))) {
                return ((0x6F ^ 0x42 ^ (0xA3 ^ 0x84)) & (89 + 16 - 16 + 77 ^ 1 + 70 - -36 + 65 ^ -" ".length())) != 0;
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
        h.lllIllIlllII[0] = (34 + 138 - 159 + 159 ^ 84 + 64 - 126 + 128) & (0xA7 ^ 0xBD ^ (0xE0 ^ 0xC0) ^ -" ".length());
        h.lllIllIlllII[1] = "  ".length();
        h.lllIllIlllII[2] = " ".length();
        h.lllIllIlllII[3] = "   ".length();
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
        h.lllIllIlllII[30] = 0xB2 ^ 0xAC ^ "   ".length();
        h.lllIllIlllII[31] = -" ".length();
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
        int lllllllllllllllIIllIIllIIIlIlIII;
        Item lllllllllllllllIIllIIllIIIlIlIIl;
        Item lllllllllllllllIIllIIllIIIlIlIlI;
        TileItem lllllllllllllllIIllIIllIIIlIlIll;
        h lllllllllllllllIIllIIllIIIlIlllI;
        if (h.lIIIllIlIlllIll(this.by.assistantMode() ? 1 : 0)) {
            return lllIllIlllII[0];
        }
        int n2 = lllllllllllllllIIllIIllIIIlIlllI.aT();
        TileItem lllllllllllllllIIllIIllIIIlIllII = null;
        if (h.lIIIllIlIllllII(lllllllllllllllIIllIIllIIIlIlllI.aR() ? 1 : 0)) {
            lllllllllllllllIIllIIllIIIlIllII = lllllllllllllllIIllIIllIIIlIlllI.aI();
            "".length();
            if (null != null) {
                return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
            }
        } else if (h.lIIIllIlIllllII(lllllllllllllllIIllIIllIIIlIlllI.aQ() ? 1 : 0)) {
            lllllllllllllllIIllIIllIIIlIllII = lllllllllllllllIIllIIllIIIlIlllI.aH();
            "".length();
            if (" ".length() < 0) {
                return ((0xAA ^ 0xBE) & ~(0x64 ^ 0x70)) != 0;
            }
        } else if ((!h.lIIIllIlIllllII(lllllllllllllllIIllIIllIIIlIlllI.aF() ? 1 : 0) || h.lIIIllIlIllllIl(Skills.getBoostedLevel((Skill)Skill.PRAYER), lllllllllllllllIIllIIllIIIlIlllI.by.restorePrayerAt())) && h.lIIIllIlIllllII(Inventory.contains(item -> {
            int n2;
            if (!h.lIIIllIlIllllII(item.getName().contains(lllIllIllIlI[lllIllIlllII[50]]) ? 1 : 0) || h.lIIIllIlIlllIll(item.getName().contains(lllIllIllIlI[lllIllIlllII[51]]) ? 1 : 0)) {
                n2 = lllIllIlllII[2];
                "".length();
                if (-" ".length() > 0) {
                    return ((0x87 ^ 0x96) & ~(0xD4 ^ 0xC5)) != 0;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            lllllllllllllllIIllIIllIIIlIllII = lllllllllllllllIIllIIllIIIlIlllI.aJ();
        }
        if (h.lIIIllIlIlllllI(lllllllllllllllIIllIIllIIIlIllII)) {
            lllllllllllllllIIllIIllIIIlIllII = TileItems.getAll(tileItem -> {
                int n2;
                if (h.lIIIllIlIllllll(tileItem.getName()) && h.lIIIllIlIlllIll(bx.containsKey(tileItem.getName()) ? 1 : 0)) {
                    n2 = lllIllIlllII[2];
                    "".length();
                    if ("  ".length() <= 0) {
                        return ((0xD ^ 0x3C ^ (5 ^ 0x7E)) & (54 + 19 - -7 + 59 ^ 47 + 105 - 92 + 133 ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lllIllIlllII[0];
                }
                return n2 != 0;
            }).stream().max(Comparator.comparingInt(tileItem -> bx.get(tileItem.getName()) * tileItem.getQuantity())).orElse(null);
        }
        if (h.lIIIllIlIllllll(lllllllllllllllIIllIIllIIIlIlIll = lllllllllllllllIIllIIllIIIlIlllI.aK())) {
            lllllllllllllllIIllIIllIIIlIllII = lllllllllllllllIIllIIllIIIlIlIll;
        }
        if (h.lIIIllIlIlllllI(lllllllllllllllIIllIIllIIIlIllII) && h.lIIIllIlIlllllI(lllllllllllllllIIllIIllIIIlIllII = (TileItem)TileItems.getAll(tileItem -> {
            boolean bl;
            if (h.lIIIllIllIIIIIl(tileItem.getId(), lllIllIlllII[49])) {
                bl = lllIllIlllII[2];
                "".length();
                if ("   ".length() > "   ".length()) {
                    return ((9 ^ 0x52) & ~(0x7D ^ 0x26)) != 0;
                }
            } else {
                bl = lllIllIlllII[0];
            }
            return bl;
        }).stream().min(Comparator.comparingInt(tileItem -> tileItem.distanceTo((Locatable)Players.getLocal()))).orElse(null))) {
            return lllIllIlllII[0];
        }
        if (h.lIIIllIllIIIIII(lllllllllllllllIIllIIllIIIlIllII, lllllllllllllllIIllIIllIIIlIlIll) && h.lIIIllIlIlllIll(Inventory.isFull() ? 1 : 0)) {
            lllllllllllllllIIllIIllIIIlIlIlI = Inventory.getFirst(item -> {
                int n2;
                String[] stringArray = new String[lllIllIlllII[1]];
                stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[46]];
                stringArray[h.lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[47]];
                if (h.lIIIllIlIlllIll(item.hasAction(stringArray) ? 1 : 0) && h.lIIIllIllIIIlII(item.getId(), lllIllIlllII[48])) {
                    n2 = lllIllIlllII[2];
                    "".length();
                    if ("   ".length() == (110 + 154 - 128 + 20 ^ 14 + 32 - -89 + 17)) {
                        return ((61 + 96 - 125 + 126 ^ 110 + 135 - 112 + 58) & (0xF2 ^ 0xAA ^ (0xC8 ^ 0xB1) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lllIllIlllII[0];
                }
                return n2 != 0;
            });
            lllllllllllllllIIllIIllIIIlIlIIl = lllllllllllllllIIllIIllIIIlIlllI.aO().orElse(null);
            if (h.lIIIllIlIlllllI(lllllllllllllllIIllIIllIIIlIlIIl)) {
                bw.debug(lllIllIllIlI[lllIllIlllII[0]]);
                if (h.lIIIllIlIllllll(lllllllllllllllIIllIIllIIIlIlIlI)) {
                    String[] stringArray = new String[lllIllIlllII[1]];
                    stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[2]];
                    stringArray[h.lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[1]];
                    lllllllllllllllIIllIIllIIIlIlIlI.interact(stringArray);
                    return lllIllIlllII[2];
                }
                return lllIllIlllII[0];
            }
            lllllllllllllllIIllIIllIIIlIlIII = lllllllllllllllIIllIIllIIIlIlllI.a(lllllllllllllllIIllIIllIIIlIlIIl, lllllllllllllllIIllIIllIIIlIllII) ? 1 : 0;
            if (h.lIIIllIlIlllIll(lllllllllllllllIIllIIllIIIlIlIII)) {
                bw.info(lllIllIllIlI[lllIllIlllII[3]], (Object)lllllllllllllllIIllIIllIIIlIlIIl.getName(), (Object)lllllllllllllllIIllIIllIIIlIllII.getName());
                String[] stringArray = new String[lllIllIlllII[1]];
                stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[4]];
                stringArray[h.lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[5]];
                lllllllllllllllIIllIIllIIIlIlIIl.interact(stringArray);
                return lllIllIlllII[2];
            }
        }
        if (!h.lIIIllIlIllllII(lllllllllllllllIIllIIllIIIlIllII.isStackable() ? 1 : 0) || h.lIIIllIlIlllIll(lllllllllllllllIIllIIllIIIlIllII.isNoted() ? 1 : 0)) {
            int[] nArray = new int[lllIllIlllII[2]];
            nArray[h.lllIllIlllII[0]] = lllllllllllllllIIllIIllIIIlIllII.getId();
            if (h.lIIIllIlIlllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Object[] objectArray = new Object[lllIllIlllII[2]];
                objectArray[h.lllIllIlllII[0]] = lllllllllllllllIIllIIllIIIlIllII.getName();
                Log.info((String)lllIllIllIlI[lllIllIlllII[6]], (Object[])objectArray);
                lllllllllllllllIIllIIllIIIlIllII.interact(lllIllIllIlI[lllIllIlllII[7]]);
                return lllIllIlllII[2];
            }
        }
        if (h.lIIIllIlIlllIll(Inventory.isFull() ? 1 : 0)) {
            lllllllllllllllIIllIIllIIIlIlIlI = Inventory.getFirst(item -> {
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
                    "".length();
                    if (" ".length() <= " ".length()) return n2 != 0;
                    return ((0x6D ^ 0x5B) & ~(0x5E ^ 0x68)) != 0;
                }
                n2 = lllIllIlllII[0];
                return n2 != 0;
            });
            lllllllllllllllIIllIIllIIIlIlIIl = lllllllllllllllIIllIIllIIIlIlllI.aO().orElse(null);
            if (h.lIIIllIlIlllllI(lllllllllllllllIIllIIllIIIlIlIIl)) {
                if (h.lIIIllIlIlllIll(n2)) {
                    Object[] objectArray = new Object[lllIllIlllII[2]];
                    objectArray[h.lllIllIlllII[0]] = lllllllllllllllIIllIIllIIIlIllII.getName();
                    Log.info((String)lllIllIllIlI[lllIllIlllII[8]], (Object[])objectArray);
                    return lllIllIlllII[0];
                }
                if (h.lIIIllIlIllllll(lllllllllllllllIIllIIllIIIlIlIlI)) {
                    bw.info(lllIllIllIlI[lllIllIlllII[9]], (Object)lllllllllllllllIIllIIllIIIlIlIlI.getName(), (Object)lllllllllllllllIIllIIllIIIlIllII.getName());
                    String[] stringArray = new String[lllIllIlllII[1]];
                    stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[10]];
                    stringArray[h.lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[11]];
                    lllllllllllllllIIllIIllIIIlIlIlI.interact(stringArray);
                    return lllIllIlllII[2];
                }
                return lllIllIlllII[0];
            }
            if (h.lIIIllIllIIIIIl(lllllllllllllllIIllIIllIIIlIlIIl.getId(), lllllllllllllllIIllIIllIIIlIllII.getId())) {
                bw.info(lllIllIllIlI[lllIllIlllII[12]], (Object)lllllllllllllllIIllIIllIIIlIlIIl.getName(), (Object)lllllllllllllllIIllIIllIIIlIllII.getName());
                return lllIllIlllII[0];
            }
            lllllllllllllllIIllIIllIIIlIlIII = lllllllllllllllIIllIIllIIIlIlllI.a(lllllllllllllllIIllIIllIIIlIlIIl, lllllllllllllllIIllIIllIIIlIllII) ? 1 : 0;
            if (h.lIIIllIlIlllIll(lllllllllllllllIIllIIllIIIlIlIII)) {
                bw.info(lllIllIllIlI[lllIllIlllII[13]], (Object)lllllllllllllllIIllIIllIIIlIlIIl.getName(), (Object)lllllllllllllllIIllIIllIIIlIllII.getName());
                String[] stringArray = new String[lllIllIlllII[1]];
                stringArray[h.lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[14]];
                stringArray[h.lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[15]];
                lllllllllllllllIIllIIllIIIlIlIIl.interact(stringArray);
                return lllIllIlllII[2];
            }
            bw.info(lllIllIllIlI[lllIllIlllII[16]], (Object)lllllllllllllllIIllIIllIIIlIllII.getName());
            return lllIllIlllII[0];
        }
        if (h.lIIIllIlIlllIll(lllllllllllllllIIllIIllIIIlIllII.hasInventoryAction(lllIllIllIlI[lllIllIlllII[17]]) ? 1 : 0) && h.lIIIllIllIIIIlI(Inventory.getFreeSlots(), lllIllIlllII[2])) {
            bw.info(lllIllIllIlI[lllIllIlllII[18]], (Object)lllllllllllllllIIllIIllIIIlIllII.getName());
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
            TileItem lllllllllllllllIIllIIlIllllIIlll;
            if (h.lIIIllIlIlllllI(tileItem.getName())) {
                return lllIllIlllII[0];
            }
            String lllllllllllllllIIllIIlIllllIIllI = lllllllllllllllIIllIIlIllllIIlll.getName().toLowerCase();
            if (!(h.lIIIllIlIllllII(lllllllllllllllIIllIIlIllllIIllI.contains(lllIllIllIlI[lllIllIlllII[32]]) ? 1 : 0) && h.lIIIllIlIllllII(lllllllllllllllIIllIIlIllllIIllI.contains(lllIllIllIlI[lllIllIlllII[33]]) ? 1 : 0) && h.lIIIllIlIllllII(lllllllllllllllIIllIIlIllllIIllI.contains(lllIllIllIlI[lllIllIlllII[34]]) ? 1 : 0) && h.lIIIllIlIllllII(lllllllllllllllIIllIIlIllllIIllI.contains(lllIllIllIlI[lllIllIlllII[35]]) ? 1 : 0) && h.lIIIllIlIllllII(lllllllllllllllIIllIIlIllllIIllI.contains(lllIllIllIlI[lllIllIlllII[36]]) ? 1 : 0) && !h.lIIIllIlIlllIll(lllllllllllllllIIllIIlIllllIIllI.contains(lllIllIllIlI[lllIllIlllII[37]]) ? 1 : 0))) {
                n2 = lllIllIlllII[2];
                "".length();
                if ("   ".length() > (0x27 ^ 0x47 ^ (0x78 ^ 0x1C))) {
                    return ((0x95 ^ 0x91 ^ (0xAC ^ 0x9A)) & (0xB4 ^ 0xC4 ^ (0xFD ^ 0xBF) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        });
    }

    private static void lIIIllIlIllIIlI() {
        lllIllIllIlI = new String[lllIllIlllII[52]];
        h.lllIllIllIlI[h.lllIllIlllII[0]] = h.lIIIllIlIlIlIIl("mMx2j8rtRDb5VtmCLq/AMI3OdqWVNTCyHZZBCevw+5gN00j1coD7VN0h/MBKTuT4ldpuqQ1H/bM=", "QNXix");
        h.lllIllIllIlI[h.lllIllIlllII[2]] = h.lIIIllIlIlIlIIl("SkEqc2l0edg=", "gLJHF");
        h.lllIllIllIlI[h.lllIllIlllII[1]] = h.lIIIllIlIlIlIlI("EgcKJQ==", "VueUh");
        h.lllIllIllIlI[h.lllIllIlllII[3]] = h.lIIIllIlIlIlIll("hKc+YVUBuhLrW6gH6e6ySKQRFMVQduuM2xSlDYoJOP9iobZ/+zIXSqUinG2rCEI9gqEVs8CBMmaHsM8/2GN4XLVo5ldqzNls", "LUNSP");
        h.lllIllIllIlI[h.lllIllIlllII[4]] = h.lIIIllIlIlIlIll("Du5+PTBg6sA=", "krsBa");
        h.lllIllIllIlI[h.lllIllIlllII[5]] = h.lIIIllIlIlIlIIl("5UsFBF1/fDY=", "TSlZe");
        h.lllIllIllIlI[h.lllIllIlllII[6]] = h.lIIIllIlIlIlIll("nmteWhfX6hRFzwBG2GRF1pE060QvmM1i0iEuqSw0wG06d+qibTcO2iDUPiSw9sG5MygJxt7vqWBJlL4313u0jQ==", "uafyh");
        h.lllIllIllIlI[h.lllIllIlllII[7]] = h.lIIIllIlIlIlIll("RYWsyO63E+8=", "xhiLu");
        h.lllIllIllIlI[h.lllIllIlllII[8]] = h.lIIIllIlIlIlIll("T1EZEcjKZpsQfonEtcGkSfP0P0ElUzJwrOU7MWvFgWyeuHvGfqaIyTYvj/lEyAjuLFn0jWQzCV5Qq+Jn9THo3koKFaRRF95srq4CpY7cJRBhZXPzAcRndqIBvnNtUNonl8IdjttwLYU=", "fzWTv");
        h.lllIllIllIlI[h.lllIllIlllII[9]] = h.lIIIllIlIlIlIll("kIaGhSey9eE2KO/yjhF+Mvh7xIsc+F96mQRhmgEND/GzSobLYZnU8BHWkGyWooRV3xBk8NksllRm5TF1LL2tm4eRv32ke8Dr8LTbziOwdtNQJdcCMAqILItuNpWb8MBSMQVDRl1t56ZDkFH0GMvD1bYMkdhkvK5+Pyun7tZHeCU=", "cUEcj");
        h.lllIllIllIlI[h.lllIllIlllII[10]] = h.lIIIllIlIlIlIlI("KQQw", "leDdA");
        h.lllIllIllIlI[h.lllIllIlllII[11]] = h.lIIIllIlIlIlIll("+K6ULpAR4oo=", "wqGpn");
        h.lllIllIllIlI[h.lllIllIlllII[12]] = h.lIIIllIlIlIlIll("/exoNt+EEN6xQhWgeQDoTEpaapi92RvP1IJOI7KgllytAQ5SIhjNNFAibuELsR03YWs45IegiRblKIRnTegCN+jX6Tn/opoFX0Kg24NJRiU=", "IQxjR");
        h.lllIllIllIlI[h.lllIllIlllII[13]] = h.lIIIllIlIlIlIll("XQkE1OtqLNMTf4Uh1EcUbBsf9d9glAFjzc3zzPK1tfGGs+opl0afgrL0wr1z1+bj6KOK7xYfBqSeG4uyDb8HSw==", "TqWzJ");
        h.lllIllIllIlI[h.lllIllIlllII[14]] = h.lIIIllIlIlIlIlI("FhMi", "SrVEJ");
        h.lllIllIllIlI[h.lllIllIlllII[15]] = h.lIIIllIlIlIlIlI("LjQJHg==", "jFfnK");
        h.lllIllIllIlI[h.lllIllIlllII[16]] = h.lIIIllIlIlIlIll("ByFLtUQ6How4o0dyYzkV0PSZVX/hI/MU2HK0CSduvp3M9o90eK+Sm+pZKULqCw8e1rn8QMOzU6nXAQxIINyQZVLzWw2n+NOb", "VbclL");
        h.lllIllIllIlI[h.lllIllIlllII[17]] = h.lIIIllIlIlIlIIl("98xDnS3vzbc=", "OqWlW");
        h.lllIllIllIlI[h.lllIllIlllII[18]] = h.lIIIllIlIlIlIIl("WZxQIa3GI3yb/QeHF32PzrH2JnTysxoU9hoV985niUCrwFDQdulW7cFQnAkFxdRht/0GyzXgmgJ5r+A8MXZE4vFzRiiWKH9KE44vAoBx+An4JnaGzOXuFphyWNPgZ7af8igqzkRALYI=", "tyQtq");
        h.lllIllIllIlI[h.lllIllIlllII[19]] = h.lIIIllIlIlIlIll("rbNULpiKhZ8LHa84yu8hWw==", "oCUVR");
        h.lllIllIllIlI[h.lllIllIlllII[20]] = h.lIIIllIlIlIlIlI("MjQNCA==", "fUfmn");
        h.lllIllIllIlI[h.lllIllIlllII[21]] = h.lIIIllIlIlIlIlI("MiQfHgEkCR4QEgwaLUtVJwcEGRwHD1AFGkkEHx4BRUgEFBkMGB8DAQAGF1EaHBxR", "ihpqu");
        h.lllIllIllIlI[h.lllIllIlllII[23]] = h.lIIIllIlIlIlIll("IN8a+LO053hZiSN26NTC3Q==", "qkGgq");
        h.lllIllIllIlI[h.lllIllIlllII[24]] = h.lIIIllIlIlIlIIl("y0QDlPEman8NvsBf7XkHRA==", "CPPjG");
        h.lllIllIllIlI[h.lllIllIlllII[25]] = h.lIIIllIlIlIlIIl("yIUIi2BYAiU=", "zjhzC");
        h.lllIllIllIlI[h.lllIllIlllII[26]] = h.lIIIllIlIlIlIll("rQvkCwunYi0=", "CDjvl");
        h.lllIllIllIlI[h.lllIllIlllII[27]] = h.lIIIllIlIlIlIlI("CDgt", "MYYHt");
        h.lllIllIllIlI[h.lllIllIlllII[28]] = h.lIIIllIlIlIlIIl("DcbAPHGDOaawoAbr3c/OYQ==", "KIGhi");
        h.lllIllIllIlI[h.lllIllIlllII[29]] = h.lIIIllIlIlIlIlI("ICEaBQ==", "HTinF");
        h.lllIllIllIlI[h.lllIllIlllII[30]] = h.lIIIllIlIlIlIll("CBWoSu7bIzA=", "tdTWP");
        h.lllIllIllIlI[h.lllIllIlllII[32]] = h.lIIIllIlIlIlIlI("PiYN", "QToTr");
        h.lllIllIllIlI[h.lllIllIlllII[33]] = h.lIIIllIlIlIlIIl("QYRy+ggbztE=", "OxkFC");
        h.lllIllIllIlI[h.lllIllIlllII[34]] = h.lIIIllIlIlIlIIl("9Vf72ss6oVM=", "ugJnY");
        h.lllIllIllIlI[h.lllIllIlllII[35]] = h.lIIIllIlIlIlIIl("I6SgWhTPp+o=", "xhUxH");
        h.lllIllIllIlI[h.lllIllIlllII[36]] = h.lIIIllIlIlIlIlI("Gz4gICwBOSU6Nw==", "rPQUE");
        h.lllIllIllIlI[h.lllIllIlllII[37]] = h.lIIIllIlIlIlIll("97xijxykQJw=", "doNMU");
        h.lllIllIllIlI[h.lllIllIlllII[38]] = h.lIIIllIlIlIlIlI("ADg5DzI=", "DJPaY");
        h.lllIllIllIlI[h.lllIllIlllII[39]] = h.lIIIllIlIlIlIll("2YV13NOArYQ=", "BQoMi");
        h.lllIllIllIlI[h.lllIllIlllII[40]] = h.lIIIllIlIlIlIll("jV5cIWprEQA=", "YeSTB");
        h.lllIllIllIlI[h.lllIllIlllII[41]] = h.lIIIllIlIlIlIlI("CT4cFAU=", "MLuzn");
        h.lllIllIllIlI[h.lllIllIlllII[22]] = h.lIIIllIlIlIlIIl("5AOx3gSO9KY=", "KwWRp");
        h.lllIllIllIlI[h.lllIllIlllII[42]] = h.lIIIllIlIlIlIll("CBKLbEu3EtU=", "RCYuK");
        h.lllIllIllIlI[h.lllIllIlllII[43]] = h.lIIIllIlIlIlIlI("MzIj", "vSWDX");
        h.lllIllIllIlI[h.lllIllIlllII[44]] = h.lIIIllIlIlIlIll("Gn11cAcJgoc=", "SdlTr");
        h.lllIllIllIlI[h.lllIllIlllII[45]] = h.lIIIllIlIlIlIIl("BE2Tmii905o=", "PdTCJ");
        h.lllIllIllIlI[h.lllIllIlllII[46]] = h.lIIIllIlIlIlIIl("U6vUp+/1Igk=", "biTnt");
        h.lllIllIllIlI[h.lllIllIlllII[47]] = h.lIIIllIlIlIlIll("bYWGsb03rlI=", "rZyAp");
        h.lllIllIllIlI[h.lllIllIlllII[50]] = h.lIIIllIlIlIlIll("2haxyV+bgHk=", "bzZaa");
        h.lllIllIllIlI[h.lllIllIlllII[51]] = h.lIIIllIlIlIlIIl("GoOcu06eGPg=", "UXTwj");
    }

    private boolean aS() {
        boolean bl;
        int n2 = Inventory.getAll(item -> {
            boolean bl;
            String string = item.getName().toLowerCase();
            if (!h.lIIIllIlIllllII(string.contains(lllIllIllIlI[lllIllIlllII[23]]) ? 1 : 0) || h.lIIIllIlIlllIll(string.contains(lllIllIllIlI[lllIllIlllII[24]]) ? 1 : 0)) {
                bl = lllIllIlllII[2];
                "".length();
                if (((0x24 ^ 0x31 ^ (0x5A ^ 0x7E)) & (167 + 41 - 202 + 237 ^ 116 + 44 - 38 + 72 ^ -" ".length())) != 0) {
                    return ((25 + 160 - 101 + 121 ^ 77 + 75 - 149 + 155) & (23 + 74 - -59 + 43 ^ 133 + 7 - 4 + 12 ^ -" ".length())) != 0;
                }
            } else {
                bl = lllIllIlllII[0];
            }
            return bl;
        }).stream().map(item -> Character.valueOf(item.getName().charAt(item.getName().indexOf(lllIllIlllII[22]) + lllIllIlllII[2]))).mapToInt(Character::getNumericValue).sum();
        if (!h.lIIIllIlIllllII(n2) || h.lIIIllIlIlllIll(this.by.continueWithNoPots() ? 1 : 0)) {
            bl = lllIllIlllII[2];
            "".length();
            if (-" ".length() > "  ".length()) {
                return ((0x7E ^ 0x4C) & ~(0x44 ^ 0x76)) != 0;
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
                "".length();
                if ("  ".length() == 0) {
                    return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        }).stream().filter(item -> {
            boolean bl;
            if (h.lIIIllIlIllllII(item.getName().equals(lllIllIllIlI[lllIllIlllII[30]]) ? 1 : 0)) {
                bl = lllIllIlllII[2];
                "".length();
                if (null != null) {
                    return ((6 ^ 0x2D ^ (8 ^ 0x74)) & (115 + 204 - 159 + 57 ^ 123 + 129 - 110 + 0 ^ -" ".length())) != 0;
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
                "".length();
                if ("  ".length() > "   ".length()) {
                    return ((47 + 4 - -16 + 68 ^ 124 + 84 - 119 + 40) & (" ".length() ^ (0x6D ^ 0x6A) ^ -" ".length())) != 0;
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
                "".length();
                if (null != null) {
                    return ((84 + 22 - 67 + 122 ^ 16 + 22 - 5 + 139) & (0x81 ^ 0xA7 ^ (0xAB ^ 0x80) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        }).stream().map(item -> Character.valueOf(item.getName().charAt(item.getName().indexOf(lllIllIlllII[22]) + lllIllIlllII[2]))).mapToInt(Character::getNumericValue).sum();
        if (h.lIIIllIllIIIIll(n2, this.by.teleportCleanse())) {
            bl = lllIllIlllII[2];
            "".length();
            if ((0x70 ^ 0x47 ^ (0x86 ^ 0xB5)) < "   ".length()) {
                return ((130 + 50 - 47 + 4 ^ 60 + 53 - 65 + 86) & (0x1D ^ 0x52 ^ (0x6D ^ 0x2D) ^ -" ".length())) != 0;
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
                "".length();
                if (((0xD7 ^ 0xBE ^ (0x65 ^ 0x11)) & (0xCE ^ 0xA1 ^ (0xF7 ^ 0x85) ^ -" ".length())) < 0) {
                    return ((0x3D ^ 0x35 ^ (0x7C ^ 0x3C)) & (0xA2 ^ 0x81 ^ (0x34 ^ 0x5F) ^ -" ".length())) != 0;
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
                    "".length();
                    if (-(92 + 58 - 148 + 125 ^ (0xE9 ^ 0x92)) <= 0) return n2 != 0;
                    return ((127 + 84 - 87 + 51 ^ 58 + 109 - 11 + 31) & (2 + 38 - -36 + 88 ^ 150 + 3 - -10 + 13 ^ -" ".length())) != 0;
                }
            }
            n2 = lllIllIlllII[0];
            return n2 != 0;
        }).max(Comparator.comparingInt(object -> ((TileItem)object).getQuantity() * bx.getOrDefault(((TileItem)object).getName(), lllIllIlllII[31])).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }

    private static String lIIIllIlIlIlIll(String lllllllllllllllIIllIIlIllIlIlIIl, String lllllllllllllllIIllIIlIllIlIlIII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIllIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIllIlIlIII.getBytes(StandardCharsets.UTF_8)), lllIllIlllII[8]), "DES");
            Cipher lllllllllllllllIIllIIlIllIlIllIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlIllIlIllIl.init(lllIllIlllII[1], lllllllllllllllIIllIIlIllIlIlllI);
            return new String(lllllllllllllllIIllIIlIllIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlIllIlIllII) {
            lllllllllllllllIIllIIlIllIlIllII.printStackTrace();
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

    private static String lIIIllIlIlIlIlI(String lllllllllllllllIIllIIlIlllIIlIII, String lllllllllllllllIIllIIlIlllIIllII) {
        lllllllllllllllIIllIIlIlllIIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlllIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlIlllIIlIll = new StringBuilder();
        char[] lllllllllllllllIIllIIlIlllIIlIlI = lllllllllllllllIIllIIlIlllIIllII.toCharArray();
        int lllllllllllllllIIllIIlIlllIIlIIl = lllIllIlllII[0];
        char[] lllllllllllllllIIllIIlIlllIIIIll = lllllllllllllllIIllIIlIlllIIlIII.toCharArray();
        int lllllllllllllllIIllIIlIlllIIIIlI = lllllllllllllllIIllIIlIlllIIIIll.length;
        int lllllllllllllllIIllIIlIlllIIIIIl = lllIllIlllII[0];
        while (h.lIIIllIlIllllIl(lllllllllllllllIIllIIlIlllIIIIIl, lllllllllllllllIIllIIlIlllIIIIlI)) {
            char lllllllllllllllIIllIIlIlllIIlllI = lllllllllllllllIIllIIlIlllIIIIll[lllllllllllllllIIllIIlIlllIIIIIl];
            lllllllllllllllIIllIIlIlllIIlIll.append((char)(lllllllllllllllIIllIIlIlllIIlllI ^ lllllllllllllllIIllIIlIlllIIlIlI[lllllllllllllllIIllIIlIlllIIlIIl % lllllllllllllllIIllIIlIlllIIlIlI.length]));
            "".length();
            ++lllllllllllllllIIllIIlIlllIIlIIl;
            ++lllllllllllllllIIllIIlIlllIIIIIl;
            "".length();
            if ((0x2D ^ 0x28) != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIlIlllIIlIll);
    }

    public TileItem aJ() {
        return TileItems.getNearest(tileItem -> {
            int n2;
            if (h.lIIIllIlIlllIll(tileItem.hasInventoryAction(lllIllIllIlI[lllIllIlllII[38]]) ? 1 : 0) && (!h.lIIIllIlIllllII(tileItem.getName().toLowerCase().contains(lllIllIllIlI[lllIllIlllII[39]]) ? 1 : 0) || h.lIIIllIlIlllIll(tileItem.getName().toLowerCase().contains(lllIllIllIlI[lllIllIlllII[40]]) ? 1 : 0))) {
                n2 = lllIllIlllII[2];
                "".length();
                if ("  ".length() == " ".length()) {
                    return ((4 + 9 - -123 + 34 ^ 128 + 95 - 221 + 128) & (59 + 45 - -13 + 15 ^ 35 + 71 - 91 + 157 ^ -" ".length())) != 0;
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
            "".length();
            if (null != null) {
                return ((27 + 96 - 22 + 32 ^ 118 + 69 - 52 + 22) & (0x73 ^ 0xF ^ (0x11 ^ 0x75) ^ -" ".length()) & ((141 + 116 - 245 + 212 ^ 117 + 91 - 96 + 83) & (0xEC ^ 0xA7 ^ (0xE3 ^ 0x8B) ^ -" ".length()) ^ -" ".length())) != 0;
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

    private static String lIIIllIlIlIlIIl(String lllllllllllllllIIllIIlIllIlllIII, String lllllllllllllllIIllIIlIllIllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIllIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIllIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlIllIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlIllIlllIlI.init(lllIllIlllII[1], lllllllllllllllIIllIIlIllIlllIll);
            return new String(lllllllllllllllIIllIIlIllIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlIllIlllIIl) {
            lllllllllllllllIIllIIlIllIlllIIl.printStackTrace();
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
                "".length();
                if (" ".length() < 0) {
                    return ((0xA1 ^ 0xAD) & ~(0x7A ^ 0x76)) != 0;
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
            "".length();
            if (" ".length() <= 0) {
                return ((0x4C ^ 0x1D) & ~(0xCC ^ 0x9D)) != 0;
            }
        } else {
            bl = lllIllIlllII[0];
        }
        return bl;
    }

    public boolean c(TileItem tileItem) {
        int n2;
        h lllllllllllllllIIllIIllIIIIlIllI;
        int n3;
        int lllllllllllllllIIllIIllIIIIlIlIl;
        int n4;
        if (h.lIIIllIlIllllll(NPCs.getNearest(nPC -> {
            int n2;
            if (h.lIIIllIlIlllIll(nPC.getName().equalsIgnoreCase(lllIllIllIlI[lllIllIlllII[29]]) ? 1 : 0) && h.lIIIllIlIllllII(nPC.isDead() ? 1 : 0)) {
                n2 = lllIllIlllII[2];
                "".length();
                if (-" ".length() == "  ".length()) {
                    return ((95 + 125 - 93 + 2 ^ 129 + 140 - 186 + 67) & (22 + 10 - -36 + 65 ^ 119 + 24 - 102 + 105 ^ -" ".length())) != 0;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        }))) {
            n4 = lllIllIlllII[2];
            "".length();
            if ((119 + 96 - 129 + 103 ^ 37 + 64 - 21 + 105) != (0x59 ^ 0x7A ^ (0xB8 ^ 0x9F))) {
                return ((0x64 ^ 0x27 ^ (0x30 ^ 0x69)) & (120 + 106 - 212 + 128 ^ 120 + 125 - 239 + 142 ^ -" ".length())) != 0;
            }
        } else {
            n4 = lllllllllllllllIIllIIllIIIIlIlIl = lllIllIlllII[0];
        }
        if (h.lIIIllIlIllllll(NPCs.getNearest(nPC -> {
            int n2;
            if (h.lIIIllIlIlllIll(nPC.getName().equalsIgnoreCase(lllIllIllIlI[lllIllIlllII[28]]) ? 1 : 0) && h.lIIIllIlIllllII(nPC.isDead() ? 1 : 0)) {
                n2 = lllIllIlllII[2];
                "".length();
                if (-(0xC5 ^ 0xC0) >= 0) {
                    return ((4 ^ 0x3C) & ~(0x49 ^ 0x71)) != 0;
                }
            } else {
                n2 = lllIllIlllII[0];
            }
            return n2 != 0;
        }))) {
            n3 = lllIllIlllII[2];
            "".length();
            if (-" ".length() > ((0x5E ^ 3) & ~(0x62 ^ 0x3F))) {
                return ((0xD7 ^ 0x8B) & ~(0xD7 ^ 0x8B)) != 0;
            }
        } else {
            n3 = lllIllIlllII[0];
        }
        int lllllllllllllllIIllIIllIIIIlIlII = n3;
        NPC lllllllllllllllIIllIIllIIIIlIIll = SquireNightmarePlugin.d();
        int n5 = e.ax().isEmpty();
        if (h.lIIIllIlIllllII(lllllllllllllllIIllIIllIIIIlIlIl) && h.lIIIllIlIllllII(lllllllllllllllIIllIIllIIIIlIlII) && h.lIIIllIlIlllllI(lllllllllllllllIIllIIllIIIIlIllI.bz.aj()) && h.lIIIllIlIllllII(lllllllllllllllIIllIIllIIIIlIllI.bz.ap()) && h.lIIIllIlIlllIll(n5)) {
            n2 = lllIllIlllII[2];
            "".length();
            if (((0x86 ^ 0xB8 ^ (0x76 ^ 0x61)) & (0x5A ^ 0x15 ^ (0x4D ^ 0x2B) ^ -" ".length())) != 0) {
                return ((0x41 ^ 5 ^ (0xA6 ^ 0x83)) & (106 + 65 - 51 + 119 ^ 117 + 118 - 110 + 17 ^ -" ".length())) != 0;
            }
        } else {
            n2 = lllIllIlllII[0];
        }
        return n2 != 0;
    }
}

