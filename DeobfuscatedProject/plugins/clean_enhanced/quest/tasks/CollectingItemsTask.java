/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Quest
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.quest.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Quest;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.pathfinder.Walker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.quest.tasks.GameEnum4;

@TaskDesc(name="Collecting Items")
public class CollectingItemsTask
extends Task {

    private static final  Logger ag;
    private final  Client ah;
    private final  SquireQuesterConfig ai;

    private int a(int n2) {
        Object[] objectArray = new Object[var1[8]];
        objectArray[l.var1[0]] = var1[21];
        objectArray[l.var1[1]] = n2;
        this.ah.runScript(objectArray);
        return this.ah.getIntStack()[var1[0]];
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    @Inject
    public CollectingItemsTask(Client client, SquireQuesterConfig squireQuesterConfig) {
        this.ah = client;
        this.ai = squireQuesterConfig;
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (l.var9(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (3 != (0x59 ^ 0x4D ^ (0x8C ^ 0x9C))) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean var22(int n2, int n3) {
        return n2 > n3;
    }

    private static void var23() {
        var1 = new int[29];
        l.var1[0] = 2 & (2 ^ -1);
        l.var1[1] = 1;
        l.var1[2] = -(0xFFFFCF2E & 0x7CDF) & (0xFFFFEFFF & 0x5FBF);
        l.var1[3] = 0xFFFFECCD & 0x1FB7;
        l.var1[4] = -(0xF7 ^ 0x93) & (0xFFFFCCFF & 0x3FEF);
        l.var1[5] = -(0xFFFFE0E7 & 0x5F39) & (0xFFFFCCE7 & 0x7FBE);
        l.var1[6] = 0xFFFFED5E & 0x1AFF;
        l.var1[7] = 0xFFFF9DF6 & 0x6A5F;
        l.var1[8] = 2;
        l.var1[9] = 3;
        l.var1[10] = 0xB ^ 0x52 ^ (0x39 ^ 0x64);
        l.var1[11] = 0xFFFFFE8F & 0xDFB;
        l.var1[12] = 0xFFFFCCFF & 0x3F8F;
        l.var1[13] = -(0xFFFFC835 & 0x77DF) & (0xFFFFFFF7 & 0x43FF);
        l.var1[14] = 0xF1 ^ 0xA6 ^ (0x51 ^ 9);
        l.var1[15] = 0xFFFFFFFF & 0x57F9;
        l.var1[16] = 0x77 ^ 0x72;
        l.var1[17] = -(0xFFFFFAFD & 0x47E3) & (0xFFFFFBE7 & 0x4FFD);
        l.var1[18] = 0x88 ^ 0xC0 ^ (0x45 ^ 0xB);
        l.var1[19] = 0xFFFFBBC5 & 0x4FFF;
        l.var1[20] = 88 + 110 - 41 + 2 ^ 69 + 31 - 5 + 57;
        l.var1[21] = 0xFFFF8FFF & 0x7FB8;
        l.var1[22] = 0x1C ^ 0x14;
        l.var1[23] = 0x54 ^ 0x2E ^ (0x37 ^ 0x44);
        l.var1[24] = 169 + 97 - 87 + 4 ^ 156 + 124 - 190 + 99;
        l.var1[25] = 0xB0 ^ 0xC0 ^ (0xEF ^ 0x94);
        l.var1[26] = -(0xFFFFBB79 & 0x56EF) & (0xFFFF9FFE & 0x7EFF);
        l.var1[27] = -(0xFFFFDBDD & 0x366F) & (0xFFFFFEFF & 0x1FDF);
        l.var1[28] = 0x92 ^ 0x9E;
    }

    public boolean run() {
        TileItem var24;
        l var25;
        if (l.var26((Object)this.ai.quest(), (Object)h.BELOW_ICE_MOUNTAIN)) {
            return var1[0];
        }
        if (l.var27(var25.a(Quest.BELOW_ICE_MOUNTAIN.getId()))) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[l.var1[0]] = var1[2];
        if (l.var11(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var1[1]];
            nArray2[l.var1[0]] = var1[2];
            var24 = TileItems.getFirstAt((WorldPoint)new WorldPoint(var1[3], var1[4], var1[0]), (int[])nArray2);
            if (l.var28(var24)) {
                Walker.walkTo((WorldPoint)new WorldPoint(var1[5], var1[4], var1[0]));
                0;
                0;
                if (-1 >= ((0xBF ^ 0x9A) & ~(0xAC ^ 0x89))) {
                    return ((0x36 ^ 0x1F) & ~(0x88 ^ 0xA1)) != 0;
                }
            } else {
                var24.interact(var2[var1[0]]);
            }
        }
        int[] nArray3 = new int[var1[1]];
        nArray3[l.var1[0]] = var1[6];
        if (l.var11(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[var1[1]];
            nArray4[l.var1[0]] = var1[7];
            if (l.var11(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[l.var1[0]] = var2[var1[1]];
                var24 = NPCs.getNearest((String[])stringArray);
                int[] nArray5 = new int[var1[1]];
                nArray5[l.var1[0]] = var1[7];
                TileItem var29 = TileItems.getNearest((int[])nArray5);
                if (l.var28(var29)) {
                    if (l.var10(var24)) {
                        var24.interact(var2[var1[8]]);
                        0;
                        if (((22 + 55 - 60 + 135 ^ 84 + 91 - 30 + 46) & (0xB1 ^ 0xBB ^ (5 ^ 0x28) ^ -1)) != 0) {
                            return ((0x78 ^ 0x24 ^ (0xDA ^ 0xAF)) & (16 + 56 - -17 + 55 ^ 135 + 77 - 163 + 136 ^ -1)) != 0;
                        }
                    }
                } else {
                    var29.interact(var2[var1[9]]);
                }
                0;
                if (((0x71 ^ 0x43) & ~(0x6C ^ 0x5E)) != 0) {
                    return ((0xB7 ^ 0x8F) & ~(4 ^ 0x3C)) != 0;
                }
            } else {
                String[] stringArray = new String[var1[1]];
                stringArray[l.var1[0]] = var2[var1[10]];
                TileObject var29 = TileObjects.getNearest((String[])stringArray);
                if (l.var28(var29)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(var1[11], var1[12], var1[0]));
                    0;
                    0;
                    if null != null {
                        return ((0x54 ^ 0x17 ^ (0x35 ^ 0x3E)) & (0x38 ^ 0x44 ^ (0xBD ^ 0x89) ^ -1)) != 0;
                    }
                } else {
                    int[] nArray6 = new int[var1[1]];
                    nArray6[l.var1[0]] = var1[7];
                    Inventory.getFirst((int[])nArray6).useOn(var29);
                }
            }
        }
        int[] nArray7 = new int[var1[1]];
        nArray7[l.var1[0]] = var1[13];
        if (l.var11(Inventory.contains((int[])nArray7) ? 1 : 0)) {
            var25.x();
        }
        int[] nArray8 = new int[var1[1]];
        nArray8[l.var1[0]] = var1[13];
        if (l.var9(Inventory.getCount((boolean)var1[1], (int[])nArray8), var1[14])) {
            int[] nArray9 = new int[var1[1]];
            nArray9[l.var1[0]] = var1[15];
            if (l.var27(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[var1[1]];
                nArray10[l.var1[0]] = var1[15];
                Inventory.getFirst((int[])nArray10).interact(var2[var1[16]]);
            }
            var25.x();
        }
        int[] nArray11 = new int[var1[1]];
        nArray11[l.var1[0]] = var1[17];
        if (l.var11(Inventory.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[var1[1]];
            nArray12[l.var1[0]] = var1[13];
            if (l.var30(Inventory.getCount((boolean)var1[1], (int[])nArray12), var1[14])) {
                String[] stringArray = new String[var1[1]];
                stringArray[l.var1[0]] = var2[var1[18]];
                var24 = NPCs.getNearest((String[])stringArray);
                if (l.var27(Shop.isOpen() ? 1 : 0)) {
                    Shop.buyOne((int)var1[17]);
                    0;
                    if (((0x27 ^ 0x3E ^ (0x89 ^ 0xA5)) & (0x66 ^ 0x29 ^ (0xCB ^ 0xB1) ^ -1)) != 0) {
                        return ((66 + 0 - -76 + 87 ^ 144 + 95 - 64 + 18) & (0x1B ^ 6 ^ (0x6A ^ 0x53) ^ -1)) != 0;
                    }
                } else if (l.var28(var24)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(var1[19], var1[3], var1[0]));
                    0;
                    0;
                    if (((187 + 101 - 158 + 82 ^ 71 + 104 - 174 + 139) & (90 + 164 - 153 + 145 ^ 78 + 75 - 151 + 172 ^ -1)) >= (0x53 ^ 0x2E ^ (0x35 ^ 0x4C))) {
                        return ((0xD3 ^ 0x80 ^ (0xE2 ^ 0xAE)) & (49 + 56 - 45 + 128 ^ 11 + 24 - -104 + 24 ^ -1)) != 0;
                    }
                } else {
                    var24.interact(var2[var1[20]]);
                }
            }
        }
        return var1[0];
    }

    private static boolean var30(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var26(Object object, Object object2) {
        return object != object2;
    }

    private static void var31() {
        var2 = new String[var1[28]];
        l.var2[l.var1[0]] = "Take";
        l.var2[l.var1[1]] = "Giant rat";
        l.var2[l.var1[8]] = "Attack";
        l.var2[l.var1[9]] = "Take";
        l.var2[l.var1[10]] = "Cooking range";
        l.var2[l.var1[16]] = "Open-all";
        l.var2[l.var1[18]] = "Wydin";
        l.var2[l.var1[20]] = "Trade";
        l.var2[l.var1[22]] = "Man";
        l.var2[l.var1[23]] = "Woman";
        l.var2[l.var1[24]] = "Pickpocket";
        l.var2[l.var1[25]] = "No health, waiting to heal";
    }

    static {
        l.var23();
        l.var31();
        ag = LoggerFactory.getLogger(CollectingItemsTask.class);
    }

    private static boolean var28(Object object) {
        return object == null;
    }

    private void x() {
        String[] stringArray = new String[var1[8]];
        stringArray[l.var1[0]] = var2[var1[22]];
        stringArray[l.var1[1]] = var2[var1[23]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (l.var10(nPC)) {
            if (l.var22(Combat.getCurrentHealth(), var1[8])) {
                nPC.interact(var2[var1[24]]);
                0;
                if (((0xA1 ^ 0xB4) & ~(0x79 ^ 0x6C)) != 0) {
                    return;
                }
            } else {
                System.out.println(var2[var1[25]]);
                0;
                if (((3 ^ 0x52 ^ (0x7E ^ 0x17)) & (0x30 ^ 0x1D ^ (6 ^ 0x13) ^ -1)) != 0) {
                    return;
                }
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(var1[26], var1[27], var1[0]));
            0;
        }
    }

    private static boolean var27(int n2) {
        return n2 != 0;
    }
}

