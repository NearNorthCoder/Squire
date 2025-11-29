/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.NpcDespawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Moving next to rubble", priority=100, blocking=true, register=true)
public class MovingNextToRubbleTask
extends AutotoaManager {
    private  boolean eh;
    private static final  int eg;

    static {
        aP.var3();
        aP.var4();
        eg = var2[3];
    }

    private static void var4() {
        var1 = new String[var2[4]];
        aP.var1[aP.var2[0]] = "Rubble";
        aP.var1[aP.var2[1]] = "Ba-Ba throws a large boulder at you";
        aP.var1[aP.var2[2]] = "Rubble";
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (aP.var5(npcDespawned.getNpc().getName().contains(var1[var2[0]]) ? 1 : 0)) {
            this.eh = var2[0];
        }
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (aP.var5(chatMessage.getMessage().contains(var1[var2[1]]) ? 1 : 0)) {
            this.eh = var2[1];
        }
    }

    private static void var3() {
        var2 = new int[5];
        aP.var2[0] = (0x6E ^ 0x56) & ~(0x58 ^ 0x60);
        aP.var2[1] = 1;
        aP.var2[2] = 2;
        aP.var2[3] = 0x29 ^ 0x21;
        aP.var2[4] = 3;
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var2[0];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var2[0];
        while (aP.var22(var21, var20)) {
            char var23 = var19[var21];
            var16.append((char)(var23 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static boolean var24(Object object) {
        return object != null;
    }

    private static boolean var22(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    @Inject
    protected MovingNextToRubbleTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var25;
        aP var26;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(var1[var2[2]]));
        if (!aP.var24(nPC2) || aP.var5(nPC2.isDead() ? 1 : 0)) {
            return var2[0];
        }
        if (aP.var12(var26.eh)) {
            return var2[0];
        }
        WorldPoint var27 = Players.getLocal().getWorldLocation();
        if (aP.var5(var25.getWorldArea().isInMeleeDistance(var27) ? 1 : 0)) {
            return var2[1];
        }
        Movement.setDestination((WorldPoint)nPC2.getWorldArea().getCenter());
        return var2[1];
    }
}

