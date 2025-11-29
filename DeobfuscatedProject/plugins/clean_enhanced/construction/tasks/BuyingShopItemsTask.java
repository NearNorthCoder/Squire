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
package gg.squire.construction.tasks;

import gg.squire.basics.shop.SquireShopBuyer;
import gg.squire.basics.shop.SquireShopConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
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

@TaskDesc(name="Buying shop items")
public class BuyingShopItemsTask
extends Task {
    private static  String[] lIIIIIlI;
    private static  int[] lIIIIIll;
    private  SquireShopConfig hc;
    private  boolean hd;
    private  SquireShopBuyer hb;

        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static void lllllIlIl() {
        lIIIIIlI = new String[8];
        bV.lIIIIIlI[0] = "Starting location set to {}";
        bV.lIIIIIlI[1] = "Updating the starting location as we seem to have moved a bit.";
        bV.lIIIIIlI[7] = "Hopping to world {}";
        bV.lIIIIIlI[9] = "We're far away from the shop location, walking back.";
        bV.lIIIIIlI[bV.lIIIIIll[10]] = "Walking to {}";
        bV.lIIIIIlI[5] = "Trade";
        bV.lIIIIIlI[2] = "Trade";
        bV.lIIIIIlI[bV.lIIIIIll[11]] = "Buy-food";
        bV.lIIIIIlI[4] = "Reached end of BuyShopItem with no action taken.";
        bV.lIIIIIlI[bV.lIIIIIll[12]] = ",";
        bV.lIIIIIlI[bV.lIIIIIll[13]] = "Trade";
    }

    @Inject
    public BuyingShopItemsTask(SquireShopBuyer squireShopBuyer, SquireShopConfig squireShopConfig) {
        this.hb = squireShopBuyer;
        this.hc = squireShopConfig;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private int[] bO() {
        void var2_2;
        bV var11;
        if ((this.hc.moreItemIds( != 0).trim().isEmpty() ? 1 : 0)) {
            int[] nArray = new int[1];
            nArray[0] = this.hc.buyItemId();
            return nArray;
        }
        String[] var12 = var11.hc.moreItemIds().split(lIIIIIlI[lIIIIIll[12]]);
        int[] var13 = new int[var12.length + 1];
        var13[0] = var11.hc.buyItemId();
        int var14 = 1;
        String[] var15 = var12;
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < var16) {
            String var18 = var15[var17];
            try {
                var13[var14++] = Integer.parseInt(var18);
            }
            catch (NumberFormatException var19) {
                var13[var14++] = var11.hc.buyItemId();
            }
            0;
            if (((1 ^ 0x43) & ~(0x4D ^ 0xF)) > ((0x17 ^ 0x28) & ~(0x2E ^ 0x11))) {
                return null;
            }
            ++var17;
            0;
            if (1 < 3) continue;
            return null;
        }
        return var2_2;
    }

    public boolean run() {
        NPC nPC2;
        bV var20;
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            return 0;
        }
        Player var21 = Players.getLocal();
        if var21 == null {
            return 0;
        }
        if ((var20.hb.cW( == null))) {
            var20.hb.n(var21.getWorldLocation());
            Object[] objectArray = new Object[1];
            objectArray[0] = var20.hb.cW();
            Log.info((String)lIIIIIlI[0], (Object[])objectArray);
        }
        if ((Shop.isOpen( != 0) ? 1 : 0)) {
            if ((var21.distanceTo(var20.hb.cW()) > 2)) {
                Log.info((String)lIIIIIlI[1]);
                var20.hb.n(var21.getWorldLocation());
            }
            if (var20.hd != 0) {
                Keyboard.type((char)3);
                return 1;
            }
            var20.hd = 1;
            int n2 = Static.getClient().getWorldType().contains(WorldType.SEASONAL);
            int[] var22 = var20.bO();
            int var23 = var22.length;
            int var24 = 0;
            while (var24 < var23) {
                int var25;
                int var26 = var22[var24];
                int var27 = Shop.getStock((int)var26);
                if n2 {
                    block25: {
                        Runnable runnable;
                        var20.hd = 0;
                        if (var27 == 1) {
                            runnable = () -> Shop.buyOne((int)var26);
                            0;
                            if null != null {
                                return (2 & ~2) != 0;
                            }
                        } else {
                            runnable = () -> Shop.buyFive((int)var26);
                        }
                        Runnable var28 = runnable;
                        var25 = 0;
                        do {
                            int n3;
                            if (var27 == 1) {
                                n3 = 4;
                                0;
                                if (3 <= 1) {
                                    return ((0x1A ^ 0x2F ^ (0x90 ^ 0x94)) & (0x7F ^ 0x29 ^ (0xDC ^ 0xBB) ^ -1)) != 0;
                                }
                            } else {
                                n3 = 5;
                            }
                            if (!(var25 < n3)) break block25;
                            var28.run();
                            ++var25;
                            0;
                        } while (-3 <= 0);
                        return ((10 + 105 - 48 + 80 ^ 55 + 47 - -75 + 9) & (7 + 29 - -10 + 192 ^ 92 + 189 - 112 + 30 ^ -1)) != 0;
                    }
                    0;
                    if (-1 >= 0) {
                        return ((0x13 ^ 6 ^ (0x59 ^ 0x6C)) & (0x70 ^ 0x60 ^ (0x4C ^ 0x7C) ^ -1)) != 0;
                    }
                } else if ((var27 >= var20.hc.itemMinStock())) {
                    var20.hd = 0;
                    int var28 = Math.max(1, Math.min(4, (var27 - var20.hc.itemMinStock()) / 6));
                    var25 = 0;
                    while (var25 < var28) {
                        Shop.buyFifty((int)var26);
                        ++var25;
                        0;
                        if (-1 <= 0) continue;
                        return ((0xD9 ^ 0x89) & ~(0x95 ^ 0xC5)) != 0;
                    }
                }
                ++var24;
                0;
                if (-3 < 0) continue;
                return ((108 + 24 - 9 + 11 ^ 102 + 98 - 132 + 99) & (0x4F ^ 0x63 ^ (0x1F ^ 0x12) ^ -1)) != 0;
            }
            return 1;
        }
        if (var20.hd != 0) {
            World world2 = Worlds.getRandom(world -> {
                int n2;
                if ((world.isNormal( != 0) ? 1 : 0) && (world.isMembers( != 0) ? 1 : 0)) {
                    n2 = 1;
                    0;
                    if (2 < 0) {
                        return ((72 + 97 - 130 + 90 ^ 110 + 86 - 87 + 32) & (0x4A ^ 0x78 ^ (0x17 ^ 0x29) ^ -1)) != 0;
                    }
                } else {
                    n2 = 0;
                }
                return n2 != 0;
            });
            Object[] objectArray = new Object[1];
            objectArray[0] = world2.getId();
            Log.info((String)lIIIIIlI[7], (Object[])objectArray);
            Worlds.hopTo((World)world2);
            var20.hd = 0;
            return 1;
        }
        if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var21.distanceTo(var20.hb.cW()) > 8)) {
            Log.info((String)lIIIIIlI[9]);
            if ((var21.distanceTo(var20.hb.cW()) > 8)) {
                Object[] objectArray = new Object[1];
                objectArray[0] = var20.hb.cW();
                Log.info((String)lIIIIIlI[lIIIIIll[10]], (Object[])objectArray);
                Movement.walkTo((WorldPoint)var20.hb.cW());
                0;
                return 1;
            }
        }
        if ((nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getId( != null) == this.hc.shopperId()) && (nPC.hasAction(lIIIIIlI[lIIIIIll[13]]::equals != 0) ? 1 : 0)) {
                n2 = 1;
                0;
                if (3 <= 1) {
                    return ((193 + 152 - 134 + 10 ^ 115 + 109 - 178 + 93) & (5 ^ 0x5D ^ (0x6D ^ 0x63) ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        }))) {
            nPC2.interact(lIIIIIlI[5]);
            return 1;
        }
        TileObject var22 = TileObjects.getNearest(tileObject -> {
            boolean bl2;
            if ((tileObject.getId() == this.hc.shopperId())) {
                bl2 = 1;
                0;
                if null != null {
                    return ((0xED ^ 0xAD) & ~(0x72 ^ 0x32)) != 0;
                }
            } else {
                bl2 = 0;
            }
            return bl2;
        });
        if var22 != null {
            String[] stringArray = new String[7];
            stringArray[0] = lIIIIIlI[2];
            stringArray[1] = lIIIIIlI[lIIIIIll[11]];
            var22.interact(stringArray);
            return 1;
        }
        Log.info((String)lIIIIIlI[4]);
        return 0;
    }

    private static String lllllIIll(String var29, String var30) {
        var29 = new String(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var31 = new StringBuilder();
        char[] var32 = var30.toCharArray();
        int var33 = 0;
        char[] var34 = var29.toCharArray();
        int var35 = var34.length;
        int var36 = 0;
        while (var36 < var35) {
            char var37 = var34[var36];
            var31.append((char)(var37 ^ var32[var33 % var32.length]));
            0;
            ++var33;
            ++var36;
            0;
            if (1 >= ((0xB7 ^ 0xBF) & ~(0x99 ^ 0x91))) continue;
            return null;
        }
        return String.valueOf(var31);
    }

}

