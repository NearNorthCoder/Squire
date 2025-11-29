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
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.coords.RectangularArea;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Attacking Parasite", priority=2147483626)
public class AttackingParasiteTask
extends NightmareTaskBase {
    private static final  Logger dS;

    private static boolean lIIlIIIllIIIIll(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cr() {
        void var2_2;
        ag var2;
        WorldPoint worldPoint = this.cL.getLocalPlayer().getWorldLocation();
        if (ag.lIIlIIIlIllllll(this.cM.ap()) && ag.lIIlIIIllIIIIII(this.cS.getId(), llllIllIlIIl[0])) {
            return llllIllIlIIl[1];
        }
        if (ag.lIIlIIIllIIIIIl(var2.cM.aq() ? 1 : 0)) {
            return llllIllIlIIl[1];
        }
        if (ag.lIIlIIIlIllllll(var2.cM.at())) {
            return llllIllIlIIl[1];
        }
        NPC var3 = var2.cJ.aX();
        if (ag.lIIlIIIllIIIIlI(var3)) {
            return llllIllIlIIl[1];
        }
        if (ag.lIIlIIIllIIIIll(e.ay())) {
            void var4;
            RectangularArea var5 = e.ay();
            if (ag.lIIlIIIllIIIlII(var5.contains(var3.getWorldLocation()) ? 1 : 0) && ag.lIIlIIIllIIIlII(var5.contains((WorldPoint)var4) ? 1 : 0)) {
                Log.info((String)llllIllIlIII[llllIllIlIIl[1]]);
                return llllIllIlIIl[1];
            }
            if (ag.lIIlIIIllIIIlII(var5.contains(var3.getWorldLocation()) ? 1 : 0) && ag.lIIlIIIllIIIIIl(var5.contains((WorldPoint)var4) ? 1 : 0) && ag.lIIlIIIllIIIlIl(var4.distanceTo((Locatable)var3), llllIllIlIIl[2])) {
                EquipmentSetup var6 = (EquipmentSetup)var2.cK.totemGear().selected(EquipmentSetup.class);
                var2.ec.a(var3, var6);

                return llllIllIlIIl[3];
            }
        }
        if (ag.lIIlIIIllIIIIIl(var2.cK.assistantMode() ? 1 : 0)) {
            return llllIllIlIIl[1];
        }
        return this.x((NPC)var2_2);
    }

    private static boolean lIIlIIIllIIIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.parasiteGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIlIIIllIIIlII(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIIlIllllIl() {
        llllIllIlIII = new String[llllIllIlIIl[3]];
        ag.llllIllIlIII[ag.llllIllIlIIl[1]] = "Not attacking parasite since we are not in flower area, amd it isn't.";
    }

    private static boolean lIIlIIIlIllllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIIllIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        ag.lIIlIIIlIlllllI();
        ag.lIIlIIIlIllllIl();
        dS = LoggerFactory.getLogger(AttackingParasiteTask.class);
    }

    private static boolean lIIlIIIllIIIIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    protected AttackingParasiteTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
    }

    private static boolean lIIlIIIllIIIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIIIllIIIIlI(Object object) {
        return object == null;
    }
}

