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
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.TileObjects
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
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Finishing floor", priority=10000, blocking=true)
public class FinishingFloorTask
extends CoxManager {
    
    private  n ak;

    @Override
    public boolean ch() {
        boolean bl2;
        aT var3;
        if ((u.bf( == 0) ? 1 : 0)) {
            return 1;
        }
        var3.ak = var3.co.L();
        if (((Object)var3.ak.bw == (Object)var3.ak.bw2)N.END)) {
            bl2 = 0;
            0;
            if ((0x6B ^ 0x2B ^ (0xCB ^ 0x8F)) < -1) {
                return ((178 + 162 - 254 + 123 ^ 6 + 115 - 9 + 81) & (0xFB ^ 0x9A ^ (0xED ^ 0x9C) ^ -1)) != 0;
            }
        } else {
            bl2 = 1;
        }
        return bl2;
    }

    @Override
    public List<Prayer> ci() {
        return null;
    }

    protected boolean dX() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[4]) ? 1 : 0)) {
                String[] stringArray = new String[0];
                stringArray[1] = var1[5];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 0;
                    0;
                    if null == null return n2 != 0;
                    return ((0x81 ^ 0xB2 ^ (0x9D ^ 0x8E)) & (0xCD ^ 0x81 ^ (0xE6 ^ 0x8A) ^ -1)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        if tileObject2 == null {
            return 1;
        }
        if ((Movement.getRunEnergy() > 2)) {
            return 1;
        }
        tileObject2.interact(var1[3]);
        return 0;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    @Inject
    protected FinishingFloorTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        aT var16;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).contains(var1[8]) ? 1 : 0)) {
                String[] stringArray = new String[0];
                stringArray[1] = var1[9];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 0;
                    0;
                    if null == null return n2 != 0;
                    return ((0xB4 ^ 0x98) & ~(0x55 ^ 0x79)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        if (tileObject2 != null && (Reachable.isInteractable(LocatabletileObject2) ? 1 : 0)) {
            void var17;
            if ((this.dX( != 0) ? 1 : 0)) {
                return 0;
            }
            if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
                return 0;
            }
            var17.interact(var1[1]);
            return 0;
        }
        TileObject var18 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[6]) ? 1 : 0)) {
                String[] stringArray = new String[0];
                stringArray[1] = var1[7];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 0;
                    0;
                    if (2 > 1) return n2 != 0;
                    return ((16 + 88 - -78 + 56 ^ 98 + 176 - 151 + 60) & (56 + 90 - -35 + 63 ^ 50 + 150 - 27 + 0 ^ -1)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        if var18 == null {
            return 1;
        }
        var2_2.interact(var1[0]);
        return 0;
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = 1;
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = 1;
        while (var27 < var26) {
            char var28 = var25[var27];
            var22.append((char)(var28 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            
            return null;
        }
        return String.valueOf(var22);
    }

}

