/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@Singleton
@TaskDesc(name="Moving to safespot", priority=25, blocking=true, register=true)
public class MovingToSafespotTask
extends AutotoaManager {
    private static final  int gi;
    
    private  int gj;
    private static final  Point gg;
    private static final  Point ge;
    private static final  int gh;
    private static final  Point gf;
    private  Point gk;

    @Override
    public boolean bl() {
        WorldPoint var2;
        bD var3;
        WorldPoint worldPoint = this.a(ge);
        if (bD.var4(this.gj)) {
            this.gj -= var1[1];
            if (bD.var5(this.gk, gg) && bD.var6(this.gj, var1[2])) {
                return var1[0];
            }
            var2 = var3.a(var3.gk);
        }
        if (bD.var7(var3.cu.getLocalPlayer().getWorldLocation().equals((Object)var2) ? 1 : 0)) {
            return var1[0];
        }
        WorldPoint var8 = var2;
        if (bD.var4(TileObjects.getAll(tileObject -> {
            int n2;
            if (bD.var7(tileObject instanceof GameObject) && bD.var7(((GameObject)tileObject).getWorldArea().contains(var8) ? 1 : 0)) {
                n2 = var1[1];
                0;
                if ((87 + 59 - 62 + 53 ^ 95 + 39 - 42 + 49) < ((0x54 ^ 0xB ^ (0xF ^ 0x4F)) & (0xDB ^ 0xBA ^ (1 ^ 0x7F) ^ -1))) {
                    return (2 & (2 ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        }).size())) {
            return var1[0];
        }
        Movement.setDestination((WorldPoint)worldPoint);
        return var1[1];
    }

    private static void var9() {
        var1 = new int[12];
        bD.var1[0] = (0x28 ^ 0x1B) & ~(0x20 ^ 0x13);
        bD.var1[1] = 1;
        bD.var1[2] = 73 + 70 - 31 + 33 ^ 95 + 15 - 36 + 75;
        bD.var1[3] = 0xFFFF9FBF & 0x68FC;
        bD.var1[4] = -(0xFFFFFF5B & 0x34E5) & (0xFFFFBEFB & 0x7DFF);
        bD.var1[5] = 0x18 ^ 0x1E;
        bD.var1[6] = 0x6B ^ 0x43 ^ (0x5B ^ 0x79);
        bD.var1[7] = 1 + 122 - -46 + 0 ^ 150 + 42 - 136 + 125;
        bD.var1[8] = 0xC ^ 0x29;
        bD.var1[9] = 0x32 ^ 0x2C;
        bD.var1[10] = 9 ^ 0x14;
        bD.var1[11] = 76 + 88 - 79 + 94 ^ 110 + 94 - 201 + 146;
    }

    private static boolean var10(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var5(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    static {
        bD.var9();
        gi = var1[4];
        gh = var1[3];
        ge = new Point(var1[7], var1[8]);
        gf = new Point(var1[9], var1[8]);
        gg = new Point(var1[10], var1[11]);
    }

    private static boolean var4(int n2) {
        return n2 > 0;
    }

    private static boolean var11(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        void var12;
        bD var13;
        WorldPoint var14;
        int n2 = graphicsObjectCreated.getGraphicsObject().getId();
        if ((!bD.var10(n2, var1[3]) || bD.var11(n2, var1[4])) && bD.var7((var14 = WorldPoint.fromLocal((Client)var13.cu, (LocalPoint)var12.getGraphicsObject().getLocation())).equals((Object)var13.a(ge)) ? 1 : 0)) {
            Point point;
            int n3;
            void var15;
            if (bD.var11((int)var15, var1[3])) {
                n3 = var1[5];
                0;
                if (-3 > 0) {
                    return;
                }
            } else {
                n3 = var13.gj = var1[6];
            }
            if (bD.var11((int)var15, var1[3])) {
                point = gf;
                0;
                if (2 != 2) {
                    return;
                }
            } else {
                point = gg;
            }
            var13.gk = point;
        }
    }

    @Inject
    protected MovingToSafespotTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.gj = var1[0];
    }

    @Override
    public void r() {
        super.r();
        this.gk = null;
        this.gj = var1[0];
    }

    private static boolean var6(int n2, int n3) {
        return n2 > n3;
    }
}

