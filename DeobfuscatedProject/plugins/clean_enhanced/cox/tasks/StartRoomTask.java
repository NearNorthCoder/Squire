/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum8;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.NHelper;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;

@TaskDesc(name="Start room", priority=10000, blocking=true)
public class StartRoomTask
extends CoxManager {
    private  int am;

    private  n ak;
    private  n al;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    protected StartRoomTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = 0;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        aX var9;
        if ((u.bf( == 0) ? 1 : 0)) {
            return 2;
        }
        var9.ak = var9.co.L();
        var9.am = var9.co.N();
        var9.al = var9.co.M();
        if (((Object)var9.ak.bw == (Object)var9.ak.bw2)N.START)) {
            bl2 = 1;
            0;
            if (1 < 0) {
                return ((0x71 ^ 0x10) & ~(0xA2 ^ 0xC3)) != 0;
            }
        } else {
            bl2 = 2;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        aX var10;
        TileObject var11;
        if ((Reachable.isWalkable(WorldPointthis.ak.bt) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)this.al.bs);
            return 1;
        }
        if ((Tabs.isOpen((Tab == 0)Tab.INVENTORY) ? 1 : 0)) {
            Tabs.open((Tab)Tab.INVENTORY);
        }
        if ((var11 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( == null != 0).equals(var2[1]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[2] = var2[3];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 1;
                    0;
                    if (((0xED ^ 0xC3) & ~(0x30 ^ 0x1E)) <= 0) return n2 != 0;
                    return ((9 ^ 0x12) & ~(6 ^ 0x1D)) != 0;
                }
            }
            n2 = 2;
            return n2 != 0;
        }))) {
            return 2;
        }
        var1_1.interact(var2[2]);
        return 1;
    }

    @Override
    public List<Prayer> ci() {
        return null;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }
}

