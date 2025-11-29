/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="Attack NPC", priority=3, blocking=true)
public class AttackNpcTask
extends Task {
    
    private  int E;
    private final  Client D;
    private final  SquireNightmareZoneConfig C;
    private final  SquireNightmareZone B;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private static void var11() {
        var2 = new String[var1[3]];
        d.var2[d.var1[0]] = "Nothing to attack! We are either starting dream or nothing is in range";
        d.var2[d.var1[1]] = "Attack";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        d var12;
        if (d.var3(this.D.isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        if (d.var10(Players.getLocal().getInteracting() instanceof NPC)) {
            var12.E = var1[0];
            return var1[0];
        }
        var12.E += var1[1];
        if (d.var13(var12.E, var1[2])) {
            return var1[0];
        }
        NPC var14 = Combat.getAttackableNPC(nPC -> {
            boolean bl;
            if (d.var3(nPC.isDead() ? 1 : 0)) {
                bl = var1[1];
                0;
                if ((0x68 ^ 0x6C) < 0) {
                    return ((0x10 ^ 0x2B) & ~(0xFC ^ 0xC7)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        });
        if (d.var15(var14)) {
            System.out.println(var2[var1[0]]);
            return var1[0];
        }
        var1_1.interact(var2[var1[1]]);
        return var1[1];
    }

    private static void var16() {
        var1 = new int[5];
        d.var1[0] = (1 ^ 0x33) & ~(0x33 ^ 1);
        d.var1[1] = 1;
        d.var1[2] = 40 + 71 - 79 + 116 ^ 143 + 21 - 38 + 32;
        d.var1[3] = 2;
        d.var1[4] = 0x4D ^ 0x45;
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public AttackNpcTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.E = var1[0];
        this.B = squireNightmareZone;
        this.C = squireNightmareZoneConfig;
        this.D = client;
    }

    private static boolean var15(Object object) {
        return object == null;
    }

    static {
        d.var16();
        d.var11();
    }
}

