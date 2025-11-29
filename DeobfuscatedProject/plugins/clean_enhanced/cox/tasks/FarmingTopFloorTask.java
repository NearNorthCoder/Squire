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

@TaskDesc(name="Farming (Top Floor)", priority=10000, blocking=true)
public class FarmingTopFloorTask
extends CoxManager {
    private  n ak;
    private  n al;
    
    private  int am;

    @Inject
    protected FarmingTopFloorTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = 0;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 2;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 2;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if ((146 + 57 - 49 + 4 ^ 1 + 115 - 42 + 81) != 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void var19;
        aU var20;
        String[] stringArray = new String[1];
        stringArray[2] = var1[4];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if nPC == null {
            return null;
        }
        if ((var20.bS.distanceTo((Locatable)var19) < 5)) {
            return List.of(Prayer.PROTECT_FROM_MELEE);
        }
        return null;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean cg() {
        aU var27;
        if ((this.e(this.ak != 0) ? 1 : 0)) {
            return 1;
        }
        if ((Reachable.isWalkable(WorldPointlllllllllllllllIllIlllIlIIIlIlll.ak.bt) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var27.al.bs);
            System.out.println(var1[2]);
            return 1;
        }
        if ((Reachable.isWalkable(WorldPointlllllllllllllllIllIlllIlIIIlIlll.ak.bs) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var27.ak.bt);
            System.out.println(var1[1]);
            return 1;
        }
        return 2;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        aU var28;
        if ((this.bS.getPlane() != 3)) {
            return 2;
        }
        var28.ak = var28.co.L();
        var28.am = var28.co.N();
        var28.al = var28.co.M();
        if (((Object)var28.ak.bw == (Object)var28.ak.bw2)N.FARMING)) {
            bl2 = 1;
            0;
            if null != null {
                return ((0x8D ^ 0x92) & ~(0xA9 ^ 0xB6)) != 0;
            }
        } else {
            bl2 = 2;
        }
        return bl2;
    }
}

