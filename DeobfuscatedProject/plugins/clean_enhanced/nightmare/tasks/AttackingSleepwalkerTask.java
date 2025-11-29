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
import java.util.HashSet;
import java.util.List;
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
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Attacking SleepWalker", priority=0x7FFFFFFF, blocking=true, register=true)
public class AttackingSleepwalkerTask
extends al {

    private  HashSet<NPC> dU;
    private static final  Logger dT;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[2];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[2];
        while (ah.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((0xCB ^ 0xBD ^ (0xB0 ^ 0xC2)) > ((88 + 53 - 72 + 75 ^ 55 + 46 - -49 + 20) & (79 + 23 - -40 + 10 ^ 103 + 148 - 203 + 114 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean var14(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        Actor actor = projectile.getInteracting();
        if (ah.var15(actor instanceof NPC) && ah.var15(actor.getName().toLowerCase().contains(var2[var1[4]]) ? 1 : 0)) {
            this.dU.add((NPC)actor);
            0;
        }
    }

    private static boolean var16(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cr() {
        void var6_6;
        int n2;
        int var17;
        ah var18;
        void var19;
        int var20;
        int n3;
        NPC nPC = SquireNightmarePlugin.d();
        int[] nArray = SquireNightmarePlugin.o.stream().mapToInt(Integer::intValue).toArray();
        List list = NPCs.getAll((int[])nArray);
        if (ah.var16(list) && ah.var21(list.size(), var1[0])) {
            n3 = var1[1];
            0;
            if (2 <= 1) {
                return ((0x71 ^ 0 ^ (0xB9 ^ 0x90)) & (0x36 ^ 0x2B ^ (2 ^ 0x47) ^ -1)) != 0;
            }
        } else {
            n3 = var20 = var1[2];
        }
        if (ah.var21(var19.getAnimation(), var1[3])) {
            var18.cM.q(var1[2]);
            return var1[2];
        }
        if (ah.var15(var18.cK.assistantMode() ? 1 : 0)) {
            return var1[2];
        }
        if (ah.var15(var20) && ah.var14(var18.cM.aq() ? 1 : 0)) {
            var18.cM.h();
            var18.cM.q(var1[1]);
            dT.info(var2[var1[2]], (Object)var18.cM.Q());
            var17 = var18.cM.Q() + var1[1];
            dT.info(var2[var1[1]], (Object)var17);
            var18.cM.h(var17);
            var18.dU = new HashSet();
            if (ah.var15(var18.cM.am() ? 1 : 0)) {
                var18.cM.o(var1[2]);
            }
        }
        if (ah.var14(var18.cM.aq() ? 1 : 0)) {
            return var1[2];
        }
        if (ah.var16(var18.cJ.aY())) {
            n2 = var1[1];
            0;
            if (((0xB2 ^ 0xA9) & ~(0xB9 ^ 0xA2)) != 0) {
                return ((0x89 ^ 0xC3) & ~(0xE2 ^ 0xA8)) != 0;
            }
        } else {
            n2 = var1[2];
        }
        if (ah.var15(var17 = n2)) {
            return var1[2];
        }
        if (ah.var15(var18.cM.ap())) {
            return var1[2];
        }
        NPC var22 = var18.cJ.a(var18.dU);
        if (ah.var23(var22) && ah.var15(var18.dU.isEmpty() ? 1 : 0)) {
            WorldPoint var24 = SquireNightmarePlugin.e();
            if (ah.var15(var24.equals((Object)var18.cL.getLocalPlayer().getWorldLocation()) ? 1 : 0)) {
                return var1[1];
            }
            if (ah.var25(var18.cJ.ax().size())) {
                return var1[1];
            }
            Movement.setDestination((WorldPoint)var24);
            return var1[1];
        }
        if (ah.var21(var18.dU.size(), var1[0])) {
            var18.cM.q(var1[2]);
            return var1[2];
        }
        return this.x((NPC)var6_6);
    }

    private static void var26() {
        var1 = new int[7];
        ah.var1[0] = 0x2E ^ 0x2A;
        ah.var1[1] = 1;
        ah.var1[2] = (0x53 ^ 6) & ~(0x96 ^ 0xC3);
        ah.var1[3] = -(0xFFFFA767 & 0x5EFB) & (0xFFFFAFFF & 0x77FE);
        ah.var1[4] = 2;
        ah.var1[5] = 3;
        ah.var1[6] = 0xC ^ 0x5C ^ (0x6C ^ 0x34);
    }

    @Inject
    public AttackingSleepwalkerTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
    }

    private static boolean var21(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var23(Object object) {
        return object == null;
    }

    private static void var27() {
        var2 = new String[var1[5]];
        ah.var2[ah.var1[2]] = "Current phase is {}";
        ah.var2[ah.var1[1]] = "New phase is {}";
        ah.var2[ah.var1[4]] = "sleepwalker";
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    private static boolean var25(int n2) {
        return n2 > 0;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    static {
        ah.var26();
        ah.var27();
        dT = LoggerFactory.getLogger(AttackingSleepwalkerTask.class);
    }

    private static boolean var15(int n2) {
        return n2 != 0;
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.sleepwalkerGear().selected(EquipmentSetup.class);
    }
}

