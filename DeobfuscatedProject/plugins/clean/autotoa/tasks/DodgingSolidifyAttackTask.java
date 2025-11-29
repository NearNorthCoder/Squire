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
package gg.squire.autotoa.tasks;

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
import gg.squire.autotoa.tasks.MovingToSafespotTask;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging Solidify Attack", priority=30, blocking=true, register=true)
public class DodgingSolidifyAttackTask
extends AutotoaTaskBase {
    
    private  WorldPoint gc;
    private static final  int gb;
    @Inject
    private  bD gd;

    private static boolean lIIlllIllIllll(int n2, int n3) {
        return n2 == n3;
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
    protected DodgingSolidifyAttackTask(Client client, z z2, TOAConfig tOAConfig) {
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
        WorldPoint var1;
        bC var2;
        int[] nArray = new int[llIIIIllllI[0]];
        nArray[bC.llIIIIllllI[1]] = llIIIIllllI[2];
        if (bC.lIIlllIllIllII(Projectiles.getAll((int[])nArray).isEmpty() ? 1 : 0)) {
            this.gc = null;
            return llIIIIllllI[1];
        }
        if (bC.lIIlllIllIllIl(var2.gc) && bC.lIIlllIllIlllI((var1 = var2.gc.dy(llIIIIllllI[0])).equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var1);
            var2.gd.sleep(llIIIIllllI[3]);
            var2.gc = null;
            return llIIIIllllI[0];
        }
        return llIIIIllllI[1];
    }
}

