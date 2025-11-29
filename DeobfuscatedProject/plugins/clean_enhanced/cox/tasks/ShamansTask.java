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
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Shamans", priority=10000, blocking=true)
public class ShamansTask
extends CoxManager {
    
    private  n ak;
    private  n al;
    
    private  int am;

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aD var3;
        if ((Reachable.isWalkable(WorldPointthis.ak.bt) ? 1 : 0)) {
            if ((Movement.getDestination( != null)) && (Movement.getDestination( != 0).equals((Object)this.al.bt) ? 1 : 0)) {
                return 2;
            }
            Movement.setDestination((WorldPoint)var3.al.bs);
            return 1;
        }
        TileObject var4 = var3.cR();
        if var4 == null {
            Movement.setDestination((WorldPoint)var3.ak.bq.dx(4).dy(4));
            return 1;
        }
        if (!(var3.bS.isMoving( == 0) ? 1 : 0) || (var3.bS.isAnimating( != 0) ? 1 : 0)) {
            return 2;
        }
        var1_1.interact(var1[2]);
        return 1;
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[1]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[2] = var1[5];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 1;
                    0;
                    if (((0x5A ^ 8) & ~(0xDF ^ 0x8D)) == ((0x55 ^ 0x77) & ~(0x40 ^ 0x62))) return n2 != 0;
                    return ((9 ^ 6) & ~(0x4C ^ 0x43)) != 0;
                }
            }
            n2 = 2;
            return n2 != 0;
        });
    }

    @Inject
    protected ShamansTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = 0;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 2;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 2;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean cg() {
        return 1;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (((Object)this.ak.bw == (Object)this.ak.bw2)N.SHAMANS)) {
            bl2 = 1;
            0;
            if null != null {
                return ((0xF6 ^ 0xB1) & ~(0x80 ^ 0xC7)) != 0;
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
    public List<Prayer> ci() {
        aD var27;
        void var28;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).contains(var1[6]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[2] = var1[7];
                if ((nPC.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (2 > 1) return n2 != 0;
                    return ((0xD7 ^ 0x90) & ~(0xF9 ^ 0xBE)) != 0;
                }
            }
            n2 = 2;
            return n2 != 0;
        });
        if nPC2 == null {
            return null;
        }
        if ((var28.getWorldLocation().distanceTo((Locatable)var27.bS) > 3)) {
            return null;
        }
        return Prayers.getOffensive();
    }

}

