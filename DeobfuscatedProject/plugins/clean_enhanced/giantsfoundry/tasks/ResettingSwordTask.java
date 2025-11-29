/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Resetting Sword", priority=2147483397, register=true, blocking=true)
public class ResettingSwordTask
extends Task {
    private final  SquireGiantsFoundry ad;
    private final  a ae;

    private static void var3() {
        var1 = new int[8];
        o.var1[0] = (0x67 ^ 0x60) & ~(0x50 ^ 0x57);
        o.var1[1] = 1;
        o.var1[2] = 0xFFFFEFD3 & 0x79AE;
        o.var1[3] = 2;
        o.var1[4] = 3;
        o.var1[5] = 0x70 ^ 0x21 ^ (0xFF ^ 0xAA);
        o.var1[6] = 0x67 ^ 0x29 ^ (0x5C ^ 0x17);
        o.var1[7] = 0x95 ^ 0xB6 ^ (4 ^ 0x2F);
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    @Inject
    public ResettingSwordTask(SquireGiantsFoundry squireGiantsFoundry, a a2) {
        this.ad = squireGiantsFoundry;
        this.ae = a2;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[0];
        while (o.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (2 <= (0x15 ^ 0x56 ^ (0x58 ^ 0x1F))) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean var23(Object object, Object object2) {
        return object != object2;
    }

    private static void var24() {
        var2 = new String[var1[6]];
        o.var2[o.var1[0]] = "No preform, we have successfully reset.";
        o.var2[o.var1[1]] = "Resetting the sword";
        o.var2[o.var1[3]] = "Hand-in";
        o.var2[o.var1[4]] = "too damaged to keep working";
        o.var2[o.var1[5]] = "Something went wrong with the sword, trying to reset.";
    }

    static {
        o.var3();
        o.var24();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        o var25;
        if (o.var26(this.ad.c() ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[o.var1[0]] = var1[2];
        if (o.var26(Equipment.contains((int[])nArray) ? 1 : 0)) {
            Log.info((String)var2[var1[0]]);
            var25.ad.a(var1[0]);
            return var1[1];
        }
        if (o.var26(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        if (o.var16(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return var1[1];
        }
        Log.info((String)var2[var1[1]]);
        NPC var27 = var25.ae.p();
        if (o.var4(var27)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[3]]);
        return var1[1];
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var28;
        if (o.var23(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (o.var16(var28.getMessage().contains(var2[var1[4]]) ? 1 : 0)) {
            o var29;
            Log.info((String)var2[var1[5]]);
            var29.ad.a(var1[1]);
        }
    }

    private static boolean var26(int n2) {
        return n2 == 0;
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }
}

