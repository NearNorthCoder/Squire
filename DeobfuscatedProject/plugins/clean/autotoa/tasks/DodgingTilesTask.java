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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging tiles", priority=50, blocking=true)
public class DodgingTilesTask
extends AutotoaTaskBase {
    private static final  Point gF;
    private static final  Point gH;
    private static final  Point gD;
    private static final  int gI;
    private static final  int gE;
    
    private  boolean gJ;
    @Inject
    private  bL gB;
    private static final  int gG;

    private static boolean lIlIIllIIIllII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        bK.lIlIIllIIIlIIl();
        gI = llIlIIllllI[4];
        gG = llIlIIllllI[5];
        gE = llIlIIllllI[6];
        gD = new Point(llIlIIllllI[7], llIlIIllllI[8]);
        gF = new Point(llIlIIllllI[9], llIlIIllllI[8]);
        gH = new Point(llIlIIllllI[10], llIlIIllllI[8]);
    }

    private static boolean lIlIIllIIIlIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var4_4;
        bK var1;
        if (bK.lIlIIllIIIlIlI(this.cq() ? 1 : 0)) {
            return llIlIIllllI[0];
        }
        WorldPoint var2 = Players.getLocal().getWorldLocation();
        WorldPoint var3 = var1.a(gF);
        int var4 = var3.distanceTo(var2);
        if (bK.lIlIIllIIIlIll(var1.cq() ? 1 : 0) && bK.lIlIIllIIIlIll(var1.cr() ? 1 : 0) && bK.lIlIIllIIIllII(var4, llIlIIllllI[1])) {
            var1.gB.sleep(var4 / llIlIIllllI[2]);
            Movement.setDestination((WorldPoint)var3);
            return llIlIIllllI[3];
        }
        if (!bK.lIlIIllIIIlIll(var1.cr() ? 1 : 0) || bK.lIlIIllIIIlIlI(var1.cq() ? 1 : 0)) {
            return llIlIIllllI[0];
        }
        WorldPoint var5 = var1.cp();
        if (!bK.lIlIIllIIIllIl(var5) || bK.lIlIIllIIIlIlI(var2.equals((Object)var5) ? 1 : 0)) {
            if (bK.lIlIIllIIIlIll(var1.gJ ? 1 : 0)) {
                WorldPoint var6 = var1.a(gD);
                WorldPoint var7 = new WorldPoint(var6.getWorldX(), var2.getWorldY(), var2.getPlane());
                Movement.setDestination((WorldPoint)var7);
                var1.sleep(llIlIIllllI[3]);
                var1.gJ = llIlIIllllI[3];
                return llIlIIllllI[3];
            }
            return llIlIIllllI[0];
        }
        Movement.setDestination((WorldPoint)var4_4);
        this.sleep(llIlIIllllI[3]);
        return llIlIIllllI[3];
    }

    private static boolean lIlIIllIIIlllI(Object object) {
        return object == null;
    }

    @Override
    public void r() {
        this.gJ = llIlIIllllI[0];
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint cp() {
        bK var8;
        void var9;
        NPC nPC = this.co();
        if (bK.lIlIIllIIIlllI(nPC)) {
            return null;
        }
        int var10 = var9.getAnimation();
        if (bK.lIlIIllIIIllll(var10, llIlIIllllI[4])) {
            return var8.a(gD);
        }
        if (bK.lIlIIllIIIllll(var10, llIlIIllllI[5])) {
            return var8.a(gF);
        }
        if (bK.lIlIIllIIIllll(var10, llIlIIllllI[6])) {
            return var8.a(gH);
        }
        return null;
    }

    private static boolean lIlIIllIIIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIllIIIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIllIIIllIl(Object object) {
        return object != null;
    }

    @Inject
    protected DodgingTilesTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.gJ = llIlIIllllI[0];
    }
}

