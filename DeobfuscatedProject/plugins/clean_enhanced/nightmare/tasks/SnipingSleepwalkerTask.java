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
import java.util.HashSet;
import java.util.Set;
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
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="SNIPING SleepWalker", priority=11, register=true, blocking=true)
public class SnipingSleepwalkerTask
extends al {
    private static final  int dX;
    private static final  Logger dV;
    
    private static final  int dW;
    
    private  Set<NPC> dY;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[0];
        while (ai.var3(var13, var12)) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (2 > -1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean var15(int n2, int n3) {
        return n2 <= n3;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean var22(int n2, int n3) {
        return n2 != n3;
    }

    private static void var23() {
        var2 = new int[8];
        ai.var2[0] = (5 ^ 0x5E ^ (0x3F ^ 0x47)) & (139 + 180 - 284 + 147 ^ 71 + 61 - 31 + 48 ^ -1);
        ai.var2[1] = -(0xFFFFF4ED & 0x5F7F) & (0xFFFFFFFF & 0x7FFE);
        ai.var2[2] = 1;
        ai.var2[3] = 2;
        ai.var2[4] = 86 + 33 - 107 + 168 ^ 74 + 158 - 181 + 137;
        ai.var2[5] = -(0xFFFFFE8F & 0x1FF2) & (0xFFFFFFFF & 0x3FD7);
        ai.var2[6] = 0xFFFFF7FD & 0x297B;
        ai.var2[7] = 3;
    }

    @Inject
    public SnipingSleepwalkerTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
    }

    private static boolean var24(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var25;
        void var26;
        NPC nPC = SquireNightmarePlugin.d();
        if (ai.var24(nPC)) {
            return;
        }
        if (ai.var22(var2[1], var26.getId())) {
            return;
        }
        Projectile var27 = var25.getProjectile();
        Actor var28 = var27.getInteracting();
        if (ai.var29(var28 instanceof NPC) && ai.var29(var28.getName().toLowerCase().contains(var1[var2[2]]) ? 1 : 0)) {
            ai var30;
            var30.dY.add((NPC)var28);
            0;
        }
    }

    private static void var31() {
        var1 = new String[var2[7]];
        ai.var1[ai.var2[0]] = "Attack";
        ai.var1[ai.var2[2]] = "sleepwalker";
        ai.var1[ai.var2[3]] = "sleepwalker";
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.sleepwalkerGear().selected(EquipmentSetup.class);
    }

    static {
        ai.var23();
        ai.var31();
        dW = var2[5];
        dX = var2[6];
        dV = LoggerFactory.getLogger(SnipingSleepwalkerTask.class);
    }

    private static boolean var32(Object object) {
        return object != null;
    }

    private static boolean var29(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cr() {
        void var2_2;
        ai var33;
        if (ai.var4(this.cK.lowerDamageFinalPhase() ? 1 : 0)) {
            return var2[0];
        }
        if (ai.var29(var33.cK.assistantMode() ? 1 : 0)) {
            return var2[0];
        }
        NPC var34 = SquireNightmarePlugin.d();
        if (ai.var22(var2[1], var34.getId())) {
            var33.dY = new HashSet<NPC>();
            return var2[0];
        }
        if (ai.var4(var33.cu() ? 1 : 0)) {
            return var2[0];
        }
        NPC var35 = NPCs.getNearest((WorldPoint)var34.getWorldLocation(), nPC2 -> {
            int n2;
            if (ai.var29(nPC2.getName().equalsIgnoreCase(var1[var2[3]]) ? 1 : 0) && ai.var4(nPC2.isDead() ? 1 : 0) && ai.var4(this.dY.contains(nPC2) ? 1 : 0) && ai.var15(var34.getWorldArea().distanceTo((Locatable)nPC2), var2[4]) && ai.var29(nPC2.isMoving() ? 1 : 0)) {
                n2 = var2[2];
                0;
                if null != null {
                    return ((0x47 ^ 0x1B) & ~(0xCD ^ 0x91)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (!ai.var32(var35) || ai.var29(var33.dY.contains(var35) ? 1 : 0)) {
            return var2[0];
        }
        EquipmentSetup var36 = (EquipmentSetup)var33.cK.sleepwalkerGear().selected(EquipmentSetup.class);
        if (ai.var24(var36)) {
            return var2[0];
        }
        if (ai.var4(var36.isFullyEquipped() ? 1 : 0)) {
            var36.swap();
        }
        var2_2.interact(var1[var2[0]]);
        return var2[2];
    }
}

