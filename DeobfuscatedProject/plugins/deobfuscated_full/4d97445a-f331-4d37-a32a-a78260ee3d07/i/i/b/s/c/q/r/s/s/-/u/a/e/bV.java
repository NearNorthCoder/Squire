/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.WorldType
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.shop.SquireShopBuyer;
import gg.squire.basics.shop.SquireShopConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.WorldType;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

/* TASK: Buying shop items -> BuyingshopitemsTask */
@TaskDesc(name="Buying shop items")
public class bV
extends Task {
    private static /* synthetic */ String[] lIIIIIlI;
    private static /* synthetic */ int[] lIIIIIll;
    private /* synthetic */ SquireShopConfig hc;
    private /* synthetic */ boolean hd;
    private /* synthetic */ SquireShopBuyer hb;

    static {
        bV.lllllIllI();
        bV.lllllIlIl();
    }

    private static String lllllIlII(String lllIIlIIlIIIllI, String lllIIlIIlIIIIll) {
        try {
            SecretKeySpec lllIIlIIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIlIIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIlIIlIIlIII = Cipher.getInstance("Blowfish");
            lllIIlIIlIIlIII.init(lIIIIIll[7], lllIIlIIlIIlIIl);
            return new String(lllIIlIIlIIlIII.doFinal(Base64.getDecoder().decode(lllIIlIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIlIIlIIIlll) {
            lllIIlIIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static void lllllIlIl() {
        lIIIIIlI = new String[lIIIIIll[8]];
        bV.lIIIIIlI[bV.lIIIIIll[0]] = bV."Starting location set to {}";
        bV.lIIIIIlI[bV.lIIIIIll[1]] = bV."Updating the starting location as we seem to have moved a bit.";
        bV.lIIIIIlI[bV.lIIIIIll[7]] = bV."Hopping to world {}";
        bV.lIIIIIlI[bV.lIIIIIll[9]] = bV."We're far away from the shop location, walking back.";
        bV.lIIIIIlI[bV.lIIIIIll[10]] = bV."Walking to {}";
        bV.lIIIIIlI[bV.lIIIIIll[5]] = bV."Trade";
        bV.lIIIIIlI[bV.lIIIIIll[2]] = bV."Trade";
        bV.lIIIIIlI[bV.lIIIIIll[11]] = bV."Buy-food";
        bV.lIIIIIlI[bV.lIIIIIll[4]] = bV."Reached end of BuyShopItem with no action taken.";
        bV.lIIIIIlI[bV.lIIIIIll[12]] = bV.",";
        bV.lIIIIIlI[bV.lIIIIIll[13]] = bV."Trade";
    }

    private static void lllllIllI() {
        lIIIIIll = new int[14];
        bV.lIIIIIll[0] = 1 & ~1;
        bV.lIIIIIll[1] = 1;
        bV.lIIIIIll[2] = 0x66 ^ 0x30 ^ (0x2C ^ 0x7C);
        bV.lIIIIIll[3] = 63 + 105 - 147 + 113 ^ 64 + 58 - -28 + 7;
        bV.lIIIIIll[4] = 0x1E ^ 0x51 ^ (0x43 ^ 4);
        bV.lIIIIIll[5] = 0x54 ^ 0x53 ^ 2;
        bV.lIIIIIll[6] = 0xF2 ^ 0xC0;
        bV.lIIIIIll[7] = 2;
        bV.lIIIIIll[8] = 0xA2 ^ 0xA9;
        bV.lIIIIIll[9] = 3;
        bV.lIIIIIll[10] = 69 + 123 - 108 + 75 ^ 7 + 24 - 16 + 140;
        bV.lIIIIIll[11] = 0x7F ^ 0x78;
        bV.lIIIIIll[12] = 107 + 155 - 208 + 102 ^ 61 + 92 - 18 + 14;
        bV.lIIIIIll[13] = 0x46 ^ 0x3A ^ (0xF4 ^ 0x82);
    }

    @Inject
    public bV(SquireShopBuyer squireShopBuyer, SquireShopConfig squireShopConfig) {
        this.hb = squireShopBuyer;
        this.hc = squireShopConfig;
    }

    private static boolean llllllllI(Object object) {
        return object != null;
    }

    private static String lllllIIlI(String lllIIlIIllIlIIl, String lllIIlIIllIlIlI) {
        try {
            SecretKeySpec lllIIlIIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIlIIllIlIlI.getBytes(StandardCharsets.UTF_8)), lIIIIIll[4]), "DES");
            Cipher lllIIlIIllIllIl = Cipher.getInstance("DES");
            lllIIlIIllIllIl.init(lIIIIIll[7], lllIIlIIllIlllI);
            return new String(lllIIlIIllIllIl.doFinal(Base64.getDecoder().decode(lllIIlIIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIlIIllIllII) {
            lllIIlIIllIllII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private int[] bO() {
        void var2_2;
        bV lllIIlIlIIIIlIl;
        if (bV.lllllIlll(this.hc.moreItemIds().trim().isEmpty() ? 1 : 0)) {
            int[] nArray = new int[lIIIIIll[1]];
            nArray[bV.lIIIIIll[0]] = this.hc.buyItemId();
            return nArray;
        }
        String[] lllIIlIlIIIIlII = lllIIlIlIIIIlIl.hc.moreItemIds().split(lIIIIIlI[lIIIIIll[12]]);
        int[] lllIIlIlIIIIIll = new int[lllIIlIlIIIIlII.length + lIIIIIll[1]];
        lllIIlIlIIIIIll[bV.lIIIIIll[0]] = lllIIlIlIIIIlIl.hc.buyItemId();
        int lllIIlIlIIIIIlI = lIIIIIll[1];
        String[] lllIIlIlIIIIIIl = lllIIlIlIIIIlII;
        int lllIIlIlIIIIIII = lllIIlIlIIIIIIl.length;
        int lllIIlIIlllllll = lIIIIIll[0];
        while (bV.llllllIlI(lllIIlIIlllllll, lllIIlIlIIIIIII)) {
            String lllIIlIIllllllI = lllIIlIlIIIIIIl[lllIIlIIlllllll];
            try {
                lllIIlIlIIIIIll[lllIIlIlIIIIIlI++] = Integer.parseInt(lllIIlIIllllllI);
            }
            catch (NumberFormatException lllIIlIIlllllIl) {
                lllIIlIlIIIIIll[lllIIlIlIIIIIlI++] = lllIIlIlIIIIlIl.hc.buyItemId();
            }
            0;
            if (((1 ^ 0x43) & ~(0x4D ^ 0xF)) > ((0x17 ^ 0x28) & ~(0x2E ^ 0x11))) {
                return null;
            }
            ++lllIIlIIlllllll;
            0;
            if (1 < 3) continue;
            return null;
        }
        return var2_2;
    }

    public boolean run() {
        NPC nPC2;
        bV lllIIlIlIIllIII;
        if (bV.lllllIlll(Inventory.isFull() ? 1 : 0)) {
            return lIIIIIll[0];
        }
        Player lllIIlIlIIlIlll = Players.getLocal();
        if (bV.llllllIII(lllIIlIlIIlIlll)) {
            return lIIIIIll[0];
        }
        if (bV.llllllIII(lllIIlIlIIllIII.hb.cW())) {
            lllIIlIlIIllIII.hb.n(lllIIlIlIIlIlll.getWorldLocation());
            Object[] objectArray = new Object[lIIIIIll[1]];
            objectArray[bV.lIIIIIll[0]] = lllIIlIlIIllIII.hb.cW();
            Log.info((String)lIIIIIlI[lIIIIIll[0]], (Object[])objectArray);
        }
        if (bV.lllllIlll(Shop.isOpen() ? 1 : 0)) {
            if (bV.llllllIIl(lllIIlIlIIlIlll.distanceTo(lllIIlIlIIllIII.hb.cW()), lIIIIIll[2])) {
                Log.info((String)lIIIIIlI[lIIIIIll[1]]);
                lllIIlIlIIllIII.hb.n(lllIIlIlIIlIlll.getWorldLocation());
            }
            if (bV.lllllIlll(lllIIlIlIIllIII.hd ? 1 : 0)) {
                Keyboard.type((char)lIIIIIll[3]);
                return lIIIIIll[1];
            }
            lllIIlIlIIllIII.hd = lIIIIIll[1];
            int n2 = Static.getClient().getWorldType().contains(WorldType.SEASONAL);
            int[] lllIIlIlIIlIlIl = lllIIlIlIIllIII.bO();
            int lllIIlIlIIlIlII = lllIIlIlIIlIlIl.length;
            int lllIIlIlIIlIIll = lIIIIIll[0];
            while (bV.llllllIlI(lllIIlIlIIlIIll, lllIIlIlIIlIlII)) {
                int lllIIlIlIIIllll;
                int lllIIlIlIIlIIlI = lllIIlIlIIlIlIl[lllIIlIlIIlIIll];
                int lllIIlIlIIlIIIl = Shop.getStock((int)lllIIlIlIIlIIlI);
                if (bV.lllllIlll(n2)) {
                    block25: {
                        Runnable runnable;
                        lllIIlIlIIllIII.hd = lIIIIIll[0];
                        if (bV.llllllIll(lllIIlIlIIlIIIl, lIIIIIll[1])) {
                            runnable = () -> Shop.buyOne((int)lllIIlIlIIlIIlI);
                            0;
                            
                            }
                        } else {
                            runnable = () -> Shop.buyFive((int)lllIIlIlIIlIIlI);
                        }
                        Runnable lllIIlIlIIlIIII = runnable;
                        lllIIlIlIIIllll = lIIIIIll[0];
                        do {
                            int n3;
                            if (bV.llllllIll(lllIIlIlIIlIIIl, lIIIIIll[1])) {
                                n3 = lIIIIIll[4];
                                0;
                                if (3 <= 1) {
                                    return ((0x1A ^ 0x2F ^ (0x90 ^ 0x94)) & (0x7F ^ 0x29 ^ (0xDC ^ 0xBB) ^ -1)) != 0;
                                }
                            } else {
                                n3 = lIIIIIll[5];
                            }
                            if (!bV.llllllIlI(lllIIlIlIIIllll, n3)) break block25;
                            lllIIlIlIIlIIII.run();
                            ++lllIIlIlIIIllll;
                            0;
                        } while (-3 <= 0);
                        return false;
                    }
                    0;
                    if (-1 >= 0) {
                        return ((0x13 ^ 6 ^ (0x59 ^ 0x6C)) & (0x70 ^ 0x60 ^ (0x4C ^ 0x7C) ^ -1)) != 0;
                    }
                } else if (bV.lllllllII(lllIIlIlIIlIIIl, lllIIlIlIIllIII.hc.itemMinStock())) {
                    lllIIlIlIIllIII.hd = lIIIIIll[0];
                    int lllIIlIlIIlIIII = Math.max(lIIIIIll[1], Math.min(lIIIIIll[4], (lllIIlIlIIlIIIl - lllIIlIlIIllIII.hc.itemMinStock()) / lIIIIIll[6]));
                    lllIIlIlIIIllll = lIIIIIll[0];
                    while (bV.llllllIlI(lllIIlIlIIIllll, lllIIlIlIIlIIII)) {
                        Shop.buyFifty((int)lllIIlIlIIlIIlI);
                        ++lllIIlIlIIIllll;
                        0;
                        if (-1 <= 0) continue;
                        return false;
                    }
                }
                ++lllIIlIlIIlIIll;
                0;
                if (-3 < 0) continue;
                return ((108 + 24 - 9 + 11 ^ 102 + 98 - 132 + 99) & (0x4F ^ 0x63 ^ (0x1F ^ 0x12) ^ -1)) != 0;
            }
            return lIIIIIll[1];
        }
        if (bV.lllllIlll(lllIIlIlIIllIII.hd ? 1 : 0)) {
            World world2 = Worlds.getRandom(world -> {
                int n2;
                if (bV.lllllIlll(world.isNormal() ? 1 : 0) && bV.lllllIlll(world.isMembers() ? 1 : 0)) {
                    n2 = lIIIIIll[1];
                    0;
                    if (2 < 0) {
                        return ((72 + 97 - 130 + 90 ^ 110 + 86 - 87 + 32) & (0x4A ^ 0x78 ^ (0x17 ^ 0x29) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIIIIll[0];
                }
                return n2 != 0;
            });
            Object[] objectArray = new Object[lIIIIIll[1]];
            objectArray[bV.lIIIIIll[0]] = world2.getId();
            Log.info((String)lIIIIIlI[lIIIIIll[7]], (Object[])objectArray);
            Worlds.hopTo((World)world2);
            lllIIlIlIIllIII.hd = lIIIIIll[0];
            return lIIIIIll[1];
        }
        if (bV.lllllllIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIIIIIll[0];
        }
        if (bV.llllllIIl(lllIIlIlIIlIlll.distanceTo(lllIIlIlIIllIII.hb.cW()), lIIIIIll[8])) {
            Log.info((String)lIIIIIlI[lIIIIIll[9]]);
            if (bV.llllllIIl(lllIIlIlIIlIlll.distanceTo(lllIIlIlIIllIII.hb.cW()), lIIIIIll[8])) {
                Object[] objectArray = new Object[lIIIIIll[1]];
                objectArray[bV.lIIIIIll[0]] = lllIIlIlIIllIII.hb.cW();
                Log.info((String)lIIIIIlI[lIIIIIll[10]], (Object[])objectArray);
                Movement.walkTo((WorldPoint)lllIIlIlIIllIII.hb.cW());
                0;
                return lIIIIIll[1];
            }
        }
        if (bV.llllllllI(nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (bV.llllllIll(nPC.getId(), this.hc.shopperId()) && bV.lllllIlll(nPC.hasAction(lIIIIIlI[lIIIIIll[13]]::equals) ? 1 : 0)) {
                n2 = lIIIIIll[1];
                0;
                if (3 <= 1) {
                    return ((193 + 152 - 134 + 10 ^ 115 + 109 - 178 + 93) & (5 ^ 0x5D ^ (0x6D ^ 0x63) ^ -1)) != 0;
                }
            } else {
                n2 = lIIIIIll[0];
            }
            return n2 != 0;
        }))) {
            nPC2.interact(lIIIIIlI[lIIIIIll[5]]);
            return lIIIIIll[1];
        }
        TileObject lllIIlIlIIlIlIl = TileObjects.getNearest(tileObject -> {
            boolean bl2;
            if (bV.llllllIll(tileObject.getId(), this.hc.shopperId())) {
                bl2 = lIIIIIll[1];
                0;
                
                }
            } else {
                bl2 = lIIIIIll[0];
            }
            return bl2;
        });
        if (bV.llllllllI(lllIIlIlIIlIlIl)) {
            String[] stringArray = new String[lIIIIIll[7]];
            stringArray[bV.lIIIIIll[0]] = lIIIIIlI[lIIIIIll[2]];
            stringArray[bV.lIIIIIll[1]] = lIIIIIlI[lIIIIIll[11]];
            lllIIlIlIIlIlIl.interact(stringArray);
            return lIIIIIll[1];
        }
        Log.info((String)lIIIIIlI[lIIIIIll[4]]);
        return lIIIIIll[0];
    }

    private static boolean lllllllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIlll(int n2) {
        return n2 != 0;
    }

    private static String lllllIIll(String lllIIlIIlIlIllI, String lllIIlIIlIllIlI) {
        lllIIlIIlIlIllI = new String(Base64.getDecoder().decode(lllIIlIIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIlIIlIllIIl = new StringBuilder();
        char[] lllIIlIIlIllIII = lllIIlIIlIllIlI.toCharArray();
        int lllIIlIIlIlIlll = lIIIIIll[0];
        char[] lllIIlIIlIlIIIl = lllIIlIIlIlIllI.toCharArray();
        int lllIIlIIlIlIIII = lllIIlIIlIlIIIl.length;
        int lllIIlIIlIIllll = lIIIIIll[0];
        while (bV.llllllIlI(lllIIlIIlIIllll, lllIIlIIlIlIIII)) {
            char lllIIlIIlIlllII = lllIIlIIlIlIIIl[lllIIlIIlIIllll];
            lllIIlIIlIllIIl.append((char)(lllIIlIIlIlllII ^ lllIIlIIlIllIII[lllIIlIIlIlIlll % lllIIlIIlIllIII.length]));
            0;
            ++lllIIlIIlIlIlll;
            ++lllIIlIIlIIllll;
            0;
            if (1 >= ((0xB7 ^ 0xBF) & ~(0x99 ^ 0x91))) continue;
            return null;
        }
        return String.valueOf(lllIIlIIlIllIIl);
    }

    private static boolean llllllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllllllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIII(Object object) {
        return object == null;
    }
}

