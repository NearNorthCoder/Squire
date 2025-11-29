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
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging Solidify Attack", priority=30, blocking=true, register=true)
public class DodgingSolidifyAttackTask
extends AutotoaManager {
    
    private  WorldPoint gc;
    private static final  int gb;
    @Inject
    private  bD gd;

    private static boolean var2(int n2, int n3) {
        return n2 == n3;
    }

    private static void var3() {
        var1 = new int[4];
        bC.var1[0] = 1;
        bC.var1[1] = (0xDE ^ 0x90 ^ (0xC0 ^ 0xC5)) & (0x53 ^ 0 ^ (0x8B ^ 0x93) ^ -1);
        bC.var1[2] = -(0xFFFFFFF7 & 0x570D) & (0xFFFFFFFF & 0x5FA6);
        bC.var1[3] = 2;
    }

    static {
        bC.var3();
        gb = var1[2];
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(Object object) {
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
        if (bC.var2(projectileSpawned.getProjectile().getId(), var1[2])) {
            this.gc = Players.getLocal().getWorldLocation();
        }
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean bl() {
        WorldPoint var7;
        bC var8;
        int[] nArray = new int[var1[0]];
        nArray[bC.var1[1]] = var1[2];
        if (bC.var6(Projectiles.getAll((int[])nArray).isEmpty() ? 1 : 0)) {
            this.gc = null;
            return var1[1];
        }
        if (bC.var5(var8.gc) && bC.var4((var7 = var8.gc.dy(var1[0])).equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var7);
            var8.gd.sleep(var1[3]);
            var8.gc = null;
            return var1[0];
        }
        return var1[1];
    }
}

