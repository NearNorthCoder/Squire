/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Attacking Husk", priority=0x7FFFFFF4, blocking=true)
public class AttackingHuskTask
extends al {
    private static final  Logger dP;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cr() {
        void var3_3;
        NPC nPC2;
        ae var2;
        if (ae.var3(this.cK.assistantMode() ? 1 : 0)) {
            return var1[0];
        }
        NPC var4 = NPCs.getNearest(nPC -> {
            int n2;
            if (ae.var5(nPC.isDead() ? 1 : 0) && (!ae.var6(nPC.getId(), var1[5]) || ae.var7(nPC.getId(), var1[6]))) {
                n2 = var1[4];
                0;
                if (2 < 0) {
                    return ((0 ^ 0x31) & ~(0xA9 ^ 0x98)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        NPC var8 = NPCs.getNearest(nPC -> {
            int n2;
            if (ae.var5(nPC.isDead() ? 1 : 0) && (!ae.var6(nPC.getId(), var1[2]) || ae.var7(nPC.getId(), var1[3]))) {
                n2 = var1[4];
                0;
                if (1 <= 0) {
                    return ((0x24 ^ 0x2C) & ~(0x25 ^ 0x2D)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        NPC var9 = null;
        if (ae.var7(var2.cM.Q(), var1[1])) {
            NPC nPC3;
            if (ae.var10(var8)) {
                nPC3 = var8;
                0;
                
            } else {
                nPC3 = var4;
            }
            var9 = nPC3;
            0;
            if null != null {
                return ((0x1E ^ 0x21) & ~(0x5B ^ 0x64)) != 0;
            }
        } else if (ae.var10(var4)) {
            nPC2 = var4;
            0;
            if (((0xEF ^ 0xB2) & ~(0xD4 ^ 0x89)) > 1) {
                return ((0xA4 ^ 0xBA) & ~(0x37 ^ 0x29)) != 0;
            }
        } else {
            nPC2 = var9 = var8;
        }
        if (ae.var11(var9)) {
            return var1[0];
        }
        return this.x((NPC)var3_3);
    }

    @Inject
    protected AttackingHuskTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.huskGear().selected(EquipmentSetup.class);
    }

    private static boolean var6(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static void var12() {
        var1 = new int[7];
        ae.var1[0] = (0xE ^ 0x3C) & ~(1 ^ 0x33);
        ae.var1[1] = 0x7F ^ 0x7B;
        ae.var1[2] = 0xFFFFBDFE & 0x66EF;
        ae.var1[3] = -(0xFFFFBB5E & 0x57A7) & (0xFFFFBFFF & 0x77FF);
        ae.var1[4] = 1;
        ae.var1[5] = 0xFFFFB6FF & 0x6DEF;
        ae.var1[6] = -(0x23 ^ 0x26) & (0xFFFFE5FF & 0x3EFF);
    }

    static {
        ae.var12();
        dP = LoggerFactory.getLogger(AttackingHuskTask.class);
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var7(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }
}

