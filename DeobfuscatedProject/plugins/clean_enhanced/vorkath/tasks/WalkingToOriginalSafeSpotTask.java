/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.vorkath.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walking to original safe spot", priority=25, blocking=true)
public class WalkingToOriginalSafeSpotTask
extends VorkathManager {
    private static final  int cm;

    @Inject
    protected WalkingToOriginalSafeSpotTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static boolean var2(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var2_2;
        D var3;
        void var4;
        int[] nArray = new int[var1[0]];
        nArray[D.var1[1]] = var1[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (D.var2(nPC)) {
            return var1[1];
        }
        WorldPoint var5 = var4.getWorldArea().getCenter().dy(var1[3]);
        if (D.var6(var3.l.q().equals((Object)var5) ? 1 : 0)) {
            return var1[1];
        }
        Movement.setDestination((WorldPoint)var2_2);
        return var1[0];
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static void var7() {
        var1 = new int[4];
        D.var1[0] = 1;
        D.var1[1] = (0x90 ^ 0x8A) & ~(0x45 ^ 0x5F);
        D.var1[2] = 0xFFFF9FFE & 0x7F7B;
        D.var1[3] = -(0xC ^ 0xA);
    }

    static {
        D.var7();
        cm = var1[2];
    }
}

