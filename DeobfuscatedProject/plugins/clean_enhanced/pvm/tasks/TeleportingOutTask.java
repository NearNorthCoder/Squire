/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Prayers
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.pvm.tasks.PvmManager;

@TaskDesc(name="Teleporting out", priority=8, register=true)
public class TeleportingOutTask
extends Task {
    private final  SquireShamansPlugin aH;
    private final  SquireShamanConfig aI;
    private static final  Logger aF;
    private static final  WorldPoint aG;
    
    private final  c aJ;

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    private static void var4() {
        var1 = new String[var2[9]];
        z.var1[z.var2[1]] = "Lizardman shaman";
        z.var1[z.var2[0]] = "blowpipe needs to be charged";
        z.var1[z.var2[2]] = "Oh dear, you are dead!";
        z.var1[z.var2[3]] = "You died, stopping plugin";
        z.var1[z.var2[4]] = "Eat";
        z.var1[z.var2[5]] = "anti";
        z.var1[z.var2[6]] = "Drink";
    }

    static {
        z.var5();
        z.var4();
        aF = LoggerFactory.getLogger(TeleportingOutTask.class);
        aG = new WorldPoint(var2[7], var2[8], var2[1]);
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[1];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[1];
        while (z.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (((0x69 ^ 0x30 ^ (0x2E ^ 0x61)) & (110 + 30 - 133 + 175 ^ 112 + 92 - 140 + 96 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    @Inject
    public TeleportingOutTask(SquireShamansPlugin squireShamansPlugin, SquireShamanConfig squireShamanConfig, c c2) {
        this.aH = squireShamansPlugin;
        this.aI = squireShamanConfig;
        this.aJ = c2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        z var17;
        String[] stringArray = new String[var2[0]];
        stringArray[z.var2[1]] = var1[var2[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (z.var18(nPC)) {
            this.aH.f(var2[1]);
            return var2[1];
        }
        Item var19 = Inventory.getFirst(item -> {
            int n2;
            if (z.var20(item.getName().toLowerCase().contains(var1[var2[5]]) ? 1 : 0)) {
                String[] stringArray = new String[var2[0]];
                stringArray[z.var2[1]] = var1[var2[6]];
                if (z.var20(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[0];
                    0;
                    if ((0xA6 ^ 0xA2) > 0) return n2 != 0;
                    return ((0x18 ^ 0xE) & ~(0xA4 ^ 0xB2)) != 0;
                }
            }
            n2 = var2[1];
            return n2 != 0;
        });
        Item var21 = Inventory.getFirst(item -> item.hasAction(var1[var2[4]]::equals));
        if (z.var22(var21) && z.var22(var19) && z.var23(var17.aH.i() ? 1 : 0) && z.var24(Prayers.getPoints())) {
            return var2[1];
        }
        Item var25 = Inventory.getFirst(var17.aI.teleportItem().u());
        if (z.var18(var25)) {
            return var2[1];
        }
        var17.aH.f(var2[0]);
        if (z.var20(var17.aJ.s() ? 1 : 0) && z.var20(var17.aI.teleportItem().E() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)aG);
            0;
            return var2[0];
        }
        this.aI.teleportItem().B().accept((Item)var4_4);
        return var2[0];
    }

    private static boolean var24(int n2) {
        return n2 > 0;
    }

    private static boolean var26(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        z var27;
        void var28;
        if (z.var26(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (z.var20(var28.getMessage().contains(var1[var2[0]]) ? 1 : 0)) {
            var27.aH.e(var2[0]);
        }
        if (z.var20(var28.getMessage().contains(var1[var2[2]]) ? 1 : 0)) {
            Log.info((String)var1[var2[3]]);
            var27.aH.forceStop();
        }
    }

        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (z.var3(gameStateChanged.getGameState(), GameState.LOADING)) {
            this.aH.f(var2[1]);
        }
    }

    private static boolean var23(int n2) {
        return n2 == 0;
    }

    private static boolean var18(Object object) {
        return object == null;
    }

    private static boolean var22(Object object) {
        return object != null;
    }

        catch (Exception var40) {
            var40.printStackTrace();
            return null;
        }
    }

    private static boolean var20(int n2) {
        return n2 != 0;
    }

    private static void var5() {
        var2 = new int[11];
        z.var2[0] = 1;
        z.var2[1] = (0x29 ^ 0x6C) & ~(0xDB ^ 0x9E);
        z.var2[2] = 2;
        z.var2[3] = 3;
        z.var2[4] = 0x7D ^ 0x3D ^ (0x14 ^ 0x50);
        z.var2[5] = 0x51 ^ 0x54;
        z.var2[6] = 0x92 ^ 0x94;
        z.var2[7] = 0xFFFFE70E & 0x1DFD;
        z.var2[8] = -(28 + 22 - 12 + 91) & (0xFFFFBFEE & 0x67FB);
        z.var2[9] = 0x3C ^ 0x3B;
        z.var2[10] = 0xBF ^ 0xB7;
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }
}

