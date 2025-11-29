/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum16;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking swarms", priority=15, blocking=true, register=true)
@Singleton
public class AttackingSwarmsTask
extends AutotoaManager {
    
    private final  Set<NPC> eF;

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.kephriSwarm();
    }

    @Inject
    protected AttackingSwarmsTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bi.SWARM);
        this.eF = new HashSet<NPC>();
    }

    private static boolean var3(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    private static void var5() {
        var1 = new String[var2[4]];
        bd.var1[bd.var2[0]] = "Attack";
        bd.var1[bd.var2[2]] = "Scarab Swarm";
        bd.var1[bd.var2[3]] = "Scarab Swarm";
    }

    private static void var6() {
        var2 = new int[6];
        bd.var2[0] = (0x83 ^ 0x8E) & ~(0x36 ^ 0x3B);
        bd.var2[1] = 0x55 ^ 0x50;
        bd.var2[2] = 1;
        bd.var2[3] = 2;
        bd.var2[4] = 3;
        bd.var2[5] = 0x2F ^ 0x67 ^ (0xE1 ^ 0xA1);
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        this.eF.remove(npcDespawned.getNpc());
        0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var8;
        NPC nPC3 = this.bO();
        NPC nPC4 = NPCs.getAll(nPC2 -> {
            int n2;
            if (bd.var7(nPC2.getName().equals(var1[var2[3]]) ? 1 : 0) && bd.var9(this.eF.contains(nPC2) ? 1 : 0) && bd.var9(nPC2.isDead() ? 1 : 0) && bd.var3(nPC2.distanceTo((Locatable)nPC3), var2[4])) {
                n2 = var2[2];
                0;
                if ((0x53 ^ 0x56) <= 0) {
                    return ((0x7A ^ 0x76) & ~(0x2B ^ 0x27)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }).stream().filter(nPC2 -> {
            boolean bl2;
            if (bd.var9(nPC3.getWorldArea().isInMeleeDistance(nPC2.getWorldLocation()) ? 1 : 0)) {
                bl2 = var2[2];
                0;
                
            } else {
                bl2 = var2[0];
            }
            return bl2;
        }).min(Comparator.comparingInt(nPC -> nPC.getWorldLocation().distanceToPath(this.cu, Players.getLocal().getWorldLocation()))).orElse(null);
        if (bd.var10(nPC4)) {
            return var2[0];
        }
        if (bd.var3(var8.distanceTo((Locatable)Players.getLocal()), var2[1])) {
            Movement.setDestination((WorldPoint)var8.getWorldLocation());
            return var2[2];
        }
        this.bp();
        nPC4.interact(var1[var2[0]]);
        return var2[0];
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    static {
        bd.var6();
        bd.var5();
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        Actor actor = projectile.getInteracting();
        if (bd.var4(actor) && bd.var7(actor.getName().equals(var1[var2[2]]) ? 1 : 0)) {
            this.eF.add((NPC)actor);
            0;
        }
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = var2[0];
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = var2[0];
        while (bd.var17(var32, var31)) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if (3 <= 3) continue;
            return null;
        }
        return String.valueOf(var27);
    }

    private static boolean var10(Object object) {
        return object == null;
    }
}

