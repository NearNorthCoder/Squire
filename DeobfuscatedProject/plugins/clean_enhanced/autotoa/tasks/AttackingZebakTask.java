/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Gear
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Gear;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum6;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking Zebak", priority=10)
public class AttackingZebakTask
extends AutotoaManager {
    private static final  Point gR;

    @Inject
    protected AttackingZebakTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        void var4;
        bN var5;
        NPC nPC = this.cB();
        if (bN.var6(nPC)) {
            return var1[0];
        }
        Player var7 = Players.getLocal();
        int n2 = Gear.isEquipped((int[])Gear.matching(var5.cW.gearSwapZebak()));
        if (bN.var8(var7.getInteracting()) && bN.var9(n2)) {
            return var1[0];
        }
        int var10 = var7.distanceTo(var5.a(gR));
        int var11 = var5.a((NPC)var4, var1[1]) ? 1 : 0;
        if (bN.var12(var11) && bN.var13(var10, var5.bg()) && bN.var3((Object)var5.cF(), (Object)bY.ATTACK)) {
            return var1[0];
        }
        nPC.interact(var2[var1[0]]);
        return var1[1];
    }

    private static void var14() {
        var2 = new String[var1[1]];
        bN.var2[bN.var1[0]] = "Attack";
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static boolean var8(Object object) {
        return object != null;
    }

    private static boolean var13(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    static {
        bN.var21();
        bN.var14();
        gR = new Point(var1[2], var1[3]);
    }

    private static void var21() {
        var1 = new int[5];
        bN.var1[0] = (0x30 ^ 0x29) & ~(0xBD ^ 0xA4);
        bN.var1[1] = 1;
        bN.var1[2] = 0x7B ^ 0x6E;
        bN.var1[3] = 0xB5 ^ 0x95;
        bN.var1[4] = 2;
    }
}

