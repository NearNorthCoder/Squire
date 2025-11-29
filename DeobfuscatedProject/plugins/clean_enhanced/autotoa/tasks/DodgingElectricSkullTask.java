/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging electric skull", priority=30, blocking=true, register=true)
public class DodgingElectricSkullTask
extends AutotoaManager {
    private static final  int fY;
    private static final  int fX;
    private  int ga;
    
    private  WorldPoint fZ;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var2_2;
        bB var2;
        if (!bB.var3(this.fZ) || bB.var4(this.cu.getTickCount(), this.ga)) {
            var2.fZ = null;
            return var1[0];
        }
        int var5 = var2.fZ.distanceTo(Players.getLocal().getWorldLocation());
        if (!bB.var6(var5, var1[1]) || bB.var4(var5, var1[2])) {
            return var1[1];
        }
        var2.aY.a(var1[3]);
        WorldPoint var7 = var2.cn();
        if (bB.var8(var7) && bB.var8(var7 = var2.cm())) {
            return var1[0];
        }
        Movement.setDestination((WorldPoint)var2_2);
        return var1[1];
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

    private static boolean var3(Object object) {
        return object != null;
    }

    private static boolean var6(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    static {
        bB.var11();
        fX = var1[7];
        fY = var1[9];
    }

    private static boolean var12(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    private static boolean var4(int n2, int n3) {
        return n2 > n3;
    }

    private WorldPoint cn() {
        WorldPoint[] worldPointArray = new WorldPoint[var1[2]];
        worldPointArray[bB.var1[0]] = this.fZ.dx(var1[5]);
        worldPointArray[bB.var1[1]] = this.fZ.dx(var1[1]);
        worldPointArray[bB.var1[6]] = this.fZ.dy(var1[5]);
        worldPointArray[bB.var1[4]] = this.fZ.dy(var1[1]);
        return Stream.of(worldPointArray).filter(worldPoint -> {
            boolean bl2;
            if (bB.var9(worldPoint.equals((Object)this.fZ) ? 1 : 0)) {
                bl2 = var1[1];
                0;
                if null != null {
                    return ((0x37 ^ 0x15 ^ (0xF1 ^ 0x88)) & (69 + 194 - 93 + 38 ^ 81 + 28 - 44 + 74 ^ -1)) != 0;
                }
            } else {
                bl2 = var1[0];
            }
            return bl2;
        }).filter(worldPoint -> {
            boolean bl2;
            if (bB.var9(this.co().getWorldArea().contains(worldPoint) ? 1 : 0)) {
                bl2 = var1[1];
                0;
                if (3 < 1) {
                    return ((0xA0 ^ 0x99) & ~(0xF8 ^ 0xC1)) != 0;
                }
            } else {
                bl2 = var1[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
    }

    @Override
    public void r() {
        super.r();
        this.fZ = null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        void var13;
        void var14;
        bB var15;
        void var16;
        WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.cu, (LocalPoint)graphicsObjectCreated.getGraphicsObject().getLocation());
        if (bB.var12(graphicsObjectCreated.getGraphicsObject().getId(), var1[7])) {
            if (bB.var4(worldPoint.distanceTo((Locatable)Players.getLocal()), var1[2])) {
                return;
            }
            var15.fZ = var16;
            var15.ga = var15.cu.getTickCount() + var1[8];
            0;
            if (3 < 0) {
                return;
            }
        } else if (bB.var12(var14.getGraphicsObject().getId(), var1[9]) && bB.var10((var13 = var16).equals((Object)var15.fZ) ? 1 : 0)) {
            var15.fZ = null;
        }
    }

    private WorldPoint cm() {
        return Players.getLocal().getWorldLocation().createWorldArea(var1[4]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bB.var4(worldPoint.distanceTo(this.fZ), var1[2])) {
                bl2 = var1[1];
                0;
                if null != null {
                    return ((0x60 ^ 0x4C) & ~(0x36 ^ 0x1A)) != 0;
                }
            } else {
                bl2 = var1[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
    }

    private static void var11() {
        var1 = new int[10];
        bB.var1[0] = (0x81 ^ 0xAE ^ (0x81 ^ 0x9B)) & (0xB2 ^ 0xBD ^ (0x7E ^ 0x44) ^ -1);
        bB.var1[1] = 1;
        bB.var1[2] = 0x89 ^ 0x8D;
        bB.var1[3] = 0x4D ^ 0x57 ^ (0xB ^ 0x32);
        bB.var1[4] = 3;
        bB.var1[5] = -1;
        bB.var1[6] = 2;
        bB.var1[7] = -(0xFFFF9EDB & 0x7B75) & (0xFFFF9FFF & 0x7FF7);
        bB.var1[8] = 0xA3 ^ 0xA5 ^ 3;
        bB.var1[9] = 0xFFFF8DD7 & 0x7ABE;
    }

    @Inject
    protected DodgingElectricSkullTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean var8(Object object) {
        return object == null;
    }
}

