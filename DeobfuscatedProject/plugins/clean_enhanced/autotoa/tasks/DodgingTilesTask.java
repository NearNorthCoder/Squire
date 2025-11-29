/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AttackingFinalWardenTask;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging tiles", priority=50, blocking=true)
public class DodgingTilesTask
extends AutotoaManager {
    private static final  Point gF;
    private static final  Point gH;
    private static final  Point gD;
    private static final  int gI;
    private static final  int gE;
    
    private  boolean gJ;
    @Inject
    private  bL gB;
    private static final  int gG;

    private static boolean var2(int n2, int n3) {
        return n2 > n3;
    }

    private static void var3() {
        var1 = new int[11];
        bK.var1[0] = (0xA ^ 0x22 ^ (0x79 ^ 4)) & (18 + 211 - 178 + 199 ^ 100 + 87 - 130 + 118 ^ -1);
        bK.var1[1] = 3;
        bK.var1[2] = 2;
        bK.var1[3] = 1;
        bK.var1[4] = -(0x62 ^ 0x53) & (0xFFFFB5FF & 0x6FFB);
        bK.var1[5] = 0xFFFFF7CF & 0x2DFF;
        bK.var1[6] = -(0xFFFF9EB5 & 0x737B) & (0xFFFFFFFF & 0x37FD);
        bK.var1[7] = 128 + 83 - 105 + 45 ^ 17 + 20 - -21 + 78;
        bK.var1[8] = 0x29 ^ 0xC;
        bK.var1[9] = 0xBF ^ 0x98 ^ (0xC5 ^ 0xC2);
        bK.var1[10] = 51 + 144 - 191 + 185 ^ 41 + 95 - 3 + 23;
    }

    static {
        bK.var3();
        gI = var1[4];
        gG = var1[5];
        gE = var1[6];
        gD = new Point(var1[7], var1[8]);
        gF = new Point(var1[9], var1[8]);
        gH = new Point(var1[10], var1[8]);
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var4_4;
        bK var5;
        if (bK.var4(this.cq() ? 1 : 0)) {
            return var1[0];
        }
        WorldPoint var6 = Players.getLocal().getWorldLocation();
        WorldPoint var7 = var5.a(gF);
        int var8 = var7.distanceTo(var6);
        if (bK.var9(var5.cq() ? 1 : 0) && bK.var9(var5.cr() ? 1 : 0) && bK.var2(var8, var1[1])) {
            var5.gB.sleep(var8 / var1[2]);
            Movement.setDestination((WorldPoint)var7);
            return var1[3];
        }
        if (!bK.var9(var5.cr() ? 1 : 0) || bK.var4(var5.cq() ? 1 : 0)) {
            return var1[0];
        }
        WorldPoint var10 = var5.cp();
        if (!bK.var11(var10) || bK.var4(var6.equals((Object)var10) ? 1 : 0)) {
            if (bK.var9(var5.gJ)) {
                WorldPoint var12 = var5.a(gD);
                WorldPoint var13 = new WorldPoint(var12.getWorldX(), var6.getWorldY(), var6.getPlane());
                Movement.setDestination((WorldPoint)var13);
                var5.sleep(var1[3]);
                var5.gJ = var1[3];
                return var1[3];
            }
            return var1[0];
        }
        Movement.setDestination((WorldPoint)var4_4);
        this.sleep(var1[3]);
        return var1[3];
    }

    private static boolean var14(Object object) {
        return object == null;
    }

    @Override
    public void r() {
        this.gJ = var1[0];
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint cp() {
        bK var15;
        void var16;
        NPC nPC = this.co();
        if (bK.var14(nPC)) {
            return null;
        }
        int var17 = var16.getAnimation();
        if (bK.var18(var17, var1[4])) {
            return var15.a(gD);
        }
        if (bK.var18(var17, var1[5])) {
            return var15.a(gF);
        }
        if (bK.var18(var17, var1[6])) {
            return var15.a(gH);
        }
        return null;
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

    private static boolean var18(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var11(Object object) {
        return object != null;
    }

    @Inject
    protected DodgingTilesTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.gJ = var1[0];
    }
}

