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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@Singleton
@TaskDesc(name="Moving to safespot", priority=25, blocking=true, register=true)
public class MovingToSafespotTask
extends AutotoaTaskBase {
    private static final  int gi;
    
    private  int gj;
    private static final  Point gg;
    private static final  Point ge;
    private static final  int gh;
    private static final  Point gf;
    private  Point gk;

    @Override
    public boolean bl() {
        WorldPoint var1;
        bD var2;
        WorldPoint worldPoint = this.a(ge);
        if (bD.lIIllIlIlIllII(this.gj)) {
            this.gj -= lIllllIlIIl[1];
            if (bD.lIIllIlIlIllIl(this.gk, gg) && bD.lIIllIlIlIlllI(this.gj, lIllllIlIIl[2])) {
                return lIllllIlIIl[0];
            }
            var1 = var2.a(var2.gk);
        }
        if (bD.lIIllIlIlIllll(var2.cu.getLocalPlayer().getWorldLocation().equals((Object)var1) ? 1 : 0)) {
            return lIllllIlIIl[0];
        }
        WorldPoint var3 = var1;
        if (bD.lIIllIlIlIllII(TileObjects.getAll(tileObject -> {
            int n2;
            if (bD.lIIllIlIlIllll(tileObject instanceof GameObject) && bD.lIIllIlIlIllll(((GameObject)tileObject).getWorldArea().contains(var3) ? 1 : 0)) {
                n2 = lIllllIlIIl[1];

                if ((87 + 59 - 62 + 53 ^ 95 + 39 - 42 + 49) < ((0x54 ^ 0xB ^ (0xF ^ 0x4F)) & (0xDB ^ 0xBA ^ (1 ^ 0x7F) ^ -1))) {
                    return (2 & (2 ^ -1)) != 0;
                }
            } else {
                n2 = lIllllIlIIl[0];
            }
            return n2 != 0;
        }).size())) {
            return lIllllIlIIl[0];
        }
        Movement.setDestination((WorldPoint)worldPoint);
        return lIllllIlIIl[1];
    }

    private static boolean lIIllIlIllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIllIlIlIllIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIllIlIlIllll(int n2) {
        return n2 != 0;
    }

    static {
        bD.lIIllIlIlIlIll();
        gi = lIllllIlIIl[4];
        gh = lIllllIlIIl[3];
        ge = new Point(lIllllIlIIl[7], lIllllIlIIl[8]);
        gf = new Point(lIllllIlIIl[9], lIllllIlIIl[8]);
        gg = new Point(lIllllIlIIl[10], lIllllIlIIl[11]);
    }

    private static boolean lIIllIlIlIllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIllIlIllIIIl(int n2, int n3) {
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
        void var4;
        bD var5;
        WorldPoint var6;
        int n2 = graphicsObjectCreated.getGraphicsObject().getId();
        if ((!bD.lIIllIlIllIIII(n2, lIllllIlIIl[3]) || bD.lIIllIlIllIIIl(n2, lIllllIlIIl[4])) && bD.lIIllIlIlIllll((var6 = WorldPoint.fromLocal((Client)var5.cu, (LocalPoint)var4.getGraphicsObject().getLocation())).equals((Object)var5.a(ge)) ? 1 : 0)) {
            Point point;
            int n3;
            void var7;
            if (bD.lIIllIlIllIIIl((int)var7, lIllllIlIIl[3])) {
                n3 = lIllllIlIIl[5];

            } else {
                n3 = var5.gj = lIllllIlIIl[6];
            }
            if (bD.lIIllIlIllIIIl((int)var7, lIllllIlIIl[3])) {
                point = gf;

                if (2 != 2) {
                    return;
                }
            } else {
                point = gg;
            }
            var5.gk = point;
        }
    }

    @Inject
    protected MovingToSafespotTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.gj = lIllllIlIIl[0];
    }

    @Override
    public void r() {
        super.r();
        this.gk = null;
        this.gj = lIllllIlIIl[0];
    }

    private static boolean lIIllIlIlIlllI(int n2, int n3) {
        return n2 > n3;
    }
}

