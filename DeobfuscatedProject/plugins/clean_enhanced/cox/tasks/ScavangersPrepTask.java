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
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
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
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Scavangers (Prep)", priority=10000, blocking=true)
public class ScavangersPrepTask
extends CoxManager {
    private  n al;
    private  n ak;
    
    private  int am;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        aV var3;
        if ((this.e(this.ak != 0) ? 1 : 0)) {
            return 1;
        }
        int[] nArray = new int[1];
        nArray[2] = 3;
        if ((Inventory.getCount((boolean)1 >= (int[])nArray), 4)) {
            int[] nArray2 = new int[1];
            nArray2[2] = 5;
            if ((Inventory.getCount((boolean)1 >= (int[])nArray2), 6)) {
                if ((Reachable.isWalkable(WorldPointlllllllllllllllIllIllIllIlIIllll.ak.bt) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)var3.al.bs);
                    return 1;
                }
                if ((Reachable.isWalkable(WorldPointlllllllllllllllIllIllIllIlIIllll.ak.bs) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)var3.ak.bt);
                    System.out.println(var1[2]);
                    return 1;
                }
                return 2;
            }
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            var3.co.x();
            0;
            return 1;
        }
        TileItem var4 = TileItems.getNearest(tileItem -> {
            int n2;
            if ((this.ak.a(LocatabletileItem) ? 1 : 0) && (!(tileItem.getId() != 3) || (tileItem.getId() == 5))) {
                n2 = 1;
                0;
                if null != null {
                    return ((0x8E ^ 0x86) & ~(0x71 ^ 0x79)) != 0;
                }
            } else {
                n2 = 2;
            }
            return n2 != 0;
        });
        if var4 != null {
            if ((var3.bS.isMoving( != 0) ? 1 : 0)) {
                return 2;
            }
            var4.interact(var1[1]);
            return 1;
        }
        String[] stringArray = new String[1];
        stringArray[2] = var1[7];
        NPC var5 = NPCs.getNearest((String[])stringArray);
        if var5 == null {
            WorldPoint var6 = var3.ak.br.getCenter();
            if ((var6.distanceTo((Locatable)var3.bS) < 8)) {
                return 2;
            }
            System.out.println(var1[9]);
            Movement.setDestination((WorldPoint)var6);
            return 1;
        }
        if ((var3.bS.getInteracting( != null)) && (var3.bS.getInteracting( != 0).getName().contains(var1[6]) ? 1 : 0)) {
            return 2;
        }
        var2_2.interact(var1[var2[10]]);
        System.out.println(var1[var2[11]]);
        return 1;
    }

    @Override
    public EquipmentSetup cj() {
        return s.bb();
    }

    @Inject
    protected ScavangersPrepTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = 0;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ch() {
        boolean bl2;
        aV var13;
        if ((this.bS.getPlane() != 7)) {
            return 2;
        }
        var13.ak = var13.co.L();
        var13.am = var13.co.N();
        var13.al = var13.co.M();
        if (((Object)var13.ak.bw == (Object)var13.ak.bw2)N.SCAVENGERS)) {
            bl2 = 1;
            0;
            if null != null {
                return ((0x43 ^ 0x6D) & ~(0x93 ^ 0xBD)) != 0;
            }
        } else {
            bl2 = 2;
        }
        return bl2;
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = 2;
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = 2;
        while (var22 < var21) {
            char var23 = var20[var22];
            var17.append((char)(var23 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if ((0x8C ^ 0xC2 ^ (0x6D ^ 0x26)) > 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void var24;
        aV var25;
        String[] stringArray = new String[1];
        stringArray[2] = var1[var2[12]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if nPC == null {
            return null;
        }
        if ((var25.bS.distanceTo((Locatable)var24) < var2[10])) {
            return List.of(Prayer.PROTECT_FROM_MELEE);
        }
        return null;
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }
}

