/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="SNIPING SleepWalker", priority=11, register=true, blocking=true)
public class SnipingSleepwalkerTask
extends NightmareTaskBase {
    private static final  int dX;
    private static final  Logger dV;
    
    private static final  int dW;
    
    private  Set<NPC> dY;

    private static boolean lIIIlllIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlllIlIlllll(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIIlllIllIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIlllIllIIIIl(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public SnipingSleepwalkerTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
    }

    private static boolean lIIIlllIllIIIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var2;
        void var3;
        NPC nPC = SquireNightmarePlugin.d();
        if (ai.lIIIlllIllIIIll(nPC)) {
            return;
        }
        if (ai.lIIIlllIllIIIIl(llllIIIIlIll[1], var3.getId())) {
            return;
        }
        Projectile var4 = var2.getProjectile();
        Actor var5 = var4.getInteracting();
        if (ai.lIIIlllIllIIIII(var5 instanceof NPC) && ai.lIIIlllIllIIIII(var5.getName().toLowerCase().contains(lllIllllllll[llllIIIIlIll[2]]) ? 1 : 0)) {
            ai var6;
            var6.dY.add((NPC)var5);

        }
    }

    private static void lIIIlllIIlllllI() {
        lllIllllllll = new String[llllIIIIlIll[7]];
        ai.lllIllllllll[ai.llllIIIIlIll[0]] = "Attack";
        ai.lllIllllllll[ai.llllIIIIlIll[2]] = "sleepwalker";
        ai.lllIllllllll[ai.llllIIIIlIll[3]] = "sleepwalker";
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.sleepwalkerGear().selected(EquipmentSetup.class);
    }

    static {
        ai.lIIIlllIlIllllI();
        ai.lIIIlllIIlllllI();
        dW = llllIIIIlIll[5];
        dX = llllIIIIlIll[6];
        dV = LoggerFactory.getLogger(SnipingSleepwalkerTask.class);
    }

    private static boolean lIIIlllIllIIIlI(Object object) {
        return object != null;
    }

    private static boolean lIIIlllIllIIIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cr() {
        void var2_2;
        ai var7;
        if (ai.lIIIlllIlIlllll(this.cK.lowerDamageFinalPhase() ? 1 : 0)) {
            return llllIIIIlIll[0];
        }
        if (ai.lIIIlllIllIIIII(var7.cK.assistantMode() ? 1 : 0)) {
            return llllIIIIlIll[0];
        }
        NPC var8 = SquireNightmarePlugin.d();
        if (ai.lIIIlllIllIIIIl(llllIIIIlIll[1], var8.getId())) {
            var7.dY = new HashSet<NPC>();
            return llllIIIIlIll[0];
        }
        if (ai.lIIIlllIlIlllll(var7.cu() ? 1 : 0)) {
            return llllIIIIlIll[0];
        }
        NPC var9 = NPCs.getNearest((WorldPoint)var8.getWorldLocation(), nPC2 -> {
            int n2;
            if (ai.lIIIlllIllIIIII(nPC2.getName().equalsIgnoreCase(lllIllllllll[llllIIIIlIll[3]]) ? 1 : 0) && ai.lIIIlllIlIlllll(nPC2.isDead() ? 1 : 0) && ai.lIIIlllIlIlllll(this.dY.contains(nPC2) ? 1 : 0) && ai.lIIIlllIllIIlII(var8.getWorldArea().distanceTo((Locatable)nPC2), llllIIIIlIll[4]) && ai.lIIIlllIllIIIII(nPC2.isMoving() ? 1 : 0)) {
                n2 = llllIIIIlIll[2];

                }
            } else {
                n2 = llllIIIIlIll[0];
            }
            return n2 != 0;
        });
        if (!ai.lIIIlllIllIIIlI(var9) || ai.lIIIlllIllIIIII(var7.dY.contains(var9) ? 1 : 0)) {
            return llllIIIIlIll[0];
        }
        EquipmentSetup var10 = (EquipmentSetup)var7.cK.sleepwalkerGear().selected(EquipmentSetup.class);
        if (ai.lIIIlllIllIIIll(var10)) {
            return llllIIIIlIll[0];
        }
        if (ai.lIIIlllIlIlllll(var10.isFullyEquipped() ? 1 : 0)) {
            var10.swap();
        }
        var2_2.interact(lllIllllllll[llllIIIIlIll[0]]);
        return llllIIIIlIll[2];
    }
}

