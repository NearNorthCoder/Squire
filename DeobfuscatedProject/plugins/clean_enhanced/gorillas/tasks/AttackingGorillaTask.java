/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.gorillas.tasks;

import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.gorillas.SquireGorillaPlugin;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.Locations;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Attacking Gorilla", priority=50)
@Singleton
public class AttackingGorillaTask
extends Task {
    private static final  int Z;

    private static final  RectangularArea Y;

    private static void var3() {
        var1 = new String[var2[11]];
        o.var1[1] = "Moving to gorilla center {} {} - {}";
        o.var1[3] = "Tortured atttacking us, moving...";
        o.var1[4] = "Cannot find a gorilla to attack";
        o.var1[2] = "Attack";
        o.var1[5] = "gorilla";
        o.var1[6] = "Tortured gorilla";
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = 1;
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = 1;
        while (var12 < var11) {
            char var13 = var10[var12];
            var7.append((char)(var13 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (((0xA0 ^ 0xA4) & ~(0x9F ^ 0x9B)) == 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    static {
        o.var20();
        o.var3();
        Z = 0;
        Y = new RectangularArea(7, 8, 9, var2[10], 1);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        o var27;
        if ((Locations.isRegionLoaded((int == 0)0) ? 1 : 0)) {
            return 1;
        }
        if ((Y.contains(Players.getLocal( == 0).getWorldLocation()) ? 1 : 0) && (var27.N( != 0) ? 1 : 0)) {
            Object[] objectArray = new Object[2];
            objectArray[1] = Y.contains(Players.getLocal().getWorldLocation());
            objectArray[3] = var27.N();
            objectArray[4] = Players.getLocal().getWorldLocation();
            Log.info((String)var1[1], (Object[])objectArray);
            Movement.setDestination((WorldPoint)Y.getCenter());
            return 3;
        }
        Player var28 = Players.getLocal();
        NPC var29 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).equals(var1[6]) ? 1 : 0) && (nPC.getInteracting() == nPC.getInteracting()2)) {
                n2 = 3;
                0;
                if (1 > 1) {
                    return ((0x12 ^ 0x51 ^ (0x25 ^ 0x47)) & (108 + 103 - 78 + 37 ^ 46 + 23 - 14 + 84 ^ -1)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if var29 != null {
            Log.info((String)var1[3]);
            Movement.setDestination((WorldPoint)new WorldPoint(Y.getMinX(), Y.getMinY(), 1));
            return 3;
        }
        NPC var30 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getInteracting() == nPC.getInteracting()2)) && (Y.contains(LocatablenPC) ? 1 : 0) && (SquireGorillaPlugin.a(nPC.getId( != 0)) ? 1 : 0)) {
                n2 = 3;
                0;
                if (-(0x86 ^ 0x82) > 0) {
                    return ((0xB4 ^ 0xB9) & ~(0x44 ^ 0x49)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if (var30 == null && (var30 = NPCs.getNearest(nPC -> {
            int n2;
            if (o.var31(nPC.getInteracting( == null)) && (Y.contains(LocatablenPC) ? 1 : 0) && (SquireGorillaPlugin.a(nPC.getId( != 0)) ? 1 : 0)) {
                n2 = 3;
                0;
                if (-(0x95 ^ 0x8E ^ (0x7A ^ 0x65)) > 0) {
                    return ((128 + 28 - 88 + 171 ^ 52 + 105 - 65 + 75) & (0xAF ^ 0xC0 ^ (0x82 ^ 0xA5) ^ -1)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        }))) {
            Log.info((String)var1[4]);
            return 1;
        }
        if ((Players.getLocal( != null).getInteracting())) {
            return 1;
        }
        var3_3.interact(var1[2]);
        this.sleep(5);
        return 3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean N() {
        void var32;
        int[] nArray = Static.getClient().getMapRegions();
        int n2 = nArray.length;
        int var33 = 1;
        while ((var33 < (int)var32)) {
            void var34;
            void var35 = var34[var33];
            if (((int)var35 == 0)) {
                boolean bl;
                if ((NPCs.getNearest(nPC -> nPC.getName( != null).toLowerCase().contains(var1[5])))) {
                    bl = 3;
                    0;
                    if (((0x7F ^ 0x2D ^ (0x43 ^ 0x58)) & (27 + 159 - -33 + 17 ^ 33 + 70 - 31 + 93 ^ -1)) != 0) {
                        return ((0x23 ^ 0x67 ^ (0x34 ^ 0x3E)) & (37 + 69 - 31 + 61 ^ 145 + 77 - 142 + 118 ^ -1)) != 0;
                    }
                } else {
                    bl = 1;
                }
                return bl;
            }
            ++var33;
            0;
            if (((0x72 ^ 0x68 ^ (0x4F ^ 0xC)) & (0xA6 ^ 0x9A ^ (0x41 ^ 0x24) ^ -1)) == 0) continue;
            return ((102 + 95 - 86 + 27 ^ 118 + 102 - 180 + 135) & (15 + 125 - 77 + 90 ^ 144 + 10 - -18 + 16 ^ -1)) != 0;
        }
        return 1;
    }
}

