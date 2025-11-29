/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum3;
import gg.squire.autotoa.tasks.AutotoaManager;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@TaskDesc(name="Skipping Akkha DPS", priority=150, blocking=true, register=true)
public class SkippingAkkhaDpsTask
extends AutotoaManager {
    
    private static final  int dn;
    private  boolean dp;
    private static final  int do;
    
    private  int dq;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var11(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var8_8;
        ax var12;
        void var13;
        n n2 = this.bx();
        if (ax.var9((Object)n2)) {
            return var1[0];
        }
        WorldPoint var14 = var13.a(var12.cu);
        NPC var15 = NPCs.getNearest((WorldPoint)var14, nPC -> {
            int n2;
            if (ax.var16(nPC.getName().equals(var2[var1[0]]) ? 1 : 0) && ax.var10(nPC.getWorldLocation().distanceTo(var14), var1[6])) {
                n2 = var1[1];
                0;
                if (-2 >= 0) {
                    return ((0x7A ^ 0x10 ^ (0x84 ^ 0xB6)) & (0x1B ^ 0x44 ^ (0x6E ^ 0x69) ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (!ax.var11(var15) || ax.var16(var15.isDead() ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[ax.var1[0]] = var1[2];
        NPC var17 = NPCs.getNearest((int[])nArray);
        if (!ax.var11(var17) || ax.var18(var17.getHealthRatio(), var1[3])) {
            return var1[0];
        }
        if (ax.var9(var12.J())) {
            return var1[0];
        }
        if (ax.var10(var17.getHealthRatio() + var1[4], var17.getHealthScale()) && ax.var19(var15.getAnimation(), var1[5])) {
            return var1[0];
        }
        WorldArea var20 = var15.getWorldArea();
        WorldPoint var21 = var20.toWorldPointList().stream().min(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var14))).orElse(null);
        if (ax.var9(var21)) {
            return var1[0];
        }
        WorldPoint var22 = var20.toWorldPointList().stream().max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var14))).orElse(null);
        if (ax.var9(var22)) {
            return var1[0];
        }
        WorldPoint var23 = var21;
        if (ax.var24(var15.getAnimationFrame(), var1[1])) {
            var23 = var22;
        }
        Movement.setDestination((WorldPoint)var8_8);
        return var1[1];
    }

    private static void var25() {
        var2 = new String[var1[1]];
        ax.var2[ax.var1[0]] = "Akkha's Shadow";
    }

    private static void var26() {
        var1 = new int[9];
        ax.var1[0] = (0xF3 ^ 0xA1) & ~(0xC ^ 0x5E);
        ax.var1[1] = 1;
        ax.var1[2] = 0xFFFFEFDD & 0x3E3F;
        ax.var1[3] = -1;
        ax.var1[4] = 0xE8 ^ 0xB0 ^ (0xD0 ^ 0x8D);
        ax.var1[5] = 0xFFFFFEB1 & 0x277F;
        ax.var1[6] = 0x88 ^ 0x8E;
        ax.var1[7] = 0x48 ^ 0x40;
        ax.var1[8] = 2;
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

    @Inject
    protected SkippingAkkhaDpsTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean var24(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var18(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var19(int n2, int n3) {
        return n2 != n3;
    }

    static {
        ax.var26();
        ax.var25();
        dn = var1[5];
        do = var1[2];
    }
}

