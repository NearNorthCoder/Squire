/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Trying Olm HEAD", priority=21000, blocking=true)
public class TryingOlmHeadTask
extends CoxManager {

    @Override
    public EquipmentSetup cj() {
        return s.bc();
    }

    private  boolean e(List list, WorldPoint worldPoint) {
        int n2;
        if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (this.ed.ap( == 0).contains(worldPoint) ? 1 : 0) && (list.contains(worldPoint == 0) ? 1 : 0)) {
            n2 = 0;
            0;
            if (-1 != -1) {
                return ((0x50 ^ 0x19) & ~(0x8E ^ 0xC7)) != 0;
            }
        } else {
            n2 = 1;
        }
        return n2 != 0;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private  boolean f(List list, WorldPoint worldPoint) {
        int n2;
        if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (this.ed.ap( == 0).contains(worldPoint) ? 1 : 0) && (list.contains(worldPoint == 0) ? 1 : 0)) {
            n2 = 0;
            0;
            if (1 < 0) {
                return ((0x56 ^ 0x43) & ~(0x84 ^ 0x91)) != 0;
            }
        } else {
            n2 = 1;
        }
        return n2 != 0;
    }

    @Override
    public boolean cg() {
        GraphicsObject var15;
        Object var16;
        aL var17;
        if ((this.ct( == 0) ? 1 : 0)) {
            if ((Prayers.anyActive( != 0) ? 1 : 0)) {
                Prayers.disableAll();
                return 0;
            }
            return 1;
        }
        if ((var17.ed.at( == 0) ? 1 : 0)) {
            return 1;
        }
        if (!(var17.ds( == 0) ? 1 : 0) || (var17.du( != 0) ? 1 : 0)) {
            return 1;
        }
        var17.cm();
        NPC var18 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).equals(var2[3]) ? 1 : 0)) {
                String[] stringArray = new String[0];
                stringArray[1] = var2[4];
                if ((nPC.hasActionstringArray)) {
                    n2 = 0;
                    0;
                    if (-2 < 0) return n2 != 0;
                    return ((0x1A ^ 0x33 ^ (0xEB ^ 0x8E)) & (106 + 173 - 111 + 61 ^ 91 + 164 - 99 + 13 ^ -1)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        if var18 == null {
            return 1;
        }
        List<WorldPoint> var19 = var17.dH();
        System.out.println("Turn: " + var17.dI() + " | " + var17.ed.az() + " | direction: " + var17.ed.am());
        if ((var17.dI( != 0) ? 1 : 0) && (!(((String == 0)(var16 = var17.k(1))).equals(var2[1]) ? 1 : 0) || ((StringlllllllllllllllIllIIlIlIIIIlIllI).equals(var2[0]) ? 1 : 0))) {
            var19 = var17.m((String)var16);
        }
        var16 = new ArrayList();
        Iterator var20 = var17.ec.getGraphicsObjects().iterator();
        while ((var20.hasNext( != 0) ? 1 : 0)) {
            var15 = (GraphicsObject)var20.next();
            if ((var15.getId() == 2)) {
                WorldPoint var21 = WorldPoint.fromLocal((Client)var17.ec, (LocalPoint)var15.getLocation());
                List var22 = var21.createWorldArea(0).toWorldPointList();
                var16.addAll(var22);
                0;
            }
            0;
            if ((0x31 ^ 0x35) != 0) continue;
            return ((0x53 ^ 0x44) & ~(0x1C ^ 0xB)) != 0;
        }
        if ((var19.contains(var17.bS.getWorldLocation( == 0)) ? 1 : 0)) {
            var20 = var19.stream().filter(arg_0 -> var17.f((List)var16, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
            if ((Movement.getDestination( != null)) && (Movement.getDestination( != 0).equals((Object)var20) ? 1 : 0)) {
                var15 = var17.bS.getWorldLocation().createWorldArea(3).toWorldPointList().stream().filter(arg_0 -> var17.e((List)var16, arg_0)).min(Comparator.comparingDouble(arg_0 -> aL.c((WorldPoint)var20, arg_0)).thenComparingDouble(object -> var18.getWorldArea().distanceTo((WorldPoint)object))).orElse(null);
                if (!var15 != null || (var15.getWorldX() == var20.getWorldX())) {
                    return 1;
                }
                Movement.setDestination((WorldPoint)var15);
                return 0;
            }
            Movement.setDestination((WorldPoint)var20);
            return 0;
        }
        this.dr();
        0;
        return 0;
    }

    private static  double c(WorldPoint worldPoint, Object object) {
        return ((WorldPoint)object).distanceTo2DHypotenuse(worldPoint);
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if prayer == null {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }

    @Inject
    protected TryingOlmHeadTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }
}

