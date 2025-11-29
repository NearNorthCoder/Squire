/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.movement.Movement
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.movement.Movement;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bD;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bG;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Dodging Solidify Attack", priority=30, blocking=true, register=true)
public class bC
extends bG {
    private static /* synthetic */ int[] llIIIIllllI;
    private /* synthetic */ WorldPoint gc;
    private static final /* synthetic */ int gb;
    @Inject
    private /* synthetic */ bD gd;

    private static boolean lIIlllIllIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIlllIllIlIll() {
        llIIIIllllI = new int[4];
        bC.llIIIIllllI[0] = " ".length();
        bC.llIIIIllllI[1] = (0xDE ^ 0x90 ^ (0xC0 ^ 0xC5)) & (0x53 ^ 0 ^ (0x8B ^ 0x93) ^ -" ".length());
        bC.llIIIIllllI[2] = -(0xFFFFFFF7 & 0x570D) & (0xFFFFFFFF & 0x5FA6);
        bC.llIIIIllllI[3] = "  ".length();
    }

    static {
        bC.lIIlllIllIlIll();
        gb = llIIIIllllI[2];
    }

    private static boolean lIIlllIllIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIllIllIl(Object object) {
        return object != null;
    }

    @Override
    public void r() {
        this.gc = null;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    @Inject
    protected bC(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        if (bC.lIIlllIllIllll(projectileSpawned.getProjectile().getId(), llIIIIllllI[2])) {
            this.gc = Players.getLocal().getWorldLocation();
        }
    }

    private static boolean lIIlllIllIllII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean bl() {
        WorldPoint llllllllllllllllIlIIIllIIIIIIIII;
        bC llllllllllllllllIlIIIllIIIIIIIIl;
        int[] nArray = new int[llIIIIllllI[0]];
        nArray[bC.llIIIIllllI[1]] = llIIIIllllI[2];
        if (bC.lIIlllIllIllII(Projectiles.getAll((int[])nArray).isEmpty() ? 1 : 0)) {
            this.gc = null;
            return llIIIIllllI[1];
        }
        if (bC.lIIlllIllIllIl(llllllllllllllllIlIIIllIIIIIIIIl.gc) && bC.lIIlllIllIlllI((llllllllllllllllIlIIIllIIIIIIIII = llllllllllllllllIlIIIllIIIIIIIIl.gc.dy(llIIIIllllI[0])).equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)llllllllllllllllIlIIIllIIIIIIIII);
            llllllllllllllllIlIIIllIIIIIIIIl.gd.sleep(llIIIIllllI[3]);
            llllllllllllllllIlIIIllIIIIIIIIl.gc = null;
            return llIIIIllllI[0];
        }
        return llIIIIllllI[1];
    }
}

