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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bG;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@Singleton
/* TASK: Moving to safespot -> MovingtosafespotTask */
@TaskDesc(name="Moving to safespot", priority=25, blocking=true, register=true)
public class bD
extends bG {
    private static final /* synthetic */ int gi;
    private static /* synthetic */ int[] lIllllIlIIl;
    private /* synthetic */ int gj;
    private static final /* synthetic */ Point gg;
    private static final /* synthetic */ Point ge;
    private static final /* synthetic */ int gh;
    private static final /* synthetic */ Point gf;
    private /* synthetic */ Point gk;

    @Override
    public boolean bl() {
        WorldPoint var6;
        bD var7;
        WorldPoint worldPoint = this.a(ge);
        if (bD.lIIllIlIlIllII(this.gj)) {
            this.gj -= lIllllIlIIl[1];
            if (bD.lIIllIlIlIllIl(this.gk, gg) && bD.lIIllIlIlIlllI(this.gj, lIllllIlIIl[2])) {
                return lIllllIlIIl[0];
            }
            var6 = var7.a(var7.gk);
        }
        if (bD.lIIllIlIlIllll(var7.cu.getLocalPlayer().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
            return lIllllIlIIl[0];
        }
        WorldPoint var3 = var6;
        if (bD.lIIllIlIlIllII(TileObjects.getAll(tileObject -> {
            int n2;
            if (bD.lIIllIlIlIllll(tileObject instanceof GameObject) && bD.lIIllIlIlIllll(((GameObject)tileObject).getWorldArea().contains(var3) ? 1 : 0)) {
                n2 = lIllllIlIIl[1];
                0;
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

    private static void lIIllIlIlIlIll() {
        lIllllIlIIl = new int[12];
        bD.lIllllIlIIl[0] = (0x28 ^ 0x1B) & ~(0x20 ^ 0x13);
        bD.lIllllIlIIl[1] = 1;
        bD.lIllllIlIIl[2] = 73 + 70 - 31 + 33 ^ 95 + 15 - 36 + 75;
        bD.lIllllIlIIl[3] = 0xFFFF9FBF & 0x68FC;
        bD.lIllllIlIIl[4] = -(0xFFFFFF5B & 0x34E5) & (0xFFFFBEFB & 0x7DFF);
        bD.lIllllIlIIl[5] = 0x18 ^ 0x1E;
        bD.lIllllIlIIl[6] = 0x6B ^ 0x43 ^ (0x5B ^ 0x79);
        bD.lIllllIlIIl[7] = 1 + 122 - -46 + 0 ^ 150 + 42 - 136 + 125;
        bD.lIllllIlIIl[8] = 0xC ^ 0x29;
        bD.lIllllIlIIl[9] = 0x32 ^ 0x2C;
        bD.lIllllIlIIl[10] = 9 ^ 0x14;
        bD.lIllllIlIIl[11] = 76 + 88 - 79 + 94 ^ 110 + 94 - 201 + 146;
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
        void var5;
        bD var2;
        WorldPoint var1;
        int n2 = graphicsObjectCreated.getGraphicsObject().getId();
        if ((!bD.lIIllIlIllIIII(n2, lIllllIlIIl[3]) || bD.lIIllIlIllIIIl(n2, lIllllIlIIl[4])) && bD.lIIllIlIlIllll((var1 = WorldPoint.fromLocal((Client)var2.cu, (LocalPoint)var5.getGraphicsObject().getLocation())).equals((Object)var2.a(ge)) ? 1 : 0)) {
            Point point;
            int n3;
            void var4;
            if (bD.lIIllIlIllIIIl((int)var4, lIllllIlIIl[3])) {
                n3 = lIllllIlIIl[5];
                0;
                if (-3 > 0) {
                    return;
                }
            } else {
                n3 = var2.gj = lIllllIlIIl[6];
            }
            if (bD.lIIllIlIllIIIl((int)var4, lIllllIlIIl[3])) {
                point = gf;
                0;
                if (2 != 2) {
                    return;
                }
            } else {
                point = gg;
            }
            var2.gk = point;
        }
    }

    @Inject
    protected bD(Client client, z z2, TOAConfig tOAConfig) {
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

