/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.coords.RectangularArea
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.coords.RectangularArea;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Attacking Parasite", priority=2147483626)
public class AttackingParasiteTask
extends al {
    private static final  Logger dS;

    private static boolean var3(Object object) {
        return object != null;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var2[1];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var2[1];
        while (ag.var13(var12, var11)) {
            char var14 = var10[var12];
            var7.append((char)(var14 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if ((0xA5 ^ 0x93 ^ (0xAB ^ 0x99)) > 2) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cr() {
        void var2_2;
        ag var15;
        WorldPoint worldPoint = this.cL.getLocalPlayer().getWorldLocation();
        if (ag.var16(this.cM.ap()) && ag.var17(this.cS.getId(), var2[0])) {
            return var2[1];
        }
        if (ag.var18(var15.cM.aq() ? 1 : 0)) {
            return var2[1];
        }
        if (ag.var16(var15.cM.at())) {
            return var2[1];
        }
        NPC var19 = var15.cJ.aX();
        if (ag.var20(var19)) {
            return var2[1];
        }
        if (ag.var3(e.ay())) {
            void var21;
            RectangularArea var22 = e.ay();
            if (ag.var23(var22.contains(var19.getWorldLocation()) ? 1 : 0) && ag.var23(var22.contains((WorldPoint)var21) ? 1 : 0)) {
                Log.info((String)var1[var2[1]]);
                return var2[1];
            }
            if (ag.var23(var22.contains(var19.getWorldLocation()) ? 1 : 0) && ag.var18(var22.contains((WorldPoint)var21) ? 1 : 0) && ag.var24(var21.distanceTo((Locatable)var19), var2[2])) {
                EquipmentSetup var25 = (EquipmentSetup)var15.cK.totemGear().selected(EquipmentSetup.class);
                var15.ec.a(var19, var25);
                0;
                return var2[3];
            }
        }
        if (ag.var18(var15.cK.assistantMode() ? 1 : 0)) {
            return var2[1];
        }
        return this.x((NPC)var2_2);
    }

    private static boolean var24(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.parasiteGear().selected(EquipmentSetup.class);
    }

    private static void var26() {
        var2 = new int[4];
        ag.var2[0] = -(0x53 ^ 0x59) & (0xFFFFFFBB & 0x2BDF);
        ag.var2[1] = (23 + 54 - 2 + 54 ^ 194 + 84 - 214 + 134) & (0xB8 ^ 0x91 ^ (0x15 ^ 0x7B) ^ -1);
        ag.var2[2] = 94 + 74 - 149 + 122 ^ 99 + 93 - 92 + 32;
        ag.var2[3] = 1;
    }

    private static boolean var23(int n2) {
        return n2 == 0;
    }

    private static void var27() {
        var1 = new String[var2[3]];
        ag.var1[ag.var2[1]] = "Not attacking parasite since we are not in flower area, amd it isn't.";
    }

    private static boolean var16(int n2) {
        return n2 > 0;
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    static {
        ag.var26();
        ag.var27();
        dS = LoggerFactory.getLogger(AttackingParasiteTask.class);
    }

    private static boolean var18(int n2) {
        return n2 != 0;
    }

    @Inject
    protected AttackingParasiteTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
    }

    private static boolean var17(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var20(Object object) {
        return object == null;
    }
}

