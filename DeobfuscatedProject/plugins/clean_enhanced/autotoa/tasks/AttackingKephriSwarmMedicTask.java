/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum16;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking kephri swarm (medic)", priority=12, register=true, blocking=true)
public class AttackingKephriSwarmMedicTask
extends AutotoaManager {
    private final  Set<NPC> eD;
    
    private  NPC eE;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.gearSwapZebak();
    }

    private static boolean var10(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }

    static {
        bc.var12();
        bc.var13();
    }

    private static void var12() {
        var1 = new int[5];
        bc.var1[0] = 0xFFFFF7D3 & 0xFAE;
        bc.var1[1] = (89 + 33 - 120 + 175 ^ 153 + 89 - 222 + 152) & (0x85 ^ 0xA2 ^ (0x51 ^ 0x6B) ^ -1);
        bc.var1[2] = 1;
        bc.var1[3] = 2;
        bc.var1[4] = 0x2F ^ 0x5E ^ (0x75 ^ 0xC);
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    @Override
    protected boolean bL() {
        int n2;
        bc var15;
        if (bc.var14(this.bR() ? 1 : 0)) {
            return var1[1];
        }
        NPC var16 = var15.bO();
        NPC var17 = NPCs.getAll(nPC2 -> {
            int n2;
            if (bc.var14(nPC2.getName().equals(var2[var1[2]]) ? 1 : 0) && bc.var11(this.eD.contains(nPC2) ? 1 : 0) && bc.var11(nPC2.isDead() ? 1 : 0) && bc.var10(nPC2.distanceTo((Locatable)var16), var1[2])) {
                n2 = var1[2];
                0;
                if (1 != 1) {
                    return ((0xA4 ^ 0xB0 ^ 2) & (0x78 ^ 0x4D ^ (0x55 ^ 0x76) ^ -1)) != 0;
                }
            } else {
                n2 = var1[1];
            }
            return n2 != 0;
        }).stream().filter(nPC2 -> {
            boolean bl2;
            if (bc.var11(var16.getWorldArea().isInMeleeDistance(nPC2.getWorldLocation()) ? 1 : 0)) {
                bl2 = var1[2];
                0;
                if (((0x40 ^ 0x13) & ~(0x58 ^ 0xB)) >= (0x46 ^ 0x42)) {
                    return ((0xF1 ^ 0xB7) & ~(0x1E ^ 0x58)) != 0;
                }
            } else {
                bl2 = var1[1];
            }
            return bl2;
        }).min(Comparator.comparingInt(nPC -> nPC.getWorldLocation().distanceToPath(this.cu, Players.getLocal().getWorldLocation()))).orElse(null);
        if (bc.var18(var17)) {
            return var1[1];
        }
        var15.bp();
        var17.interact(var2[var1[1]]);
        var15.eE = var17;
        if (bc.var11(bc.bV() ? 1 : 0) && bc.var11(var15.bR() ? 1 : 0)) {
            n2 = var1[2];
            0;
            if (1 >= (0x49 ^ 0x4D)) {
                return ((0xE5 ^ 0xBD) & ~(0x2D ^ 0x75)) != 0;
            }
        } else {
            n2 = var1[1];
        }
        return n2 != 0;
    }

    private static boolean var19(int n2, int n3) {
        return n2 == n3;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        if (bc.var19(projectileSpawned.getProjectile().getId(), var1[0]) && bc.var9(this.eE)) {
            this.eD.add(this.eE);
            0;
            this.eE = null;
        }
    }

    @Inject
    protected AttackingKephriSwarmMedicTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bi.ATTACK);
        this.eD = new HashSet<NPC>();
    }

    private static boolean var18(Object object) {
        return object == null;
    }

    private static void var13() {
        var2 = new String[var1[3]];
        bc.var2[bc.var1[1]] = "Attack";
        bc.var2[bc.var1[2]] = "Scarab Swarm";
    }
}

