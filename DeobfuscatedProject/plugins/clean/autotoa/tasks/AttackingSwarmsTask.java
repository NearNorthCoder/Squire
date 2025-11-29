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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum118;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking swarms", priority=15, blocking=true, register=true)
@Singleton
public class AttackingSwarmsTask
extends AutotoaTaskBase {
    
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

    private static boolean lIlIIIlIIllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIlIIllIlI(Object object) {
        return object != null;
    }

    private static void lIlIIIlIIlIllI() {
        llIIllIIlIl = new String[llIIllIIllI[4]];
        bd.llIIllIIlIl[bd.llIIllIIllI[0]] = "Attack";
        bd.llIIllIIlIl[bd.llIIllIIllI[2]] = "Scarab Swarm";
        bd.llIIllIIlIl[bd.llIIllIIllI[3]] = "Scarab Swarm";
    }

    private static boolean lIlIIIlIIllIll(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        this.eF.remove(npcDespawned.getNpc());

    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var1;
        NPC nPC3 = this.bO();
        NPC nPC4 = NPCs.getAll(nPC2 -> {
            int n2;
            if (bd.lIlIIIlIIllIll(nPC2.getName().equals(llIIllIIlIl[llIIllIIllI[3]]) ? 1 : 0) && bd.lIlIIIlIIlllII(this.eF.contains(nPC2) ? 1 : 0) && bd.lIlIIIlIIlllII(nPC2.isDead() ? 1 : 0) && bd.lIlIIIlIIllIIl(nPC2.distanceTo((Locatable)nPC3), llIIllIIllI[4])) {
                n2 = llIIllIIllI[2];

                if ((0x53 ^ 0x56) <= 0) {
                    return false;
                }
            } else {
                n2 = llIIllIIllI[0];
            }
            return n2 != 0;
        }).stream().filter(nPC2 -> {
            boolean bl2;
            if (bd.lIlIIIlIIlllII(nPC3.getWorldArea().isInMeleeDistance(nPC2.getWorldLocation()) ? 1 : 0)) {
                bl2 = llIIllIIllI[2];

                if (1 == 0) {
                    return ((0x88 ^ 0xA2 ^ (0xC6 ^ 0x8D)) & (111 + 23 - 133 + 162 ^ 132 + 189 - 231 + 104 ^ -1)) != 0;
                }
            } else {
                bl2 = llIIllIIllI[0];
            }
            return bl2;
        }).min(Comparator.comparingInt(nPC -> nPC.getWorldLocation().distanceToPath(this.cu, Players.getLocal().getWorldLocation()))).orElse(null);
        if (bd.lIlIIIlIIllIII(nPC4)) {
            return llIIllIIllI[0];
        }
        if (bd.lIlIIIlIIllIIl(var1.distanceTo((Locatable)Players.getLocal()), llIIllIIllI[1])) {
            Movement.setDestination((WorldPoint)var1.getWorldLocation());
            return llIIllIIllI[2];
        }
        this.bp();
        nPC4.interact(llIIllIIlIl[llIIllIIllI[0]]);
        return llIIllIIllI[0];
    }

    static {
        bd.lIlIIIlIIlIlll();
        bd.lIlIIIlIIlIllI();
    }

    private static boolean lIlIIIlIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        Actor actor = projectile.getInteracting();
        if (bd.lIlIIIlIIllIlI(actor) && bd.lIlIIIlIIllIll(actor.getName().equals(llIIllIIlIl[llIIllIIllI[2]]) ? 1 : 0)) {
            this.eF.add((NPC)actor);

        }
    }

    private static boolean lIlIIIlIIlllII(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var2);
    }

    private static boolean lIlIIIlIIllIII(Object object) {
        return object == null;
    }
}

