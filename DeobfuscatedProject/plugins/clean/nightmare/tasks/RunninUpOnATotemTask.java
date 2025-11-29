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
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Runnin up on a Totem", priority=1)
public class RunninUpOnATotemTask
extends NightmareTaskBase {
    private static final  Logger ed;

    private static boolean lIIlIIIlIlIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean cr() {
        return llllIllIIIII[0];
    }

    private static boolean lIIlIIIlIIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIIlIIllllI(int n2) {
        return n2 > 0;
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.totemGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIlIIIlIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIlIlIIIIl(Object object) {
        return object == null;
    }

    @Inject
    protected RunninUpOnATotemTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
    }

    private static boolean lIIlIIIlIlIIIII(int n2) {
        return n2 != 0;
    }

    static {
        am.lIIlIIIlIIlllII();
        ed = LoggerFactory.getLogger(RunninUpOnATotemTask.class);
    }

    @Override
    public boolean bY() {
        int var1;
        int n2;
        int var2;
        int n3;
        am var3;
        if (am.lIIlIIIlIIlllIl(this.cu() ? 1 : 0)) {
            return llllIllIIIII[0];
        }
        if (am.lIIlIIIlIIllllI(var3.cM.at())) {
            return llllIllIIIII[0];
        }
        if (am.lIIlIIIlIIlllIl(e.ax().isEmpty() ? 1 : 0)) {
            return llllIllIIIII[0];
        }
        if (am.lIIlIIIlIIlllll(var3.cJ.aX())) {
            n3 = llllIllIIIII[1];

            if (-(0xB3 ^ 0xB7) >= 0) {
                return false;
            }
        } else {
            n3 = llllIllIIIII[0];
        }
        if (am.lIIlIIIlIlIIIII(var2 = n3)) {
            return llllIllIIIII[0];
        }
        if (am.lIIlIIIlIIlllll(var3.cJ.aY())) {
            n2 = llllIllIIIII[1];

            }
        } else {
            n2 = llllIllIIIII[0];
        }
        if (am.lIIlIIIlIlIIIII(var1 = n2)) {
            return llllIllIIIII[0];
        }
        Player var4 = Players.getLocal();
        Actor var5 = var4.getInteracting();
        if (am.lIIlIIIlIlIIIIl(var5)) {
            return llllIllIIIII[0];
        }
        List var6 = NPCs.getAll(nPC -> {
            int n2;
            if (am.lIIlIIIlIlIIIII(SquireNightmarePlugin.q.contains(nPC.getId()) ? 1 : 0) && am.lIIlIIIlIlIIIII(this.cM.ag.containsKey(nPC.getId()) ? 1 : 0) && am.lIIlIIIlIlIIIll(this.cM.ag.get(nPC.getId()), llllIllIIIII[4])) {
                n2 = llllIllIIIII[1];

                if (-1 > (34 + 93 - -41 + 8 ^ 73 + 15 - 45 + 137)) {
                    return false;
                }
            } else {
                n2 = llllIllIIIII[0];
            }
            return n2 != 0;
        });
        if (am.lIIlIIIlIlIIIII(var6.isEmpty() ? 1 : 0)) {
            return llllIllIIIII[0];
        }
        if (am.lIIlIIIlIlIIIlI(var6.size(), llllIllIIIII[1])) {
            return llllIllIIIII[0];
        }
        RectangularArea var7 = e.ay();
        NPC var8 = (NPC)var6.get(llllIllIIIII[0]);
        if (am.lIIlIIIlIIlllll(var7) && am.lIIlIIIlIIlllIl(var7.contains(var8.getWorldLocation()) ? 1 : 0)) {
            return llllIllIIIII[0];
        }
        WorldArea var9 = var8.getWorldLocation().toWorldArea(llllIllIIIII[2], llllIllIIIII[2]);
        if (am.lIIlIIIlIlIIIlI(var8.getWorldArea().distanceTo((Locatable)var4), llllIllIIIII[3])) {
            Movement.setDestination((WorldPoint)var9.getCenter());
            return llllIllIIIII[1];
        }
        return llllIllIIIII[0];
    }

    private static boolean lIIlIIIlIIlllll(Object object) {
        return object != null;
    }

}

