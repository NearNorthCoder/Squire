/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Attacking SleepWalker", priority=0x7FFFFFFF, blocking=true, register=true)
public class AttackingSleepwalkerTask
extends NightmareTaskBase {

    private  HashSet<NPC> dU;
    private static final  Logger dT;

        return String.valueOf(var1);
    }

    private static boolean lIIlIIIIIIIIlll(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        Actor actor = projectile.getInteracting();
        if (ah.lIIlIIIIIIIIllI(actor instanceof NPC) && ah.lIIlIIIIIIIIllI(actor.getName().toLowerCase().contains(llllIIlllIII[llllIIlllIlI[4]]) ? 1 : 0)) {
            this.dU.add((NPC)actor);

        }
    }

    private static boolean lIIlIIIIIIIIlII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cr() {
        void var6_6;
        int n2;
        int var2;
        ah var3;
        void var4;
        int var5;
        int n3;
        NPC nPC = SquireNightmarePlugin.d();
        int[] nArray = SquireNightmarePlugin.o.stream().mapToInt(Integer::intValue).toArray();
        List list = NPCs.getAll((int[])nArray);
        if (ah.lIIlIIIIIIIIlII(list) && ah.lIIlIIIIIIIIlIl(list.size(), llllIIlllIlI[0])) {
            n3 = llllIIlllIlI[1];

            if (2 <= 1) {
                return ((0x71 ^ 0 ^ (0xB9 ^ 0x90)) & (0x36 ^ 0x2B ^ (2 ^ 0x47) ^ -1)) != 0;
            }
        } else {
            n3 = var5 = llllIIlllIlI[2];
        }
        if (ah.lIIlIIIIIIIIlIl(var4.getAnimation(), llllIIlllIlI[3])) {
            var3.cM.q(llllIIlllIlI[2]);
            return llllIIlllIlI[2];
        }
        if (ah.lIIlIIIIIIIIllI(var3.cK.assistantMode() ? 1 : 0)) {
            return llllIIlllIlI[2];
        }
        if (ah.lIIlIIIIIIIIllI(var5) && ah.lIIlIIIIIIIIlll(var3.cM.aq() ? 1 : 0)) {
            var3.cM.h();
            var3.cM.q(llllIIlllIlI[1]);
            dT.info(llllIIlllIII[llllIIlllIlI[2]], (Object)var3.cM.Q());
            var2 = var3.cM.Q() + llllIIlllIlI[1];
            dT.info(llllIIlllIII[llllIIlllIlI[1]], (Object)var2);
            var3.cM.h(var2);
            var3.dU = new HashSet();
            if (ah.lIIlIIIIIIIIllI(var3.cM.am() ? 1 : 0)) {
                var3.cM.o(llllIIlllIlI[2]);
            }
        }
        if (ah.lIIlIIIIIIIIlll(var3.cM.aq() ? 1 : 0)) {
            return llllIIlllIlI[2];
        }
        if (ah.lIIlIIIIIIIIlII(var3.cJ.aY())) {
            n2 = llllIIlllIlI[1];

            if (((0xB2 ^ 0xA9) & ~(0xB9 ^ 0xA2)) != 0) {
                return false;
            }
        } else {
            n2 = llllIIlllIlI[2];
        }
        if (ah.lIIlIIIIIIIIllI(var2 = n2)) {
            return llllIIlllIlI[2];
        }
        if (ah.lIIlIIIIIIIIllI(var3.cM.ap())) {
            return llllIIlllIlI[2];
        }
        NPC var6 = var3.cJ.a(var3.dU);
        if (ah.lIIlIIIIIIIlIIl(var6) && ah.lIIlIIIIIIIIllI(var3.dU.isEmpty() ? 1 : 0)) {
            WorldPoint var7 = SquireNightmarePlugin.e();
            if (ah.lIIlIIIIIIIIllI(var7.equals((Object)var3.cL.getLocalPlayer().getWorldLocation()) ? 1 : 0)) {
                return llllIIlllIlI[1];
            }
            if (ah.lIIlIIIIIIIlIlI(var3.cJ.ax().size())) {
                return llllIIlllIlI[1];
            }
            Movement.setDestination((WorldPoint)var7);
            return llllIIlllIlI[1];
        }
        if (ah.lIIlIIIIIIIIlIl(var3.dU.size(), llllIIlllIlI[0])) {
            var3.cM.q(llllIIlllIlI[2]);
            return llllIIlllIlI[2];
        }
        return this.x((NPC)var6_6);
    }

    @Inject
    public AttackingSleepwalkerTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
    }

    private static boolean lIIlIIIIIIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIIIIIIIlIIl(Object object) {
        return object == null;
    }

    private static void lIIlIIIIIIIIIII() {
        llllIIlllIII = new String[llllIIlllIlI[5]];
        ah.llllIIlllIII[ah.llllIIlllIlI[2]] = "Current phase is {}";
        ah.llllIIlllIII[ah.llllIIlllIlI[1]] = "New phase is {}";
        ah.llllIIlllIII[ah.llllIIlllIlI[4]] = "sleepwalker";
    }

    private static boolean lIIlIIIIIIIlIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIIIIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        ah.lIIlIIIIIIIIIll();
        ah.lIIlIIIIIIIIIII();
        dT = LoggerFactory.getLogger(AttackingSleepwalkerTask.class);
    }

    private static boolean lIIlIIIIIIIIllI(int n2) {
        return n2 != 0;
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.sleepwalkerGear().selected(EquipmentSetup.class);
    }
}

