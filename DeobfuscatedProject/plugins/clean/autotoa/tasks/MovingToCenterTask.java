/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum51;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Moving to center", priority=30)
public class MovingToCenterTask
extends AutotoaTaskBase {
    private static final  RegionPoint hf;

    private static boolean lIIlllIlIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        void var2_2;
        bV var1;
        if (bV.lIIlllIlIlIlII(this.bq() ? 1 : 0) && bV.lIIlllIlIlIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
            return llIIIIlIllI[0];
        }
        if (bV.lIIlllIlIlIlII(var1.cE().isEmpty() ? 1 : 0)) {
            return llIIIIlIllI[0];
        }
        WorldPoint var2 = Players.getLocal().getWorldLocation();
        WorldPoint var3 = WorldPoint.toLocalInstance((Client)var1.cu, (WorldPoint)hf.toWorld()).stream().min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo2D(var2))).orElse(null);
        if (bV.lIIlllIlIlIllI(var3)) {
            return llIIIIlIllI[0];
        }
        if (bV.lIIlllIlIlIlll(var3.distanceTo(var2), llIIIIlIllI[1]) && bV.lIIlllIlIllIII(var2.getWorldX(), var3.getWorldX())) {
            return llIIIIlIllI[0];
        }
        NPC var4 = var1.cA();
        if (bV.lIIlllIlIllIIl(var4)) {
            return llIIIIlIllI[0];
        }
        if (bV.lIIlllIlIlIlIl(var1.p(var3) ? 1 : 0)) {
            return llIIIIlIllI[0];
        }
        this.a((WorldPoint)var2_2, this::P);
        return llIIIIlIllI[2];
    }

    private static boolean lIIlllIlIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllIlIlIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllIlIlIlII(int n2) {
        return n2 == 0;
    }

    @Inject
    protected MovingToCenterTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bY.ATTACK);
    }

    static {
        bV.lIIlllIlIlIIll();
        hf = new RegionPoint(llIIIIlIllI[3], llIIIIlIllI[4], llIIIIlIllI[0], llIIIIlIllI[5]);
    }

    private static boolean lIIlllIlIlIllI(Object object) {
        return object == null;
    }

    private static boolean lIIlllIlIllIIl(Object object) {
        return object != null;
    }
}

