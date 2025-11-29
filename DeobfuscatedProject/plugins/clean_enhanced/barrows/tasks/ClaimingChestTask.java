/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Claiming chest", priority=150, blocking=true, register=true)
public class ClaimingChestTask
extends Task {
    private final  SquireBarrows ak;

    private static boolean var3(Object object) {
        return object == null;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    @Inject
    public ClaimingChestTask(SquireBarrows squireBarrows) {
        this.ak = squireBarrows;
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static void var12() {
        var2 = new int[9];
        w.var2[0] = (92 + 58 - 3 + 29 ^ 113 + 143 - 196 + 85) & (181 + 186 - 182 + 5 ^ 107 + 78 - 117 + 91 ^ -1);
        w.var2[1] = 1;
        w.var2[2] = 3;
        w.var2[3] = 2;
        w.var2[4] = 0xAF ^ 0xA7;
        w.var2[5] = 0x64 ^ 0x24 ^ (2 ^ 0x44);
        w.var2[6] = 67 + 120 - 165 + 139 ^ 110 + 69 - 141 + 127;
        w.var2[7] = 0x7B ^ 0x7E;
        w.var2[8] = 0xE8 ^ 0x95 ^ (0x1C ^ 0x66);
    }

    static {
        w.var12();
        w.var13();
    }

    private static boolean var14(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var15;
        if (w.var14(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (!w.var10(var15.getMessage().contains(var1[var2[6]]) ? 1 : 0) || w.var16(var15.getMessage().contains(var1[var2[7]]) ? 1 : 0)) {
            w var17;
            Log.info((String)var1[var2[5]]);
            var17.ak.b(var2[1]);
        }
    }

    private static boolean var18(Object object) {
        return object != null;
    }

    private static void var13() {
        var1 = new String[var2[4]];
        w.var1[w.var2[0]] = "Chest";
        w.var1[w.var2[1]] = "Eat";
        w.var1[w.var2[3]] = "Open";
        w.var1[w.var2[2]] = "Search";
        w.var1[w.var2[6]] = "Barrows chest count";
        w.var1[w.var2[7]] = "The chest is empty";
        w.var1[w.var2[5]] = "Looted the chest, resetting";
        w.var1[w.var2[8]] = "Eat";
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = var2[0];
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = var2[0];
        while (w.var11(var27, var26)) {
            char var28 = var25[var27];
            var22.append((char)(var28 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var22);
    }

        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        w var35;
        if (!w.var16(this.ak.h() ? 1 : 0) || w.var16(this.ak.v() ? 1 : 0)) {
            return var2[0];
        }
        if (w.var10(var35.ak.g() ? 1 : 0)) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[w.var2[0]] = var1[var2[0]];
        TileObject var36 = TileObjects.getNearest((String[])stringArray);
        if (w.var3(var36)) {
            return var2[0];
        }
        Item var37 = Inventory.getFirst(item -> {
            String[] stringArray = new String[var2[1]];
            stringArray[w.var2[0]] = var1[var2[8]];
            return item.hasAction(stringArray);
        });
        if (w.var11(Inventory.getFreeSlots(), var2[2]) && w.var18(var37)) {
            var37.interact(var1[var2[1]]);
            var35.sleep(var2[2]);
            return var2[1];
        }
        String[] stringArray2 = new String[var2[1]];
        stringArray2[w.var2[0]] = var1[var2[3]];
        if (!w.var10(var36.hasAction(stringArray2) ? 1 : 0) || !w.var16(Reachable.isInteractable((Locatable)var36) ? 1 : 0) || w.var38(var36.distanceTo(Players.getLocal().getWorldLocation()), var2[4])) {
            return var2[0];
        }
        if (w.var11(var35.ak.e(), var2[5])) {
            return var2[0];
        }
        NPC var39 = var35.ak.y();
        if (w.var18(var39) && w.var10(var39.isDead() ? 1 : 0)) {
            return var2[0];
        }
        var1_1.interact(var1[var2[2]]);
        return var2[1];
    }

    private static boolean var38(int n2, int n3) {
        return n2 > n3;
    }
}

