/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Running water", priority=50, register=true)
public class RunningWaterTask
extends AutotoaManager {
    
    private  boolean hz;
    private  Point hx;
    private  int hy;
    private static final  int hv;
    private static final  int hu;
    
    private static final  int hw;

    static {
        bZ.var3();
        bZ.var4();
        hw = var1[9];
        hu = var1[10];
        hv = var1[11];
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[2];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[2];
        while (bZ.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if ((14 + 7 - -56 + 58 ^ 92 + 124 - 134 + 48) > 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    @Override
    public boolean bl() {
        bZ var16;
        int[] nArray = new int[var1[3]];
        nArray[bZ.var1[2]] = var1[4];
        if (bZ.var17(Inventory.contains((int[])nArray) ? 1 : 0)) {
            this.hy = var1[2];
            return this.cJ();
        }
        WorldPoint var18 = var16.a(var16.hx);
        if (bZ.var17(var18.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0) && bZ.var17(var16.hy)) {
            Log.info((String)var2[var1[2]]);
            Movement.setDestination((WorldPoint)var18);
            return var1[3];
        }
        if (bZ.var19(var18.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var16.hy = var1[3];
        }
        if (bZ.var17(var16.hz)) {
            return var16.cI();
        }
        return this.cH();
    }

    /*
     * WARNING - void declaration
     */
    private boolean cH() {
        void var2_2;
        int[] nArray = new int[var1[3]];
        nArray[bZ.var1[2]] = this.aX();
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (bZ.var20(nPC)) {
            return var1[2];
        }
        int[] nArray2 = new int[var1[3]];
        nArray2[bZ.var1[2]] = var1[4];
        Item var21 = Inventory.getFirst((int[])nArray2);
        if (bZ.var20(var21)) {
            return var1[2];
        }
        var2_2.useOn((Actor)nPC);
        return var1[3];
    }

    private boolean cJ() {
        TileObject tileObject = this.cK();
        if (bZ.var20(tileObject)) {
            return var1[2];
        }
        if (bZ.var19(Inventory.isFull() ? 1 : 0)) {
            bZ var22;
            var22.bh();
            return var1[3];
        }
        int[] nArray = new int[var1[3]];
        nArray[bZ.var1[2]] = var1[4];
        TileItem var23 = TileItems.getNearest((int[])nArray);
        if (bZ.var24(var23)) {
            var23.interact(var2[var1[6]]);
            return var1[3];
        }
        return var1[2];
    }

    private static boolean var25(Object object, Object object2) {
        return object != object2;
    }

    private TileObject cK() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (bZ.var19(tileObject.getName().equals(var2[var1[7]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[3]];
                stringArray[bZ.var1[2]] = var2[var1[8]];
                if (bZ.var19(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[3];
                    0;
                    if (1 >= -1) return n2 != 0;
                    return ((84 + 201 - 140 + 91 ^ 0 + 45 - -28 + 90) & (64 + 117 - 74 + 35 ^ 2 + 141 - 66 + 116 ^ -1)) != 0;
                }
            }
            n2 = var1[2];
            return n2 != 0;
        });
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var17(int n2) {
        return n2 == 0;
    }

    private static void var4() {
        var2 = new String[var1[12]];
        bZ.var2[bZ.var1[2]] = "Walking to start";
        bZ.var2[bZ.var1[3]] = "You fill your container.";
        bZ.var2[bZ.var1[5]] = "You empty a";
        bZ.var2[bZ.var1[6]] = "Take";
        bZ.var2[bZ.var1[7]] = "Waterfall";
        bZ.var2[bZ.var1[8]] = "Fill";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var26;
        if (bZ.var25(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var27 = var26.getMessage();
        if (bZ.var19(var27.contains(var2[var1[3]]) ? 1 : 0)) {
            var28.hz = var1[3];
            0;
            if (3 <= ((0xB6 ^ 0x81) & ~(0x3D ^ 0xA))) {
                return;
            }
        } else if (bZ.var19(var27.contains(var2[var1[5]]) ? 1 : 0)) {
            var28.hz = var1[2];
        }
    }

    @Inject
    protected RunningWaterTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.hx = new Point(var1[0], var1[1]);
        this.hy = var1[2];
    }

    private static boolean var24(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cI() {
        void var2_2;
        TileObject tileObject = this.cK();
        if (bZ.var20(tileObject)) {
            return var1[2];
        }
        int[] nArray = new int[var1[3]];
        nArray[bZ.var1[2]] = var1[4];
        Item var29 = Inventory.getFirst((int[])nArray);
        if (bZ.var20(var29)) {
            return var1[2];
        }
        var2_2.useOn(tileObject);
        return var1[3];
    }

    private static boolean var20(Object object) {
        return object == null;
    }

    private static void var3() {
        var1 = new int[14];
        bZ.var1[0] = 0xB5 ^ 0x9D;
        bZ.var1[1] = 0x44 ^ 0x69;
        bZ.var1[2] = (0xAF ^ 0xC4 ^ (0x59 ^ 0x7F)) & (0x6C ^ 0x76 ^ (0x5F ^ 8) ^ -1);
        bZ.var1[3] = 1;
        bZ.var1[4] = -(0xFFFFD7BF & 0x2D61) & (0xFFFFEFFF & 0x7FBF);
        bZ.var1[5] = 2;
        bZ.var1[6] = 3;
        bZ.var1[7] = 0x57 ^ 0x53;
        bZ.var1[8] = 0x2E ^ 0x2B;
        bZ.var1[9] = -(0xFFFFF7A5 & 0x4EFF) & (0xFFFFFFFF & 0xF7FF);
        bZ.var1[10] = 0xFFFFF1EF & 0xBF77;
        bZ.var1[11] = -(0xFFFFAEB3 & 0x536D) & (0xFFFFFF7B & 0x27FF);
        bZ.var1[12] = 0xCC ^ 0xC4 ^ (0x24 ^ 0x2A);
        bZ.var1[13] = 0x2F ^ 0x27;
    }

    private static boolean var19(int n2) {
        return n2 != 0;
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }
}

