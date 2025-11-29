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
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Runnin up on a Totem", priority=1)
public class RunninUpOnATotemTask
extends al {
    private static final  Logger ed;

    private static boolean var2(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean cr() {
        return var1[0];
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var4(int n2) {
        return n2 > 0;
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.totemGear().selected(EquipmentSetup.class);
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    @Inject
    protected RunninUpOnATotemTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    static {
        am.var8();
        ed = LoggerFactory.getLogger(RunninUpOnATotemTask.class);
    }

    @Override
    public boolean bY() {
        int var9;
        int n2;
        int var10;
        int n3;
        am var11;
        if (am.var3(this.cu() ? 1 : 0)) {
            return var1[0];
        }
        if (am.var4(var11.cM.at())) {
            return var1[0];
        }
        if (am.var3(e.ax().isEmpty() ? 1 : 0)) {
            return var1[0];
        }
        if (am.var12(var11.cJ.aX())) {
            n3 = var1[1];
            0;
            if (-(0xB3 ^ 0xB7) >= 0) {
                return ((0x9D ^ 0xC7) & ~(0x55 ^ 0xF)) != 0;
            }
        } else {
            n3 = var1[0];
        }
        if (am.var7(var10 = n3)) {
            return var1[0];
        }
        if (am.var12(var11.cJ.aY())) {
            n2 = var1[1];
            0;
            if null != null {
                return ((0x72 ^ 0x5C ^ (0x97 ^ 0xB3)) & (1 ^ 0x16 ^ (0x8C ^ 0x91) ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        if (am.var7(var9 = n2)) {
            return var1[0];
        }
        Player var13 = Players.getLocal();
        Actor var14 = var13.getInteracting();
        if (am.var6(var14)) {
            return var1[0];
        }
        List var15 = NPCs.getAll(nPC -> {
            int n2;
            if (am.var7(SquireNightmarePlugin.q.contains(nPC.getId()) ? 1 : 0) && am.var7(this.cM.ag.containsKey(nPC.getId()) ? 1 : 0) && am.var5(this.cM.ag.get(nPC.getId()), var1[4])) {
                n2 = var1[1];
                0;
                if (-1 > (34 + 93 - -41 + 8 ^ 73 + 15 - 45 + 137)) {
                    return ((29 + 162 - 111 + 152 ^ 173 + 71 - 161 + 91) & (64 + 63 - 112 + 231 ^ 174 + 79 - 121 + 44 ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (am.var7(var15.isEmpty() ? 1 : 0)) {
            return var1[0];
        }
        if (am.var2(var15.size(), var1[1])) {
            return var1[0];
        }
        RectangularArea var16 = e.ay();
        NPC var17 = (NPC)var15.get(var1[0]);
        if (am.var12(var16) && am.var3(var16.contains(var17.getWorldLocation()) ? 1 : 0)) {
            return var1[0];
        }
        WorldArea var18 = var17.getWorldLocation().toWorldArea(var1[2], var1[2]);
        if (am.var2(var17.getWorldArea().distanceTo((Locatable)var13), var1[3])) {
            Movement.setDestination((WorldPoint)var18.getCenter());
            return var1[1];
        }
        return var1[0];
    }

    private static boolean var12(Object object) {
        return object != null;
    }

    private static void var8() {
        var1 = new int[5];
        am.var1[0] = (0x43 ^ 0x4D) & ~(0 ^ 0xE);
        am.var1[1] = 1;
        am.var1[2] = 3;
        am.var1[3] = 0x1A ^ 0x1E;
        am.var1[4] = 52 + 153 - 58 + 53;
    }
}

