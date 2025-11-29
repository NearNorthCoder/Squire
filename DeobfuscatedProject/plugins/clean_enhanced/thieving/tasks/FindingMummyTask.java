/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquirePlunderConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.ThievingManager;

@TaskDesc(name="Finding Mummy", priority=15, register=true)
public class FindingMummyTask
extends Task {
    
    private final  Client H;
    
    private final  a F;
    private final  SquirePlunderConfig G;

    private static void var3() {
        var1 = new String[var2[15]];
        m.var1[m.var2[1]] = "Tomb Door";
        m.var1[m.var2[2]] = "Quick-leave";
        m.var1[m.var2[4]] = "Tomb Door";
        m.var1[m.var2[5]] = "Leave Tomb";
        m.var1[m.var2[6]] = "An anonymous looking door";
        m.var1[m.var2[13]] = "You find a door! You open it.";
        m.var1[m.var2[14]] = "Search";
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static void var5() {
        var2 = new int[17];
        m.var2[0] = -(0xFFFFB3B7 & 0x7EE9) & (0xFFFFFFFF & 0x3BE7);
        m.var2[1] = (109 + 72 - 56 + 71 ^ 123 + 91 - 166 + 94) & (0xAC ^ 0xBB ^ (0xF ^ 0x52) ^ -1);
        m.var2[2] = 1;
        m.var2[3] = -(0xFFFFFB1D & 0x75EB) & (0xFFFFF7FF & 0x7FFB);
        m.var2[4] = 2;
        m.var2[5] = 3;
        m.var2[6] = 0xBC ^ 0xB8;
        m.var2[7] = -(0xFFFF8F27 & 0x71FD) & (0xFFFF8DFF & 0x7FFD);
        m.var2[8] = 0xFFFF8EF6 & 0x7BFB;
        m.var2[9] = 0xFFFFFBFF & 0x55EE;
        m.var2[10] = 0xFFFFF1F7 & 0x5FF9;
        m.var2[11] = 0xFFFFF74D & 0x5BB7;
        m.var2[12] = 0xFFFFF3FB & 0x5DFF;
        m.var2[13] = 0xB9 ^ 0xBC;
        m.var2[14] = 0xB0 ^ 0x94 ^ (0x7A ^ 0x58);
        m.var2[15] = 0x4D ^ 0x4A;
        m.var2[16] = 0x9A ^ 0x86 ^ (0x5F ^ 0x4B);
    }

    private static boolean var6(int n2, int n3) {
        return n2 >= n3;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var2[1];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var2[1];
        while (m.var22(var21, var20)) {
            char var23 = var19[var21];
            var16.append((char)(var23 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private void c(int n2) {
        int[] nArray = new int[var2[2]];
        nArray[m.var2[1]] = n2;
        if (m.var4(TileObjects.getNearest((int[])nArray))) {
            return;
        }
        int[] nArray2 = new int[var2[2]];
        nArray2[m.var2[1]] = n2;
        TileObjects.getNearest((int[])nArray2).interact(var1[var2[14]]);
    }

    private static boolean var22(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var24(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (m.var25(chatMessage.getMessage().equals(var1[var2[13]]) ? 1 : 0)) {
            this.F.a(this.F.d() + var2[2]);
        }
    }

    static {
        m.var5();
        m.var3();
    }

    private static boolean var26(Object object) {
        return object != null;
    }

    public boolean run() {
        m var27;
        if (m.var25(this.H.getVarbitValue(var2[0]))) {
            return var2[1];
        }
        int[] nArray = new int[var2[2]];
        nArray[m.var2[1]] = var27.G.foodID();
        if (!m.var6(Inventory.getCount((int[])nArray), var27.G.minFoodAmount()) || m.var22(Inventory.getCount(item -> item.getName().startsWith(this.G.antiPoison())), var27.G.minAntiAmount())) {
            return var2[1];
        }
        int[] nArray2 = new int[var2[2]];
        nArray2[m.var2[1]] = var2[3];
        NPC var28 = NPCs.getNearest((int[])nArray2);
        if (m.var26(var28)) {
            return var2[1];
        }
        if (m.var24(Movement.shouldWalk() ? 1 : 0)) {
            return var2[1];
        }
        String[] stringArray = new String[var2[2]];
        stringArray[m.var2[1]] = var1[var2[1]];
        TileObject var29 = TileObjects.getNearest((String[])stringArray);
        if (m.var26(var29)) {
            String[] stringArray2 = new String[var2[2]];
            stringArray2[m.var2[1]] = var1[var2[2]];
            if (m.var25(var29.hasAction(stringArray2) ? 1 : 0)) {
                return var2[1];
            }
            String[] stringArray3 = new String[var2[2]];
            stringArray3[m.var2[1]] = var1[var2[4]];
            TileObjects.getNearest((String[])stringArray3).interact(var1[var2[5]]);
            return var2[2];
        }
        if (m.var25(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        String[] stringArray4 = new String[var2[2]];
        stringArray4[m.var2[1]] = var1[var2[6]];
        TileObject var30 = TileObjects.getNearest((String[])stringArray4);
        if (m.var4(var30)) {
            Movement.walkTo((WorldPoint)new WorldPoint(var2[7], var2[8], var2[1]), (boolean)var2[1]);
            0;
            return var2[2];
        }
        int[] nArray3 = new int[var2[6]];
        nArray3[m.var2[1]] = var2[9];
        nArray3[m.var2[2]] = var2[10];
        nArray3[m.var2[4]] = var2[11];
        nArray3[m.var2[5]] = var2[12];
        int[] nArray4 = nArray3;
        this.c(nArray4[this.F.d()]);
        return var2[2];
    }

    @Inject
    public FindingMummyTask(a a2, SquirePlunderConfig squirePlunderConfig, Client client) {
        this.F = a2;
        this.G = squirePlunderConfig;
        this.H = client;
    }

    private static boolean var25(int n2) {
        return n2 != 0;
    }
}

