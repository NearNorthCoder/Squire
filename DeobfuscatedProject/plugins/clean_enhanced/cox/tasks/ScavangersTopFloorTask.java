/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum8;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.NHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Scavangers (Top Floor)", priority=10000, blocking=true)
public class ScavangersTopFloorTask
extends CoxManager {

    private  n ak;
    private  n al;
    private  int am;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void var9;
        aW var10;
        String[] stringArray = new String[1];
        stringArray[2] = var1[4];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if nPC == null {
            return null;
        }
        if ((var10.bS.distanceTo((Locatable)var9) < 5)) {
            return List.of(Prayer.PROTECT_FROM_MELEE);
        }
        return null;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ch() {
        boolean bl2;
        aW var17;
        if ((this.bS.getPlane() != 3)) {
            return 2;
        }
        var17.ak = var17.co.L();
        var17.am = var17.co.N();
        var17.al = var17.co.M();
        if (((Object)var17.ak.bw == (Object)var17.ak.bw2)N.SCAVENGERS)) {
            bl2 = 1;
            0;
            if (3 != 3) {
                return ((0x41 ^ 0x71) & ~(0x82 ^ 0xB2)) != 0;
            }
        } else {
            bl2 = 2;
        }
        return bl2;
    }

    @Override
    public boolean cg() {
        aW var18;
        if ((this.e(this.ak != 0) ? 1 : 0)) {
            return 1;
        }
        if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
            return 2;
        }
        if ((Reachable.isWalkable(WorldPointlllllllllllllllIlllIIlllIllIIIlI.ak.bt) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var18.al.bs);
            System.out.println(var1[2]);
            return 1;
        }
        if ((Reachable.isWalkable(WorldPointlllllllllllllllIlllIIlllIllIIIlI.ak.bs) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var18.ak.bt);
            System.out.println(var1[1]);
            return 1;
        }
        return 2;
    }

    @Inject
    protected ScavangersTopFloorTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = 0;
    }
}

